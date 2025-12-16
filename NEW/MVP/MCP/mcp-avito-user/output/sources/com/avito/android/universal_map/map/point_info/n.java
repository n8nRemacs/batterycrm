package com.avito.android.universal_map.map.point_info;

import androidx.view.C23038g0;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.util.architecture_components.D;
import dj.InterfaceC39736a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/n;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface n {

    /* compiled from: UniversalMapPointInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/n$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f305853a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f305854b;

        public a(@Y61.k String str, @Y61.k Throwable th2) {
            this.f305853a = str;
            this.f305854b = th2;
        }
    }

    void H1(@Y61.l Map<String, ? extends Object> map);

    @Y61.k
    C23038g0 I4();

    void Pd(@Y61.l Overlay overlay);

    @Y61.k
    C23038g0 V5();

    void V7();

    void X();

    @Y61.k
    D a0();

    @Y61.k
    InterfaceC39736a h1();

    void h9(@Y61.k Marker.Pin pin);

    void hide();
}
