package com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.StrBookingCalculationIcon;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CostInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/viewstate/entity/CostInfo;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CostInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CostInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f282823b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f282824c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f282825d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f282826e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f282827f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f282828g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final StrBookingCalculationIcon f282829h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f282830i;

    /* compiled from: CostInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CostInfo> {
        @Override // android.os.Parcelable.Creator
        public final CostInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CostInfo.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(CostInfo.class.getClassLoader());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CollapsedCostInfo.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new CostInfo(string, attributedText, attributedText2, z12, z13, arrayList, (StrBookingCalculationIcon) parcel.readParcelable(CostInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CostInfo[] newArray(int i12) {
            return new CostInfo[i12];
        }
    }

    public CostInfo(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, boolean z12, boolean z13, @l ArrayList arrayList, @l StrBookingCalculationIcon strBookingCalculationIcon, @l String str2) {
        this.f282823b = str;
        this.f282824c = attributedText;
        this.f282825d = attributedText2;
        this.f282826e = z12;
        this.f282827f = z13;
        this.f282828g = arrayList;
        this.f282829h = strBookingCalculationIcon;
        this.f282830i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostInfo)) {
            return false;
        }
        CostInfo costInfo = (CostInfo) obj;
        return L.f(this.f282823b, costInfo.f282823b) && L.f(this.f282824c, costInfo.f282824c) && L.f(this.f282825d, costInfo.f282825d) && this.f282826e == costInfo.f282826e && this.f282827f == costInfo.f282827f && L.f(this.f282828g, costInfo.f282828g) && L.f(this.f282829h, costInfo.f282829h) && L.f(this.f282830i, costInfo.f282830i);
    }

    public final int hashCode() {
        String str = this.f282823b;
        int i12 = r.i(r.i(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f282824c), 31, this.f282825d), 31, this.f282826e), 31, this.f282827f);
        ArrayList arrayList = this.f282828g;
        int iHashCode = (i12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        StrBookingCalculationIcon strBookingCalculationIcon = this.f282829h;
        int iHashCode2 = (iHashCode + (strBookingCalculationIcon == null ? 0 : strBookingCalculationIcon.hashCode())) * 31;
        String str2 = this.f282830i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CostInfo(id=");
        sb2.append(this.f282823b);
        sb2.append(", title=");
        sb2.append(this.f282824c);
        sb2.append(", cost=");
        sb2.append(this.f282825d);
        sb2.append(", isCollapsable=");
        sb2.append(this.f282826e);
        sb2.append(", isCollapsed=");
        sb2.append(this.f282827f);
        sb2.append(", collapsedCostInfo=");
        sb2.append(this.f282828g);
        sb2.append(", icon=");
        sb2.append(this.f282829h);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f282830i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282823b);
        parcel.writeParcelable(this.f282824c, i12);
        parcel.writeParcelable(this.f282825d, i12);
        parcel.writeInt(this.f282826e ? 1 : 0);
        parcel.writeInt(this.f282827f ? 1 : 0);
        ArrayList arrayList = this.f282828g;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((CollapsedCostInfo) itY.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.f282829h, i12);
        parcel.writeString(this.f282830i);
    }
}
