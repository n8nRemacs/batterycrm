package com.avito.android.sx_address.new_address.mvi;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressMviOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/sx_address/new_address/mvi/C$a;", "Lcom/avito/android/sx_address/new_address/mvi/C$b;", "Lcom/avito/android/sx_address/new_address/mvi/C$c;", "Lcom/avito/android/sx_address/new_address/mvi/C$d;", "Lcom/avito/android/sx_address/new_address/mvi/C$e;", "Lcom/avito/android/sx_address/new_address/mvi/C$f;", "Lcom/avito/android/sx_address/new_address/mvi/C$g;", "Lcom/avito/android/sx_address/new_address/mvi/C$h;", "Lcom/avito/android/sx_address/new_address/mvi/C$i;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface C {

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$a;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f293699a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1470620906;
        }

        @Y61.k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$b;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviViewState f293700a;

        public b(@Y61.k SxNewAddressMviViewState sxNewAddressMviViewState) {
            this.f293700a = sxNewAddressMviViewState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f293700a, ((b) obj).f293700a);
        }

        public final int hashCode() {
            return this.f293700a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "InitRender(state=" + this.f293700a + ')';
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$c;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f293701a;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f293701a, ((c) obj).f293701a);
        }

        public final int hashCode() {
            String str = this.f293701a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NavigateToEdit(address="), this.f293701a, ')');
        }

        public c(@Y61.l String str) {
            this.f293701a = str;
        }

        public /* synthetic */ c(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$d;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f293702a;

        public d(@Y61.l Throwable th2) {
            this.f293702a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f293702a, ((d) obj).f293702a);
        }

        public final int hashCode() {
            Throwable th2 = this.f293702a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("NetworkError(error="), this.f293702a, ')');
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$e;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.sx_address.new_address.view.s f293703a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WorkingHours.Day f293704b;

        public e(@Y61.k com.avito.android.sx_address.new_address.view.s sVar, @Y61.k WorkingHours.Day day) {
            this.f293703a = sVar;
            this.f293704b = day;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f293703a, eVar.f293703a) && L.f(this.f293704b, eVar.f293704b);
        }

        public final int hashCode() {
            return this.f293704b.hashCode() + (this.f293703a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "OpenTimePicker(info=" + this.f293703a + ", clickedDay=" + this.f293704b + ')';
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$f;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements C {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Retry(lastViewState=null)";
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$g;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final SxNewAddressMviViewState.ValidationError f293705a;

        public g(@Y61.l SxNewAddressMviViewState.ValidationError validationError) {
            this.f293705a = validationError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f293705a, ((g) obj).f293705a);
        }

        public final int hashCode() {
            SxNewAddressMviViewState.ValidationError validationError = this.f293705a;
            if (validationError == null) {
                return 0;
            }
            return validationError.f293747a.f293749c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Save(showError=" + this.f293705a + ')';
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$h;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293706a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final FA0.f f293707b;

        public h(@Y61.k String str, @Y61.l FA0.f fVar) {
            this.f293706a = str;
            this.f293707b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f293706a, hVar.f293706a) && L.f(this.f293707b, hVar.f293707b);
        }

        public final int hashCode() {
            int iHashCode = this.f293706a.hashCode() * 31;
            FA0.f fVar = this.f293707b;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "SetAddNewScreenResult(address=" + this.f293706a + ", publishValue=" + this.f293707b + ')';
        }
    }

    /* compiled from: SxNewAddressMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/C$i;", "Lcom/avito/android/sx_address/new_address/mvi/C;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements C {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293708a;

        public i(@Y61.k String str) {
            this.f293708a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f293708a, ((i) obj).f293708a);
        }

        public final int hashCode() {
            return this.f293708a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetEditScreenResult(address="), this.f293708a, ')');
        }
    }
}
