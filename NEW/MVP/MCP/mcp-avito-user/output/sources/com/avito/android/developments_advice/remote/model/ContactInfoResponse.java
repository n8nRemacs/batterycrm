package com.avito.android.developments_advice.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactInfoResponse.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "Landroid/os/Parcelable;", "", "name", "", "Lcom/avito/android/developments_advice/remote/model/Phone;", "phones", "Lcom/avito/android/developments_advice/remote/model/CallInterval;", "callIntervals", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactInfoResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactInfoResponse> CREATOR = new a();

    @c("callIntervals")
    @l
    private final List<CallInterval> callIntervals;

    @c("name")
    @k
    private final String name;

    @c("phones")
    @l
    private final List<Phone> phones;

    /* compiled from: ContactInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactInfoResponse> {
        @Override // android.os.Parcelable.Creator
        public final ContactInfoResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(Phone.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(CallInterval.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new ContactInfoResponse(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ContactInfoResponse[] newArray(int i12) {
            return new ContactInfoResponse[i12];
        }
    }

    public ContactInfoResponse(@k String str, @l List<Phone> list, @l List<CallInterval> list2) {
        this.name = str;
        this.phones = list;
        this.callIntervals = list2;
    }

    @l
    public final List<CallInterval> c() {
        return this.callIntervals;
    }

    @l
    public final List<Phone> d() {
        return this.phones;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInfoResponse)) {
            return false;
        }
        ContactInfoResponse contactInfoResponse = (ContactInfoResponse) obj;
        return L.f(this.name, contactInfoResponse.name) && L.f(this.phones, contactInfoResponse.phones) && L.f(this.callIntervals, contactInfoResponse.callIntervals);
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        List<Phone> list = this.phones;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CallInterval> list2 = this.callIntervals;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactInfoResponse(name=");
        sb2.append(this.name);
        sb2.append(", phones=");
        sb2.append(this.phones);
        sb2.append(", callIntervals=");
        return H.p(sb2, this.callIntervals, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        List<Phone> list = this.phones;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Phone) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<CallInterval> list2 = this.callIntervals;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((CallInterval) itA2.next()).writeToParcel(parcel, i12);
        }
    }
}
