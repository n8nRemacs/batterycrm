package com.avito.android.advertising;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CommercialBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/LoadedNetworkBanner;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoadedNetworkBanner implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LoadedNetworkBanner> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86900c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86901d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Map<String, Boolean> f86902e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final b f86903f;

    /* compiled from: CommercialBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoadedNetworkBanner> {
        @Override // android.os.Parcelable.Creator
        public final LoadedNetworkBanner createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            long j12 = parcel.readLong();
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new LoadedNetworkBanner(string, i12, j12, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LoadedNetworkBanner[] newArray(int i12) {
            return new LoadedNetworkBanner[i12];
        }
    }

    public LoadedNetworkBanner(@Y61.k String str, int i12, long j12, @Y61.k Map<String, Boolean> map) {
        this.f86899b = str;
        this.f86900c = i12;
        this.f86901d = j12;
        this.f86902e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86899b);
        parcel.writeInt(this.f86900c);
        parcel.writeLong(this.f86901d);
        Iterator itI = C0.i(parcel, this.f86902e);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ LoadedNetworkBanner(String str, int i12, long j12, Map map, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? 0L : j12, (Map<String, Boolean>) ((i13 & 8) != 0 ? new LinkedHashMap() : map));
    }

    public /* synthetic */ LoadedNetworkBanner(String str, b bVar, int i12, long j12, int i13, C42822w c42822w) {
        this(str, bVar, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? 0L : j12);
    }

    public LoadedNetworkBanner(@Y61.k String str, @Y61.l b bVar, int i12, long j12) {
        this(str, i12, j12, (Map) null, 8, (C42822w) null);
        this.f86903f = bVar;
    }
}
