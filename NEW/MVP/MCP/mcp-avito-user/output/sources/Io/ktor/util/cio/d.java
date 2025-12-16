package io.ktor.util.cio;

import Y41.p;
import io.ktor.utils.io.X;
import io.ktor.utils.io.core.C41646t;
import io.ktor.utils.io.e2;
import io.ktor.utils.io.k2;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FileChannels.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$1", f = "FileChannels.kt", i = {0, 0, 1, 1}, l = {44, 63}, m = "invokeSuspend", n = {"$this$use$iv", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes8.dex */
final class d extends SuspendLambda implements p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f400432q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400433r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f400434s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ File f400435t;

    /* compiled from: FileChannels.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/k2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/k2;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$1$3$1", f = "FileChannels.kt", i = {0}, l = {49}, m = "invokeSuspend", n = {"$this$writeSuspendSession"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<k2, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f400436q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f400437r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ e2 f400438s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ FileChannel f400439t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2 e2Var, FileChannel fileChannel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f400438s = e2Var;
            this.f400439t = fileChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f400438s, this.f400439t, continuation);
            aVar.f400437r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(k2 k2Var, Continuation<? super G0> continuation) {
            return ((a) create(k2Var, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            throw new java.lang.IllegalStateException(androidx.camera.camera2.internal.G.e(r4, "Wrong buffer position change: ", ". Position should be moved forward only by at most size bytes (size = 1)"));
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws java.io.IOException {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f400436q
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r7.f400437r
                io.ktor.utils.io.k2 r1 = (io.ktor.utils.io.k2) r1
                kotlin.C42729a0.b(r8)
                goto L23
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f400437r
                io.ktor.utils.io.k2 r8 = (io.ktor.utils.io.k2) r8
                r1 = r8
            L23:
                io.ktor.utils.io.core.internal.b r8 = r1.a(r2)
                if (r8 != 0) goto L3d
                io.ktor.utils.io.e2 r8 = r7.f400438s
                io.ktor.utils.io.X r8 = r8.a()
                r8.flush()
                r7.f400437r = r1
                r7.f400436q = r2
                java.lang.Object r8 = r1.c(r2, r7)
                if (r8 != r0) goto L23
                return r0
            L3d:
                int r3 = r8.f400878e
                int r4 = r8.f400876c
                int r3 = r3 - r4
                if (r3 != 0) goto L46
                r8 = 0
                goto L6b
            L46:
                if (r2 > r3) goto L83
                java.nio.ByteBuffer r4 = r8.f400874a
                java.nio.ByteBuffer r4 = r4.duplicate()
                int r5 = r8.f400876c
                int r6 = r8.f400878e
                r4.limit(r6)
                r4.position(r5)
                java.nio.channels.FileChannel r6 = r7.f400439t
                int r6 = r6.read(r4)
                int r4 = r4.position()
                int r4 = r4 - r5
                if (r4 < 0) goto L75
                if (r4 > r3) goto L75
                r8.a(r4)
                r8 = r6
            L6b:
                r3 = -1
                if (r8 == r3) goto L72
                r1.b(r8)
                goto L23
            L72:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L75:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Wrong buffer position change: "
                java.lang.String r1 = ". Position should be moved forward only by at most size bytes (size = 1)"
                java.lang.String r0 = androidx.camera.camera2.internal.G.e(r4, r0, r1)
                r8.<init>(r0)
                throw r8
            L83:
                java.lang.String r8 = "size 1 is greater than buffer's remaining capacity "
                java.lang.String r8 = AK.c.g(r3, r8)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FileChannels.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "buffer", "Ljava/nio/ByteBuffer;", "invoke", "(Ljava/nio/ByteBuffer;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements Y41.l<ByteBuffer, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(ByteBuffer byteBuffer) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j12, File file, Continuation continuation) {
        super(2, continuation);
        this.f400434s = j12;
        this.f400435t = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f400434s, this.f400435t, continuation);
        dVar.f400433r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((d) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Closeable closeable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400432q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = (e2) this.f400433r;
            long j12 = this.f400434s;
            if (-1 > j12 - 1) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "endInclusive points to the position out of the file: file size = ", ", endInclusive = -1").toString());
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f400435t, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                X xA2 = e2Var.a();
                a aVar = new a(e2Var, channel, null);
                this.f400433r = randomAccessFile;
                this.f400432q = 1;
                if (xA2.u(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = randomAccessFile;
            } catch (Throwable th2) {
                th = th2;
                closeable = randomAccessFile;
                closeable.close();
                throw th;
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) this.f400433r;
            try {
                C42729a0.b(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    closeable.close();
                } catch (Throwable th4) {
                    C41646t.a(th, th4);
                }
                throw th;
            }
        }
        G0 g02 = G0.f406611a;
        closeable.close();
        return G0.f406611a;
    }
}
