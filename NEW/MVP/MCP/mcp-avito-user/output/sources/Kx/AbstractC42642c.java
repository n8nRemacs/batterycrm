package kX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.loyalty.ui.criteria_gray.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"LkX/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "e", "LkX/c$b;", "LkX/c$c;", "LkX/c$d;", "LkX/c$e;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC42642c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406368b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final e f406369c = e.f406373d;

    /* compiled from: CriteriaGrayState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/c$a;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CriteriaGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/c$b;", "LkX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.c$b */
    public static final /* data */ class b extends AbstractC42642c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final h f406370d;

        public b(@k h hVar) {
            super(null);
            this.f406370d = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f406370d, ((b) obj).f406370d);
        }

        public final int hashCode() {
            return this.f406370d.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f406370d + ')';
        }
    }

    /* compiled from: CriteriaGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/c$c;", "LkX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11620c extends AbstractC42642c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C11620c f406371d = new C11620c();

        public C11620c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11620c);
        }

        public final int hashCode() {
            return 1343625438;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CriteriaGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/c$d;", "LkX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.c$d */
    public static final /* data */ class d extends AbstractC42642c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final d f406372d = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -106657841;
        }

        @k
        public final String toString() {
            return "Forbidden";
        }
    }

    /* compiled from: CriteriaGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/c$e;", "LkX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.c$e */
    public static final /* data */ class e extends AbstractC42642c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final e f406373d = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 254528146;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC42642c(C42822w c42822w) {
        this();
    }

    public AbstractC42642c() {
    }
}
