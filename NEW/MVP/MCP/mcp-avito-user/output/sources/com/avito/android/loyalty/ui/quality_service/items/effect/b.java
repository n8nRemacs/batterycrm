package com.avito.android.loyalty.ui.quality_service.items.effect;

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

/* compiled from: EffectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effect/b;", "LTV0/b;", "Lcom/avito/android/loyalty/ui/quality_service/items/effect/g;", "Lcom/avito/android/loyalty/ui/quality_service/items/effect/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TV0.b<g, com.avito.android.loyalty.ui.quality_service.items.effect.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f183816a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f183817b = new g.a<>(R.layout.item_effect, a.f183818l);

    /* compiled from: EffectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/loyalty/ui/quality_service/items/effect/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/loyalty/ui/quality_service/items/effect/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f183818l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public b(@k e eVar) {
        this.f183816a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f183816a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f183817b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.loyalty.ui.quality_service.items.effect.a;
    }
}
