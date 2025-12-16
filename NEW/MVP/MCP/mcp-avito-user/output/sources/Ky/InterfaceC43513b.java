package ky;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditBasicInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lky/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lky/b$a;", "Lky/b$b;", "Lky/b$c;", "Lky/b$d;", "Lky/b$e;", "Lky/b$f;", "Lky/b$g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ky.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC43513b {

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/b$a;", "Lky/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$a */
    public static final /* data */ class a implements InterfaceC43513b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f413312a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1464495893;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/b$b;", "Lky/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11766b implements InterfaceC43513b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f413313a;

        public C11766b(@l String str) {
            this.f413313a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11766b)) {
                return false;
            }
            C11766b c11766b = (C11766b) obj;
            c11766b.getClass();
            return L.f(this.f413313a, c11766b.f413313a);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(true) * 31;
            String str = this.f413313a;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseWithResult(isChanged=true, message="), this.f413313a, ')');
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/b$c;", "Lky/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$c */
    public static final /* data */ class c implements InterfaceC43513b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413314a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2065305122;
        }

        @k
        public final String toString() {
            return "OpenAvatarPicker";
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/b$d;", "Lky/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$d */
    public static final /* data */ class d implements InterfaceC43513b {

        /* renamed from: a, reason: collision with root package name */
        public final int f413315a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f413316b;

        public d(int i12, @l Integer num) {
            this.f413315a = i12;
            this.f413316b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f413315a == dVar.f413315a && L.f(this.f413316b, dVar.f413316b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f413315a) * 31;
            Integer num = this.f413316b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSellerTypeEditor(sellerTypeId=");
            sb2.append(this.f413315a);
            sb2.append(", sellerSubtypeId=");
            return s.j(sb2, this.f413316b, ')');
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/b$e;", "Lky/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$e */
    public static final /* data */ class e implements InterfaceC43513b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) * 31;
        }

        @k
        public final String toString() {
            return "SetResult(isChanged=true, message=null)";
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/b$f;", "Lky/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$f */
    public static final /* data */ class f implements InterfaceC43513b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f413317a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC43512a f413318b;

        public f(@k Throwable th2, @k InterfaceC43512a interfaceC43512a) {
            this.f413317a = th2;
            this.f413318b = interfaceC43512a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f413317a, fVar.f413317a) && L.f(this.f413318b, fVar.f413318b);
        }

        public final int hashCode() {
            return this.f413318b.hashCode() + (this.f413317a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f413317a + ", buttonAction=" + this.f413318b + ')';
        }
    }

    /* compiled from: EditBasicInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/b$g;", "Lky/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ky.b$g */
    public static final /* data */ class g implements InterfaceC43513b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(errorText=null)";
        }
    }
}
