package com.avito.android.verification.verification_confirm_requisites;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationConfirmRequisitesArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/VerificationConfirmRequisitesArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationConfirmRequisitesArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerificationConfirmRequisitesArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f324890b;

    /* compiled from: VerificationConfirmRequisitesArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationConfirmRequisitesArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationConfirmRequisitesArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationConfirmRequisitesArgs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationConfirmRequisitesArgs[] newArray(int i12) {
            return new VerificationConfirmRequisitesArgs[i12];
        }
    }

    public VerificationConfirmRequisitesArgs(@Y61.k Map<String, String> map) {
        this.f324890b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationConfirmRequisitesArgs) && L.f(this.f324890b, ((VerificationConfirmRequisitesArgs) obj).f324890b);
    }

    public final int hashCode() {
        return this.f324890b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("VerificationConfirmRequisitesArgs(queryMap="), this.f324890b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f324890b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
