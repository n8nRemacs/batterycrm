package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.FontStyleKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: AdvertNavBarStyle.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001bR\u0011\u00109\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b8\u0010\u0010¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "elementsColor", "Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "_themeAppearance", "Lcom/avito/android/remote/model/UniversalImage;", "logo", "Lcom/avito/android/deep_linking/links/DeepLink;", "logoDeeplink", "", "navigationIcon", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component3", "()Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "prepareForNextScreen", "()Lcom/avito/android/remote/model/AdvertNavBarStyle;", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertNavBarStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getElementsColor", "Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "Lcom/avito/android/remote/model/UniversalImage;", "getLogo", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLogoDeeplink", "Ljava/lang/String;", "getNavigationIcon", "getThemeAppearance", "themeAppearance", "ThemeAppearance", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertNavBarStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertNavBarStyle> CREATOR = new Creator();

    @c("themeAppearance")
    @l
    private final ThemeAppearance _themeAppearance;

    @c("backgroundColor")
    @k
    private final UniversalColor backgroundColor;

    @c("elementsColor")
    @k
    private final UniversalColor elementsColor;

    @c("logo")
    @l
    private final UniversalImage logo;

    @c("logoDeeplink")
    @l
    private final DeepLink logoDeeplink;

    @c("leftIcon")
    @l
    private final String navigationIcon;

    /* compiled from: AdvertNavBarStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertNavBarStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBarStyle createFromParcel(@k Parcel parcel) {
            return new AdvertNavBarStyle((UniversalColor) parcel.readParcelable(AdvertNavBarStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertNavBarStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : ThemeAppearance.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(AdvertNavBarStyle.class.getClassLoader()), (DeepLink) parcel.readParcelable(AdvertNavBarStyle.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBarStyle[] newArray(int i12) {
            return new AdvertNavBarStyle[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertNavBarStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarStyle$ThemeAppearance;", "", "(Ljava/lang/String;I)V", "Dark", "Light", "AlwaysDark", "AlwaysLight", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ThemeAppearance {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeAppearance[] $VALUES;

        @c("dark")
        public static final ThemeAppearance Dark = new ThemeAppearance("Dark", 0);

        @c(FontStyleKt.LIGHT)
        public static final ThemeAppearance Light = new ThemeAppearance("Light", 1);

        @c("alwaysDark")
        public static final ThemeAppearance AlwaysDark = new ThemeAppearance("AlwaysDark", 2);

        @c("alwaysLight")
        public static final ThemeAppearance AlwaysLight = new ThemeAppearance("AlwaysLight", 3);

        private static final /* synthetic */ ThemeAppearance[] $values() {
            return new ThemeAppearance[]{Dark, Light, AlwaysDark, AlwaysLight};
        }

        static {
            ThemeAppearance[] themeAppearanceArr$values = $values();
            $VALUES = themeAppearanceArr$values;
            $ENTRIES = kotlin.enums.c.a(themeAppearanceArr$values);
        }

        private ThemeAppearance(String str, int i12) {
        }

        @k
        public static a<ThemeAppearance> getEntries() {
            return $ENTRIES;
        }

        public static ThemeAppearance valueOf(String str) {
            return (ThemeAppearance) Enum.valueOf(ThemeAppearance.class, str);
        }

        public static ThemeAppearance[] values() {
            return (ThemeAppearance[]) $VALUES.clone();
        }
    }

    public AdvertNavBarStyle(@k UniversalColor universalColor, @k UniversalColor universalColor2, @l ThemeAppearance themeAppearance, @l UniversalImage universalImage, @l DeepLink deepLink, @l String str) {
        this.backgroundColor = universalColor;
        this.elementsColor = universalColor2;
        this._themeAppearance = themeAppearance;
        this.logo = universalImage;
        this.logoDeeplink = deepLink;
        this.navigationIcon = str;
    }

    /* renamed from: component3, reason: from getter */
    private final ThemeAppearance get_themeAppearance() {
        return this._themeAppearance;
    }

    public static /* synthetic */ AdvertNavBarStyle copy$default(AdvertNavBarStyle advertNavBarStyle, UniversalColor universalColor, UniversalColor universalColor2, ThemeAppearance themeAppearance, UniversalImage universalImage, DeepLink deepLink, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalColor = advertNavBarStyle.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            universalColor2 = advertNavBarStyle.elementsColor;
        }
        UniversalColor universalColor3 = universalColor2;
        if ((i12 & 4) != 0) {
            themeAppearance = advertNavBarStyle._themeAppearance;
        }
        ThemeAppearance themeAppearance2 = themeAppearance;
        if ((i12 & 8) != 0) {
            universalImage = advertNavBarStyle.logo;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            deepLink = advertNavBarStyle.logoDeeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 32) != 0) {
            str = advertNavBarStyle.navigationIcon;
        }
        return advertNavBarStyle.copy(universalColor, universalColor3, themeAppearance2, universalImage2, deepLink2, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getLogo() {
        return this.logo;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeepLink getLogoDeeplink() {
        return this.logoDeeplink;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    @k
    public final AdvertNavBarStyle copy(@k UniversalColor backgroundColor, @k UniversalColor elementsColor, @l ThemeAppearance _themeAppearance, @l UniversalImage logo, @l DeepLink logoDeeplink, @l String navigationIcon) {
        return new AdvertNavBarStyle(backgroundColor, elementsColor, _themeAppearance, logo, logoDeeplink, navigationIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertNavBarStyle)) {
            return false;
        }
        AdvertNavBarStyle advertNavBarStyle = (AdvertNavBarStyle) other;
        return L.f(this.backgroundColor, advertNavBarStyle.backgroundColor) && L.f(this.elementsColor, advertNavBarStyle.elementsColor) && this._themeAppearance == advertNavBarStyle._themeAppearance && L.f(this.logo, advertNavBarStyle.logo) && L.f(this.logoDeeplink, advertNavBarStyle.logoDeeplink) && L.f(this.navigationIcon, advertNavBarStyle.navigationIcon);
    }

    @k
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final UniversalColor getElementsColor() {
        return this.elementsColor;
    }

    @l
    public final UniversalImage getLogo() {
        return this.logo;
    }

    @l
    public final DeepLink getLogoDeeplink() {
        return this.logoDeeplink;
    }

    @l
    public final String getNavigationIcon() {
        return this.navigationIcon;
    }

    @k
    public final ThemeAppearance getThemeAppearance() {
        ThemeAppearance themeAppearance = this._themeAppearance;
        return themeAppearance == null ? ThemeAppearance.Dark : themeAppearance;
    }

    public int hashCode() {
        int i12 = com.avito.android.actions_sheet.a.i(this.elementsColor, this.backgroundColor.hashCode() * 31, 31);
        ThemeAppearance themeAppearance = this._themeAppearance;
        int iHashCode = (i12 + (themeAppearance == null ? 0 : themeAppearance.hashCode())) * 31;
        UniversalImage universalImage = this.logo;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.logoDeeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.navigationIcon;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final AdvertNavBarStyle prepareForNextScreen() {
        return copy$default(this, null, null, null, null, null, null, 7, null);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertNavBarStyle(backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", elementsColor=");
        sb2.append(this.elementsColor);
        sb2.append(", _themeAppearance=");
        sb2.append(this._themeAppearance);
        sb2.append(", logo=");
        sb2.append(this.logo);
        sb2.append(", logoDeeplink=");
        sb2.append(this.logoDeeplink);
        sb2.append(", navigationIcon=");
        return C22026a.c(sb2, this.navigationIcon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.elementsColor, flags);
        ThemeAppearance themeAppearance = this._themeAppearance;
        if (themeAppearance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(themeAppearance.name());
        }
        parcel.writeParcelable(this.logo, flags);
        parcel.writeParcelable(this.logoDeeplink, flags);
        parcel.writeString(this.navigationIcon);
    }
}
