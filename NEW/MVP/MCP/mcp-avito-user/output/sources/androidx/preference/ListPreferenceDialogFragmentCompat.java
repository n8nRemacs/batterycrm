package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.l;
import j.N;
import j.P;

/* loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: n0, reason: collision with root package name */
    public int f53329n0;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence[] f53330o0;

    /* renamed from: p0, reason: collision with root package name */
    public CharSequence[] f53331p0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.f53329n0 = i12;
            listPreferenceDialogFragmentCompat.f53375m0 = -1;
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void d5(boolean z12) {
        int i12;
        if (!z12 || (i12 = this.f53329n0) < 0) {
            return;
        }
        String string = this.f53331p0[i12].toString();
        ListPreference listPreference = (ListPreference) b5();
        listPreference.getClass();
        listPreference.o(string);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void e5(@N l.a aVar) {
        aVar.setSingleChoiceItems(this.f53330o0, this.f53329n0, new a());
        aVar.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f53329n0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f53330o0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f53331p0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) b5();
        if (listPreference.f53322B == null || (charSequenceArr = listPreference.f53323C) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f53329n0 = listPreference.m(listPreference.f53324D);
        this.f53330o0 = listPreference.f53322B;
        this.f53331p0 = charSequenceArr;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f53329n0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f53330o0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f53331p0);
    }
}
