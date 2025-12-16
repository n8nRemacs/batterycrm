package com.avito.android.lib.design.docking_badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockinBadgeItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeType;", "Landroid/os/Parcelable;", "Custom", "CustomColors", "Predefined", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Custom;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$CustomColors;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DockingBadgeType extends Parcelable {

    /* compiled from: DockinBadgeItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Custom;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Custom implements DockingBadgeType {

        @k
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f179136b;

        /* compiled from: DockinBadgeItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i12) {
                return new Custom[i12];
            }
        }

        public Custom(@f0 int i12) {
            this.f179136b = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && this.f179136b == ((Custom) obj).f179136b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f179136b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Custom(badgeStyle="), this.f179136b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f179136b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DockinBadgeItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType;", "<init>", "(Ljava/lang/String;I)V", "Green", "Violet", "Blue", "Gray", "Red", "Black", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Predefined implements DockingBadgeType {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final Predefined Black;

        @c("blue")
        public static final Predefined Blue;

        @k
        public static final Parcelable.Creator<Predefined> CREATOR;

        @c("gray")
        public static final Predefined Gray;

        @c("green")
        public static final Predefined Green;

        @c("red")
        public static final Predefined Red;

        @c("violet")
        public static final Predefined Violet;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Predefined[] f179142b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179143c;

        /* compiled from: DockinBadgeItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Predefined> {
            @Override // android.os.Parcelable.Creator
            public final Predefined createFromParcel(Parcel parcel) {
                return Predefined.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Predefined[] newArray(int i12) {
                return new Predefined[i12];
            }
        }

        static {
            Predefined predefined = new Predefined("Green", 0);
            Green = predefined;
            Predefined predefined2 = new Predefined("Violet", 1);
            Violet = predefined2;
            Predefined predefined3 = new Predefined("Blue", 2);
            Blue = predefined3;
            Predefined predefined4 = new Predefined("Gray", 3);
            Gray = predefined4;
            Predefined predefined5 = new Predefined("Red", 4);
            Red = predefined5;
            Predefined predefined6 = new Predefined("Black", 5);
            Black = predefined6;
            Predefined[] predefinedArr = {predefined, predefined2, predefined3, predefined4, predefined5, predefined6};
            f179142b = predefinedArr;
            f179143c = kotlin.enums.c.a(predefinedArr);
            CREATOR = new a();
        }

        private Predefined(String str, int i12) {
        }

        public static Predefined valueOf(String str) {
            return (Predefined) Enum.valueOf(Predefined.class, str);
        }

        public static Predefined[] values() {
            return (Predefined[]) f179142b.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: DockinBadgeItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$CustomColors;", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CustomColors implements DockingBadgeType {

        @k
        public static final Parcelable.Creator<CustomColors> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f179137b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f179138c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f179139d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f179140e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f179141f;

        /* compiled from: DockinBadgeItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CustomColors> {
            @Override // android.os.Parcelable.Creator
            public final CustomColors createFromParcel(Parcel parcel) {
                return new CustomColors(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final CustomColors[] newArray(int i12) {
                return new CustomColors[i12];
            }
        }

        public CustomColors(@f0 int i12, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, @InterfaceC42150f @l Integer num3, @U @l Integer num4) {
            this.f179137b = i12;
            this.f179138c = num;
            this.f179139d = num2;
            this.f179140e = num3;
            this.f179141f = num4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomColors)) {
                return false;
            }
            CustomColors customColors = (CustomColors) obj;
            return this.f179137b == customColors.f179137b && L.f(this.f179138c, customColors.f179138c) && L.f(this.f179139d, customColors.f179139d) && L.f(this.f179140e, customColors.f179140e) && L.f(this.f179141f, customColors.f179141f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f179137b) * 31;
            Integer num = this.f179138c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f179139d;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f179140e;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f179141f;
            return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CustomColors(baseStyle=");
            sb2.append(this.f179137b);
            sb2.append(", backgroundColor=");
            sb2.append(this.f179138c);
            sb2.append(", textColor=");
            sb2.append(this.f179139d);
            sb2.append(", textStyleAttrRes=");
            sb2.append(this.f179140e);
            sb2.append(", textVerticalOffset=");
            return s.j(sb2, this.f179141f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f179137b);
            Integer num = this.f179138c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f179139d;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Integer num3 = this.f179140e;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            Integer num4 = this.f179141f;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num4);
            }
        }

        public /* synthetic */ CustomColors(int i12, Integer num, Integer num2, Integer num3, Integer num4, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3, (i13 & 16) != 0 ? null : num4);
        }
    }
}
