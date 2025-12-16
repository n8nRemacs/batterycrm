package com.avito.android.mortgage.person_form.list.items.input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/InputItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormCompactItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InputItem implements PersonFormCompactItem {

    @k
    public static final Parcelable.Creator<InputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200688b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200689c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f200690d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f200691e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f200692f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f200693g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f200694h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PrintableText f200695i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final FormatterType f200696j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f200697k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f200698l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f200699m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f200700n;

    /* compiled from: InputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputItem> {
        @Override // android.os.Parcelable.Creator
        public final InputItem createFromParcel(Parcel parcel) {
            return new InputItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(InputItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(InputItem.class.getClassLoader()), (FormatterType) parcel.readParcelable(InputItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InputItem[] newArray(int i12) {
            return new InputItem[i12];
        }
    }

    public InputItem(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @l String str6, @l AttributedText attributedText, @l PrintableText printableText, @k FormatterType formatterType, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f200688b = str;
        this.f200689c = str2;
        this.f200690d = str3;
        this.f200691e = str4;
        this.f200692f = str5;
        this.f200693g = str6;
        this.f200694h = attributedText;
        this.f200695i = printableText;
        this.f200696j = formatterType;
        this.f200697k = z12;
        this.f200698l = z13;
        this.f200699m = z14;
        this.f200700n = z15;
    }

    public static InputItem a(InputItem inputItem, int i12) {
        String str = inputItem.f200688b;
        String str2 = inputItem.f200689c;
        String str3 = inputItem.f200690d;
        String str4 = inputItem.f200691e;
        String str5 = inputItem.f200692f;
        String str6 = inputItem.f200693g;
        AttributedText attributedText = inputItem.f200694h;
        PrintableText printableText = inputItem.f200695i;
        FormatterType formatterType = inputItem.f200696j;
        boolean z12 = inputItem.f200697k;
        boolean z13 = (i12 & 1024) != 0 ? inputItem.f200698l : false;
        boolean z14 = inputItem.f200699m;
        boolean z15 = (i12 & 4096) != 0 ? inputItem.f200700n : false;
        inputItem.getClass();
        return new InputItem(str, str2, str3, str4, str5, str6, attributedText, printableText, formatterType, z12, z13, z14, z15);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return a(this, 4095);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem
    /* renamed from: Q0, reason: from getter */
    public final boolean getF200752k() {
        return this.f200698l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItem)) {
            return false;
        }
        InputItem inputItem = (InputItem) obj;
        return L.f(this.f200688b, inputItem.f200688b) && L.f(this.f200689c, inputItem.f200689c) && L.f(this.f200690d, inputItem.f200690d) && L.f(this.f200691e, inputItem.f200691e) && L.f(this.f200692f, inputItem.f200692f) && L.f(this.f200693g, inputItem.f200693g) && L.f(this.f200694h, inputItem.f200694h) && L.f(this.f200695i, inputItem.f200695i) && L.f(this.f200696j, inputItem.f200696j) && this.f200697k == inputItem.f200697k && this.f200698l == inputItem.f200698l && this.f200699m == inputItem.f200699m && this.f200700n == inputItem.f200700n;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200643d() {
        return this.f200700n;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return this.f200695i != null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154783b() {
        return this.f200688b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(this.f200688b.hashCode() * 31, 31, this.f200689c), 31, this.f200690d), 31, this.f200691e), 31, this.f200692f);
        String str = this.f200693g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f200694h;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        PrintableText printableText = this.f200695i;
        return Boolean.hashCode(this.f200700n) + r.i(r.i(r.i((this.f200696j.hashCode() + ((iHashCode2 + (printableText != null ? printableText.hashCode() : 0)) * 31)) * 31, 31, this.f200697k), 31, this.f200698l), 31, this.f200699m);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem
    @k
    public final PersonFormCompactItem k5() {
        return a(this, 7167);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputItem(stringId=");
        sb2.append(this.f200688b);
        sb2.append(", name=");
        sb2.append(this.f200689c);
        sb2.append(", title=");
        sb2.append(this.f200690d);
        sb2.append(", placeholder=");
        sb2.append(this.f200691e);
        sb2.append(", value=");
        sb2.append(this.f200692f);
        sb2.append(", subtitle=");
        sb2.append(this.f200693g);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f200694h);
        sb2.append(", errorMessage=");
        sb2.append(this.f200695i);
        sb2.append(", formatterType=");
        sb2.append(this.f200696j);
        sb2.append(", clearOnFocus=");
        sb2.append(this.f200697k);
        sb2.append(", isCompact=");
        sb2.append(this.f200698l);
        sb2.append(", saveFormatting=");
        sb2.append(this.f200699m);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200700n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200688b);
        parcel.writeString(this.f200689c);
        parcel.writeString(this.f200690d);
        parcel.writeString(this.f200691e);
        parcel.writeString(this.f200692f);
        parcel.writeString(this.f200693g);
        parcel.writeParcelable(this.f200694h, i12);
        parcel.writeParcelable(this.f200695i, i12);
        parcel.writeParcelable(this.f200696j, i12);
        parcel.writeInt(this.f200697k ? 1 : 0);
        parcel.writeInt(this.f200698l ? 1 : 0);
        parcel.writeInt(this.f200699m ? 1 : 0);
        parcel.writeInt(this.f200700n ? 1 : 0);
    }

    public /* synthetic */ InputItem(String str, String str2, String str3, String str4, String str5, String str6, AttributedText attributedText, PrintableText printableText, FormatterType formatterType, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, attributedText, printableText, formatterType, z12, z13, (i12 & 2048) != 0 ? false : z14, (i12 & 4096) != 0 ? true : z15);
    }
}
