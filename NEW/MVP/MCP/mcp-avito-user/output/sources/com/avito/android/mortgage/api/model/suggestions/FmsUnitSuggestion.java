package com.avito.android.mortgage.api.model.suggestions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FmsUnitSuggestion.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/suggestions/FmsUnitSuggestion;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "", "code", "name", "regionCode", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getName", "d", "getType", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class FmsUnitSuggestion implements Suggestion {

    @k
    public static final Parcelable.Creator<FmsUnitSuggestion> CREATOR = new a();

    @c("code")
    @l
    private final String code;

    @c("name")
    @l
    private final String name;

    @c("regionCode")
    @l
    private final String regionCode;

    @c("type")
    @l
    private final String type;

    /* compiled from: FmsUnitSuggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FmsUnitSuggestion> {
        @Override // android.os.Parcelable.Creator
        public final FmsUnitSuggestion createFromParcel(Parcel parcel) {
            return new FmsUnitSuggestion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FmsUnitSuggestion[] newArray(int i12) {
            return new FmsUnitSuggestion[i12];
        }
    }

    public FmsUnitSuggestion(@l String str, @l String str2, @l String str3, @l String str4) {
        this.code = str;
        this.name = str2;
        this.regionCode = str3;
        this.type = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // com.avito.android.mortgage.api.model.suggestions.Suggestion
    public final boolean c0() {
        String str = this.code;
        if (!(str == null || str.length() == 0)) {
            String str2 = this.name;
            if (!(str2 == null || str2.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmsUnitSuggestion)) {
            return false;
        }
        FmsUnitSuggestion fmsUnitSuggestion = (FmsUnitSuggestion) obj;
        return L.f(this.code, fmsUnitSuggestion.code) && L.f(this.name, fmsUnitSuggestion.name) && L.f(this.regionCode, fmsUnitSuggestion.regionCode) && L.f(this.type, fmsUnitSuggestion.type);
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FmsUnitSuggestion(code=");
        sb2.append(this.code);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", regionCode=");
        sb2.append(this.regionCode);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        parcel.writeString(this.regionCode);
        parcel.writeString(this.type);
    }
}
