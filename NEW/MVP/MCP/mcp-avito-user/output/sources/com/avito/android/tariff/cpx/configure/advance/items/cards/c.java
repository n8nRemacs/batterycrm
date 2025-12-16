package com.avito.android.tariff.cpx.configure.advance.items.cards;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxConfigureAdvanceCardsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/c;", "LTV0/b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/j;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.b<j, b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f295656a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<w> f295657b = new g.a<>(R.layout.cpx_configure_advance_cards_item, a.f295658l);

    /* compiled from: CpxConfigureAdvanceCardsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/w;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff/cpx/configure/advance/items/cards/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, w> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f295658l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final w invoke(ViewGroup viewGroup, View view) {
            return new w(view);
        }
    }

    @Inject
    public c(@Y61.k e eVar) {
        this.f295656a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f295656a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<w> b() {
        return this.f295657b;
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
