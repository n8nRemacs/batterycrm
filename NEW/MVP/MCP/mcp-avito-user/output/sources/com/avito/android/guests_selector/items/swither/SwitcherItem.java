package com.avito.android.guests_selector.items.swither;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/items/swither/SwitcherItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SwitcherItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161505b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f161506c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161507d;

    /* compiled from: SwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final SwitcherItem createFromParcel(Parcel parcel) {
            return new SwitcherItem((AttributedText) parcel.readParcelable(SwitcherItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SwitcherItem[] newArray(int i12) {
            return new SwitcherItem[i12];
        }
    }

    public SwitcherItem(@k AttributedText attributedText, @k String str, boolean z12) {
        this.f161505b = str;
        this.f161506c = attributedText;
        this.f161507d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitcherItem)) {
            return false;
        }
        SwitcherItem switcherItem = (SwitcherItem) obj;
        return L.f(this.f161505b, switcherItem.f161505b) && L.f(this.f161506c, switcherItem.f161506c) && this.f161507d == switcherItem.f161507d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85687d() {
        return this.f161505b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161507d) + com.avito.android.actions_sheet.a.b(this.f161505b.hashCode() * 31, 31, this.f161506c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherItem(stringId=");
        sb2.append(this.f161505b);
        sb2.append(", title=");
        sb2.append(this.f161506c);
        sb2.append(", value=");
        return r.x(sb2, this.f161507d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161505b);
        parcel.writeParcelable(this.f161506c, i12);
        parcel.writeInt(this.f161507d ? 1 : 0);
    }
}
