package rv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RequestPermissionResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrv/c;", "", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rv.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47920c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437160c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437161a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f437162b;

    /* compiled from: RequestPermissionResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrv/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rv.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47920c(boolean z12, boolean z13) {
        this.f437161a = z12;
        this.f437162b = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47920c)) {
            return false;
        }
        C47920c c47920c = (C47920c) obj;
        return this.f437161a == c47920c.f437161a && this.f437162b == c47920c.f437162b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f437162b) + (Boolean.hashCode(this.f437161a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestPermissionResult(isGranted=");
        sb2.append(this.f437161a);
        sb2.append(", shouldShowRequestPermissionRationale=");
        return r.x(sb2, this.f437162b, ')');
    }
}
