package Mz0;

import Lz0.AbstractC14461a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MonthSelectorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMz0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14551c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f11157f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C14551c f11158g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Date f11159b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11160c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AbstractC14461a> f11161d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C14552d f11162e;

    /* compiled from: MonthSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMz0/c$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        C14552d.f11163c.getClass();
        f11158g = new C14551c(null, null, c42784z0, C14552d.f11164d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14551c(@l Date date, @l String str, @k List<? extends AbstractC14461a> list, @k C14552d c14552d) {
        this.f11159b = date;
        this.f11160c = str;
        this.f11161d = list;
        this.f11162e = c14552d;
    }

    public static C14551c a(C14551c c14551c, Date date, String str, List list, C14552d c14552d, int i12) {
        if ((i12 & 1) != 0) {
            date = c14551c.f11159b;
        }
        if ((i12 & 2) != 0) {
            str = c14551c.f11160c;
        }
        if ((i12 & 4) != 0) {
            list = c14551c.f11161d;
        }
        if ((i12 & 8) != 0) {
            c14552d = c14551c.f11162e;
        }
        c14551c.getClass();
        return new C14551c(date, str, list, c14552d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14551c)) {
            return false;
        }
        C14551c c14551c = (C14551c) obj;
        return L.f(this.f11159b, c14551c.f11159b) && L.f(this.f11160c, c14551c.f11160c) && L.f(this.f11161d, c14551c.f11161d) && L.f(this.f11162e, c14551c.f11162e);
    }

    public final int hashCode() {
        Date date = this.f11159b;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        String str = this.f11160c;
        return this.f11162e.hashCode() + H.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f11161d);
    }

    @k
    public final String toString() {
        return "MonthSelectorState(todayDate=" + this.f11159b + ", selectedMonthId=" + this.f11160c + ", calendarItemsData=" + this.f11161d + ", viewState=" + this.f11162e + ')';
    }
}
