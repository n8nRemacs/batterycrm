package wb0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.profile_phones.phones_list.Y;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhonesListMviAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lwb0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Lwb0/a$a;", "Lwb0/a$b;", "Lwb0/a$c;", "Lwb0/a$d;", "Lwb0/a$e;", "Lwb0/a$f;", "Lwb0/a$g;", "Lwb0/a$h;", "Lwb0/a$i;", "Lwb0/a$j;", "Lwb0/a$k;", "Lwb0/a$l;", "Lwb0/a$m;", "Lwb0/a$n;", "Lwb0/a$o;", "Lwb0/a$p;", "Lwb0/a$q;", "Lwb0/a$r;", "Lwb0/a$s;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49590a {

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$a;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$a, reason: collision with other inner class name */
    public static final class C12821a implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12821a f441632a = new C12821a();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$b;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$b */
    public static final /* data */ class b implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeviceListItem f441633a;

        public b(@Y61.k DeviceListItem deviceListItem) {
            this.f441633a = deviceListItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f441633a, ((b) obj).f441633a);
        }

        public final int hashCode() {
            return this.f441633a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DeleteDeviceSuccess(device=" + this.f441633a + ')';
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$c;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$c */
    public static final /* data */ class c implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeviceListItem f441634a;

        public c(@Y61.k DeviceListItem deviceListItem) {
            this.f441634a = deviceListItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f441634a, ((c) obj).f441634a);
        }

        public final int hashCode() {
            return this.f441634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DeviceClick(device=" + this.f441634a + ')';
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$d;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$d */
    public static final /* data */ class d implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441635a;

        public d(boolean z12) {
            this.f441635a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f441635a == ((d) obj).f441635a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441635a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("IacEnableChangedFromBottomSheet(iacChecked="), this.f441635a, ')');
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$e;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$e */
    public static final /* data */ class e implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441636a;

        public e(boolean z12) {
            this.f441636a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f441636a == ((e) obj).f441636a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441636a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("IacEnableSwitchChanged(iacChecked="), this.f441636a, ')');
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$f;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$f */
    public static final class f implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f441637a = new f();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$g;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$g */
    public static final class g implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f441638a = new g();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$h;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$h */
    public static final class h implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f441639a = new h();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$i;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$i */
    public static final /* data */ class i implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f441640a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PhoneListItem.Action f441641b;

        public i(@Y61.k String str, @Y61.k PhoneListItem.Action action) {
            this.f441640a = str;
            this.f441641b = action;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f441640a, iVar.f441640a) && L.f(this.f441641b, iVar.f441641b);
        }

        public final int hashCode() {
            return this.f441641b.hashCode() + (this.f441640a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "PhoneActionChosen(phone=" + this.f441640a + ", action=" + this.f441641b + ')';
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$j;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$j */
    public static final /* data */ class j implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhoneListItem f441642a;

        public j(@Y61.k PhoneListItem phoneListItem) {
            this.f441642a = phoneListItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f441642a, ((j) obj).f441642a);
        }

        public final int hashCode() {
            return this.f441642a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PhoneClick(phone=" + this.f441642a + ')';
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$k;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$k */
    public static final class k implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f441643a = new k();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$l;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$l */
    public static final /* data */ class l implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f441644a;

        public l(@Y61.l String str) {
            this.f441644a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f441644a, ((l) obj).f441644a);
        }

        public final int hashCode() {
            String str = this.f441644a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhonesStateChanged(message="), this.f441644a, ')');
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$m;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$m */
    public static final class m implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f441645a = new m();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$n;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$n */
    public static final class n implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f441646a = new n();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$o;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$o */
    public static final /* data */ class o implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScheduleOption f441647a;

        public o(@Y61.k ScheduleOption scheduleOption) {
            this.f441647a = scheduleOption;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f441647a, ((o) obj).f441647a);
        }

        public final int hashCode() {
            return this.f441647a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScheduleOptionClick(option=" + this.f441647a + ')';
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$p;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$p */
    public static final class p implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f441648a = new p();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$q;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$q */
    public static final /* data */ class q implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f441649a;

        public q(@Y61.k DeepLink deepLink) {
            this.f441649a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f441649a, ((q) obj).f441649a);
        }

        public final int hashCode() {
            return this.f441649a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ShowUxFeedback(link="), this.f441649a, ')');
        }
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/a$r;", "Lwb0/a;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$r */
    public static final class r implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f441650a = new r();
    }

    /* compiled from: PhonesListMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/a$s;", "Lwb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.a$s */
    public static final /* data */ class s implements InterfaceC49590a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y f441651a;

        public s(@Y61.k Y y12) {
            this.f441651a = y12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f441651a, ((s) obj).f441651a);
        }

        public final int hashCode() {
            return this.f441651a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TimePickerApply(pickerResult=" + this.f441651a + ')';
        }
    }
}
