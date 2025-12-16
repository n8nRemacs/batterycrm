package com.avito.android.tariff_lf_constructor.configure.locations.items.badges;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.chips.e;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocationBadgeItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/LocationBadgeItem;", "Lcom/avito/android/lib/design/chips/h;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocationBadgeItem implements com.avito.android.lib.design.chips.h, ParcelableItem {

    @k
    public static final Parcelable.Creator<LocationBadgeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299922b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299923c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f299924d;

    /* compiled from: LocationBadgeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationBadgeItem> {
        @Override // android.os.Parcelable.Creator
        public final LocationBadgeItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LocationBadgeItem(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationBadgeItem[] newArray(int i12) {
            return new LocationBadgeItem[i12];
        }
    }

    public LocationBadgeItem(@k String str, @k String str2, @l Boolean bool) {
        this.f299922b = str;
        this.f299923c = str2;
        this.f299924d = bool;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (obj instanceof LocationBadgeItem) {
            return L.f(this.f299922b, ((LocationBadgeItem) obj).f299922b);
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF114848c() {
        return this.f299923c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF262143e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299922b() {
        return this.f299922b;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF287110c() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    public final com.avito.android.lib.design.chips.e q1() {
        return new e.b(R.attr.ic_close16);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f299922b);
        parcel.writeString(this.f299923c);
        Boolean bool = this.f299924d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ LocationBadgeItem(String str, String str2, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? Boolean.FALSE : bool);
    }
}
