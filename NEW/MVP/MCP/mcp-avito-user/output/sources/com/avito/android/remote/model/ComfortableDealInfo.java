package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInfo.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0003012B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010\u0012¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealInfo;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "Lcom/avito/android/remote/model/ComfortableDealInfo$Banner;", "banners", "Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "button", "Lcom/avito/android/remote/model/ComfortableDealInfo$Screen;", "screens", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ComfortableDealInfo$Button;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ComfortableDealInfo$Button;Ljava/util/List;)Lcom/avito/android/remote/model/ComfortableDealInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getBanners", "Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "getButton", "getScreens", "Banner", "Button", "Screen", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ComfortableDealInfo> CREATOR = new Creator();

    @c("banners")
    @k
    private final List<Banner> banners;

    @c("button")
    @k
    private final Button button;

    @c("screens")
    @k
    private final List<Screen> screens;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComfortableDealInfo.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJD\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealInfo$Banner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "text", "textStyle", "icon", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ComfortableDealInfo$Banner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/lang/String;", "getText", "getTextStyle", "getIcon", "getBackground", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Banner implements Parcelable {

        @k
        public static final Parcelable.Creator<Banner> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @k
        private final String background;

        @c("icon")
        @k
        private final String icon;

        @c("image")
        @l
        private final UniversalImage image;

        @c("text")
        @k
        private final String text;

        @c("textStyle")
        @k
        private final String textStyle;

        /* compiled from: ComfortableDealInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Banner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Banner createFromParcel(@k Parcel parcel) {
                return new Banner((UniversalImage) parcel.readParcelable(Banner.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Banner[] newArray(int i12) {
                return new Banner[i12];
            }
        }

        public Banner(@l UniversalImage universalImage, @k String str, @k String str2, @k String str3, @k String str4) {
            this.image = universalImage;
            this.text = str;
            this.textStyle = str2;
            this.icon = str3;
            this.background = str4;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, UniversalImage universalImage, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = banner.image;
            }
            if ((i12 & 2) != 0) {
                str = banner.text;
            }
            String str5 = str;
            if ((i12 & 4) != 0) {
                str2 = banner.textStyle;
            }
            String str6 = str2;
            if ((i12 & 8) != 0) {
                str3 = banner.icon;
            }
            String str7 = str3;
            if ((i12 & 16) != 0) {
                str4 = banner.background;
            }
            return banner.copy(universalImage, str5, str6, str7, str4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTextStyle() {
            return this.textStyle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        @k
        public final Banner copy(@l UniversalImage image, @k String text, @k String textStyle, @k String icon, @k String background) {
            return new Banner(image, text, textStyle, icon, background);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return L.f(this.image, banner.image) && L.f(this.text, banner.text) && L.f(this.textStyle, banner.textStyle) && L.f(this.icon, banner.icon) && L.f(this.background, banner.background);
        }

        @k
        public final String getBackground() {
            return this.background;
        }

        @k
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            UniversalImage universalImage = this.image;
            return this.background.hashCode() + H.d(H.d(H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.text), 31, this.textStyle), 31, this.icon);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(image=");
            sb2.append(this.image);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", textStyle=");
            sb2.append(this.textStyle);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", background=");
            return C22026a.c(sb2, this.background, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.text);
            parcel.writeString(this.textStyle);
            parcel.writeString(this.icon);
            parcel.writeString(this.background);
        }
    }

    /* compiled from: ComfortableDealInfo.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @k
        private final String style;

        @c("text")
        @k
        private final String text;

        /* compiled from: ComfortableDealInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k String str2, @k DeepLink deepLink) {
            this.text = str;
            this.style = str2;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.text;
            }
            if ((i12 & 2) != 0) {
                str2 = button.style;
            }
            if ((i12 & 4) != 0) {
                deepLink = button.deepLink;
            }
            return button.copy(str, str2, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final Button copy(@k String text, @k String style, @k DeepLink deepLink) {
            return new Button(text, style, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.text, button.text) && L.f(this.style, button.style) && L.f(this.deepLink, button.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.deepLink.hashCode() + H.d(this.text.hashCode() * 31, 31, this.style);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: ComfortableDealInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealInfo createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(Banner.CREATOR, parcel, arrayList, iC3, 1);
            }
            Button buttonCreateFromParcel = Button.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(Screen.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new ComfortableDealInfo(string, string2, arrayList, buttonCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealInfo[] newArray(int i12) {
            return new ComfortableDealInfo[i12];
        }
    }

    /* compiled from: ComfortableDealInfo.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/ComfortableDealInfo$Screen;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "button", "", "pageType", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ComfortableDealInfo$Button;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ComfortableDealInfo$Button;Ljava/lang/String;)Lcom/avito/android/remote/model/ComfortableDealInfo$Screen;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getContent", "Lcom/avito/android/remote/model/ComfortableDealInfo$Button;", "getButton", "Ljava/lang/String;", "getPageType", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Screen implements Parcelable {

        @k
        public static final Parcelable.Creator<Screen> CREATOR = new Creator();

        @c("button")
        @k
        private final Button button;

        @c("content")
        @k
        private final AttributedText content;

        @c("image")
        @k
        private final UniversalImage image;

        @c("pageType")
        @k
        private final String pageType;

        /* compiled from: ComfortableDealInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Screen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Screen createFromParcel(@k Parcel parcel) {
                return new Screen((UniversalImage) parcel.readParcelable(Screen.class.getClassLoader()), (AttributedText) parcel.readParcelable(Screen.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Screen[] newArray(int i12) {
                return new Screen[i12];
            }
        }

        public Screen(@k UniversalImage universalImage, @k AttributedText attributedText, @k Button button, @k String str) {
            this.image = universalImage;
            this.content = attributedText;
            this.button = button;
            this.pageType = str;
        }

        public static /* synthetic */ Screen copy$default(Screen screen, UniversalImage universalImage, AttributedText attributedText, Button button, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = screen.image;
            }
            if ((i12 & 2) != 0) {
                attributedText = screen.content;
            }
            if ((i12 & 4) != 0) {
                button = screen.button;
            }
            if ((i12 & 8) != 0) {
                str = screen.pageType;
            }
            return screen.copy(universalImage, attributedText, button, str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getContent() {
            return this.content;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getPageType() {
            return this.pageType;
        }

        @k
        public final Screen copy(@k UniversalImage image, @k AttributedText content, @k Button button, @k String pageType) {
            return new Screen(image, content, button, pageType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) other;
            return L.f(this.image, screen.image) && L.f(this.content, screen.content) && L.f(this.button, screen.button) && L.f(this.pageType, screen.pageType);
        }

        @k
        public final Button getButton() {
            return this.button;
        }

        @k
        public final AttributedText getContent() {
            return this.content;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final String getPageType() {
            return this.pageType;
        }

        public int hashCode() {
            return this.pageType.hashCode() + ((this.button.hashCode() + a.b(this.image.hashCode() * 31, 31, this.content)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Screen(image=");
            sb2.append(this.image);
            sb2.append(", content=");
            sb2.append(this.content);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", pageType=");
            return C22026a.c(sb2, this.pageType, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.content, flags);
            this.button.writeToParcel(parcel, flags);
            parcel.writeString(this.pageType);
        }
    }

    public ComfortableDealInfo(@k String str, @k String str2, @k List<Banner> list, @k Button button, @k List<Screen> list2) {
        this.title = str;
        this.subtitle = str2;
        this.banners = list;
        this.button = button;
        this.screens = list2;
    }

    public static /* synthetic */ ComfortableDealInfo copy$default(ComfortableDealInfo comfortableDealInfo, String str, String str2, List list, Button button, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = comfortableDealInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = comfortableDealInfo.subtitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            list = comfortableDealInfo.banners;
        }
        List list3 = list;
        if ((i12 & 8) != 0) {
            button = comfortableDealInfo.button;
        }
        Button button2 = button;
        if ((i12 & 16) != 0) {
            list2 = comfortableDealInfo.screens;
        }
        return comfortableDealInfo.copy(str, str3, list3, button2, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final List<Banner> component3() {
        return this.banners;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    public final List<Screen> component5() {
        return this.screens;
    }

    @k
    public final ComfortableDealInfo copy(@k String title, @k String subtitle, @k List<Banner> banners, @k Button button, @k List<Screen> screens) {
        return new ComfortableDealInfo(title, subtitle, banners, button, screens);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealInfo)) {
            return false;
        }
        ComfortableDealInfo comfortableDealInfo = (ComfortableDealInfo) other;
        return L.f(this.title, comfortableDealInfo.title) && L.f(this.subtitle, comfortableDealInfo.subtitle) && L.f(this.banners, comfortableDealInfo.banners) && L.f(this.button, comfortableDealInfo.button) && L.f(this.screens, comfortableDealInfo.screens);
    }

    @k
    public final List<Banner> getBanners() {
        return this.banners;
    }

    @k
    public final Button getButton() {
        return this.button;
    }

    @k
    public final List<Screen> getScreens() {
        return this.screens;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.screens.hashCode() + ((this.button.hashCode() + H.e(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.banners)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealInfo(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", banners=");
        sb2.append(this.banners);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", screens=");
        return H.p(sb2, this.screens, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator itJ = C0.j(this.banners, parcel);
        while (itJ.hasNext()) {
            ((Banner) itJ.next()).writeToParcel(parcel, flags);
        }
        this.button.writeToParcel(parcel, flags);
        Iterator itJ2 = C0.j(this.screens, parcel);
        while (itJ2.hasNext()) {
            ((Screen) itJ2.next()).writeToParcel(parcel, flags);
        }
    }
}
