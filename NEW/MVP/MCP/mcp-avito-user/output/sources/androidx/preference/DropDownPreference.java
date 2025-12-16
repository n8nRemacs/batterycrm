package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.avito.android.R;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: G, reason: collision with root package name */
    public final ArrayAdapter f53310G;

    /* renamed from: H, reason: collision with root package name */
    public Spinner f53311H;

    /* renamed from: I, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f53312I;

    public DropDownPreference(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f53312I = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f53310G = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f53322B;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.f53310G;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void f(@N u uVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) uVar.itemView.findViewById(R.id.spinner);
        this.f53311H = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f53310G);
        this.f53311H.setOnItemSelectedListener(this.f53312I);
        Spinner spinner2 = this.f53311H;
        String str = this.f53324D;
        if (str == null || (charSequenceArr = this.f53323C) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.f(uVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void h() {
        this.f53311H.performClick();
    }

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i12, long j12) {
            if (i12 >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String string = dropDownPreference.f53323C[i12].toString();
                if (string.equals(dropDownPreference.f53324D)) {
                    return;
                }
                dropDownPreference.getClass();
                dropDownPreference.o(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
