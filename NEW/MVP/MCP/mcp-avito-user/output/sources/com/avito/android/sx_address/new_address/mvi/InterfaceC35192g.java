package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressMviAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/sx_address/new_address/mvi/g$a;", "Lcom/avito/android/sx_address/new_address/mvi/g$b;", "Lcom/avito/android/sx_address/new_address/mvi/g$c;", "Lcom/avito/android/sx_address/new_address/mvi/g$d;", "Lcom/avito/android/sx_address/new_address/mvi/g$e;", "Lcom/avito/android/sx_address/new_address/mvi/g$f;", "Lcom/avito/android/sx_address/new_address/mvi/g$g;", "Lcom/avito/android/sx_address/new_address/mvi/g$h;", "Lcom/avito/android/sx_address/new_address/mvi/g$i;", "Lcom/avito/android/sx_address/new_address/mvi/g$j;", "Lcom/avito/android/sx_address/new_address/mvi/g$k;", "Lcom/avito/android/sx_address/new_address/mvi/g$l;", "Lcom/avito/android/sx_address/new_address/mvi/g$m;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35192g {

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$a;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$a */
    public static final /* data */ class a implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f293778a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f293778a, ((a) obj).f293778a);
        }

        public final int hashCode() {
            String str = this.f293778a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddressCLicked(address="), this.f293778a, ')');
        }

        public a(@Y61.l String str) {
            this.f293778a = str;
        }

        public /* synthetic */ a(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$b;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$b */
    public static final /* data */ class b implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f293779a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -500780082;
        }

        @Y61.k
        public final String toString() {
            return "AddressClearClick";
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$c;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$c */
    public static final /* data */ class c implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f293780a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1734102368;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$d;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$d */
    public static final /* data */ class d implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f293781a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1540064348;
        }

        @Y61.k
        public final String toString() {
            return "ClickSave";
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$e;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$e */
    public static final /* data */ class e implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f293782a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WeekDay f293783b;

        public e(boolean z12, @Y61.k WeekDay weekDay) {
            this.f293782a = z12;
            this.f293783b = weekDay;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f293782a == eVar.f293782a && this.f293783b == eVar.f293783b;
        }

        public final int hashCode() {
            return this.f293783b.hashCode() + (Boolean.hashCode(this.f293782a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "DaySwitched(isEnabled=" + this.f293782a + ", day=" + this.f293783b + ')';
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$f;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$f */
    public static final /* data */ class f implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DetailItem f293784a;

        public f(@Y61.k DetailItem detailItem) {
            this.f293784a = detailItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f293784a, ((f) obj).f293784a);
        }

        public final int hashCode() {
            return this.f293784a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DetailsChanged(item=" + this.f293784a + ')';
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$g;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$g, reason: collision with other inner class name */
    public static final /* data */ class C8926g implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C8926g f293785a = new C8926g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C8926g);
        }

        public final int hashCode() {
            return 240634151;
        }

        @Y61.k
        public final String toString() {
            return "ErrorRetryClick";
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$h;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$h */
    public static final /* data */ class h implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f293786a;

        public h(boolean z12) {
            this.f293786a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f293786a == ((h) obj).f293786a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f293786a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("HideAddressChanged(value="), this.f293786a, ')');
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$i;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$i */
    public static final /* data */ class i implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293787a;

        public i(@Y61.k String str) {
            this.f293787a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f293787a, ((i) obj).f293787a);
        }

        public final int hashCode() {
            return this.f293787a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameChanged(newName="), this.f293787a, ')');
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$j;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$j */
    public static final /* data */ class j implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScheduleType f293788a;

        public j(@Y61.k ScheduleType scheduleType) {
            this.f293788a = scheduleType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f293788a == ((j) obj).f293788a;
        }

        public final int hashCode() {
            return this.f293788a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScheduleChanged(selectedSchedule=" + this.f293788a + ')';
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$k;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$k */
    public static final /* data */ class k implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sx_address.new_address.view.s f293789a;

        public k(@Y61.k com.avito.android.sx_address.new_address.view.s sVar) {
            this.f293789a = sVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f293789a, ((k) obj).f293789a);
        }

        public final int hashCode() {
            return this.f293789a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TimeChanged(clickInfo=" + this.f293789a + ')';
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$l;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$l */
    public static final /* data */ class l implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sx_address.new_address.view.s f293790a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WorkingHours.Day f293791b;

        public l(@Y61.k com.avito.android.sx_address.new_address.view.s sVar, @Y61.k WorkingHours.Day day) {
            this.f293790a = sVar;
            this.f293791b = day;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f293790a, lVar.f293790a) && L.f(this.f293791b, lVar.f293791b);
        }

        public final int hashCode() {
            return this.f293791b.hashCode() + (this.f293790a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "TimeClicked(clickInfo=" + this.f293790a + ", clickedDay=" + this.f293791b + ')';
        }
    }

    /* compiled from: SxNewAddressMviAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/g$m;", "Lcom/avito/android/sx_address/new_address/mvi/g;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.mvi.g$m */
    public static final /* data */ class m implements InterfaceC35192g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressType f293792a;

        public m(@Y61.k AddressType addressType) {
            this.f293792a = addressType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f293792a, ((m) obj).f293792a);
        }

        public final int hashCode() {
            return this.f293792a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TypeClicked(type=" + this.f293792a + ')';
        }
    }
}
