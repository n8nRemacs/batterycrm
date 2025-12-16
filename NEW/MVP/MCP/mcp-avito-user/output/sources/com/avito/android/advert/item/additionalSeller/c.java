package com.avito.android.advert.item.additionalSeller;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.advert.item.additionalSeller.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdditionalSellerButtonNewDevelopmentBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/c;", "LTV0/b;", "Lcom/avito/android/advert/item/additionalSeller/l;", "Lcom/avito/android/advert/item/additionalSeller/AdditionalSellerButtonItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.b<l, AdditionalSellerButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f72559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l.b f72560b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C29640d f72561c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f72562d = new g.a<>(R.layout.advert_details_additional_seller_button_medium, new a());

    /* compiled from: AdditionalSellerButtonNewDevelopmentBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/additionalSeller/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/additionalSeller/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, n> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            c cVar = c.this;
            return new n(view, cVar.f72560b, cVar.f72561c);
        }
    }

    @Inject
    public c(@Y61.k e eVar, @Y61.k l.b bVar, @Y61.k C29640d c29640d) {
        this.f72559a = eVar;
        this.f72560b = bVar;
        this.f72561c = c29640d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f72559a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f72562d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdditionalSellerButtonItem) {
            AdditionalSellerButtonItem additionalSellerButtonItem = (AdditionalSellerButtonItem) aVar;
            if (additionalSellerButtonItem.f72537h && additionalSellerButtonItem.f72539j) {
                return true;
            }
        }
        return false;
    }
}
