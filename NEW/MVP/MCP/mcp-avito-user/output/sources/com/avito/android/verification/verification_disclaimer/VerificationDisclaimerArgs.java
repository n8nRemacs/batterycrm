package com.avito.android.verification.verification_disclaimer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationDisclaimerArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/VerificationDisclaimerArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationDisclaimerArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerificationDisclaimerArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f325018b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f325019c;

    /* compiled from: VerificationDisclaimerArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationDisclaimerArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationDisclaimerArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationDisclaimerArgs(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationDisclaimerArgs[] newArray(int i12) {
            return new VerificationDisclaimerArgs[i12];
        }
    }

    public VerificationDisclaimerArgs(@Y61.k Map<String, String> map, @Y61.l String str) {
        this.f325018b = map;
        this.f325019c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationDisclaimerArgs)) {
            return false;
        }
        VerificationDisclaimerArgs verificationDisclaimerArgs = (VerificationDisclaimerArgs) obj;
        return L.f(this.f325018b, verificationDisclaimerArgs.f325018b) && L.f(this.f325019c, verificationDisclaimerArgs.f325019c);
    }

    public final int hashCode() {
        int iHashCode = this.f325018b.hashCode() * 31;
        String str = this.f325019c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationDisclaimerArgs(queryMap=");
        sb2.append(this.f325018b);
        sb2.append(", toast=");
        return C22026a.c(sb2, this.f325019c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f325018b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f325019c);
    }

    public /* synthetic */ VerificationDisclaimerArgs(Map map, String str, int i12, C42822w c42822w) {
        this(map, (i12 & 2) != 0 ? null : str);
    }
}
