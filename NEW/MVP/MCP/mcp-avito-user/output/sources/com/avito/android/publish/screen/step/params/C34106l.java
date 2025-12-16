package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import Ju.InterfaceC14249c;
import com.avito.android.R;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.sx_address.SxAddressAddResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: PublishDetailsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.params.PublishDetailsDeeplinkHandlerImpl$observeSxAddAddressDeeplinkResult$3", f = "PublishDetailsDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.publish.screen.step.params.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34106l extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f241323q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f241324r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34106l(p pVar, Continuation<? super C34106l> continuation) {
        super(2, continuation);
        this.f241324r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34106l c34106l = new C34106l(this.f241324r, continuation);
        c34106l.f241323q = obj;
        return c34106l;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((C34106l) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f241323q).f413261b;
        boolean z12 = interfaceC14249c instanceof SxAddressAddResult.Failure;
        p pVar = this.f241324r;
        if (z12) {
            ((PublishDetailsFragment.k) pVar.f241523h).invoke(new InterfaceC14065a.d.u(pVar.f241516a.requireContext().getString(R.string.address_error)));
            return G0.f406611a;
        }
        SxAddressAddResult.Success success = interfaceC14249c instanceof SxAddressAddResult.Success ? (SxAddressAddResult.Success) interfaceC14249c : null;
        if (success == null) {
            return G0.f406611a;
        }
        SxAddressAddResult.Success.PublishValue publishValue = success.f292526c;
        if (publishValue != null) {
            ((PublishDetailsFragment.k) pVar.f241523h).invoke(new InterfaceC14065a.d.w(pVar.f241516a.requireContext().getString(R.string.seller_add_address_success)));
            boolean zBe = pVar.f241520e.Be();
            com.avito.android.details.b bVar = pVar.f241521f;
            if (zBe) {
                bVar.v(p.a(publishValue, pVar));
            } else {
                bVar.S(p.a(publishValue, pVar));
            }
        }
        return G0.f406611a;
    }
}
