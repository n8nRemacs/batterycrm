package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import j.N;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: MultiSelectListPreferenceDialogFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f53433j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public boolean f53434k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence[] f53435l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence[] f53436m;

    /* compiled from: MultiSelectListPreferenceDialogFragment.java */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i12, boolean z12) {
            e eVar = e.this;
            if (z12) {
                eVar.f53434k = eVar.f53433j.add(eVar.f53436m[i12].toString()) | eVar.f53434k;
            } else {
                eVar.f53434k = eVar.f53433j.remove(eVar.f53436m[i12].toString()) | eVar.f53434k;
            }
        }
    }

    @Deprecated
    public e() {
    }

    @Override // androidx.preference.g
    @Deprecated
    public final void c(boolean z12) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (z12 && this.f53434k) {
            HashSet hashSet = this.f53433j;
            multiSelectListPreference.getClass();
            HashSet hashSet2 = multiSelectListPreference.f53333B;
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            multiSelectListPreference.d();
        }
        this.f53434k = false;
    }

    @Override // androidx.preference.g
    public final void d(@N AlertDialog.Builder builder) {
        int length = this.f53436m.length;
        boolean[] zArr = new boolean[length];
        for (int i12 = 0; i12 < length; i12++) {
            zArr[i12] = this.f53433j.contains(this.f53436m[i12].toString());
        }
        builder.setMultiChoiceItems(this.f53435l, zArr, new a());
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.f53433j;
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
        this.f53434k = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
        this.f53435l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
        this.f53436m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.g, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f53433j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f53434k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f53435l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f53436m);
    }
}
