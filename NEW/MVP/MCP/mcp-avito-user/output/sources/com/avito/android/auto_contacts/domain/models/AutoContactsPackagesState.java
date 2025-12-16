package com.avito.android.auto_contacts.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackagesState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/domain/models/AutoContactsPackagesState;", "Landroid/os/Parcelable;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoContactsPackagesState implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoContactsPackagesState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f94880b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f94881c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AutoContactsPackage> f94882d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AutoButton f94883e;

    /* compiled from: AutoContactsPackagesState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoContactsPackagesState> {
        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackagesState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoContactsPackage.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoContactsPackagesState(string, string2, arrayList, parcel.readInt() == 0 ? null : AutoButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackagesState[] newArray(int i12) {
            return new AutoContactsPackagesState[i12];
        }
    }

    public AutoContactsPackagesState(@k String str, @l String str2, @k List<AutoContactsPackage> list, @l AutoButton autoButton) {
        this.f94880b = str;
        this.f94881c = str2;
        this.f94882d = list;
        this.f94883e = autoButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoContactsPackagesState)) {
            return false;
        }
        AutoContactsPackagesState autoContactsPackagesState = (AutoContactsPackagesState) obj;
        return L.f(this.f94880b, autoContactsPackagesState.f94880b) && L.f(this.f94881c, autoContactsPackagesState.f94881c) && L.f(this.f94882d, autoContactsPackagesState.f94882d) && L.f(this.f94883e, autoContactsPackagesState.f94883e);
    }

    public final int hashCode() {
        int iHashCode = this.f94880b.hashCode() * 31;
        String str = this.f94881c;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94882d);
        AutoButton autoButton = this.f94883e;
        return iE2 + (autoButton != null ? autoButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AutoContactsPackagesState(title=" + this.f94880b + ", description=" + this.f94881c + ", packages=" + this.f94882d + ", button=" + this.f94883e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f94880b);
        parcel.writeString(this.f94881c);
        Iterator itJ = C0.j(this.f94882d, parcel);
        while (itJ.hasNext()) {
            ((AutoContactsPackage) itJ.next()).writeToParcel(parcel, i12);
        }
        AutoButton autoButton = this.f94883e;
        if (autoButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoButton.writeToParcel(parcel, i12);
        }
    }
}
