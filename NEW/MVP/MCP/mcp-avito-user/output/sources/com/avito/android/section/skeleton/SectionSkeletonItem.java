package com.avito.android.section.skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionSkeletonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/skeleton/SectionSkeletonItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionSkeletonItem implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<SectionSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264868c;

    /* compiled from: SectionSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionSkeletonItem createFromParcel(Parcel parcel) {
            return new SectionSkeletonItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SectionSkeletonItem[] newArray(int i12) {
            return new SectionSkeletonItem[i12];
        }
    }

    public SectionSkeletonItem(@k String str, int i12) {
        this.f264867b = str;
        this.f264868c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionSkeletonItem)) {
            return false;
        }
        SectionSkeletonItem sectionSkeletonItem = (SectionSkeletonItem) obj;
        return L.f(this.f264867b, sectionSkeletonItem.f264867b) && this.f264868c == sectionSkeletonItem.f264868c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF170867f() {
        return this.f264868c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262931b() {
        return this.f264867b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264868c) + (this.f264867b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionSkeletonItem(stringId=");
        sb2.append(this.f264867b);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f264868c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264867b);
        parcel.writeInt(this.f264868c);
    }
}
