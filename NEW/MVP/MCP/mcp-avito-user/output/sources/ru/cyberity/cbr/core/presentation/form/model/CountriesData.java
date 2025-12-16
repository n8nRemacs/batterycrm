package ru.cyberity.cbr.core.presentation.form.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.domain.c;

/* compiled from: CountriesData.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "Landroid/os/Parcelable;", "", "", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneCountryCodeWithMasks", "Lru/cyberity/cbr/core/domain/c;", "countriesData", "<init>", "(Ljava/util/Map;Lru/cyberity/cbr/core/domain/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getPhoneCountryCodeWithMasks", "()Ljava/util/Map;", "Lru/cyberity/cbr/core/domain/c;", "getCountriesData", "()Lru/cyberity/cbr/core/domain/c;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class CountriesData implements Parcelable {

    @k
    public static final Parcelable.Creator<CountriesData> CREATOR = new Creator();

    @k
    private final c countriesData;

    @l
    private final Map<String, ru.cyberity.cbr.core.data.model.remote.c> phoneCountryCodeWithMasks;

    /* compiled from: CountriesData.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountriesData> {
        @Override // android.os.Parcelable.Creator
        @k
        public final CountriesData createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(CountriesData.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CountriesData(linkedHashMap, (c) parcel.readParcelable(CountriesData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        @k
        public final CountriesData[] newArray(int i12) {
            return new CountriesData[i12];
        }
    }

    public CountriesData(@l Map<String, ru.cyberity.cbr.core.data.model.remote.c> map, @k c cVar) {
        this.phoneCountryCodeWithMasks = map;
        this.countriesData = cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountriesData)) {
            return false;
        }
        CountriesData countriesData = (CountriesData) other;
        return L.f(this.phoneCountryCodeWithMasks, countriesData.phoneCountryCodeWithMasks) && L.f(this.countriesData, countriesData.countriesData);
    }

    @k
    public final c getCountriesData() {
        return this.countriesData;
    }

    public int hashCode() {
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> map = this.phoneCountryCodeWithMasks;
        return this.countriesData.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @k
    public String toString() {
        return "CountriesData(phoneCountryCodeWithMasks=" + this.phoneCountryCodeWithMasks + ", countriesData=" + this.countriesData + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> map = this.phoneCountryCodeWithMasks;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        parcel.writeParcelable(this.countriesData, flags);
    }
}
