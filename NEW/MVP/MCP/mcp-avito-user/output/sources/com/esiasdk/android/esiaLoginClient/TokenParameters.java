package com.esiasdk.android.esiaLoginClient;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TokenParameters.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/TokenParameters;", "Landroid/os/Parcelable;", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<TokenParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f339699b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f339700c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f339701d;

    /* compiled from: TokenParameters.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TokenParameters> {
        @Override // android.os.Parcelable.Creator
        public final TokenParameters createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new TokenParameters(string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TokenParameters[] newArray(int i12) {
            return new TokenParameters[i12];
        }
    }

    public TokenParameters(@k String str, @k String str2, @k LinkedHashMap linkedHashMap) {
        this.f339699b = str;
        this.f339700c = str2;
        this.f339701d = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f339699b);
        parcel.writeString(this.f339700c);
        LinkedHashMap linkedHashMap = this.f339701d;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
