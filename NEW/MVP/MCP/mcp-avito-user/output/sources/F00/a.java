package F00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContentPrivateState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LF00/a;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0269a f4468d = new C0269a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f4469e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<LZ.c> f4470a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final G00.a f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4472c;

    /* compiled from: ContentPrivateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF00/a$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F00.a$a, reason: collision with other inner class name */
    public static final class C0269a {
        public /* synthetic */ C0269a(C42822w c42822w) {
            this();
        }

        public C0269a() {
        }
    }

    static {
        G00.c.f6142r.getClass();
        f4469e = new a(G00.c.f6143s.f6153k, null, false);
    }

    public a(@k List<LZ.c> list, @l G00.a aVar, boolean z12) {
        this.f4470a = list;
        this.f4471b = aVar;
        this.f4472c = z12;
    }

    public static a a(a aVar, List list, G00.a aVar2, int i12) {
        if ((i12 & 1) != 0) {
            list = aVar.f4470a;
        }
        if ((i12 & 2) != 0) {
            aVar2 = aVar.f4471b;
        }
        boolean z12 = (i12 & 4) != 0 ? aVar.f4472c : false;
        aVar.getClass();
        return new a(list, aVar2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f4470a, aVar.f4470a) && L.f(this.f4471b, aVar.f4471b) && this.f4472c == aVar.f4472c;
    }

    public final int hashCode() {
        int iHashCode = this.f4470a.hashCode() * 31;
        G00.a aVar = this.f4471b;
        return Boolean.hashCode(this.f4472c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentPrivateState(content=");
        sb2.append(this.f4470a);
        sb2.append(", errorsCounterState=");
        sb2.append(this.f4471b);
        sb2.append(", shouldScrollToNextError=");
        return r.x(sb2, this.f4472c, ')');
    }
}
