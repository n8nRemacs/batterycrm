package X00;

import JZ.o;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalResultState.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LX00/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LX00/a$b;", "LX00/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C1289a f18101b = new C1289a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f18102c = new c(InterfaceC40507d.b.a(7.0f), InterfaceC40507d.b.a(7.0f), null, null, null, new X00.b(null, C42784z0.f406748b));

    /* compiled from: PreApprovalResultState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LX00/a$a;", "", "<init>", "()V", "", "INITIAL_TIMER_SECONDS", "F", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X00.a$a, reason: collision with other inner class name */
    public static final class C1289a {
        public /* synthetic */ C1289a(C42822w c42822w) {
            this();
        }

        public C1289a() {
        }
    }

    /* compiled from: PreApprovalResultState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX00/a$b;", "LX00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final o f18103d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final MZ.l f18104e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18105f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f18106g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final X00.b f18107h;

        public b(@l o oVar, @l MZ.l lVar, boolean z12, @l String str, @k X00.b bVar) {
            super(null);
            this.f18103d = oVar;
            this.f18104e = lVar;
            this.f18105f = z12;
            this.f18106g = str;
            this.f18107h = bVar;
        }

        public static b i(b bVar, o oVar, MZ.l lVar, boolean z12, String str, X00.b bVar2, int i12) {
            if ((i12 & 1) != 0) {
                oVar = bVar.f18103d;
            }
            o oVar2 = oVar;
            if ((i12 & 2) != 0) {
                lVar = bVar.f18104e;
            }
            MZ.l lVar2 = lVar;
            if ((i12 & 4) != 0) {
                z12 = bVar.f18105f;
            }
            boolean z13 = z12;
            if ((i12 & 8) != 0) {
                str = bVar.f18106g;
            }
            String str2 = str;
            if ((i12 & 16) != 0) {
                bVar2 = bVar.f18107h;
            }
            bVar.getClass();
            return new b(oVar2, lVar2, z13, str2, bVar2);
        }

        @Override // X00.a
        @l
        /* renamed from: c, reason: from getter */
        public final MZ.l getF18110f() {
            return this.f18104e;
        }

        @Override // X00.a
        @l
        /* renamed from: d, reason: from getter */
        public final o getF18111g() {
            return this.f18103d;
        }

        @Override // X00.a
        @l
        /* renamed from: e, reason: from getter */
        public final String getF18112h() {
            return this.f18106g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f18103d, bVar.f18103d) && L.f(this.f18104e, bVar.f18104e) && this.f18105f == bVar.f18105f && L.f(this.f18106g, bVar.f18106g) && L.f(this.f18107h, bVar.f18107h);
        }

        @Override // X00.a
        @k
        /* renamed from: f, reason: from getter */
        public final X00.b getF18113i() {
            return this.f18107h;
        }

        public final int hashCode() {
            o oVar = this.f18103d;
            int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
            MZ.l lVar = this.f18104e;
            int i12 = r.i((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f18105f);
            String str = this.f18106g;
            return this.f18107h.hashCode() + ((i12 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "FinalState(result=" + this.f18103d + ", mortgageInfo=" + this.f18104e + ", isActionLoading=" + this.f18105f + ", source=" + this.f18106g + ", viewState=" + this.f18107h + ')';
        }
    }

    /* compiled from: PreApprovalResultState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX00/a$c;", "LX00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final InterfaceC40507d f18108d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final InterfaceC40507d.b f18109e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final MZ.l f18110f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final o f18111g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f18112h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final X00.b f18113i;

        public c(@k InterfaceC40507d interfaceC40507d, @k InterfaceC40507d.b bVar, @l MZ.l lVar, @l o oVar, @l String str, @k X00.b bVar2) {
            super(null);
            this.f18108d = interfaceC40507d;
            this.f18109e = bVar;
            this.f18110f = lVar;
            this.f18111g = oVar;
            this.f18112h = str;
            this.f18113i = bVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v6, types: [g00.d] */
        public static c i(c cVar, InterfaceC40507d.a aVar, MZ.l lVar, o oVar, String str, X00.b bVar, int i12) {
            InterfaceC40507d.a aVar2 = aVar;
            if ((i12 & 1) != 0) {
                aVar2 = cVar.f18108d;
            }
            InterfaceC40507d.a aVar3 = aVar2;
            InterfaceC40507d.b bVar2 = cVar.f18109e;
            if ((i12 & 4) != 0) {
                lVar = cVar.f18110f;
            }
            MZ.l lVar2 = lVar;
            if ((i12 & 8) != 0) {
                oVar = cVar.f18111g;
            }
            o oVar2 = oVar;
            if ((i12 & 16) != 0) {
                str = cVar.f18112h;
            }
            String str2 = str;
            if ((i12 & 32) != 0) {
                bVar = cVar.f18113i;
            }
            cVar.getClass();
            return new c(aVar3, bVar2, lVar2, oVar2, str2, bVar);
        }

        @Override // X00.a
        @l
        /* renamed from: c, reason: from getter */
        public final MZ.l getF18110f() {
            return this.f18110f;
        }

        @Override // X00.a
        @l
        /* renamed from: d, reason: from getter */
        public final o getF18111g() {
            return this.f18111g;
        }

        @Override // X00.a
        @l
        /* renamed from: e, reason: from getter */
        public final String getF18112h() {
            return this.f18112h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f18108d, cVar.f18108d) && L.f(this.f18109e, cVar.f18109e) && L.f(this.f18110f, cVar.f18110f) && L.f(this.f18111g, cVar.f18111g) && L.f(this.f18112h, cVar.f18112h) && L.f(this.f18113i, cVar.f18113i);
        }

        @Override // X00.a
        @k
        /* renamed from: f, reason: from getter */
        public final X00.b getF18113i() {
            return this.f18113i;
        }

        public final int hashCode() {
            int iD2 = r.d(this.f18109e.f396215a, this.f18108d.hashCode() * 31, 31);
            MZ.l lVar = this.f18110f;
            int iHashCode = (iD2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            o oVar = this.f18111g;
            int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
            String str = this.f18112h;
            return this.f18113i.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "TimerState(timeLeft=" + this.f18108d + ", allTime=" + this.f18109e + ", mortgageInfo=" + this.f18110f + ", result=" + this.f18111g + ", source=" + this.f18112h + ", viewState=" + this.f18113i + ')';
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @l
    /* renamed from: c */
    public abstract MZ.l getF18110f();

    @l
    /* renamed from: d */
    public abstract o getF18111g();

    @l
    /* renamed from: e */
    public abstract String getF18112h();

    @k
    /* renamed from: f */
    public abstract X00.b getF18113i();

    @k
    public final a g(boolean z12) {
        return this instanceof b ? b.i((b) this, null, null, z12, null, null, 27) : this;
    }

    @k
    public final a h(@l o oVar) {
        if (this instanceof c) {
            return c.i((c) this, null, null, oVar, null, null, 55);
        }
        if (this instanceof b) {
            return b.i((b) this, oVar, null, false, null, null, 30);
        }
        throw new NoWhenBranchMatchedException();
    }

    public a() {
    }
}
