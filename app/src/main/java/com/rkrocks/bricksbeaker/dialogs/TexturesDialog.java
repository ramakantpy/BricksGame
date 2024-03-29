/*
* Copyright (C) 2016  Tobias Bielefeld
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*
* If you want to contact me, send me an e-mail at tobias.bielefeld@gmail.com
*/

package com.rkrocks.bricksbeaker.dialogs;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;

import com.rkrocks.bricksbeaker.R;

import static com.rkrocks.bricksbeaker.SharedData.*;

/*
 * custom dialog to pick a texture, because i wanted to show them in the dialog
 */

public class TexturesDialog extends DialogPreference implements View.OnClickListener{

    public TexturesDialog(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.dialog_textures);
        setDialogIcon(null);
    }

    @Override
    protected void onBindDialogView(View view) {
        view.findViewById(R.id.button1).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
        view.findViewById(R.id.button3).setOnClickListener(this);

        super.onBindDialogView(view);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                look=1;
                break;
            case R.id.button2:
                look=2;
                break;
            case R.id.button3:
                look=3;
                break;
        }

        saveData("prefKeyTextures", look);
        getDialog().dismiss();
    }
}
