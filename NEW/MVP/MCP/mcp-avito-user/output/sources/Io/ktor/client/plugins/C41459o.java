package io.ktor.client.plugins;

import io.ktor.utils.io.W0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.N0;

/* compiled from: DefaultTransformersJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "Lio/ktor/client/statement/e;", "Lio/ktor/client/call/b;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Lio/ktor/client/statement/e;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: io.ktor.client.plugins.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41459o extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b>, io.ktor.client.statement.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399599q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399600r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ io.ktor.client.statement.e f399601s;

    /* compiled from: DefaultTransformersJvm.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/client/plugins/o$a", "Ljava/io/InputStream;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.o$a */
    public static final class a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f399602b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> f399603c;

        public a(InputStream inputStream, io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar) {
            this.f399602b = inputStream;
            this.f399603c = eVar;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f399602b.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f399602b.close();
            io.ktor.client.statement.d dVar = this.f399603c.f400528b.f398806d;
            if (dVar == null) {
                dVar = null;
            }
            io.ktor.client.statement.h.b(dVar);
        }

        @Override // java.io.InputStream
        public final int read() {
            return this.f399602b.read();
        }

        @Override // java.io.InputStream
        public final int read(@Y61.k byte[] bArr, int i12, int i13) {
            return this.f399602b.read(bArr, i12, i13);
        }
    }

    public C41459o() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.e, io.ktor.client.call.b> eVar, io.ktor.client.statement.e eVar2, Continuation<? super G0> continuation) {
        C41459o c41459o = new C41459o(3, continuation);
        c41459o.f399600r = eVar;
        c41459o.f399601s = eVar2;
        return c41459o.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399599q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399600r;
            io.ktor.client.statement.e eVar2 = this.f399601s;
            U31.b bVar = eVar2.f399785a;
            Object obj2 = eVar2.f399786b;
            if (!(obj2 instanceof W0)) {
                return G0.f406611a;
            }
            if (kotlin.jvm.internal.L.f(bVar.f16154a, kotlin.jvm.internal.m0.f406844a.b(InputStream.class))) {
                io.ktor.client.statement.e eVar3 = new io.ktor.client.statement.e(bVar, new a(io.ktor.utils.io.jvm.javaio.b.a((W0) obj2, (N0) ((io.ktor.client.call.b) eVar.f400528b).getF401596i().get(N0.f410716u2)), eVar));
                this.f399600r = null;
                this.f399599q = 1;
                if (eVar.g(eVar3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
