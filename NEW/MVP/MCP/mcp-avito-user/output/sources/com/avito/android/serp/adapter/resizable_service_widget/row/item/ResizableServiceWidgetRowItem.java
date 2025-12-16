package com.avito.android.serp.adapter.resizable_service_widget.row.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResizableServiceWidgetRowItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/ResizableServiceWidgetRowItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResizableServiceWidgetRowItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<ResizableServiceWidgetRowItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270728b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f270729c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ResizableServiceWidgetRowListItem> f270730d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f270731e;

    /* renamed from: f, reason: collision with root package name */
    public final int f270732f;

    /* compiled from: ResizableServiceWidgetRowItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResizableServiceWidgetRowItem> {
        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetRowItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ResizableServiceWidgetRowListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ResizableServiceWidgetRowItem(string, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetRowItem[] newArray(int i12) {
            return new ResizableServiceWidgetRowItem[i12];
        }
    }

    public ResizableServiceWidgetRowItem(@k String str, boolean z12, @k List<ResizableServiceWidgetRowListItem> list) {
        this.f270728b = str;
        this.f270729c = z12;
        this.f270730d = list;
        this.f270731e = SerpViewType.f268585e;
        this.f270732f = 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResizableServiceWidgetRowItem)) {
            return false;
        }
        ResizableServiceWidgetRowItem resizableServiceWidgetRowItem = (ResizableServiceWidgetRowItem) obj;
        return L.f(this.f270728b, resizableServiceWidgetRowItem.f270728b) && this.f270729c == resizableServiceWidgetRowItem.f270729c && L.f(this.f270730d, resizableServiceWidgetRowItem.f270730d);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF252237h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85704e() {
        return this.f270732f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF147959c() {
        return this.f270728b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85706g() {
        return this.f270731e;
    }

    public final int hashCode() {
        return this.f270730d.hashCode() + r.i(this.f270728b.hashCode() * 31, 31, this.f270729c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResizableServiceWidgetRowItem(stringId=");
        sb2.append(this.f270728b);
        sb2.append(", isExternalAd=");
        sb2.append(this.f270729c);
        sb2.append(", rowItems=");
        return H.p(sb2, this.f270730d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270728b);
        parcel.writeInt(this.f270729c ? 1 : 0);
        Iterator itJ = C0.j(this.f270730d, parcel);
        while (itJ.hasNext()) {
            ((ResizableServiceWidgetRowListItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ ResizableServiceWidgetRowItem(String str, boolean z12, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "RESIZABLE_SERVICE_WIDGET_CONTENT_ITEM_ID" : str, (i12 & 2) != 0 ? false : z12, list);
    }
}
