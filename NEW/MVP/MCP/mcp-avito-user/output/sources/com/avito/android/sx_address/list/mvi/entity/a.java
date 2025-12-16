package com.avito.android.sx_address.list.mvi.entity;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressListAction.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0082\u0001\u0014\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "Lcom/avito/android/sx_address/list/mvi/entity/a$a;", "Lcom/avito/android/sx_address/list/mvi/entity/a$b;", "Lcom/avito/android/sx_address/list/mvi/entity/a$c;", "Lcom/avito/android/sx_address/list/mvi/entity/a$d;", "Lcom/avito/android/sx_address/list/mvi/entity/a$e;", "Lcom/avito/android/sx_address/list/mvi/entity/a$f;", "Lcom/avito/android/sx_address/list/mvi/entity/a$g;", "Lcom/avito/android/sx_address/list/mvi/entity/a$h;", "Lcom/avito/android/sx_address/list/mvi/entity/a$i;", "Lcom/avito/android/sx_address/list/mvi/entity/a$j;", "Lcom/avito/android/sx_address/list/mvi/entity/a$k;", "Lcom/avito/android/sx_address/list/mvi/entity/a$l;", "Lcom/avito/android/sx_address/list/mvi/entity/a$m;", "Lcom/avito/android/sx_address/list/mvi/entity/a$n;", "Lcom/avito/android/sx_address/list/mvi/entity/a$o;", "Lcom/avito/android/sx_address/list/mvi/entity/a$p;", "Lcom/avito/android/sx_address/list/mvi/entity/a$q;", "Lcom/avito/android/sx_address/list/mvi/entity/a$r;", "Lcom/avito/android/sx_address/list/mvi/entity/a$s;", "Lcom/avito/android/sx_address/list/mvi/entity/a$t;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$a;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.list.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8903a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter f293257a;

        public C8903a(@Y61.k Filter filter) {
            this.f293257a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8903a) && this.f293257a == ((C8903a) obj).f293257a;
        }

        public final int hashCode() {
            return this.f293257a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AcceptFilter(selectedFilter=" + this.f293257a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$b;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f293258a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -716822127;
        }

        @Y61.k
        public final String toString() {
            return "AddAddressClick";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$c;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f293259a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 244722746;
        }

        @Y61.k
        public final String toString() {
            return "ClickAction";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$d;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressItem f293260a;

        public d(@Y61.k AddressItem addressItem) {
            this.f293260a = addressItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f293260a, ((d) obj).f293260a);
        }

        public final int hashCode() {
            return this.f293260a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ClickAddress(item=" + this.f293260a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$e;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f293261a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -89103381;
        }

        @Y61.k
        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$f;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f293262a;

        public f(@Y61.k DeepLink deepLink) {
            this.f293262a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f293262a, ((f) obj).f293262a);
        }

        public final int hashCode() {
            return this.f293262a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickBannerAction(link="), this.f293262a, ')');
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$g;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293263a;

        public g(@Y61.k String str) {
            this.f293263a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f293263a, ((g) obj).f293263a);
        }

        public final int hashCode() {
            return this.f293263a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseInfoBanner(type="), this.f293263a, ')');
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$h;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f293264a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1599181892;
        }

        @Y61.k
        public final String toString() {
            return "ErrorRetryClick";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$i;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f293265a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1483032756;
        }

        @Y61.k
        public final String toString() {
            return "FilterClick";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$j;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f293266a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -304517763;
        }

        @Y61.k
        public final String toString() {
            return "InnRestrictionClickOKEvent";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$k;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f293267a;

        public k(@Y61.k DeepLink deepLink) {
            this.f293267a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f293267a, ((k) obj).f293267a);
        }

        public final int hashCode() {
            return this.f293267a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenModalActionDialogClick(link="), this.f293267a, ')');
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$l;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressAddResult f293268a;

        public l(@Y61.k SxAddressAddResult sxAddressAddResult) {
            this.f293268a = sxAddressAddResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f293268a, ((l) obj).f293268a);
        }

        public final int hashCode() {
            return this.f293268a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedAddResult(value=" + this.f293268a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$m;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f293269a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 824747999;
        }

        @Y61.k
        public final String toString() {
            return "ReceivedCancel";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$n;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressDeleteResult f293270a;

        public n(@Y61.k SxAddressDeleteResult sxAddressDeleteResult) {
            this.f293270a = sxAddressDeleteResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f293270a, ((n) obj).f293270a);
        }

        public final int hashCode() {
            return this.f293270a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedDeleteResult(value=" + this.f293270a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$o;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressEditResult f293271a;

        public o(@Y61.k SxAddressEditResult sxAddressEditResult) {
            this.f293271a = sxAddressEditResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f293271a, ((o) obj).f293271a);
        }

        public final int hashCode() {
            return this.f293271a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedEditResult(value=" + this.f293271a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$p;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressRevalidateResult f293272a;

        public p(@Y61.k SxAddressRevalidateResult sxAddressRevalidateResult) {
            this.f293272a = sxAddressRevalidateResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f293272a, ((p) obj).f293272a);
        }

        public final int hashCode() {
            return this.f293272a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedRevalidateResult(value=" + this.f293272a + ')';
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$q;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f293273a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 79490862;
        }

        @Y61.k
        public final String toString() {
            return "ReceivedVideoVerificationResult";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$r;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f293274a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 343230609;
        }

        @Y61.k
        public final String toString() {
            return "ReceivedWebViewResult";
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$s;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293275a;

        public s(@Y61.k String str) {
            this.f293275a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f293275a, ((s) obj).f293275a);
        }

        public final int hashCode() {
            return this.f293275a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchTextChanged(text="), this.f293275a, ')');
        }
    }

    /* compiled from: SxAddressListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/a$t;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements a {

        /* renamed from: a, reason: collision with root package name */
        public final long f293276a;

        public t(long j12) {
            this.f293276a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f293276a == ((t) obj).f293276a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f293276a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("SubscriptionPurchased(timeout="), this.f293276a, ')');
        }
    }
}
