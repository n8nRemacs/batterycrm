package com.avito.android.loyalty.ui.quality_service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceArgs.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/QualityServiceArgs;", "Landroid/os/Parcelable;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QualityServiceArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<QualityServiceArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f183788b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f183789c;

    /* compiled from: QualityServiceArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<QualityServiceArgs> {
        @Override // android.os.Parcelable.Creator
        public final QualityServiceArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new QualityServiceArgs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final QualityServiceArgs[] newArray(int i12) {
            return new QualityServiceArgs[i12];
        }
    }

    public QualityServiceArgs(@Y61.k Map<String, String> map) {
        this.f183788b = map;
        String str = map.get(SearchParamsConverterKt.SOURCE);
        this.f183789c = str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QualityServiceArgs) && L.f(this.f183788b, ((QualityServiceArgs) obj).f183788b);
    }

    public final int hashCode() {
        return this.f183788b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("QualityServiceArgs(queryMap="), this.f183788b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f183788b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
