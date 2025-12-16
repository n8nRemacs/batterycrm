package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReturnToWorkArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/model/ReturnToWorkArguments;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnToWorkArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ReturnToWorkArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137202b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137203c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f137204d;

    /* compiled from: ReturnToWorkArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReturnToWorkArguments> {
        @Override // android.os.Parcelable.Creator
        public final ReturnToWorkArguments createFromParcel(Parcel parcel) {
            return new ReturnToWorkArguments(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ReturnToWorkArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReturnToWorkArguments[] newArray(int i12) {
            return new ReturnToWorkArguments[i12];
        }
    }

    public ReturnToWorkArguments(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f137202b = str;
        this.f137203c = str2;
        this.f137204d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnToWorkArguments)) {
            return false;
        }
        ReturnToWorkArguments returnToWorkArguments = (ReturnToWorkArguments) obj;
        return L.f(this.f137202b, returnToWorkArguments.f137202b) && L.f(this.f137203c, returnToWorkArguments.f137203c) && L.f(this.f137204d, returnToWorkArguments.f137204d);
    }

    public final int hashCode() {
        return this.f137204d.hashCode() + H.d(this.f137202b.hashCode() * 31, 31, this.f137203c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReturnToWorkArguments(requestKey=");
        sb2.append(this.f137202b);
        sb2.append(", applicationId=");
        sb2.append(this.f137203c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f137204d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f137202b);
        parcel.writeString(this.f137203c);
        parcel.writeParcelable(this.f137204d, i12);
    }
}
