package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import j.N;
import j.P;

/* compiled from: EditTextPreferenceDialogFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: j, reason: collision with root package name */
    public EditText f53427j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f53428k;

    @Deprecated
    public b() {
    }

    @Override // androidx.preference.g
    public final void b(@N View view) {
        super.b(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f53427j = editText;
        editText.requestFocus();
        EditText editText2 = this.f53427j;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f53428k);
        EditText editText3 = this.f53427j;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.g
    @Deprecated
    public final void c(boolean z12) {
        if (z12) {
            String string = this.f53427j.getText().toString();
            ((EditTextPreference) a()).getClass();
            ((EditTextPreference) a()).m(string);
        }
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f53428k = ((EditTextPreference) a()).f53314B;
        } else {
            this.f53428k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f53428k);
    }
}
