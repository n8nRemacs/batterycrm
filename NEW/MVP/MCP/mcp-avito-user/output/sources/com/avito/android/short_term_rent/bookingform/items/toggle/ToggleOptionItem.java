package com.avito.android.short_term_rent.bookingform.items.toggle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleOptionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionItem;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleOptionItem implements com.avito.android.lib.design.chips.h, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ToggleOptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f281692c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f281693d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f281694e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Long f281695f;

    /* compiled from: ToggleOptionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleOptionItem> {
        @Override // android.os.Parcelable.Creator
        public final ToggleOptionItem createFromParcel(Parcel parcel) {
            return new ToggleOptionItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleOptionItem[] newArray(int i12) {
            return new ToggleOptionItem[i12];
        }
    }

    public ToggleOptionItem(@Y61.k String str, boolean z12, boolean z13, @Y61.k String str2, @Y61.l Long l12) {
        this.f281691b = str;
        this.f281692c = str2;
        this.f281693d = z12;
        this.f281694e = z13;
        this.f281695f = l12;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@Y61.k Object obj) {
        if (obj instanceof ToggleOptionItem) {
            if (L.f(this.f281691b, ((ToggleOptionItem) obj).f281691b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.k
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f281692c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e e2() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleOptionItem)) {
            return false;
        }
        ToggleOptionItem toggleOptionItem = (ToggleOptionItem) obj;
        return L.f(this.f281691b, toggleOptionItem.f281691b) && L.f(this.f281692c, toggleOptionItem.f281692c) && this.f281693d == toggleOptionItem.f281693d && this.f281694e == toggleOptionItem.f281694e && L.f(this.f281695f, toggleOptionItem.f281695f);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0, reason: from getter */
    public final boolean getF106770d() {
        return this.f281694e;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e getImage() {
        return null;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(H.d(this.f281691b.hashCode() * 31, 31, this.f281692c), 31, this.f281693d), 31, this.f281694e);
        Long l12 = this.f281695f;
        return i12 + (l12 == null ? 0 : l12.hashCode());
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled, reason: from getter */
    public final boolean getF171727d() {
        return this.f281693d;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleOptionItem(parameterId=");
        sb2.append(this.f281691b);
        sb2.append(", text=");
        sb2.append(this.f281692c);
        sb2.append(", isEnabled=");
        sb2.append(this.f281693d);
        sb2.append(", isSelected=");
        sb2.append(this.f281694e);
        sb2.append(", value=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f281695f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281691b);
        parcel.writeString(this.f281692c);
        parcel.writeInt(this.f281693d ? 1 : 0);
        parcel.writeInt(this.f281694e ? 1 : 0);
        Long l12 = this.f281695f;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
