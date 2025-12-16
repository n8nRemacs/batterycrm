package jy;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EditAddressOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Ljy/c;", "", "a", "b", "c", "d", "e", "f", "Ljy/c$a;", "Ljy/c$b;", "Ljy/c$c;", "Ljy/c$d;", "Ljy/c$e;", "Ljy/c$f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42445c {

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/c$a;", "Ljy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$a */
    public static final /* data */ class a implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405923a;

        public a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f405923a == ((a) obj).f405923a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405923a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LeaveScreenWithResult(hasChanged="), this.f405923a, ')');
        }

        public a(boolean z12) {
            this.f405923a = z12;
        }

        public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/c$b;", "Ljy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$b */
    public static final /* data */ class b implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Object f405924a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<Integer> f405925b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f405926c;

        public b(@l List<Integer> list, @l List<Integer> list2, @k String str) {
            this.f405924a = list;
            this.f405925b = list2;
            this.f405926c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f405924a, bVar.f405924a) && L.f(this.f405925b, bVar.f405925b) && L.f(this.f405926c, bVar.f405926c);
        }

        public final int hashCode() {
            Object obj = this.f405924a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            List<Integer> list = this.f405925b;
            return this.f405926c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDaysPicker(selectedDays=");
            sb2.append(this.f405924a);
            sb2.append(", unavailableDays=");
            sb2.append(this.f405925b);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405926c, ')');
        }
    }

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/c$c;", "Ljy/c;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$c, reason: collision with other inner class name */
    public static final class C11593c implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11593c f405927a = new C11593c();
    }

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/c$d;", "Ljy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$d */
    public static final /* data */ class d implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TimeIntervalPicker.Mode f405928a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final TimeInterval f405929b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f405930c;

        public d(@k TimeIntervalPicker.Mode mode, @l TimeInterval timeInterval, @k String str) {
            this.f405928a = mode;
            this.f405929b = timeInterval;
            this.f405930c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f405928a == dVar.f405928a && L.f(this.f405929b, dVar.f405929b) && L.f(this.f405930c, dVar.f405930c);
        }

        public final int hashCode() {
            int iHashCode = this.f405928a.hashCode() * 31;
            TimeInterval timeInterval = this.f405929b;
            return this.f405930c.hashCode() + ((iHashCode + (timeInterval == null ? 0 : timeInterval.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenTimeIntervalPicker(mode=");
            sb2.append(this.f405928a);
            sb2.append(", timeInterval=");
            sb2.append(this.f405929b);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405930c, ')');
        }
    }

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/c$e;", "Ljy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$e */
    public static final /* data */ class e implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f405931a;

        public e(@k ApiException apiException) {
            this.f405931a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f405931a.equals(((e) obj).f405931a);
        }

        public final int hashCode() {
            return this.f405931a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f405931a, ')');
        }
    }

    /* compiled from: EditAddressOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/c$f;", "Ljy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.c$f */
    public static final /* data */ class f implements InterfaceC42445c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405932a;

        public f(@k String str) {
            this.f405932a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f405932a, ((f) obj).f405932a);
        }

        public final int hashCode() {
            return this.f405932a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(message="), this.f405932a, ')');
        }
    }
}
