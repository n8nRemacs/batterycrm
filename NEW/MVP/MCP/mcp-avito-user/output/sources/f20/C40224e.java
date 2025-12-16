package f20;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1ClientListGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lf20/e;", "", "", "firstName", "lastName", "middleName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f20.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40224e {

    @com.google.gson.annotations.c("firstName")
    @k
    private final String firstName;

    @com.google.gson.annotations.c("lastName")
    @k
    private final String lastName;

    @com.google.gson.annotations.c("middleName")
    @k
    private final String middleName;

    public C40224e(@k String str, @k String str2, @k String str3) {
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }
}
