package Za1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.core.hostinfo.a;
import java.util.List;

/* loaded from: classes9.dex */
public final class f extends com.vk.push.core.ipc.b<com.vk.push.core.hostinfo.a> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f20228o = 0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f20229n;

    public f(@Y61.k Context context, @Y61.k List<T11.a> list, @Y61.k T11.f fVar) {
        super(context, list, 0L, null, null, fVar, 12, null);
        this.f20229n = "ArbiterIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Za1.C19526a
            if (r0 == 0) goto L14
            r0 = r9
            Za1.a r0 = (Za1.C19526a) r0
            int r1 = r0.f20223s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f20223s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            Za1.a r0 = new Za1.a
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.f20221q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f20223s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r9)
            goto L4e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.C42729a0.b(r9)
            Za1.b r9 = Za1.C19527b.f20224l
            Za1.c r4 = Za1.C19528c.f20225l
            Za1.d r5 = Za1.d.f20226l
            Za1.e r6 = new Za1.e
            r6.<init>(r8)
            r7.f20223s = r2
            java.lang.String r3 = "getMaster"
            r1 = r8
            r2 = r9
            java.lang.Object r9 = com.vk.push.core.ipc.b.k(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            kotlin.Z r9 = (kotlin.Z) r9
            java.lang.Object r9 = r9.f406625b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Za1.f.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.b
    public final IInterface f(IBinder iBinder) {
        return a.b.e4(iBinder);
    }

    @Override // com.vk.push.core.ipc.b
    @Y61.k
    public final String h() {
        return this.f20229n;
    }
}
