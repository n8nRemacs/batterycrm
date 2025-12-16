package com.avito.android.remote.model.urgency;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MultiUrgencyBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/urgency/MultiUrgencyEvent;", "Landroid/os/Parcelable;", "", "categoryId", "microCategoryId", "<init>", "(JJ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getCategoryId", "()J", "getMicroCategoryId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultiUrgencyEvent implements Parcelable {

    @k
    public static final Parcelable.Creator<MultiUrgencyEvent> CREATOR = new Creator();

    @c("cid")
    private final long categoryId;

    @c("mcid")
    private final long microCategoryId;

    /* compiled from: MultiUrgencyBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MultiUrgencyEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyEvent createFromParcel(@k Parcel parcel) {
            return new MultiUrgencyEvent(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MultiUrgencyEvent[] newArray(int i12) {
            return new MultiUrgencyEvent[i12];
        }
    }

    public MultiUrgencyEvent(long j12, long j13) {
        this.categoryId = j12;
        this.microCategoryId = j13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final long getMicroCategoryId() {
        return this.microCategoryId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.categoryId);
        parcel.writeLong(this.microCategoryId);
    }
}
