package ru.mts.biometry.api.entity.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApiDocumentData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Lru/mts/biometry/api/entity/state/ApiDocumentData;", "", "", "type", "countryCode", "sex", "series", "number", "surname", "authority", "birthdate", "firstName", "birthplace", "issuedDate", "middleName", "authorityCode", "expiryDate", "citizenship", "citizenshipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "g", "getSex", "m", "l", "n", "a", "c", "i", "d", "j", "k", "b", "h", "e", "f", "Companion", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentData {

    @k
    private static final String COUNTRY_CODE_RUS_UPPERCASE = "RUS";

    @k
    private static final String FEMALE_UPPERCASE = "FEMALE";

    @k
    private static final String MALE_UPPERCASE = "MALE";

    @c("authority")
    @l
    private final String authority;

    @c("authorityCode")
    @l
    private final String authorityCode;

    @c("birthdate")
    @l
    private final String birthdate;

    @c("birthplace")
    @l
    private final String birthplace;

    @c("citizenship")
    @l
    private final String citizenship;

    @c("citizenshipCode")
    @l
    private final String citizenshipCode;

    @c("countryCode")
    @l
    private final String countryCode;

    @c("expiryDate")
    @l
    private final String expiryDate;

    @c("firstName")
    @l
    private final String firstName;

    @c("issuedDate")
    @l
    private final String issuedDate;

    @c("middleName")
    @l
    private final String middleName;

    @c("number")
    @l
    private final String number;

    @c("series")
    @l
    private final String series;

    @c("sex")
    @l
    private final String sex;

    @c("surname")
    @l
    private final String surname;

    @c("type")
    @l
    private final String type;

    public ApiDocumentData(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11, @l String str12, @l String str13, @l String str14, @l String str15, @l String str16) {
        this.type = str;
        this.countryCode = str2;
        this.sex = str3;
        this.series = str4;
        this.number = str5;
        this.surname = str6;
        this.authority = str7;
        this.birthdate = str8;
        this.firstName = str9;
        this.birthplace = str10;
        this.issuedDate = str11;
        this.middleName = str12;
        this.authorityCode = str13;
        this.expiryDate = str14;
        this.citizenship = str15;
        this.citizenshipCode = str16;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getAuthorityCode() {
        return this.authorityCode;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getBirthdate() {
        return this.birthdate;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCitizenship() {
        return this.citizenship;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentData)) {
            return false;
        }
        ApiDocumentData apiDocumentData = (ApiDocumentData) obj;
        return L.f(this.type, apiDocumentData.type) && L.f(this.countryCode, apiDocumentData.countryCode) && L.f(this.sex, apiDocumentData.sex) && L.f(this.series, apiDocumentData.series) && L.f(this.number, apiDocumentData.number) && L.f(this.surname, apiDocumentData.surname) && L.f(this.authority, apiDocumentData.authority) && L.f(this.birthdate, apiDocumentData.birthdate) && L.f(this.firstName, apiDocumentData.firstName) && L.f(this.birthplace, apiDocumentData.birthplace) && L.f(this.issuedDate, apiDocumentData.issuedDate) && L.f(this.middleName, apiDocumentData.middleName) && L.f(this.authorityCode, apiDocumentData.authorityCode) && L.f(this.expiryDate, apiDocumentData.expiryDate) && L.f(this.citizenship, apiDocumentData.citizenship) && L.f(this.citizenshipCode, apiDocumentData.citizenshipCode);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getCitizenshipCode() {
        return this.citizenshipCode;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sex;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.series;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.number;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.surname;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.authority;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.birthdate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.birthplace;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issuedDate;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.middleName;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.authorityCode;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.expiryDate;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.citizenship;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.citizenshipCode;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getIssuedDate() {
        return this.issuedDate;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getSeries() {
        return this.series;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    @l
    public final String o() {
        String str = this.countryCode;
        if (!L.f(str != null ? str.toUpperCase(Locale.ROOT) : null, COUNTRY_CODE_RUS_UPPERCASE)) {
            return this.sex;
        }
        String str2 = this.sex;
        String upperCase = str2 != null ? str2.toUpperCase(Locale.ROOT) : null;
        return L.f(upperCase, MALE_UPPERCASE) ? "МУЖ." : L.f(upperCase, FEMALE_UPPERCASE) ? "ЖЕН." : this.sex;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentData(type=");
        sb2.append(this.type);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", sex=");
        sb2.append(this.sex);
        sb2.append(", series=");
        sb2.append(this.series);
        sb2.append(", number=");
        sb2.append(this.number);
        sb2.append(", surname=");
        sb2.append(this.surname);
        sb2.append(", authority=");
        sb2.append(this.authority);
        sb2.append(", birthdate=");
        sb2.append(this.birthdate);
        sb2.append(", firstName=");
        sb2.append(this.firstName);
        sb2.append(", birthplace=");
        sb2.append(this.birthplace);
        sb2.append(", issuedDate=");
        sb2.append(this.issuedDate);
        sb2.append(", middleName=");
        sb2.append(this.middleName);
        sb2.append(", authorityCode=");
        sb2.append(this.authorityCode);
        sb2.append(", expiryDate=");
        sb2.append(this.expiryDate);
        sb2.append(", citizenship=");
        sb2.append(this.citizenship);
        sb2.append(", citizenshipCode=");
        return C22026a.c(sb2, this.citizenshipCode, ')');
    }
}
