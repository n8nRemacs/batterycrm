package com.avito.android.libs.saved_searches.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/domain/SavedSearchParams;", "Lcom/avito/android/util/OpenParams;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavedSearchParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<SavedSearchParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f181443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f181444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SavedSearchArgs f181445d;

    /* compiled from: SavedSearchParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchParams> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
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
            return new SavedSearchParams(string, linkedHashMap, SavedSearchArgs.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchParams[] newArray(int i12) {
            return new SavedSearchParams[i12];
        }
    }

    public SavedSearchParams(@Y61.l String str, @Y61.l Map<String, String> map, @Y61.k SavedSearchArgs savedSearchArgs) {
        this.f181443b = str;
        this.f181444c = map;
        this.f181445d = savedSearchArgs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchParams)) {
            return false;
        }
        SavedSearchParams savedSearchParams = (SavedSearchParams) obj;
        return L.f(this.f181443b, savedSearchParams.f181443b) && L.f(this.f181444c, savedSearchParams.f181444c) && L.f(this.f181445d, savedSearchParams.f181445d);
    }

    public final int hashCode() {
        String str = this.f181443b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.f181444c;
        return this.f181445d.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SavedSearchParams(filterId=" + this.f181443b + ", params=" + this.f181444c + ", args=" + this.f181445d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f181443b);
        Map<String, String> map = this.f181444c;
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
        this.f181445d.writeToParcel(parcel, i12);
    }

    public /* synthetic */ SavedSearchParams(String str, Map map, SavedSearchArgs savedSearchArgs, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : map, savedSearchArgs);
    }
}
