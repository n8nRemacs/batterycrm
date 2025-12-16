package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.common.marker.Marker;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Marker.Pin f305572a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, Object> f305573b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Overlay f305574c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f305575d;

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/universal_map/map/mvi/entity/c$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a$c;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a$d;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c$a$b;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f305582a;

            public b(@k ApiError apiError) {
                super(null);
                this.f305582a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f305582a, ((b) obj).f305582a);
            }

            public final int hashCode() {
                return this.f305582a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f305582a, ')');
            }
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c$a$c;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.entity.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C9382c extends a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Overlay f305583a;

            /* JADX WARN: Multi-variable type inference failed */
            public C9382c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9382c) && L.f(this.f305583a, ((C9382c) obj).f305583a);
            }

            public final int hashCode() {
                Overlay overlay = this.f305583a;
                if (overlay == null) {
                    return 0;
                }
                return overlay.hashCode();
            }

            @k
            public final String toString() {
                return "Hidden(overlay=" + this.f305583a + ')';
            }

            public C9382c(@l Overlay overlay) {
                super(null);
                this.f305583a = overlay;
            }

            public /* synthetic */ C9382c(Overlay overlay, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : overlay);
            }
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c$a$d;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f305584a = new d();

            public d() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/c$a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/c$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.universal_map.map.mvi.entity.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9381a extends a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f305576a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f305577b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f305578c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305579d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305580e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f305581f;

            /* JADX WARN: Multi-variable type inference failed */
            public C9381a(@l String str, @l String str2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3) {
                super(null);
                this.f305576a = str;
                this.f305577b = str2;
                this.f305578c = str3;
                this.f305579d = list;
                this.f305580e = list2;
                this.f305581f = list3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9381a)) {
                    return false;
                }
                C9381a c9381a = (C9381a) obj;
                return L.f(this.f305576a, c9381a.f305576a) && L.f(this.f305577b, c9381a.f305577b) && L.f(this.f305578c, c9381a.f305578c) && L.f(this.f305579d, c9381a.f305579d) && L.f(this.f305580e, c9381a.f305580e) && L.f(this.f305581f, c9381a.f305581f);
            }

            public final int hashCode() {
                String str = this.f305576a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f305577b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f305578c;
                return this.f305581f.hashCode() + H.e(H.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f305579d), 31, this.f305580e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(topFormId=");
                sb2.append(this.f305576a);
                sb2.append(", mainFormId=");
                sb2.append(this.f305577b);
                sb2.append(", bottomFormId=");
                sb2.append(this.f305578c);
                sb2.append(", topComponents=");
                sb2.append(this.f305579d);
                sb2.append(", mainComponents=");
                sb2.append(this.f305580e);
                sb2.append(", bottomComponents=");
                return H.p(sb2, this.f305581f, ')');
            }

            public C9381a(String str, String str2, String str3, List list, List list2, List list3, int i12, C42822w c42822w) {
                this(str, str2, str3, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? C42784z0.f406748b : list2, (i12 & 32) != 0 ? C42784z0.f406748b : list3);
            }
        }
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    public static c a(c cVar, Marker.Pin pin, Map map, Overlay overlay, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            pin = cVar.f305572a;
        }
        if ((i12 & 2) != 0) {
            map = cVar.f305573b;
        }
        if ((i12 & 4) != 0) {
            overlay = cVar.f305574c;
        }
        if ((i12 & 8) != 0) {
            aVar = cVar.f305575d;
        }
        cVar.getClass();
        return new c(pin, map, overlay, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f305572a, cVar.f305572a) && L.f(this.f305573b, cVar.f305573b) && L.f(this.f305574c, cVar.f305574c) && L.f(this.f305575d, cVar.f305575d);
    }

    public final int hashCode() {
        Marker.Pin pin = this.f305572a;
        int iHashCode = (pin == null ? 0 : pin.hashCode()) * 31;
        Map<String, Object> map = this.f305573b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Overlay overlay = this.f305574c;
        return this.f305575d.hashCode() + ((iHashCode2 + (overlay != null ? overlay.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "PointInfoViewState(clickedPin=" + this.f305572a + ", infoParameters=" + this.f305573b + ", overlay=" + this.f305574c + ", contentState=" + this.f305575d + ')';
    }

    public c(@l Marker.Pin pin, @l Map<String, ? extends Object> map, @l Overlay overlay, @k a aVar) {
        this.f305572a = pin;
        this.f305573b = map;
        this.f305574c = overlay;
        this.f305575d = aVar;
    }

    public /* synthetic */ c(Marker.Pin pin, Map map, Overlay overlay, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : pin, (i12 & 2) != 0 ? null : map, (i12 & 4) != 0 ? null : overlay, (i12 & 8) != 0 ? new a.C9382c(null) : aVar);
    }
}
