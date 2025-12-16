package com.avito.android.advert.item.similars_button;

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

/* compiled from: AdvertDetailsSimilarsButtonBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/similars_button/c;", "LTV0/b;", "Lcom/avito/android/advert/item/similars_button/a;", "Lcom/avito/android/advert/item/similars_button/AdvertDetailsSimilarsButtonItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.b<com.avito.android.advert.item.similars_button.a, AdvertDetailsSimilarsButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f80350a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<b> f80351b = new g.a<>(R.layout.advert_details_similars_button, a.f80352l);

    /* compiled from: AdvertDetailsSimilarsButtonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/similars_button/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/similars_button/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f80352l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b(view);
        }
    }

    @Inject
    public c(@k e eVar) {
        this.f80350a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f80350a;
    }

    @Override // TV0.b
    @k
    public final g.a<b> b() {
        return this.f80351b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsSimilarsButtonItem;
    }
}
