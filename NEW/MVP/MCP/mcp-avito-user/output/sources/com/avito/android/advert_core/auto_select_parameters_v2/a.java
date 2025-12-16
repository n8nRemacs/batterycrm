package com.avito.android.advert_core.auto_select_parameters_v2;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l9.InterfaceC43601a;

/* compiled from: AutoSelectParametersV2Blueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/a;", "LTV0/b;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/g;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/AutoSelectParametersV2Item;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, AutoSelectParametersV2Item> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f82946a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f82947b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f82948c = new g.a<>(R.layout.auto_select_parameters_item_v2, new C2459a());

    /* compiled from: AutoSelectParametersV2Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/auto_select_parameters_v2/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/auto_select_parameters_v2/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.auto_select_parameters_v2.a$a, reason: collision with other inner class name */
    public static final class C2459a extends N implements p<ViewGroup, View, h> {
        public C2459a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f82947b);
        }
    }

    @Inject
    public a(@k c cVar, @InterfaceC43601a @k com.avito.konveyor.a aVar) {
        this.f82946a = cVar;
        this.f82947b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f82946a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f82948c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AutoSelectParametersV2Item;
    }
}
