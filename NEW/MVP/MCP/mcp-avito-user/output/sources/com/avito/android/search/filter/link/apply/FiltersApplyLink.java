package com.avito.android.search.filter.link.apply;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: FiltersApplyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/link/apply/FiltersApplyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "FilterValue", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class FiltersApplyLink extends DeepLink {

    @k
    public static final Parcelable.Creator<FiltersApplyLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<FilterValue> f263390b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f263391c;

    /* compiled from: FiltersApplyLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/search/filter/link/apply/FiltersApplyLink$FilterValue;", "Landroid/os/Parcelable;", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterValue implements Parcelable {

        @k
        public static final Parcelable.Creator<FilterValue> CREATOR = new a();

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("value")
        @l
        private final String value;

        /* compiled from: FiltersApplyLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FilterValue> {
            @Override // android.os.Parcelable.Creator
            public final FilterValue createFromParcel(Parcel parcel) {
                return new FilterValue(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FilterValue[] newArray(int i12) {
                return new FilterValue[i12];
            }
        }

        public FilterValue(@k String str, @l String str2) {
            this.id = str;
            this.value = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterValue)) {
                return false;
            }
            FilterValue filterValue = (FilterValue) obj;
            return L.f(this.id, filterValue.id) && L.f(this.value, filterValue.value);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.value;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FilterValue(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: FiltersApplyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersApplyLink> {
        @Override // android.os.Parcelable.Creator
        public final FiltersApplyLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(FilterValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FiltersApplyLink(arrayList, (DeepLink) parcel.readParcelable(FiltersApplyLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersApplyLink[] newArray(int i12) {
            return new FiltersApplyLink[i12];
        }
    }

    public FiltersApplyLink(@k List<FilterValue> list, @l DeepLink deepLink) {
        this.f263390b = list;
        this.f263391c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersApplyLink)) {
            return false;
        }
        FiltersApplyLink filtersApplyLink = (FiltersApplyLink) obj;
        return L.f(this.f263390b, filtersApplyLink.f263390b) && L.f(this.f263391c, filtersApplyLink.f263391c);
    }

    public final int hashCode() {
        int iHashCode = this.f263390b.hashCode() * 31;
        DeepLink deepLink = this.f263391c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersApplyLink(values=");
        sb2.append(this.f263390b);
        sb2.append(", afterFiltersLoadedAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f263391c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f263390b, parcel);
        while (itJ.hasNext()) {
            ((FilterValue) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f263391c, i12);
    }
}
