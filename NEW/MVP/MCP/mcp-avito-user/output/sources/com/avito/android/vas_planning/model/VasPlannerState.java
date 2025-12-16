package com.avito.android.vas_planning.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlannerState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlannerState;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPlannerState implements Parcelable {

    @k
    public static final Parcelable.Creator<VasPlannerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f322418b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final VasAdvantage f322419c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final VasButton f322420d;

    /* compiled from: VasPlannerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlannerState> {
        @Override // android.os.Parcelable.Creator
        public final VasPlannerState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(VasPlannerState.class, parcel, arrayList, iL2, 1);
            }
            return new VasPlannerState(arrayList, parcel.readInt() == 0 ? null : VasAdvantage.CREATOR.createFromParcel(parcel), VasButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlannerState[] newArray(int i12) {
            return new VasPlannerState[i12];
        }
    }

    public VasPlannerState(@k ArrayList arrayList, @l VasAdvantage vasAdvantage, @k VasButton vasButton) {
        this.f322418b = arrayList;
        this.f322419c = vasAdvantage;
        this.f322420d = vasButton;
    }

    public static VasPlannerState a(VasPlannerState vasPlannerState, ArrayList arrayList, VasButton vasButton, int i12) {
        VasAdvantage vasAdvantage = vasPlannerState.f322419c;
        if ((i12 & 4) != 0) {
            vasButton = vasPlannerState.f322420d;
        }
        vasPlannerState.getClass();
        return new VasPlannerState(arrayList, vasAdvantage, vasButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPlannerState)) {
            return false;
        }
        VasPlannerState vasPlannerState = (VasPlannerState) obj;
        return this.f322418b.equals(vasPlannerState.f322418b) && L.f(this.f322419c, vasPlannerState.f322419c) && L.f(this.f322420d, vasPlannerState.f322420d);
    }

    public final int hashCode() {
        int iHashCode = this.f322418b.hashCode() * 31;
        VasAdvantage vasAdvantage = this.f322419c;
        return this.f322420d.hashCode() + ((iHashCode + (vasAdvantage == null ? 0 : vasAdvantage.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "VasPlannerState(items=" + this.f322418b + ", advantage=" + this.f322419c + ", button=" + this.f322420d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f322418b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        VasAdvantage vasAdvantage = this.f322419c;
        if (vasAdvantage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vasAdvantage.writeToParcel(parcel, i12);
        }
        this.f322420d.writeToParcel(parcel, i12);
    }
}
