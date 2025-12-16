package T91;

import androidx.view.M0;
import androidx.view.N0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* loaded from: classes9.dex */
public final class z extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final Z91.b f15490E;

    /* renamed from: J, reason: collision with root package name */
    public final C91.h f15491J;

    /* renamed from: K, reason: collision with root package name */
    public final W91.h f15492K;

    /* renamed from: L, reason: collision with root package name */
    public final Z1 f15493L;

    /* renamed from: M, reason: collision with root package name */
    public final n2 f15494M;

    public z(Z91.b bVar, C91.h hVar, W91.h hVar2, boolean z12) {
        this.f15490E = bVar;
        this.f15491J = hVar;
        this.f15492K = hVar2;
        Z1 z1A = p2.a(new C15344b());
        this.f15493L = z1A;
        this.f15494M = C43175k.b(z1A);
        if (z12) {
            C43259k.d(N0.a(this), C43262l0.f411947c, null, new s(this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ke(T91.z r4, Y41.l r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof T91.t
            if (r0 == 0) goto L13
            r0 = r6
            T91.t r0 = (T91.t) r0
            int r1 = r0.f15477t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15477t = r1
            goto L18
        L13:
            T91.t r0 = new T91.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f15475r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f15477t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            T91.z r4 = r0.f15474q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L49
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C42729a0.b(r6)
            W91.h r6 = r4.f15492K
            r6.f17823e = r3
            int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
            r0.f15474q = r4     // Catch: java.lang.Throwable -> L2b
            r0.f15477t = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L49
            goto L78
        L49:
            kotlin.G0 r5 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2b
            int r6 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
            goto L56
        L4e:
            int r6 = kotlin.Z.f406624c
            kotlin.Z$b r6 = new kotlin.Z$b
            r6.<init>(r5)
            r5 = r6
        L56:
            java.lang.Throwable r6 = kotlin.Z.b(r5)
            if (r6 != 0) goto L6c
            kotlin.G0 r5 = (kotlin.G0) r5
            C91.h r5 = r4.f15491J
            T91.u r6 = new T91.u
            r0 = 0
            r6.<init>(r4, r0)
            r5.getClass()
            r5.f2041e = r6
            goto L76
        L6c:
            W91.h r5 = r4.f15492K
            ba1.AbstractC25617i.a(r5)
            W91.h r4 = r4.f15492K
            r5 = 0
            r4.f17823e = r5
        L76:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T91.z.ke(T91.z, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
