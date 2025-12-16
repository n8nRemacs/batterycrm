package GV0;

import SU0.e;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: ContentLoadingTrackerParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LGV0/a;", "", "a", "b", "network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0352a f6520c = new C0352a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f6521a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f6522b;

    /* compiled from: ContentLoadingTrackerParams.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGV0/a$a;", "", "<init>", "()V", "network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GV0.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public /* synthetic */ C0352a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @k
        public static a a(@k e eVar) {
            Object bVar;
            ?? r02 = eVar.f15012b;
            String strK = (String) r02.get("contentType");
            if (strK == null) {
                new b();
                String str = eVar.f15011a;
                strK = H.k("[./]", b.f6527e.f(b.f6526d.f(b.f6525c.f(b.f6524b.f(b.f6523a.f(C43066x.U("/", C43066x.m0(str, "://", str)), "{id}"), "{version}"), "api/{version}"), "{id}"), "{id}"), "_");
            }
            try {
                int i12 = Z.f406624c;
                String str2 = (String) r02.get("page");
                bVar = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            return new a(strK, (Integer) (bVar instanceof Z.b ? null : bVar));
        }

        public C0352a() {
        }
    }

    /* compiled from: ContentLoadingTrackerParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LGV0/a$b;", "", "<init>", "()V", "a", "network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C43059p f6523a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C43059p f6524b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C43059p f6525c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C43059p f6526d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final C43059p f6527e;

        /* compiled from: ContentLoadingTrackerParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LGV0/a$b$a;", "", "<init>", "()V", "Lkotlin/text/p;", "apiWithVersionNumberRegex", "Lkotlin/text/p;", "numberRegex", "uuidRegex", "versionNumberRegex", "network_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: GV0.a$b$a, reason: collision with other inner class name */
        public static final class C0353a {
            public /* synthetic */ C0353a(C42822w c42822w) {
                this();
            }

            public C0353a() {
            }
        }

        static {
            new C0353a(null);
            f6523a = new C43059p("\\{[\\w\\d]+\\}");
            f6524b = new C43059p("^\\d+");
            f6525c = new C43059p("^api/\\d+");
            f6526d = new C43059p("[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}");
            f6527e = new C43059p("(?<=/)(\\d+)(?=/|$)");
        }
    }

    public a(@k String str, @l Integer num) {
        this.f6521a = str;
        this.f6522b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f6521a, aVar.f6521a) && L.f(this.f6522b, aVar.f6522b);
    }

    public final int hashCode() {
        int iHashCode = this.f6521a.hashCode() * 31;
        Integer num = this.f6522b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentLoadingTrackerParams(contentType=");
        sb2.append(this.f6521a);
        sb2.append(", page=");
        return s.j(sb2, this.f6522b, ')');
    }
}
