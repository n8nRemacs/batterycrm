package com.avito.android.mortgage.steps_details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StepsDetailsArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/steps_details/model/StepsDetailsArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StepsDetailsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<StepsDetailsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f203825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f203826d;

    /* compiled from: StepsDetailsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepsDetailsArguments> {
        @Override // android.os.Parcelable.Creator
        public final StepsDetailsArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StepDetailsModel.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StepsDetailsArguments(parcel.readInt(), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StepsDetailsArguments[] newArray(int i12) {
            return new StepsDetailsArguments[i12];
        }
    }

    public StepsDetailsArguments(int i12, @k String str, @k ArrayList arrayList) {
        this.f203824b = str;
        this.f203825c = arrayList;
        this.f203826d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepsDetailsArguments)) {
            return false;
        }
        StepsDetailsArguments stepsDetailsArguments = (StepsDetailsArguments) obj;
        return L.f(this.f203824b, stepsDetailsArguments.f203824b) && this.f203825c.equals(stepsDetailsArguments.f203825c) && this.f203826d == stepsDetailsArguments.f203826d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203826d) + e.g(this.f203825c, this.f203824b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepsDetailsArguments(title=");
        sb2.append(this.f203824b);
        sb2.append(", steps=");
        sb2.append(this.f203825c);
        sb2.append(", currentStepIdx=");
        return r.t(sb2, this.f203826d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203824b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f203825c, parcel);
        while (itZ.hasNext()) {
            ((StepDetailsModel) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f203826d);
    }
}
