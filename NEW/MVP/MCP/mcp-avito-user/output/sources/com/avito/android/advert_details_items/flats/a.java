package com.avito.android.advert_details_items.flats;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/flats/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/flats/f;", "Lcom/avito/android/advert_details_items/flats/AdvertDetailsFlatsItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsFlatsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f84669a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f84670b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43617a f84671c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f84672d = new g.a<>(R.layout.advert_details_flats, new C2514a());

    /* compiled from: AdvertDetailsFlatsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/flats/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/flats/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.flats.a$a, reason: collision with other inner class name */
    public static final class C2514a extends N implements p<ViewGroup, View, g> {
        public C2514a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            return new g(view2, false, false, false, aVar.f84670b, aVar.f84671c.x().invoke().booleanValue(), 12, null);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.advert_core.advert.k kVar, @k C43617a c43617a) {
        this.f84669a = cVar;
        this.f84670b = kVar;
        this.f84671c = c43617a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f84669a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f84672d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsFlatsItem) {
            AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) aVar;
            if (!advertDetailsFlatsItem.f84662j && !advertDetailsFlatsItem.f84663k && !advertDetailsFlatsItem.f84667o) {
                return true;
            }
        }
        return false;
    }
}
