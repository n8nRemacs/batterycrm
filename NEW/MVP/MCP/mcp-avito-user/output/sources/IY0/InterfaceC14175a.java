package Iy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDay.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIy0/a;", "", "a", "b", "LIy0/a$a;", "LIy0/a$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14175a {

    /* compiled from: CalendarDay.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIy0/a$a;", "LIy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iy0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0496a implements InterfaceC14175a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f8650a;

        public C0496a(@k Date date) {
            this.f8650a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0496a) && L.f(this.f8650a, ((C0496a) obj).f8650a);
        }

        public final int hashCode() {
            return this.f8650a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("Empty(nextDate="), this.f8650a, ')');
        }
    }

    /* compiled from: CalendarDay.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIy0/a$b;", "LIy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iy0.a$b */
    public static final /* data */ class b implements InterfaceC14175a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f8651a;

        public b(@k Date date) {
            this.f8651a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f8651a, ((b) obj).f8651a);
        }

        public final int hashCode() {
            return this.f8651a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("Item(date="), this.f8651a, ')');
        }
    }
}
