package com.avito.android.remote.popularity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PopularityInfo.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/popularity/PopularityInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PopularityInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<PopularityInfo> CREATOR = new a();

    @c("title")
    @l
    private final AttributedText text;

    /* compiled from: PopularityInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PopularityInfo> {
        @Override // android.os.Parcelable.Creator
        public final PopularityInfo createFromParcel(Parcel parcel) {
            return new PopularityInfo((AttributedText) parcel.readParcelable(PopularityInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PopularityInfo[] newArray(int i12) {
            return new PopularityInfo[i12];
        }
    }

    public PopularityInfo(@l AttributedText attributedText) {
        this.text = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopularityInfo) && L.f(this.text, ((PopularityInfo) obj).text);
    }

    public final int hashCode() {
        AttributedText attributedText = this.text;
        if (attributedText == null) {
            return 0;
        }
        return attributedText.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("PopularityInfo(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
    }
}
