package com.avito.android.serp.adapter.recomendations;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpandableSectionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/ExpandableSectionItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExpandableSectionItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ExpandableSectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f270540b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270541c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f270542d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f270543e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f270544f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f270545g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSpannedItem> f270546h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f270547i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270548j;

    /* compiled from: ExpandableSectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpandableSectionItem> {
        @Override // android.os.Parcelable.Creator
        public final ExpandableSectionItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(ExpandableSectionItem.class, parcel, arrayList, iL2, 1);
            }
            return new ExpandableSectionItem(i12, string, string2, z12, z13, string3, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpandableSectionItem[] newArray(int i12) {
            return new ExpandableSectionItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableSectionItem(int i12, @Y61.k String str, @Y61.k String str2, boolean z12, boolean z13, @Y61.k String str3, @Y61.k List<? extends PersistableSpannedItem> list, boolean z14) {
        this.f270540b = i12;
        this.f270541c = str;
        this.f270542d = str2;
        this.f270543e = z12;
        this.f270544f = z13;
        this.f270545g = str3;
        this.f270546h = list;
        this.f270547i = z14;
        this.f270548j = SerpViewType.f268584d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableSectionItem)) {
            return false;
        }
        ExpandableSectionItem expandableSectionItem = (ExpandableSectionItem) obj;
        return this.f270540b == expandableSectionItem.f270540b && L.f(this.f270541c, expandableSectionItem.f270541c) && L.f(this.f270542d, expandableSectionItem.f270542d) && this.f270543e == expandableSectionItem.f270543e && this.f270544f == expandableSectionItem.f270544f && L.f(this.f270545g, expandableSectionItem.f270545g) && L.f(this.f270546h, expandableSectionItem.f270546h) && this.f270547i == expandableSectionItem.f270547i;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272443h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270132f() {
        return this.f270540b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270128b() {
        return this.f270545g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270131e() {
        return this.f270548j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270547i) + H.e(H.d(r.i(r.i(H.d(H.d(Integer.hashCode(this.f270540b) * 31, 31, this.f270541c), 31, this.f270542d), 31, this.f270543e), 31, this.f270544f), 31, this.f270545g), 31, this.f270546h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandableSectionItem(spanCount=");
        sb2.append(this.f270540b);
        sb2.append(", title=");
        sb2.append(this.f270541c);
        sb2.append(", iconUrl=");
        sb2.append(this.f270542d);
        sb2.append(", isCollapsed=");
        sb2.append(this.f270543e);
        sb2.append(", isRestyle=");
        sb2.append(this.f270544f);
        sb2.append(", stringId=");
        sb2.append(this.f270545g);
        sb2.append(", sectionItems=");
        sb2.append(this.f270546h);
        sb2.append(", isAutoCategory=");
        return r.x(sb2, this.f270547i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f270540b);
        parcel.writeString(this.f270541c);
        parcel.writeString(this.f270542d);
        parcel.writeInt(this.f270543e ? 1 : 0);
        parcel.writeInt(this.f270544f ? 1 : 0);
        parcel.writeString(this.f270545g);
        Iterator itJ = C0.j(this.f270546h, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f270547i ? 1 : 0);
    }

    public /* synthetic */ ExpandableSectionItem(int i12, String str, String str2, boolean z12, boolean z13, String str3, List list, boolean z14, int i13, C42822w c42822w) {
        this(i12, str, str2, z12, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? UUID.randomUUID().toString() : str3, list, (i13 & 128) != 0 ? false : z14);
    }
}
