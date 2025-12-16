package ob1;

import Y61.k;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.core.push.b;
import gb1.C40651c;
import java.util.List;

/* loaded from: classes9.dex */
public final class g extends com.vk.push.core.ipc.b<com.vk.push.core.push.b> implements InterfaceC44751a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f419960n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f419961o;

    public g(@k String str, @k Context context, @k List list, @k T11.f fVar, @k C40651c c40651c) {
        super(context, list, 0L, null, c40651c, fVar, 12, null);
        this.f419960n = str;
        this.f419961o = "PushIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ob1.InterfaceC44751a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ob1.b
            if (r0 == 0) goto L14
            r0 = r10
            ob1.b r0 = (ob1.b) r0
            int r1 = r0.f419954s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f419954s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            ob1.b r0 = new ob1.b
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.f419952q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f419954s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r10)
            goto L4e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.C42729a0.b(r10)
            ob1.c r10 = new ob1.c
            r10.<init>(r9, r8)
            ob1.d r4 = ob1.d.f419957l
            ob1.e r5 = ob1.e.f419958l
            ob1.f r6 = ob1.f.f419959l
            r7.f419954s = r2
            java.lang.String r3 = "registerForPushes"
            r1 = r8
            r2 = r10
            java.lang.Object r10 = com.vk.push.core.ipc.b.k(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L4e
            return r0
        L4e:
            kotlin.Z r10 = (kotlin.Z) r10
            java.lang.Object r9 = r10.f406625b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ob1.g.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.b
    public final IInterface f(IBinder iBinder) {
        return b.AbstractBinderC10843b.e4(iBinder);
    }

    @Override // com.vk.push.core.ipc.b
    @k
    public final String h() {
        return this.f419961o;
    }
}
