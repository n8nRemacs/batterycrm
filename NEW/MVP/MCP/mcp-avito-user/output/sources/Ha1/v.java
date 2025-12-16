package ha1;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class v extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f397263q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f397264r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f397265s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f397266t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f397267u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Bitmap bitmap, Context context, Continuation continuation) {
        super(2, continuation);
        this.f397265s = wVar;
        this.f397266t = bitmap;
        this.f397267u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f397265s, this.f397266t, this.f397267u, continuation);
        vVar.f397264r = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f397263q
            ha1.w r2 = r10.f397265s
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            java.lang.Object r0 = r10.f397264r
            kotlin.C42729a0.b(r11)
            goto L9d
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L24
            goto L65
        L24:
            r11 = move-exception
            goto L6a
        L26:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f397264r
            kotlinx.coroutines.T r11 = (kotlinx.coroutines.T) r11
            kotlinx.coroutines.flow.Z1 r11 = r2.f397273N
            ha1.s r1 = new ha1.s
            android.graphics.Bitmap r6 = r10.f397266t
            android.graphics.Bitmap r7 = Ba1.i.a(r6)
            fa1.b r8 = r2.f397268E
            E91.h r9 = r8.f395964a
            if (r9 == 0) goto L40
            java.lang.String r9 = r9.f3858h
            goto L41
        L40:
            r9 = r3
        L41:
            r1.<init>(r7, r9)
            r11.setValue(r1)
            ha1.p r11 = r2.f397271L
            java.lang.Object r1 = r11.f397252b
            java.util.ArrayList r1 = kotlin.collections.C42745f0.i0(r6, r1)
            ha1.p r6 = new ha1.p
            int r11 = r11.f397251a
            r6.<init>(r11, r1)
            r2.f397271L = r6
            android.content.Context r11 = r10.f397267u
            int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L24
            r10.f397263q = r5     // Catch: java.lang.Throwable -> L24
            java.lang.Object r11 = r8.a(r1, r11, r10)     // Catch: java.lang.Throwable -> L24
            if (r11 != r0) goto L65
            return r0
        L65:
            kotlin.G0 r11 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L24
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L24
            goto L72
        L6a:
            int r1 = kotlin.Z.f406624c
            kotlin.Z$b r1 = new kotlin.Z$b
            r1.<init>(r11)
            r11 = r1
        L72:
            boolean r1 = r11 instanceof kotlin.Z.b
            if (r1 != 0) goto L9c
            r1 = r11
            kotlin.G0 r1 = (kotlin.G0) r1
            r10.f397264r = r11
            r10.f397263q = r4
            ha1.p r1 = r2.f397271L
            kotlin.collections.z0 r4 = kotlin.collections.C42784z0.f406748b
            int r1 = r1.f397251a
            ha1.p r5 = new ha1.p
            r5.<init>(r1, r4)
            r2.f397271L = r5
            ha1.u r1 = new ha1.u
            r1.<init>(r2, r3)
            C91.h r3 = r2.f397270K
            r3.getClass()
            r3.f2041e = r1
            kotlin.G0 r1 = kotlin.G0.f406611a
            if (r1 != r0) goto L9c
            return r0
        L9c:
            r0 = r11
        L9d:
            java.lang.Throwable r11 = kotlin.Z.b(r0)
            if (r11 == 0) goto Laf
            r0 = 0
            W91.h r1 = r2.f397269J
            r1.f17823e = r0
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 != 0) goto Laf
            ba1.AbstractC25617i.a(r1)
        Laf:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ha1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
