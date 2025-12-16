package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zfh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ agh Y;
    public final /* synthetic */ dtf Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zfh(agh aghVar, sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = aghVar;
        this.Z = (dtf) sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zfh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, sm6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zfh zfhVar = new zfh(this.Y, this.Z, continuation);
        zfhVar.X = obj;
        return zfhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r0.a(r6, r5) != r4) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [dtf, sm6] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) throws ru.ok.tamtam.errors.ConnectionException {
        /*
            r5 = this;
            int r0 = r5.o
            agh r1 = r5.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r6)
            goto L57
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.g8j.b(r6)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            goto L57
        L1e:
            r6 = move-exception
            goto L46
        L20:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.X
            f84 r6 = (defpackage.f84) r6
            k18 r0 = r1.b     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            java.lang.Object r0 = r0.getValue()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            ur3 r0 = (defpackage.ur3) r0     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            boolean r0 = r0.f()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            if (r0 == 0) goto L40
            dtf r0 = r5.Z     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            r5.o = r3     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            java.lang.Object r6 = r0.invoke(r6, r5)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            if (r6 != r4) goto L57
            goto L56
        L40:
            ru.ok.tamtam.errors.ConnectionException r6 = new ru.ok.tamtam.errors.ConnectionException     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            r6.<init>()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
            throw r6     // Catch: ru.ok.tamtam.errors.TamErrorException -> L1e
        L46:
            jve r0 = r1.c
            em6 r1 = r1.a
            java.lang.Object r6 = r1.invoke(r6)
            r5.o = r2
            java.lang.Object r6 = r0.a(r6, r5)
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfh.n(java.lang.Object):java.lang.Object");
    }
}
