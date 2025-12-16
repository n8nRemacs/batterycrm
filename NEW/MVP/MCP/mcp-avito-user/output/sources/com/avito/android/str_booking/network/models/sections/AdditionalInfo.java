package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/AdditionalInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/str_booking/network/models/sections/AdditionalInfoContent;", "content", "", "title", "<init>", "(Lcom/avito/android/str_booking/network/models/sections/AdditionalInfoContent;Ljava/lang/String;)V", "Lcom/avito/android/str_booking/network/models/sections/AdditionalInfoContent;", "c", "()Lcom/avito/android/str_booking/network/models/sections/AdditionalInfoContent;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

    @c("content")
    @l
    private final AdditionalInfoContent content;

    @c("title")
    @l
    private final String title;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalInfo> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo createFromParcel(Parcel parcel) {
            return new AdditionalInfo(parcel.readInt() == 0 ? null : AdditionalInfoContent.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo[] newArray(int i12) {
            return new AdditionalInfo[i12];
        }
    }

    public AdditionalInfo(@l AdditionalInfoContent additionalInfoContent, @l String str) {
        this.content = additionalInfoContent;
        this.title = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AdditionalInfoContent getContent() {
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
        if (!(obj instanceof AdditionalInfo)) {
            return false;
        }
        AdditionalInfo additionalInfo = (AdditionalInfo) obj;
        return L.f(this.content, additionalInfo.content) && L.f(this.title, additionalInfo.title);
    }

    public final int hashCode() {
        AdditionalInfoContent additionalInfoContent = this.content;
        int iHashCode = (additionalInfoContent == null ? 0 : additionalInfoContent.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalInfo(content=");
        sb2.append(this.content);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        AdditionalInfoContent additionalInfoContent = this.content;
        if (additionalInfoContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalInfoContent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.title);
    }
}
