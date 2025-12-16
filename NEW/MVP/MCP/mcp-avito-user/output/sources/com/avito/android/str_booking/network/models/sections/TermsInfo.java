package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/TermsInfo;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "onTapEvent", "Lcom/avito/android/str_booking/network/models/sections/TermsContent;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;Lcom/avito/android/str_booking/network/models/sections/TermsContent;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "d", "()Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "Lcom/avito/android/str_booking/network/models/sections/TermsContent;", "c", "()Lcom/avito/android/str_booking/network/models/sections/TermsContent;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TermsInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<TermsInfo> CREATOR = new a();

    @c("content")
    @l
    private final TermsContent content;

    @c("onTapEvent")
    @l
    private final SuggestAnalyticsEvent onTapEvent;

    @c("title")
    @l
    private final String title;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TermsInfo> {
        @Override // android.os.Parcelable.Creator
        public final TermsInfo createFromParcel(Parcel parcel) {
            return new TermsInfo(parcel.readString(), (SuggestAnalyticsEvent) parcel.readParcelable(TermsInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : TermsContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TermsInfo[] newArray(int i12) {
            return new TermsInfo[i12];
        }
    }

    public TermsInfo(@l String str, @l SuggestAnalyticsEvent suggestAnalyticsEvent, @l TermsContent termsContent) {
        this.title = str;
        this.onTapEvent = suggestAnalyticsEvent;
        this.content = termsContent;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final TermsContent getContent() {
        return this.content;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final SuggestAnalyticsEvent getOnTapEvent() {
        return this.onTapEvent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsInfo)) {
            return false;
        }
        TermsInfo termsInfo = (TermsInfo) obj;
        return L.f(this.title, termsInfo.title) && L.f(this.onTapEvent, termsInfo.onTapEvent) && L.f(this.content, termsInfo.content);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SuggestAnalyticsEvent suggestAnalyticsEvent = this.onTapEvent;
        int iHashCode2 = (iHashCode + (suggestAnalyticsEvent == null ? 0 : suggestAnalyticsEvent.hashCode())) * 31;
        TermsContent termsContent = this.content;
        return iHashCode2 + (termsContent != null ? termsContent.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TermsInfo(title=" + this.title + ", onTapEvent=" + this.onTapEvent + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.onTapEvent, i12);
        TermsContent termsContent = this.content;
        if (termsContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termsContent.writeToParcel(parcel, i12);
        }
    }
}
