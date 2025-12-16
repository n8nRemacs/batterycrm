package io.ktor.utils.io.internal;

import V31.e;
import androidx.camera.camera2.internal.G;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.k2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WriteSessionImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/internal/u;", "Lio/ktor/utils/io/k2;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public int f401078a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C41619a f401079b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public ByteBuffer f401080c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public io.ktor.utils.io.core.internal.b f401081d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public l f401082e;

    @Override // io.ktor.utils.io.f2
    @Y61.l
    public final io.ktor.utils.io.core.internal.b a(int i12) {
        int i13;
        int i14 = this.f401078a;
        l lVar = this.f401082e;
        while (true) {
            i13 = lVar._availableForWrite$internal;
            if (i13 < 0) {
                i13 = 0;
                break;
            }
            if (l.f401056c.compareAndSet(lVar, i13, 0)) {
                break;
            }
        }
        int i15 = i13 + i14;
        this.f401078a = i15;
        if (i15 < i12) {
            return null;
        }
        this.f401079b.f0(i15, this.f401080c);
        if (this.f401080c.remaining() < i12) {
            return null;
        }
        io.ktor.utils.io.core.internal.b bVar = this.f401081d;
        ByteBuffer byteBuffer = this.f401080c;
        bVar.f(byteBuffer.limit());
        bVar.b(byteBuffer.position());
        return this.f401081d;
    }

    @Override // io.ktor.utils.io.f2
    public final void b(int i12) {
        int i13;
        if (i12 < 0 || i12 > (i13 = this.f401078a)) {
            if (i12 >= 0) {
                throw new IllegalStateException(AK.c.i(this.f401078a, " were pre-locked.", G.j(i12, "Unable to mark ", " bytes as written: only ")));
            }
            throw new IllegalArgumentException(AK.c.g(i12, "Written bytes count shouldn't be negative: "));
        }
        this.f401078a = i13 - i12;
        this.f401079b.T(this.f401080c, this.f401082e, i12);
    }

    @Override // io.ktor.utils.io.k2
    @Y61.l
    public final Object c(int i12, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        if (this.f401079b.getJoining() != null) {
            Object objF = f(i12, continuationImpl);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : G0.f406611a;
        }
        int i13 = this.f401078a;
        if (i13 >= i12) {
            return G0.f406611a;
        }
        if (i13 > 0) {
            this.f401082e.a(i13);
            this.f401078a = 0;
        }
        Object objO0 = this.f401079b.O0(i12, continuationImpl);
        return objO0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO0 : G0.f406611a;
    }

    public final void d() {
        C41619a c41619a = this.f401079b;
        c41619a.z0();
        this.f401079b = c41619a;
        ByteBuffer byteBufferH0 = c41619a.H0();
        if (byteBufferH0 == null) {
            return;
        }
        this.f401080c = byteBufferH0;
        ByteBuffer byteBuffer = this.f401079b.X().f401039a;
        e.a aVar = V31.e.f16906b;
        io.ktor.utils.io.core.internal.b bVar = new io.ktor.utils.io.core.internal.b(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN), null, null, null);
        this.f401081d = bVar;
        ByteBuffer byteBuffer2 = this.f401080c;
        bVar.f(byteBuffer2.limit());
        bVar.b(byteBuffer2.position());
        this.f401082e = this.f401079b.X().f401040b;
    }

    public final void e() {
        int i12 = this.f401078a;
        if (i12 > 0) {
            this.f401082e.a(i12);
            this.f401078a = 0;
        }
        this.f401079b.C0();
        this.f401079b.M0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.internal.t
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.internal.t r0 = (io.ktor.utils.io.internal.t) r0
            int r1 = r0.f401077t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f401077t = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.t r0 = new io.ktor.utils.io.internal.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f401075r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f401077t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.internal.u r5 = r0.f401074q
            kotlin.C42729a0.b(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            int r6 = r4.f401078a
            if (r6 <= 0) goto L42
            io.ktor.utils.io.internal.l r2 = r4.f401082e
            r2.a(r6)
            r6 = 0
            r4.f401078a = r6
        L42:
            io.ktor.utils.io.a r6 = r4.f401079b
            r6.a0(r3)
            io.ktor.utils.io.a r6 = r4.f401079b
            r6.C0()
            io.ktor.utils.io.a r6 = r4.f401079b
            r6.M0()
            io.ktor.utils.io.a r6 = r4.f401079b
            r0.f401074q = r4
            r0.f401077t = r3
            java.lang.Object r5 = r6.O0(r5, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = r4
        L5f:
            io.ktor.utils.io.a r6 = r5.f401079b
            r6.z0()
            r5.f401079b = r6
            java.nio.ByteBuffer r6 = r6.H0()
            if (r6 != 0) goto L6d
            goto La5
        L6d:
            r5.f401080c = r6
            io.ktor.utils.io.a r6 = r5.f401079b
            io.ktor.utils.io.internal.j r6 = r6.X()
            java.nio.ByteBuffer r6 = r6.f401039a
            io.ktor.utils.io.core.internal.b r0 = new io.ktor.utils.io.core.internal.b
            V31.e$a r1 = V31.e.f16906b
            java.nio.ByteBuffer r6 = r6.slice()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r1)
            r1 = 0
            r0.<init>(r6, r1, r1, r1)
            r5.f401081d = r0
            java.nio.ByteBuffer r6 = r5.f401080c
            int r1 = r6.limit()
            r0.f(r1)
            int r6 = r6.position()
            r0.b(r6)
            io.ktor.utils.io.a r6 = r5.f401079b
            io.ktor.utils.io.internal.j r6 = r6.X()
            io.ktor.utils.io.internal.l r6 = r6.f401040b
            r5.f401082e = r6
        La5:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.u.f(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
