package Le0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishRequestState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLe0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f10058e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f10059f = new d(0, 0, null, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10060a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f10061b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10063d;

    /* compiled from: PublishRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLe0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(int i12, int i13, @l String str, boolean z12) {
        this.f10060a = z12;
        this.f10061b = str;
        this.f10062c = i12;
        this.f10063d = i13;
    }

    public static d a(d dVar, boolean z12, String str) {
        int i12 = dVar.f10062c;
        int i13 = dVar.f10063d;
        dVar.getClass();
        return new d(i12, i13, str, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f10060a == dVar.f10060a && L.f(this.f10061b, dVar.f10061b) && this.f10062c == dVar.f10062c && this.f10063d == dVar.f10063d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10060a) * 31;
        String str = this.f10061b;
        return Integer.hashCode(this.f10063d) + r.e(this.f10062c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishRequestState(isLoading=");
        sb2.append(this.f10060a);
        sb2.append(", error=");
        sb2.append(this.f10061b);
        sb2.append(", photosCount=");
        sb2.append(this.f10062c);
        sb2.append(", currentPhotosCount=");
        return r.t(sb2, this.f10063d, ')');
    }
}
