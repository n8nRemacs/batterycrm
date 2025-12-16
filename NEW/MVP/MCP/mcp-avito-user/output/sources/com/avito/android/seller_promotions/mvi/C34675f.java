package com.avito.android.seller_promotions.mvi;

import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import yn.C50271a;

/* compiled from: SellerPromotionsActor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lyn/a;", "changedItems", "Lkotlin/Function0;", "Lkotlin/G0;", "onError", "onSuccess", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "invoke", "(Ljava/util/List;LY41/a;LY41/a;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.seller_promotions.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34675f extends N implements Y41.q<List<? extends C50271a>, Y41.a<? extends G0>, Y41.a<? extends G0>, io.reactivex.rxjava3.core.z<SellerPromotionsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34670a f267996l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34675f(C34670a c34670a) {
        super(3);
        this.f267996l = c34670a;
    }

    @Override // Y41.q
    public final io.reactivex.rxjava3.core.z<SellerPromotionsInternalAction> invoke(List<? extends C50271a> list, Y41.a<? extends G0> aVar, Y41.a<? extends G0> aVar2) {
        return kotlinx.coroutines.rx3.y.b(C43175k.I(this.f267996l.f267929d.a(), C43175k.G(new C34674e(this.f267996l, list, aVar, aVar2, null))));
    }
}
