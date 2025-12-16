package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaDiscount;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/autoteka/model/KindOfDiscount;", "discountType", "", "value", "<init>", "(Lcom/avito/android/remote/autoteka/model/KindOfDiscount;Ljava/lang/String;)V", "Lcom/avito/android/remote/autoteka/model/KindOfDiscount;", "c", "()Lcom/avito/android/remote/autoteka/model/KindOfDiscount;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutotekaDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaDiscount> CREATOR = new a();

    @c(MessageBody.Location.KIND)
    @k
    private final KindOfDiscount discountType;

    @c("value")
    @k
    private final String value;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaDiscount> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaDiscount createFromParcel(Parcel parcel) {
            return new AutotekaDiscount(KindOfDiscount.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaDiscount[] newArray(int i12) {
            return new AutotekaDiscount[i12];
        }
    }

    public AutotekaDiscount(@k KindOfDiscount kindOfDiscount, @k String str) {
        this.discountType = kindOfDiscount;
        this.value = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final KindOfDiscount getDiscountType() {
        return this.discountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.discountType.writeToParcel(parcel, i12);
        parcel.writeString(this.value);
    }
}
