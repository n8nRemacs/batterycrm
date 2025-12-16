package com.avito.android.extended_profile_selection_create.name.mvi;

import KA.a;
import Y41.p;
import com.avito.android.extended_profile_selection_create.name.mvi.entity.ExtendedProfileSetSelectionNameInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionNameActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/name/mvi/entity/ExtendedProfileSetSelectionNameInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.name.mvi.ExtendedProfileSetSelectionNameActor$process$4", f = "ExtendedProfileSetSelectionNameActor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151886q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f151887r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f151888s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KA.a f151889t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, KA.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f151888s = cVar;
        this.f151889t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f151888s, this.f151889t, continuation);
        aVar.f151887r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionNameInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151886q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f151887r;
            Z1<HA.g> z12 = this.f151888s.f151895b;
            HA.g value = z12.getValue();
            a.b bVar = (a.b) this.f151889t;
            z12.setValue(HA.g.a(value, null, null, bVar.f9337a, null, null, 59));
            ExtendedProfileSetSelectionNameInternalAction.IsPublicChange isPublicChange = new ExtendedProfileSetSelectionNameInternalAction.IsPublicChange(bVar.f9337a);
            this.f151886q = 1;
            if (interfaceC43172j.emit(isPublicChange, this) == coroutine_suspended) {
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
