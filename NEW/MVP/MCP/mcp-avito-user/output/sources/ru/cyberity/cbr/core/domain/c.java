package ru.cyberity.cbr.core.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CountriesUseCase.kt */
@K51.d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR+\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R+\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000f¨\u0006."}, d2 = {"Lru/cyberity/cbr/core/domain/c;", "Landroid/os/Parcelable;", "", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countries", "Lru/cyberity/cbr/core/data/model/remote/c;", "phoneMasks", "countriesMap", "unfilteredCountriesMap", "includedCountries", "currentCountryKey", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "b", "k", "c", "h", "d", "l", "e", "j", "f", "Ljava/lang/String;", "i", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class c implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> countries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, ru.cyberity.cbr.core.data.model.remote.c> phoneMasks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> countriesMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> unfilteredCountriesMap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Map<String, String> includedCountries;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String currentCountryKey;

    public c(@Y61.l Map<String, String> map, @Y61.l Map<String, ru.cyberity.cbr.core.data.model.remote.c> map2, @Y61.l Map<String, String> map3, @Y61.l Map<String, String> map4, @Y61.l Map<String, String> map5, @Y61.l String str) {
        this.countries = map;
        this.phoneMasks = map2;
        this.countriesMap = map3;
        this.unfilteredCountriesMap = map4;
        this.includedCountries = map5;
        this.currentCountryKey = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return L.f(this.countries, cVar.countries) && L.f(this.phoneMasks, cVar.phoneMasks) && L.f(this.countriesMap, cVar.countriesMap) && L.f(this.unfilteredCountriesMap, cVar.unfilteredCountriesMap) && L.f(this.includedCountries, cVar.includedCountries) && L.f(this.currentCountryKey, cVar.currentCountryKey);
    }

    @Y61.l
    public final Map<String, String> g() {
        return this.countries;
    }

    @Y61.l
    public final Map<String, String> h() {
        return this.countriesMap;
    }

    public int hashCode() {
        Map<String, String> map = this.countries;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> map2 = this.phoneMasks;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.countriesMap;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, String> map4 = this.unfilteredCountriesMap;
        int iHashCode4 = (iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, String> map5 = this.includedCountries;
        int iHashCode5 = (iHashCode4 + (map5 == null ? 0 : map5.hashCode())) * 31;
        String str = this.currentCountryKey;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getCurrentCountryKey() {
        return this.currentCountryKey;
    }

    @Y61.l
    public final Map<String, String> j() {
        return this.includedCountries;
    }

    @Y61.l
    public final Map<String, ru.cyberity.cbr.core.data.model.remote.c> k() {
        return this.phoneMasks;
    }

    @Y61.l
    public final Map<String, String> l() {
        return this.unfilteredCountriesMap;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CountryResultData(countries=");
        sb2.append(this.countries);
        sb2.append(", phoneMasks=");
        sb2.append(this.phoneMasks);
        sb2.append(", countriesMap=");
        sb2.append(this.countriesMap);
        sb2.append(", unfilteredCountriesMap=");
        sb2.append(this.unfilteredCountriesMap);
        sb2.append(", includedCountries=");
        sb2.append(this.includedCountries);
        sb2.append(", currentCountryKey=");
        return C22026a.c(sb2, this.currentCountryKey, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        Map<String, String> map = this.countries;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, ru.cyberity.cbr.core.data.model.remote.c> map2 = this.phoneMasks;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                ((ru.cyberity.cbr.core.data.model.remote.c) entry2.getValue()).writeToParcel(parcel, flags);
            }
        }
        Map<String, String> map3 = this.countriesMap;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH3 = C0.h(parcel, 1, map3);
            while (itH3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) itH3.next();
                parcel.writeString((String) entry3.getKey());
                parcel.writeString((String) entry3.getValue());
            }
        }
        Map<String, String> map4 = this.unfilteredCountriesMap;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH4 = C0.h(parcel, 1, map4);
            while (itH4.hasNext()) {
                Map.Entry entry4 = (Map.Entry) itH4.next();
                parcel.writeString((String) entry4.getKey());
                parcel.writeString((String) entry4.getValue());
            }
        }
        Map<String, String> map5 = this.includedCountries;
        if (map5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH5 = C0.h(parcel, 1, map5);
            while (itH5.hasNext()) {
                Map.Entry entry5 = (Map.Entry) itH5.next();
                parcel.writeString((String) entry5.getKey());
                parcel.writeString((String) entry5.getValue());
            }
        }
        parcel.writeString(this.currentCountryKey);
    }

    /* compiled from: CountriesUseCase.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(@Y61.k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            int iA2 = 0;
            LinkedHashMap linkedHashMap5 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i12);
                int iA3 = 0;
                while (iA3 != i12) {
                    iA3 = C0.a(parcel, linkedHashMap6, parcel.readString(), iA3, 1);
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap7.put(parcel.readString(), ru.cyberity.cbr.core.data.model.remote.c.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap2 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(i15);
                int iA4 = 0;
                while (iA4 != i15) {
                    iA4 = C0.a(parcel, linkedHashMap8, parcel.readString(), iA4, 1);
                }
                linkedHashMap3 = linkedHashMap8;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap4 = null;
            } else {
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(i16);
                int iA5 = 0;
                while (iA5 != i16) {
                    iA5 = C0.a(parcel, linkedHashMap9, parcel.readString(), iA5, 1);
                }
                linkedHashMap4 = linkedHashMap9;
            }
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                linkedHashMap5 = new LinkedHashMap(i17);
                while (iA2 != i17) {
                    iA2 = C0.a(parcel, linkedHashMap5, parcel.readString(), iA2, 1);
                }
            }
            return new c(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i12) {
            return new c[i12];
        }
    }
}
