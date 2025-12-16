package io.ktor.utils.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.core.C41638k;
import io.ktor.utils.io.core.C41641n;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/N0;", "Lio/ktor/utils/io/h0;", "Lkotlinx/coroutines/N0;", "attachedJob", "Lkotlinx/coroutines/N0;", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N0 extends AbstractC41660h0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f400700m = 0;

    @Y61.l
    private volatile kotlinx.coroutines.N0 attachedJob;

    /* compiled from: ByteChannelSequentialJVM.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/N0$a;", "Lio/ktor/utils/io/T1;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements T1 {
        @Override // io.ktor.utils.io.Q1
        public final void a(int i12) {
            throw null;
        }

        @Override // io.ktor.utils.io.T1
        @Y61.l
        public final Object b(int i12, @Y61.k ContinuationImpl continuationImpl) {
            throw null;
        }

        @Override // io.ktor.utils.io.Q1
        @Y61.l
        public final ByteBuffer c(int i12, int i13) {
            throw null;
        }
    }

    /* compiled from: ByteChannelSequentialJVM.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {41, 42}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public N0 f400701q;

        /* renamed from: r, reason: collision with root package name */
        public ByteBuffer f400702r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f400703s;

        /* renamed from: u, reason: collision with root package name */
        public int f400705u;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400703s = obj;
            this.f400705u |= BeduinInputModel.MIN_TEXT_VERSION;
            int i12 = N0.f400700m;
            return N0.this.y0(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.utils.io.W0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(int r6, @Y61.k Y41.l r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.io.EOFException {
        /*
            r5 = this;
            java.lang.String r6 = "Buffer's position shouldn't be rewinded"
            boolean r0 = r8 instanceof io.ktor.utils.io.P0
            if (r0 == 0) goto L15
            r0 = r8
            io.ktor.utils.io.P0 r0 = (io.ktor.utils.io.P0) r0
            int r1 = r0.f400723u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f400723u = r1
            goto L1a
        L15:
            io.ktor.utils.io.P0 r0 = new io.ktor.utils.io.P0
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.f400721s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400723u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            Y41.l r7 = r0.f400720r
            Y41.l r7 = (Y41.l) r7
            io.ktor.utils.io.N0 r0 = r0.f400719q
            kotlin.C42729a0.b(r8)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.C42729a0.b(r8)
            r0.f400719q = r5
            r8 = r7
            Y41.l r8 = (Y41.l) r8
            r0.f400720r = r8
            r0.f400723u = r4
            java.lang.Object r8 = r5.b(r3, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb6
            io.ktor.utils.io.core.n r8 = r0.f400980d
            io.ktor.utils.io.core.internal.b r0 = r8.q(r3)
            if (r0 == 0) goto Lb1
            int r1 = r0.f400875b
            java.nio.ByteBuffer r2 = r0.f400874a     // Catch: java.lang.Throwable -> L92
            int r3 = r0.f400876c     // Catch: java.lang.Throwable -> L92
            int r3 = r3 - r1
            V31.e$a r4 = V31.e.f16906b     // Catch: java.lang.Throwable -> L92
            java.nio.ByteBuffer r2 = V31.h.c(r2, r1, r3)     // Catch: java.lang.Throwable -> L92
            r7.invoke(r2)     // Catch: java.lang.Throwable -> L92
            int r7 = r2.limit()     // Catch: java.lang.Throwable -> L92
            if (r7 != r3) goto L94
            int r7 = r2.position()     // Catch: java.lang.Throwable -> L92
            r0.c(r7)     // Catch: java.lang.Throwable -> L92
            int r7 = r0.f400875b
            if (r7 < r1) goto L8c
            int r6 = r0.f400876c
            if (r7 != r6) goto L87
            r8.h(r0)
            goto L89
        L87:
            r8.f400910e = r7
        L89:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L8c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
        L92:
            r7 = move-exception
            goto L9c
        L94:
            java.lang.String r7 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L92
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L9c:
            int r2 = r0.f400875b
            if (r2 < r1) goto Lab
            int r6 = r0.f400876c
            if (r2 != r6) goto La8
            r8.h(r0)
            goto Laa
        La8:
            r8.f400910e = r2
        Laa:
            throw r7
        Lab:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r6)
            throw r7
        Lb1:
            io.ktor.utils.io.core.S.a(r3)
            r6 = 0
            throw r6
        Lb6:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Channel closed while "
            java.lang.String r8 = " bytes expected"
            java.lang.String r7 = androidx.camera.camera2.internal.G.e(r3, r7, r8)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.E(int, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(int r6, @Y61.k Y41.l r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.S0
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.S0 r0 = (io.ktor.utils.io.S0) r0
            int r1 = r0.f400756v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400756v = r1
            goto L18
        L13:
            io.ktor.utils.io.S0 r0 = new io.ktor.utils.io.S0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f400754t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400756v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r6 = r0.f400753s
            Y41.l r7 = r0.f400752r
            Y41.l r7 = (Y41.l) r7
            io.ktor.utils.io.N0 r0 = r0.f400751q
            kotlin.C42729a0.b(r8)
            goto L63
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r8)
            boolean r8 = r5.W()
            if (r8 == 0) goto L50
            java.lang.Throwable r6 = r5.g()
            if (r6 != 0) goto L4f
            kotlinx.coroutines.channels.ClosedSendChannelException r6 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r7 = "Channel closed for write"
            r6.<init>(r7)
        L4f:
            throw r6
        L50:
            r0.f400751q = r5
            r8 = r7
            Y41.l r8 = (Y41.l) r8
            r0.f400752r = r8
            r0.f400753s = r6
            r0.f400756v = r3
            java.lang.Object r8 = r5.P(r6, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r0 = r5
        L63:
            io.ktor.utils.io.core.m r8 = r0.f400979c
            io.ktor.utils.io.core.internal.b r6 = r8.m(r6)
            java.nio.ByteBuffer r1 = r6.f400874a     // Catch: java.lang.Throwable -> L99
            int r2 = r6.f400876c     // Catch: java.lang.Throwable -> L99
            int r3 = r6.f400878e     // Catch: java.lang.Throwable -> L99
            int r3 = r3 - r2
            V31.e$a r4 = V31.e.f16906b     // Catch: java.lang.Throwable -> L99
            java.nio.ByteBuffer r1 = V31.h.c(r1, r2, r3)     // Catch: java.lang.Throwable -> L99
            r7.invoke(r1)     // Catch: java.lang.Throwable -> L99
            int r7 = r1.limit()     // Catch: java.lang.Throwable -> L99
            if (r7 != r3) goto L9b
            int r7 = r1.position()     // Catch: java.lang.Throwable -> L99
            r6.a(r7)     // Catch: java.lang.Throwable -> L99
            if (r7 < 0) goto L91
            r8.a()
            r0.N(r7)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L91:
            java.lang.String r6 = "The returned value shouldn't be negative"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L99
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        L99:
            r6 = move-exception
            goto La3
        L9b:
            java.lang.String r6 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L99
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        La3:
            r8.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.G(int, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC41649d1
    @Y61.l
    public final Object k(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        x0(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return kotlin.G0.f406611a;
        }
        Object objZ0 = z0(byteBuffer, continuationImpl);
        return objZ0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objZ0 : kotlin.G0.f406611a;
    }

    @Override // io.ktor.utils.io.W0
    @Y61.l
    public final Object w(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl) throws Throwable {
        int iA2;
        Throwable thG = g();
        if (thG != null) {
            throw thG;
        }
        if (W() && get_availableForRead() == 0) {
            iA2 = -1;
        } else {
            C41641n c41641n = this.f400980d;
            if (!c41641n.a()) {
                X();
            }
            iA2 = C41638k.a(c41641n, byteBuffer);
            M(iA2);
        }
        return iA2 != 0 ? Boxing.boxInt(iA2) : !byteBuffer.hasRemaining() ? Boxing.boxInt(0) : w0(byteBuffer, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(java.nio.ByteBuffer r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.Q0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.Q0 r0 = (io.ktor.utils.io.Q0) r0
            int r1 = r0.f400736u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400736u = r1
            goto L18
        L13:
            io.ktor.utils.io.Q0 r0 = new io.ktor.utils.io.Q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f400734s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400736u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.nio.ByteBuffer r6 = r0.f400733r
            io.ktor.utils.io.N0 r2 = r0.f400732q
            kotlin.C42729a0.b(r7)
            goto L4d
        L3c:
            kotlin.C42729a0.b(r7)
            r0.f400732q = r5
            r0.f400733r = r6
            r0.f400736u = r4
            java.lang.Object r7 = r5.b(r4, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5b
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        L5b:
            r7 = 0
            r0.f400732q = r7
            r0.f400733r = r7
            r0.f400736u = r3
            java.lang.Object r7 = r2.w(r6, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.w0(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x0(java.nio.ByteBuffer r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r5.remaining()
            int r1 = r4.V()
            boolean r2 = r4.W()
            if (r2 == 0) goto L1c
            java.lang.Throwable r5 = r4.g()
            if (r5 != 0) goto L1b
            kotlinx.coroutines.channels.ClosedSendChannelException r5 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r0 = "Channel closed for write"
            r5.<init>(r0)
        L1b:
            throw r5
        L1c:
            r2 = 0
            if (r0 != 0) goto L21
        L1f:
            r0 = r2
            goto L3f
        L21:
            io.ktor.utils.io.core.m r3 = r4.f400979c
            if (r0 > r1) goto L29
            io.ktor.utils.io.core.F.a(r3, r5)
            goto L3f
        L29:
            if (r1 != 0) goto L2c
            goto L1f
        L2c:
            int r0 = r5.limit()
            int r2 = r5.position()
            int r2 = r2 + r1
            r5.limit(r2)
            io.ktor.utils.io.core.F.a(r3, r5)
            r5.limit(r0)
            r0 = r1
        L3f:
            r4.N(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.x0(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(java.nio.ByteBuffer r6, kotlin.coroutines.Continuation<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = r7
            io.ktor.utils.io.N0$b r0 = (io.ktor.utils.io.N0.b) r0
            int r1 = r0.f400705u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto Lf
            int r1 = r1 - r2
            r0.f400705u = r1
            goto L14
        Lf:
            io.ktor.utils.io.N0$b r0 = new io.ktor.utils.io.N0$b
            r0.<init>(r7)
        L14:
            java.lang.Object r7 = r0.f400703s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400705u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L30
            if (r2 != r3) goto L28
            kotlin.C42729a0.b(r7)
            goto L6c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            java.nio.ByteBuffer r6 = r0.f400702r
            io.ktor.utils.io.N0 r2 = r0.f400701q
            kotlin.C42729a0.b(r7)
            goto L49
        L38:
            kotlin.C42729a0.b(r7)
            r0.f400701q = r5
            r0.f400702r = r6
            r0.f400705u = r4
            java.lang.Object r7 = r5.P(r4, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            r7 = 0
            r0.f400701q = r7
            r0.f400702r = r7
            r0.f400705u = r3
            int r7 = r2.x0(r6)
            if (r7 <= 0) goto L57
            goto L5e
        L57:
            boolean r7 = r6.hasRemaining()
            if (r7 != 0) goto L64
            r7 = 0
        L5e:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
        L62:
            r7 = r6
            goto L69
        L64:
            java.lang.Object r6 = r2.y0(r6, r0)
            goto L62
        L69:
            if (r7 != r1) goto L6c
            return r1
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.y0(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0049 -> B:20:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(java.nio.ByteBuffer r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.T0
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.T0 r0 = (io.ktor.utils.io.T0) r0
            int r1 = r0.f400766u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400766u = r1
            goto L18
        L13:
            io.ktor.utils.io.T0 r0 = new io.ktor.utils.io.T0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f400764s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400766u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.nio.ByteBuffer r5 = r0.f400763r
            io.ktor.utils.io.N0 r2 = r0.f400762q
            kotlin.C42729a0.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r2 = r4
        L39:
            boolean r6 = r5.hasRemaining()
            if (r6 == 0) goto L54
            r0.f400762q = r2
            r0.f400763r = r5
            r0.f400766u = r3
            java.lang.Object r6 = r2.P(r3, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            int r6 = r2.x0(r5)
            r2.N(r6)
            goto L39
        L54:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.N0.z0(java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
