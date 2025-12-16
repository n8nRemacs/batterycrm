package com.avito.android.mortgage.person_form.list.items.chips;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/ChipsItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "Chip", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes15.dex */
public final /* data */ class ChipsItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<ChipsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200655c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f200656d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f200657e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Chip> f200658f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f200659g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final PrintableText f200660h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f200661i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f200662j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f200663k;

    /* compiled from: ChipsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/ChipsItem$Chip;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/design/chips/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Chip implements Parcelable, com.avito.android.lib.design.chips.h {

        @k
        public static final Parcelable.Creator<Chip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200664b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f200665c;

        /* compiled from: ChipsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Chip> {
            @Override // android.os.Parcelable.Creator
            public final Chip createFromParcel(Parcel parcel) {
                return new Chip(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Chip[] newArray(int i12) {
                return new Chip[i12];
            }
        }

        public Chip(@k String str, @k String str2) {
            this.f200664b = str;
            this.f200665c = str2;
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
        /* renamed from: W */
        public final CharSequence getF202417b() {
            return this.f200665c;
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
            return L.f(this.f200664b, chip.f200664b) && L.f(this.f200665c, chip.f200665c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF249891e() {
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
            return this.f200665c.hashCode() + (this.f200664b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF249892f() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(value=");
            sb2.append(this.f200664b);
            sb2.append(", label=");
            return C22026a.c(sb2, this.f200665c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f200664b);
            parcel.writeString(this.f200665c);
        }
    }

    /* compiled from: ChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChipsItem> {
        @Override // android.os.Parcelable.Creator
        public final ChipsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ChipsItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Chip.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ChipsItem(string, string2, string3, attributedText, arrayList, parcel.readString(), (PrintableText) parcel.readParcelable(ChipsItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChipsItem[] newArray(int i12) {
            return new ChipsItem[i12];
        }
    }

    public ChipsItem(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @k List<Chip> list, @l String str4, @l PrintableText printableText, boolean z12, boolean z13, boolean z14) {
        this.f200654b = str;
        this.f200655c = str2;
        this.f200656d = str3;
        this.f200657e = attributedText;
        this.f200658f = list;
        this.f200659g = str4;
        this.f200660h = printableText;
        this.f200661i = z12;
        this.f200662j = z13;
        this.f200663k = z14;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new ChipsItem(this.f200654b, this.f200655c, this.f200656d, this.f200657e, this.f200658f, this.f200659g, this.f200660h, this.f200661i, this.f200662j, false);
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
        return L.f(this.f200654b, chipsItem.f200654b) && L.f(this.f200655c, chipsItem.f200655c) && L.f(this.f200656d, chipsItem.f200656d) && L.f(this.f200657e, chipsItem.f200657e) && L.f(this.f200658f, chipsItem.f200658f) && L.f(this.f200659g, chipsItem.f200659g) && L.f(this.f200660h, chipsItem.f200660h) && this.f200661i == chipsItem.f200661i && this.f200662j == chipsItem.f200662j && this.f200663k == chipsItem.f200663k;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200753l() {
        return this.f200663k;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return this.f200660h != null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183757b() {
        return this.f200654b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f200654b.hashCode() * 31, 31, this.f200655c);
        String str = this.f200656d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f200657e;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f200658f);
        String str2 = this.f200659g;
        int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PrintableText printableText = this.f200660h;
        return Boolean.hashCode(this.f200663k) + r.i(r.i((iHashCode2 + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f200661i), 31, this.f200662j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsItem(stringId=");
        sb2.append(this.f200654b);
        sb2.append(", title=");
        sb2.append(this.f200655c);
        sb2.append(", subtitle=");
        sb2.append(this.f200656d);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f200657e);
        sb2.append(", chips=");
        sb2.append(this.f200658f);
        sb2.append(", selectedChipValue=");
        sb2.append(this.f200659g);
        sb2.append(", errorMessage=");
        sb2.append(this.f200660h);
        sb2.append(", canClear=");
        sb2.append(this.f200661i);
        sb2.append(", canEdit=");
        sb2.append(this.f200662j);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200663k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200654b);
        parcel.writeString(this.f200655c);
        parcel.writeString(this.f200656d);
        parcel.writeParcelable(this.f200657e, i12);
        Iterator itJ = C0.j(this.f200658f, parcel);
        while (itJ.hasNext()) {
            ((Chip) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f200659g);
        parcel.writeParcelable(this.f200660h, i12);
        parcel.writeInt(this.f200661i ? 1 : 0);
        parcel.writeInt(this.f200662j ? 1 : 0);
        parcel.writeInt(this.f200663k ? 1 : 0);
    }

    public /* synthetic */ ChipsItem(String str, String str2, String str3, AttributedText attributedText, List list, String str4, PrintableText printableText, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, list, str4, printableText, z12, z13, (i12 & 512) != 0 ? true : z14);
    }
}
