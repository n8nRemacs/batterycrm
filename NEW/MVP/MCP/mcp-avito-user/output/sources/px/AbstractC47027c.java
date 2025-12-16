package pX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.loyalty.ui.quality_service.mvi.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LpX/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LpX/c$a;", "LpX/c$b;", "LpX/c$c;", "LpX/c$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC47027c extends q {

    /* compiled from: QualityServiceState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpX/c$a;", "LpX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.c$a */
    public static final /* data */ class a extends AbstractC47027c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f428583b = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -344956392;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: QualityServiceState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpX/c$b;", "LpX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.c$b */
    public static final /* data */ class b extends AbstractC47027c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f428584b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1608754185;
        }

        @k
        public final String toString() {
            return "Forbidden";
        }
    }

    /* compiled from: QualityServiceState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpX/c$c;", "LpX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12278c extends AbstractC47027c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f428585b;

        public C12278c(@k p pVar) {
            super(null);
            this.f428585b = pVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12278c) && L.f(this.f428585b, ((C12278c) obj).f428585b);
        }

        public final int hashCode() {
            return this.f428585b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(screenData=" + this.f428585b + ')';
        }
    }

    /* compiled from: QualityServiceState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpX/c$d;", "LpX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pX.c$d */
    public static final /* data */ class d extends AbstractC47027c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f428586b = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1025027404;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC47027c(C42822w c42822w) {
        this();
    }

    public AbstractC47027c() {
    }
}
