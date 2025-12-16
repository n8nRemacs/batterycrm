package com.avito.android.registration_self_employment_redirect_screen.steps_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelfEmploymentStepItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/steps_list/SelfEmploymentStepItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelfEmploymentStepItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<SelfEmploymentStepItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f252771c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f252772d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f252773e;

    /* compiled from: SelfEmploymentStepItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelfEmploymentStepItem> {
        @Override // android.os.Parcelable.Creator
        public final SelfEmploymentStepItem createFromParcel(Parcel parcel) {
            return new SelfEmploymentStepItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelfEmploymentStepItem[] newArray(int i12) {
            return new SelfEmploymentStepItem[i12];
        }
    }

    public SelfEmploymentStepItem(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f252770b = str;
        this.f252771c = str2;
        this.f252772d = str3;
        this.f252773e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfEmploymentStepItem)) {
            return false;
        }
        SelfEmploymentStepItem selfEmploymentStepItem = (SelfEmploymentStepItem) obj;
        return L.f(this.f252770b, selfEmploymentStepItem.f252770b) && L.f(this.f252771c, selfEmploymentStepItem.f252771c) && L.f(this.f252772d, selfEmploymentStepItem.f252772d) && L.f(this.f252773e, selfEmploymentStepItem.f252773e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF223480b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f252773e;
    }

    public final int hashCode() {
        return this.f252773e.hashCode() + H.d(H.d(this.f252770b.hashCode() * 31, 31, this.f252771c), 31, this.f252772d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfEmploymentStepItem(title=");
        sb2.append(this.f252770b);
        sb2.append(", description=");
        sb2.append(this.f252771c);
        sb2.append(", number=");
        sb2.append(this.f252772d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f252773e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f252770b);
        parcel.writeString(this.f252771c);
        parcel.writeString(this.f252772d);
        parcel.writeString(this.f252773e);
    }

    public /* synthetic */ SelfEmploymentStepItem(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? str : str4);
    }
}
