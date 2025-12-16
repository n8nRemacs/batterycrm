package com.avito.android.cart_similar_items.konveyor.beduin;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/beduin/a;", "LTV0/b;", "Lcom/avito/android/cart_similar_items/konveyor/beduin/g;", "Lcom/avito/android/cart_similar_items/konveyor/beduin/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<g, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f115815a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f115816b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f115817c = new g.a<>(R.layout.cart_similar_items_beduin_item, new C3376a());

    /* compiled from: BeduinBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/cart_similar_items/konveyor/beduin/BeduinViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_similar_items.konveyor.beduin.a$a, reason: collision with other inner class name */
    public static final class C3376a extends N implements p<ViewGroup, View, BeduinViewImpl> {
        public C3376a() {
            super(2);
        }

        @Override // Y41.p
        public final BeduinViewImpl invoke(ViewGroup viewGroup, View view) {
            return new BeduinViewImpl((RecyclerView) view, a.this.f115816b.a(Integer.valueOf(y6.b(24))));
        }
    }

    @Inject
    public a(@k d dVar, @k InterfaceC25659b interfaceC25659b) {
        this.f115815a = dVar;
        this.f115816b = interfaceC25659b;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f115815a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f115817c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
