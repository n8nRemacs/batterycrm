package com.avito.android.advert_stats.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: WeekItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/P;", "LTV0/b;", "Lcom/avito/android/advert_stats/item/Q;", "Lcom/avito/android/advert_stats/item/O;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P implements TV0.b<Q, O> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f86708a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f86709b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f86710c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<S> f86711d = new g.a<>(R.layout.week_item, new a());

    /* compiled from: WeekItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/item/S;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/item/S;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, S> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final S invoke(ViewGroup viewGroup, View view) {
            P p12 = P.this;
            return new S(view, p12.f86710c, p12.f86709b);
        }
    }

    public P(@Y61.k T t12, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2) {
        this.f86708a = t12;
        this.f86709b = aVar;
        this.f86710c = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86708a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<S> b() {
        return this.f86711d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof O;
    }
}
