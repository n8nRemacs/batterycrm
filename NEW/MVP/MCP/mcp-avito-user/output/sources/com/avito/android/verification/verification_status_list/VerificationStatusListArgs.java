package com.avito.android.verification.verification_status_list;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusListArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_status_list/VerificationStatusListArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationStatusListArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerificationStatusListArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f325744b;

    /* compiled from: VerificationStatusListArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationStatusListArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationStatusListArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationStatusListArgs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationStatusListArgs[] newArray(int i12) {
            return new VerificationStatusListArgs[i12];
        }
    }

    public VerificationStatusListArgs(@Y61.k Map<String, String> map) {
        this.f325744b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationStatusListArgs) && L.f(this.f325744b, ((VerificationStatusListArgs) obj).f325744b);
    }

    public final int hashCode() {
        return this.f325744b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return r.w(new StringBuilder("VerificationStatusListArgs(queryMap="), this.f325744b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f325744b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
