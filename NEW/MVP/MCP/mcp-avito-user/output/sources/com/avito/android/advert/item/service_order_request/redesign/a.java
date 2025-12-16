package com.avito.android.advert.item.service_order_request.redesign;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.advert.item.service_order_request.c;
import com.avito.android.advert.item.service_order_request.j;
import com.avito.android.advert.item.service_order_request.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RedesignServiceOrderBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/redesign/a;", "LTV0/b;", "Lcom/avito/android/advert/item/service_order_request/j;", "Lcom/avito/android/advert/item/service_order_request/ServiceOrderRequestItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<j, ServiceOrderRequestItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f79948a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f79949b;

    /* compiled from: RedesignServiceOrderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/service_order_request/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/service_order_request/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.service_order_request.redesign.a$a, reason: collision with other inner class name */
    public static final class C2358a extends N implements p<ViewGroup, View, l> {
        public C2358a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(viewGroup, view, a.this.f79949b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f79948a = cVar;
        this.f79949b = aVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f79948a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.advert_details_service_order_request_redesign, new C2358a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ServiceOrderRequestItem) && ((ServiceOrderRequestItem) aVar).f79873f;
    }
}
