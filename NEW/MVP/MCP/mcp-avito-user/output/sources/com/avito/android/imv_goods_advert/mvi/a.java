package com.avito.android.imv_goods_advert.mvi;

import Y41.p;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import com.avito.android.remote.model.AdvertDetails;
import com.google.gson.Gson;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvGoodsAdvertActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_goods_advert.mvi.ImvGoodsAdvertActor$Companion$getAdvert$1", f = "ImvGoodsAdvertActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ImvGoodsAdvertInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f170536q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f170537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Gson f170538s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImvGoodsAdvertParams f170539t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Gson gson, ImvGoodsAdvertParams imvGoodsAdvertParams, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f170538s = gson;
        this.f170539t = imvGoodsAdvertParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f170538s, this.f170539t, continuation);
        aVar.f170537r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ImvGoodsAdvertInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f170536q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f170537r;
            ImvGoodsAdvertInternalAction.ShowContent showContent = new ImvGoodsAdvertInternalAction.ShowContent((AdvertDetails) this.f170538s.d(AdvertDetails.class, this.f170539t.f170311b));
            this.f170536q = 1;
            if (interfaceC43172j.emit(showContent, this) == coroutine_suspended) {
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
