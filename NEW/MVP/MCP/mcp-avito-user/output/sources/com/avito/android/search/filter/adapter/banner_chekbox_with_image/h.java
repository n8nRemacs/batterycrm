package com.avito.android.search.filter.adapter.banner_chekbox_with_image;

import Cp0.C13337a;
import Y41.l;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BannerCheckBoxWithImagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13337a f261973l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f261974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C13337a c13337a, i iVar) {
        super(1);
        this.f261973l = c13337a;
        this.f261974m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C13337a c13337a = this.f261973l;
        this.f261974m.f261975b.accept(new C13337a(c13337a.f2687b, c13337a.f2688c, c13337a.f2689d, zBooleanValue, c13337a.f2691f, c13337a.f2692g, c13337a.f2693h, c13337a.f2694i));
        return G0.f406611a;
    }
}
