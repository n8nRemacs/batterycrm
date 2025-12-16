package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PageInfo.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/PageInfo;", "Landroid/os/Parcelable;", "", "totalElements", "<init>", "(I)V", "I", "c", "()I", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PageInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<PageInfo> CREATOR = new a();

    @c("totalElements")
    private final int totalElements;

    /* compiled from: PageInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PageInfo> {
        @Override // android.os.Parcelable.Creator
        public final PageInfo createFromParcel(Parcel parcel) {
            return new PageInfo(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PageInfo[] newArray(int i12) {
            return new PageInfo[i12];
        }
    }

    public PageInfo(int i12) {
        this.totalElements = i12;
    }

    /* renamed from: c, reason: from getter */
    public final int getTotalElements() {
        return this.totalElements;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageInfo) && this.totalElements == ((PageInfo) obj).totalElements;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalElements);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("PageInfo(totalElements="), this.totalElements, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.totalElements);
    }
}
