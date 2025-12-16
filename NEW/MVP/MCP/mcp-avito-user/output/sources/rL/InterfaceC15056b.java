package Rl;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarSelectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRl/b;", "", "a", "b", "LRl/b$a;", "LRl/b$b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15056b {

    /* compiled from: CalendarSelectOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/b$a;", "LRl/b;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.b$a */
    public static final class a implements InterfaceC15056b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14590a = new a();
    }

    /* compiled from: CalendarSelectOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRl/b$b;", "LRl/b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0973b implements InterfaceC15056b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<LocalDate> f14591a;

        public C0973b(@k List<LocalDate> list) {
            this.f14591a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0973b) && L.f(this.f14591a, ((C0973b) obj).f14591a);
        }

        public final int hashCode() {
            return this.f14591a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SubmitDataAndCloseScreen(selectedDates="), this.f14591a, ')');
        }
    }
}
