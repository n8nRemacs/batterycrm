package com.avito.android.serp.adapter.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: HeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/header/HeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class HeaderItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270128b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f270129c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f270130d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f270131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f270132f;

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            return new HeaderItem(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), SerpViewType.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i12) {
            return new HeaderItem[i12];
        }
    }

    public HeaderItem(@k String str, @l String str2, @l List<String> list, @k SerpViewType serpViewType, int i12) {
        this.f270128b = str;
        this.f270129c = str2;
        this.f270130d = list;
        this.f270131e = serpViewType;
        this.f270132f = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272443h() {
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268950c() {
        return this.f270132f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268951d() {
        return this.f270128b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268949b() {
        return this.f270131e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270128b);
        parcel.writeString(this.f270129c);
        parcel.writeStringList(this.f270130d);
        parcel.writeString(this.f270131e.name());
        parcel.writeInt(this.f270132f);
    }
}
