package UP0;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersSharedInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUP0/b;", "", "a", "b", "LUP0/b$a;", "LUP0/b$b;", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: WidgetFiltersSharedInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUP0/b$a;", "LUP0/b;", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f16375a;

        public a(@k Date date) {
            this.f16375a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f16375a, ((a) obj).f16375a);
        }

        public final int hashCode() {
            return this.f16375a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("PassClickedDate(date="), this.f16375a, ')');
        }
    }

    /* compiled from: WidgetFiltersSharedInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUP0/b$b;", "LUP0/b;", "<init>", "()V", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UP0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1125b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1125b f16376a = new C1125b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1125b);
        }

        public final int hashCode() {
            return 1579055525;
        }

        @k
        public final String toString() {
            return "PassClickedResetDates";
        }
    }
}
