package com.avito.android.mortgage.landing.list.items.chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.lib.design.chips.h;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.ValueItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/ChipsItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/android/mortgage/landing/list/items/ValueItem;", "Chip", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChipsItem implements LandingItem, ValueItem {

    @k
    public static final Parcelable.Creator<ChipsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199668b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199669c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Chip> f199670d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Chip f199671e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f199672f;

    /* compiled from: ChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/chips/ChipsItem$Chip;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Chip implements h, Parcelable {

        @k
        public static final Parcelable.Creator<Chip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CharSequence f199673b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f199674c;

        /* compiled from: ChipsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Chip> {
            @Override // android.os.Parcelable.Creator
            public final Chip createFromParcel(Parcel parcel) {
                return new Chip((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Chip[] newArray(int i12) {
                return new Chip[i12];
            }
        }

        public Chip(@k CharSequence charSequence, @k String str) {
            this.f199673b = charSequence;
            this.f199674c = str;
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
            if (obj instanceof Chip) {
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W, reason: from getter */
        public final CharSequence getF278901b() {
            return this.f199673b;
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

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return L.f(this.f199673b, chip.f199673b) && L.f(this.f199674c, chip.f199674c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF13713d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f199674c.hashCode() + (this.f199673b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF171727d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(chipTitle=");
            sb2.append((Object) this.f199673b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f199674c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            TextUtils.writeToParcel(this.f199673b, parcel, i12);
            parcel.writeString(this.f199674c);
        }
    }

    /* compiled from: ChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChipsItem> {
        @Override // android.os.Parcelable.Creator
        public final ChipsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Chip.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ChipsItem(string, i12, arrayList, parcel.readInt() == 0 ? null : Chip.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChipsItem[] newArray(int i12) {
            return new ChipsItem[i12];
        }
    }

    public ChipsItem(@k String str, @e0 int i12, @k List<Chip> list, @l Chip chip, boolean z12) {
        this.f199668b = str;
        this.f199669c = i12;
        this.f199670d = list;
        this.f199671e = chip;
        this.f199672f = z12;
    }

    public static ChipsItem a(ChipsItem chipsItem, Chip chip, int i12) {
        String str = chipsItem.f199668b;
        int i13 = chipsItem.f199669c;
        List<Chip> list = chipsItem.f199670d;
        if ((i12 & 8) != 0) {
            chip = chipsItem.f199671e;
        }
        Chip chip2 = chip;
        boolean z12 = (i12 & 16) != 0 ? chipsItem.f199672f : false;
        chipsItem.getClass();
        return new ChipsItem(str, i13, list, chip2, z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return a(this, null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipsItem)) {
            return false;
        }
        ChipsItem chipsItem = (ChipsItem) obj;
        return L.f(this.f199668b, chipsItem.f199668b) && this.f199669c == chipsItem.f199669c && L.f(this.f199670d, chipsItem.f199670d) && L.f(this.f199671e, chipsItem.f199671e) && this.f199672f == chipsItem.f199672f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF102010b() {
        return this.f199668b;
    }

    public final int hashCode() {
        int iE2 = H.e(r.e(this.f199669c, this.f199668b.hashCode() * 31, 31), 31, this.f199670d);
        Chip chip = this.f199671e;
        return Boolean.hashCode(this.f199672f) + ((iE2 + (chip == null ? 0 : chip.hashCode())) * 31);
    }

    @Override // com.avito.android.mortgage.landing.list.items.ValueItem
    @l
    public final String s1() {
        Chip chip = this.f199671e;
        if (chip != null) {
            return chip.f199674c;
        }
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsItem(stringId=");
        sb2.append(this.f199668b);
        sb2.append(", title=");
        sb2.append(this.f199669c);
        sb2.append(", chips=");
        sb2.append(this.f199670d);
        sb2.append(", selectedChip=");
        sb2.append(this.f199671e);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199672f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199668b);
        parcel.writeInt(this.f199669c);
        Iterator itJ = C0.j(this.f199670d, parcel);
        while (itJ.hasNext()) {
            ((Chip) itJ.next()).writeToParcel(parcel, i12);
        }
        Chip chip = this.f199671e;
        if (chip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chip.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f199672f ? 1 : 0);
    }

    public /* synthetic */ ChipsItem(String str, int i12, List list, Chip chip, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, list, chip, (i13 & 16) != 0 ? true : z12);
    }
}
