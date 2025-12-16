package com.avito.android.autoteka.items.choosingProduct;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FullscreenChoosingProductBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/i;", "LTV0/b;", "Lcom/avito/android/autoteka/items/choosingProduct/n;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$ChoosingProductState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements TV0.b<n, ChoosingTypePurchaseState.ChoosingProductState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f96724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f96725b = new g.a<>(R.layout.autoteka_fullscreen_choosing_product_item, a.f96726l);

    /* compiled from: FullscreenChoosingProductBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/autoteka/items/choosingProduct/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/autoteka/items/choosingProduct/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f96726l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    @Inject
    public i(@Y61.k l lVar) {
        this.f96724a = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f96724a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f96725b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ChoosingTypePurchaseState.ChoosingProductState;
    }
}
