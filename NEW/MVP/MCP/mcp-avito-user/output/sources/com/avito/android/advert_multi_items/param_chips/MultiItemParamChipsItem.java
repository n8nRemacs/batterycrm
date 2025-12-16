package com.avito.android.advert_multi_items.param_chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_multi_items.param.MultiItemParamHeaderItem;
import com.avito.android.advert_multi_items.param_chips.modification_chip.ModificationChipItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemParamChipsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/param_chips/MultiItemParamChipsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MultiItemParamChipsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MultiItemParamChipsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MultiItemParamHeaderItem f85904b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ModificationChipItem> f85905c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85906d;

    /* compiled from: MultiItemParamChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiItemParamChipsItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiItemParamChipsItem createFromParcel(Parcel parcel) {
            MultiItemParamHeaderItem multiItemParamHeaderItemCreateFromParcel = MultiItemParamHeaderItem.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ModificationChipItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MultiItemParamChipsItem(multiItemParamHeaderItemCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiItemParamChipsItem[] newArray(int i12) {
            return new MultiItemParamChipsItem[i12];
        }
    }

    public MultiItemParamChipsItem(@k MultiItemParamHeaderItem multiItemParamHeaderItem, @k List<ModificationChipItem> list, @k String str) {
        this.f85904b = multiItemParamHeaderItem;
        this.f85905c = list;
        this.f85906d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiItemParamChipsItem)) {
            return false;
        }
        MultiItemParamChipsItem multiItemParamChipsItem = (MultiItemParamChipsItem) obj;
        return L.f(this.f85904b, multiItemParamChipsItem.f85904b) && L.f(this.f85905c, multiItemParamChipsItem.f85905c) && L.f(this.f85906d, multiItemParamChipsItem.f85906d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85532b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85936d() {
        return this.f85906d;
    }

    public final int hashCode() {
        return this.f85906d.hashCode() + H.e(this.f85904b.hashCode() * 31, 31, this.f85905c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiItemParamChipsItem(paramHeader=");
        sb2.append(this.f85904b);
        sb2.append(", modificationChips=");
        sb2.append(this.f85905c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f85906d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f85904b.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.f85905c, parcel);
        while (itJ.hasNext()) {
            ((ModificationChipItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f85906d);
    }

    public MultiItemParamChipsItem(MultiItemParamHeaderItem multiItemParamHeaderItem, List list, String str, int i12, C42822w c42822w) {
        this(multiItemParamHeaderItem, list, (i12 & 4) != 0 ? multiItemParamHeaderItem.f85901b : str);
    }
}
