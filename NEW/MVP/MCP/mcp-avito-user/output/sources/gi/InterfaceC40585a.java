package gI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LgI/a;", "", "a", "b", "c", "d", "e", "f", "g", "LgI/a$a;", "LgI/a$b;", "LgI/a$c;", "LgI/a$d;", "LgI/a$e;", "LgI/a$f;", "LgI/a$g;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40585a {

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgI/a$a;", "LgI/a;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11203a implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11203a f396421a = new C11203a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11203a);
        }

        public final int hashCode() {
            return -885079607;
        }

        @k
        public final String toString() {
            return "AcceptClick";
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgI/a$b;", "LgI/a;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$b */
    public static final /* data */ class b implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f396422a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1908389750;
        }

        @k
        public final String toString() {
            return "AddChildClick";
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgI/a$c;", "LgI/a;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$c */
    public static final /* data */ class c implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f396423a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1910422130;
        }

        @k
        public final String toString() {
            return "BackwardClick";
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgI/a$d;", "LgI/a;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$d */
    public static final /* data */ class d implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f396424a;

        public d(@l String str) {
            this.f396424a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396424a, ((d) obj).f396424a);
        }

        public final int hashCode() {
            String str = this.f396424a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChildAgePickerScrollTo(ageId="), this.f396424a, ')');
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgI/a$e;", "LgI/a;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$e */
    public static final /* data */ class e implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        public final int f396425a;

        public e(int i12) {
            this.f396425a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f396425a == ((e) obj).f396425a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f396425a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("GuestsCountUpdated(newValue="), this.f396425a, ')');
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgI/a$f;", "LgI/a;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$f */
    public static final /* data */ class f implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        public final int f396426a;

        public f(int i12) {
            this.f396426a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f396426a == ((f) obj).f396426a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f396426a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("RemoveChildClick(childId="), this.f396426a, ')');
        }
    }

    /* compiled from: GuestsSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgI/a$g;", "LgI/a;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gI.a$g */
    public static final /* data */ class g implements InterfaceC40585a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396427a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f396428b;

        public g(@k String str, boolean z12) {
            this.f396427a = str;
            this.f396428b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f396427a, gVar.f396427a) && this.f396428b == gVar.f396428b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396428b) + (this.f396427a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SwitcherClick(id=");
            sb2.append(this.f396427a);
            sb2.append(", value=");
            return r.x(sb2, this.f396428b, ')');
        }
    }
}
