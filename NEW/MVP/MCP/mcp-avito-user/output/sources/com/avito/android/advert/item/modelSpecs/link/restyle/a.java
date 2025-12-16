package com.avito.android.advert.item.modelSpecs.link.restyle;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.modelSpecs.e;
import com.avito.android.advert.item.modelSpecs.link.ModelSpecsLinkItem;
import com.avito.android.advert.item.modelSpecs.link.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModelSpecsLinkItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/modelSpecs/link/restyle/a;", "LTV0/b;", "Lcom/avito/android/advert/item/modelSpecs/e;", "Lcom/avito/android/advert/item/modelSpecs/link/ModelSpecsLinkItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<e, ModelSpecsLinkItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.modelSpecs.a f77643a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<c> f77644b = new g.a<>(R.layout.advert_details_model_specs_link_restyle, C2292a.f77645l);

    /* compiled from: ModelSpecsLinkItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/modelSpecs/link/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/modelSpecs/link/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.modelSpecs.link.restyle.a$a, reason: collision with other inner class name */
    public static final class C2292a extends N implements p<ViewGroup, View, c> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2292a f77645l = new C2292a();

        public C2292a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view);
        }
    }

    @Inject
    public a(@k com.avito.android.advert.item.modelSpecs.a aVar) {
        this.f77643a = aVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f77643a;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f77644b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ModelSpecsLinkItem) && ((ModelSpecsLinkItem) aVar).f77636h;
    }
}
