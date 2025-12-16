package io.ktor.network.sockets;

import io.ktor.utils.io.T1;
import io.ktor.utils.io.a2;
import java.io.Closeable;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: CIOWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/a2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/a2;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.network.sockets.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41573o extends SuspendLambda implements Y41.p<a2, Continuation<? super G0>, Object> {

    /* compiled from: CIOWriter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/T1;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/T1;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$1", f = "CIOWriter.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {99, 111, 111}, m = "invokeSuspend", n = {"$this$lookAheadSuspend", "timeout", "$this$lookAheadSuspend", "timeout", "buffer", "rc", "$this$lookAheadSuspend", "timeout", "buffer", "rc", "$this$withTimeout$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: io.ktor.network.sockets.o$a */
    public static final class a extends SuspendLambda implements Y41.p<T1, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public io.ktor.network.util.d f400259q;

        /* renamed from: r, reason: collision with root package name */
        public ByteBuffer f400260r;

        /* renamed from: s, reason: collision with root package name */
        public l0.f f400261s;

        /* renamed from: t, reason: collision with root package name */
        public Object f400262t;

        /* renamed from: u, reason: collision with root package name */
        public Closeable f400263u;

        /* renamed from: v, reason: collision with root package name */
        public Closeable f400264v;

        /* renamed from: w, reason: collision with root package name */
        public io.ktor.network.selector.k f400265w;

        /* renamed from: x, reason: collision with root package name */
        public int f400266x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f400267y;

        /* compiled from: CIOWriter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$1$timeout$1", f = "CIOWriter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.network.sockets.o$a$a, reason: collision with other inner class name */
        public static final class C11415a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
            public C11415a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                throw null;
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super G0> continuation) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                new SocketTimeoutException();
                throw null;
            }
        }

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            throw null;
        }

        @Override // Y41.p
        public final Object invoke(T1 t12, Continuation<? super G0> continuation) {
            throw null;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d4 -> B:45:0x00d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:50:0x00f6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C41573o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C41573o() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(a2 a2Var, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        throw null;
    }
}
