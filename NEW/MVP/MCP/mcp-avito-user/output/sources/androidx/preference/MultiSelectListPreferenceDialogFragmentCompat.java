package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.l;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* renamed from: n0, reason: collision with root package name */
    public final HashSet f53335n0 = new HashSet();

    /* renamed from: o0, reason: collision with root package name */
    public boolean f53336o0;

    /* renamed from: p0, reason: collision with root package name */
    public CharSequence[] f53337p0;

    /* renamed from: q0, reason: collision with root package name */
    public CharSequence[] f53338q0;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i12, boolean z12) {
            MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
            if (z12) {
                multiSelectListPreferenceDialogFragmentCompat.f53336o0 = multiSelectListPreferenceDialogFragmentCompat.f53335n0.add(multiSelectListPreferenceDialogFragmentCompat.f53338q0[i12].toString()) | multiSelectListPreferenceDialogFragmentCompat.f53336o0;
            } else {
                multiSelectListPreferenceDialogFragmentCompat.f53336o0 = multiSelectListPreferenceDialogFragmentCompat.f53335n0.remove(multiSelectListPreferenceDialogFragmentCompat.f53338q0[i12].toString()) | multiSelectListPreferenceDialogFragmentCompat.f53336o0;
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void d5(boolean z12) {
        if (z12 && this.f53336o0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) b5();
            multiSelectListPreference.getClass();
            HashSet hashSet = this.f53335n0;
            HashSet hashSet2 = multiSelectListPreference.f53333B;
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            multiSelectListPreference.d();
        }
        this.f53336o0 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void e5(@N l.a aVar) {
        int length = this.f53338q0.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            zArr[i12] = this.f53335n0.contains(this.f53338q0[i12].toString());
        }
        aVar.setMultiChoiceItems(this.f53337p0, zArr, new a());
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f53335n0;
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f53336o0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f53337p0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f53338q0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f53335n0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f53336o0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f53337p0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f53338q0);
    }
}
