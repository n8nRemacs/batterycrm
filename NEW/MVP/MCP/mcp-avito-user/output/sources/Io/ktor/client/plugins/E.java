package io.ktor.client.plugins;

import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.C41528k;
import io.ktor.http.C41529k0;
import io.ktor.http.InterfaceC41525i0;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: HttpPlainText.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/e;", "", "Lio/ktor/client/request/d0;", "content", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/util/pipeline/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class E extends SuspendLambda implements Y41.q<io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0>, Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f399013q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ io.ktor.util.pipeline.e f399014r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f399015s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D f399016t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(D d12, Continuation<? super E> continuation) {
        super(3, continuation);
        this.f399016t = d12;
    }

    @Override // Y41.q
    public final Object invoke(io.ktor.util.pipeline.e<Object, io.ktor.client.request.d0> eVar, Object obj, Continuation<? super G0> continuation) {
        E e12 = new E(this.f399016t, continuation);
        e12.f399014r = eVar;
        e12.f399015s = obj;
        return e12.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C41524i c41524i;
        Charset charsetA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399013q;
        if (i12 == 0) {
            C42729a0.b(obj);
            io.ktor.util.pipeline.e eVar = this.f399014r;
            Object obj2 = this.f399015s;
            io.ktor.client.request.d0 d0Var = (io.ktor.client.request.d0) eVar.f400528b;
            D d12 = this.f399016t;
            d12.getClass();
            C41519f0.f400005a.getClass();
            String str = C41519f0.f400007c;
            io.ktor.http.U u12 = d0Var.f399709c;
            if (u12.h(str) == null) {
                org.slf4j.a aVar = I.f399021a;
                StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
                String str2 = d12.f399009c;
                sb2.append(str2);
                sb2.append(" to ");
                sb2.append(d0Var.f399707a);
                aVar.e(sb2.toString());
                u12.k(str2);
                List<String> listG = u12.g(str);
                listG.clear();
                listG.add(str2);
            }
            if (!(obj2 instanceof String)) {
                return G0.f406611a;
            }
            TContext tcontext = eVar.f400528b;
            C41524i c41524iC = C41529k0.c((InterfaceC41525i0) tcontext);
            if (c41524iC != null) {
                C41524i.h.f400040a.getClass();
                if (!kotlin.jvm.internal.L.f(c41524iC.f400033d, C41524i.h.f400041b.f400033d)) {
                    return G0.f406611a;
                }
            }
            io.ktor.client.request.d0 d0Var2 = (io.ktor.client.request.d0) tcontext;
            String str3 = (String) obj2;
            if (c41524iC == null) {
                C41524i.h.f400040a.getClass();
                c41524i = C41524i.h.f400041b;
            } else {
                c41524i = c41524iC;
            }
            if (c41524iC == null || (charsetA = C41528k.a(c41524iC)) == null) {
                charsetA = d12.f399008b;
            }
            I.f399021a.e("Sending request body to " + d0Var2.f399707a + " as text/plain with charset " + charsetA);
            CharBuffer charBuffer = W31.a.f17734a;
            io.ktor.http.content.w wVar = new io.ktor.http.content.w(str3, c41524i.c("charset", charsetA.name()), null, 4, null);
            this.f399014r = null;
            this.f399013q = 1;
            if (eVar.g(wVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
