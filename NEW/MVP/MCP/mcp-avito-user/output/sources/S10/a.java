package S10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientModel.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LS10/a;", "", "", "firstName", "middleName", "lastName", "phone", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getMiddleName", "getLastName", "getPhone", "getEmail", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("email")
    @l
    private final String email;

    @com.google.gson.annotations.c("firstName")
    @k
    private final String firstName;

    @com.google.gson.annotations.c("lastName")
    @k
    private final String lastName;

    @com.google.gson.annotations.c("middleName")
    @k
    private final String middleName;

    @com.google.gson.annotations.c("phone")
    @k
    private final String phone;

    public a(@k String str, @k String str2, @k String str3, @k String str4, @l String str5) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.phone = str4;
        this.email = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.firstName, aVar.firstName) && L.f(this.middleName, aVar.middleName) && L.f(this.lastName, aVar.lastName) && L.f(this.phone, aVar.phone) && L.f(this.email, aVar.email);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.firstName.hashCode() * 31, 31, this.middleName), 31, this.lastName), 31, this.phone);
        String str = this.email;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientModel(firstName=");
        sb2.append(this.firstName);
        sb2.append(", middleName=");
        sb2.append(this.middleName);
        sb2.append(", lastName=");
        sb2.append(this.lastName);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", email=");
        return C22026a.c(sb2, this.email, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 16) != 0 ? null : str5);
    }
}
