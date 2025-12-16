package com.avito.android.user_address.map.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import kotlin.Metadata;

/* compiled from: UserAddressMapMviAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "Lcom/avito/android/user_address/map/mvi/A$a;", "Lcom/avito/android/user_address/map/mvi/A$h;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface A {

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$a;", "Lcom/avito/android/user_address/map/mvi/A;", "Lcom/avito/android/user_address/map/mvi/A$b;", "Lcom/avito/android/user_address/map/mvi/A$s;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends A {
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$b;", "Lcom/avito/android/user_address/map/mvi/A$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f307626a = new b();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$c;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements l {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "AddressInputClickedEditAddressMapMode(address=null)";
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$d;", "Lcom/avito/android/user_address/map/mvi/A$h;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307627a;

        public d(@Y61.k String str) {
            this.f307627a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f307627a, ((d) obj).f307627a);
        }

        public final int hashCode() {
            return this.f307627a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddressInputClickedMap(address="), this.f307627a, ')');
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$e;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocationPickerAddressType f307628a;

        public e(@Y61.k LocationPickerAddressType locationPickerAddressType) {
            this.f307628a = locationPickerAddressType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f307628a == ((e) obj).f307628a;
        }

        public final int hashCode() {
            return this.f307628a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AddressTypeChangedMap(addressType=" + this.f307628a + ')';
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$f;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307629a;

        public f(@Y61.k String str) {
            this.f307629a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.L.f(this.f307629a, ((f) obj).f307629a);
        }

        public final int hashCode() {
            return this.f307629a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AppartmentTextChanged(appartment="), this.f307629a, ')');
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$g;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307630a;

        public g(@Y61.k String str) {
            this.f307630a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.L.f(this.f307630a, ((g) obj).f307630a);
        }

        public final int hashCode() {
            return this.f307630a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CommentTextChanged(comment="), this.f307630a, ')');
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$h;", "Lcom/avito/android/user_address/map/mvi/A;", "Lcom/avito/android/user_address/map/mvi/A$d;", "Lcom/avito/android/user_address/map/mvi/A$i;", "Lcom/avito/android/user_address/map/mvi/A$n;", "Lcom/avito/android/user_address/map/mvi/A$o;", "Lcom/avito/android/user_address/map/mvi/A$q;", "Lcom/avito/android/user_address/map/mvi/A$r;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h extends A {
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$i;", "Lcom/avito/android/user_address/map/mvi/A$h;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f307631a = new i();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$j;", "Lcom/avito/android/user_address/map/mvi/A$l;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f307632a = new j();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$k;", "Lcom/avito/android/user_address/map/mvi/A$l;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f307633a = new k();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$l;", "Lcom/avito/android/user_address/map/mvi/A;", "Lcom/avito/android/user_address/map/mvi/A$c;", "Lcom/avito/android/user_address/map/mvi/A$e;", "Lcom/avito/android/user_address/map/mvi/A$f;", "Lcom/avito/android/user_address/map/mvi/A$g;", "Lcom/avito/android/user_address/map/mvi/A$j;", "Lcom/avito/android/user_address/map/mvi/A$k;", "Lcom/avito/android/user_address/map/mvi/A$m;", "Lcom/avito/android/user_address/map/mvi/A$p;", "Lcom/avito/android/user_address/map/mvi/A$t;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface l extends A {
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$m;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307634a;

        public m(@Y61.k String str) {
            this.f307634a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.L.f(this.f307634a, ((m) obj).f307634a);
        }

        public final int hashCode() {
            return this.f307634a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EntranceTextChanged(entrance="), this.f307634a, ')');
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$n;", "Lcom/avito/android/user_address/map/mvi/A$h;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f307635a = new n();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$o;", "Lcom/avito/android/user_address/map/mvi/A$h;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f307636a = new o();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$p;", "Lcom/avito/android/user_address/map/mvi/A$l;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307637a;

        public p(@Y61.k String str) {
            this.f307637a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && kotlin.jvm.internal.L.f(this.f307637a, ((p) obj).f307637a);
        }

        public final int hashCode() {
            return this.f307637a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FloorTextChanged(floor="), this.f307637a, ')');
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$q;", "Lcom/avito/android/user_address/map/mvi/A$h;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class q implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f307638a = new q();
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$r;", "Lcom/avito/android/user_address/map/mvi/A$h;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoMapCameraPosition f307639a;

        public r(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
            this.f307639a = avitoMapCameraPosition;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && kotlin.jvm.internal.L.f(this.f307639a, ((r) obj).f307639a);
        }

        public final int hashCode() {
            return this.f307639a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MapStopScrolling(cameraPosition=" + this.f307639a + ')';
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$s;", "Lcom/avito/android/user_address/map/mvi/A$a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f307640a = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -2090248055;
        }

        @Y61.k
        public final String toString() {
            return "SaveSellerNewAddressClicked";
        }
    }

    /* compiled from: UserAddressMapMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/A$t;", "Lcom/avito/android/user_address/map/mvi/A$l;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class t implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f307641a = new t();
    }
}
