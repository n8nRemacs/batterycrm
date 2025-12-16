package com.avito.android.item_map.view;

import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f173604l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(V v12) {
        super(1);
        this.f173604l = v12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        V v12 = this.f173604l;
        oVar2.b(v12.f173555K.getString(R.string.osm_tooltip_body));
        oVar2.d(v12.f173555K.getString(R.string.osm_tooltip_button));
        oVar2.c(new com.avito.android.imv_similiar_adverts.h(v12, 8));
        return G0.f406611a;
    }
}
