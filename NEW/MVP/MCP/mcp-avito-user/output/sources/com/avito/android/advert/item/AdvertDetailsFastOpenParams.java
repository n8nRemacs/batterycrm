package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.Image;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFastOpenParams.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFastOpenParams;", "Landroid/os/Parcelable;", "FromSpace", "GigAction", "GigParams", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFastOpenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFastOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f71325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f71326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f71327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f71328e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Image f71329f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f71330g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f71331h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsStyle f71332i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Boolean f71333j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final FromSpace f71334k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f71335l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final GigParams f71336m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final AdvertNavBarStyle f71337n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsFastOpenParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFastOpenParams$FromSpace;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromSpace {

        /* renamed from: d, reason: collision with root package name */
        public static final FromSpace f71338d;

        /* renamed from: e, reason: collision with root package name */
        public static final FromSpace f71339e;

        /* renamed from: f, reason: collision with root package name */
        public static final FromSpace f71340f;

        /* renamed from: g, reason: collision with root package name */
        public static final FromSpace f71341g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ FromSpace[] f71342h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f71343i;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, String> f71344b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f71345c;

        static {
            FromSpace fromSpace = new FromSpace(0, "Default", null, kotlin.collections.P0.c());
            f71338d = fromSpace;
            FromSpace fromSpace2 = new FromSpace(1, "AvitoBlack", "avitoBlack", Collections.singletonMap("segment", "avitoBlack"));
            f71339e = fromSpace2;
            FromSpace fromSpace3 = new FromSpace(2, "AvitoMall", "avitoMall", Collections.singletonMap("segment", "avitoMall"));
            f71340f = fromSpace3;
            FromSpace fromSpace4 = new FromSpace(3, "AvitoForBusiness", "avitoForBusiness", Collections.singletonMap("segment", "avitoForBusiness"));
            f71341g = fromSpace4;
            FromSpace[] fromSpaceArr = {fromSpace, fromSpace2, fromSpace3, fromSpace4};
            f71342h = fromSpaceArr;
            f71343i = kotlin.enums.c.a(fromSpaceArr);
        }

        public FromSpace(int i12, String str, String str2, Map map) {
            this.f71344b = map;
            this.f71345c = str2;
        }

        public static FromSpace valueOf(String str) {
            return (FromSpace) Enum.valueOf(FromSpace.class, str);
        }

        public static FromSpace[] values() {
            return (FromSpace[]) f71342h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsFastOpenParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFastOpenParams$GigAction;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GigAction {

        /* renamed from: b, reason: collision with root package name */
        public static final GigAction f71346b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ GigAction[] f71347c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f71348d;

        static {
            GigAction gigAction = new GigAction("Apply", 0);
            f71346b = gigAction;
            GigAction[] gigActionArr = {gigAction};
            f71347c = gigActionArr;
            f71348d = kotlin.enums.c.a(gigActionArr);
        }

        public GigAction() {
            throw null;
        }

        public static GigAction valueOf(String str) {
            return (GigAction) Enum.valueOf(GigAction.class, str);
        }

        public static GigAction[] values() {
            return (GigAction[]) f71347c.clone();
        }
    }

    /* compiled from: AdvertDetailsFastOpenParams.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFastOpenParams$GigParams;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class GigParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GigParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f71349b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final GigAction f71350c;

        /* compiled from: AdvertDetailsFastOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GigParams> {
            @Override // android.os.Parcelable.Creator
            public final GigParams createFromParcel(Parcel parcel) {
                return new GigParams(parcel.readString(), parcel.readInt() == 0 ? null : GigAction.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final GigParams[] newArray(int i12) {
                return new GigParams[i12];
            }
        }

        public GigParams(@Y61.l String str, @Y61.l GigAction gigAction) {
            this.f71349b = str;
            this.f71350c = gigAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GigParams)) {
                return false;
            }
            GigParams gigParams = (GigParams) obj;
            return kotlin.jvm.internal.L.f(this.f71349b, gigParams.f71349b) && this.f71350c == gigParams.f71350c;
        }

        public final int hashCode() {
            String str = this.f71349b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GigAction gigAction = this.f71350c;
            return iHashCode + (gigAction != null ? gigAction.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "GigParams(gigShiftId=" + this.f71349b + ", gigAction=" + this.f71350c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f71349b);
            GigAction gigAction = this.f71350c;
            if (gigAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(gigAction.name());
            }
        }
    }

    /* compiled from: AdvertDetailsFastOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFastOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFastOpenParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Image image = (Image) parcel.readParcelable(AdvertDetailsFastOpenParams.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AdvertDetailsStyle advertDetailsStyleValueOf = AdvertDetailsStyle.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertDetailsFastOpenParams(string, string2, string3, string4, image, string5, boolValueOf, advertDetailsStyleValueOf, boolValueOf2, FromSpace.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? GigParams.CREATOR.createFromParcel(parcel) : null, (AdvertNavBarStyle) parcel.readParcelable(AdvertDetailsFastOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFastOpenParams[] newArray(int i12) {
            return new AdvertDetailsFastOpenParams[i12];
        }
    }

    public AdvertDetailsFastOpenParams(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Image image, @Y61.l String str5, @Y61.l Boolean bool, @Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l Boolean bool2, @Y61.k FromSpace fromSpace, @Y61.l String str6, @Y61.l GigParams gigParams, @Y61.l AdvertNavBarStyle advertNavBarStyle) {
        this.f71325b = str;
        this.f71326c = str2;
        this.f71327d = str3;
        this.f71328e = str4;
        this.f71329f = image;
        this.f71330g = str5;
        this.f71331h = bool;
        this.f71332i = advertDetailsStyle;
        this.f71333j = bool2;
        this.f71334k = fromSpace;
        this.f71335l = str6;
        this.f71336m = gigParams;
        this.f71337n = advertNavBarStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFastOpenParams)) {
            return false;
        }
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = (AdvertDetailsFastOpenParams) obj;
        return kotlin.jvm.internal.L.f(this.f71325b, advertDetailsFastOpenParams.f71325b) && kotlin.jvm.internal.L.f(this.f71326c, advertDetailsFastOpenParams.f71326c) && kotlin.jvm.internal.L.f(this.f71327d, advertDetailsFastOpenParams.f71327d) && kotlin.jvm.internal.L.f(this.f71328e, advertDetailsFastOpenParams.f71328e) && kotlin.jvm.internal.L.f(this.f71329f, advertDetailsFastOpenParams.f71329f) && kotlin.jvm.internal.L.f(this.f71330g, advertDetailsFastOpenParams.f71330g) && kotlin.jvm.internal.L.f(this.f71331h, advertDetailsFastOpenParams.f71331h) && this.f71332i == advertDetailsFastOpenParams.f71332i && kotlin.jvm.internal.L.f(this.f71333j, advertDetailsFastOpenParams.f71333j) && this.f71334k == advertDetailsFastOpenParams.f71334k && kotlin.jvm.internal.L.f(this.f71335l, advertDetailsFastOpenParams.f71335l) && kotlin.jvm.internal.L.f(this.f71336m, advertDetailsFastOpenParams.f71336m) && kotlin.jvm.internal.L.f(this.f71337n, advertDetailsFastOpenParams.f71337n);
    }

    public final int hashCode() {
        String str = this.f71325b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f71326c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71327d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f71328e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Image image = this.f71329f;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        String str5 = this.f71330g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f71331h;
        int iHashCode7 = (this.f71332i.hashCode() + ((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Boolean bool2 = this.f71333j;
        int iHashCode8 = (this.f71334k.hashCode() + ((iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31)) * 31;
        String str6 = this.f71335l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GigParams gigParams = this.f71336m;
        int iHashCode10 = (iHashCode9 + (gigParams == null ? 0 : gigParams.hashCode())) * 31;
        AdvertNavBarStyle advertNavBarStyle = this.f71337n;
        return iHashCode10 + (advertNavBarStyle != null ? advertNavBarStyle.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsFastOpenParams(title=" + this.f71325b + ", price=" + this.f71326c + ", normalizedPrice=" + this.f71327d + ", oldPrice=" + this.f71328e + ", image=" + this.f71329f + ", categoryId=" + this.f71330g + ", needShowGallery=" + this.f71331h + ", advertDetailsStyle=" + this.f71332i + ", isActive=" + this.f71333j + ", fromSpace=" + this.f71334k + ", fromPage=" + this.f71335l + ", gigParams=" + this.f71336m + ", _navBarStyle=" + this.f71337n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f71325b);
        parcel.writeString(this.f71326c);
        parcel.writeString(this.f71327d);
        parcel.writeString(this.f71328e);
        parcel.writeParcelable(this.f71329f, i12);
        parcel.writeString(this.f71330g);
        Boolean bool = this.f71331h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f71332i.name());
        Boolean bool2 = this.f71333j;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.f71334k.name());
        parcel.writeString(this.f71335l);
        GigParams gigParams = this.f71336m;
        if (gigParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigParams.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f71337n, i12);
    }
}
