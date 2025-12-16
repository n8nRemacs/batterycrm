package QI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LQI/a;", "", "a", "b", "c", "d", "e", "LQI/a$a;", "LQI/a$b;", "LQI/a$c;", "LQI/a$d;", "LQI/a$e;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: EnterDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQI/a$a;", "LQI/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: QI.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0896a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0896a f13654a = new C0896a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0896a);
        }

        public final int hashCode() {
            return -1868789669;
        }

        @k
        public final String toString() {
            return "ApplyClick";
        }
    }

    /* compiled from: EnterDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQI/a$b;", "LQI/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13655a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1363765843;
        }

        @k
        public final String toString() {
            return "CancelClick";
        }
    }

    /* compiled from: EnterDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQI/a$c;", "LQI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f13656a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f13657b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f13658c;

        public c(@l String str, @l String str2, @l String str3) {
            this.f13656a = str;
            this.f13657b = str2;
            this.f13658c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f13656a, cVar.f13656a) && L.f(this.f13657b, cVar.f13657b) && L.f(this.f13658c, cVar.f13658c);
        }

        public final int hashCode() {
            String str = this.f13656a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f13657b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f13658c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputTextChange(inputId=");
            sb2.append(this.f13656a);
            sb2.append(", groupId=");
            sb2.append(this.f13657b);
            sb2.append(", newText=");
            return C22026a.c(sb2, this.f13658c, ')');
        }
    }

    /* compiled from: EnterDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQI/a$d;", "LQI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13659a;

        public d(boolean z12) {
            this.f13659a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f13659a == ((d) obj).f13659a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13659a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f13659a, ')');
        }
    }

    /* compiled from: EnterDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQI/a$e;", "LQI/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f13660a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1415887940;
        }

        @k
        public final String toString() {
            return "OutsideClick";
        }
    }
}
