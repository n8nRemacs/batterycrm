package io.ktor.serialization.kotlinx.json;

import Y41.p;
import Y61.l;
import io.ktor.utils.io.InterfaceC41649d1;
import java.nio.charset.Charset;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.serialization.KSerializer;

/* compiled from: KotlinxSerializationJsonExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/d1;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/d1;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class h extends SuspendLambda implements p<InterfaceC41649d1, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f400366q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f400367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f400368s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f400369t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ KSerializer<?> f400370u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Charset f400371v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Object obj, KSerializer<?> kSerializer, Charset charset, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f400368s = jVar;
        this.f400369t = obj;
        this.f400370u = kSerializer;
        this.f400371v = charset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f400368s, this.f400369t, this.f400370u, this.f400371v, continuation);
        hVar.f400367r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC41649d1 interfaceC41649d1, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC41649d1, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f400366q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41649d1 interfaceC41649d1 = (InterfaceC41649d1) this.f400367r;
            InterfaceC43160i interfaceC43160i = (InterfaceC43160i) this.f400369t;
            this.f400366q = 1;
            if (j.c(this.f400368s, interfaceC43160i, this.f400370u, this.f400371v, interfaceC41649d1, this) == coroutine_suspended) {
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
