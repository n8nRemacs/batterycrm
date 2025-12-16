package com.avito.android.vas_performance.ui.items.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPerformanceHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/header/VasPerformanceHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPerformanceHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VasPerformanceHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321676b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321677c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CharSequence f321678d;

    /* compiled from: VasPerformanceHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPerformanceHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final VasPerformanceHeaderItem createFromParcel(Parcel parcel) {
            return new VasPerformanceHeaderItem(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VasPerformanceHeaderItem[] newArray(int i12) {
            return new VasPerformanceHeaderItem[i12];
        }
    }

    public VasPerformanceHeaderItem(@k String str, @k String str2, @l CharSequence charSequence) {
        this.f321676b = str;
        this.f321677c = str2;
        this.f321678d = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPerformanceHeaderItem)) {
            return false;
        }
        VasPerformanceHeaderItem vasPerformanceHeaderItem = (VasPerformanceHeaderItem) obj;
        return L.f(this.f321676b, vasPerformanceHeaderItem.f321676b) && L.f(this.f321677c, vasPerformanceHeaderItem.f321677c) && L.f(this.f321678d, vasPerformanceHeaderItem.f321678d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF290919b() {
        return this.f321676b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f321676b.hashCode() * 31, 31, this.f321677c);
        CharSequence charSequence = this.f321678d;
        return iD2 + (charSequence == null ? 0 : charSequence.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPerformanceHeaderItem(stringId=");
        sb2.append(this.f321676b);
        sb2.append(", title=");
        sb2.append(this.f321677c);
        sb2.append(", description=");
        return AK.c.r(sb2, this.f321678d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f321676b);
        parcel.writeString(this.f321677c);
        TextUtils.writeToParcel(this.f321678d, parcel, i12);
    }
}
