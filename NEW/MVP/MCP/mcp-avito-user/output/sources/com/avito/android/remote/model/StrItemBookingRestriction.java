package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StrItemBookingRestriction.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/StrItemBookingRestriction;", "Landroid/os/Parcelable;", "", "date", "", "available", "", "minimalDuration", "<init>", "(Ljava/lang/String;ZI)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "Z", "getAvailable", "()Z", "I", "getMinimalDuration", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrItemBookingRestriction implements Parcelable {

    @k
    public static final Parcelable.Creator<StrItemBookingRestriction> CREATOR = new Creator();

    @c("available")
    private final boolean available;

    @c("date")
    @k
    private final String date;

    @c("minimalDuration")
    private final int minimalDuration;

    /* compiled from: StrItemBookingRestriction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrItemBookingRestriction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrItemBookingRestriction createFromParcel(@k Parcel parcel) {
            return new StrItemBookingRestriction(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrItemBookingRestriction[] newArray(int i12) {
            return new StrItemBookingRestriction[i12];
        }
    }

    public StrItemBookingRestriction(@k String str, boolean z12, int i12) {
        this.date = str;
        this.available = z12;
        this.minimalDuration = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    @k
    public final String getDate() {
        return this.date;
    }

    public final int getMinimalDuration() {
        return this.minimalDuration;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.date);
        parcel.writeInt(this.available ? 1 : 0);
        parcel.writeInt(this.minimalDuration);
    }
}
