package com.avito.android.universal_map.map.common.marker;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker;", "", "a", "Pin", "b", "Lcom/avito/android/universal_map/map/common/marker/Marker$a;", "Lcom/avito/android/universal_map/map/common/marker/Marker$Pin;", "Lcom/avito/android/universal_map/map/common/marker/Marker$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Marker {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f304921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AvitoMapPoint f304922b;

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$Pin;", "Lcom/avito/android/universal_map/map/common/marker/Marker;", "IconType", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Pin extends Marker {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f304923c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f304924d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f304925e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f304926f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedText f304927g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final UniversalMapPointRect.HintLayout f304928h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f304929i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Float f304930j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final IconType f304931k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final AvitoMapMarker.Anchor f304932l;

        /* renamed from: m, reason: collision with root package name */
        public final float f304933m;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Marker.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$Pin$IconType;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IconType {

            /* renamed from: b, reason: collision with root package name */
            public static final IconType f304934b;

            /* renamed from: c, reason: collision with root package name */
            public static final IconType f304935c;

            /* renamed from: d, reason: collision with root package name */
            public static final IconType f304936d;

            /* renamed from: e, reason: collision with root package name */
            public static final IconType f304937e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ IconType[] f304938f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f304939g;

            static {
                IconType iconType = new IconType("AVITO", 0);
                f304934b = iconType;
                IconType iconType2 = new IconType("POSTAMAT", 1);
                f304935c = iconType2;
                IconType iconType3 = new IconType("PVZ", 2);
                f304936d = iconType3;
                IconType iconType4 = new IconType("PVZ_WITH_TRY_ON", 3);
                f304937e = iconType4;
                IconType[] iconTypeArr = {iconType, iconType2, iconType3, iconType4};
                f304938f = iconTypeArr;
                f304939g = kotlin.enums.c.a(iconTypeArr);
            }

            public IconType() {
                throw null;
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) f304938f.clone();
            }
        }

        public /* synthetic */ Pin(String str, AvitoMapPoint avitoMapPoint, Map map, String str2, AttributedText attributedText, UniversalMapPointRect.HintLayout hintLayout, ParametrizedEvent parametrizedEvent, Float f12, IconType iconType, int i12, C42822w c42822w) {
            this(str, avitoMapPoint, map, str2, attributedText, hintLayout, parametrizedEvent, (i12 & 128) != 0 ? null : f12, (i12 & 256) != 0 ? null : iconType);
        }

        public static Pin f(Pin pin, IconType iconType) {
            String str = pin.f304923c;
            AvitoMapPoint avitoMapPoint = pin.f304924d;
            Map<String, Object> map = pin.f304925e;
            String str2 = pin.f304926f;
            AttributedText attributedText = pin.f304927g;
            UniversalMapPointRect.HintLayout hintLayout = pin.f304928h;
            ParametrizedEvent parametrizedEvent = pin.f304929i;
            Float f12 = pin.f304930j;
            pin.getClass();
            return new Pin(str, avitoMapPoint, map, str2, attributedText, hintLayout, parametrizedEvent, f12, iconType);
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AvitoMapMarker.Anchor getF304948e() {
            return this.f304932l;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF304921a() {
            return this.f304923c;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AvitoMapPoint getF304922b() {
            return this.f304924d;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        /* renamed from: d, reason: from getter */
        public final float getF304945h() {
            return this.f304933m;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return L.f(this.f304923c, pin.f304923c) && L.f(this.f304924d, pin.f304924d) && L.f(this.f304925e, pin.f304925e) && L.f(this.f304926f, pin.f304926f) && L.f(this.f304927g, pin.f304927g) && L.f(this.f304928h, pin.f304928h) && L.f(this.f304929i, pin.f304929i) && L.f(this.f304930j, pin.f304930j) && this.f304931k == pin.f304931k;
        }

        public final int hashCode() {
            int iHashCode = (this.f304924d.hashCode() + (this.f304923c.hashCode() * 31)) * 31;
            Map<String, Object> map = this.f304925e;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.f304926f;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f304927g;
            int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            UniversalMapPointRect.HintLayout hintLayout = this.f304928h;
            int iHashCode5 = (iHashCode4 + (hintLayout == null ? 0 : hintLayout.hashCode())) * 31;
            ParametrizedEvent parametrizedEvent = this.f304929i;
            int iHashCode6 = (iHashCode5 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
            Float f12 = this.f304930j;
            int iHashCode7 = (iHashCode6 + (f12 == null ? 0 : f12.hashCode())) * 31;
            IconType iconType = this.f304931k;
            return iHashCode7 + (iconType != null ? iconType.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Pin(id=" + this.f304923c + ", latLng=" + this.f304924d + ", parameters=" + this.f304925e + ", hint=" + this.f304926f + ", richHint=" + this.f304927g + ", hintLayout=" + this.f304928h + ", onSelectEvent=" + this.f304929i + ", zoomLevel=" + this.f304930j + ", iconType=" + this.f304931k + ')';
        }

        public Pin(@Y61.k String str, @Y61.k AvitoMapPoint avitoMapPoint, @Y61.l Map<String, ? extends Object> map, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l UniversalMapPointRect.HintLayout hintLayout, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l Float f12, @Y61.l IconType iconType) {
            super(str, avitoMapPoint, null);
            this.f304923c = str;
            this.f304924d = avitoMapPoint;
            this.f304925e = map;
            this.f304926f = str2;
            this.f304927g = attributedText;
            this.f304928h = hintLayout;
            this.f304929i = parametrizedEvent;
            this.f304930j = f12;
            this.f304931k = iconType;
            this.f304932l = AvitoMapMarker.Anchor.BOTTOM_CENTER;
            this.f304933m = 1.0f;
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$a;", "Lcom/avito/android/universal_map/map/common/marker/Marker;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends Marker {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f304940c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f304941d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f304942e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f304943f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final AvitoMapMarker.Anchor f304944g;

        /* renamed from: h, reason: collision with root package name */
        public final float f304945h;

        public a(@Y61.k String str, @Y61.k AvitoMapPoint avitoMapPoint, @Y61.k String str2, @Y61.l String str3) {
            super(str, avitoMapPoint, null);
            this.f304940c = str;
            this.f304941d = avitoMapPoint;
            this.f304942e = str2;
            this.f304943f = str3;
            this.f304944g = AvitoMapMarker.Anchor.CENTER;
            this.f304945h = 1.0f;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AvitoMapMarker.Anchor getF304948e() {
            return this.f304944g;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF304921a() {
            return this.f304940c;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AvitoMapPoint getF304922b() {
            return this.f304941d;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        /* renamed from: d, reason: from getter */
        public final float getF304945h() {
            return this.f304945h;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f304940c, aVar.f304940c) && L.f(this.f304941d, aVar.f304941d) && L.f(this.f304942e, aVar.f304942e) && L.f(this.f304943f, aVar.f304943f);
        }

        public final int hashCode() {
            int iD2 = H.d((this.f304941d.hashCode() + (this.f304940c.hashCode() * 31)) * 31, 31, this.f304942e);
            String str = this.f304943f;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Cluster(id=");
            sb2.append(this.f304940c);
            sb2.append(", latLng=");
            sb2.append(this.f304941d);
            sb2.append(", count=");
            sb2.append(this.f304942e);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f304943f, ')');
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$b;", "Lcom/avito/android/universal_map/map/common/marker/Marker;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends Marker {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f304946c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f304947d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final AvitoMapMarker.Anchor f304948e;

        public b(@Y61.k AvitoMapPoint avitoMapPoint) {
            super("user_marker_id", avitoMapPoint, null);
            this.f304946c = "user_marker_id";
            this.f304947d = avitoMapPoint;
            this.f304948e = AvitoMapMarker.Anchor.CENTER;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AvitoMapMarker.Anchor getF304948e() {
            return this.f304948e;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF304921a() {
            return this.f304946c;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final AvitoMapPoint getF304922b() {
            return this.f304947d;
        }

        @Override // com.avito.android.universal_map.map.common.marker.Marker
        /* renamed from: d */
        public final float getF304945h() {
            return 0.0f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f304946c, bVar.f304946c) && L.f(this.f304947d, bVar.f304947d);
        }

        public final int hashCode() {
            return this.f304947d.hashCode() + (this.f304946c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "User(id=" + this.f304946c + ", latLng=" + this.f304947d + ')';
        }
    }

    public Marker(String str, AvitoMapPoint avitoMapPoint, C42822w c42822w) {
        this.f304921a = str;
        this.f304922b = avitoMapPoint;
    }

    @Y61.k
    /* renamed from: a */
    public abstract AvitoMapMarker.Anchor getF304948e();

    @Y61.k
    /* renamed from: b, reason: from getter */
    public String getF304921a() {
        return this.f304921a;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public AvitoMapPoint getF304922b() {
        return this.f304922b;
    }

    /* renamed from: d */
    public abstract float getF304945h();

    public final boolean e() {
        if (this instanceof Pin) {
            Pin pin = (Pin) this;
            if (pin.f304926f != null || pin.f304927g != null) {
                return true;
            }
        }
        return (this instanceof a) && ((a) this).f304943f != null;
    }
}
