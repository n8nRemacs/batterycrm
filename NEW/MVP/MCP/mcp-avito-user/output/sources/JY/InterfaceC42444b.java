package jy;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditAddressInternalAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Ljy/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "Ljy/b$a;", "Ljy/b$b;", "Ljy/b$c;", "Ljy/b$d;", "Ljy/b$e;", "Ljy/b$f;", "Ljy/b$g;", "Ljy/b$h;", "Ljy/b$i;", "Ljy/b$j;", "Ljy/b$k;", "Ljy/b$l;", "Ljy/b$m;", "Ljy/b$n;", "Ljy/b$o;", "Ljy/b$p;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42444b {

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/b$a;", "Ljy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$a */
    public static final class a implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f405899a = new a();

        @Y61.k
        public final String toString() {
            return "AddSchedule - internal";
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$b;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11592b implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final TimeInterval f405900a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f405901b;

        public C11592b(@Y61.l TimeInterval timeInterval, @Y61.k String str) {
            this.f405900a = timeInterval;
            this.f405901b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11592b)) {
                return false;
            }
            C11592b c11592b = (C11592b) obj;
            return L.f(this.f405900a, c11592b.f405900a) && L.f(this.f405901b, c11592b.f405901b);
        }

        public final int hashCode() {
            TimeInterval timeInterval = this.f405900a;
            return this.f405901b.hashCode() + ((timeInterval == null ? 0 : timeInterval.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakTimeIntervalUpdate(selectedInterval=");
            sb2.append(this.f405900a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405901b, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$c;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$c */
    public static final /* data */ class c implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f405902a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ExtendedProfilesSettingsAddress f405903b;

        public c(@Y61.k String str, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f405902a = str;
            this.f405903b = extendedProfilesSettingsAddress;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f405902a, cVar.f405902a) && L.f(this.f405903b, cVar.f405903b);
        }

        public final int hashCode() {
            int iHashCode = this.f405902a.hashCode() * 31;
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = this.f405903b;
            return iHashCode + (extendedProfilesSettingsAddress == null ? 0 : extendedProfilesSettingsAddress.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "InitState(fieldName=" + this.f405902a + ", address=" + this.f405903b + ')';
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$d;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$d */
    public static final /* data */ class d implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405904a;

        public d(boolean z12) {
            this.f405904a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f405904a == ((d) obj).f405904a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405904a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("LeaveScreenWithResult(hasChanged="), this.f405904a, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/b$e;", "Ljy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$e */
    public static final class e implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f405905a = new e();

        @Y61.k
        public final String toString() {
            return "LocationCleared - internal";
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/b$f;", "Ljy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$f */
    public static final class f implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f405906a = new f();

        @Y61.k
        public final String toString() {
            return "LocationClicked - internal";
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$g;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$g */
    public static final /* data */ class g implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressParameter.Value f405907a;

        public g(@Y61.k AddressParameter.Value value) {
            this.f405907a = value;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f405907a, ((g) obj).f405907a);
        }

        public final int hashCode() {
            return this.f405907a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationUpdate(address=" + this.f405907a + ')';
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$h;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$h */
    public static final /* data */ class h implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Integer> f405908a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f405909b;

        public h(@Y61.k List<Integer> list, @Y61.k String str) {
            this.f405908a = list;
            this.f405909b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f405908a, hVar.f405908a) && L.f(this.f405909b, hVar.f405909b);
        }

        public final int hashCode() {
            return this.f405909b.hashCode() + (this.f405908a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDaysUpdate(days=");
            sb2.append(this.f405908a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405909b, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$i;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$i */
    public static final /* data */ class i implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.edit_address.adapter.schedule.a f405910a;

        public i(@Y61.k com.avito.android.edit_address.adapter.schedule.a aVar) {
            this.f405910a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f405910a, ((i) obj).f405910a);
        }

        public final int hashCode() {
            return this.f405910a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "RemoveScheduleClick(item=" + this.f405910a + ')';
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/b$j;", "Ljy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$j */
    public static final class j implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f405911a = new j();

        @Y61.k
        public final String toString() {
            return "SaveInProgress - internal";
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$k;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$k */
    public static final /* data */ class k implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TimeIntervalPicker.Mode f405912a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final TimeInterval f405913b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f405914c;

        public k(@Y61.k TimeIntervalPicker.Mode mode, @Y61.l TimeInterval timeInterval, @Y61.k String str) {
            this.f405912a = mode;
            this.f405913b = timeInterval;
            this.f405914c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f405912a == kVar.f405912a && L.f(this.f405913b, kVar.f405913b) && L.f(this.f405914c, kVar.f405914c);
        }

        public final int hashCode() {
            int iHashCode = this.f405912a.hashCode() * 31;
            TimeInterval timeInterval = this.f405913b;
            return this.f405914c.hashCode() + ((iHashCode + (timeInterval == null ? 0 : timeInterval.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectTime(mode=");
            sb2.append(this.f405912a);
            sb2.append(", timeInterval=");
            sb2.append(this.f405913b);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405914c, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$l;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$l */
    public static final /* data */ class l implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Object f405915a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<Integer> f405916b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f405917c;

        public l(@Y61.l List<Integer> list, @Y61.l List<Integer> list2, @Y61.k String str) {
            this.f405915a = list;
            this.f405916b = list2;
            this.f405917c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f405915a, lVar.f405915a) && L.f(this.f405916b, lVar.f405916b) && L.f(this.f405917c, lVar.f405917c);
        }

        public final int hashCode() {
            Object obj = this.f405915a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            List<Integer> list = this.f405916b;
            return this.f405917c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectWorkDays(selectedDays=");
            sb2.append(this.f405915a);
            sb2.append(", unavailableDays=");
            sb2.append(this.f405916b);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405917c, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$m;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$m */
    public static final /* data */ class m implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiException f405918a;

        public m(@Y61.k ApiException apiException) {
            this.f405918a = apiException;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f405918a.equals(((m) obj).f405918a);
        }

        public final int hashCode() {
            return this.f405918a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.q(new StringBuilder("ShowError(throwable="), this.f405918a, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$n;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$n */
    public static final /* data */ class n implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f405919a;

        public n(@Y61.k String str) {
            this.f405919a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f405919a, ((n) obj).f405919a);
        }

        public final int hashCode() {
            return this.f405919a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowIncorrectValuesError(message="), this.f405919a, ')');
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/b$o;", "Ljy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$o */
    public static final class o implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f405920a = new o();

        @Y61.k
        public final String toString() {
            return "ShowValidation - internal";
        }
    }

    /* compiled from: EditAddressInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/b$p;", "Ljy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.b$p */
    public static final /* data */ class p implements InterfaceC42444b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final TimeInterval f405921a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f405922b;

        public p(@Y61.l TimeInterval timeInterval, @Y61.k String str) {
            this.f405921a = timeInterval;
            this.f405922b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f405921a, pVar.f405921a) && L.f(this.f405922b, pVar.f405922b);
        }

        public final int hashCode() {
            TimeInterval timeInterval = this.f405921a;
            return this.f405922b.hashCode() + ((timeInterval == null ? 0 : timeInterval.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkTimeIntervalUpdate(selectedInterval=");
            sb2.append(this.f405921a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405922b, ')');
        }
    }
}
