package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: AlertBannerModel.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/AlertBannerModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AlertBannerModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/text/AttributedText;", "title", "body", "<init>", "(Lcom/avito/android/remote/model/AlertBannerModel$Style;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/AlertBannerModel$Style;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "copy", "(Lcom/avito/android/remote/model/AlertBannerModel$Style;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/AlertBannerModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AlertBannerModel$Style;", "getStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getBody", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AlertBannerModel implements Parcelable {

    @k
    public static final Parcelable.Creator<AlertBannerModel> CREATOR = new Creator();

    @c("body")
    @l
    private final AttributedText body;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: AlertBannerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlertBannerModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerModel createFromParcel(@k Parcel parcel) {
            return new AlertBannerModel(Style.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AlertBannerModel.class.getClassLoader()), (AttributedText) parcel.readParcelable(AlertBannerModel.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AlertBannerModel[] newArray(int i12) {
            return new AlertBannerModel[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AlertBannerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/AlertBannerModel$Style;", "", "(Ljava/lang/String;I)V", "Default", "Danger", "Success", "Warning", "Info", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @c("default")
        public static final Style Default = new Style("Default", 0);

        @c("danger")
        public static final Style Danger = new Style("Danger", 1);

        @c("success")
        public static final Style Success = new Style("Success", 2);

        @c(ConstraintKt.WARNING)
        public static final Style Warning = new Style("Warning", 3);

        @c(RequestReviewResultKt.INFO_TYPE)
        public static final Style Info = new Style("Info", 4);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{Default, Danger, Success, Warning, Info};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = kotlin.enums.c.a(styleArr$values);
        }

        private Style(String str, int i12) {
        }

        @k
        public static a<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public AlertBannerModel(@k Style style, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.style = style;
        this.title = attributedText;
        this.body = attributedText2;
    }

    public static /* synthetic */ AlertBannerModel copy$default(AlertBannerModel alertBannerModel, Style style, AttributedText attributedText, AttributedText attributedText2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            style = alertBannerModel.style;
        }
        if ((i12 & 2) != 0) {
            attributedText = alertBannerModel.title;
        }
        if ((i12 & 4) != 0) {
            attributedText2 = alertBannerModel.body;
        }
        return alertBannerModel.copy(style, attributedText, attributedText2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final AlertBannerModel copy(@k Style style, @l AttributedText title, @l AttributedText body) {
        return new AlertBannerModel(style, title, body);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertBannerModel)) {
            return false;
        }
        AlertBannerModel alertBannerModel = (AlertBannerModel) other;
        return this.style == alertBannerModel.style && L.f(this.title, alertBannerModel.title) && L.f(this.body, alertBannerModel.body);
    }

    @l
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        AttributedText attributedText = this.title;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.body;
        return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlertBannerModel(style=");
        sb2.append(this.style);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        return com.avito.android.actions_sheet.a.w(sb2, this.body, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style.name());
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.body, flags);
    }
}
