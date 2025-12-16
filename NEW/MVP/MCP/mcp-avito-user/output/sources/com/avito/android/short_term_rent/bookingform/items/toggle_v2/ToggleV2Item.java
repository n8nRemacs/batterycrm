package com.avito.android.short_term_rent.bookingform.items.toggle_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle_v2/ToggleV2Item;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleV2Item implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ToggleV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281722b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281723c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f281724d;

    /* compiled from: ToggleV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleV2Item> {
        @Override // android.os.Parcelable.Creator
        public final ToggleV2Item createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ToggleV2Options.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ToggleV2Item(string, arrayList, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleV2Item[] newArray(int i12) {
            return new ToggleV2Item[i12];
        }
    }

    public ToggleV2Item(@k String str, @k ArrayList arrayList, boolean z12) {
        this.f281722b = str;
        this.f281723c = z12;
        this.f281724d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleV2Item)) {
            return false;
        }
        ToggleV2Item toggleV2Item = (ToggleV2Item) obj;
        return L.f(this.f281722b, toggleV2Item.f281722b) && this.f281723c == toggleV2Item.f281723c && this.f281724d.equals(toggleV2Item.f281724d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281670b() {
        return this.f281722b;
    }

    public final int hashCode() {
        return this.f281724d.hashCode() + r.i(this.f281722b.hashCode() * 31, 31, this.f281723c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleV2Item(stringId=");
        sb2.append(this.f281722b);
        sb2.append(", needFormReload=");
        sb2.append(this.f281723c);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f281724d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281722b);
        parcel.writeInt(this.f281723c ? 1 : 0);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281724d, parcel);
        while (itZ.hasNext()) {
            ((ToggleV2Options) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
