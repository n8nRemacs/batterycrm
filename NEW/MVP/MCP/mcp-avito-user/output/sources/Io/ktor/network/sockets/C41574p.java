package io.ktor.network.sockets;

import io.ktor.utils.io.a2;
import java.net.SocketTimeoutException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CIOWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/a2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/a2;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingImpl$1", f = "CIOWriter.kt", i = {0, 1, 1, 2, 2, 2}, l = {38, 51, 51}, m = "invokeSuspend", n = {"timeout", "timeout", "rc", "timeout", "rc", "$this$withTimeout$iv"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: io.ktor.network.sockets.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41574p extends SuspendLambda implements Y41.p<a2, Continuation<? super G0>, Object> {

    /* compiled from: CIOWriter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingImpl$1$timeout$1", f = "CIOWriter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.network.sockets.p$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        public a() {
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

    public C41574p() {
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
