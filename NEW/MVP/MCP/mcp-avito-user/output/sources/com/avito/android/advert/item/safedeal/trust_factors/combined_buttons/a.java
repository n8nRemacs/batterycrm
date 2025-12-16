package com.avito.android.advert.item.safedeal.trust_factors.combined_buttons;

import TV0.g;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.Z0;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;

/* compiled from: CombinedButtonsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/a;", "LTV0/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/h;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/CombinedButtonsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<h, CombinedButtonsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f79079a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z0 f79080b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f79081c = new g.a<>(R.layout.advert_details_combined_buttons_item, com.avito.android.advert.item.safedeal.trust_factors.utils.c.a(new C2333a()));

    /* compiled from: CombinedButtonsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/safedeal/trust_factors/i;", "tooltipHelper", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/avito/android/advert/item/safedeal/trust_factors/i;)Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.a$a, reason: collision with other inner class name */
    public static final class C2333a extends N implements q<ViewGroup, View, i, h> {
        public C2333a() {
            super(3);
        }

        @Override // Y41.q
        public final h invoke(ViewGroup viewGroup, View view, i iVar) {
            View view2 = view;
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.combined_buttons_container);
            Z0 z02 = a.this.f79080b;
            z02.getClass();
            n<Object> nVar = Z0.f67595D[25];
            return new h(view2, constraintLayout, iVar, ((Boolean) z02.f67597B.a().invoke()).booleanValue());
        }
    }

    @Inject
    public a(@k e eVar, @k Z0 z02) {
        this.f79079a = eVar;
        this.f79080b = z02;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f79079a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f79081c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CombinedButtonsItem;
    }
}
