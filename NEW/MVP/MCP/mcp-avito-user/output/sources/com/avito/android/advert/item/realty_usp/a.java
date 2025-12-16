package com.avito.android.advert.item.realty_usp;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyUspBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/a;", "LTV0/b;", "Lcom/avito/android/advert/item/realty_usp/m;", "Lcom/avito/android/advert/item/realty_usp/RealtyUspItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<m, RealtyUspItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f78391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f78392b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f78393c = new g.a<>(R.layout.advert_details_realty_usp_item, new C2321a());

    /* compiled from: RealtyUspBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/realty_usp/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/realty_usp/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.realty_usp.a$a, reason: collision with other inner class name */
    public static final class C2321a extends N implements Y41.p<ViewGroup, View, o> {
        public C2321a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view, a.this.f78392b);
        }
    }

    @Inject
    public a(@Y61.k g gVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f78391a = gVar;
        this.f78392b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f78391a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f78393c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof RealtyUspItem;
    }
}
