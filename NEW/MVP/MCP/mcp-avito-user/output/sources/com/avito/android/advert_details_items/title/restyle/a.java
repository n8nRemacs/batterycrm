package com.avito.android.advert_details_items.title.restyle;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.advert_details_items.title.c;
import com.avito.android.advert_details_items.title.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsTitleBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/title/restyle/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/title/f;", "Lcom/avito/android/advert_details_items/title/AdvertDetailsTitleItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsTitleItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f85750a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.advert_details_items.title.g> f85751b = new g.a<>(R.layout.advert_details_title_restyle, C2555a.f85752l);

    /* compiled from: AdvertDetailsTitleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/title/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/title/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.title.restyle.a$a, reason: collision with other inner class name */
    public static final class C2555a extends N implements p<ViewGroup, View, com.avito.android.advert_details_items.title.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2555a f85752l = new C2555a();

        public C2555a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advert_details_items.title.g invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.advert_details_items.title.g(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f85750a = cVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f85750a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.advert_details_items.title.g> b() {
        return this.f85751b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsTitleItem) {
            AdvertDetailsTitleItem advertDetailsTitleItem = (AdvertDetailsTitleItem) aVar;
            if (advertDetailsTitleItem.f85718g && !advertDetailsTitleItem.f85719h && !advertDetailsTitleItem.f85720i && !advertDetailsTitleItem.f85722k && !advertDetailsTitleItem.f85721j) {
                return true;
            }
        }
        return false;
    }
}
