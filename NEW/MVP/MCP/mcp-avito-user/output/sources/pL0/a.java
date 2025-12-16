package PL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LPL0/a;", "", "a", "b", "c", "d", "e", "LPL0/a$a;", "LPL0/a$b;", "LPL0/a$c;", "LPL0/a$d;", "LPL0/a$e;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: VisualVasAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/a$a;", "LPL0/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PL0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0841a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.vas_performance.screens.visual.item.item.a f13019a;

        public C0841a(@k com.avito.android.vas_performance.screens.visual.item.item.a aVar) {
            this.f13019a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0841a) && L.f(this.f13019a, ((C0841a) obj).f13019a);
        }

        public final int hashCode() {
            return this.f13019a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemSelected(item=" + this.f13019a + ')';
        }
    }

    /* compiled from: VisualVasAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL0/a$b;", "LPL0/a;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13020a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -533982538;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: VisualVasAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/a$c;", "LPL0/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f13021a;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13021a, ((c) obj).f13021a);
        }

        public final int hashCode() {
            Integer num = this.f13021a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("OnContinueButtonClicked(buttonId="), this.f13021a, ')');
        }

        public c(@l Integer num) {
            this.f13021a = num;
        }

        public /* synthetic */ c(Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num);
        }
    }

    /* compiled from: VisualVasAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL0/a$d;", "LPL0/a;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13022a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -749050865;
        }

        @k
        public final String toString() {
            return "OnHelpButtonClicked";
        }
    }

    /* compiled from: VisualVasAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL0/a$e;", "LPL0/a;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f13023a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 800975234;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }
}
