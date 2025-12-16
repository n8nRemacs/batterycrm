package com.avito.android.brandspace.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: BrandspaceAdjustParameters.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/brandspace/remote/model/BrandspaceAdjustParameters;", "Landroid/os/Parcelable;", "", "visitDuration", "<init>", "(J)V", "J", "c", "()J", "_avito-discouraged_avito-api_brandspace"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandspaceAdjustParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<BrandspaceAdjustParameters> CREATOR = new a();

    @c("visitDuration")
    private final long visitDuration;

    /* compiled from: BrandspaceAdjustParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandspaceAdjustParameters> {
        @Override // android.os.Parcelable.Creator
        public final BrandspaceAdjustParameters createFromParcel(Parcel parcel) {
            return new BrandspaceAdjustParameters(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final BrandspaceAdjustParameters[] newArray(int i12) {
            return new BrandspaceAdjustParameters[i12];
        }
    }

    public BrandspaceAdjustParameters(long j12) {
        this.visitDuration = j12;
    }

    /* renamed from: c, reason: from getter */
    public final long getVisitDuration() {
        return this.visitDuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.visitDuration);
    }
}
