package SU0;

import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: NetworkRequestLifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSU0/e;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f15010c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f15011a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f15012b;

    /* compiled from: NetworkRequestLifecycle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSU0/e$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static e a(@Y61.l String str, @Y61.l String str2, @Y61.k Map map) {
            StringBuilder sb2 = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb2.append(C43066x.D0(str, '/'));
            sb2.append('/');
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(C43066x.H0(str2, '/'));
            return new e(sb2.toString(), map);
        }

        public a() {
        }
    }

    public e(@Y61.k String str, @Y61.k Map<String, String> map) {
        this.f15011a = str;
        this.f15012b = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f15011a, eVar.f15011a) && this.f15012b.equals(eVar.f15012b);
    }

    public final int hashCode() {
        return this.f15012b.hashCode() + (this.f15011a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetaInfo(url=");
        sb2.append(this.f15011a);
        sb2.append(", entries=");
        return H.n(sb2, this.f15012b, ')');
    }
}
