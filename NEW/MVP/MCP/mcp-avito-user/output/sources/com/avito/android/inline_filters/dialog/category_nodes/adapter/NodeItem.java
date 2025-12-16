package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: NodeItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/NodeItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class NodeItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<NodeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f171405b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f171406c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f171407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171408e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f171409f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f171410g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f171411h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f171412i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f171413j;

    /* renamed from: k, reason: collision with root package name */
    public final int f171414k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f171415l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f171416m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f171417n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f171418o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f171419p;

    /* compiled from: NodeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NodeItem> {
        @Override // android.os.Parcelable.Creator
        public final NodeItem createFromParcel(Parcel parcel) {
            return new NodeItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(NodeItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (UniversalImage) parcel.readParcelable(NodeItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NodeItem[] newArray(int i12) {
            return new NodeItem[i12];
        }
    }

    public NodeItem(@Y61.k String str, @Y61.l Integer num, @Y61.k DeepLink deepLink, int i12, @Y61.l Integer num2, @Y61.k String str2, @Y61.l String str3, @Y61.l Integer num3, boolean z12, int i13, @Y61.l String str4, boolean z13, boolean z14, @Y61.l UniversalImage universalImage, @Y61.l String str5) {
        this.f171405b = str;
        this.f171406c = num;
        this.f171407d = deepLink;
        this.f171408e = i12;
        this.f171409f = num2;
        this.f171410g = str2;
        this.f171411h = str3;
        this.f171412i = num3;
        this.f171413j = z12;
        this.f171414k = i13;
        this.f171415l = str4;
        this.f171416m = z13;
        this.f171417n = z14;
        this.f171418o = universalImage;
        this.f171419p = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NodeItem)) {
            return false;
        }
        NodeItem nodeItem = (NodeItem) obj;
        return L.f(this.f171405b, nodeItem.f171405b) && L.f(this.f171406c, nodeItem.f171406c) && L.f(this.f171407d, nodeItem.f171407d) && this.f171408e == nodeItem.f171408e && L.f(this.f171409f, nodeItem.f171409f) && L.f(this.f171410g, nodeItem.f171410g) && L.f(this.f171411h, nodeItem.f171411h) && L.f(this.f171412i, nodeItem.f171412i) && this.f171413j == nodeItem.f171413j && this.f171414k == nodeItem.f171414k && L.f(this.f171415l, nodeItem.f171415l) && this.f171416m == nodeItem.f171416m && this.f171417n == nodeItem.f171417n && L.f(this.f171418o, nodeItem.f171418o) && L.f(this.f171419p, nodeItem.f171419p);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171405b() {
        return this.f171405b;
    }

    public final int hashCode() {
        int iHashCode = this.f171405b.hashCode() * 31;
        Integer num = this.f171406c;
        int iE2 = androidx.appcompat.app.r.e(this.f171408e, com.avito.android.actions_sheet.a.e(this.f171407d, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Integer num2 = this.f171409f;
        int iD2 = H.d((iE2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f171410g);
        String str = this.f171411h;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f171412i;
        int iE3 = androidx.appcompat.app.r.e(this.f171414k, androidx.appcompat.app.r.i((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f171413j), 31);
        String str2 = this.f171415l;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iE3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f171416m), 31, this.f171417n);
        UniversalImage universalImage = this.f171418o;
        int iHashCode3 = (i12 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.f171419p;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NodeItem(stringId=");
        sb2.append(this.f171405b);
        sb2.append(", categoryId=");
        sb2.append(this.f171406c);
        sb2.append(", deeplink=");
        sb2.append(this.f171407d);
        sb2.append(", nodeId=");
        sb2.append(this.f171408e);
        sb2.append(", microCategoryId=");
        sb2.append(this.f171409f);
        sb2.append(", title=");
        sb2.append(this.f171410g);
        sb2.append(", subtitle=");
        sb2.append(this.f171411h);
        sb2.append(", parentId=");
        sb2.append(this.f171412i);
        sb2.append(", checked=");
        sb2.append(this.f171413j);
        sb2.append(", depthLevel=");
        sb2.append(this.f171414k);
        sb2.append(", iconUrl=");
        sb2.append(this.f171415l);
        sb2.append(", hasChildren=");
        sb2.append(this.f171416m);
        sb2.append(", expanded=");
        sb2.append(this.f171417n);
        sb2.append(", categoryImage=");
        sb2.append(this.f171418o);
        sb2.append(", categoryImageBackgroundColor=");
        return C22026a.c(sb2, this.f171419p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f171405b);
        Integer num = this.f171406c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f171407d, i12);
        parcel.writeInt(this.f171408e);
        Integer num2 = this.f171409f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f171410g);
        parcel.writeString(this.f171411h);
        Integer num3 = this.f171412i;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeInt(this.f171413j ? 1 : 0);
        parcel.writeInt(this.f171414k);
        parcel.writeString(this.f171415l);
        parcel.writeInt(this.f171416m ? 1 : 0);
        parcel.writeInt(this.f171417n ? 1 : 0);
        parcel.writeParcelable(this.f171418o, i12);
        parcel.writeString(this.f171419p);
    }

    public /* synthetic */ NodeItem(String str, Integer num, DeepLink deepLink, int i12, Integer num2, String str2, String str3, Integer num3, boolean z12, int i13, String str4, boolean z13, boolean z14, UniversalImage universalImage, String str5, int i14, C42822w c42822w) {
        this(str, num, deepLink, i12, num2, str2, (i14 & 64) != 0 ? null : str3, num3, z12, i13, str4, (i14 & 2048) != 0 ? false : z13, (i14 & 4096) != 0 ? false : z14, (i14 & 8192) != 0 ? null : universalImage, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str5);
    }
}
