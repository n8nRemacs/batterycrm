package C81;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public c f1990q;

    /* renamed from: r, reason: collision with root package name */
    public T51.b f1991r;

    /* renamed from: s, reason: collision with root package name */
    public String f1992s;

    /* renamed from: t, reason: collision with root package name */
    public int f1993t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f1994u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ T51.b f1995v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, T51.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f1994u = cVar;
        this.f1995v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f1994u, this.f1995v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f1993t
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            C81.c r0 = r11.f1990q
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L16
            goto L8a
        L16:
            r12 = move-exception
            goto Lb6
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            java.lang.String r1 = r11.f1992s
            T51.b r3 = r11.f1991r
            C81.c r5 = r11.f1990q
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L16
            r12 = r5
            goto L79
        L2c:
            kotlin.C42729a0.b(r12)
            C81.c r12 = r11.f1994u
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L16
            e.a r1 = r12.f1997b     // Catch: java.lang.Throwable -> L16
            e.h r1 = (e.h) r1     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.flow.Z1 r1 = r1.f394233f     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto Lae
            y81.a r5 = r12.f1999d     // Catch: java.lang.Throwable -> L16
            O51.b r5 = (O51.b) r5     // Catch: java.lang.Throwable -> L16
            X51.d r5 = r5.b(r1)     // Catch: java.lang.Throwable -> L16
            y81.b r6 = r12.f1998c
            if (r5 != 0) goto L4e
            goto L5f
        L4e:
            long r7 = r5.f18611i     // Catch: java.lang.Throwable -> L16
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L57
            goto L5f
        L57:
            r7 = r6
            O51.d r7 = (O51.d) r7     // Catch: java.lang.Throwable -> L16
            r5.toString()     // Catch: java.lang.Throwable -> L16
            r7.f12006c = r5     // Catch: java.lang.Throwable -> L16
        L5f:
            O51.d r6 = (O51.d) r6     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.N0 r5 = r6.f12005b     // Catch: java.lang.Throwable -> L16
            T51.b r6 = r11.f1995v
            if (r5 == 0) goto L78
            r11.f1990q = r12     // Catch: java.lang.Throwable -> L16
            r11.f1991r = r6     // Catch: java.lang.Throwable -> L16
            r11.f1992s = r1     // Catch: java.lang.Throwable -> L16
            r11.f1993t = r3     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.V0 r5 = (kotlinx.coroutines.V0) r5     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r5.A(r11)     // Catch: java.lang.Throwable -> L16
            if (r3 != r0) goto L78
            return r0
        L78:
            r3 = r6
        L79:
            r11.f1990q = r12     // Catch: java.lang.Throwable -> L16
            r11.f1991r = r4     // Catch: java.lang.Throwable -> L16
            r11.f1992s = r4     // Catch: java.lang.Throwable -> L16
            r11.f1993t = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = C81.c.a(r12, r1, r3, r11)     // Catch: java.lang.Throwable -> L16
            if (r1 != r0) goto L88
            return r0
        L88:
            r0 = r12
            r12 = r1
        L8a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L16
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L16
            y81.b r0 = r0.f1998c     // Catch: java.lang.Throwable -> L16
            O51.d r0 = (O51.d) r0     // Catch: java.lang.Throwable -> L16
            D31.a r1 = r0.f12004a     // Catch: java.lang.Throwable -> L16
            D31.g r1 = (D31.g) r1     // Catch: java.lang.Throwable -> L16
            kotlin.C r1 = r1.f2881b     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1     // Catch: java.lang.Throwable -> L16
            O51.c r2 = new O51.c     // Catch: java.lang.Throwable -> L16
            r2.<init>(r0, r12, r4)     // Catch: java.lang.Throwable -> L16
            r12 = 3
            kotlinx.coroutines.C43259k.d(r1, r4, r4, r2, r12)     // Catch: java.lang.Throwable -> L16
            kotlin.G0 r12 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L16
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L16
            goto Lbe
        Lae:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "partner ID не задан"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L16
            throw r12     // Catch: java.lang.Throwable -> L16
        Lb6:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r12)
            r12 = r0
        Lbe:
            boolean r0 = r12 instanceof kotlin.Z.b
            if (r0 == 0) goto Lc6
            kotlin.Z.b(r12)
        Lc6:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: C81.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
