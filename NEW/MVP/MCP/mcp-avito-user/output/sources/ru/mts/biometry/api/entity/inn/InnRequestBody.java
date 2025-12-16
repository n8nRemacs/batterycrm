package ru.mts.biometry.api.entity.inn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InnRequestBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/mts/biometry/api/entity/inn/InnRequestBody;", "", "", "surname", "name", "middlename", "birthday", "passport", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getSurname", "()Ljava/lang/String;", "getName", "getMiddlename", "getBirthday", "getPassport", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InnRequestBody {

    @c("birthday")
    @k
    private final String birthday;

    @c("middlename")
    @k
    private final String middlename;

    @c("name")
    @k
    private final String name;

    @c("passport")
    @k
    private final String passport;

    @c("surname")
    @k
    private final String surname;

    public InnRequestBody(@k String str, @k String str2, @k String str3, @k String str4, @k String str5) {
        this.surname = str;
        this.name = str2;
        this.middlename = str3;
        this.birthday = str4;
        this.passport = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnRequestBody)) {
            return false;
        }
        InnRequestBody innRequestBody = (InnRequestBody) obj;
        return L.f(this.surname, innRequestBody.surname) && L.f(this.name, innRequestBody.name) && L.f(this.middlename, innRequestBody.middlename) && L.f(this.birthday, innRequestBody.birthday) && L.f(this.passport, innRequestBody.passport);
    }

    public final int hashCode() {
        return this.passport.hashCode() + H.d(H.d(H.d(this.surname.hashCode() * 31, 31, this.name), 31, this.middlename), 31, this.birthday);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InnRequestBody(surname=");
        sb2.append(this.surname);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", middlename=");
        sb2.append(this.middlename);
        sb2.append(", birthday=");
        sb2.append(this.birthday);
        sb2.append(", passport=");
        return C22026a.c(sb2, this.passport, ')');
    }
}
