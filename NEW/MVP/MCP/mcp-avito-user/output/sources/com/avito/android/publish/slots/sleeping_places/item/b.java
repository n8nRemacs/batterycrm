package com.avito.android.publish.slots.sleeping_places.item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SleepingPlacesSlotItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/b;", "LTV0/b;", "Lcom/avito/android/publish/slots/sleeping_places/item/i;", "Lcom/avito/android/publish/slots/sleeping_places/item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<i, com.avito.android.publish.slots.sleeping_places.item.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f244879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q1 f244880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f244881c;

    /* compiled from: SleepingPlacesSlotItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LTV0/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.konveyor.adapter.b> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            Q1 q12 = b.this.f244880b;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[83];
            return ((Boolean) q12.f67507q0.a().invoke()).booleanValue() ? new o(view2) : new l(view2);
        }
    }

    @Inject
    public b(@Y61.k e eVar, @Y61.k Q1 q12) {
        this.f244879a = eVar;
        this.f244880b = q12;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[83];
        this.f244881c = new g.a<>(((Boolean) q12.f67507q0.a().invoke()).booleanValue() ? R.layout.sleeping_places_slot_layout_redesigned : R.layout.sleeping_places_slot_layout_legacy, new a());
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f244879a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f244881c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.publish.slots.sleeping_places.item.a;
    }
}
