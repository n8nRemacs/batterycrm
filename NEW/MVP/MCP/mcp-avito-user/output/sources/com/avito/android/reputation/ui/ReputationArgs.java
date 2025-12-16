package com.avito.android.reputation.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/ReputationArgs;", "Landroid/os/Parcelable;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReputationArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<ReputationArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254764b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f254765c;

    /* compiled from: ReputationArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReputationArgs> {
        @Override // android.os.Parcelable.Creator
        public final ReputationArgs createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new ReputationArgs(linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final ReputationArgs[] newArray(int i12) {
            return new ReputationArgs[i12];
        }
    }

    public ReputationArgs(@k LinkedHashMap linkedHashMap, @k String str) {
        this.f254764b = str;
        this.f254765c = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReputationArgs)) {
            return false;
        }
        ReputationArgs reputationArgs = (ReputationArgs) obj;
        return L.f(this.f254764b, reputationArgs.f254764b) && this.f254765c.equals(reputationArgs.f254765c);
    }

    public final int hashCode() {
        return this.f254765c.hashCode() + (this.f254764b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReputationArgs(screenName=");
        sb2.append(this.f254764b);
        sb2.append(", params=");
        return org.webrtc.h.e(sb2, this.f254765c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254764b);
        LinkedHashMap linkedHashMap = this.f254765c;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
