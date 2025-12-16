package Za1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.core.test.a;
import g21.C40523a;
import java.util.List;

/* loaded from: classes9.dex */
public final class C extends com.vk.push.core.ipc.b<com.vk.push.core.test.a> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f20217q = 0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final String f20218n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final bb1.r f20219o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final String f20220p;

    public C(@Y61.k String str, @Y61.k Context context, @Y61.k List list, @Y61.k T11.f fVar, @Y61.k bb1.r rVar) {
        super(context, list, 0L, null, rVar, fVar, 12, null);
        this.f20218n = str;
        this.f20219o = rVar;
        this.f20220p = "TestPushIPCClient";
    }

    public static final ComponentName n(String str, C c12) {
        Context context = c12.f367033a;
        Intent intent = new Intent("com.vk.push.TEST_PUSH");
        intent.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveService = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveService(intent, PackageManager.ResolveInfoFlags.of(128)) : packageManager.resolveService(intent, 128);
        ComponentName componentName = resolveInfoResolveService != null ? new ComponentName(str, resolveInfoResolveService.serviceInfo.name) : null;
        if (componentName == null) {
            StringBuilder sbA = androidx.appcompat.app.r.A("Unable to resolve service in ", str, " by action ");
            sbA.append(C40523a.f396262a);
            sbA.append(".TEST_PUSH_SERVICE_ACTIO");
            c12.i().error(sbA.toString(), null);
        }
        return componentName;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r16) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r16
            boolean r1 = r0 instanceof Za1.n
            if (r1 == 0) goto L16
            r1 = r0
            Za1.n r1 = (Za1.n) r1
            int r2 = r1.f20247s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f20247s = r2
            r9 = r15
            goto L1c
        L16:
            Za1.n r1 = new Za1.n
            r9 = r15
            r1.<init>(r15, r0)
        L1c:
            java.lang.Object r0 = r1.f20245q
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.f20247s
            r11 = 1
            if (r2 == 0) goto L35
            if (r2 != r11) goto L2d
            kotlin.C42729a0.b(r0)
            goto L5e
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.C42729a0.b(r0)
            Za1.o r0 = Za1.o.f20248l
            Za1.p r12 = Za1.p.f20249l
            Za1.q r13 = Za1.q.f20250l
            Za1.r r14 = new Za1.r
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r3 = 1
            java.lang.Class<Za1.C> r5 = Za1.C.class
            java.lang.String r6 = "findService"
            r2 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f20247s = r11
            java.lang.String r4 = "getIntermediateToken"
            r2 = r15
            r3 = r0
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r1
            java.lang.Object r0 = com.vk.push.core.ipc.b.k(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L5e
            return r10
        L5e:
            kotlin.Z r0 = (kotlin.Z) r0
            java.lang.Object r0 = r0.f406625b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Za1.C.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r16, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            r15 = this;
            r7 = r15
            r0 = r17
            boolean r1 = r0 instanceof Za1.s
            if (r1 == 0) goto L17
            r1 = r0
            Za1.s r1 = (Za1.s) r1
            int r2 = r1.f20253s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f20253s = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            Za1.s r1 = new Za1.s
            r1.<init>(r15, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f20251q
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f20253s
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 != r10) goto L2e
            kotlin.C42729a0.b(r0)
            goto L64
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.C42729a0.b(r0)
            Za1.t r11 = new Za1.t
            r0 = r16
            r11.<init>(r0, r15)
            Za1.u r12 = Za1.u.f20256l
            Za1.v r13 = Za1.v.f20257l
            Za1.w r14 = new Za1.w
            java.lang.String r5 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r6 = 0
            r1 = 1
            java.lang.Class<Za1.C> r3 = Za1.C.class
            java.lang.String r4 = "findService"
            r0 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f20253s = r10
            java.lang.String r2 = "registerForPushes"
            r0 = r15
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r8
            java.lang.Object r0 = com.vk.push.core.ipc.b.k(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L64
            return r9
        L64:
            kotlin.Z r0 = (kotlin.Z) r0
            java.lang.Object r0 = r0.f406625b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Za1.C.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.vk.push.core.ipc.b
    public final IInterface f(IBinder iBinder) {
        return a.b.e4(iBinder);
    }

    @Override // com.vk.push.core.ipc.b
    @Y61.k
    public final String h() {
        return this.f20220p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k java.lang.String r16, @Y61.k com.vk.push.core.test.TestPushPayload r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r15 = this;
            r0 = r18
            boolean r1 = r0 instanceof Za1.x
            if (r1 == 0) goto L16
            r1 = r0
            Za1.x r1 = (Za1.x) r1
            int r2 = r1.f20260s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f20260s = r2
            r9 = r15
            goto L1c
        L16:
            Za1.x r1 = new Za1.x
            r9 = r15
            r1.<init>(r15, r0)
        L1c:
            java.lang.Object r0 = r1.f20258q
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.f20260s
            r11 = 1
            if (r2 == 0) goto L35
            if (r2 != r11) goto L2d
            kotlin.C42729a0.b(r0)
            goto L65
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.C42729a0.b(r0)
            Za1.y r0 = new Za1.y
            r2 = r16
            r3 = r17
            r0.<init>(r2, r3)
            Za1.z r12 = Za1.z.f20263l
            Za1.A r13 = Za1.A.f20216l
            Za1.B r14 = new Za1.B
            java.lang.String r7 = "findService(Ljava/lang/String;)Landroid/content/ComponentName;"
            r8 = 0
            r3 = 1
            java.lang.Class<Za1.C> r5 = Za1.C.class
            java.lang.String r6 = "findService"
            r2 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f20260s = r11
            java.lang.String r4 = "sendTestPush"
            r2 = r15
            r3 = r0
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r1
            java.lang.Object r0 = com.vk.push.core.ipc.b.k(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L65
            return r10
        L65:
            kotlin.Z r0 = (kotlin.Z) r0
            java.lang.Object r0 = r0.f406625b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Za1.C.o(java.lang.String, com.vk.push.core.test.TestPushPayload, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
