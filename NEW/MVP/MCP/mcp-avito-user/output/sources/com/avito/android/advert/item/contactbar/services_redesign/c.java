package com.avito.android.advert.item.contactbar.services_redesign;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.contactbar.g;
import com.avito.android.advert.item.contactbar.h;
import com.avito.android.remote.model.BusinessServicesRedesignType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsServicesContactBarRedesignBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/contactbar/services_redesign/c;", "LTV0/b;", "Lcom/avito/android/advert/item/contactbar/g;", "Lcom/avito/android/advert/item/contactbar/AdvertDetailsContactBarItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.b<g, AdvertDetailsContactBarItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.contactbar.c f74908a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C29640d f74909b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f74910c = new g.a<>(R.layout.advert_details_services_contact_bar_redesign, new a());

    /* compiled from: AdvertDetailsServicesContactBarRedesignBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/contactbar/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/contactbar/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, true, true, c.this.f74909b.w().invoke().booleanValue());
        }
    }

    @Inject
    public c(@k com.avito.android.advert.item.contactbar.c cVar, @k C29640d c29640d) {
        this.f74908a = cVar;
        this.f74909b = c29640d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74908a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f74910c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsContactBarItem) {
            if (((AdvertDetailsContactBarItem) aVar).f74869k == BusinessServicesRedesignType.GROUP_B) {
                return true;
            }
        }
        return false;
    }
}
