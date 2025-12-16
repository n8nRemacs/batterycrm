package rX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: QualityServiceGrayState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LrX/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LrX/c$a;", "LrX/c$b;", "LrX/c$c;", "LrX/c$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC47609c extends q {

    /* compiled from: QualityServiceGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/c$a;", "LrX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.c$a */
    public static final /* data */ class a extends AbstractC47609c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f429863b = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1229918927;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: QualityServiceGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/c$b;", "LrX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.c$b */
    public static final /* data */ class b extends AbstractC47609c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f429864b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1492984128;
        }

        @k
        public final String toString() {
            return "Forbidden";
        }
    }

    /* compiled from: QualityServiceGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrX/c$c;", "LrX/c;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12380c extends AbstractC47609c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final n f429865b;

        public C12380c(@k n nVar) {
            super(null);
            this.f429865b = nVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12380c) && L.f(this.f429865b, ((C12380c) obj).f429865b);
        }

        public final int hashCode() {
            return this.f429865b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(screenData=" + this.f429865b + ')';
        }
    }

    /* compiled from: QualityServiceGrayState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrX/c$d;", "LrX/c;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rX.c$d */
    public static final /* data */ class d extends AbstractC47609c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final d f429866b = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1643246525;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC47609c(C42822w c42822w) {
        this();
    }

    public AbstractC47609c() {
    }
}
