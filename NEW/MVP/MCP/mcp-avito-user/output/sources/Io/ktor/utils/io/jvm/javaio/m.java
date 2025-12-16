package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.X;
import io.ktor.utils.io.e2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1", f = "Reading.kt", i = {0, 0}, l = {61}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class m extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f401140q;

    /* renamed from: r, reason: collision with root package name */
    public int f401141r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.pool.b f401143t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InputStream f401144u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(io.ktor.utils.io.pool.b bVar, InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.f401143t = bVar;
        this.f401144u = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f401143t, this.f401144u, continuation);
        mVar.f401142s = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((m) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
        ByteBuffer byteBufferS2;
        e2 e2Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401141r;
        InputStream inputStream = this.f401144u;
        io.ktor.utils.io.pool.b bVar = this.f401143t;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var2 = (e2) this.f401142s;
            byteBufferS2 = bVar.S2();
            e2Var = e2Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferS2 = this.f401140q;
            e2Var = (e2) this.f401142s;
            try {
                C42729a0.b(obj);
            } finally {
                try {
                    return G0.f406611a;
                } finally {
                }
            }
        }
        while (true) {
            byteBufferS2.clear();
            int i13 = inputStream.read(byteBufferS2.array(), byteBufferS2.arrayOffset() + byteBufferS2.position(), byteBufferS2.remaining());
            if (i13 < 0) {
                break;
            }
            if (i13 != 0) {
                byteBufferS2.position(byteBufferS2.position() + i13);
                byteBufferS2.flip();
                X xA2 = e2Var.a();
                this.f401142s = e2Var;
                this.f401140q = byteBufferS2;
                this.f401141r = 1;
                if (xA2.k(byteBufferS2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
