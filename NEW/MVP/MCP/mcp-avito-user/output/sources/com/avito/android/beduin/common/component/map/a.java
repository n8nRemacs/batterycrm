package com.avito.android.beduin.common.component.map;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.map.BeduinMapComponentModel;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.developments_catalog.AmenityPin;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinMapComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/map/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/map/BeduinMapComponentModel;", "Lcom/avito/android/beduin/common/component/map/f;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinMapComponentModel, f> implements AvitoMap.MapClickListener, AvitoMap.MarkerClickListener {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101742e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinMapComponentModel f101743f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101744g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AvitoMapPoint f101745h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Object f101746i;

    /* compiled from: BeduinMapComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/map/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.map.a$a, reason: collision with other inner class name */
    public static final class C3050a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3050a f101747a = new C3050a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f101748b = Collections.singletonList("map");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinMapComponentModel> f101749c = BeduinMapComponentModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinMapComponentModel> S() {
            return f101749c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f101748b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinMapComponentModel beduinMapComponentModel, boolean z12) {
        this.f101742e = interfaceC15523b;
        this.f101743f = beduinMapComponentModel;
        this.f101744g = z12;
        this.f101745h = new AvitoMapPoint(beduinMapComponentModel.getCenter().getLatitude(), beduinMapComponentModel.getCenter().getLongitude(), null, 4, null);
        List<AmenityPin> pins = beduinMapComponentModel.getPins();
        C42784z0 c42784z0 = null;
        if (pins != null) {
            List<AmenityPin> list = pins;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (AmenityPin amenityPin : list) {
                String id2 = amenityPin.getId();
                String type = amenityPin.getType();
                Color color = amenityPin.getColor();
                arrayList.add(new MarkerItem.LitePin(id2, type, color != null ? Integer.valueOf(color.getValue()) : null, amenityPin.getTitle(), new LatLng(amenityPin.getCoordinates().getLatitude(), amenityPin.getCoordinates().getLongitude()), false, 32, null));
            }
            c42784z0 = arrayList;
        }
        this.f101746i = c42784z0 == null ? C42784z0.f406748b : c42784z0;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101743f;
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@k AvitoMapTarget avitoMapTarget) {
        List<BeduinAction> actions = this.f101743f.getActions();
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                this.f101742e.o((BeduinAction) it.next());
            }
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@l Object obj) {
        List<BeduinAction> actions = this.f101743f.getActions();
        if (actions != null) {
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                this.f101742e.o((BeduinAction) it.next());
            }
        }
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext(), null, 0, this.f101744g, 6, null);
        fVar.setId(View.generateViewId());
        fVar.setLayoutParams(layoutParams);
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Integer cornerRadius;
        f fVar = (f) view;
        BeduinMapComponentModel beduinMapComponentModel = this.f101743f;
        Integer height = beduinMapComponentModel.getHeight();
        Integer numValueOf = null;
        fVar.setMapHeight(height != null ? Integer.valueOf(y6.b(height.intValue())) : null);
        BeduinMapComponentModel.MapStyle style = beduinMapComponentModel.getStyle();
        if (style != null && (cornerRadius = style.getCornerRadius()) != null) {
            numValueOf = Integer.valueOf(y6.b(cornerRadius.intValue()));
        }
        fVar.setMapCornerRadius(numValueOf);
        if (beduinMapComponentModel.getPadding() != null) {
            J.b(fVar, beduinMapComponentModel.getPadding());
        }
        D6.l(true, fVar.f101759e, new e(fVar, this.f101745h, this.f101746i, this, this));
    }
}
