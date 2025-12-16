package com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.StrBookingCalculationIcon;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CostInfo.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/mvi/state/viewstate/entity/CollapsedCostInfo;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CollapsedCostInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CollapsedCostInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f282819b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f282820c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final StrBookingCalculationIcon f282821d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f282822e;

    /* compiled from: CostInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CollapsedCostInfo> {
        @Override // android.os.Parcelable.Creator
        public final CollapsedCostInfo createFromParcel(Parcel parcel) {
            return new CollapsedCostInfo((AttributedText) parcel.readParcelable(CollapsedCostInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(CollapsedCostInfo.class.getClassLoader()), parcel.readString(), (StrBookingCalculationIcon) parcel.readParcelable(CollapsedCostInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CollapsedCostInfo[] newArray(int i12) {
            return new CollapsedCostInfo[i12];
        }
    }

    public CollapsedCostInfo(@k AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l StrBookingCalculationIcon strBookingCalculationIcon) {
        this.f282819b = attributedText;
        this.f282820c = attributedText2;
        this.f282821d = strBookingCalculationIcon;
        this.f282822e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollapsedCostInfo)) {
            return false;
        }
        CollapsedCostInfo collapsedCostInfo = (CollapsedCostInfo) obj;
        return L.f(this.f282819b, collapsedCostInfo.f282819b) && L.f(this.f282820c, collapsedCostInfo.f282820c) && L.f(this.f282821d, collapsedCostInfo.f282821d) && L.f(this.f282822e, collapsedCostInfo.f282822e);
    }

    public final int hashCode() {
        int iHashCode = this.f282819b.hashCode() * 31;
        AttributedText attributedText = this.f282820c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        StrBookingCalculationIcon strBookingCalculationIcon = this.f282821d;
        int iHashCode3 = (iHashCode2 + (strBookingCalculationIcon == null ? 0 : strBookingCalculationIcon.hashCode())) * 31;
        String str = this.f282822e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollapsedCostInfo(title=");
        sb2.append(this.f282819b);
        sb2.append(", cost=");
        sb2.append(this.f282820c);
        sb2.append(", icon=");
        sb2.append(this.f282821d);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f282822e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f282819b, i12);
        parcel.writeParcelable(this.f282820c, i12);
        parcel.writeParcelable(this.f282821d, i12);
        parcel.writeString(this.f282822e);
    }
}
