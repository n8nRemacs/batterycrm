package com.avito.android.login_suggests_impl.adapter.progress;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProgressItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/progress/ProgressItem;", "Lcom/avito/android/login_suggests_impl/adapter/LoginSuggestsItem;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ProgressItem implements LoginSuggestsItem {

    @k
    public static final Parcelable.Creator<ProgressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f182874b;

    /* compiled from: ProgressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgressItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgressItem createFromParcel(Parcel parcel) {
            return new ProgressItem(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressItem[] newArray(int i12) {
            return new ProgressItem[i12];
        }
    }

    public ProgressItem() {
        this(0L, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressItem) && this.f182874b == ((ProgressItem) obj).f182874b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF182863b() {
        return this.f182874b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f182874b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("ProgressItem(id="), this.f182874b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f182874b);
    }

    public ProgressItem(long j12) {
        this.f182874b = j12;
    }

    public /* synthetic */ ProgressItem(long j12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Long.MAX_VALUE : j12);
    }
}
