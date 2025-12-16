package cc1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcc1/a;", "", "", "id", "", "expiresTime", "<init>", "(Ljava/lang/String;J)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "b", "()J", "getExpiresTime$annotations", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C27176a {

    @c("expiresTime")
    private final long expiresTime;

    @c("id")
    @k
    private final String id;

    public C27176a(@k String str, long j12) {
        this.id = str;
        this.expiresTime = j12;
    }

    public static C27176a a(C27176a c27176a, long j12) {
        String str = c27176a.id;
        c27176a.getClass();
        return new C27176a(str, j12);
    }

    /* renamed from: b, reason: from getter */
    public final long getExpiresTime() {
        return this.expiresTime;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27176a)) {
            return false;
        }
        C27176a c27176a = (C27176a) obj;
        return L.f(this.id, c27176a.id) && this.expiresTime == c27176a.expiresTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.expiresTime) + (this.id.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SessionInformation(id=" + this.id + ", expiresTime=" + this.expiresTime + ")";
    }
}
