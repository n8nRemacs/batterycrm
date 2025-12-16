package com.avito.android.mortgage.landing.list.items.select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.ValueItem;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.conveyor_item.a;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/SelectItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/android/mortgage/landing/list/items/ValueItem;", "Option", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectItem implements LandingItem, ValueItem {

    @k
    public static final Parcelable.Creator<SelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199953c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f199954d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Option> f199955e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Option f199956f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f199957g;

    /* compiled from: SelectItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/SelectItem$Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f199958b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f199959c;

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
            this.f199958b = str;
            this.f199959c = str2;
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
            return L.f(this.f199958b, option.f199958b) && L.f(this.f199959c, option.f199959c);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.f199958b;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF282831b() {
            return this.f199959c;
        }

        public final int hashCode() {
            return this.f199959c.hashCode() + (this.f199958b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f199958b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f199959c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f199958b);
            parcel.writeString(this.f199959c);
        }
    }

    /* compiled from: SelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectItem(string, i12, numValueOf, arrayList, parcel.readInt() != 0 ? Option.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItem[] newArray(int i12) {
            return new SelectItem[i12];
        }
    }

    public SelectItem(@k String str, @e0 int i12, @l @e0 Integer num, @k List<Option> list, @l Option option, boolean z12) {
        this.f199952b = str;
        this.f199953c = i12;
        this.f199954d = num;
        this.f199955e = list;
        this.f199956f = option;
        this.f199957g = z12;
    }

    public static SelectItem a(SelectItem selectItem, Option option, int i12) {
        String str = selectItem.f199952b;
        int i13 = selectItem.f199953c;
        Integer num = selectItem.f199954d;
        List<Option> list = selectItem.f199955e;
        if ((i12 & 16) != 0) {
            option = selectItem.f199956f;
        }
        Option option2 = option;
        boolean z12 = (i12 & 32) != 0 ? selectItem.f199957g : false;
        selectItem.getClass();
        return new SelectItem(str, i13, num, list, option2, z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @k
    public final LandingItem N() {
        return a(this, null, 31);
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
        return L.f(this.f199952b, selectItem.f199952b) && this.f199953c == selectItem.f199953c && L.f(this.f199954d, selectItem.f199954d) && L.f(this.f199955e, selectItem.f199955e) && L.f(this.f199956f, selectItem.f199956f) && this.f199957g == selectItem.f199957g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF184648b() {
        return this.f199952b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f199953c, this.f199952b.hashCode() * 31, 31);
        Integer num = this.f199954d;
        int iE3 = H.e((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f199955e);
        Option option = this.f199956f;
        return Boolean.hashCode(this.f199957g) + ((iE3 + (option != null ? option.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.mortgage.landing.list.items.ValueItem
    @l
    public final String s1() {
        Option option = this.f199956f;
        if (option != null) {
            return option.f199958b;
        }
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f199952b);
        sb2.append(", title=");
        sb2.append(this.f199953c);
        sb2.append(", placeholder=");
        sb2.append(this.f199954d);
        sb2.append(", options=");
        sb2.append(this.f199955e);
        sb2.append(", selectedOption=");
        sb2.append(this.f199956f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199957g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199952b);
        parcel.writeInt(this.f199953c);
        Integer num = this.f199954d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Iterator itJ = C0.j(this.f199955e, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        Option option = this.f199956f;
        if (option == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            option.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f199957g ? 1 : 0);
    }

    public /* synthetic */ SelectItem(String str, int i12, Integer num, List list, Option option, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, num, list, option, (i13 & 32) != 0 ? true : z12);
    }
}
