package Rl;

import Y61.k;
import Y61.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarSelectAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LRl/a;", "", "a", "b", "c", "d", "e", "LRl/a$a;", "LRl/a$b;", "LRl/a$c;", "LRl/a$d;", "LRl/a$e;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15055a {

    /* compiled from: CalendarSelectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/a$a;", "LRl/a;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.a$a, reason: collision with other inner class name */
    public static final class C0972a implements InterfaceC15055a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0972a f14585a = new C0972a();
    }

    /* compiled from: CalendarSelectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/a$b;", "LRl/a;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.a$b */
    public static final class b implements InterfaceC15055a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14586a = new b();
    }

    /* compiled from: CalendarSelectAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRl/a$c;", "LRl/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.a$c */
    public static final /* data */ class c implements InterfaceC15055a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LocalDate f14587a;

        public c(@k LocalDate localDate) {
            this.f14587a = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14587a, ((c) obj).f14587a);
        }

        public final int hashCode() {
            return this.f14587a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.t(new StringBuilder("DayItemClick(selectedDate="), this.f14587a, ')');
        }
    }

    /* compiled from: CalendarSelectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/a$d;", "LRl/a;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.a$d */
    public static final class d implements InterfaceC15055a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f14588a = new d();
    }

    /* compiled from: CalendarSelectAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/a$e;", "LRl/a;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.a$e */
    public static final class e implements InterfaceC15055a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f14589a = new e();
    }
}
