package com.avito.android.advert.item.disclaimer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: DisclaimerData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/disclaimer/DisclaimerData;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DisclaimerData implements Parcelable {

    @k
    public static final Parcelable.Creator<DisclaimerData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final CharSequence f75209b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CharSequence f75210c;

    /* compiled from: DisclaimerData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisclaimerData> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerData createFromParcel(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new DisclaimerData((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerData[] newArray(int i12) {
            return new DisclaimerData[i12];
        }
    }

    public DisclaimerData(@l CharSequence charSequence, @l CharSequence charSequence2) {
        this.f75209b = charSequence;
        this.f75210c = charSequence2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        TextUtils.writeToParcel(this.f75209b, parcel, i12);
        TextUtils.writeToParcel(this.f75210c, parcel, i12);
    }
}
