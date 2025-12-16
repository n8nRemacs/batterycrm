package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class fxe implements ui8 {
    public static final /* synthetic */ yy7[] u0;
    public final k18 X;
    public final bwf Y;
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final bwf s0;
    public final t9f Z = c7j.c();
    public final String t0 = fxe.class.getName();

    static {
        z8a z8aVar = new z8a(fxe.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        u0 = new yy7[]{z8aVar};
    }

    public fxe(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var4;
        this.o = k18Var6;
        this.X = k18Var7;
        this.Y = new bwf(new rv1(k18Var5, k18Var3, 2));
        this.s0 = new bwf(new sue(this, 1, k18Var6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fxe r8, defpackage.pb2 r9, defpackage.q44 r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxe.a(fxe, pb2, q44):java.lang.Object");
    }

    public final void b() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            bxe.g(context).getClass();
            Iterator it = ((ArrayList) bxe.f(context)).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        } catch (Throwable th) {
            wqi.e(this.t0, "clear: failed", th);
        }
    }

    @Override // defpackage.ui8
    public final void c() {
        b();
    }

    public final void d() {
        x9f x9fVarE = svi.e((f84) this.Y.getValue(), null, i84.b, new exe(this, null), 1);
        this.Z.O(this, u0[0], x9fVarE);
    }
}
