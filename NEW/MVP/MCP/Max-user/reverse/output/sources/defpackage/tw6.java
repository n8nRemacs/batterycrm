package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class tw6 {
    public final Context a;
    public final jve b;
    public final gbd c;
    public final ContextScope d;
    public final String e;
    public bci f;
    public int g;
    public ybj h;

    public tw6(Context context, lzf lzfVar) {
        this.a = context;
        jve jveVarB = kve.b(0, 0, 7);
        this.b = jveVarB;
        this.c = new gbd(jveVarB);
        this.d = d7j.a(((q2b) lzfVar).c().getImmediate());
        String name = tw6.class.getName();
        this.e = name;
        bwf bwfVar = new bwf(new e44(25, this));
        this.g = 6;
        if (z7.h(context, (sw6) bwfVar.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2) == null) {
            wqi.g(name, new l84("SMS Retriever registration failed"), null, new Object[0]);
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.tw6 r8, java.lang.String r9, defpackage.q44 r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "[0-9]{"
            boolean r1 = r10 instanceof defpackage.qw6
            if (r1 == 0) goto L15
            r1 = r10
            qw6 r1 = (defpackage.qw6) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            qw6 r1 = new qw6
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.Y
            int r2 = r1.s0
            java.lang.String r3 = ", message="
            java.lang.String r4 = "sms code matching failed: codeLength="
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L3e
            if (r2 != r5) goto L36
            java.io.Serializable r8 = r1.X
            java.lang.String r9 = r1.o
            tw6 r0 = r1.d
            defpackage.g8j.b(r10)
            r10 = r8
            r8 = r0
            goto Laf
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            defpackage.g8j.b(r10)
            int r10 = r8.g     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L67
            r2.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "}"
            r2.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L67
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)     // Catch: java.lang.Throwable -> L67
            java.util.regex.Matcher r10 = r10.matcher(r9)     // Catch: java.lang.Throwable -> L67
            boolean r0 = r10.find()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L69
            java.lang.String r10 = r10.group(r7)     // Catch: java.lang.Throwable -> L67
            goto L71
        L67:
            r10 = move-exception
            goto L6b
        L69:
            r10 = r6
            goto L71
        L6b:
            ipd r0 = new ipd
            r0.<init>(r10)
            r10 = r0
        L71:
            boolean r0 = r10 instanceof defpackage.ipd
            if (r0 != 0) goto Laf
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L9c
            java.lang.String r0 = r8.e
            l84 r1 = new l84
            int r2 = r8.g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r2)
            r5.append(r3)
            r5.append(r9)
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            defpackage.wqi.g(r0, r1, r6, r2)
            goto Laf
        L9c:
            jve r2 = r8.b
            r1.d = r8
            r1.o = r9
            r1.X = r10
            r1.s0 = r5
            java.lang.Object r0 = r2.a(r0, r1)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto Laf
            goto Ld7
        Laf:
            java.lang.Throwable r10 = defpackage.kpd.a(r10)
            if (r10 == 0) goto Ld5
            java.lang.String r0 = r8.e
            l84 r1 = new l84
            int r8 = r8.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r8)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r10)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            defpackage.wqi.g(r0, r1, r6, r8)
        Ld5:
            qqg r1 = defpackage.qqg.a
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw6.a(tw6, java.lang.String, q44):java.lang.Object");
    }

    public final void b() {
        ybj ybjVarB;
        if (this.h != null) {
            wqi.c(this.e, "task not null! skip start retriever", new Object[0]);
            return;
        }
        ybj ybjVar = null;
        if (this.f == null) {
            this.f = new bci(this.a, bci.n, null, new tha(13));
        }
        bci bciVar = this.f;
        if (bciVar != null && (ybjVarB = bciVar.b(1, new ibi())) != null) {
            sl6 sl6Var = new sl6(2, new d92(27, this));
            ns7 ns7Var = u2g.a;
            ybjVarB.d(ns7Var, sl6Var);
            ybjVarB.i(new pw6(this));
            ybjVarB.j(new pw6(this));
            ybjVarB.a(ns7Var, new pw6(this));
            ybjVar = ybjVarB;
        }
        this.h = ybjVar;
    }
}
