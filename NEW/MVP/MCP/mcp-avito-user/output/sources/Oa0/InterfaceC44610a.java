package oA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LoA0/a;", "", "a", "b", "c", "d", "e", "f", "LoA0/a$a;", "LoA0/a$b;", "LoA0/a$c;", "LoA0/a$d;", "LoA0/a$e;", "LoA0/a$f;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC44610a {

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/a$a;", "LoA0/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12166a implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f419471a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f419472b;

        public C12166a(@k String str, @l String str2) {
            this.f419471a = str;
            this.f419472b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12166a)) {
                return false;
            }
            C12166a c12166a = (C12166a) obj;
            return L.f(this.f419471a, c12166a.f419471a) && L.f(this.f419472b, c12166a.f419472b);
        }

        public final int hashCode() {
            int iHashCode = this.f419471a.hashCode() * 31;
            String str = this.f419472b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressClick(jsonWebToken=");
            sb2.append(this.f419471a);
            sb2.append(", addressId=");
            return C22026a.c(sb2, this.f419472b, ')');
        }
    }

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/a$b;", "LoA0/a;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$b */
    public static final /* data */ class b implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f419473a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 840657155;
        }

        @k
        public final String toString() {
            return "ApplyPressed";
        }
    }

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/a$c;", "LoA0/a;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$c */
    public static final /* data */ class c implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f419474a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -163169492;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/a$d;", "LoA0/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$d */
    public static final /* data */ class d implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f419475a;

        public d(@k String str) {
            this.f419475a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f419475a, ((d) obj).f419475a);
        }

        public final int hashCode() {
            return this.f419475a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QueryEmit(query="), this.f419475a, ')');
        }
    }

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoA0/a$e;", "LoA0/a;", "<init>", "()V", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$e */
    public static final /* data */ class e implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f419476a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1428646240;
        }

        @k
        public final String toString() {
            return "ReloadClick";
        }
    }

    /* compiled from: SuggestAddressesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoA0/a$f;", "LoA0/a;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oA0.a$f */
    public static final /* data */ class f implements InterfaceC44610a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f419477a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f419478b;

        public f(@l String str, @k String str2) {
            this.f419477a = str;
            this.f419478b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f419477a, fVar.f419477a) && L.f(this.f419478b, fVar.f419478b);
        }

        public final int hashCode() {
            String str = this.f419477a;
            return this.f419478b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedAddressClicked(jsonWebToken=");
            sb2.append(this.f419477a);
            sb2.append(", addressId=");
            return C22026a.c(sb2, this.f419478b, ')');
        }
    }
}
