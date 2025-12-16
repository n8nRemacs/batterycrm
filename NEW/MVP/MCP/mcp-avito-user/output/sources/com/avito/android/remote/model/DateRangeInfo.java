package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/DateRangeInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;", "value", "", "title", "hint", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/DateRangeInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;", "getValue", "Ljava/lang/String;", "getTitle", "getHint", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "SelectedRange", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateRangeInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DateRangeInfo> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("hint")
    @k
    private final String hint;

    @c("title")
    @k
    private final String title;

    @c("value")
    @l
    private final SelectedRange value;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateRangeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateRangeInfo createFromParcel(@k Parcel parcel) {
            return new DateRangeInfo(parcel.readInt() == 0 ? null : SelectedRange.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(DateRangeInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateRangeInfo[] newArray(int i12) {
            return new DateRangeInfo[i12];
        }
    }

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;", "Landroid/os/Parcelable;", "Ljava/util/Date;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "component1", "()Ljava/util/Date;", "component2", "copy", "(Ljava/util/Date;Ljava/util/Date;)Lcom/avito/android/remote/model/DateRangeInfo$SelectedRange;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Date;", "getFrom", "getTo", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectedRange implements Parcelable {

        @k
        public static final Parcelable.Creator<SelectedRange> CREATOR = new Creator();

        @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @k
        private final Date from;

        @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        @k
        private final Date to;

        /* compiled from: StrBookingCalculateDetailsResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectedRange> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectedRange createFromParcel(@k Parcel parcel) {
                return new SelectedRange((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectedRange[] newArray(int i12) {
                return new SelectedRange[i12];
            }
        }

        public SelectedRange(@k Date date, @k Date date2) {
            this.from = date;
            this.to = date2;
        }

        public static /* synthetic */ SelectedRange copy$default(SelectedRange selectedRange, Date date, Date date2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                date = selectedRange.from;
            }
            if ((i12 & 2) != 0) {
                date2 = selectedRange.to;
            }
            return selectedRange.copy(date, date2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Date getFrom() {
            return this.from;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Date getTo() {
            return this.to;
        }

        @k
        public final SelectedRange copy(@k Date from, @k Date to2) {
            return new SelectedRange(from, to2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedRange)) {
                return false;
            }
            SelectedRange selectedRange = (SelectedRange) other;
            return L.f(this.from, selectedRange.from) && L.f(this.to, selectedRange.to);
        }

        @k
        public final Date getFrom() {
            return this.from;
        }

        @k
        public final Date getTo() {
            return this.to;
        }

        public int hashCode() {
            return this.to.hashCode() + (this.from.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedRange(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            return f.n(sb2, this.to, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeSerializable(this.from);
            parcel.writeSerializable(this.to);
        }
    }

    public DateRangeInfo(@l SelectedRange selectedRange, @k String str, @k String str2, @k DeepLink deepLink) {
        this.value = selectedRange;
        this.title = str;
        this.hint = str2;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ DateRangeInfo copy$default(DateRangeInfo dateRangeInfo, SelectedRange selectedRange, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            selectedRange = dateRangeInfo.value;
        }
        if ((i12 & 2) != 0) {
            str = dateRangeInfo.title;
        }
        if ((i12 & 4) != 0) {
            str2 = dateRangeInfo.hint;
        }
        if ((i12 & 8) != 0) {
            deepLink = dateRangeInfo.deepLink;
        }
        return dateRangeInfo.copy(selectedRange, str, str2, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SelectedRange getValue() {
        return this.value;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final DateRangeInfo copy(@l SelectedRange value, @k String title, @k String hint, @k DeepLink deepLink) {
        return new DateRangeInfo(value, title, hint, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateRangeInfo)) {
            return false;
        }
        DateRangeInfo dateRangeInfo = (DateRangeInfo) other;
        return L.f(this.value, dateRangeInfo.value) && L.f(this.title, dateRangeInfo.title) && L.f(this.hint, dateRangeInfo.hint) && L.f(this.deepLink, dateRangeInfo.deepLink);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getHint() {
        return this.hint;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final SelectedRange getValue() {
        return this.value;
    }

    public int hashCode() {
        SelectedRange selectedRange = this.value;
        return this.deepLink.hashCode() + H.d(H.d((selectedRange == null ? 0 : selectedRange.hashCode()) * 31, 31, this.title), 31, this.hint);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DateRangeInfo(value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SelectedRange selectedRange = this.value;
        if (selectedRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectedRange.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
