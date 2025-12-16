package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FreeCancellationDaysChipsItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/DaysOptionChipable;", "Lcom/akita/compose/component/chips/b;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DaysOptionChipable implements InterfaceC27333b, Parcelable {

    @k
    public static final Parcelable.Creator<DaysOptionChipable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f288404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288405c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f288406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f288407e;

    /* compiled from: FreeCancellationDaysChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DaysOptionChipable> {
        @Override // android.os.Parcelable.Creator
        public final DaysOptionChipable createFromParcel(Parcel parcel) {
            return new DaysOptionChipable(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DaysOptionChipable[] newArray(int i12) {
            return new DaysOptionChipable[i12];
        }
    }

    public DaysOptionChipable(@k String str, int i12, boolean z12, boolean z13) {
        this.f288404b = i12;
        this.f288405c = str;
        this.f288406d = z12;
        this.f288407e = z13;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    public final Integer c() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    public final Integer d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaysOptionChipable)) {
            return false;
        }
        DaysOptionChipable daysOptionChipable = (DaysOptionChipable) obj;
        return this.f288404b == daysOptionChipable.f288404b && L.f(this.f288405c, daysOptionChipable.f288405c) && this.f288406d == daysOptionChipable.f288406d && this.f288407e == daysOptionChipable.f288407e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF288405c() {
        return this.f288405c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288407e) + r.i(H.d(Integer.hashCode(this.f288404b) * 31, 31, this.f288405c), 31, this.f288406d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    public final boolean isActive() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF288407e() {
        return this.f288407e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF288406d() {
        return this.f288406d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DaysOptionChipable(id=");
        sb2.append(this.f288404b);
        sb2.append(", title=");
        sb2.append(this.f288405c);
        sb2.append(", isSelected=");
        sb2.append(this.f288406d);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f288407e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f288404b);
        parcel.writeString(this.f288405c);
        parcel.writeInt(this.f288406d ? 1 : 0);
        parcel.writeInt(this.f288407e ? 1 : 0);
    }

    public /* synthetic */ DaysOptionChipable(int i12, String str, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? true : z13);
    }
}
