package com.avito.android.serp.adapter.vertical_main.featured.navigation.tabs;

import Y41.l;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedNavigation;
import com.avito.android.serp.adapter.vertical_main.featured.navigation.FeaturedTabsItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeaturedTabsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "tabPosition", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f272920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FeaturedTabsItem f272921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f272922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f272923o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12, FeaturedTabsItem featuredTabsItem, f fVar, int i13) {
        super(1);
        this.f272920l = i12;
        this.f272921m = featuredTabsItem;
        this.f272922n = fVar;
        this.f272923o = i13;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        int i12 = this.f272920l;
        if (i12 != iIntValue) {
            FeaturedTabsItem featuredTabsItem = this.f272921m;
            FeaturedNavigation featuredNavigation = featuredTabsItem.f272881c.get(i12);
            FeaturedNavigation featuredNavigation2 = featuredTabsItem.f272881c.get(iIntValue);
            f fVar = this.f272922n;
            fVar.f272925c.K5(featuredNavigation2.getF272877b());
            d.a.a(fVar.f272924b, Integer.valueOf(this.f272923o), featuredNavigation.getF272879d().f272873b, featuredNavigation2.getF272877b(), null, null, null, null, featuredTabsItem.f272892n, 120);
        }
        return G0.f406611a;
    }
}
