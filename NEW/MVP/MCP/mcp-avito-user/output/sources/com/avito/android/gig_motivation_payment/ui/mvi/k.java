package com.avito.android.gig_motivation_payment.ui.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_motivation_payment.GigMotivationPaymentRefreshDeeplink;
import com.avito.android.gig_motivation_payment.GigMotivationPaymentTypeDeeplink;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: MotivationPaymentBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentBootstrap$observeDeeplinkResult$1", f = "MotivationPaymentBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends MotivationPaymentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160255q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f160256r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f160256r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f160256r, continuation);
        kVar.f160255q = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends MotivationPaymentInternalAction>> continuation) {
        return ((k) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f160255q).f413261b;
        boolean z12 = interfaceC14249c instanceof com.avito.android.beduin.v2.page.m;
        l lVar = this.f160256r;
        if (z12) {
            lVar.getClass();
            return C43175k.G(new j(lVar, null));
        }
        if (interfaceC14249c instanceof GigMotivationPaymentTypeDeeplink.b.C4677b) {
            b.a.a(lVar.f160259c, ((GigMotivationPaymentTypeDeeplink.b.C4677b) interfaceC14249c).f160086b, null, null, 6);
            return C43175k.w();
        }
        if (interfaceC14249c instanceof GigMotivationPaymentTypeDeeplink.b.a) {
            return new C43210w(new MotivationPaymentInternalAction.e(((GigMotivationPaymentTypeDeeplink.b.a) interfaceC14249c).f160085b));
        }
        if (!(interfaceC14249c instanceof GigMotivationPaymentRefreshDeeplink.b.a)) {
            return C43175k.w();
        }
        lVar.getClass();
        return C43175k.G(new j(lVar, null));
    }
}
