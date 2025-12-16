package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: CreditInfo.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B6\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001b\u0010\n\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010\n\u001a\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/CreditInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advertising/BuzzoolaNetworkBannerItem;", "creditInfoItem", "", "samplingEnabled", "", "", "", "LK51/e;", "analyticParams", "<init>", "(Lcom/avito/android/remote/model/advertising/BuzzoolaNetworkBannerItem;ZLjava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advertising/BuzzoolaNetworkBannerItem;", "getCreditInfoItem", "()Lcom/avito/android/remote/model/advertising/BuzzoolaNetworkBannerItem;", "Z", "getSamplingEnabled", "()Z", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CreditInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CreditInfo> CREATOR = new Creator();

    @l
    private final Map<String, Object> analyticParams;

    @l
    private final BuzzoolaNetworkBannerItem creditInfoItem;
    private final boolean samplingEnabled;

    /* compiled from: CreditInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreditInfo createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap = null;
            BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItemCreateFromParcel = parcel.readInt() == 0 ? null : BuzzoolaNetworkBannerItem.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(CreditInfo.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CreditInfo(buzzoolaNetworkBannerItemCreateFromParcel, z12, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CreditInfo[] newArray(int i12) {
            return new CreditInfo[i12];
        }
    }

    public CreditInfo(@l BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem, boolean z12, @l Map<String, ? extends Object> map) {
        this.creditInfoItem = buzzoolaNetworkBannerItem;
        this.samplingEnabled = z12;
        this.analyticParams = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Map<String, Object> getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final BuzzoolaNetworkBannerItem getCreditInfoItem() {
        return this.creditInfoItem;
    }

    public final boolean getSamplingEnabled() {
        return this.samplingEnabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        BuzzoolaNetworkBannerItem buzzoolaNetworkBannerItem = this.creditInfoItem;
        if (buzzoolaNetworkBannerItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buzzoolaNetworkBannerItem.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.samplingEnabled ? 1 : 0);
        Map<String, Object> map = this.analyticParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
