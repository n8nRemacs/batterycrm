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

/* compiled from: ClickStreamSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/ClickStreamSection;", "LUx0/d;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "content", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "c", "()Lcom/avito/android/remote/model/search/suggest/SuggestAnalyticsEvent;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ClickStreamSection implements Ux0.d, Parcelable {

    @k
    public static final Parcelable.Creator<ClickStreamSection> CREATOR = new a();

    @c("content")
    @k
    private final SuggestAnalyticsEvent content;

    @c("type")
    @l
    private final String type;

    /* compiled from: ClickStreamSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClickStreamSection> {
        @Override // android.os.Parcelable.Creator
        public final ClickStreamSection createFromParcel(Parcel parcel) {
            return new ClickStreamSection(parcel.readString(), (SuggestAnalyticsEvent) parcel.readParcelable(ClickStreamSection.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClickStreamSection[] newArray(int i12) {
            return new ClickStreamSection[i12];
        }
    }

    public ClickStreamSection(@l String str, @k SuggestAnalyticsEvent suggestAnalyticsEvent) {
        this.type = str;
        this.content = suggestAnalyticsEvent;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final SuggestAnalyticsEvent getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickStreamSection)) {
            return false;
        }
        ClickStreamSection clickStreamSection = (ClickStreamSection) obj;
        return L.f(this.type, clickStreamSection.type) && L.f(this.content, clickStreamSection.content);
    }

    public final int hashCode() {
        String str = this.type;
        return this.content.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "ClickStreamSection(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.content, i12);
    }
}
