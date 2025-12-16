package com.avito.android.remote.model.autoteka_teaser_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserSelectItemResponse.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "title", "badgeText", "price", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "callRequestLink", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportExampleLink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", "component6", "()Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "component7", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;Lcom/avito/android/remote/model/auto_select/SelectButtonParams;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;)Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "getTitle", "getBadgeText", "getPrice", "Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", "getBackground", "Lcom/avito/android/remote/model/auto_select/SelectButtonParams;", "getCallRequestLink", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "getReportExampleLink", "Background", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaTeaserSelectV2Result implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaTeaserSelectV2Result> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final Background background;

    @c("badgeText")
    @k
    private final String badgeText;

    @c("callRequestLink")
    @l
    private final SelectButtonParams callRequestLink;

    @c("description")
    @l
    private final AttributedText description;

    @c("price")
    @l
    private final AttributedText price;

    @c("reportExampleLink")
    @l
    private final AutotekaReportLink reportExampleLink;

    @c("title")
    @l
    private final String title;

    /* compiled from: AutotekaTeaserSelectItemResponse.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", "Landroid/os/Parcelable;", "", "color", "gradient", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/autoteka_teaser_select/AutotekaTeaserSelectV2Result$Background;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getColor", "getGradient", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @k
        public static final Parcelable.Creator<Background> CREATOR = new Creator();

        @c("color")
        @l
        private final String color;

        @c("gradient")
        @l
        private final String gradient;

        /* compiled from: AutotekaTeaserSelectItemResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Background> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Background createFromParcel(@k Parcel parcel) {
                return new Background(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Background[] newArray(int i12) {
                return new Background[i12];
            }
        }

        public Background(@l String str, @l String str2) {
            this.color = str;
            this.gradient = str2;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = background.color;
            }
            if ((i12 & 2) != 0) {
                str2 = background.gradient;
            }
            return background.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getGradient() {
            return this.gradient;
        }

        @k
        public final Background copy(@l String color, @l String gradient) {
            return new Background(color, gradient);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return L.f(this.color, background.color) && L.f(this.gradient, background.gradient);
        }

        @l
        public final String getColor() {
            return this.color;
        }

        @l
        public final String getGradient() {
            return this.gradient;
        }

        public int hashCode() {
            String str = this.color;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gradient;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Background(color=");
            sb2.append(this.color);
            sb2.append(", gradient=");
            return C22026a.c(sb2, this.gradient, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.color);
            parcel.writeString(this.gradient);
        }
    }

    /* compiled from: AutotekaTeaserSelectItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaTeaserSelectV2Result> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectV2Result createFromParcel(@k Parcel parcel) {
            return new AutotekaTeaserSelectV2Result((AttributedText) parcel.readParcelable(AutotekaTeaserSelectV2Result.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AutotekaTeaserSelectV2Result.class.getClassLoader()), Background.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelectButtonParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AutotekaReportLink.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaTeaserSelectV2Result[] newArray(int i12) {
            return new AutotekaTeaserSelectV2Result[i12];
        }
    }

    public AutotekaTeaserSelectV2Result(@l AttributedText attributedText, @l String str, @k String str2, @l AttributedText attributedText2, @k Background background, @l SelectButtonParams selectButtonParams, @l AutotekaReportLink autotekaReportLink) {
        this.description = attributedText;
        this.title = str;
        this.badgeText = str2;
        this.price = attributedText2;
        this.background = background;
        this.callRequestLink = selectButtonParams;
        this.reportExampleLink = autotekaReportLink;
    }

    public static /* synthetic */ AutotekaTeaserSelectV2Result copy$default(AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result, AttributedText attributedText, String str, String str2, AttributedText attributedText2, Background background, SelectButtonParams selectButtonParams, AutotekaReportLink autotekaReportLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = autotekaTeaserSelectV2Result.description;
        }
        if ((i12 & 2) != 0) {
            str = autotekaTeaserSelectV2Result.title;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = autotekaTeaserSelectV2Result.badgeText;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            attributedText2 = autotekaTeaserSelectV2Result.price;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 16) != 0) {
            background = autotekaTeaserSelectV2Result.background;
        }
        Background background2 = background;
        if ((i12 & 32) != 0) {
            selectButtonParams = autotekaTeaserSelectV2Result.callRequestLink;
        }
        SelectButtonParams selectButtonParams2 = selectButtonParams;
        if ((i12 & 64) != 0) {
            autotekaReportLink = autotekaTeaserSelectV2Result.reportExampleLink;
        }
        return autotekaTeaserSelectV2Result.copy(attributedText, str3, str4, attributedText3, background2, selectButtonParams2, autotekaReportLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final SelectButtonParams getCallRequestLink() {
        return this.callRequestLink;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AutotekaReportLink getReportExampleLink() {
        return this.reportExampleLink;
    }

    @k
    public final AutotekaTeaserSelectV2Result copy(@l AttributedText description, @l String title, @k String badgeText, @l AttributedText price, @k Background background, @l SelectButtonParams callRequestLink, @l AutotekaReportLink reportExampleLink) {
        return new AutotekaTeaserSelectV2Result(description, title, badgeText, price, background, callRequestLink, reportExampleLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaTeaserSelectV2Result)) {
            return false;
        }
        AutotekaTeaserSelectV2Result autotekaTeaserSelectV2Result = (AutotekaTeaserSelectV2Result) other;
        return L.f(this.description, autotekaTeaserSelectV2Result.description) && L.f(this.title, autotekaTeaserSelectV2Result.title) && L.f(this.badgeText, autotekaTeaserSelectV2Result.badgeText) && L.f(this.price, autotekaTeaserSelectV2Result.price) && L.f(this.background, autotekaTeaserSelectV2Result.background) && L.f(this.callRequestLink, autotekaTeaserSelectV2Result.callRequestLink) && L.f(this.reportExampleLink, autotekaTeaserSelectV2Result.reportExampleLink);
    }

    @k
    public final Background getBackground() {
        return this.background;
    }

    @k
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    public final SelectButtonParams getCallRequestLink() {
        return this.callRequestLink;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getPrice() {
        return this.price;
    }

    @l
    public final AutotekaReportLink getReportExampleLink() {
        return this.reportExampleLink;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.description;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        String str = this.title;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.badgeText);
        AttributedText attributedText2 = this.price;
        int iHashCode2 = (this.background.hashCode() + ((iD2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        SelectButtonParams selectButtonParams = this.callRequestLink;
        int iHashCode3 = (iHashCode2 + (selectButtonParams == null ? 0 : selectButtonParams.hashCode())) * 31;
        AutotekaReportLink autotekaReportLink = this.reportExampleLink;
        return iHashCode3 + (autotekaReportLink != null ? autotekaReportLink.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaTeaserSelectV2Result(description=" + this.description + ", title=" + this.title + ", badgeText=" + this.badgeText + ", price=" + this.price + ", background=" + this.background + ", callRequestLink=" + this.callRequestLink + ", reportExampleLink=" + this.reportExampleLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.badgeText);
        parcel.writeParcelable(this.price, flags);
        this.background.writeToParcel(parcel, flags);
        SelectButtonParams selectButtonParams = this.callRequestLink;
        if (selectButtonParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectButtonParams.writeToParcel(parcel, flags);
        }
        AutotekaReportLink autotekaReportLink = this.reportExampleLink;
        if (autotekaReportLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaReportLink.writeToParcel(parcel, flags);
        }
    }
}
