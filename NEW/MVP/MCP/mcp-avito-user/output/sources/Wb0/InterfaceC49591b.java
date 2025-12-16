package wb0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile_phones.phones_list.X;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhonesListMviOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lwb0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lwb0/b$a;", "Lwb0/b$b;", "Lwb0/b$c;", "Lwb0/b$d;", "Lwb0/b$e;", "Lwb0/b$f;", "Lwb0/b$g;", "Lwb0/b$h;", "Lwb0/b$i;", "Lwb0/b$j;", "Lwb0/b$k;", "Lwb0/b$l;", "Lwb0/b$m;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC49591b {

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/b$a;", "Lwb0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$a */
    public static final class a implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f441652a = new a();
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$b;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12822b implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f441653a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f441654b;

        public C12822b(@Y61.k PrintableText printableText, @Y61.k Throwable th2) {
            this.f441653a = printableText;
            this.f441654b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12822b)) {
                return false;
            }
            C12822b c12822b = (C12822b) obj;
            return L.f(this.f441653a, c12822b.f441653a) && L.f(this.f441654b, c12822b.f441654b);
        }

        public final int hashCode() {
            return this.f441654b.hashCode() + (this.f441653a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorToast(text=");
            sb2.append(this.f441653a);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f441654b, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/b$c;", "Lwb0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$c */
    public static final class c implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f441655a = new c();
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/b$d;", "Lwb0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$d */
    public static final class d implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f441656a = new d();
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$e;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$e */
    public static final /* data */ class e implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeviceListItem f441657a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f441658b;

        public e(@Y61.k DeviceListItem deviceListItem, @Y61.k ArrayList arrayList) {
            this.f441657a = deviceListItem;
            this.f441658b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f441657a, eVar.f441657a) && L.f(this.f441658b, eVar.f441658b);
        }

        public final int hashCode() {
            return this.f441658b.hashCode() + (this.f441657a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeleteDeviceFragment(deviceToDelete=");
            sb2.append(this.f441657a);
            sb2.append(", devices=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f441658b, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$f;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$f */
    public static final /* data */ class f implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441659a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f441660b;

        public f(boolean z12, boolean z13) {
            this.f441659a = z12;
            this.f441660b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f441659a == fVar.f441659a && this.f441660b == fVar.f441660b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441660b) + (Boolean.hashCode(this.f441659a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenIacEnableBottomSheet(iacEnabled=");
            sb2.append(this.f441659a);
            sb2.append(", canChangeStateIacEnable=");
            return r.x(sb2, this.f441660b, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$g;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$g */
    public static final /* data */ class g implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f441661a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<PhoneListItem.Action> f441662b;

        public g(@Y61.k String str, @Y61.k List<PhoneListItem.Action> list) {
            this.f441661a = str;
            this.f441662b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f441661a, gVar.f441661a) && L.f(this.f441662b, gVar.f441662b);
        }

        public final int hashCode() {
            return this.f441662b.hashCode() + (this.f441661a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPhoneActionsSheet(phone=");
            sb2.append(this.f441661a);
            sb2.append(", actions=");
            return H.p(sb2, this.f441662b, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$h;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$h */
    public static final /* data */ class h implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<ScheduleOption> f441663a;

        public h(@Y61.k List<ScheduleOption> list) {
            this.f441663a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f441663a, ((h) obj).f441663a);
        }

        public final int hashCode() {
            return this.f441663a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("OpenSchedulePicker(options="), this.f441663a, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$i;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$i */
    public static final /* data */ class i implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final X f441664a;

        public i(@Y61.k X x12) {
            this.f441664a = x12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f441664a, ((i) obj).f441664a);
        }

        public final int hashCode() {
            return this.f441664a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenTimePicker(data=" + this.f441664a + ')';
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$j;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$j */
    public static final /* data */ class j implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f441665a;

        public j(@Y61.k Throwable th2) {
            this.f441665a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f441665a, ((j) obj).f441665a);
        }

        public final int hashCode() {
            return this.f441665a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowErrorToastOnTimePickerDialog(throwable="), this.f441665a, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$k;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$k */
    public static final /* data */ class k implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f441666a;

        public k(@Y61.k DeepLink deepLink) {
            this.f441666a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f441666a, ((k) obj).f441666a);
        }

        public final int hashCode() {
            return this.f441666a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ShowUxFeedback(link="), this.f441666a, ')');
        }
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwb0/b$l;", "Lwb0/b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$l */
    public static final class l implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f441667a = new l();
    }

    /* compiled from: PhonesListMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwb0/b$m;", "Lwb0/b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wb0.b$m */
    public static final /* data */ class m implements InterfaceC49591b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f441668a;

        public m(@Y61.k PrintableText printableText) {
            this.f441668a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f441668a, ((m) obj).f441668a);
        }

        public final int hashCode() {
            return this.f441668a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("SuccessToast(text="), this.f441668a, ')');
        }
    }
}
