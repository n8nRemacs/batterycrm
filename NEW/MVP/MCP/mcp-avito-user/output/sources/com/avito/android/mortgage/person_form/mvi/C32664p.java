package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$uploadIgnoreResult$1", f = "PersonFormActor.kt", i = {}, l = {458}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32664p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201293q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32649a f201294r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G00.c f201295s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32664p(G00.c cVar, C32649a c32649a, Continuation continuation) {
        super(2, continuation);
        this.f201294r = c32649a;
        this.f201295s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32664p(this.f201295s, this.f201294r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C32664p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201293q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.mortgage.person_form.mvi.domain.j jVar = this.f201294r.f200897c;
            G00.c cVar = this.f201295s;
            InterfaceC43160i<PersonFormInternalAction> interfaceC43160iB = jVar.b(cVar.f6144b, cVar.f6145c, cVar.f6146d, cVar.f6147e, cVar.c(), cVar.f6153k, false);
            this.f201293q = 1;
            if (C43175k.i(interfaceC43160iB, this) == coroutine_suspended) {
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
