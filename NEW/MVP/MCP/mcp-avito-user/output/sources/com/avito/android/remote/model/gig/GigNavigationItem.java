package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/gig/GigNavigationItem;", "Landroid/os/Parcelable;", "", "date", "", "Lcom/avito/android/remote/model/gig/GigShift;", "shifts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/gig/GigNavigationItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "Ljava/util/List;", "getShifts", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigNavigationItem implements Parcelable {

    @k
    public static final Parcelable.Creator<GigNavigationItem> CREATOR = new Creator();

    @c("date")
    @k
    private final String date;

    @c("shifts")
    @k
    private final List<GigShift> shifts;

    /* compiled from: GigShifts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigNavigationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigNavigationItem createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(GigShift.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigNavigationItem(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigNavigationItem[] newArray(int i12) {
            return new GigNavigationItem[i12];
        }
    }

    public GigNavigationItem(@k String str, @k List<GigShift> list) {
        this.date = str;
        this.shifts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GigNavigationItem copy$default(GigNavigationItem gigNavigationItem, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gigNavigationItem.date;
        }
        if ((i12 & 2) != 0) {
            list = gigNavigationItem.shifts;
        }
        return gigNavigationItem.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @k
    public final List<GigShift> component2() {
        return this.shifts;
    }

    @k
    public final GigNavigationItem copy(@k String date, @k List<GigShift> shifts) {
        return new GigNavigationItem(date, shifts);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigNavigationItem)) {
            return false;
        }
        GigNavigationItem gigNavigationItem = (GigNavigationItem) other;
        return L.f(this.date, gigNavigationItem.date) && L.f(this.shifts, gigNavigationItem.shifts);
    }

    @k
    public final String getDate() {
        return this.date;
    }

    @k
    public final List<GigShift> getShifts() {
        return this.shifts;
    }

    public int hashCode() {
        return this.shifts.hashCode() + (this.date.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GigNavigationItem(date=");
        sb2.append(this.date);
        sb2.append(", shifts=");
        return H.p(sb2, this.shifts, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.date);
        Iterator itJ = C0.j(this.shifts, parcel);
        while (itJ.hasNext()) {
            ((GigShift) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
