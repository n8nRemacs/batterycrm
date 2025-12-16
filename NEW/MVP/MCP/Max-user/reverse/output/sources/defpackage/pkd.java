package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class pkd {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public pkd(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(pkd pkdVar) {
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(pkdVar.a).setLabel(pkdVar.b).setChoices(pkdVar.c).setAllowFreeFormInput(pkdVar.d).addExtras(pkdVar.f);
        Set set = pkdVar.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nkd.d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            okd.b(builderAddExtras, pkdVar.e);
        }
        return builderAddExtras.build();
    }
}
