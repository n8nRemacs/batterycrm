package com.avito.android.select.new_metro.compose;

import android.content.Context;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectMetroScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<ParcelableItem> f265965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f265966m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f265967n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f265968o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroListOutputTypeItem.OutputType, G0> f265969p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f265970q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroStationItem, G0> f265971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroLineItem, G0> f265972s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroFilterItem, G0> f265973t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(List<? extends ParcelableItem> list, boolean z12, Y41.p<? super MetroSelectedStationsItem, ? super String, G0> pVar, Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar2, Y41.l<? super MetroListOutputTypeItem.OutputType, G0> lVar, Context context, Y41.l<? super MetroStationItem, G0> lVar2, Y41.l<? super MetroLineItem, G0> lVar3, Y41.l<? super MetroFilterItem, G0> lVar4) {
        super(1);
        this.f265965l = list;
        this.f265966m = z12;
        this.f265967n = pVar;
        this.f265968o = pVar2;
        this.f265969p = lVar;
        this.f265970q = context;
        this.f265971r = lVar2;
        this.f265972s = lVar3;
        this.f265973t = lVar4;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        for (ParcelableItem parcelableItem : this.f265965l) {
            if (parcelableItem instanceof MetroSelectedStationsItem) {
                m0Var2.c("selected_stations", "selected_stations", new C22096n(2109181474, new C((MetroSelectedStationsItem) parcelableItem, this.f265967n, this.f265968o), true));
            } else if (parcelableItem instanceof MetroListOutputTypeItem) {
                m0Var2.c("chips", "chips", new C22096n(-1768084391, new E((MetroListOutputTypeItem) parcelableItem, this.f265969p, this.f265970q), true));
            } else if (parcelableItem instanceof MetroStationItem) {
                m0Var2.c("station" + ((MetroStationItem) parcelableItem).f266202e, "station", new C22096n(689400602, new F(this.f265971r, (MetroStationItem) parcelableItem), true));
            } else if (parcelableItem instanceof MetroLineItem) {
                m0Var2.c("line" + ((MetroLineItem) parcelableItem).f266183d, "line", new C22096n(-1148081701, new G(this.f265972s, (MetroLineItem) parcelableItem), true));
            } else if (parcelableItem instanceof MetroFilterItem) {
                m0Var2.c("filter" + ((MetroFilterItem) parcelableItem).f266179e, "filter", new C22096n(1309403292, new H(this.f265973t, (MetroFilterItem) parcelableItem), true));
            }
        }
        if (this.f265966m) {
            C34634a.f266077a.getClass();
            m0Var2.c(SpacerAttribute.ATTRIBUTE_TYPE, SpacerAttribute.ATTRIBUTE_TYPE, C34634a.f266078b);
        }
        return G0.f406611a;
    }
}
