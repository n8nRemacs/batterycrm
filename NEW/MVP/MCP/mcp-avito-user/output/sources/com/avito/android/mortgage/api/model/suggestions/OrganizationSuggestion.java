package com.avito.android.mortgage.api.model.suggestions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OrganizationSuggestion.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/avito/android/mortgage/api/model/suggestions/OrganizationSuggestion;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "", "inn", "Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "Lcom/avito/android/mortgage/api/model/suggestions/AddressSuggestion;", "addressSuggest", "age", "employees", "name", "phone", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/mortgage/api/model/SuggestionContainer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "c", "()Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "d", "e", "getName", "g", "getType", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class OrganizationSuggestion implements Suggestion {

    @k
    public static final Parcelable.Creator<OrganizationSuggestion> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @l
    private final SuggestionContainer<AddressSuggestion> addressSuggest;

    @c("age")
    @l
    private final String age;

    @c("employees")
    @l
    private final String employees;

    @c("innNumber")
    @l
    private final String inn;

    @c("name")
    @l
    private final String name;

    @c("phone")
    @l
    private final String phone;

    @c("type")
    @l
    private final String type;

    /* compiled from: OrganizationSuggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrganizationSuggestion> {
        @Override // android.os.Parcelable.Creator
        public final OrganizationSuggestion createFromParcel(Parcel parcel) {
            return new OrganizationSuggestion(parcel.readString(), parcel.readInt() == 0 ? null : SuggestionContainer.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrganizationSuggestion[] newArray(int i12) {
            return new OrganizationSuggestion[i12];
        }
    }

    public OrganizationSuggestion(@l String str, @l SuggestionContainer<AddressSuggestion> suggestionContainer, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.inn = str;
        this.addressSuggest = suggestionContainer;
        this.age = str2;
        this.employees = str3;
        this.name = str4;
        this.phone = str5;
        this.type = str6;
    }

    public static OrganizationSuggestion a(OrganizationSuggestion organizationSuggestion, String str, String str2, String str3, int i12) {
        if ((i12 & 1) != 0) {
            str = organizationSuggestion.inn;
        }
        String str4 = str;
        SuggestionContainer<AddressSuggestion> suggestionContainer = organizationSuggestion.addressSuggest;
        String str5 = organizationSuggestion.age;
        String str6 = organizationSuggestion.employees;
        if ((i12 & 16) != 0) {
            str2 = organizationSuggestion.name;
        }
        String str7 = str2;
        if ((i12 & 32) != 0) {
            str3 = organizationSuggestion.phone;
        }
        String str8 = organizationSuggestion.type;
        organizationSuggestion.getClass();
        return new OrganizationSuggestion(str4, suggestionContainer, str5, str6, str7, str3, str8);
    }

    @l
    public final SuggestionContainer<AddressSuggestion> c() {
        return this.addressSuggest;
    }

    @Override // com.avito.android.mortgage.api.model.suggestions.Suggestion
    public final boolean c0() {
        String str = this.inn;
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
    public final String getAge() {
        return this.age;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getEmployees() {
        return this.employees;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationSuggestion)) {
            return false;
        }
        OrganizationSuggestion organizationSuggestion = (OrganizationSuggestion) obj;
        return L.f(this.inn, organizationSuggestion.inn) && L.f(this.addressSuggest, organizationSuggestion.addressSuggest) && L.f(this.age, organizationSuggestion.age) && L.f(this.employees, organizationSuggestion.employees) && L.f(this.name, organizationSuggestion.name) && L.f(this.phone, organizationSuggestion.phone) && L.f(this.type, organizationSuggestion.type);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getPhone() {
        return this.phone;
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
        String str = this.inn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SuggestionContainer<AddressSuggestion> suggestionContainer = this.addressSuggest;
        int iHashCode2 = (iHashCode + (suggestionContainer == null ? 0 : suggestionContainer.hashCode())) * 31;
        String str2 = this.age;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.employees;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrganizationSuggestion(inn=");
        sb2.append(this.inn);
        sb2.append(", addressSuggest=");
        sb2.append(this.addressSuggest);
        sb2.append(", age=");
        sb2.append(this.age);
        sb2.append(", employees=");
        sb2.append(this.employees);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.inn);
        SuggestionContainer<AddressSuggestion> suggestionContainer = this.addressSuggest;
        if (suggestionContainer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestionContainer.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.age);
        parcel.writeString(this.employees);
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
        parcel.writeString(this.type);
    }
}
