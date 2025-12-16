package sQ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobInterviewInvitationResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LsQ/d;", "", "", "LsQ/f;", "dates", "LsQ/e;", "location", "", "phone", "<init>", "(Ljava/util/List;LsQ/e;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LsQ/e;", "b", "()LsQ/e;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sQ.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48094d {

    @com.google.gson.annotations.c("dates")
    @k
    private final List<C48096f> dates;

    @com.google.gson.annotations.c("location")
    @k
    private final C48095e location;

    @com.google.gson.annotations.c("phone")
    @l
    private final String phone;

    public C48094d(@k List<C48096f> list, @k C48095e c48095e, @l String str) {
        this.dates = list;
        this.location = c48095e;
        this.phone = str;
    }

    @k
    public final List<C48096f> a() {
        return this.dates;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C48095e getLocation() {
        return this.location;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48094d)) {
            return false;
        }
        C48094d c48094d = (C48094d) obj;
        return L.f(this.dates, c48094d.dates) && L.f(this.location, c48094d.location) && L.f(this.phone, c48094d.phone);
    }

    public final int hashCode() {
        int iHashCode = (this.location.hashCode() + (this.dates.hashCode() * 31)) * 31;
        String str = this.phone;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobInterviewInvitationResponse(dates=");
        sb2.append(this.dates);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.phone, ')');
    }
}
