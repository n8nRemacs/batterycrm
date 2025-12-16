package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: StrOrdersBuyerDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/StrOrdersBuyerDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class StrOrdersBuyerDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<StrOrdersBuyerDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f133692c;

    /* compiled from: StrOrdersBuyerDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersBuyerDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersBuyerDeeplink createFromParcel(Parcel parcel) {
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new StrOrdersBuyerDeeplink(z12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersBuyerDeeplink[] newArray(int i12) {
            return new StrOrdersBuyerDeeplink[i12];
        }
    }

    public StrOrdersBuyerDeeplink(boolean z12, @Y61.k Map<String, String> map) {
        this.f133691b = z12;
        this.f133692c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133691b ? 1 : 0);
        Iterator itI = C0.i(parcel, this.f133692c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
