package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class cg6 implements jzb {
    public final Set a;
    public final yg6 b;
    public final fde c;
    public final Long d;
    public final boolean e;
    public final Context f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final tcf m;
    public final hbd n;
    public List o;
    public final jve p;
    public final gbd q;
    public final s7c r;
    public final tcf s;
    public final hbd t;
    public final Object u;
    public final Object v;
    public f84 w;
    public boolean x;

    public cg6(Set set, yg6 yg6Var, fde fdeVar, Long l, boolean z, Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = set;
        this.b = yg6Var;
        this.c = fdeVar;
        this.d = l;
        this.e = z;
        this.f = context;
        this.g = k18Var;
        this.h = k18Var2;
        this.i = k18Var3;
        this.j = k18Var4;
        this.k = k18Var5;
        this.l = k18Var6;
        tcf tcfVarA = ucf.a(null);
        this.m = tcfVarA;
        this.n = new hbd(tcfVarA);
        this.o = hd5.a;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 1);
        this.p = jveVarB;
        this.q = new gbd(jveVarB);
        this.r = new s7c(17);
        tcf tcfVarA2 = ucf.a(Boolean.TRUE);
        this.s = tcfVarA2;
        this.t = new hbd(tcfVarA2);
        final int i = 0;
        this.u = ipi.b(3, new cm6(this) { // from class: xf6
            public final /* synthetic */ cg6 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return f6j.a(this.b.f, yud.F1);
                    default:
                        return f6j.a(this.b.f, yud.G1);
                }
            }
        });
        final int i2 = 1;
        this.v = ipi.b(3, new cm6(this) { // from class: xf6
            public final /* synthetic */ cg6 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return f6j.a(this.b.f, yud.F1);
                    default:
                        return f6j.a(this.b.f, yud.G1);
                }
            }
        });
        if (set.isEmpty()) {
            throw new IllegalStateException("You must specify messages to forward!");
        }
    }

    @Override // defpackage.jzb
    public final void a() {
        this.w = null;
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
        this.c.F(yybVar);
    }

    @Override // defpackage.jzb
    public final void c() {
        ((AtomicReference) this.c.d).updateAndGet(new lk2(11));
    }

    @Override // defpackage.jzb
    public final void d(long j) {
        this.c.E(j);
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.w = contextScope;
        svi.e(contextScope, ((q2b) ((lzf) this.g.getValue())).b(), null, new bg6(this, null), 2);
    }

    public final void f() {
        k18 k18Var = this.l;
        pe8 pe8Var = (pe8) ((pb3) k18Var.getValue());
        fde fdeVar = pe8Var.J0;
        yy7[] yy7VarArr = pe8.U0;
        if (((Boolean) fdeVar.D(pe8Var, yy7VarArr[23])).booleanValue()) {
            return;
        }
        this.p.h(gg6.a);
        pe8 pe8Var2 = (pe8) ((pb3) k18Var.getValue());
        pe8Var2.J0.O(pe8Var2, yy7VarArr[23], Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    public final Drawable g() {
        return ((Boolean) this.s.getValue()).booleanValue() ? (Drawable) this.u.getValue() : (Drawable) this.v.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.CharSequence r12, java.util.Set r13, boolean r14) {
        /*
            r11 = this;
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto La0
            boolean r0 = r11.x
            if (r0 == 0) goto Lc
            goto La0
        Lc:
            r0 = 1
            r11.x = r0
            java.lang.Object r1 = defpackage.ue3.F(r13)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            int r2 = r13.size()
            r3 = 0
            if (r2 != r0) goto L21
            goto L22
        L21:
            r1 = r3
        L22:
            r9 = r1
            java.lang.Long r9 = (java.lang.Long) r9
            k18 r1 = r11.g
            if (r9 == 0) goto L45
            if (r14 != 0) goto L45
            f84 r12 = r11.w
            if (r12 == 0) goto La0
            java.lang.Object r13 = r1.getValue()
            lzf r13 = (defpackage.lzf) r13
            q2b r13 = (defpackage.q2b) r13
            z74 r13 = r13.a()
            yf6 r14 = new yf6
            r14.<init>(r11, r3)
            r0 = 2
            defpackage.svi.e(r12, r13, r3, r14, r0)
            return
        L45:
            if (r9 == 0) goto L7b
            fde r14 = r11.c
            java.util.Set r14 = r14.r()
            java.util.Iterator r14 = r14.iterator()
        L51:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r14.next()
            r4 = r2
            yyb r4 = (defpackage.yyb) r4
            long r4 = r4.a
            long r6 = r9.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L51
            r3 = r2
        L69:
            yyb r3 = (defpackage.yyb) r3
            r14 = 0
            if (r3 == 0) goto L71
            int r2 = r3.c
            goto L72
        L71:
            r2 = r14
        L72:
            if (r2 == r0) goto L7b
            java.lang.Long r2 = r11.d
            if (r2 == 0) goto L79
            goto L7b
        L79:
            r8 = r14
            goto L7c
        L7b:
            r8 = r0
        L7c:
            f84 r14 = r11.w
            if (r14 == 0) goto La0
            bia r0 = defpackage.bia.a
            java.lang.Object r1 = r1.getValue()
            lzf r1 = (defpackage.lzf) r1
            q2b r1 = (defpackage.q2b) r1
            z74 r1 = r1.a()
            x74 r0 = r0.plus(r1)
            ag6 r4 = new ag6
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            i84 r12 = defpackage.i84.c
            defpackage.svi.d(r14, r0, r12, r4)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg6.h(java.lang.CharSequence, java.util.Set, boolean):void");
    }
}
