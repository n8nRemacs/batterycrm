package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: n0, reason: collision with root package name */
    public EditText f53317n0;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence f53318o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Runnable f53319p0 = new a();

    /* renamed from: q0, reason: collision with root package name */
    public long f53320q0 = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditTextPreferenceDialogFragmentCompat.this.f5();
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void c5(@N View view) {
        super.c5(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f53317n0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f53317n0.setText(this.f53318o0);
        EditText editText2 = this.f53317n0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) b5()).getClass();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void d5(boolean z12) {
        if (z12) {
            String string = this.f53317n0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) b5();
            editTextPreference.getClass();
            editTextPreference.m(string);
        }
    }

    @RestrictTo
    public final void f5() {
        long j12 = this.f53320q0;
        if (j12 == -1 || j12 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f53317n0;
        if (editText == null || !editText.isFocused()) {
            this.f53320q0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f53317n0.getContext().getSystemService("input_method")).showSoftInput(this.f53317n0, 0)) {
            this.f53320q0 = -1L;
            return;
        }
        EditText editText2 = this.f53317n0;
        Runnable runnable = this.f53319p0;
        editText2.removeCallbacks(runnable);
        this.f53317n0.postDelayed(runnable, 50L);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f53318o0 = ((EditTextPreference) b5()).f53314B;
        } else {
            this.f53318o0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f53318o0);
    }
}
