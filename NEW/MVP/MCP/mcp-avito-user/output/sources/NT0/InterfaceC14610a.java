package Nt0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleRepetitionAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LNt0/a;", "", "a", "b", "c", "d", "e", "f", "LNt0/a$a;", "LNt0/a$b;", "LNt0/a$c;", "LNt0/a$d;", "LNt0/a$e;", "LNt0/a$f;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14610a {

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNt0/a$a;", "LNt0/a;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$a, reason: collision with other inner class name */
    public static final class C0768a implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0768a f11788a = new C0768a();
    }

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNt0/a$b;", "LNt0/a;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$b */
    public static final class b implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11789a = new b();
    }

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNt0/a$c;", "LNt0/a;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$c */
    public static final /* data */ class c implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.service_booking_calendar.view.day.d f11790a;

        public c(@k com.avito.android.service_booking_calendar.view.day.d dVar) {
            this.f11790a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11790a, ((c) obj).f11790a);
        }

        public final int hashCode() {
            return this.f11790a.hashCode();
        }

        @k
        public final String toString() {
            return "OnClickDay(day=" + this.f11790a + ')';
        }
    }

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNt0/a$d;", "LNt0/a;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$d */
    public static final /* data */ class d implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f11791a;

        public d() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f11791a == ((d) obj).f11791a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11791a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnClickSave(fromDialog="), this.f11791a, ')');
        }

        public d(boolean z12) {
            this.f11791a = z12;
        }

        public /* synthetic */ d(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNt0/a$e;", "LNt0/a;", "<init>", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$e */
    public static final class e implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f11792a = new e();
    }

    /* compiled from: ScheduleRepetitionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNt0/a$f;", "LNt0/a;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nt0.a$f */
    public static final /* data */ class f implements InterfaceC14610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11793a;

        public f(@k String str) {
            this.f11793a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f11793a, ((f) obj).f11793a);
        }

        public final int hashCode() {
            return this.f11793a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSaveDialogShown(fromPage="), this.f11793a, ')');
        }
    }
}
