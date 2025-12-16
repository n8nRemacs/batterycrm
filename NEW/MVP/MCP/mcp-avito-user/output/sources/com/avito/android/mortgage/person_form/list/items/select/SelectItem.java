package com.avito.android.mortgage.person_form.list.items.select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/SelectItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormCompactItem;", "Option", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectItem implements PersonFormCompactItem {

    @k
    public static final Parcelable.Creator<SelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200743b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200744c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f200745d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f200746e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f200747f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f200748g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Option> f200749h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Option f200750i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f200751j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f200752k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f200753l;

    /* compiled from: SelectItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/SelectItem$Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200754b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f200755c;

        /* compiled from: SelectItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @k String str2) {
            this.f200754b = str;
            this.f200755c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.f200754b, option.f200754b) && L.f(this.f200755c, option.f200755c);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.f200754b;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF229826b() {
            return this.f200755c;
        }

        public final int hashCode() {
            return this.f200755c.hashCode() + (this.f200754b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(value=");
            sb2.append(this.f200754b);
            sb2.append(", label=");
            return C22026a.c(sb2, this.f200755c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f200754b);
            parcel.writeString(this.f200755c);
        }
    }

    /* compiled from: SelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SelectItem.class.getClassLoader());
            String string4 = parcel.readString();
            PrintableText printableText = (PrintableText) parcel.readParcelable(SelectItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectItem(string, string2, string3, attributedText, string4, printableText, arrayList, parcel.readInt() == 0 ? null : Option.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItem[] newArray(int i12) {
            return new SelectItem[i12];
        }
    }

    public SelectItem(@k String str, @k String str2, @l String str3, @l AttributedText attributedText, @k String str4, @l PrintableText printableText, @k List<Option> list, @l Option option, boolean z12, boolean z13, boolean z14) {
        this.f200743b = str;
        this.f200744c = str2;
        this.f200745d = str3;
        this.f200746e = attributedText;
        this.f200747f = str4;
        this.f200748g = printableText;
        this.f200749h = list;
        this.f200750i = option;
        this.f200751j = z12;
        this.f200752k = z13;
        this.f200753l = z14;
    }

    public static SelectItem a(SelectItem selectItem, int i12) {
        String str = selectItem.f200743b;
        String str2 = selectItem.f200744c;
        String str3 = selectItem.f200745d;
        AttributedText attributedText = selectItem.f200746e;
        String str4 = selectItem.f200747f;
        PrintableText printableText = selectItem.f200748g;
        List<Option> list = selectItem.f200749h;
        Option option = selectItem.f200750i;
        boolean z12 = selectItem.f200751j;
        boolean z13 = (i12 & 512) != 0 ? selectItem.f200752k : false;
        boolean z14 = (i12 & 1024) != 0 ? selectItem.f200753l : false;
        selectItem.getClass();
        return new SelectItem(str, str2, str3, attributedText, str4, printableText, list, option, z12, z13, z14);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return a(this, 1023);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem
    /* renamed from: Q0, reason: from getter */
    public final boolean getF200752k() {
        return this.f200752k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItem)) {
            return false;
        }
        SelectItem selectItem = (SelectItem) obj;
        return L.f(this.f200743b, selectItem.f200743b) && L.f(this.f200744c, selectItem.f200744c) && L.f(this.f200745d, selectItem.f200745d) && L.f(this.f200746e, selectItem.f200746e) && L.f(this.f200747f, selectItem.f200747f) && L.f(this.f200748g, selectItem.f200748g) && L.f(this.f200749h, selectItem.f200749h) && L.f(this.f200750i, selectItem.f200750i) && this.f200751j == selectItem.f200751j && this.f200752k == selectItem.f200752k && this.f200753l == selectItem.f200753l;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200643d() {
        return this.f200753l;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return this.f200748g != null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183738b() {
        return this.f200743b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f200743b.hashCode() * 31, 31, this.f200744c);
        String str = this.f200745d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f200746e;
        int iD3 = H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f200747f);
        PrintableText printableText = this.f200748g;
        int iE2 = H.e((iD3 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f200749h);
        Option option = this.f200750i;
        return Boolean.hashCode(this.f200753l) + r.i(r.i((iE2 + (option != null ? option.hashCode() : 0)) * 31, 31, this.f200751j), 31, this.f200752k);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem
    @k
    public final PersonFormCompactItem k5() {
        return a(this, 1535);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f200743b);
        sb2.append(", title=");
        sb2.append(this.f200744c);
        sb2.append(", subtitle=");
        sb2.append(this.f200745d);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f200746e);
        sb2.append(", placeholder=");
        sb2.append(this.f200747f);
        sb2.append(", errorMessage=");
        sb2.append(this.f200748g);
        sb2.append(", options=");
        sb2.append(this.f200749h);
        sb2.append(", selectedOption=");
        sb2.append(this.f200750i);
        sb2.append(", canClear=");
        sb2.append(this.f200751j);
        sb2.append(", isCompact=");
        sb2.append(this.f200752k);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200753l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200743b);
        parcel.writeString(this.f200744c);
        parcel.writeString(this.f200745d);
        parcel.writeParcelable(this.f200746e, i12);
        parcel.writeString(this.f200747f);
        parcel.writeParcelable(this.f200748g, i12);
        Iterator itJ = C0.j(this.f200749h, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        Option option = this.f200750i;
        if (option == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            option.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f200751j ? 1 : 0);
        parcel.writeInt(this.f200752k ? 1 : 0);
        parcel.writeInt(this.f200753l ? 1 : 0);
    }

    public /* synthetic */ SelectItem(String str, String str2, String str3, AttributedText attributedText, String str4, PrintableText printableText, List list, Option option, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, attributedText, str4, printableText, list, option, z12, z13, (i12 & 1024) != 0 ? true : z14);
    }
}
