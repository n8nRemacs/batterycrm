package com.avito.android.universal_map.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;
import uG0.InterfaceC48895a;

/* compiled from: UniversalMapPointRect.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003/01Bf\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;", "Landroid/os/Parcelable;", "LuG0/a;", "", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$Viewport;", "viewport", "hint", "Lcom/avito/android/remote/model/text/AttributedText;", "richHint", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout;", "hintLayout", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "iconType", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onSelectEvent", "<init>", "(Ljava/util/Map;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$Viewport;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout;Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/Coordinates;", "c", "()Lcom/avito/android/remote/model/Coordinates;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$Viewport;", "j", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$Viewport;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout;", "e", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "f", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "g", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "HintLayout", "PointIconType", "Viewport", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniversalMapPointRect implements Parcelable, InterfaceC48895a {

    @k
    public static final Parcelable.Creator<UniversalMapPointRect> CREATOR = new a();

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final Coordinates coordinates;

    @c("hint")
    @l
    private final String hint;

    @c("hintLayout")
    @l
    private final HintLayout hintLayout;

    @c("iconType")
    @l
    private final PointIconType iconType;

    @c("onSelectEvent")
    @l
    private final ParametrizedEvent onSelectEvent;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final Map<String, Object> parameters;

    @c("richHint")
    @l
    private final AttributedText richHint;

    @c("viewport")
    @l
    private final Viewport viewport;

    /* compiled from: UniversalMapPointRect.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout;", "Landroid/os/Parcelable;", "", "maxWidth", "cornerRadius", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout$Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout$Padding;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout$Padding;", "e", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout$Padding;", "Padding", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class HintLayout implements Parcelable {

        @k
        public static final Parcelable.Creator<HintLayout> CREATOR = new a();

        @c("cornerRadius")
        @l
        private final Integer cornerRadius;

        @c("maxWidth")
        @l
        private final Integer maxWidth;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
        @l
        private final Padding padding;

        /* compiled from: UniversalMapPointRect.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$HintLayout$Padding;", "Landroid/os/Parcelable;", "", ProfileTab.ALL, "left", "top", "right", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "e", "g", "f", "d", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Padding implements Parcelable {

            @k
            public static final Parcelable.Creator<Padding> CREATOR = new a();

            @c(ProfileTab.ALL)
            @l
            private final Integer all;

            @c("bottom")
            @l
            private final Integer bottom;

            @c("left")
            @l
            private final Integer left;

            @c("right")
            @l
            private final Integer right;

            @c("top")
            @l
            private final Integer top;

            /* compiled from: UniversalMapPointRect.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Padding> {
                @Override // android.os.Parcelable.Creator
                public final Padding createFromParcel(Parcel parcel) {
                    return new Padding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Padding[] newArray(int i12) {
                    return new Padding[i12];
                }
            }

            public Padding(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5) {
                this.all = num;
                this.left = num2;
                this.top = num3;
                this.right = num4;
                this.bottom = num5;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Integer getAll() {
                return this.all;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final Integer getBottom() {
                return this.bottom;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Integer getLeft() {
                return this.left;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Padding)) {
                    return false;
                }
                Padding padding = (Padding) obj;
                return L.f(this.all, padding.all) && L.f(this.left, padding.left) && L.f(this.top, padding.top) && L.f(this.right, padding.right) && L.f(this.bottom, padding.bottom);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final Integer getRight() {
                return this.right;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Integer getTop() {
                return this.top;
            }

            public final int hashCode() {
                Integer num = this.all;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.left;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.top;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.right;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.bottom;
                return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Padding(all=");
                sb2.append(this.all);
                sb2.append(", left=");
                sb2.append(this.left);
                sb2.append(", top=");
                sb2.append(this.top);
                sb2.append(", right=");
                sb2.append(this.right);
                sb2.append(", bottom=");
                return s.j(sb2, this.bottom, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Integer num = this.all;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                Integer num2 = this.left;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                }
                Integer num3 = this.top;
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                }
                Integer num4 = this.right;
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num4);
                }
                Integer num5 = this.bottom;
                if (num5 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num5);
                }
            }
        }

        /* compiled from: UniversalMapPointRect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HintLayout> {
            @Override // android.os.Parcelable.Creator
            public final HintLayout createFromParcel(Parcel parcel) {
                return new HintLayout(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Padding.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final HintLayout[] newArray(int i12) {
                return new HintLayout[i12];
            }
        }

        public HintLayout(@l Integer num, @l Integer num2, @l Padding padding) {
            this.maxWidth = num;
            this.cornerRadius = num2;
            this.padding = padding;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getMaxWidth() {
            return this.maxWidth;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Padding getPadding() {
            return this.padding;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HintLayout)) {
                return false;
            }
            HintLayout hintLayout = (HintLayout) obj;
            return L.f(this.maxWidth, hintLayout.maxWidth) && L.f(this.cornerRadius, hintLayout.cornerRadius) && L.f(this.padding, hintLayout.padding);
        }

        public final int hashCode() {
            Integer num = this.maxWidth;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.cornerRadius;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Padding padding = this.padding;
            return iHashCode2 + (padding != null ? padding.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "HintLayout(maxWidth=" + this.maxWidth + ", cornerRadius=" + this.cornerRadius + ", padding=" + this.padding + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Integer num = this.maxWidth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.cornerRadius;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Padding padding = this.padding;
            if (padding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                padding.writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalMapPointRect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "", "(Ljava/lang/String;I)V", "AVITO", "POSTAMAT", "PVZ", "PVZ_WITH_TRY_ON", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PointIconType {

        @c("avito")
        public static final PointIconType AVITO;

        @c("postamat")
        public static final PointIconType POSTAMAT;

        @c("pvz")
        public static final PointIconType PVZ;

        @c("pvzWithTryOn")
        public static final PointIconType PVZ_WITH_TRY_ON;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PointIconType[] f306352b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f306353c;

        static {
            PointIconType pointIconType = new PointIconType("AVITO", 0);
            AVITO = pointIconType;
            PointIconType pointIconType2 = new PointIconType("POSTAMAT", 1);
            POSTAMAT = pointIconType2;
            PointIconType pointIconType3 = new PointIconType("PVZ", 2);
            PVZ = pointIconType3;
            PointIconType pointIconType4 = new PointIconType("PVZ_WITH_TRY_ON", 3);
            PVZ_WITH_TRY_ON = pointIconType4;
            PointIconType[] pointIconTypeArr = {pointIconType, pointIconType2, pointIconType3, pointIconType4};
            f306352b = pointIconTypeArr;
            f306353c = kotlin.enums.c.a(pointIconTypeArr);
        }

        private PointIconType(String str, int i12) {
        }

        public static PointIconType valueOf(String str) {
            return (PointIconType) Enum.valueOf(PointIconType.class, str);
        }

        public static PointIconType[] values() {
            return (PointIconType[]) f306352b.clone();
        }
    }

    /* compiled from: UniversalMapPointRect.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$Viewport;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Coordinates;", "topLeft", "bottomRight", "<init>", "(Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Coordinates;)V", "Lcom/avito/android/remote/model/Coordinates;", "d", "()Lcom/avito/android/remote/model/Coordinates;", "c", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Viewport implements Parcelable {

        @k
        public static final Parcelable.Creator<Viewport> CREATOR = new a();

        @c("bottomRight")
        @k
        private final Coordinates bottomRight;

        @c("topLeft")
        @k
        private final Coordinates topLeft;

        /* compiled from: UniversalMapPointRect.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Viewport> {
            @Override // android.os.Parcelable.Creator
            public final Viewport createFromParcel(Parcel parcel) {
                return new Viewport((Coordinates) parcel.readParcelable(Viewport.class.getClassLoader()), (Coordinates) parcel.readParcelable(Viewport.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Viewport[] newArray(int i12) {
                return new Viewport[i12];
            }
        }

        public Viewport(@k Coordinates coordinates, @k Coordinates coordinates2) {
            this.topLeft = coordinates;
            this.bottomRight = coordinates2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Coordinates getBottomRight() {
            return this.bottomRight;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final Coordinates getTopLeft() {
            return this.topLeft;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Viewport)) {
                return false;
            }
            Viewport viewport = (Viewport) obj;
            return L.f(this.topLeft, viewport.topLeft) && L.f(this.bottomRight, viewport.bottomRight);
        }

        public final int hashCode() {
            return this.bottomRight.hashCode() + (this.topLeft.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Viewport(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.topLeft, i12);
            parcel.writeParcelable(this.bottomRight, i12);
        }
    }

    /* compiled from: UniversalMapPointRect.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapPointRect> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapPointRect createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(UniversalMapPointRect.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UniversalMapPointRect(linkedHashMap, (Coordinates) parcel.readParcelable(UniversalMapPointRect.class.getClassLoader()), parcel.readInt() == 0 ? null : Viewport.CREATOR.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(UniversalMapPointRect.class.getClassLoader()), parcel.readInt() == 0 ? null : HintLayout.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PointIconType.valueOf(parcel.readString()) : null, (ParametrizedEvent) parcel.readParcelable(UniversalMapPointRect.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapPointRect[] newArray(int i12) {
            return new UniversalMapPointRect[i12];
        }
    }

    public UniversalMapPointRect(@l Map<String, ? extends Object> map, @k Coordinates coordinates, @l Viewport viewport, @l String str, @l AttributedText attributedText, @l HintLayout hintLayout, @l PointIconType pointIconType, @l ParametrizedEvent parametrizedEvent) {
        this.parameters = map;
        this.coordinates = coordinates;
        this.viewport = viewport;
        this.hint = str;
        this.richHint = attributedText;
        this.hintLayout = hintLayout;
        this.iconType = pointIconType;
        this.onSelectEvent = parametrizedEvent;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final HintLayout getHintLayout() {
        return this.hintLayout;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalMapPointRect)) {
            return false;
        }
        UniversalMapPointRect universalMapPointRect = (UniversalMapPointRect) obj;
        return L.f(this.parameters, universalMapPointRect.parameters) && L.f(this.coordinates, universalMapPointRect.coordinates) && L.f(this.viewport, universalMapPointRect.viewport) && L.f(this.hint, universalMapPointRect.hint) && L.f(this.richHint, universalMapPointRect.richHint) && L.f(this.hintLayout, universalMapPointRect.hintLayout) && this.iconType == universalMapPointRect.iconType && L.f(this.onSelectEvent, universalMapPointRect.onSelectEvent);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final PointIconType getIconType() {
        return this.iconType;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final ParametrizedEvent getOnSelectEvent() {
        return this.onSelectEvent;
    }

    @k
    public final String getId() {
        return this.coordinates.toString();
    }

    @l
    public final Map<String, Object> h() {
        return this.parameters;
    }

    public final int hashCode() {
        Map<String, Object> map = this.parameters;
        int iHashCode = (this.coordinates.hashCode() + ((map == null ? 0 : map.hashCode()) * 31)) * 31;
        Viewport viewport = this.viewport;
        int iHashCode2 = (iHashCode + (viewport == null ? 0 : viewport.hashCode())) * 31;
        String str = this.hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.richHint;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        HintLayout hintLayout = this.hintLayout;
        int iHashCode5 = (iHashCode4 + (hintLayout == null ? 0 : hintLayout.hashCode())) * 31;
        PointIconType pointIconType = this.iconType;
        int iHashCode6 = (iHashCode5 + (pointIconType == null ? 0 : pointIconType.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onSelectEvent;
        return iHashCode6 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final AttributedText getRichHint() {
        return this.richHint;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Viewport getViewport() {
        return this.viewport;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalMapPointRect(parameters=");
        sb2.append(this.parameters);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", viewport=");
        sb2.append(this.viewport);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", richHint=");
        sb2.append(this.richHint);
        sb2.append(", hintLayout=");
        sb2.append(this.hintLayout);
        sb2.append(", iconType=");
        sb2.append(this.iconType);
        sb2.append(", onSelectEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onSelectEvent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Map<String, Object> map = this.parameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeParcelable(this.coordinates, i12);
        Viewport viewport = this.viewport;
        if (viewport == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewport.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.richHint, i12);
        HintLayout hintLayout = this.hintLayout;
        if (hintLayout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hintLayout.writeToParcel(parcel, i12);
        }
        PointIconType pointIconType = this.iconType;
        if (pointIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pointIconType.name());
        }
        parcel.writeParcelable(this.onSelectEvent, i12);
    }
}
