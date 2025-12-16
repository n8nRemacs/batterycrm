package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LimitsInfo.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/LimitsInfo;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/LimitsInfo$Progress;", "progress", "category", "location", "Lcom/avito/android/remote/model/text/AttributedText;", "extraInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LimitsInfo$Progress;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/LimitsInfo$Progress;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/LimitsInfo$Progress;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/LimitsInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/LimitsInfo$Progress;", "getProgress", "getCategory", "getLocation", "Lcom/avito/android/remote/model/text/AttributedText;", "getExtraInfo", "Progress", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LimitsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<LimitsInfo> CREATOR = new Creator();

    @c("category")
    @l
    private final String category;

    @c("description")
    @l
    private final String description;

    @c("extraInfo")
    @l
    private final AttributedText extraInfo;

    @c("location")
    @l
    private final String location;

    @c("progress")
    @l
    private final Progress progress;

    @c("title")
    @k
    private final String title;

    /* compiled from: LimitsInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LimitsInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LimitsInfo createFromParcel(@k Parcel parcel) {
            return new LimitsInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Progress.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(LimitsInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LimitsInfo[] newArray(int i12) {
            return new LimitsInfo[i12];
        }
    }

    public LimitsInfo(@k String str, @l String str2, @l Progress progress, @l String str3, @l String str4, @l AttributedText attributedText) {
        this.title = str;
        this.description = str2;
        this.progress = progress;
        this.category = str3;
        this.location = str4;
        this.extraInfo = attributedText;
    }

    public static /* synthetic */ LimitsInfo copy$default(LimitsInfo limitsInfo, String str, String str2, Progress progress, String str3, String str4, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = limitsInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = limitsInfo.description;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            progress = limitsInfo.progress;
        }
        Progress progress2 = progress;
        if ((i12 & 8) != 0) {
            str3 = limitsInfo.category;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = limitsInfo.location;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            attributedText = limitsInfo.extraInfo;
        }
        return limitsInfo.copy(str, str5, progress2, str6, str7, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getExtraInfo() {
        return this.extraInfo;
    }

    @k
    public final LimitsInfo copy(@k String title, @l String description, @l Progress progress, @l String category, @l String location, @l AttributedText extraInfo) {
        return new LimitsInfo(title, description, progress, category, location, extraInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitsInfo)) {
            return false;
        }
        LimitsInfo limitsInfo = (LimitsInfo) other;
        return L.f(this.title, limitsInfo.title) && L.f(this.description, limitsInfo.description) && L.f(this.progress, limitsInfo.progress) && L.f(this.category, limitsInfo.category) && L.f(this.location, limitsInfo.location) && L.f(this.extraInfo, limitsInfo.extraInfo);
    }

    @l
    public final String getCategory() {
        return this.category;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getExtraInfo() {
        return this.extraInfo;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final Progress getProgress() {
        return this.progress;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Progress progress = this.progress;
        int iHashCode3 = (iHashCode2 + (progress == null ? 0 : progress.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.extraInfo;
        return iHashCode5 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LimitsInfo(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", category=");
        sb2.append(this.category);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", extraInfo=");
        return a.w(sb2, this.extraInfo, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Progress progress = this.progress;
        if (progress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            progress.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.category);
        parcel.writeString(this.location);
        parcel.writeParcelable(this.extraInfo, flags);
    }

    /* compiled from: LimitsInfo.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000fR\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\u000b¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/LimitsInfo$Progress;", "Landroid/os/Parcelable;", "", "value", "Lcom/avito/android/remote/model/LimitsInfo$Progress$Style;", "_style", "", "progressHint", "<init>", "(FLcom/avito/android/remote/model/LimitsInfo$Progress$Style;Ljava/lang/String;)V", "component2", "()Lcom/avito/android/remote/model/LimitsInfo$Progress$Style;", "component1", "()F", "component3", "()Ljava/lang/String;", "copy", "(FLcom/avito/android/remote/model/LimitsInfo$Progress$Style;Ljava/lang/String;)Lcom/avito/android/remote/model/LimitsInfo$Progress;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getValue", "Lcom/avito/android/remote/model/LimitsInfo$Progress$Style;", "Ljava/lang/String;", "getProgressHint", "getStyle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Style", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Progress implements Parcelable {

        @k
        public static final Parcelable.Creator<Progress> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final Style _style;

        @c("hint")
        @l
        private final String progressHint;

        @c("value")
        private final float value;

        /* compiled from: LimitsInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Progress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Progress createFromParcel(@k Parcel parcel) {
                return new Progress(parcel.readFloat(), parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Progress[] newArray(int i12) {
                return new Progress[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LimitsInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/LimitsInfo$Progress$Style;", "", "(Ljava/lang/String;I)V", "NORMAL", "WARNING", "_avito-discouraged_avito-api_publish-limits-info"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;

            @c(Constants.NORMAL)
            public static final Style NORMAL = new Style("NORMAL", 0);

            @c(ConstraintKt.WARNING)
            public static final Style WARNING = new Style("WARNING", 1);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{NORMAL, WARNING};
            }

            static {
                Style[] styleArr$values = $values();
                $VALUES = styleArr$values;
                $ENTRIES = kotlin.enums.c.a(styleArr$values);
            }

            private Style(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<Style> getEntries() {
                return $ENTRIES;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public Progress(float f12, @l Style style, @l String str) {
            this.value = f12;
            this._style = style;
            this.progressHint = str;
        }

        /* renamed from: component2, reason: from getter */
        private final Style get_style() {
            return this._style;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f12, Style style, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = progress.value;
            }
            if ((i12 & 2) != 0) {
                style = progress._style;
            }
            if ((i12 & 4) != 0) {
                str = progress.progressHint;
            }
            return progress.copy(f12, style, str);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getProgressHint() {
            return this.progressHint;
        }

        @k
        public final Progress copy(float value, @l Style _style, @l String progressHint) {
            return new Progress(value, _style, progressHint);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.value, progress.value) == 0 && this._style == progress._style && L.f(this.progressHint, progress.progressHint);
        }

        @l
        public final String getProgressHint() {
            return this.progressHint;
        }

        @k
        public final Style getStyle() {
            Style style = this._style;
            return style == null ? Style.NORMAL : style;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.value) * 31;
            Style style = this._style;
            int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
            String str = this.progressHint;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Progress(value=");
            sb2.append(this.value);
            sb2.append(", _style=");
            sb2.append(this._style);
            sb2.append(", progressHint=");
            return C22026a.c(sb2, this.progressHint, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeFloat(this.value);
            Style style = this._style;
            if (style == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(style.name());
            }
            parcel.writeString(this.progressHint);
        }

        public /* synthetic */ Progress(float f12, Style style, String str, int i12, C42822w c42822w) {
            this(f12, (i12 & 2) != 0 ? Style.NORMAL : style, (i12 & 4) != 0 ? null : str);
        }
    }

    public /* synthetic */ LimitsInfo(String str, String str2, Progress progress, String str3, String str4, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : progress, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) == 0 ? attributedText : null);
    }
}
