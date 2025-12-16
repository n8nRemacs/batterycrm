package com.avito.android.advert.item.icebreakers_redesign;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.chips.e;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IcebreakerRedesignChips.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/icebreakers_redesign/IcebreakerRedesignChips;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IcebreakerRedesignChips implements com.avito.android.lib.design.chips.h, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<IcebreakerRedesignChips> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f76512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f76513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f76514d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76515e;

    /* compiled from: IcebreakerRedesignChips.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IcebreakerRedesignChips> {
        @Override // android.os.Parcelable.Creator
        public final IcebreakerRedesignChips createFromParcel(Parcel parcel) {
            return new IcebreakerRedesignChips(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IcebreakerRedesignChips[] newArray(int i12) {
            return new IcebreakerRedesignChips[i12];
        }
    }

    public IcebreakerRedesignChips(int i12, @Y61.l Integer num, @Y61.k String str, boolean z12) {
        this.f76512b = i12;
        this.f76513c = str;
        this.f76514d = num;
        this.f76515e = z12;
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
        return (obj instanceof IcebreakerRedesignChips) && ((IcebreakerRedesignChips) obj).f76512b == this.f76512b;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f76513c;
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
        if (!(obj instanceof IcebreakerRedesignChips)) {
            return false;
        }
        IcebreakerRedesignChips icebreakerRedesignChips = (IcebreakerRedesignChips) obj;
        return this.f76512b == icebreakerRedesignChips.f76512b && L.f(this.f76513c, icebreakerRedesignChips.f76513c) && L.f(this.f76514d, icebreakerRedesignChips.f76514d) && this.f76515e == icebreakerRedesignChips.f76515e;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF13713d() {
        return false;
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
        Integer num;
        if (!this.f76515e || (num = this.f76514d) == null) {
            return null;
        }
        return new e.c(num.intValue());
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f76512b) * 31, 31, this.f76513c);
        Integer num = this.f76514d;
        return Boolean.hashCode(this.f76515e) + ((iD2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF281693d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @Y61.l
    public final com.avito.android.lib.design.chips.e q1() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcebreakerRedesignChips(id=");
        sb2.append(this.f76512b);
        sb2.append(", chipTitle=");
        sb2.append(this.f76513c);
        sb2.append(", iconRes=");
        sb2.append(this.f76514d);
        sb2.append(", isActionChip=");
        return r.x(sb2, this.f76515e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f76512b);
        parcel.writeString(this.f76513c);
        Integer num = this.f76514d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f76515e ? 1 : 0);
    }

    public /* synthetic */ IcebreakerRedesignChips(int i12, String str, Integer num, boolean z12, int i13, C42822w c42822w) {
        this(i12, (i13 & 4) != 0 ? null : num, str, (i13 & 8) != 0 ? false : z12);
    }
}
