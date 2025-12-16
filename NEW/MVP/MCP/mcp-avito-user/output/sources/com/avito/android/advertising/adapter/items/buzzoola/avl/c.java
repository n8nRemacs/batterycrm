package com.avito.android.advertising.adapter.items.buzzoola.avl;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.CommercialBuzzoolaAVLItem;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaAvlType;
import com.avito.android.advertising.ui.AdStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaAvlNativeBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/avl/c;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/d;", "Lcom/avito/android/advertising/CommercialBuzzoolaAVLItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.b<com.avito.android.advertising.ui.buzzoola.d, CommercialBuzzoolaAVLItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f87268a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> f87269b = new g.a<>(R.layout.buzzoola_avl_native_ad, a.f87270l);

    /* compiled from: BuzzoolaAvlNativeBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87270l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.e invoke(ViewGroup viewGroup, View view) {
            com.avito.android.advertising.ui.buzzoola.e eVar = new com.avito.android.advertising.ui.buzzoola.e(view, AdStyle.f88543h);
            com.avito.android.advertising.ui.buzzoola.b bVar = eVar.f88583b;
            bVar.getClass();
            bVar.e20(R.dimen.ad_avl_corner_radius);
            return eVar;
        }
    }

    @Inject
    public c(@k h hVar) {
        this.f87268a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87268a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.advertising.ui.buzzoola.e> b() {
        return this.f87269b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof CommercialBuzzoolaAVLItem) && ((CommercialBuzzoolaAVLItem) aVar).f86894c.f88206l == BuzzoolaAvlType.f88193c;
    }
}
