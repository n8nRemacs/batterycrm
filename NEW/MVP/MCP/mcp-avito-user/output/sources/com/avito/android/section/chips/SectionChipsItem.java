package com.avito.android.section.chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionChipsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/chips/SectionChipsItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionChipsItem implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<SectionChipsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264622b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264623c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f264624d;

    /* compiled from: SectionChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionChipsItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionChipsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SectionChip.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SectionChipsItem(i12, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionChipsItem[] newArray(int i12) {
            return new SectionChipsItem[i12];
        }
    }

    public SectionChipsItem(int i12, @k String str, @k ArrayList arrayList) {
        this.f264622b = str;
        this.f264623c = i12;
        this.f264624d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionChipsItem)) {
            return false;
        }
        SectionChipsItem sectionChipsItem = (SectionChipsItem) obj;
        return L.f(this.f264622b, sectionChipsItem.f264622b) && this.f264623c == sectionChipsItem.f264623c && this.f264624d.equals(sectionChipsItem.f264624d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268422b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f264623c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268425c() {
        return this.f264622b;
    }

    public final int hashCode() {
        return this.f264624d.hashCode() + r.e(this.f264623c, this.f264622b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionChipsItem(stringId=");
        sb2.append(this.f264622b);
        sb2.append(", spanCount=");
        sb2.append(this.f264623c);
        sb2.append(", chips=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f264624d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264622b);
        parcel.writeInt(this.f264623c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f264624d, parcel);
        while (itZ.hasNext()) {
            ((SectionChip) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
