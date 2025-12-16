package g70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersonalFiltersChangeDialogState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg70/d;", "", "a", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f396332b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f396333c = new d(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f396334a;

    /* compiled from: PersonalFiltersChangeDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg70/d$a;", "", "<init>", "()V", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(boolean z12) {
        this.f396334a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f396334a == ((d) obj).f396334a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f396334a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("PersonalFiltersChangeDialogState(isRequestInProgress="), this.f396334a, ')');
    }
}
