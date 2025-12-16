package com.avito.android.loyalty.links.quality_service;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: QualityServiceLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/links/quality_service/QualityServiceLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class QualityServiceLink extends DeepLink {

    @k
    public static final Parcelable.Creator<QualityServiceLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f183236b;

    /* compiled from: QualityServiceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<QualityServiceLink> {
        @Override // android.os.Parcelable.Creator
        public final QualityServiceLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new QualityServiceLink(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final QualityServiceLink[] newArray(int i12) {
            return new QualityServiceLink[i12];
        }
    }

    public QualityServiceLink(@k Map<String, String> map) {
        this.f183236b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itO = f.o(this.f183236b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
