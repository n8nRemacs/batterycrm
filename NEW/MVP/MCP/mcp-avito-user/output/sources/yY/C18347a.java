package Yy;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiUserInfoV2Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LYy/a;", "", "", "employeeId", "", "isApprovedEmployee", "", "message", "<init>", "(Ljava/lang/Long;ZLjava/lang/String;)V", "Ljava/lang/Long;", "getEmployeeId", "()Ljava/lang/Long;", "Z", "a", "()Z", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C18347a {

    @c("employeeId")
    @l
    private final Long employeeId;

    @c("isApprovedEmployee")
    private final boolean isApprovedEmployee;

    @c("message")
    @k
    private final String message;

    public C18347a(@l Long l12, boolean z12, @k String str) {
        this.employeeId = l12;
        this.isApprovedEmployee = z12;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsApprovedEmployee() {
        return this.isApprovedEmployee;
    }
}
