package CG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalColor;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TransactionState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCG0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f2063e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f2064f = new c(null, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f2065b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f2066c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BG0.a f2067d;

    /* compiled from: TransactionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCG0/c$a;", "", "<init>", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TransactionState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LCG0/c$b;", "", "<init>", "()V", "a", "b", "c", "LCG0/c$b$a;", "LCG0/c$b$b;", "LCG0/c$b$c;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TransactionState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/c$b$a;", "LCG0/c$b;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f2068a;

            public a(@k D d12) {
                super(null);
                this.f2068a = d12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f2068a, ((a) obj).f2068a);
            }

            public final int hashCode() {
                return this.f2068a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(rendererState=" + this.f2068a + ')';
            }
        }

        /* compiled from: TransactionState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/c$b$b;", "LCG0/c$b;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: CG0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0100b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f2069a;

            public C0100b(@k ApiError apiError) {
                super(null);
                this.f2069a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0100b) && L.f(this.f2069a, ((C0100b) obj).f2069a);
            }

            public final int hashCode() {
                return this.f2069a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f2069a, ')');
            }
        }

        /* compiled from: TransactionState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCG0/c$b$c;", "LCG0/c$b;", "<init>", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: CG0.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C0101c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0101c f2070a = new C0101c();

            public C0101c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0101c);
            }

            public final int hashCode() {
                return 97382089;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public static c a(c cVar, b bVar, UniversalColor universalColor, BG0.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            bVar = cVar.f2065b;
        }
        if ((i12 & 2) != 0) {
            universalColor = cVar.f2066c;
        }
        if ((i12 & 4) != 0) {
            aVar = cVar.f2067d;
        }
        cVar.getClass();
        return new c(bVar, universalColor, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f2065b, cVar.f2065b) && L.f(this.f2066c, cVar.f2066c) && L.f(this.f2067d, cVar.f2067d);
    }

    public final int hashCode() {
        int iHashCode = this.f2065b.hashCode() * 31;
        UniversalColor universalColor = this.f2066c;
        return this.f2067d.hashCode() + ((iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "TransactionState(viewState=" + this.f2065b + ", statusBarColor=" + this.f2066c + ", transactionParams=" + this.f2067d + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ c(CG0.c.b r17, com.avito.android.remote.model.UniversalColor r18, BG0.a r19, int r20, kotlin.jvm.internal.C42822w r21) {
        /*
            r16 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L7
            CG0.c$b$c r0 = CG0.c.b.C0101c.f2070a
            goto L9
        L7:
            r0 = r17
        L9:
            r1 = r20 & 2
            if (r1 == 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            r1 = r18
        L11:
            r2 = r20 & 4
            if (r2 == 0) goto L2b
            BG0.a r2 = new BG0.a
            r14 = 1023(0x3ff, float:1.434E-42)
            r15 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r16
            goto L2f
        L2b:
            r3 = r16
            r2 = r19
        L2f:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: CG0.c.<init>(CG0.c$b, com.avito.android.remote.model.UniversalColor, BG0.a, int, kotlin.jvm.internal.w):void");
    }

    public c(@k b bVar, @l UniversalColor universalColor, @k BG0.a aVar) {
        this.f2065b = bVar;
        this.f2066c = universalColor;
        this.f2067d = aVar;
    }
}
