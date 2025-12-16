package com.avito.android.mortgage.root.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SignChangeAction.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/model/SignChangeAction;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SignChangeAction implements Parcelable {

    @k
    public static final Parcelable.Creator<SignChangeAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202934b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f202935c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f202936d;

    /* compiled from: SignChangeAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SignChangeAction> {
        @Override // android.os.Parcelable.Creator
        public final SignChangeAction createFromParcel(Parcel parcel) {
            return new SignChangeAction(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SignChangeAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SignChangeAction[] newArray(int i12) {
            return new SignChangeAction[i12];
        }
    }

    public SignChangeAction(@k String str, @l String str2, @k DeepLink deepLink) {
        this.f202934b = str;
        this.f202935c = str2;
        this.f202936d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignChangeAction)) {
            return false;
        }
        SignChangeAction signChangeAction = (SignChangeAction) obj;
        return L.f(this.f202934b, signChangeAction.f202934b) && L.f(this.f202935c, signChangeAction.f202935c) && L.f(this.f202936d, signChangeAction.f202936d);
    }

    public final int hashCode() {
        int iHashCode = this.f202934b.hashCode() * 31;
        String str = this.f202935c;
        return this.f202936d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignChangeAction(applicantId=");
        sb2.append(this.f202934b);
        sb2.append(", applicantType=");
        sb2.append(this.f202935c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f202936d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f202934b);
        parcel.writeString(this.f202935c);
        parcel.writeParcelable(this.f202936d, i12);
    }
}
