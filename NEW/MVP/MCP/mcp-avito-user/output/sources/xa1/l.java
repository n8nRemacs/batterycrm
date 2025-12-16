package Xa1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.core.auth.a;
import java.util.List;
import kotlin.G0;
import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public final class l extends com.vk.push.core.ipc.b<com.vk.push.core.auth.a> implements a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f18947n;

    public l(@Y61.k Context context, @Y61.k List<T11.a> list, @Y61.k T11.f fVar, @Y61.k Y41.l<? super Continuation<? super G0>, ? extends Object> lVar) {
        super(context, list, 0L, null, lVar, fVar, 12, null);
        this.f18947n = "AuthIPCClient";
    }

    @Override // Xa1.a
    @Y61.k
    public final List<T11.a> a() {
        return this.f367034b;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // Xa1.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Xa1.b
            if (r0 == 0) goto L14
            r0 = r9
            Xa1.b r0 = (Xa1.b) r0
            int r1 = r0.f18935s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18935s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            Xa1.b r0 = new Xa1.b
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.f18933q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f18935s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r9)
            goto L4b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.C42729a0.b(r9)
            Xa1.c r9 = Xa1.c.f18936l
            Xa1.d r4 = Xa1.d.f18937l
            Xa1.e r5 = Xa1.e.f18938l
            Xa1.f r6 = Xa1.f.f18939l
            r7.f18935s = r2
            java.lang.String r3 = "getIntermediateToken"
            r1 = r8
            r2 = r9
            java.lang.Object r9 = com.vk.push.core.ipc.b.k(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            kotlin.Z r9 = (kotlin.Z) r9
            java.lang.Object r9 = r9.f406625b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa1.l.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.b
    public final IInterface f(IBinder iBinder) {
        return a.b.e4(iBinder);
    }

    @Override // com.vk.push.core.ipc.b
    @Y61.k
    public final String h() {
        return this.f18947n;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // Xa1.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Xa1.g
            if (r0 == 0) goto L14
            r0 = r9
            Xa1.g r0 = (Xa1.g) r0
            int r1 = r0.f18942s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18942s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            Xa1.g r0 = new Xa1.g
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.f18940q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f18942s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r9)
            goto L4b
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.C42729a0.b(r9)
            Xa1.h r9 = Xa1.h.f18943l
            Xa1.i r4 = Xa1.i.f18944l
            Xa1.j r5 = Xa1.j.f18945l
            Xa1.k r6 = Xa1.k.f18946l
            r7.f18942s = r2
            java.lang.String r3 = "isUserAuthorized"
            r1 = r8
            r2 = r9
            java.lang.Object r9 = com.vk.push.core.ipc.b.k(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            kotlin.Z r9 = (kotlin.Z) r9
            java.lang.Object r9 = r9.f406625b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa1.l.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
