package io.ktor.serialization.kotlinx.json;

import Y41.p;
import Y61.l;
import io.ktor.serialization.kotlinx.n;
import io.ktor.utils.io.W0;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.r;
import kotlin.reflect.y;
import kotlin.sequences.InterfaceC43030m;
import kotlinx.coroutines.T;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.internal.A;
import kotlinx.serialization.json.internal.Q;

/* compiled from: JsonExtensionsJvm.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/sequences/m;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlin/sequences/m;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super InterfaceC43030m<? extends Object>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W0 f400347q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U31.b f400348r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC43443a f400349s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(W0 w02, U31.b bVar, AbstractC43443a abstractC43443a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f400347q = w02;
        this.f400348r = bVar;
        this.f400349s = abstractC43443a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f400347q, this.f400348r, this.f400349s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super InterfaceC43030m<? extends Object>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InputStream inputStreamB = io.ktor.utils.io.jvm.javaio.b.b(this.f400347q);
        r rVar = this.f400348r.f16156c.D().get(0).f410466b;
        U31.b bVar = new U31.b((kotlin.reflect.d) rVar.getF406862b(), y.d(rVar), rVar);
        AbstractC43443a abstractC43443a = this.f400349s;
        return Q.a(abstractC43443a, new A(inputStreamB), n.c(abstractC43443a.f412956b, bVar), DecodeSequenceMode.f412945d);
    }
}
