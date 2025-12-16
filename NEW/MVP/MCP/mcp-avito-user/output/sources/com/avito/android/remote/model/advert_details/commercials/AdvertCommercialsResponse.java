package com.avito.android.remote.model.advert_details.commercials;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.PositionedCommercialCascade;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: AdvertCommercialsResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B:\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR/\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007¢\u0006\u0002\b\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/advert_details/commercials/AdvertCommercialsResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/PositionedCommercialCascade;", "positions", "", "enableEventSampling", "", "", "", "LK51/e;", "analyticParams", "<init>", "(Ljava/util/List;ZLjava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPositions", "()Ljava/util/List;", "Z", "getEnableEventSampling", "()Z", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertCommercialsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCommercialsResponse> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, Object> analyticParams;

    @c("enableEventSampling")
    private final boolean enableEventSampling;

    @c("positions")
    @k
    private final List<PositionedCommercialCascade> positions;

    /* compiled from: AdvertCommercialsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCommercialsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCommercialsResponse createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(PositionedCommercialCascade.CREATOR, parcel, arrayList, iC2, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = h.c(AdvertCommercialsResponse.class, parcel, linkedHashMap2, parcel.readString(), iC3, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AdvertCommercialsResponse(arrayList, z12, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCommercialsResponse[] newArray(int i12) {
            return new AdvertCommercialsResponse[i12];
        }
    }

    public AdvertCommercialsResponse(@k List<PositionedCommercialCascade> list, boolean z12, @l Map<String, ? extends Object> map) {
        this.positions = list;
        this.enableEventSampling = z12;
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

    public final boolean getEnableEventSampling() {
        return this.enableEventSampling;
    }

    @k
    public final List<PositionedCommercialCascade> getPositions() {
        return this.positions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.positions, parcel);
        while (itJ.hasNext()) {
            ((PositionedCommercialCascade) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.enableEventSampling ? 1 : 0);
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
