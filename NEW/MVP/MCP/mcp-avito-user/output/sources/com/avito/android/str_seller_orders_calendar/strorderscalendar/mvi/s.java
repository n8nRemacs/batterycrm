package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yF0.InterfaceC50108b;

/* compiled from: StrOrdersCalendarBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.StrOrdersCalendarBootstrap$bannerInit$1", f = "StrOrdersCalendarBootstrap.kt", i = {0}, l = {71, 72}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrOrdersCalendarInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291145q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291146r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f291147s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f291147s = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f291147s, continuation);
        sVar.f291146r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrOrdersCalendarInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291145q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f291146r;
            InterfaceC50108b interfaceC50108b = this.f291147s.f291169f;
            PageForBanner pageForBanner = PageForBanner.f303306b;
            this.f291146r = interfaceC43172j;
            this.f291145q = 1;
            obj = interfaceC50108b.a(pageForBanner, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f291146r;
            C42729a0.b(obj);
        }
        StrOrdersCalendarInternalAction.BannerLoaded bannerLoaded = new StrOrdersCalendarInternalAction.BannerLoaded((BF0.a) obj);
        this.f291146r = null;
        this.f291145q = 2;
        if (interfaceC43172j.emit(bannerLoaded, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
