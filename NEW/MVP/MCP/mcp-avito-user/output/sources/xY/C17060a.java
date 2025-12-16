package Xy;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiMessengerInfoV2Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LXy/a;", "", "", "companyHashId", "companyId", "employeeId", "privateCompanySessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getCompanyId", "b", "c", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17060a {

    @c("companyHashId")
    @l
    private final String companyHashId;

    @c("companyId")
    @l
    private final String companyId;

    @c("employeeId")
    @l
    private final String employeeId;

    @c("privateCompanySessionId")
    @l
    private final String privateCompanySessionId;

    public C17060a(@l String str, @l String str2, @l String str3, @l String str4) {
        this.companyHashId = str;
        this.companyId = str2;
        this.employeeId = str3;
        this.privateCompanySessionId = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCompanyHashId() {
        return this.companyHashId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getEmployeeId() {
        return this.employeeId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPrivateCompanySessionId() {
        return this.privateCompanySessionId;
    }
}
