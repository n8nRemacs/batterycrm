package com.avito.android.geo_common.model.location_picker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestion.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "jsonWebToken", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion$SuggestType;", "suggestType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion$SuggestType;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/Coordinates;", "d", "()Lcom/avito/android/remote/model/Coordinates;", "e", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion$SuggestType;", "f", "()Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion$SuggestType;", "SuggestType", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressSuggestion implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressSuggestion> CREATOR = new a();

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @l
    private final Coordinates coordinates;

    @c(AddressParameter.Value.JSON_WEB_TOKEN)
    @l
    private final String jsonWebToken;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("suggestType")
    @l
    private final SuggestType suggestType;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressSuggestion.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion$SuggestType;", "", "(Ljava/lang/String;I)V", "HISTORICAL", "DEFAULT", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestType {

        @c("default")
        public static final SuggestType DEFAULT;

        @c("history")
        public static final SuggestType HISTORICAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SuggestType[] f159413b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f159414c;

        static {
            SuggestType suggestType = new SuggestType("HISTORICAL", 0);
            HISTORICAL = suggestType;
            SuggestType suggestType2 = new SuggestType("DEFAULT", 1);
            DEFAULT = suggestType2;
            SuggestType[] suggestTypeArr = {suggestType, suggestType2};
            f159413b = suggestTypeArr;
            f159414c = kotlin.enums.c.a(suggestTypeArr);
        }

        private SuggestType(String str, int i12) {
        }

        public static SuggestType valueOf(String str) {
            return (SuggestType) Enum.valueOf(SuggestType.class, str);
        }

        public static SuggestType[] values() {
            return (SuggestType[]) f159413b.clone();
        }
    }

    /* compiled from: AddressSuggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressSuggestion> {
        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion createFromParcel(Parcel parcel) {
            return new AddressSuggestion(parcel.readString(), parcel.readString(), (Coordinates) parcel.readParcelable(AddressSuggestion.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SuggestType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion[] newArray(int i12) {
            return new AddressSuggestion[i12];
        }
    }

    public AddressSuggestion(@k String str, @k String str2, @l Coordinates coordinates, @l String str3, @l SuggestType suggestType) {
        this.title = str;
        this.subtitle = str2;
        this.coordinates = coordinates;
        this.jsonWebToken = str3;
        this.suggestType = suggestType;
    }

    public static AddressSuggestion a(AddressSuggestion addressSuggestion, Coordinates coordinates) {
        String str = addressSuggestion.title;
        String str2 = addressSuggestion.subtitle;
        String str3 = addressSuggestion.jsonWebToken;
        SuggestType suggestType = addressSuggestion.suggestType;
        addressSuggestion.getClass();
        return new AddressSuggestion(str, str2, coordinates, str3, suggestType);
    }

    @k
    public final String c() {
        if (this.title.length() == 0 || this.subtitle.length() == 0) {
            return this.title.length() == 0 ? this.subtitle.length() == 0 ? "" : this.subtitle : this.title;
        }
        return this.subtitle + ", " + this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getJsonWebToken() {
        return this.jsonWebToken;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSuggestion)) {
            return false;
        }
        AddressSuggestion addressSuggestion = (AddressSuggestion) obj;
        return L.f(this.title, addressSuggestion.title) && L.f(this.subtitle, addressSuggestion.subtitle) && L.f(this.coordinates, addressSuggestion.coordinates) && L.f(this.jsonWebToken, addressSuggestion.jsonWebToken) && this.suggestType == addressSuggestion.suggestType;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final SuggestType getSuggestType() {
        return this.suggestType;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.subtitle);
        Coordinates coordinates = this.coordinates;
        int iHashCode = (iD2 + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        String str = this.jsonWebToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SuggestType suggestType = this.suggestType;
        return iHashCode2 + (suggestType != null ? suggestType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AddressSuggestion(title=" + this.title + ", subtitle=" + this.subtitle + ", coordinates=" + this.coordinates + ", jsonWebToken=" + this.jsonWebToken + ", suggestType=" + this.suggestType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.coordinates, i12);
        parcel.writeString(this.jsonWebToken);
        SuggestType suggestType = this.suggestType;
        if (suggestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(suggestType.name());
        }
    }

    public /* synthetic */ AddressSuggestion(String str, String str2, Coordinates coordinates, String str3, SuggestType suggestType, int i12, C42822w c42822w) {
        this(str, str2, coordinates, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : suggestType);
    }
}
