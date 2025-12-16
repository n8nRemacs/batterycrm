package com.avito.android.advert_core.equipments.redesign;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RedesignedEquipmentsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/a;", "LTV0/b;", "Lcom/avito/android/advert_core/equipments/redesign/f;", "Lcom/avito/android/advert_core/equipments/redesign/EquipmentsItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, EquipmentsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f83481a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f83482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<g> f83483c = new g.a<>(R.layout.redesigned_equipments_block, new C2471a());

    /* compiled from: RedesignedEquipmentsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_core/equipments/redesign/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_core/equipments/redesign/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_core.equipments.redesign.a$a, reason: collision with other inner class name */
    public static final class C2471a extends N implements p<ViewGroup, View, g> {
        public C2471a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, a.this.f83482b);
        }
    }

    @Inject
    public a(@Y61.k d dVar, @Y61.k i iVar) {
        this.f83481a = dVar;
        this.f83482b = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f83481a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<g> b() {
        return this.f83483c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof EquipmentsItem;
    }
}
