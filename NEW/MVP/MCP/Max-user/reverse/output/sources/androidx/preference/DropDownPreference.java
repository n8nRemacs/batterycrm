package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import defpackage.bvc;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter u0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, bvc.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.u0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.s0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void c() {
        ArrayAdapter arrayAdapter = this.u0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
