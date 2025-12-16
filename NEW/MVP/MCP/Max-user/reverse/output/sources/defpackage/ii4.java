package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.android.root.RootController;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* loaded from: classes2.dex */
public final class ii4 {
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final bwf e;
    public boolean g;
    public final String a = ii4.class.getName();
    public final ArrayList f = new ArrayList();

    public ii4(k18 k18Var, bwf bwfVar, k18 k18Var2, k18 k18Var3) {
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var;
        this.e = bwfVar;
    }

    public final zh4 a() {
        return (zh4) this.c.getValue();
    }

    public final boolean b(String str, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("try to open new screen from background thread");
        }
        if (vmf.V(str, ':')) {
            return c(m8j.b(str), bundle);
        }
        wqi.e(this.a, "Trying to open invalid app route=".concat(str), null);
        throw new InvalidDeeplinkNamingException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f7 A[EDGE_INSN: B:312:0x03f7->B:181:0x03f7 BREAK  A[LOOP:8: B:164:0x03af->B:314:?], EDGE_INSN: B:313:0x03f7->B:181:0x03f7 BREAK  A[LOOP:8: B:164:0x03af->B:314:?, LOOP_LABEL: LOOP:8: B:164:0x03af->B:314:?]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r21, android.os.Bundle r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii4.c(android.net.Uri, android.os.Bundle):boolean");
    }

    public final boolean d() {
        bud budVar;
        if (a().b() <= 1) {
            return false;
        }
        b3b b3bVar = (b3b) a();
        LinkedList linkedList = b3bVar.c;
        if (b3bVar.b) {
            if (!linkedList.isEmpty()) {
                linkedList.remove(linkedList.size() - 1);
            }
            return true;
        }
        if (b3bVar.b() <= 1 || (budVar = (bud) ue3.Q(((RootController) b3bVar.f()).G0().e())) == null || budVar.a == null) {
            return false;
        }
        return ((RootController) b3bVar.f()).G0().C();
    }

    public final void e(cm6 cm6Var) {
        Object ipdVar;
        this.g = true;
        ArrayList arrayList = this.f;
        arrayList.clear();
        try {
            cm6Var.invoke();
            this.g = false;
            zh4 zh4VarA = a();
            List listD0 = ue3.d0(arrayList);
            b3b b3bVar = (b3b) zh4VarA;
            b3bVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                try {
                    ipdVar = b3bVar.d((ni4) it.next(), true);
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (ipdVar instanceof ipd) {
                    ipdVar = null;
                }
                bud budVar = (bud) ipdVar;
                if (budVar != null) {
                    arrayList2.add(budVar);
                }
            }
            ((RootController) b3bVar.f()).G0().Q(arrayList2, b3bVar.e());
            arrayList.clear();
        } catch (Throwable th2) {
            this.g = false;
            throw th2;
        }
    }
}
