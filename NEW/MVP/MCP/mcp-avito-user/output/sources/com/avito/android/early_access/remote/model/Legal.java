package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/early_access/remote/model/Legal;", "Landroid/os/Parcelable;", "Lcom/avito/android/early_access/remote/model/LinkedText;", "offer", "terms", "aboutService", "<init>", "(Lcom/avito/android/early_access/remote/model/LinkedText;Lcom/avito/android/early_access/remote/model/LinkedText;Lcom/avito/android/early_access/remote/model/LinkedText;)V", "Lcom/avito/android/early_access/remote/model/LinkedText;", "getOffer", "()Lcom/avito/android/early_access/remote/model/LinkedText;", "getTerms", "getAboutService", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Legal implements Parcelable {

    @k
    public static final Parcelable.Creator<Legal> CREATOR = new a();

    @c("aboutService")
    @l
    private final LinkedText aboutService;

    @c("offer")
    @k
    private final LinkedText offer;

    @c("terms")
    @k
    private final LinkedText terms;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Legal> {
        @Override // android.os.Parcelable.Creator
        public final Legal createFromParcel(Parcel parcel) {
            Parcelable.Creator<LinkedText> creator = LinkedText.CREATOR;
            return new Legal(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Legal[] newArray(int i12) {
            return new Legal[i12];
        }
    }

    public Legal(@k LinkedText linkedText, @k LinkedText linkedText2, @l LinkedText linkedText3) {
        this.offer = linkedText;
        this.terms = linkedText2;
        this.aboutService = linkedText3;
    }

    @k
    public final ReEarlyAccessData.Legal c() {
        ReEarlyAccessData.LinkedText linkedTextC = this.offer.c();
        ReEarlyAccessData.LinkedText linkedTextC2 = this.terms.c();
        LinkedText linkedText = this.aboutService;
        return new ReEarlyAccessData.Legal(linkedTextC, linkedTextC2, linkedText != null ? linkedText.c() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Legal)) {
            return false;
        }
        Legal legal = (Legal) obj;
        return L.f(this.offer, legal.offer) && L.f(this.terms, legal.terms) && L.f(this.aboutService, legal.aboutService);
    }

    public final int hashCode() {
        int iHashCode = (this.terms.hashCode() + (this.offer.hashCode() * 31)) * 31;
        LinkedText linkedText = this.aboutService;
        return iHashCode + (linkedText == null ? 0 : linkedText.hashCode());
    }

    @k
    public final String toString() {
        return "Legal(offer=" + this.offer + ", terms=" + this.terms + ", aboutService=" + this.aboutService + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.offer.writeToParcel(parcel, i12);
        this.terms.writeToParcel(parcel, i12);
        LinkedText linkedText = this.aboutService;
        if (linkedText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedText.writeToParcel(parcel, i12);
        }
    }
}
