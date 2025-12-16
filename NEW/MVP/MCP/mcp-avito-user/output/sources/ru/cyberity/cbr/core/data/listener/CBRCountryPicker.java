package ru.cyberity.cbr.core.data.listener;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRCountryPicker.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\u000f\u0010JG\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "", "Landroid/content/Context;", "context", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "items", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "callback", "", "requestKey", "resultKey", "Lkotlin/G0;", "pickCountry", "(Landroid/content/Context;Ljava/util/List;Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;Ljava/lang/String;Ljava/lang/String;)V", "CBRCountryPickerCallBack", "CountryItem", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRCountryPicker {

    /* compiled from: CBRCountryPicker.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "Landroid/os/Parcelable;", "", "code", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode", "getName", "Companion", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @d
    public static final /* data */ class CountryItem implements Parcelable {

        @k
        private final String code;

        @k
        private final String name;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        @k
        public static final Parcelable.Creator<CountryItem> CREATOR = new Creator();

        /* compiled from: CBRCountryPicker.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem$Companion;", "", "()V", "fromMap", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "countriesMap", "", "", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final List<CountryItem> fromMap(@k Map<String, String> countriesMap) {
                ArrayList arrayList = new ArrayList(countriesMap.size());
                for (Map.Entry<String, String> entry : countriesMap.entrySet()) {
                    arrayList.add(new CountryItem(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        /* compiled from: CBRCountryPicker.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CountryItem> {
            @Override // android.os.Parcelable.Creator
            @k
            public final CountryItem createFromParcel(@k Parcel parcel) {
                return new CountryItem(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final CountryItem[] newArray(int i12) {
                return new CountryItem[i12];
            }
        }

        public CountryItem(@k String str, @k String str2) {
            this.code = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryItem)) {
                return false;
            }
            CountryItem countryItem = (CountryItem) other;
            return L.f(this.code, countryItem.code) && L.f(this.name, countryItem.name);
        }

        @k
        public final String getCode() {
            return this.code;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.code.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CountryItem(code=");
            sb2.append(this.code);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.code);
            parcel.writeString(this.name);
        }
    }

    static /* synthetic */ void pickCountry$default(CBRCountryPicker cBRCountryPicker, Context context, List list, CBRCountryPickerCallBack cBRCountryPickerCallBack, String str, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pickCountry");
        }
        cBRCountryPicker.pickCountry(context, list, cBRCountryPickerCallBack, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2);
    }

    void pickCountry(@k Context context, @k List<CountryItem> items, @l CBRCountryPickerCallBack callback, @l String requestKey, @l String resultKey);

    /* compiled from: CBRCountryPicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "item", "Lkotlin/G0;", "onItemSelected", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "onDismiss", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface CBRCountryPickerCallBack {
        void onItemSelected(@k CountryItem item);

        default void onDismiss() {
        }
    }
}
