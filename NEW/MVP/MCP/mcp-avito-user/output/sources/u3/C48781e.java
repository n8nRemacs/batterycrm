package u3;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu3/e;", "", "", "abToken", "", "clientExposure", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "_common_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C48781e {

    @com.google.gson.annotations.c("abToken")
    @Y61.k
    private final String abToken;

    @com.google.gson.annotations.c("clientExposure")
    private final boolean clientExposure;

    public C48781e(@Y61.k String str, boolean z12) {
        this.abToken = str;
        this.clientExposure = z12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getAbToken() {
        return this.abToken;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getClientExposure() {
        return this.clientExposure;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48781e)) {
            return false;
        }
        C48781e c48781e = (C48781e) obj;
        return L.f(this.abToken, c48781e.abToken) && this.clientExposure == c48781e.clientExposure;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.clientExposure) + (this.abToken.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsParams(abToken=");
        sb2.append(this.abToken);
        sb2.append(", clientExposure=");
        return r.x(sb2, this.clientExposure, ')');
    }
}
