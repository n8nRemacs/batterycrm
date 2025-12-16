package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImagesGroupsRecommendationsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/GroupTitle;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GroupTitle implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<GroupTitle> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f244187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f244188c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f244189d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f244190e;

    /* compiled from: ImagesGroupsRecommendationsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupTitle> {
        @Override // android.os.Parcelable.Creator
        public final GroupTitle createFromParcel(Parcel parcel) {
            return new GroupTitle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupTitle[] newArray(int i12) {
            return new GroupTitle[i12];
        }
    }

    public GroupTitle(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f244187b = str;
        this.f244188c = str2;
        this.f244189d = str3;
        this.f244190e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTitle)) {
            return false;
        }
        GroupTitle groupTitle = (GroupTitle) obj;
        return L.f(this.f244187b, groupTitle.f244187b) && L.f(this.f244188c, groupTitle.f244188c) && L.f(this.f244189d, groupTitle.f244189d) && L.f(this.f244190e, groupTitle.f244190e);
    }

    public final int hashCode() {
        return this.f244190e.hashCode() + H.d(H.d(this.f244187b.hashCode() * 31, 31, this.f244188c), 31, this.f244189d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupTitle(one=");
        sb2.append(this.f244187b);
        sb2.append(", few=");
        sb2.append(this.f244188c);
        sb2.append(", many=");
        sb2.append(this.f244189d);
        sb2.append(", connectorString=");
        return C22026a.c(sb2, this.f244190e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f244187b);
        parcel.writeString(this.f244188c);
        parcel.writeString(this.f244189d);
        parcel.writeString(this.f244190e);
    }
}
