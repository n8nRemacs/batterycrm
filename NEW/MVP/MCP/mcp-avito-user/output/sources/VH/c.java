package vH;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sH.C48049a;

/* compiled from: MotivationPaymentState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"LvH/c;", "", "<init>", "()V", "a", "b", "c", "d", "LvH/c$b;", "LvH/c$c;", "LvH/c$d;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f440638a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final d f440639b = d.f440643c;

    /* compiled from: MotivationPaymentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/c$a;", "", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MotivationPaymentState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvH/c$b;", "LvH/c;", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C48049a f440640c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f440641d;

        public /* synthetic */ b(C48049a c48049a, boolean z12, int i12, C42822w c42822w) {
            this(c48049a, (i12 & 2) != 0 ? false : z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440640c, bVar.f440640c) && this.f440641d == bVar.f440641d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440641d) + (this.f440640c.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(motivationPayment=");
            sb2.append(this.f440640c);
            sb2.append(", isRefreshing=");
            return r.x(sb2, this.f440641d, ')');
        }

        public b(@k C48049a c48049a, boolean z12) {
            super(null);
            this.f440640c = c48049a;
            this.f440641d = z12;
        }
    }

    /* compiled from: MotivationPaymentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/c$c;", "LvH/c;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vH.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12760c extends c {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C12760c f440642c = new C12760c();

        public C12760c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12760c);
        }

        public final int hashCode() {
            return 73684138;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: MotivationPaymentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/c$d;", "LvH/c;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final d f440643c = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -388349090;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
