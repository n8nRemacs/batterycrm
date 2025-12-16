package pH;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigApplyInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LpH/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "LpH/b$a;", "LpH/b$b;", "LpH/b$c;", "LpH/b$d;", "LpH/b$e;", "LpH/b$f;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC46954b {

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/b$a;", "LpH/b;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$a */
    public static final /* data */ class a extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f428304a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f428305b;

        public a(@Y61.k DeepLink deepLink, @Y61.l String str) {
            super(null);
            this.f428304a = deepLink;
            this.f428305b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428304a, aVar.f428304a) && L.f(this.f428305b, aVar.f428305b);
        }

        public final int hashCode() {
            int iHashCode = this.f428304a.hashCode() * 31;
            String str = this.f428305b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplySuccess(deeplink=");
            sb2.append(this.f428304a);
            sb2.append(", slotId=");
            return C22026a.c(sb2, this.f428305b, ')');
        }
    }

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/b$b;", "LpH/b;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12259b extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12259b f428306a = new C12259b();

        public C12259b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12259b);
        }

        public final int hashCode() {
            return -517532141;
        }

        @Y61.k
        public final String toString() {
            return "ButtonTimerFinish";
        }
    }

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/b$c;", "LpH/b;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$c */
    public static final /* data */ class c extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f428307a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2066960925;
        }

        @Y61.k
        public final String toString() {
            return "Data";
        }
    }

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/b$d;", "LpH/b;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$d */
    public static final /* data */ class d extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AF.b f428308a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AF.a f428309b;

        public d(@Y61.k AF.b bVar, @Y61.k AF.a aVar) {
            super(null);
            this.f428308a = bVar;
            this.f428309b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f428308a, dVar.f428308a) && L.f(this.f428309b, dVar.f428309b);
        }

        public final int hashCode() {
            return this.f428309b.hashCode() + (this.f428308a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "HandledError(sheet=" + this.f428308a + ", actionButton=" + this.f428309b + ')';
        }
    }

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/b$e;", "LpH/b;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$e */
    public static final /* data */ class e extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f428310a = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1219656215;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: GigApplyInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/b$f;", "LpH/b;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.b$f */
    public static final /* data */ class f extends AbstractC46954b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f428311a = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2037370872;
        }

        @Y61.k
        public final String toString() {
            return "UnhandledError";
        }
    }

    public /* synthetic */ AbstractC46954b(C42822w c42822w) {
        this();
    }

    public AbstractC46954b() {
    }
}
