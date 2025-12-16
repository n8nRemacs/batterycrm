package E60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentListInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LE60/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "LE60/b$a;", "LE60/b$b;", "LE60/b$c;", "LE60/b$d;", "LE60/b$e;", "LE60/b$f;", "LE60/b$g;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b {

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE60/b$a;", "LE60/b;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3772a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 427948041;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE60/b$b;", "LE60/b;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E60.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0217b extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f3773a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3774b;

        public C0217b(@k ArrayList arrayList, boolean z12) {
            super(null);
            this.f3773a = arrayList;
            this.f3774b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0217b)) {
                return false;
            }
            C0217b c0217b = (C0217b) obj;
            return L.f(this.f3773a, c0217b.f3773a) && this.f3774b == c0217b.f3774b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3774b) + (this.f3773a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(content=");
            sb2.append(this.f3773a);
            sb2.append(", canLoadMore=");
            return r.x(sb2, this.f3774b, ')');
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE60/b$c;", "LE60/b;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3775a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 429976601;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE60/b$d;", "LE60/b;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3776a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -227775874;
        }

        @k
        public final String toString() {
            return "LoadMoreError";
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE60/b$e;", "LE60/b;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f3777a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3778b;

        public e(@k ArrayList arrayList, boolean z12) {
            super(null);
            this.f3777a = arrayList;
            this.f3778b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f3777a, eVar.f3777a) && this.f3778b == eVar.f3778b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3778b) + (this.f3777a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoreLoaded(content=");
            sb2.append(this.f3777a);
            sb2.append(", canLoadMore=");
            return r.x(sb2, this.f3778b, ')');
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE60/b$f;", "LE60/b;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f3779a = new f();

        public f() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -315358391;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: PaymentListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE60/b$g;", "LE60/b;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f3780a = new g();

        public g() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1638131262;
        }

        @k
        public final String toString() {
            return "StartLoadingMore";
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
