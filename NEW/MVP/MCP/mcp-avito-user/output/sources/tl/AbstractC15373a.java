package Tl;

import AK.c;
import Y61.k;
import Y61.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LTl/a;", "", "<init>", "()V", "a", "b", "LTl/a$a;", "LTl/a$b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15373a {

    /* compiled from: CalendarItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTl/a$a;", "LTl/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tl.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1081a extends AbstractC15373a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LocalDate f15831a;

        public C1081a(@k LocalDate localDate) {
            super(null);
            this.f15831a = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1081a) && L.f(this.f15831a, ((C1081a) obj).f15831a);
        }

        public final int hashCode() {
            return this.f15831a.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("Empty(nextDate="), this.f15831a, ')');
        }
    }

    /* compiled from: CalendarItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTl/a$b;", "LTl/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tl.a$b */
    public static final /* data */ class b extends AbstractC15373a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LocalDate f15832a;

        public b(@k LocalDate localDate) {
            super(null);
            this.f15832a = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15832a, ((b) obj).f15832a);
        }

        public final int hashCode() {
            return this.f15832a.hashCode();
        }

        @k
        public final String toString() {
            return c.t(new StringBuilder("Item(date="), this.f15832a, ')');
        }
    }

    public /* synthetic */ AbstractC15373a(C42822w c42822w) {
        this();
    }

    public AbstractC15373a() {
    }
}
