package com.avito.android.code_check.phone_request;

import Ro.InterfaceC15066a;
import com.avito.android.code_check.phone_request.PhoneRequestFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PhoneRequestFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_check.phone_request.PhoneRequestFragment$setupCallbacks$4", f = "PhoneRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class h extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ PhoneRequestFragment f119084q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PhoneRequestFragment phoneRequestFragment, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f119084q = phoneRequestFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f119084q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((h) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
        PhoneRequestFragment phoneRequestFragment = this.f119084q;
        phoneRequestFragment.z5().accept(new InterfaceC15066a.c(To.c.a(phoneRequestFragment.x5().getDeformattedText()), null));
        return G0.f406611a;
    }
}
