package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: LogAdjustEventLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/LogAdjustEventLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class LogAdjustEventLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<LogAdjustEventLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133425b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f133426c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133427d;

    /* compiled from: LogAdjustEventLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LogAdjustEventLink> {
        @Override // android.os.Parcelable.Creator
        public final LogAdjustEventLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new LogAdjustEventLink(string, linkedHashMap, (DeepLink) parcel.readParcelable(LogAdjustEventLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LogAdjustEventLink[] newArray(int i12) {
            return new LogAdjustEventLink[i12];
        }
    }

    public LogAdjustEventLink(@Y61.k String str, @Y61.k Map<String, String> map, @Y61.l DeepLink deepLink) {
        this.f133425b = str;
        this.f133426c = map;
        this.f133427d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133425b);
        Iterator itI = C0.i(parcel, this.f133426c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.f133427d, i12);
    }
}
