package com.avito.android.universal_map.map.pin_filters;

import androidx.view.C23038g0;
import com.avito.android.util.architecture_components.D;
import dj.InterfaceC39736a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UniversalMapPinFiltersViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/j;", "", "a", "b", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface j {

    /* compiled from: UniversalMapPinFiltersViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/j$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f305746a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f305747b;

        public a(@Y61.k String str, @Y61.k Throwable th2) {
            this.f305746a = str;
            this.f305747b = th2;
        }
    }

    /* compiled from: UniversalMapPinFiltersViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/j$b;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f305748a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f305749b;

        public b(boolean z12, @Y61.k Map map) {
            this.f305748a = z12;
            this.f305749b = map;
        }
    }

    void H1(@Y61.l Map<String, ? extends Object> map);

    void O2();

    @Y61.k
    C23038g0 S7();

    void T2(boolean z12);

    void X();

    @Y61.k
    D a0();

    @Y61.k
    C23038g0 ae();

    @Y61.k
    InterfaceC39736a h1();

    void kd(@Y61.l b bVar);

    void u2();
}
