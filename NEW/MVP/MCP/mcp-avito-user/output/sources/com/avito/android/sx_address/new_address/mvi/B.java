package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressMviInternalAction.kt */
@P
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Lcom/avito/android/sx_address/new_address/mvi/B$a;", "Lcom/avito/android/sx_address/new_address/mvi/B$b;", "Lcom/avito/android/sx_address/new_address/mvi/B$c;", "Lcom/avito/android/sx_address/new_address/mvi/B$d;", "Lcom/avito/android/sx_address/new_address/mvi/B$e;", "Lcom/avito/android/sx_address/new_address/mvi/B$f;", "Lcom/avito/android/sx_address/new_address/mvi/B$g;", "Lcom/avito/android/sx_address/new_address/mvi/B$h;", "Lcom/avito/android/sx_address/new_address/mvi/B$i;", "Lcom/avito/android/sx_address/new_address/mvi/B$j;", "Lcom/avito/android/sx_address/new_address/mvi/B$k;", "Lcom/avito/android/sx_address/new_address/mvi/B$l;", "Lcom/avito/android/sx_address/new_address/mvi/B$m;", "Lcom/avito/android/sx_address/new_address/mvi/B$n;", "Lcom/avito/android/sx_address/new_address/mvi/B$o;", "Lcom/avito/android/sx_address/new_address/mvi/B$p;", "Lcom/avito/android/sx_address/new_address/mvi/B$q;", "Lcom/avito/android/sx_address/new_address/mvi/B$r;", "Lcom/avito/android/sx_address/new_address/mvi/B$s;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class B {

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$a;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293677a;

        public a(@Y61.k String str) {
            super(null);
            this.f293677a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f293677a, ((a) obj).f293677a);
        }

        public final int hashCode() {
            return this.f293677a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddressNameChanged(newName="), this.f293677a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$b;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f293678a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2017124085;
        }

        @Y61.k
        public final String toString() {
            return "ClearAddress";
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$c;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f293679a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1752286626;
        }

        @Y61.k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$d;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends B {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f293680a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WeekDay f293681b;

        public d(boolean z12, @Y61.k WeekDay weekDay) {
            super(null);
            this.f293680a = z12;
            this.f293681b = weekDay;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f293680a == dVar.f293680a && this.f293681b == dVar.f293681b;
        }

        public final int hashCode() {
            return this.f293681b.hashCode() + (Boolean.hashCode(this.f293680a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "DaySwitched(isEnabled=" + this.f293680a + ", day=" + this.f293681b + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$e;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f293682a;

        public e(@Y61.k ArrayList arrayList) {
            super(null);
            this.f293682a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f293682a, ((e) obj).f293682a);
        }

        public final int hashCode() {
            return this.f293682a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("DetailChanged(updatedList="), this.f293682a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$f;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f293683a;

        public f(@Y61.l Throwable th2) {
            super(null);
            this.f293683a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f293683a, ((f) obj).f293683a);
        }

        public final int hashCode() {
            Throwable th2 = this.f293683a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f293683a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$g;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f293684a = new g();

        public g() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 747632120;
        }

        @Y61.k
        public final String toString() {
            return "ErrorRetryLoading";
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$h;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sx_address.new_address.view.s f293685a;

        public h(@Y61.k com.avito.android.sx_address.new_address.view.s sVar) {
            super(null);
            this.f293685a = sVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f293685a, ((h) obj).f293685a);
        }

        public final int hashCode() {
            return this.f293685a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FinishTimeChanging(clickInfo=" + this.f293685a + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$i;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState f293686a;

        public i(@Y61.k SxNewAddressMviState sxNewAddressMviState) {
            super(null);
            this.f293686a = sxNewAddressMviState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f293686a, ((i) obj).f293686a);
        }

        public final int hashCode() {
            return this.f293686a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FirstRender(state=" + this.f293686a + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$j;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends B {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f293687a;

        public j(boolean z12) {
            super(null);
            this.f293687a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f293687a == ((j) obj).f293687a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f293687a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("HideAddressChanged(value="), this.f293687a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$k;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f293688a;

        /* JADX WARN: Multi-variable type inference failed */
        public k() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f293688a, ((k) obj).f293688a);
        }

        public final int hashCode() {
            String str = this.f293688a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NavigateToSuggests(address="), this.f293688a, ')');
        }

        public k(@Y61.l String str) {
            super(null);
            this.f293688a = str;
        }

        public /* synthetic */ k(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$l;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f293689a;

        public l(@Y61.l Throwable th2) {
            super(null);
            this.f293689a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f293689a, ((l) obj).f293689a);
        }

        public final int hashCode() {
            Throwable th2 = this.f293689a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("NetworkError(throwable="), this.f293689a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$m;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final SxNewAddressMviViewState.ValidationError f293690a;

        public m(@Y61.l SxNewAddressMviViewState.ValidationError validationError) {
            super(null);
            this.f293690a = validationError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f293690a, ((m) obj).f293690a);
        }

        public final int hashCode() {
            SxNewAddressMviViewState.ValidationError validationError = this.f293690a;
            if (validationError == null) {
                return 0;
            }
            return validationError.f293747a.f293749c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Save(showError=" + this.f293690a + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$n;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n extends B {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f293691a;

        public n(boolean z12) {
            super(null);
            this.f293691a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f293691a == ((n) obj).f293691a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f293691a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SaveLoading(isLoading="), this.f293691a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$o;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScheduleType f293692a;

        public o(@Y61.k ScheduleType scheduleType) {
            super(null);
            this.f293692a = scheduleType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f293692a == ((o) obj).f293692a;
        }

        public final int hashCode() {
            return this.f293692a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ScheduleChanged(selectedSchedule=" + this.f293692a + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$p;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293693a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final FA0.f f293694b;

        public p(@Y61.k String str, @Y61.l FA0.f fVar) {
            super(null);
            this.f293693a = str;
            this.f293694b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f293693a, pVar.f293693a) && L.f(this.f293694b, pVar.f293694b);
        }

        public final int hashCode() {
            int iHashCode = this.f293693a.hashCode() * 31;
            FA0.f fVar = this.f293694b;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "SetAddNewScreenResult(address=" + this.f293693a + ", publishValue=" + this.f293694b + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$q;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293695a;

        public q(@Y61.k String str) {
            super(null);
            this.f293695a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f293695a, ((q) obj).f293695a);
        }

        public final int hashCode() {
            return this.f293695a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetEditScreenResult(address="), this.f293695a, ')');
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$r;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sx_address.new_address.view.s f293696a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WorkingHours.Day f293697b;

        public r(@Y61.k com.avito.android.sx_address.new_address.view.s sVar, @Y61.k WorkingHours.Day day) {
            super(null);
            this.f293696a = sVar;
            this.f293697b = day;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f293696a, rVar.f293696a) && L.f(this.f293697b, rVar.f293697b);
        }

        public final int hashCode() {
            return this.f293697b.hashCode() + (this.f293696a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "StartTimeChanging(clickInfo=" + this.f293696a + ", clickedDay=" + this.f293697b + ')';
        }
    }

    /* compiled from: SxNewAddressMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/B$s;", "Lcom/avito/android/sx_address/new_address/mvi/B;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s extends B {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressType f293698a;

        public s(@Y61.k AddressType addressType) {
            super(null);
            this.f293698a = addressType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f293698a, ((s) obj).f293698a);
        }

        public final int hashCode() {
            return this.f293698a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TypeChanged(type=" + this.f293698a + ')';
        }
    }

    public /* synthetic */ B(C42822w c42822w) {
        this();
    }

    public B() {
    }
}
