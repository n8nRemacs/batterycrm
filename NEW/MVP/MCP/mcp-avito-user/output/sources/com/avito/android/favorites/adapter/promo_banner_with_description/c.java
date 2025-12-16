package com.avito.android.favorites.adapter.promo_banner_with_description;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoBannerRecallWithDescriptionPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "closeReason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f156774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PromoBannerRecallWithDescriptionItem f156775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem) {
        super(1);
        this.f156774l = gVar;
        this.f156775m = promoBannerRecallWithDescriptionItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        g gVar = this.f156774l;
        String str2 = this.f156775m.f156760b;
        gVar.f156780b.U4(str2, str);
        return G0.f406611a;
    }
}
