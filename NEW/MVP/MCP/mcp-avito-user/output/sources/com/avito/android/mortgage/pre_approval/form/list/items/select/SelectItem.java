package com.avito.android.mortgage.pre_approval.form.list.items.select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/SelectItem;", "LT00/a;", "Option", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectItem implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f201820b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f201821c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f201822d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Option f201823e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PrintableText f201824f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PrintableText f201825g;

    /* compiled from: SelectItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/select/SelectItem$Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Option implements ParcelableEntity<String> {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f201826b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f201827c;

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
            this.f201826b = str;
            this.f201827c = str2;
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
            return L.f(this.f201826b, option.f201826b) && L.f(this.f201827c, option.f201827c);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.f201826b;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getTitle() {
            return this.f201827c;
        }

        public final int hashCode() {
            return this.f201827c.hashCode() + (this.f201826b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f201826b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f201827c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f201826b);
            parcel.writeString(this.f201827c);
        }
    }

    public SelectItem(@k String str, @k PrintableText printableText, @k ArrayList arrayList, @l Option option, @l PrintableText printableText2, @l PrintableText printableText3) {
        this.f201820b = str;
        this.f201821c = printableText;
        this.f201822d = arrayList;
        this.f201823e = option;
        this.f201824f = printableText2;
        this.f201825g = printableText3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectItem)) {
            return false;
        }
        SelectItem selectItem = (SelectItem) obj;
        return this.f201820b.equals(selectItem.f201820b) && this.f201821c.equals(selectItem.f201821c) && this.f201822d.equals(selectItem.f201822d) && L.f(this.f201823e, selectItem.f201823e) && this.f201824f.equals(selectItem.f201824f) && L.f(this.f201825g, selectItem.f201825g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137846b() {
        return this.f201820b;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f201822d, com.avito.android.actions_sheet.a.f(this.f201821c, this.f201820b.hashCode() * 31, 31), 31);
        Option option = this.f201823e;
        int iF2 = com.avito.android.actions_sheet.a.f(this.f201824f, (iG2 + (option == null ? 0 : option.hashCode())) * 31, 31);
        PrintableText printableText = this.f201825g;
        return iF2 + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(stringId=");
        sb2.append(this.f201820b);
        sb2.append(", title=");
        sb2.append(this.f201821c);
        sb2.append(", options=");
        sb2.append(this.f201822d);
        sb2.append(", selectedOption=");
        sb2.append(this.f201823e);
        sb2.append(", placeholder=");
        sb2.append(this.f201824f);
        sb2.append(", error=");
        return AK.c.m(sb2, this.f201825g, ')');
    }
}
