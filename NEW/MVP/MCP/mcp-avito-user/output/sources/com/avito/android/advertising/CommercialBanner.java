package com.avito.android.advertising;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialBanner.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/CommercialBanner;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommercialBanner implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CommercialBanner> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86885b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<AdNetworkBannerItem<?>> f86886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86887d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f86888e;

    /* renamed from: f, reason: collision with root package name */
    public final long f86889f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f86890g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f86891h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LoadedNetworkBanner f86892i;

    /* compiled from: CommercialBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommercialBanner> {
        @Override // android.os.Parcelable.Creator
        public final CommercialBanner createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CommercialBanner.class, parcel, arrayList, iL2, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = org.webrtc.h.c(CommercialBanner.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            return new CommercialBanner(string, arrayList, z12, linkedHashMap, parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? LoadedNetworkBanner.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommercialBanner[] newArray(int i12) {
            return new CommercialBanner[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommercialBanner(@Y61.k String str, @Y61.k List<? extends AdNetworkBannerItem<?>> list, boolean z12, @Y61.l Map<String, ? extends Object> map, long j12, @Y61.l Integer num, @Y61.l String str2, @Y61.l LoadedNetworkBanner loadedNetworkBanner) {
        this.f86885b = str;
        this.f86886c = list;
        this.f86887d = z12;
        this.f86888e = map;
        this.f86889f = j12;
        this.f86890g = num;
        this.f86891h = str2;
        this.f86892i = loadedNetworkBanner;
    }

    @Y61.l
    public final AdNetworkBannerItem<?> c() {
        Object obj;
        Iterator<T> it = this.f86886c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strValueOf = String.valueOf(((AdNetworkBannerItem) next).getBlockId());
            LoadedNetworkBanner loadedNetworkBanner = this.f86892i;
            if (strValueOf.equals(loadedNetworkBanner != null ? loadedNetworkBanner.f86899b : null)) {
                obj = next;
                break;
            }
        }
        return (AdNetworkBannerItem) obj;
    }

    public final boolean d() {
        LoadedNetworkBanner loadedNetworkBanner = this.f86892i;
        return (loadedNetworkBanner == null || loadedNetworkBanner.f86903f == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86885b);
        Iterator itJ = C0.j(this.f86886c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f86887d ? 1 : 0);
        Map<String, Object> map = this.f86888e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeLong(this.f86889f);
        Integer num = this.f86890g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f86891h);
        LoadedNetworkBanner loadedNetworkBanner = this.f86892i;
        if (loadedNetworkBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loadedNetworkBanner.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ CommercialBanner(String str, List list, boolean z12, Map map, long j12, Integer num, String str2, LoadedNetworkBanner loadedNetworkBanner, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : map, (i12 & 16) != 0 ? 0L : j12, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : str2, (i12 & 128) != 0 ? null : loadedNetworkBanner);
    }
}
