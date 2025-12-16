package com.avito.android.serp.adapter.promo;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: PromoHeaderPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f270482l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PromoHeaderItem f270483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f270484n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f270485o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, PromoHeaderItem promoHeaderItem, int i12, String str) {
        super(1);
        this.f270482l = kVar;
        this.f270483m = promoHeaderItem;
        this.f270484n = i12;
        this.f270485o = str;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        k kVar = this.f270482l;
        InterfaceC47691c.a.a(kVar.f270493c.get(), deepLink, null, 14);
        PromoHeaderItem promoHeaderItem = this.f270483m;
        Analytics analytics = promoHeaderItem.f270464k;
        d.a.a(kVar.f270492b, Integer.valueOf(this.f270484n), "entry_header_vertical", this.f270485o, null, null, null, promoHeaderItem.f270465l, analytics, 56);
        return G0.f406611a;
    }
}
