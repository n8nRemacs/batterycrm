package com.avito.android.remote.model.category_parameters.slot.header;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionSeparatorSlotConfig.kt */
@d
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001EBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0086\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J\u0010\u0010(\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\b\u0011\u0010$¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "", "showTopSeparator", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "badgeText", "badgeOnceShowId", "", "topMargin", "Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "isRealtyPhotos", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;Lcom/avito/android/remote/model/search/Theme;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;", "component9", "()Lcom/avito/android/remote/model/search/Theme;", "component10", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;Lcom/avito/android/remote/model/search/Theme;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getShowTopSeparator", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "getBadgeText", "getBadgeOnceShowId", "Ljava/lang/Integer;", "getTopMargin", "Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;", "getTooltip", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "Ljava/lang/Boolean;", "Tooltip", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SectionSeparatorSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<SectionSeparatorSlotConfig> CREATOR = new Creator();

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("badgeOnceShowId")
    @l
    private final String badgeOnceShowId;

    @c("badgeText")
    @l
    private final String badgeText;

    @c("isRealtyPhotos")
    @l
    private final Boolean isRealtyPhotos;

    @c("showTopSeparator")
    private final boolean showTopSeparator;

    @c("subtitle")
    @l
    private final String subtitle;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final Theme theme;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final Tooltip tooltip;

    @c("topMargin")
    @l
    private final Integer topMargin;

    /* compiled from: SectionSeparatorSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SectionSeparatorSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionSeparatorSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SectionSeparatorSlotConfig.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Tooltip tooltipCreateFromParcel = parcel.readInt() == 0 ? null : Tooltip.CREATOR.createFromParcel(parcel);
            Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SectionSeparatorSlotConfig(string, z12, string2, attributedText, string3, string4, numValueOf, tooltipCreateFromParcel, themeValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SectionSeparatorSlotConfig[] newArray(int i12) {
            return new SectionSeparatorSlotConfig[i12];
        }
    }

    /* compiled from: SectionSeparatorSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;", "Landroid/os/Parcelable;", "", "body", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/header/SectionSeparatorSlotConfig$Tooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBody", "getTag", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();

        @c("body")
        @k
        private final String body;

        @c("tag")
        @k
        private final String tag;

        /* compiled from: SectionSeparatorSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip createFromParcel(@k Parcel parcel) {
                return new Tooltip(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@k String str, @k String str2) {
            this.body = str;
            this.tag = str2;
        }

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tooltip.body;
            }
            if ((i12 & 2) != 0) {
                str2 = tooltip.tag;
            }
            return tooltip.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @k
        public final Tooltip copy(@k String body, @k String tag) {
            return new Tooltip(body, tag);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return L.f(this.body, tooltip.body) && L.f(this.tag, tooltip.tag);
        }

        @k
        public final String getBody() {
            return this.body;
        }

        @k
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return this.tag.hashCode() + (this.body.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(body=");
            sb2.append(this.body);
            sb2.append(", tag=");
            return C22026a.c(sb2, this.tag, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.body);
            parcel.writeString(this.tag);
        }
    }

    public SectionSeparatorSlotConfig(@l String str, boolean z12, @l String str2, @l AttributedText attributedText, @l String str3, @l String str4, @l Integer num, @l Tooltip tooltip, @l Theme theme, @l Boolean bool) {
        this.title = str;
        this.showTopSeparator = z12;
        this.subtitle = str2;
        this.attributedSubtitle = attributedText;
        this.badgeText = str3;
        this.badgeOnceShowId = str4;
        this.topMargin = num;
        this.tooltip = tooltip;
        this.theme = theme;
        this.isRealtyPhotos = bool;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getIsRealtyPhotos() {
        return this.isRealtyPhotos;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowTopSeparator() {
        return this.showTopSeparator;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getBadgeOnceShowId() {
        return this.badgeOnceShowId;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    @k
    public final SectionSeparatorSlotConfig copy(@l String title, boolean showTopSeparator, @l String subtitle, @l AttributedText attributedSubtitle, @l String badgeText, @l String badgeOnceShowId, @l Integer topMargin, @l Tooltip tooltip, @l Theme theme, @l Boolean isRealtyPhotos) {
        return new SectionSeparatorSlotConfig(title, showTopSeparator, subtitle, attributedSubtitle, badgeText, badgeOnceShowId, topMargin, tooltip, theme, isRealtyPhotos);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionSeparatorSlotConfig)) {
            return false;
        }
        SectionSeparatorSlotConfig sectionSeparatorSlotConfig = (SectionSeparatorSlotConfig) other;
        return L.f(this.title, sectionSeparatorSlotConfig.title) && this.showTopSeparator == sectionSeparatorSlotConfig.showTopSeparator && L.f(this.subtitle, sectionSeparatorSlotConfig.subtitle) && L.f(this.attributedSubtitle, sectionSeparatorSlotConfig.attributedSubtitle) && L.f(this.badgeText, sectionSeparatorSlotConfig.badgeText) && L.f(this.badgeOnceShowId, sectionSeparatorSlotConfig.badgeOnceShowId) && L.f(this.topMargin, sectionSeparatorSlotConfig.topMargin) && L.f(this.tooltip, sectionSeparatorSlotConfig.tooltip) && this.theme == sectionSeparatorSlotConfig.theme && L.f(this.isRealtyPhotos, sectionSeparatorSlotConfig.isRealtyPhotos);
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final String getBadgeOnceShowId() {
        return this.badgeOnceShowId;
    }

    @l
    public final String getBadgeText() {
        return this.badgeText;
    }

    public final boolean getShowTopSeparator() {
        return this.showTopSeparator;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final Theme getTheme() {
        return this.theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @l
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        String str = this.title;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.showTopSeparator);
        String str2 = this.subtitle;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.badgeText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.badgeOnceShowId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.topMargin;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Tooltip tooltip = this.tooltip;
        int iHashCode6 = (iHashCode5 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        Theme theme = this.theme;
        int iHashCode7 = (iHashCode6 + (theme == null ? 0 : theme.hashCode())) * 31;
        Boolean bool = this.isRealtyPhotos;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isRealtyPhotos() {
        return this.isRealtyPhotos;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SectionSeparatorSlotConfig(title=");
        sb2.append(this.title);
        sb2.append(", showTopSeparator=");
        sb2.append(this.showTopSeparator);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", badgeText=");
        sb2.append(this.badgeText);
        sb2.append(", badgeOnceShowId=");
        sb2.append(this.badgeOnceShowId);
        sb2.append(", topMargin=");
        sb2.append(this.topMargin);
        sb2.append(", tooltip=");
        sb2.append(this.tooltip);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", isRealtyPhotos=");
        return C0.g(sb2, this.isRealtyPhotos, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.showTopSeparator ? 1 : 0);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        parcel.writeString(this.badgeText);
        parcel.writeString(this.badgeOnceShowId);
        Integer num = this.topMargin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Tooltip tooltip = this.tooltip;
        if (tooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltip.writeToParcel(parcel, flags);
        }
        Theme theme = this.theme;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        Boolean bool = this.isRealtyPhotos;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ SectionSeparatorSlotConfig(String str, boolean z12, String str2, AttributedText attributedText, String str3, String str4, Integer num, Tooltip tooltip, Theme theme, Boolean bool, int i12, C42822w c42822w) {
        this(str, z12, str2, (i12 & 8) != 0 ? null : attributedText, str3, str4, num, tooltip, (i12 & 256) != 0 ? null : theme, (i12 & 512) != 0 ? null : bool);
    }
}
