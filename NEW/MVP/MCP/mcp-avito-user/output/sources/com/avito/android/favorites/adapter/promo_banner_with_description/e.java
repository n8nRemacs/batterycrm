package com.avito.android.favorites.adapter.promo_banner_with_description;

import Y41.l;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoBannerRecallWithDescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "variants", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f156777l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PromoBannerRecallWithDescriptionItem f156778m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem) {
        super(1);
        this.f156777l = gVar;
        this.f156778m = promoBannerRecallWithDescriptionItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        g gVar = this.f156777l;
        String str = this.f156778m.f156760b;
        gVar.f156780b.V(str, list);
        return G0.f406611a;
    }
}
