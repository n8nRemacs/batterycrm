package com.avito.android.service_booking_user_profile.view.mvi;

import com.avito.android.service_booking_user_profile.view.mvi.entity.ServiceBookingBlockState;
import eu0.InterfaceC40158a;
import eu0.InterfaceC40160c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingBlockActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu0/a$a;", "action", "Lkotlinx/coroutines/flow/i;", "Leu0/c;", "<anonymous>", "(Leu0/a$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.mvi.ServiceBookingBlockActor$processOpenChanges$1", f = "ServiceBookingBlockActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC40158a.C11111a, Continuation<? super InterfaceC43160i<? extends InterfaceC40160c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f278268q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f278269r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ServiceBookingBlockState> f278270s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f278269r = aVar2;
        this.f278270s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f278270s, this.f278269r, continuation);
        hVar.f278268q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC40158a.C11111a c11111a, Continuation<? super InterfaceC43160i<? extends InterfaceC40160c>> continuation) {
        return ((h) create(c11111a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f278269r.b((InterfaceC40158a.C11111a) this.f278268q, this.f278270s.invoke());
    }
}
