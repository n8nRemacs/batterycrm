package com.avito.android.mortgage.landing.list.items.input;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
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
import kotlin.jvm.internal.s0;

/* compiled from: InputItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/InputItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/android/mortgage/landing/list/items/ValueItem;", "Chip", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes15.dex */
public final /* data */ class InputItem implements LandingItem, ValueItem {

    @Y61.k
    public static final Parcelable.Creator<InputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f199729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199730c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f199731d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final FormatterType f199732e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LabelValueParameter f199733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LabelValueParameter f199734g;

    /* renamed from: h, reason: collision with root package name */
    public final double f199735h;

    /* renamed from: i, reason: collision with root package name */
    public final double f199736i;

    /* renamed from: j, reason: collision with root package name */
    public final double f199737j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<Chip> f199738k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f199739l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f199740m;

    /* compiled from: InputItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/InputItem$Chip;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Chip implements com.avito.android.lib.design.chips.h, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Chip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CharSequence f199741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f199742c;

        /* compiled from: InputItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Chip> {
            @Override // android.os.Parcelable.Creator
            public final Chip createFromParcel(Parcel parcel) {
                return new Chip(parcel.readInt(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Chip[] newArray(int i12) {
                return new Chip[i12];
            }
        }

        public Chip(int i12, @Y61.k CharSequence charSequence) {
            this.f199741b = charSequence;
            this.f199742c = i12;
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
            if (obj instanceof Chip) {
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W, reason: from getter */
        public final CharSequence getF264620e() {
            return this.f199741b;
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
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return L.f(this.f199741b, chip.f199741b) && this.f199742c == chip.f199742c;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
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
            return null;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f199742c) + (this.f199741b.hashCode() * 31);
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
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(chipTitle=");
            sb2.append((Object) this.f199741b);
            sb2.append(", value=");
            return r.t(sb2, this.f199742c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            TextUtils.writeToParcel(this.f199741b, parcel, i12);
            parcel.writeInt(this.f199742c);
        }
    }

    /* compiled from: InputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputItem> {
        @Override // android.os.Parcelable.Creator
        public final InputItem createFromParcel(Parcel parcel) {
            double d12;
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            FormatterType formatterType = (FormatterType) parcel.readParcelable(InputItem.class.getClassLoader());
            Parcelable.Creator<LabelValueParameter> creator = LabelValueParameter.CREATOR;
            LabelValueParameter labelValueParameterCreateFromParcel = creator.createFromParcel(parcel);
            LabelValueParameter labelValueParameterCreateFromParcel2 = creator.createFromParcel(parcel);
            double d13 = parcel.readDouble();
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            if (parcel.readInt() == 0) {
                d12 = d15;
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(Chip.CREATOR, parcel, arrayList2, iC2, 1);
                    i13 = i13;
                    d15 = d15;
                }
                d12 = d15;
                arrayList = arrayList2;
            }
            return new InputItem(string, i12, numValueOf, formatterType, labelValueParameterCreateFromParcel, labelValueParameterCreateFromParcel2, d13, d14, d12, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InputItem[] newArray(int i12) {
            return new InputItem[i12];
        }
    }

    public InputItem(@Y61.k String str, @e0 int i12, @Y61.l Integer num, @Y61.l FormatterType formatterType, @Y61.k LabelValueParameter labelValueParameter, @Y61.k LabelValueParameter labelValueParameter2, double d12, double d13, double d14, @Y61.l List<Chip> list, boolean z12, boolean z13) {
        this.f199729b = str;
        this.f199730c = i12;
        this.f199731d = num;
        this.f199732e = formatterType;
        this.f199733f = labelValueParameter;
        this.f199734g = labelValueParameter2;
        this.f199735h = d12;
        this.f199736i = d13;
        this.f199737j = d14;
        this.f199738k = list;
        this.f199739l = z12;
        this.f199740m = z13;
    }

    public static InputItem a(InputItem inputItem, Integer num, FormatterType formatterType, double d12, int i12) {
        String str = inputItem.f199729b;
        int i13 = inputItem.f199730c;
        Integer num2 = (i12 & 4) != 0 ? inputItem.f199731d : num;
        FormatterType formatterType2 = (i12 & 8) != 0 ? inputItem.f199732e : formatterType;
        LabelValueParameter labelValueParameter = inputItem.f199733f;
        LabelValueParameter labelValueParameter2 = inputItem.f199734g;
        double d13 = inputItem.f199735h;
        double d14 = inputItem.f199736i;
        double d15 = (i12 & 256) != 0 ? inputItem.f199737j : d12;
        List<Chip> list = inputItem.f199738k;
        boolean z12 = inputItem.f199739l;
        boolean z13 = (i12 & 2048) != 0 ? inputItem.f199740m : false;
        inputItem.getClass();
        return new InputItem(str, i13, num2, formatterType2, labelValueParameter, labelValueParameter2, d13, d14, d15, list, z12, z13);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @Y61.k
    public final LandingItem N() {
        return a(this, null, null, 0.0d, 2047);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItem)) {
            return false;
        }
        InputItem inputItem = (InputItem) obj;
        return L.f(this.f199729b, inputItem.f199729b) && this.f199730c == inputItem.f199730c && L.f(this.f199731d, inputItem.f199731d) && L.f(this.f199732e, inputItem.f199732e) && L.f(this.f199733f, inputItem.f199733f) && L.f(this.f199734g, inputItem.f199734g) && Double.compare(this.f199735h, inputItem.f199735h) == 0 && Double.compare(this.f199736i, inputItem.f199736i) == 0 && Double.compare(this.f199737j, inputItem.f199737j) == 0 && L.f(this.f199738k, inputItem.f199738k) && this.f199739l == inputItem.f199739l && this.f199740m == inputItem.f199740m;
    }

    @Y61.l
    public final Integer f() {
        List<Chip> list = this.f199738k;
        if (list == null) {
            return null;
        }
        Iterator<Chip> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            int i13 = it.next().f199742c;
            Integer numValueOf = this.f199739l ? Integer.valueOf(kotlin.math.b.a(this.f199737j)) : this.f199731d;
            if (numValueOf != null && i13 == numValueOf.intValue()) {
                break;
            }
            i12++;
        }
        Integer numValueOf2 = Integer.valueOf(i12);
        if (numValueOf2.intValue() >= 0) {
            return numValueOf2;
        }
        return null;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152611b() {
        return this.f199729b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f199730c, this.f199729b.hashCode() * 31, 31);
        Integer num = this.f199731d;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        FormatterType formatterType = this.f199732e;
        int iD2 = androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d((this.f199734g.hashCode() + ((this.f199733f.hashCode() + ((iHashCode + (formatterType == null ? 0 : formatterType.hashCode())) * 31)) * 31)) * 31, 31, this.f199735h), 31, this.f199736i), 31, this.f199737j);
        List<Chip> list = this.f199738k;
        return Boolean.hashCode(this.f199740m) + r.i((iD2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f199739l);
    }

    @Override // com.avito.android.mortgage.landing.list.items.ValueItem
    @Y61.l
    public final String s1() {
        Integer num = this.f199731d;
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputItem(stringId=");
        sb2.append(this.f199729b);
        sb2.append(", title=");
        sb2.append(this.f199730c);
        sb2.append(", value=");
        sb2.append(this.f199731d);
        sb2.append(", formatter=");
        sb2.append(this.f199732e);
        sb2.append(", minValue=");
        sb2.append(this.f199733f);
        sb2.append(", maxValue=");
        sb2.append(this.f199734g);
        sb2.append(", minSliderValue=");
        sb2.append(this.f199735h);
        sb2.append(", maxSliderValue=");
        sb2.append(this.f199736i);
        sb2.append(", sliderValue=");
        sb2.append(this.f199737j);
        sb2.append(", predefinedValues=");
        sb2.append(this.f199738k);
        sb2.append(", sliderAsPredefinedValue=");
        sb2.append(this.f199739l);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199740m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f199729b);
        parcel.writeInt(this.f199730c);
        Integer num = this.f199731d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f199732e, i12);
        this.f199733f.writeToParcel(parcel, i12);
        this.f199734g.writeToParcel(parcel, i12);
        parcel.writeDouble(this.f199735h);
        parcel.writeDouble(this.f199736i);
        parcel.writeDouble(this.f199737j);
        List<Chip> list = this.f199738k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Chip) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f199739l ? 1 : 0);
        parcel.writeInt(this.f199740m ? 1 : 0);
    }

    public /* synthetic */ InputItem(String str, int i12, Integer num, FormatterType formatterType, LabelValueParameter labelValueParameter, LabelValueParameter labelValueParameter2, double d12, double d13, double d14, List list, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, num, formatterType, labelValueParameter, labelValueParameter2, d12, d13, d14, list, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? true : z13);
    }
}
