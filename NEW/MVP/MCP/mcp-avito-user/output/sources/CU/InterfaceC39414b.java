package cu;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcu/b;", "", "a", "b", "c", "Lcu/b$a;", "Lcu/b$b;", "Lcu/b$c;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC39414b {

    /* compiled from: DasCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/b$a;", "Lcu/b;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.b$a */
    public static final /* data */ class a implements InterfaceC39414b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f392986a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2080269111;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DasCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu/b$b;", "Lcu/b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.b$b, reason: collision with other inner class name */
    public static final /* data */ class C10994b implements InterfaceC39414b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f392987a;

        public C10994b(@k Date date) {
            this.f392987a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10994b) && L.f(this.f392987a, ((C10994b) obj).f392987a);
        }

        public final int hashCode() {
            return this.f392987a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("PassSelectedDate(selectedDate="), this.f392987a, ')');
        }
    }

    /* compiled from: DasCalendarOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu/b$c;", "Lcu/b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.b$c */
    public static final /* data */ class c implements InterfaceC39414b {

        /* renamed from: a, reason: collision with root package name */
        public final int f392988a;

        public c(int i12) {
            this.f392988a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f392988a == ((c) obj).f392988a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f392988a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f392988a, ')');
        }
    }
}
