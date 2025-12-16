package cu;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcu/a;", "", "a", "b", "c", "d", "Lcu/a$a;", "Lcu/a$b;", "Lcu/a$c;", "Lcu/a$d;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC39413a {

    /* compiled from: DasCalendarAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/a$a;", "Lcu/a;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10993a implements InterfaceC39413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C10993a f392982a = new C10993a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C10993a);
        }

        public final int hashCode() {
            return -831340473;
        }

        @k
        public final String toString() {
            return "ClearButtonClick";
        }
    }

    /* compiled from: DasCalendarAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/a$b;", "Lcu/a;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.a$b */
    public static final /* data */ class b implements InterfaceC39413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f392983a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -670776242;
        }

        @k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: DasCalendarAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu/a$c;", "Lcu/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.a$c */
    public static final /* data */ class c implements InterfaceC39413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f392984a;

        public c(@k Date date) {
            this.f392984a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f392984a, ((c) obj).f392984a);
        }

        public final int hashCode() {
            return this.f392984a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("DayClick(date="), this.f392984a, ')');
        }
    }

    /* compiled from: DasCalendarAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/a$d;", "Lcu/a;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cu.a$d */
    public static final /* data */ class d implements InterfaceC39413a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f392985a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 824709948;
        }

        @k
        public final String toString() {
            return "SelectButtonClick";
        }
    }
}
