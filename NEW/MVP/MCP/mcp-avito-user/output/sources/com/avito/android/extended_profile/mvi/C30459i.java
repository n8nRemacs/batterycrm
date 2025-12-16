package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import eA.InterfaceC39978a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleWidgetAction$4", f = "ExtendedProfileActor.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30459i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150313q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150314r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30451a f150315s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oB.k f150316t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30459i(C30451a c30451a, Continuation continuation, oB.k kVar) {
        super(2, continuation);
        this.f150315s = c30451a;
        this.f150316t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30459i c30459i = new C30459i(this.f150315s, continuation, this.f150316t);
        c30459i.f150314r = obj;
        return c30459i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30459i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150313q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f150314r;
            InterfaceC39978a interfaceC39978a = this.f150315s.f150081o;
            oB.g gVar = (oB.g) this.f150316t;
            interfaceC39978a.x(gVar.f419511c);
            ExtendedProfileInternalAction.OnCarouselScrollChanged onCarouselScrollChanged = new ExtendedProfileInternalAction.OnCarouselScrollChanged(gVar.f419510b, gVar.f419512d);
            this.f150313q = 1;
            if (interfaceC43172j.emit(onCarouselScrollChanged, this) == coroutine_suspended) {
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
