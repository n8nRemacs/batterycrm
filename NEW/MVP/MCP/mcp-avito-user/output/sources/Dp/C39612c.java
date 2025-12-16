package dP;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ApiResumeCurrentPackageV2Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LdP/c;", "", "", "isEmployee", "isEnabled", "", "title", "<init>", "(ZZLjava/lang/String;)V", "Z", "b", "()Z", "c", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dP.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39612c {

    @com.google.gson.annotations.c("isEmployee")
    private final boolean isEmployee;

    @com.google.gson.annotations.c("isEnabled")
    private final boolean isEnabled;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C39612c(boolean z12, boolean z13, @k String str) {
        this.isEmployee = z12;
        this.isEnabled = z13;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsEmployee() {
        return this.isEmployee;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
