package com.avito.android.advert_stats.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BarItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/b;", "LTV0/b;", "Lcom/avito/android/advert_stats/item/e;", "Lcom/avito/android/advert_stats/item/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_stats.item.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28323b implements TV0.b<InterfaceC28326e, C28322a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28325d f86728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<C28328g> f86729b = new g.a<>(R.layout.bar_item, a.f86730l);

    /* compiled from: BarItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_stats/item/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_stats/item/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_stats.item.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C28328g> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f86730l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C28328g invoke(ViewGroup viewGroup, View view) {
            return new C28328g(view);
        }
    }

    public C28323b(@Y61.k C28325d c28325d) {
        this.f86728a = c28325d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86728a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C28328g> b() {
        return this.f86729b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C28322a;
    }
}
