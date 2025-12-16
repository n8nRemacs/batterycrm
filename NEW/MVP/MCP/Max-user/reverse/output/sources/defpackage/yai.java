package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yai {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final sv6 a;

    public yai(sv6 sv6Var) {
        this.a = sv6Var;
    }

    public final aui a(aui auiVar) {
        boolean z = true;
        if (!auiVar.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        auiVar.i = z;
        sv6 sv6Var = this.a;
        xv6 xv6Var = sv6Var.j;
        xv6Var.getClass();
        fbi fbiVar = new fbi(new nbi(auiVar), xv6Var.s0.get(), sv6Var);
        y1a y1aVar = xv6Var.w0;
        y1aVar.sendMessage(y1aVar.obtainMessage(4, fbiVar));
        return auiVar;
    }
}
