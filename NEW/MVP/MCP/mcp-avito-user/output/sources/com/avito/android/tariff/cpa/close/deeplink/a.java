package com.avito.android.tariff.cpa.close.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.tariff.deeplink.TariffCpaCloseLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: TariffCpaCloseLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpa.close.deeplink.TariffCpaCloseLinkHandler$doHandle$1", f = "TariffCpaCloseLinkHandler.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f294222q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f294223r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f294223r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f294223r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f294222q;
        b bVar = this.f294223r;
        a.g gVar = bVar.f294225g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(bVar.d(), true);
            this.f294222q = 1;
            obj = bVar.f294226h.invoke(this);
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
        if (typedResult instanceof TypedResult.Error) {
            gVar.g(bVar.d(), false);
            TypedResult.Error error = (TypedResult.Error) typedResult;
            a.i.C4057a.d(bVar.f294227i, com.avito.android.printable_text.b.f(z.k(error.getError())), null, null, new f.c(error.getError()), 0, null, null, null, 2030);
            bVar.j(TariffCpaCloseLink.b.a.f297367b);
        } else if (typedResult instanceof TypedResult.Success) {
            gVar.g(bVar.d(), false);
            bVar.i(TariffCpaCloseLink.b.C9074b.f297368b, bVar.f294224f, ((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink());
        }
        return G0.f406611a;
    }
}
