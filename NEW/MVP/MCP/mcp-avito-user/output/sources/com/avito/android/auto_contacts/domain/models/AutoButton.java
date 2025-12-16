package com.avito.android.auto_contacts.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoButton.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/domain/models/AutoButton;", "Landroid/os/Parcelable;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f94875b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f94876c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f94877d;

    /* compiled from: AutoButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoButton> {
        @Override // android.os.Parcelable.Creator
        public final AutoButton createFromParcel(Parcel parcel) {
            return new AutoButton(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AutoButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoButton[] newArray(int i12) {
            return new AutoButton[i12];
        }
    }

    public AutoButton(@k String str, @l String str2, @k DeepLink deepLink) {
        this.f94875b = str;
        this.f94876c = str2;
        this.f94877d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoButton)) {
            return false;
        }
        AutoButton autoButton = (AutoButton) obj;
        return L.f(this.f94875b, autoButton.f94875b) && L.f(this.f94876c, autoButton.f94876c) && L.f(this.f94877d, autoButton.f94877d);
    }

    public final int hashCode() {
        int iHashCode = this.f94875b.hashCode() * 31;
        String str = this.f94876c;
        return this.f94877d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoButton(title=");
        sb2.append(this.f94875b);
        sb2.append(", style=");
        sb2.append(this.f94876c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f94877d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f94875b);
        parcel.writeString(this.f94876c);
        parcel.writeParcelable(this.f94877d, i12);
    }
}
