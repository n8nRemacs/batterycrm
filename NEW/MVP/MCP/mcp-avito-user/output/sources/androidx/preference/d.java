package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import j.N;
import j.P;

/* compiled from: ListPreferenceDialogFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class d extends g {

    /* renamed from: j, reason: collision with root package name */
    public int f53429j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence[] f53430k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence[] f53431l;

    /* compiled from: ListPreferenceDialogFragment.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            d dVar = d.this;
            dVar.f53429j = i12;
            dVar.f53445i = -1;
            dialogInterface.dismiss();
        }
    }

    @Deprecated
    public d() {
    }

    @Override // androidx.preference.g
    @Deprecated
    public final void c(boolean z12) {
        int i12;
        ListPreference listPreference = (ListPreference) a();
        if (!z12 || (i12 = this.f53429j) < 0) {
            return;
        }
        String string = this.f53431l[i12].toString();
        listPreference.getClass();
        listPreference.o(string);
    }

    @Override // androidx.preference.g
    public final void d(@N AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f53430k, this.f53429j, new a());
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f53429j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f53430k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f53431l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) a();
        if (listPreference.f53322B == null || (charSequenceArr = listPreference.f53323C) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f53429j = listPreference.m(listPreference.f53324D);
        this.f53430k = listPreference.f53322B;
        this.f53431l = charSequenceArr;
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f53429j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f53430k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f53431l);
    }
}
