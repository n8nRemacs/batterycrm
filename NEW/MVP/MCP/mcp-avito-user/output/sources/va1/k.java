package va1;

import Y41.p;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class k extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f440855q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f440856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bitmap f440857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f440858t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f440859u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Bitmap bitmap, Context context, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f440857s = bitmap;
        this.f440858t = context;
        this.f440859u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f440857s, this.f440858t, this.f440859u, continuation);
        kVar.f440856r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f440855q
            va1.m r2 = r7.f440859u
            android.graphics.Bitmap r3 = r7.f440857s
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L17
            goto L55
        L17:
            r8 = move-exception
            goto L5a
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.f440856r
            kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
            kotlin.C42729a0.b(r8)
            goto L44
        L29:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f440856r
            kotlinx.coroutines.T r8 = (kotlinx.coroutines.T) r8
            r7.f440856r = r8
            r7.f440855q = r5
            kotlinx.coroutines.scheduling.b r8 = kotlinx.coroutines.C43262l0.f411947c
            Ba1.g r1 = new Ba1.g
            android.content.Context r5 = r7.f440858t
            r1.<init>(r5, r3, r6)
            java.lang.Object r8 = kotlinx.coroutines.C43259k.g(r8, r1, r7)
            if (r8 != r0) goto L44
            return r0
        L44:
            java.io.File r8 = (java.io.File) r8
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L17
            ra1.b r1 = r2.f440863E     // Catch: java.lang.Throwable -> L17
            r7.f440856r = r6     // Catch: java.lang.Throwable -> L17
            r7.f440855q = r4     // Catch: java.lang.Throwable -> L17
            java.lang.Object r8 = r1.a(r3, r8, r7)     // Catch: java.lang.Throwable -> L17
            if (r8 != r0) goto L55
            return r0
        L55:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L17
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L17
            goto L62
        L5a:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r8)
            r8 = r0
        L62:
            java.lang.Throwable r0 = kotlin.Z.b(r8)
            if (r0 != 0) goto L77
            kotlin.G0 r8 = (kotlin.G0) r8
            va1.l r8 = new va1.l
            r8.<init>(r2, r6)
            C91.h r0 = r2.f440865K
            r0.getClass()
            r0.f2041e = r8
            goto L83
        L77:
            r8 = 0
            W91.h r1 = r2.f440864J
            r1.f17823e = r8
            boolean r8 = r0 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L83
            ba1.AbstractC25617i.a(r1)
        L83:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: va1.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
