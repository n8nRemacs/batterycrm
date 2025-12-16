package com.avito.android.section.vertical.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionVerticalAdapterItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/vertical/adapter/SectionVerticalAdapterItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionVerticalAdapterItem implements Q, l1, PersistableSerpItem {

    @k
    public static final Parcelable.Creator<SectionVerticalAdapterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PersistableSpannedItem> f264929b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f264930c;

    /* renamed from: d, reason: collision with root package name */
    public final int f264931d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f264932e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f264933f;

    /* compiled from: SectionVerticalAdapterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionVerticalAdapterItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionVerticalAdapterItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SectionVerticalAdapterItem.class, parcel, arrayList, iL2, 1);
            }
            return new SectionVerticalAdapterItem(arrayList, parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionVerticalAdapterItem[] newArray(int i12) {
            return new SectionVerticalAdapterItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionVerticalAdapterItem(@k List<? extends PersistableSpannedItem> list, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f264929b = list;
        this.f264930c = str;
        this.f264931d = i12;
        this.f264932e = serpDisplayType;
        this.f264933f = serpViewType;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f264932e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionVerticalAdapterItem)) {
            return false;
        }
        SectionVerticalAdapterItem sectionVerticalAdapterItem = (SectionVerticalAdapterItem) obj;
        return L.f(this.f264929b, sectionVerticalAdapterItem.f264929b) && L.f(this.f264930c, sectionVerticalAdapterItem.f264930c) && this.f264931d == sectionVerticalAdapterItem.f264931d && this.f264932e == sectionVerticalAdapterItem.f264932e && this.f264933f == sectionVerticalAdapterItem.f264933f;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79877j() {
        return this.f264931d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262960b() {
        return this.f264930c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79879l() {
        return this.f264933f;
    }

    public final int hashCode() {
        return this.f264933f.hashCode() + com.avito.android.actions_sheet.a.h(this.f264932e, r.e(this.f264931d, H.d(this.f264929b.hashCode() * 31, 31, this.f264930c), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionVerticalAdapterItem(items=");
        sb2.append(this.f264929b);
        sb2.append(", stringId=");
        sb2.append(this.f264930c);
        sb2.append(", spanCount=");
        sb2.append(this.f264931d);
        sb2.append(", displayType=");
        sb2.append(this.f264932e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f264933f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f264929b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f264930c);
        parcel.writeInt(this.f264931d);
        parcel.writeString(this.f264932e.name());
        parcel.writeString(this.f264933f.name());
    }

    public /* synthetic */ SectionVerticalAdapterItem(List list, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(list, str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
