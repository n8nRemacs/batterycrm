package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/comparison/remote/model/SpecificationItem;", "Landroid/os/Parcelable;", "", "id", "title", "", "Lcom/avito/android/comparison/remote/model/OptionItem;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpecificationItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SpecificationItem> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("options")
    @k
    private final List<OptionItem> options;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpecificationItem> {
        @Override // android.os.Parcelable.Creator
        public final SpecificationItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(OptionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SpecificationItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecificationItem[] newArray(int i12) {
            return new SpecificationItem[i12];
        }
    }

    public SpecificationItem(@k String str, @k String str2, @k List<OptionItem> list) {
        this.id = str;
        this.title = str2;
        this.options = list;
    }

    public static SpecificationItem a(SpecificationItem specificationItem, ArrayList arrayList) {
        return new SpecificationItem(specificationItem.id, specificationItem.title, arrayList);
    }

    @k
    public final List<OptionItem> c() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecificationItem)) {
            return false;
        }
        SpecificationItem specificationItem = (SpecificationItem) obj;
        return L.f(this.id, specificationItem.id) && L.f(this.title, specificationItem.title) && L.f(this.options, specificationItem.options);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.options.hashCode() + H.d(this.id.hashCode() * 31, 31, this.title);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpecificationItem(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((OptionItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
