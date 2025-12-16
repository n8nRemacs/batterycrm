package com.avito.android.buy_contact.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.core.os.C22777e;
import com.avito.android.buy_contact.api.BuyContactResponse;
import com.avito.android.buy_contact_link.link.JobBuyContactLink;
import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BuyContactDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.buy_contact.deeplink.BuyContactDeeplinkHandler$doHandle$3$1", f = "BuyContactDeeplinkHandler.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f108775q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f108776r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ JobBuyContactLink f108777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, JobBuyContactLink jobBuyContactLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f108776r = eVar;
        this.f108777s = jobBuyContactLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f108776r, this.f108777s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f108775q;
        e eVar = this.f108776r;
        JobBuyContactLink jobBuyContactLink = this.f108777s;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = jobBuyContactLink.f108793b;
            this.f108775q = 1;
            obj = eVar.f108781g.a(str, this);
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
            eVar.f108784j = jobBuyContactLink.f108793b;
            TypedResult.Success success = (TypedResult.Success) typedResult;
            DeepLink deeplink = ((BuyContactResponse) success.getResult()).getDeeplink();
            if (deeplink == null) {
                deeplink = new NoMatchLink();
            }
            eVar.f108782h.r6(((BuyContactResponse) success.getResult()).getDeeplink() instanceof ContactsPackagesApplyLink ? C22777e.b(new Q("key_should_to_show_toast", Boolean.FALSE)) : null, deeplink, "request_key_buy_link");
        } else if (typedResult instanceof TypedResult.Error) {
            eVar.j(new JobBuyContactLink.b.a());
        }
        return G0.f406611a;
    }
}
