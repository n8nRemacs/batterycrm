package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AnalyticParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/AnalyticParams;", "Landroid/os/Parcelable;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AnalyticParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AnalyticParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f67181b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f67182c;

    /* compiled from: AnalyticParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnalyticParams> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = com.akita.compose.theme.re23.style.C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AnalyticParams(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticParams[] newArray(int i12) {
            return new AnalyticParams[i12];
        }
    }

    public AnalyticParams(@Y61.l Map<String, String> map, @Y61.l String str) {
        this.f67181b = map;
        this.f67182c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticParams)) {
            return false;
        }
        AnalyticParams analyticParams = (AnalyticParams) obj;
        return kotlin.jvm.internal.L.f(this.f67181b, analyticParams.f67181b) && kotlin.jvm.internal.L.f(this.f67182c, analyticParams.f67182c);
    }

    public final int hashCode() {
        Map<String, String> map = this.f67181b;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f67182c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticParams(analytics=");
        sb2.append(this.f67181b);
        sb2.append(", buttonName=");
        return C22026a.c(sb2, this.f67182c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Map<String, String> map = this.f67181b;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = com.akita.compose.theme.re23.style.C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f67182c);
    }
}
