package com.avito.android.advert_collection.adapter.author.skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_collection.adapter.CollectionWidgetItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SkeletonAuthorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/adapter/author/skeleton/SkeletonAuthorItem;", "Lcom/avito/android/advert_collection/adapter/CollectionWidgetItem;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SkeletonAuthorItem implements CollectionWidgetItem {

    @k
    public static final Parcelable.Creator<SkeletonAuthorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f81276b;

    /* compiled from: SkeletonAuthorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SkeletonAuthorItem> {
        @Override // android.os.Parcelable.Creator
        public final SkeletonAuthorItem createFromParcel(Parcel parcel) {
            return new SkeletonAuthorItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkeletonAuthorItem[] newArray(int i12) {
            return new SkeletonAuthorItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkeletonAuthorItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkeletonAuthorItem) && L.f(this.f81276b, ((SkeletonAuthorItem) obj).f81276b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79781b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79782c() {
        return this.f81276b;
    }

    public final int hashCode() {
        return this.f81276b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SkeletonAuthorItem(stringId="), this.f81276b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f81276b);
    }

    public SkeletonAuthorItem(@k String str) {
        this.f81276b = str;
    }

    public /* synthetic */ SkeletonAuthorItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "skeleton_author_of_collection" : str);
    }
}
