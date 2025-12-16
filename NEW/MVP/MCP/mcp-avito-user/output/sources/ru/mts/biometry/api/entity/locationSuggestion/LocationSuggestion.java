package ru.mts.biometry.api.entity.locationSuggestion;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationSuggestion.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/mts/biometry/api/entity/locationSuggestion/LocationSuggestion;", "", "", "value", "unrestrictedValue", "Lru/mts/biometry/api/entity/locationSuggestion/LocationData;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/mts/biometry/api/entity/locationSuggestion/LocationData;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lru/mts/biometry/api/entity/locationSuggestion/LocationData;", "a", "()Lru/mts/biometry/api/entity/locationSuggestion/LocationData;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LocationSuggestion {

    @c("data")
    @k
    private final LocationData data;

    @c("unrestricted_value")
    @k
    private final String unrestrictedValue;

    @c("value")
    @k
    private final String value;

    public LocationSuggestion(@k String str, @k String str2, @k LocationData locationData) {
        this.value = str;
        this.unrestrictedValue = str2;
        this.data = locationData;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final LocationData getData() {
        return this.data;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getUnrestrictedValue() {
        return this.unrestrictedValue;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSuggestion)) {
            return false;
        }
        LocationSuggestion locationSuggestion = (LocationSuggestion) obj;
        return L.f(this.value, locationSuggestion.value) && L.f(this.unrestrictedValue, locationSuggestion.unrestrictedValue) && L.f(this.data, locationSuggestion.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + H.d(this.value.hashCode() * 31, 31, this.unrestrictedValue);
    }

    @k
    public final String toString() {
        return "LocationSuggestion(value=" + this.value + ", unrestrictedValue=" + this.unrestrictedValue + ", data=" + this.data + ')';
    }
}
