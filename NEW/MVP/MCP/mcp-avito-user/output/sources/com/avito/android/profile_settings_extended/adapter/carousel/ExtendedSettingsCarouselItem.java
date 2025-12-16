package com.avito.android.profile_settings_extended.adapter.carousel;

import Rb0.InterfaceC15025a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.entity.CarouselEditorSettings;
import com.avito.android.profile_settings_extended.entity.CommonValue;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsCarouselItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/ExtendedSettingsCarouselItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "Carousel", "EmptyState", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ExtendedSettingsCarouselItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<ExtendedSettingsCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229281b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f229282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f229283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final EmptyState f229284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CarouselEditorSettings f229285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Carousel f229286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Parcelable f229287h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final GridElementType.FullWidth f229288i;

    /* compiled from: ExtendedSettingsCarouselItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/ExtendedSettingsCarouselItem$Carousel;", "Lcom/avito/android/profile_settings_extended/entity/CommonValue;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Carousel implements CommonValue<Carousel> {

        @Y61.k
        public static final Parcelable.Creator<Carousel> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CommonValueId f229289b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f229290c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f229291d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<ExtendedProfileSettingsAdvert> f229292e;

        /* renamed from: f, reason: collision with root package name */
        public final int f229293f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Boolean f229294g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Boolean f229295h;

        /* compiled from: ExtendedSettingsCarouselItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Carousel> {
            @Override // android.os.Parcelable.Creator
            public final Carousel createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                CommonValueId commonValueIdCreateFromParcel = CommonValueId.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Carousel.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ExtendedProfileSettingsAdvert.CREATOR, parcel, arrayList, iC2, 1);
                }
                int i13 = parcel.readInt();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Carousel(commonValueIdCreateFromParcel, string, attributedText, arrayList, i13, boolValueOf, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Carousel[] newArray(int i12) {
                return new Carousel[i12];
            }
        }

        public Carousel(@Y61.k CommonValueId commonValueId, @Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k List<ExtendedProfileSettingsAdvert> list, int i12, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
            this.f229289b = commonValueId;
            this.f229290c = str;
            this.f229291d = attributedText;
            this.f229292e = list;
            this.f229293f = i12;
            this.f229294g = bool;
            this.f229295h = bool2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) obj;
            return L.f(this.f229289b, carousel.f229289b) && L.f(this.f229290c, carousel.f229290c) && L.f(this.f229291d, carousel.f229291d) && L.f(this.f229292e, carousel.f229292e) && this.f229293f == carousel.f229293f && L.f(this.f229294g, carousel.f229294g) && L.f(this.f229295h, carousel.f229295h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f229289b.hashCode() * 31, 31, this.f229290c);
            AttributedText attributedText = this.f229291d;
            int iE2 = r.e(this.f229293f, H.e((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f229292e), 31);
            Boolean bool = this.f229294g;
            int iHashCode = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f229295h;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Carousel(commonValueId=");
            sb2.append(this.f229289b);
            sb2.append(", title=");
            sb2.append(this.f229290c);
            sb2.append(", subtitle=");
            sb2.append(this.f229291d);
            sb2.append(", advertItems=");
            sb2.append(this.f229292e);
            sb2.append(", nameId=");
            sb2.append(this.f229293f);
            sb2.append(", canEnable=");
            sb2.append(this.f229294g);
            sb2.append(", isEnabled=");
            return C0.g(sb2, this.f229295h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f229289b.writeToParcel(parcel, i12);
            parcel.writeString(this.f229290c);
            parcel.writeParcelable(this.f229291d, i12);
            Iterator itJ = C0.j(this.f229292e, parcel);
            while (itJ.hasNext()) {
                ((ExtendedProfileSettingsAdvert) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f229293f);
            Boolean bool = this.f229294g;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.f229295h;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
        }
    }

    /* compiled from: ExtendedSettingsCarouselItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/carousel/ExtendedSettingsCarouselItem$EmptyState;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class EmptyState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<EmptyState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f229296b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f229297c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f229298d;

        /* compiled from: ExtendedSettingsCarouselItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyState> {
            @Override // android.os.Parcelable.Creator
            public final EmptyState createFromParcel(Parcel parcel) {
                return new EmptyState(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyState[] newArray(int i12) {
                return new EmptyState[i12];
            }
        }

        public EmptyState(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f229296b = str;
            this.f229297c = str2;
            this.f229298d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyState)) {
                return false;
            }
            EmptyState emptyState = (EmptyState) obj;
            return L.f(this.f229296b, emptyState.f229296b) && L.f(this.f229297c, emptyState.f229297c) && L.f(this.f229298d, emptyState.f229298d);
        }

        public final int hashCode() {
            return this.f229298d.hashCode() + H.d(this.f229296b.hashCode() * 31, 31, this.f229297c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmptyState(title=");
            sb2.append(this.f229296b);
            sb2.append(", subtitle=");
            sb2.append(this.f229297c);
            sb2.append(", createCarouselButtonTitle=");
            return C22026a.c(sb2, this.f229298d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f229296b);
            parcel.writeString(this.f229297c);
            parcel.writeString(this.f229298d);
        }
    }

    /* compiled from: ExtendedSettingsCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedSettingsCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsCarouselItem createFromParcel(Parcel parcel) {
            return new ExtendedSettingsCarouselItem(parcel.readString(), parcel.readInt() != 0, parcel.readString(), EmptyState.CREATOR.createFromParcel(parcel), CarouselEditorSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Carousel.CREATOR.createFromParcel(parcel), parcel.readParcelable(ExtendedSettingsCarouselItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedSettingsCarouselItem[] newArray(int i12) {
            return new ExtendedSettingsCarouselItem[i12];
        }
    }

    public ExtendedSettingsCarouselItem(@Y61.k String str, boolean z12, @Y61.k String str2, @Y61.k EmptyState emptyState, @Y61.k CarouselEditorSettings carouselEditorSettings, @Y61.l Carousel carousel, @Y61.l Parcelable parcelable) {
        this.f229281b = str;
        this.f229282c = z12;
        this.f229283d = str2;
        this.f229284e = emptyState;
        this.f229285f = carouselEditorSettings;
        this.f229286g = carousel;
        this.f229287h = parcelable;
        this.f229288i = GridElementType.FullWidth.f161209b;
    }

    public static ExtendedSettingsCarouselItem a(ExtendedSettingsCarouselItem extendedSettingsCarouselItem, Carousel carousel, Parcelable parcelable, int i12) {
        boolean z12 = extendedSettingsCarouselItem.f229282c;
        if ((i12 & 32) != 0) {
            carousel = extendedSettingsCarouselItem.f229286g;
        }
        Carousel carousel2 = carousel;
        if ((i12 & 64) != 0) {
            parcelable = extendedSettingsCarouselItem.f229287h;
        }
        return new ExtendedSettingsCarouselItem(extendedSettingsCarouselItem.f229281b, z12, extendedSettingsCarouselItem.f229283d, extendedSettingsCarouselItem.f229284e, extendedSettingsCarouselItem.f229285f, carousel2, parcelable);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedSettingsCarouselItem)) {
            return false;
        }
        ExtendedSettingsCarouselItem extendedSettingsCarouselItem = (ExtendedSettingsCarouselItem) obj;
        return L.f(this.f229281b, extendedSettingsCarouselItem.f229281b) && this.f229282c == extendedSettingsCarouselItem.f229282c && L.f(this.f229283d, extendedSettingsCarouselItem.f229283d) && L.f(this.f229284e, extendedSettingsCarouselItem.f229284e) && L.f(this.f229285f, extendedSettingsCarouselItem.f229285f) && L.f(this.f229286g, extendedSettingsCarouselItem.f229286g) && L.f(this.f229287h, extendedSettingsCarouselItem.f229287h);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154248c() {
        return this.f229288i;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236852b() {
        return this.f229281b;
    }

    public final int hashCode() {
        int iHashCode = (this.f229285f.hashCode() + ((this.f229284e.hashCode() + H.d(r.i(this.f229281b.hashCode() * 31, 31, this.f229282c), 31, this.f229283d)) * 31)) * 31;
        Carousel carousel = this.f229286g;
        int iHashCode2 = (iHashCode + (carousel == null ? 0 : carousel.hashCode())) * 31;
        Parcelable parcelable = this.f229287h;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedSettingsCarouselItem(stringId=");
        sb2.append(this.f229281b);
        sb2.append(", isActive=");
        sb2.append(this.f229282c);
        sb2.append(", fieldName=");
        sb2.append(this.f229283d);
        sb2.append(", emptyState=");
        sb2.append(this.f229284e);
        sb2.append(", editorSettings=");
        sb2.append(this.f229285f);
        sb2.append(", carousel=");
        sb2.append(this.f229286g);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f229287h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229281b);
        parcel.writeInt(this.f229282c ? 1 : 0);
        parcel.writeString(this.f229283d);
        this.f229284e.writeToParcel(parcel, i12);
        this.f229285f.writeToParcel(parcel, i12);
        Carousel carousel = this.f229286g;
        if (carousel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carousel.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f229287h, i12);
    }

    public /* synthetic */ ExtendedSettingsCarouselItem(String str, boolean z12, String str2, EmptyState emptyState, CarouselEditorSettings carouselEditorSettings, Carousel carousel, Parcelable parcelable, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "extended_settings_carousel" : str, z12, str2, emptyState, carouselEditorSettings, carousel, (i12 & 64) != 0 ? null : parcelable);
    }
}
