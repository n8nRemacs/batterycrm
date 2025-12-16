package Qf0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Push.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQf0/a;", "", "a", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C14891a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Map<String, String> f13963a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f13964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13965c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13966d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13967e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13968f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f13969g;

    /* compiled from: Push.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LQf0/a$a;", "", "<init>", "()V", "", "KEY_NOTIFICATION", "Ljava/lang/String;", "KEY_URI", "_common_push-models_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qf0.a$a, reason: collision with other inner class name */
    public static final class C0923a {
        public /* synthetic */ C0923a(C42822w c42822w) {
            this();
        }

        public C0923a() {
        }
    }

    static {
        new C0923a(null);
    }

    public C14891a(@l Map<String, String> map, @l String str, int i12, int i13, int i14, long j12, @k String str2) {
        this.f13963a = map;
        this.f13964b = str;
        this.f13965c = i12;
        this.f13966d = i13;
        this.f13967e = i14;
        this.f13968f = j12;
        this.f13969g = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14891a)) {
            return false;
        }
        C14891a c14891a = (C14891a) obj;
        return L.f(this.f13963a, c14891a.f13963a) && L.f(this.f13964b, c14891a.f13964b) && this.f13965c == c14891a.f13965c && this.f13966d == c14891a.f13966d && this.f13967e == c14891a.f13967e && this.f13968f == c14891a.f13968f && L.f(this.f13969g, c14891a.f13969g);
    }

    public final int hashCode() {
        Map<String, String> map = this.f13963a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f13964b;
        return this.f13969g.hashCode() + r.g(r.e(this.f13967e, r.e(this.f13966d, r.e(this.f13965c, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31), 31, this.f13968f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Push(data=");
        sb2.append(this.f13963a);
        sb2.append(", from=");
        sb2.append(this.f13964b);
        sb2.append(", originalPriority=");
        sb2.append(this.f13965c);
        sb2.append(", deliveredPriority=");
        sb2.append(this.f13966d);
        sb2.append(", ttl=");
        sb2.append(this.f13967e);
        sb2.append(", sentTimestamp=");
        sb2.append(this.f13968f);
        sb2.append(", pushProviderType=");
        return C22026a.c(sb2, this.f13969g, ')');
    }

    public /* synthetic */ C14891a(Map map, String str, int i12, int i13, int i14, long j12, String str2, int i15, C42822w c42822w) {
        this(map, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) == 0 ? i14 : 0, (i15 & 32) != 0 ? 0L : j12, (i15 & 64) != 0 ? "unknown" : str2);
    }
}
