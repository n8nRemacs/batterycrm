package com.avito.android.universal_map.map;

import androidx.view.C23038g0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import qG0.C47290a;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/T;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface T {

    /* compiled from: UniversalPointsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/T$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UniversalMapPointsRectResult f304816a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UniversalPreselectMapPoint f304817b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f304818c;

        public a(@Y61.k UniversalMapPointsRectResult universalMapPointsRectResult, @Y61.l UniversalPreselectMapPoint universalPreselectMapPoint, boolean z12) {
            this.f304816a = universalMapPointsRectResult;
            this.f304817b = universalPreselectMapPoint;
            this.f304818c = z12;
        }
    }

    @Y61.k
    com.avito.android.util.architecture_components.D D3();

    void Gc(@Y61.k C47290a c47290a, @Y61.l Map<String, ? extends Object> map, boolean z12);

    @Y61.k
    com.avito.android.util.architecture_components.D P5();

    @Y61.k
    C23038g0 U5();

    @Y61.k
    com.avito.android.util.architecture_components.D Y3();

    @Y61.k
    com.avito.android.util.architecture_components.D a0();

    @Y61.k
    com.avito.android.util.architecture_components.D cb();

    @Y61.k
    com.avito.android.util.architecture_components.D fb();

    void hb(@Y61.k List<? extends BeduinAction> list);

    @Y61.k
    com.avito.android.util.architecture_components.D jb();

    void n8(@Y61.l Marker.Pin pin);

    void ra(boolean z12, boolean z13);

    @Y61.k
    com.avito.android.util.architecture_components.D u9();

    @Y61.k
    com.avito.android.util.architecture_components.D v8();

    void wb();

    @Y61.k
    com.avito.android.util.architecture_components.D xa();

    void y2(double d12, double d13, boolean z12);
}
