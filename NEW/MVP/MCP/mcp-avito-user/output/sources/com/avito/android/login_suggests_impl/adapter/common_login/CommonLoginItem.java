package com.avito.android.login_suggests_impl.adapter.common_login;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommonLoginItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/common_login/CommonLoginItem;", "Lcom/avito/android/login_suggests_impl/adapter/LoginSuggestsItem;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CommonLoginItem implements LoginSuggestsItem {

    @k
    public static final Parcelable.Creator<CommonLoginItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f182863b;

    /* compiled from: CommonLoginItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommonLoginItem> {
        @Override // android.os.Parcelable.Creator
        public final CommonLoginItem createFromParcel(Parcel parcel) {
            return new CommonLoginItem(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonLoginItem[] newArray(int i12) {
            return new CommonLoginItem[i12];
        }
    }

    public CommonLoginItem() {
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
        return (obj instanceof CommonLoginItem) && this.f182863b == ((CommonLoginItem) obj).f182863b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF182863b() {
        return this.f182863b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f182863b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("CommonLoginItem(id="), this.f182863b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f182863b);
    }

    public CommonLoginItem(long j12) {
        this.f182863b = j12;
    }

    public /* synthetic */ CommonLoginItem(long j12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 9223372036854775806L : j12);
    }
}
