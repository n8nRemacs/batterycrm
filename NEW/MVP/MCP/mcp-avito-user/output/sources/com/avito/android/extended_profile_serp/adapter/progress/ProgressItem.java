package com.avito.android.extended_profile_serp.adapter.progress;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/progress/ProgressItem;", "Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpItem;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProgressItem implements ExtendedProfileSerpItem {

    @k
    public static final Parcelable.Creator<ProgressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152597b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152598c;

    /* compiled from: ProgressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgressItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgressItem createFromParcel(Parcel parcel) {
            return new ProgressItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressItem[] newArray(int i12) {
            return new ProgressItem[i12];
        }
    }

    public ProgressItem(@k String str, int i12) {
        this.f152597b = str;
        this.f152598c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressItem)) {
            return false;
        }
        ProgressItem progressItem = (ProgressItem) obj;
        return L.f(this.f152597b, progressItem.f152597b) && this.f152598c == progressItem.f152598c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269901d() {
        return this.f152598c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF148522b() {
        return this.f152597b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152598c) + (this.f152597b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressItem(stringId=");
        sb2.append(this.f152597b);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f152598c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152597b);
        parcel.writeInt(this.f152598c);
    }

    public /* synthetic */ ProgressItem(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "progress_item" : str, i12);
    }
}
