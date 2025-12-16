package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.deeplink.C32591f;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageApplicationProxyDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.deeplink.MortgageApplicationProxyDeeplinkHandler$doHandle$1$1", f = "MortgageApplicationProxyDeeplinkHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32592g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198849q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32591f f198850r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationProxyLink f198851s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32592g(C32591f c32591f, MortgageApplicationProxyLink mortgageApplicationProxyLink, Continuation<? super C32592g> continuation) {
        super(2, continuation);
        this.f198850r = c32591f;
        this.f198851s = mortgageApplicationProxyLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32592g(this.f198850r, this.f198851s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C32592g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198849q;
        C32591f c32591f = this.f198850r;
        a.g gVar = c32591f.f198843g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(c32591f.d(), true);
            String str = this.f198851s.f198694b;
            this.f198849q = 1;
            obj = com.avito.android.mortgage.deeplink.domain.g.a(c32591f.f198842f, str, null, this, 6);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            DeepLink deepLink = (DeepLink) ((TypedResult.Success) typedResult).getResult();
            c32591f.i(C32591f.a.C5863a.f198848b, c32591f.f198846j, deepLink);
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            com.avito.android.error.z.n(C35936s.a(error.getError(), error.getCause())).toString();
            c32591f.f198844h.Y1(R.string.fail_to_open_application);
            c32591f.j(AbstractC14250d.b.f9170c);
        }
        gVar.g(c32591f.d(), false);
        return G0.f406611a;
    }
}
