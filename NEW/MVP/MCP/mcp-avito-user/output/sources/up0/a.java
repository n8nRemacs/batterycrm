package UP0;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersSharedAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUP0/a;", "", "a", "b", "LUP0/a$a;", "LUP0/a$b;", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: WidgetFiltersSharedAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUP0/a$a;", "LUP0/a;", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UP0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1124a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f16373a;

        public C1124a(@k Date date) {
            this.f16373a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1124a) && L.f(this.f16373a, ((C1124a) obj).f16373a);
        }

        public final int hashCode() {
            return this.f16373a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("NotifyCalendarDateClicked(date="), this.f16373a, ')');
        }
    }

    /* compiled from: WidgetFiltersSharedAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUP0/a$b;", "LUP0/a;", "<init>", "()V", "_avito_widget-filters-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f16374a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 556876736;
        }

        @k
        public final String toString() {
            return "NotifyWidgetResetDatesClicked";
        }
    }
}
