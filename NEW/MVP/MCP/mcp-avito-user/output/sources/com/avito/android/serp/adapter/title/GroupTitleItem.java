package com.avito.android.serp.adapter.title;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;

/* compiled from: GroupTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/title/GroupTitleItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GroupTitleItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<GroupTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f272437b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f272440e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f272441f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f272442g = SerpViewType.f268585e;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f272443h = true;

    /* compiled from: GroupTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final GroupTitleItem createFromParcel(Parcel parcel) {
            return new GroupTitleItem(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupTitleItem[] newArray(int i12) {
            return new GroupTitleItem[i12];
        }
    }

    public GroupTitleItem(int i12, long j12, @k String str, @k String str2, boolean z12) {
        this.f272437b = j12;
        this.f272438c = str;
        this.f272439d = i12;
        this.f272440e = str2;
        this.f272441f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF269937i() {
        return this.f272443h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF248508b() {
        return this.f272437b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272678l() {
        return this.f272439d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272668b() {
        return this.f272438c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272677k() {
        return this.f272442g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f272437b);
        parcel.writeString(this.f272438c);
        parcel.writeInt(this.f272439d);
        parcel.writeString(this.f272440e);
        parcel.writeInt(this.f272441f ? 1 : 0);
    }
}
