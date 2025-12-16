package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: SerpBannerContainer.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BF\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001b\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R/\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\b\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/SerpBannerContainer;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/FavoriteElement;", "", "elements", "", "size", "", "enableEventSampling", "", "", "LK51/e;", "analyticParams", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/lang/String;", "getSize", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnableEventSampling", "()Ljava/lang/Boolean;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpBannerContainer implements SerpElement, FavoriteElement {

    @k
    public static final Parcelable.Creator<SerpBannerContainer> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, Object> analyticParams;

    @c("list")
    @k
    private final List<SerpElement> elements;

    @c("enableEventSampling")
    @l
    private final Boolean enableEventSampling;

    @c("size")
    @l
    private final String size;
    private long uniqueId;

    /* compiled from: SerpBannerContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpBannerContainer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBannerContainer createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(SerpBannerContainer.class, parcel, arrayList, iL2, 1);
            }
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = h.c(SerpBannerContainer.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SerpBannerContainer(arrayList, string, boolValueOf, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBannerContainer[] newArray(int i12) {
            return new SerpBannerContainer[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpBannerContainer(@k List<? extends SerpElement> list, @l String str, @l Boolean bool, @l Map<String, ? extends Object> map) {
        this.elements = list;
        this.size = str;
        this.enableEventSampling = bool;
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

    @k
    public final List<SerpElement> getElements() {
        return this.elements;
    }

    @l
    public final Boolean getEnableEventSampling() {
        return this.enableEventSampling;
    }

    @l
    public final String getSize() {
        return this.size;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.elements, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeString(this.size);
        Boolean bool = this.enableEventSampling;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
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
