package com.avito.android.login_suggests_impl.adapter.suggest;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.login_suggests_impl.Suggest;
import com.avito.android.login_suggests_impl.adapter.LoginSuggestsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/suggest/SuggestItem;", "Lcom/avito/android/login_suggests_impl/adapter/LoginSuggestsItem;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SuggestItem implements LoginSuggestsItem {

    @k
    public static final Parcelable.Creator<SuggestItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f182878b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Suggest f182879c;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestItem> {
        @Override // android.os.Parcelable.Creator
        public final SuggestItem createFromParcel(Parcel parcel) {
            return new SuggestItem(parcel.readLong(), (Suggest) parcel.readParcelable(SuggestItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestItem[] newArray(int i12) {
            return new SuggestItem[i12];
        }
    }

    public SuggestItem(long j12, @k Suggest suggest) {
        this.f182878b = j12;
        this.f182879c = suggest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestItem)) {
            return false;
        }
        SuggestItem suggestItem = (SuggestItem) obj;
        return this.f182878b == suggestItem.f182878b && L.f(this.f182879c, suggestItem.f182879c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF182878b() {
        return this.f182878b;
    }

    public final int hashCode() {
        return this.f182879c.hashCode() + (Long.hashCode(this.f182878b) * 31);
    }

    @k
    public final String toString() {
        return "SuggestItem(id=" + this.f182878b + ", suggest=" + this.f182879c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f182878b);
        parcel.writeParcelable(this.f182879c, i12);
    }
}
