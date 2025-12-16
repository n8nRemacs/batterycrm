package jP;

import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiApplyActionV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LjP/h;", "", "", "managerId", "", "managerName", "text", "updatedAt", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    @com.google.gson.annotations.c("managerId")
    @l
    private final Long managerId;

    @com.google.gson.annotations.c("managerName")
    @l
    private final String managerName;

    @com.google.gson.annotations.c("text")
    @l
    private final String text;

    @com.google.gson.annotations.c("updatedAt")
    @l
    private final String updatedAt;

    public h(@l Long l12, @l String str, @l String str2, @l String str3) {
        this.managerId = l12;
        this.managerName = str;
        this.text = str2;
        this.updatedAt = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getManagerId() {
        return this.managerId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getManagerName() {
        return this.managerName;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
