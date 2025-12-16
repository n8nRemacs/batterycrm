package com.avito.android.remote.model.category_parameters.slot.cpa_tariff;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaTariffSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaTariffSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "description", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaSlotButton;", "button", "", "attributesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaSlotButton;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaSlotButton;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaSlotButton;Ljava/util/Map;)Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaTariffSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaSlotButton;", "getButton", "Ljava/util/Map;", "getAttributesAndValues", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CpaTariffSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<CpaTariffSlotConfig> CREATOR = new Creator();

    @c("developmentAttributesAndValues")
    @l
    private final Map<String, String> attributesAndValues;

    @c("button")
    @k
    private final CpaSlotButton button;

    @c("description")
    @k
    private final String description;

    @c("title")
    @k
    private final String title;

    /* compiled from: CpaTariffSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CpaTariffSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaTariffSlotConfig createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            CpaSlotButton cpaSlotButtonCreateFromParcel = CpaSlotButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CpaTariffSlotConfig(string, string2, cpaSlotButtonCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CpaTariffSlotConfig[] newArray(int i12) {
            return new CpaTariffSlotConfig[i12];
        }
    }

    public CpaTariffSlotConfig(@k String str, @k String str2, @k CpaSlotButton cpaSlotButton, @l Map<String, String> map) {
        this.title = str;
        this.description = str2;
        this.button = cpaSlotButton;
        this.attributesAndValues = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CpaTariffSlotConfig copy$default(CpaTariffSlotConfig cpaTariffSlotConfig, String str, String str2, CpaSlotButton cpaSlotButton, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cpaTariffSlotConfig.title;
        }
        if ((i12 & 2) != 0) {
            str2 = cpaTariffSlotConfig.description;
        }
        if ((i12 & 4) != 0) {
            cpaSlotButton = cpaTariffSlotConfig.button;
        }
        if ((i12 & 8) != 0) {
            map = cpaTariffSlotConfig.attributesAndValues;
        }
        return cpaTariffSlotConfig.copy(str, str2, cpaSlotButton, map);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final CpaSlotButton getButton() {
        return this.button;
    }

    @l
    public final Map<String, String> component4() {
        return this.attributesAndValues;
    }

    @k
    public final CpaTariffSlotConfig copy(@k String title, @k String description, @k CpaSlotButton button, @l Map<String, String> attributesAndValues) {
        return new CpaTariffSlotConfig(title, description, button, attributesAndValues);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CpaTariffSlotConfig)) {
            return false;
        }
        CpaTariffSlotConfig cpaTariffSlotConfig = (CpaTariffSlotConfig) other;
        return L.f(this.title, cpaTariffSlotConfig.title) && L.f(this.description, cpaTariffSlotConfig.description) && L.f(this.button, cpaTariffSlotConfig.button) && L.f(this.attributesAndValues, cpaTariffSlotConfig.attributesAndValues);
    }

    @l
    public final Map<String, String> getAttributesAndValues() {
        return this.attributesAndValues;
    }

    @k
    public final CpaSlotButton getButton() {
        return this.button;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.button.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description)) * 31;
        Map<String, String> map = this.attributesAndValues;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CpaTariffSlotConfig(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", attributesAndValues=");
        return r.w(sb2, this.attributesAndValues, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        this.button.writeToParcel(parcel, flags);
        Map<String, String> map = this.attributesAndValues;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
