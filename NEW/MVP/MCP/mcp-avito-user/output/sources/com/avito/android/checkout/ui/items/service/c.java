package com.avito.android.checkout.ui.items.service;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckoutServiceItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/ui/items/service/c;", "LTV0/b;", "Lcom/avito/android/checkout/ui/items/service/i;", "Lcom/avito/android/checkout/ui/items/service/b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.b<i, b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f118494a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f118495b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f118496c = new g.a<>(R.layout.checkout_service_item, new a());

    /* compiled from: CheckoutServiceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/checkout/ui/items/service/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/checkout/ui/items/service/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, c.this.f118495b);
        }
    }

    @Inject
    public c(@Y61.k e eVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f118494a = eVar;
        this.f118495b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f118494a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f118496c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof b;
    }
}
