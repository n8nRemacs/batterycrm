package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/OnboardingInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OnboardingInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionInfo f107858b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f107859c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ConditionsInfo f107860d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f107861e;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingInfo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo createFromParcel(Parcel parcel) {
            ActionInfo actionInfoCreateFromParcel = ActionInfo.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AdvantageInfo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new OnboardingInfo(actionInfoCreateFromParcel, arrayList, ConditionsInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo[] newArray(int i12) {
            return new OnboardingInfo[i12];
        }
    }

    public OnboardingInfo(@k ActionInfo actionInfo, @k ArrayList arrayList, @k ConditionsInfo conditionsInfo, @k String str) {
        this.f107858b = actionInfo;
        this.f107859c = arrayList;
        this.f107860d = conditionsInfo;
        this.f107861e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingInfo)) {
            return false;
        }
        OnboardingInfo onboardingInfo = (OnboardingInfo) obj;
        return L.f(this.f107858b, onboardingInfo.f107858b) && this.f107859c.equals(onboardingInfo.f107859c) && L.f(this.f107860d, onboardingInfo.f107860d) && L.f(this.f107861e, onboardingInfo.f107861e);
    }

    public final int hashCode() {
        return this.f107861e.hashCode() + ((this.f107860d.hashCode() + e.g(this.f107859c, this.f107858b.f107849b.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingInfo(action=");
        sb2.append(this.f107858b);
        sb2.append(", advantages=");
        sb2.append(this.f107859c);
        sb2.append(", conditions=");
        sb2.append(this.f107860d);
        sb2.append(", header=");
        return C22026a.c(sb2, this.f107861e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f107858b.writeToParcel(parcel, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f107859c, parcel);
        while (itZ.hasNext()) {
            ((AdvantageInfo) itZ.next()).writeToParcel(parcel, i12);
        }
        this.f107860d.writeToParcel(parcel, i12);
        parcel.writeString(this.f107861e);
    }
}
