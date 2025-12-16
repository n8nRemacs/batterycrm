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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "Landroid/os/Parcelable;", "", "headerText", "Lcom/avito/android/comparison/remote/model/AddItem;", "addItem", "", "Lcom/avito/android/comparison/remote/model/ComparisonItem;", "items", "Lcom/avito/android/comparison/remote/model/SpecificationItem;", "specifications", "Lcom/avito/android/comparison/remote/model/JobRknDisclaimer;", "jobRknDisclaimer", "<init>", "(Ljava/lang/String;Lcom/avito/android/comparison/remote/model/AddItem;Ljava/util/List;Ljava/util/List;Lcom/avito/android/comparison/remote/model/JobRknDisclaimer;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/comparison/remote/model/AddItem;", "c", "()Lcom/avito/android/comparison/remote/model/AddItem;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "f", "Lcom/avito/android/comparison/remote/model/JobRknDisclaimer;", "e", "()Lcom/avito/android/comparison/remote/model/JobRknDisclaimer;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComparisonResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ComparisonResponse> CREATOR = new a();

    @c("addItem")
    @k
    private final AddItem addItem;

    @c("headerText")
    @k
    private final String headerText;

    @c("items")
    @k
    private final List<ComparisonItem> items;

    @c("jobRknDisclaimer")
    @l
    private final JobRknDisclaimer jobRknDisclaimer;

    @c("specifications")
    @k
    private final List<SpecificationItem> specifications;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonResponse> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonResponse createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AddItem addItemCreateFromParcel = AddItem.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(ComparisonItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SpecificationItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new ComparisonResponse(string, addItemCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : JobRknDisclaimer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonResponse[] newArray(int i12) {
            return new ComparisonResponse[i12];
        }
    }

    public ComparisonResponse(@k String str, @k AddItem addItem, @k List<ComparisonItem> list, @k List<SpecificationItem> list2, @l JobRknDisclaimer jobRknDisclaimer) {
        this.headerText = str;
        this.addItem = addItem;
        this.items = list;
        this.specifications = list2;
        this.jobRknDisclaimer = jobRknDisclaimer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ComparisonResponse a(ComparisonResponse comparisonResponse, ArrayList arrayList, ArrayList arrayList2, int i12) {
        String str = comparisonResponse.headerText;
        AddItem addItem = comparisonResponse.addItem;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = comparisonResponse.items;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i12 & 8) != 0) {
            list3 = comparisonResponse.specifications;
        }
        JobRknDisclaimer jobRknDisclaimer = comparisonResponse.jobRknDisclaimer;
        comparisonResponse.getClass();
        return new ComparisonResponse(str, addItem, list2, list3, jobRknDisclaimer);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AddItem getAddItem() {
        return this.addItem;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final JobRknDisclaimer getJobRknDisclaimer() {
        return this.jobRknDisclaimer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonResponse)) {
            return false;
        }
        ComparisonResponse comparisonResponse = (ComparisonResponse) obj;
        return L.f(this.headerText, comparisonResponse.headerText) && L.f(this.addItem, comparisonResponse.addItem) && L.f(this.items, comparisonResponse.items) && L.f(this.specifications, comparisonResponse.specifications) && L.f(this.jobRknDisclaimer, comparisonResponse.jobRknDisclaimer);
    }

    @k
    public final List<SpecificationItem> f() {
        return this.specifications;
    }

    @k
    public final List<ComparisonItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        int iE2 = H.e(H.e((this.addItem.hashCode() + (this.headerText.hashCode() * 31)) * 31, 31, this.items), 31, this.specifications);
        JobRknDisclaimer jobRknDisclaimer = this.jobRknDisclaimer;
        return iE2 + (jobRknDisclaimer == null ? 0 : jobRknDisclaimer.hashCode());
    }

    @k
    public final String toString() {
        return "ComparisonResponse(headerText=" + this.headerText + ", addItem=" + this.addItem + ", items=" + this.items + ", specifications=" + this.specifications + ", jobRknDisclaimer=" + this.jobRknDisclaimer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.headerText);
        this.addItem.writeToParcel(parcel, i12);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((ComparisonItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.specifications, parcel);
        while (itJ2.hasNext()) {
            ((SpecificationItem) itJ2.next()).writeToParcel(parcel, i12);
        }
        JobRknDisclaimer jobRknDisclaimer = this.jobRknDisclaimer;
        if (jobRknDisclaimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jobRknDisclaimer.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ ComparisonResponse(String str, AddItem addItem, List list, List list2, JobRknDisclaimer jobRknDisclaimer, int i12, C42822w c42822w) {
        this(str, addItem, list, list2, (i12 & 16) != 0 ? null : jobRknDisclaimer);
    }
}
