package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeroBannerWidget.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002LMB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!Jt\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010\u0018R$\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!R(\u0010D\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u0010K\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/avito/android/remote/model/serp/HeroBannerWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "backgroundImage", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "", "gradientToken", "Lcom/avito/android/remote/model/ToolbarConfig;", "toolbarConfig", "shadowColor", "<init>", "(Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ToolbarConfig;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/avito/android/remote/model/ToolbarConfig;", "component8", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/ToolbarConfig;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/serp/HeroBannerWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getBackgroundImage", "Ljava/util/List;", "getGradientColors", "Ljava/lang/String;", "getGradientToken", "Lcom/avito/android/remote/model/ToolbarConfig;", "getToolbarConfig", "Lcom/avito/android/remote/model/UniversalColor;", "getShadowColor", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "HeaderIcon", "HeroBannerTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HeroBannerWidget implements SerpElement {

    @k
    public static final Parcelable.Creator<HeroBannerWidget> CREATOR = new Creator();

    @c("backgroundImage")
    @l
    private final UniversalImage backgroundImage;

    @c("backgroundLinearGradient")
    @l
    private final List<UniversalColor> gradientColors;

    @c("backgroundGradientToken")
    @l
    private final String gradientToken;

    @c("image")
    @l
    private final UniversalImage image;

    @c("shadowColor")
    @k
    private final UniversalColor shadowColor;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final HeroBannerTitle title;

    @c("toolbarConfig")
    @l
    private final ToolbarConfig toolbarConfig;
    private long uniqueId;

    /* compiled from: HeroBannerWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeroBannerWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeroBannerWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            HeroBannerTitle heroBannerTitleCreateFromParcel = HeroBannerTitle.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(HeroBannerWidget.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(HeroBannerWidget.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(HeroBannerWidget.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(HeroBannerWidget.class, parcel, arrayList, iL2, 1);
                }
            }
            return new HeroBannerWidget(heroBannerTitleCreateFromParcel, attributedText, universalImage, universalImage2, arrayList, parcel.readString(), parcel.readInt() != 0 ? ToolbarConfig.CREATOR.createFromParcel(parcel) : null, (UniversalColor) parcel.readParcelable(HeroBannerWidget.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeroBannerWidget[] newArray(int i12) {
            return new HeroBannerWidget[i12];
        }
    }

    /* compiled from: HeroBannerWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeaderIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<HeaderIcon> CREATOR = new Creator();

        @c("color")
        @k
        private final UniversalColor color;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        /* compiled from: HeroBannerWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HeaderIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeaderIcon createFromParcel(@k Parcel parcel) {
                return new HeaderIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(HeaderIcon.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeaderIcon[] newArray(int i12) {
                return new HeaderIcon[i12];
            }
        }

        public HeaderIcon(@l String str, @k UniversalColor universalColor) {
            this.style = str;
            this.color = universalColor;
        }

        public static /* synthetic */ HeaderIcon copy$default(HeaderIcon headerIcon, String str, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = headerIcon.style;
            }
            if ((i12 & 2) != 0) {
                universalColor = headerIcon.color;
            }
            return headerIcon.copy(str, universalColor);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final HeaderIcon copy(@l String style, @k UniversalColor color) {
            return new HeaderIcon(style, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderIcon)) {
                return false;
            }
            HeaderIcon headerIcon = (HeaderIcon) other;
            return L.f(this.style, headerIcon.style) && L.f(this.color, headerIcon.color);
        }

        @k
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            String str = this.style;
            return this.color.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HeaderIcon(style=");
            sb2.append(this.style);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.style);
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* compiled from: HeroBannerWidget.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;", "headerIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;)Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeroBannerTitle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/serp/HeroBannerWidget$HeaderIcon;", "getHeaderIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HeroBannerTitle implements Parcelable {

        @k
        public static final Parcelable.Creator<HeroBannerTitle> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        @c("headerButton")
        @l
        private final HeaderIcon headerIcon;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: HeroBannerWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HeroBannerTitle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeroBannerTitle createFromParcel(@k Parcel parcel) {
                return new HeroBannerTitle((AttributedText) parcel.readParcelable(HeroBannerTitle.class.getClassLoader()), (DeepLink) parcel.readParcelable(HeroBannerTitle.class.getClassLoader()), parcel.readInt() == 0 ? null : HeaderIcon.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final HeroBannerTitle[] newArray(int i12) {
                return new HeroBannerTitle[i12];
            }
        }

        public HeroBannerTitle(@k AttributedText attributedText, @k DeepLink deepLink, @l HeaderIcon headerIcon) {
            this.text = attributedText;
            this.deeplink = deepLink;
            this.headerIcon = headerIcon;
        }

        public static /* synthetic */ HeroBannerTitle copy$default(HeroBannerTitle heroBannerTitle, AttributedText attributedText, DeepLink deepLink, HeaderIcon headerIcon, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedText = heroBannerTitle.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = heroBannerTitle.deeplink;
            }
            if ((i12 & 4) != 0) {
                headerIcon = heroBannerTitle.headerIcon;
            }
            return heroBannerTitle.copy(attributedText, deepLink, headerIcon);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final HeaderIcon getHeaderIcon() {
            return this.headerIcon;
        }

        @k
        public final HeroBannerTitle copy(@k AttributedText text, @k DeepLink deeplink, @l HeaderIcon headerIcon) {
            return new HeroBannerTitle(text, deeplink, headerIcon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeroBannerTitle)) {
                return false;
            }
            HeroBannerTitle heroBannerTitle = (HeroBannerTitle) other;
            return L.f(this.text, heroBannerTitle.text) && L.f(this.deeplink, heroBannerTitle.deeplink) && L.f(this.headerIcon, heroBannerTitle.headerIcon);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final HeaderIcon getHeaderIcon() {
            return this.headerIcon;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            int iE2 = a.e(this.deeplink, this.text.hashCode() * 31, 31);
            HeaderIcon headerIcon = this.headerIcon;
            return iE2 + (headerIcon == null ? 0 : headerIcon.hashCode());
        }

        @k
        public String toString() {
            return "HeroBannerTitle(text=" + this.text + ", deeplink=" + this.deeplink + ", headerIcon=" + this.headerIcon + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.deeplink, flags);
            HeaderIcon headerIcon = this.headerIcon;
            if (headerIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                headerIcon.writeToParcel(parcel, flags);
            }
        }
    }

    public HeroBannerWidget(@k HeroBannerTitle heroBannerTitle, @l AttributedText attributedText, @l UniversalImage universalImage, @l UniversalImage universalImage2, @l List<UniversalColor> list, @l String str, @l ToolbarConfig toolbarConfig, @k UniversalColor universalColor) {
        this.title = heroBannerTitle;
        this.subtitle = attributedText;
        this.image = universalImage;
        this.backgroundImage = universalImage2;
        this.gradientColors = list;
        this.gradientToken = str;
        this.toolbarConfig = toolbarConfig;
        this.shadowColor = universalColor;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final HeroBannerTitle getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final List<UniversalColor> component5() {
        return this.gradientColors;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getGradientToken() {
        return this.gradientToken;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final UniversalColor getShadowColor() {
        return this.shadowColor;
    }

    @k
    public final HeroBannerWidget copy(@k HeroBannerTitle title, @l AttributedText subtitle, @l UniversalImage image, @l UniversalImage backgroundImage, @l List<UniversalColor> gradientColors, @l String gradientToken, @l ToolbarConfig toolbarConfig, @k UniversalColor shadowColor) {
        return new HeroBannerWidget(title, subtitle, image, backgroundImage, gradientColors, gradientToken, toolbarConfig, shadowColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroBannerWidget)) {
            return false;
        }
        HeroBannerWidget heroBannerWidget = (HeroBannerWidget) other;
        return L.f(this.title, heroBannerWidget.title) && L.f(this.subtitle, heroBannerWidget.subtitle) && L.f(this.image, heroBannerWidget.image) && L.f(this.backgroundImage, heroBannerWidget.backgroundImage) && L.f(this.gradientColors, heroBannerWidget.gradientColors) && L.f(this.gradientToken, heroBannerWidget.gradientToken) && L.f(this.toolbarConfig, heroBannerWidget.toolbarConfig) && L.f(this.shadowColor, heroBannerWidget.shadowColor);
    }

    @l
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final List<UniversalColor> getGradientColors() {
        return this.gradientColors;
    }

    @l
    public final String getGradientToken() {
        return this.gradientToken;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final UniversalColor getShadowColor() {
        return this.shadowColor;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final HeroBannerTitle getTitle() {
        return this.title;
    }

    @l
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.backgroundImage;
        int iHashCode4 = (iHashCode3 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        List<UniversalColor> list = this.gradientColors;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.gradientToken;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        return this.shadowColor.hashCode() + ((iHashCode6 + (toolbarConfig != null ? toolbarConfig.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeroBannerWidget(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", backgroundImage=");
        sb2.append(this.backgroundImage);
        sb2.append(", gradientColors=");
        sb2.append(this.gradientColors);
        sb2.append(", gradientToken=");
        sb2.append(this.gradientToken);
        sb2.append(", toolbarConfig=");
        sb2.append(this.toolbarConfig);
        sb2.append(", shadowColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.shadowColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.title.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.backgroundImage, flags);
        List<UniversalColor> list = this.gradientColors;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.gradientToken);
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarConfig.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.shadowColor, flags);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
