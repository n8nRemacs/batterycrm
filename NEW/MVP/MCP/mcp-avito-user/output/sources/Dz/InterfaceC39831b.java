package dz;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response;
import com.avito.android.remote.model.TypedResult;
import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Ldz/b;", "", "a", "b", "c", "d", "e", "Ldz/b$a;", "Ldz/b$b;", "Ldz/b$c;", "Ldz/b$d;", "Ldz/b$e;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dz.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39831b {

    /* compiled from: EmployeeModeInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz/b$a;", "Ldz/b;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.b$a */
    public static final /* data */ class a implements InterfaceC39831b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394192a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 593391407;
        }

        @k
        public final String toString() {
            return "EraseFutureChanges";
        }
    }

    /* compiled from: EmployeeModeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/b$b;", "Ldz/b;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11047b implements InterfaceC39831b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final TypedResult<com.avito.android.employee_mode_impl.manager.domain.d> f394193a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final TypedResult<ApiMessengerInfoV2Response> f394194b;

        /* renamed from: c, reason: collision with root package name */
        public final long f394195c;

        public C11047b(@l TypedResult<com.avito.android.employee_mode_impl.manager.domain.d> typedResult, @l TypedResult<ApiMessengerInfoV2Response> typedResult2, long j12) {
            this.f394193a = typedResult;
            this.f394194b = typedResult2;
            this.f394195c = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11047b)) {
                return false;
            }
            C11047b c11047b = (C11047b) obj;
            return L.f(this.f394193a, c11047b.f394193a) && L.f(this.f394194b, c11047b.f394194b) && this.f394195c == c11047b.f394195c;
        }

        public final int hashCode() {
            TypedResult<com.avito.android.employee_mode_impl.manager.domain.d> typedResult = this.f394193a;
            int iHashCode = (typedResult == null ? 0 : typedResult.hashCode()) * 31;
            TypedResult<ApiMessengerInfoV2Response> typedResult2 = this.f394194b;
            return Long.hashCode(this.f394195c) + ((iHashCode + (typedResult2 != null ? typedResult2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoChanged(info=");
            sb2.append(this.f394193a);
            sb2.append(", messengerInfo=");
            sb2.append(this.f394194b);
            sb2.append(", updateTime=");
            return r.u(sb2, this.f394195c, ')');
        }
    }

    /* compiled from: EmployeeModeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/b$c;", "Ldz/b;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.b$c */
    public static final /* data */ class c implements InterfaceC39831b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394196a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f394197b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC42452c f394198c;

        public c(@k String str, @k String str2, @k InterfaceC42452c interfaceC42452c) {
            this.f394196a = str;
            this.f394197b = str2;
            this.f394198c = interfaceC42452c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f394196a, cVar.f394196a) && L.f(this.f394197b, cVar.f394197b) && L.f(this.f394198c, cVar.f394198c);
        }

        public final int hashCode() {
            return this.f394198c.hashCode() + H.d(this.f394196a.hashCode() * 31, 31, this.f394197b);
        }

        @k
        public final String toString() {
            return "ProfileChange(profileId=" + this.f394196a + ", profileHashId=" + this.f394197b + ", storedInfo=" + this.f394198c + ')';
        }
    }

    /* compiled from: EmployeeModeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/b$d;", "Ldz/b;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.b$d */
    public static final /* data */ class d implements InterfaceC39831b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394199a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC42451b f394200b;

        public d(@k String str, @k InterfaceC42451b interfaceC42451b) {
            this.f394199a = str;
            this.f394200b = interfaceC42451b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f394199a, dVar.f394199a) && L.f(this.f394200b, dVar.f394200b);
        }

        public final int hashCode() {
            return this.f394200b.hashCode() + (this.f394199a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "StoreFutureProfileChange(futureProfileId=" + this.f394199a + ", futureMode=" + this.f394200b + ')';
        }
    }

    /* compiled from: EmployeeModeInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/b$e;", "Ldz/b;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.b$e */
    public static final /* data */ class e implements InterfaceC39831b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC42451b f394201a;

        public e(@k InterfaceC42451b interfaceC42451b) {
            this.f394201a = interfaceC42451b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f394201a, ((e) obj).f394201a);
        }

        public final int hashCode() {
            return this.f394201a.hashCode();
        }

        @k
        public final String toString() {
            return "SwitchMode(targetMode=" + this.f394201a + ')';
        }
    }
}
