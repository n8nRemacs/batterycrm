package com.avito.android.advert_stats.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PlotBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/k;", "LTV0/b;", "Lcom/avito/android/advert_stats/item/u;", "Lcom/avito/android/advert_stats/item/o;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28332k implements TV0.b<u, C28336o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28337p f86766a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86767b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f86768c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28333l f86769d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<v> f86770e = new g.a<>(R.layout.big_chart_item, new a());

    /* compiled from: PlotBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/item/v;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/item/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_stats.item.k$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, v> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final v invoke(ViewGroup viewGroup, View view) {
            C28332k c28332k = C28332k.this;
            return new v(c28332k.f86767b, view, c28332k.f86768c, c28332k.f86769d);
        }
    }

    public C28332k(@Y61.k InterfaceC28337p interfaceC28337p, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28333l interfaceC28333l) {
        this.f86766a = interfaceC28337p;
        this.f86767b = aVar;
        this.f86768c = aVar2;
        this.f86769d = interfaceC28333l;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86766a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<v> b() {
        return this.f86770e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C28336o;
    }
}
