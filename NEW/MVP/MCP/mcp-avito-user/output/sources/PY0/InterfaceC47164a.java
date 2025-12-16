package py0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpy0/a;", "", "a", "b", "c", "d", "e", "Lpy0/a$a;", "Lpy0/a$b;", "Lpy0/a$c;", "Lpy0/a$d;", "Lpy0/a$e;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: py0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47164a {

    /* compiled from: StrBookingCalendarAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/a$a;", "Lpy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.a$a, reason: collision with other inner class name */
    public static final class C12297a implements InterfaceC47164a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12297a f428897a = new C12297a();
    }

    /* compiled from: StrBookingCalendarAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/a$b;", "Lpy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.a$b */
    public static final class b implements InterfaceC47164a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f428898a = new b();
    }

    /* compiled from: StrBookingCalendarAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpy0/a$c;", "Lpy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.a$c */
    public static final /* data */ class c implements InterfaceC47164a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f428899a;

        public c(@k Date date) {
            this.f428899a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428899a, ((c) obj).f428899a);
        }

        public final int hashCode() {
            return this.f428899a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("DayClick(date="), this.f428899a, ')');
        }
    }

    /* compiled from: StrBookingCalendarAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/a$d;", "Lpy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.a$d */
    public static final class d implements InterfaceC47164a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428900a = new d();
    }

    /* compiled from: StrBookingCalendarAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy0/a$e;", "Lpy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: py0.a$e */
    public static final class e implements InterfaceC47164a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f428901a = new e();
    }
}
