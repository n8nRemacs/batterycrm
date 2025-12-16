package pz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nz0.C44494a;

/* compiled from: StrOrdersBuyerAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lpz0/a;", "", "a", "b", "c", "d", "e", "f", "Lpz0/a$a;", "Lpz0/a$b;", "Lpz0/a$c;", "Lpz0/a$d;", "Lpz0/a$e;", "Lpz0/a$f;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47170a {

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/a$a;", "Lpz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$a, reason: collision with other inner class name */
    public static final class C12299a implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12299a f428919a = new C12299a();
    }

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/a$b;", "Lpz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$b */
    public static final /* data */ class b implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f428920a;

        public b(@l DeepLink deepLink) {
            this.f428920a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428920a, ((b) obj).f428920a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f428920a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("EmptyButtonClick(deeplink="), this.f428920a, ')');
        }
    }

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/a$c;", "Lpz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$c */
    public static final class c implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428921a = new c();
    }

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/a$d;", "Lpz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$d */
    public static final /* data */ class d implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f428922a;

        public d(@l DeepLink deepLink) {
            this.f428922a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428922a, ((d) obj).f428922a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f428922a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OrderClick(deeplink="), this.f428922a, ')');
        }
    }

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/a$e;", "Lpz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$e */
    public static final /* data */ class e implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C44494a f428923a;

        public e(@k C44494a c44494a) {
            this.f428923a = c44494a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428923a, ((e) obj).f428923a);
        }

        public final int hashCode() {
            return this.f428923a.hashCode();
        }

        @k
        public final String toString() {
            return "PaginationButtonClick(paginationInfo=" + this.f428923a + ')';
        }
    }

    /* compiled from: StrOrdersBuyerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/a$f;", "Lpz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.a$f */
    public static final class f implements InterfaceC47170a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f428924a = new f();
    }
}
