package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/RecentSearch;", "Landroid/os/Parcelable;", "", "locationName", "title", "", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Ljava/lang/String;", "getLocationName", "()Ljava/lang/String;", "getTitle", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RecentSearch implements Parcelable {

    @k
    public static final Parcelable.Creator<RecentSearch> CREATOR = new a();

    @c("locationName")
    @l
    private final String locationName;

    @c("params")
    @l
    private final Map<String, String> params;

    @c("title")
    @l
    private final String title;

    /* compiled from: WidgetFiltersLocationWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecentSearch> {
        @Override // android.os.Parcelable.Creator
        public final RecentSearch createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new RecentSearch(string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RecentSearch[] newArray(int i12) {
            return new RecentSearch[i12];
        }
    }

    public RecentSearch(@l String str, @l String str2, @l Map<String, String> map) {
        this.locationName = str;
        this.title = str2;
        this.params = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearch)) {
            return false;
        }
        RecentSearch recentSearch = (RecentSearch) obj;
        return L.f(this.locationName, recentSearch.locationName) && L.f(this.title, recentSearch.title) && L.f(this.params, recentSearch.params);
    }

    @l
    public final String getLocationName() {
        return this.locationName;
    }

    @l
    public final Map<String, String> getParams() {
        return this.params;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.locationName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.params;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecentSearch(locationName=");
        sb2.append(this.locationName);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", params=");
        return r.w(sb2, this.params, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.locationName);
        parcel.writeString(this.title);
        Map<String, String> map = this.params;
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
