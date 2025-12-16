package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: OptionItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<OptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130370b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130371c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130372d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f130373e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Q<Integer, Integer> f130374f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f130375g;

    /* compiled from: OptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OptionItem> {
        @Override // android.os.Parcelable.Creator
        public final OptionItem createFromParcel(Parcel parcel) {
            return new OptionItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (Q) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OptionItem[] newArray(int i12) {
            return new OptionItem[i12];
        }
    }

    public OptionItem(@k String str, boolean z12, boolean z13, @l Long l12, @l Q<Integer, Integer> q12, @k String str2) {
        this.f130370b = str;
        this.f130371c = z12;
        this.f130372d = z13;
        this.f130373e = l12;
        this.f130374f = q12;
        this.f130375g = str2;
    }

    public static OptionItem a(OptionItem optionItem, boolean z12, Q q12, int i12) {
        String str = optionItem.f130370b;
        boolean z13 = optionItem.f130372d;
        Long l12 = optionItem.f130373e;
        if ((i12 & 16) != 0) {
            q12 = optionItem.f130374f;
        }
        String str2 = optionItem.f130375g;
        optionItem.getClass();
        return new OptionItem(str, z12, z13, l12, q12, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionItem)) {
            return false;
        }
        OptionItem optionItem = (OptionItem) obj;
        return L.f(this.f130370b, optionItem.f130370b) && this.f130371c == optionItem.f130371c && this.f130372d == optionItem.f130372d && L.f(this.f130373e, optionItem.f130373e) && L.f(this.f130374f, optionItem.f130374f) && L.f(this.f130375g, optionItem.f130375g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130032d() {
        return this.f130375g;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(this.f130370b.hashCode() * 31, 31, this.f130371c), 31, this.f130372d);
        Long l12 = this.f130373e;
        int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Q<Integer, Integer> q12 = this.f130374f;
        return this.f130375g.hashCode() + ((iHashCode + (q12 != null ? q12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionItem(title=");
        sb2.append(this.f130370b);
        sb2.append(", isSelected=");
        sb2.append(this.f130371c);
        sb2.append(", isMultiselect=");
        sb2.append(this.f130372d);
        sb2.append(", dateInterval=");
        sb2.append(this.f130373e);
        sb2.append(", range=");
        sb2.append(this.f130374f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f130375g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130370b);
        parcel.writeInt(this.f130371c ? 1 : 0);
        parcel.writeInt(this.f130372d ? 1 : 0);
        Long l12 = this.f130373e;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeSerializable(this.f130374f);
        parcel.writeString(this.f130375g);
    }
}
