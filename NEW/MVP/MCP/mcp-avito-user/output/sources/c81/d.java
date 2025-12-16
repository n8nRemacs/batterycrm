package C81;

import Y41.p;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f2002q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f2004s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, e eVar) {
        super(2, continuation);
        this.f2004s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(continuation, this.f2004s);
        dVar.f2003r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:22:0x004c, B:24:0x0052, B:28:0x0064, B:25:0x005c, B:27:0x0060, B:13:0x0022, B:19:0x003c, B:16:0x002d), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:22:0x004c, B:24:0x0052, B:28:0x0064, B:25:0x005c, B:27:0x0060, B:13:0x0022, B:19:0x003c, B:16:0x002d), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f2002q
            C81.e r2 = r6.f2004s
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L4c
        L14:
            r7 = move-exception
            goto L69
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            java.lang.Object r1 = r6.f2003r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L3c
        L26:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f2003r
            kotlinx.coroutines.T r7 = (kotlinx.coroutines.T) r7
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L14
            r6.f2003r = r7     // Catch: java.lang.Throwable -> L14
            r6.f2002q = r4     // Catch: java.lang.Throwable -> L14
            r4 = 50
            java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r4, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L3c
            return r0
        L3c:
            e61.a r7 = r2.f2005a     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r6.f2003r = r1     // Catch: java.lang.Throwable -> L14
            r6.f2002q = r3     // Catch: java.lang.Throwable -> L14
            M41.c r7 = (M41.c) r7     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L4c
            return r0
        L4c:
            ac1.a r7 = (ac1.AbstractC19866a) r7     // Catch: java.lang.Throwable -> L14
            boolean r0 = r7 instanceof ac1.AbstractC19866a.b     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L5c
            ac1.a$b r7 = (ac1.AbstractC19866a.b) r7     // Catch: java.lang.Throwable -> L14
            T r7 = r7.f21081c     // Catch: java.lang.Throwable -> L14
            X51.g r7 = (X51.g) r7     // Catch: java.lang.Throwable -> L14
            C81.e.a(r2, r7)     // Catch: java.lang.Throwable -> L14
            goto L64
        L5c:
            boolean r0 = r7 instanceof ac1.AbstractC19866a.C1499a     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L64
            ac1.a$a r7 = (ac1.AbstractC19866a.C1499a) r7     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = r7.f21079c     // Catch: java.lang.Throwable -> L14
        L64:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L14
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L14
            goto L71
        L69:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r7)
            r7 = r0
        L71:
            java.lang.Throwable r7 = kotlin.Z.b(r7)
            if (r7 != 0) goto L7a
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L7a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C81.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
