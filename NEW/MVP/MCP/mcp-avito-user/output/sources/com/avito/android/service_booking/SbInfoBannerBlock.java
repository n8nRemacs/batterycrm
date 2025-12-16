package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking/SbInfoBannerBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getStyle", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbInfoBannerBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbInfoBannerBlock> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("title")
    @l
    private final String title;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbInfoBannerBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbInfoBannerBlock createFromParcel(Parcel parcel) {
            return new SbInfoBannerBlock(parcel.readString(), (AttributedText) parcel.readParcelable(SbInfoBannerBlock.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SbInfoBannerBlock[] newArray(int i12) {
            return new SbInfoBannerBlock[i12];
        }
    }

    public SbInfoBannerBlock(@l String str, @l AttributedText attributedText, @l String str2) {
        this.title = str;
        this.description = attributedText;
        this.style = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SbInfoBannerBlock)) {
            return false;
        }
        SbInfoBannerBlock sbInfoBannerBlock = (SbInfoBannerBlock) obj;
        return L.f(this.title, sbInfoBannerBlock.title) && L.f(this.description, sbInfoBannerBlock.description) && L.f(this.style, sbInfoBannerBlock.style);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.style;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbInfoBannerBlock(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", style=");
        return C22026a.c(sb2, this.style, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        parcel.writeString(this.style);
    }
}
