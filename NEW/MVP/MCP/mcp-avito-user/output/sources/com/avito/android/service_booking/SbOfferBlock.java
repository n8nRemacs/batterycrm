package com.avito.android.service_booking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlock.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/SbOfferBlock;", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "setText", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbOfferBlock implements ServiceBookingBlock {

    @k
    public static final Parcelable.Creator<SbOfferBlock> CREATOR = new a();

    @c("text")
    @l
    private AttributedText text;

    /* compiled from: ServiceBookingBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbOfferBlock> {
        @Override // android.os.Parcelable.Creator
        public final SbOfferBlock createFromParcel(Parcel parcel) {
            return new SbOfferBlock((AttributedText) parcel.readParcelable(SbOfferBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SbOfferBlock[] newArray(int i12) {
            return new SbOfferBlock[i12];
        }
    }

    public SbOfferBlock(@l AttributedText attributedText) {
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
        return (obj instanceof SbOfferBlock) && L.f(this.text, ((SbOfferBlock) obj).text);
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
        return com.avito.android.actions_sheet.a.w(new StringBuilder("SbOfferBlock(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
    }
}
