package com.avito.android.travel_seller_banners;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yF0.InterfaceC50107a;
import zF0.InterfaceC50455a;

/* compiled from: TravelSellerBannersInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LyF0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_seller_banners.TravelSellerBannersInteractorImpl$getBannerForPageAsFlow$1", f = "TravelSellerBannersInteractorImpl.kt", i = {0}, l = {39, 43, 47}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC50107a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f303294q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f303295r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f303296s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, Continuation continuation) {
        super(2, continuation);
        PageForBanner pageForBanner = PageForBanner.f303306b;
        this.f303296s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        PageForBanner pageForBanner = PageForBanner.f303306b;
        d dVar = new d(this.f303296s, continuation);
        dVar.f303295r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC50107a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f303294q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f303295r;
            InterfaceC50455a interfaceC50455a = this.f303296s.f303290b;
            PageForBanner pageForBanner = PageForBanner.f303306b;
            Page page = Page.SellerOrdersList;
            this.f303295r = interfaceC43172j;
            this.f303294q = 1;
            obj = interfaceC50455a.a(page, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f303295r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            AF0.a aVar = (AF0.a) ((TypedResult.Success) typedResult).getResult();
            i.f303305a.getClass();
            InterfaceC50107a.b bVar = new InterfaceC50107a.b(i.a(aVar));
            this.f303295r = null;
            this.f303294q = 2;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            V2.f318762a.f(apiExceptionA);
            InterfaceC50107a.C12895a c12895a = new InterfaceC50107a.C12895a(z.n(apiExceptionA));
            this.f303295r = null;
            this.f303294q = 3;
            if (interfaceC43172j.emit(c12895a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
