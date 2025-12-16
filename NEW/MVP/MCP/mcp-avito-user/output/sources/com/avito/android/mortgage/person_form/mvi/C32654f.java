package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$handlePolling$1", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32654f extends SuspendLambda implements Y41.p<PersonFormInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f201224q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G00.c> f201225r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C32649a f201226s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32654f(Y41.a<G00.c> aVar, C32649a c32649a, Continuation<? super C32654f> continuation) {
        super(2, continuation);
        this.f201225r = aVar;
        this.f201226s = c32649a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32654f c32654f = new C32654f(this.f201225r, this.f201226s, continuation);
        c32654f.f201224q = obj;
        return c32654f;
    }

    @Override // Y41.p
    public final Object invoke(PersonFormInternalAction personFormInternalAction, Continuation<? super G0> continuation) {
        return ((C32654f) create(personFormInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PersonFormInternalAction personFormInternalAction = (PersonFormInternalAction) this.f201224q;
        G00.c cVarInvoke = this.f201225r.invoke();
        if (cVarInvoke.f6144b.length() > 0) {
            this.f201226s.f200896b.c(cVarInvoke.f6144b, cVarInvoke.f6145c, cVarInvoke.c(), personFormInternalAction);
        }
        return G0.f406611a;
    }
}
