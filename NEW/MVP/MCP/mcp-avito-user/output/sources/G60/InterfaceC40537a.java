package g60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectBusinessVrfAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lg60/a;", "", "a", "b", "c", "d", "e", "f", "Lg60/a$a;", "Lg60/a$b;", "Lg60/a$c;", "Lg60/a$d;", "Lg60/a$e;", "Lg60/a$f;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40537a {

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/a$a;", "Lg60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$a, reason: collision with other inner class name */
    public static final class C11190a implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11190a f396287a = new C11190a();
    }

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/a$b;", "Lg60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$b */
    public static final class b implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f396288a = new b();
    }

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg60/a$c;", "Lg60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$c */
    public static final /* data */ class c implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f396289a;

        public c() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396289a, ((c) obj).f396289a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f396289a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CancelClick(deepLink="), this.f396289a, ')');
        }

        public c(DeepLink deepLink, int i12, C42822w c42822w) {
            this.f396289a = (i12 & 1) != 0 ? null : deepLink;
        }
    }

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg60/a$d;", "Lg60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$d */
    public static final /* data */ class d implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f396290a;

        public d(@l Integer num) {
            this.f396290a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396290a, ((d) obj).f396290a);
        }

        public final int hashCode() {
            Integer num = this.f396290a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ItemClick(userIdFrom="), this.f396290a, ')');
        }
    }

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg60/a$e;", "Lg60/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$e */
    public static final /* data */ class e implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396291a;

        public e(@k String str) {
            this.f396291a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396291a, ((e) obj).f396291a);
        }

        public final int hashCode() {
            return this.f396291a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NewSearch(text="), this.f396291a, ')');
        }
    }

    /* compiled from: SelectBusinessVrfAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/a$f;", "Lg60/a;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.a$f */
    public static final class f implements InterfaceC40537a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f396292a = new f();
    }
}
