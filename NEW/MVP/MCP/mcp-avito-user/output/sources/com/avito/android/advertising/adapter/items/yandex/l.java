package com.avito.android.advertising.adapter.items.yandex;

import TV0.g;
import Y41.p;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: YandexRichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/yandex/l;", "LTV0/b;", "LHb/d;", "Lcom/avito/android/advertising/adapter/items/yandex/YandexBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements TV0.b<Hb.d, YandexBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f87755a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<Hb.e> f87756b = new g.a<>(R.layout.yandex_ad, a.f87757l);

    /* compiled from: YandexRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LHb/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LHb/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, Hb.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87757l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Hb.e invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            Hb.e eVar = new Hb.e(view, AdStyle.f88542g);
            Hb.c cVar = eVar.f7329c;
            cVar.getClass();
            e.a.h(cVar);
            return eVar;
        }
    }

    @Inject
    public l(@Y61.k i iVar) {
        this.f87755a = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87755a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<Hb.e> b() {
        return this.f87756b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof YandexBannerItem) && ((YandexBannerItem) aVar).getDisplayType().isInformative();
    }
}
