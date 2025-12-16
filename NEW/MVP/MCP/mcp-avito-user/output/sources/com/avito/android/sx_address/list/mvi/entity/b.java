package com.avito.android.sx_address.list.mvi.entity;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.ActionModalDialogContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.domain.InfoBannerData;
import com.avito.android.sx_address.list.domain.ScreenData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressListInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Lcom/avito/android/sx_address/list/mvi/entity/b$a;", "Lcom/avito/android/sx_address/list/mvi/entity/b$b;", "Lcom/avito/android/sx_address/list/mvi/entity/b$c;", "Lcom/avito/android/sx_address/list/mvi/entity/b$d;", "Lcom/avito/android/sx_address/list/mvi/entity/b$e;", "Lcom/avito/android/sx_address/list/mvi/entity/b$f;", "Lcom/avito/android/sx_address/list/mvi/entity/b$g;", "Lcom/avito/android/sx_address/list/mvi/entity/b$h;", "Lcom/avito/android/sx_address/list/mvi/entity/b$i;", "Lcom/avito/android/sx_address/list/mvi/entity/b$j;", "Lcom/avito/android/sx_address/list/mvi/entity/b$k;", "Lcom/avito/android/sx_address/list/mvi/entity/b$l;", "Lcom/avito/android/sx_address/list/mvi/entity/b$m;", "Lcom/avito/android/sx_address/list/mvi/entity/b$n;", "Lcom/avito/android/sx_address/list/mvi/entity/b$o;", "Lcom/avito/android/sx_address/list/mvi/entity/b$p;", "Lcom/avito/android/sx_address/list/mvi/entity/b$q;", "Lcom/avito/android/sx_address/list/mvi/entity/b$r;", "Lcom/avito/android/sx_address/list/mvi/entity/b$s;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$a;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f293277a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 675907761;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$b;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.list.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C8904b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293278a;

        public C8904b(@Y61.k String str) {
            this.f293278a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8904b) && L.f(this.f293278a, ((C8904b) obj).f293278a);
        }

        public final int hashCode() {
            return this.f293278a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseInfoBanner(type="), this.f293278a, ')');
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$c;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f293279a;

        public c(@Y61.k Throwable th2) {
            this.f293279a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f293279a, ((c) obj).f293279a);
        }

        public final int hashCode() {
            return this.f293279a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f293279a, ')');
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$d;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f293280a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2030007917;
        }

        @Y61.k
        public final String toString() {
            return "HideLoading";
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$e;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f293281a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1659729764;
        }

        @Y61.k
        public final String toString() {
            return "OpenAddAddress";
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$f;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter f293282a;

        public f(@Y61.k Filter filter) {
            this.f293282a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f293282a == ((f) obj).f293282a;
        }

        public final int hashCode() {
            return this.f293282a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenFilterMenu(selectedFilter=" + this.f293282a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$g;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ArrayList f293283a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Filter f293284b;

        public g(@Y61.l ArrayList arrayList, @Y61.k Filter filter) {
            this.f293283a = arrayList;
            this.f293284b = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f293283a, gVar.f293283a) && this.f293284b == gVar.f293284b;
        }

        public final int hashCode() {
            ArrayList arrayList = this.f293283a;
            return this.f293284b.hashCode() + ((arrayList == null ? 0 : arrayList.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ReRenderFilteredList(addresses=" + this.f293283a + ", selectedFilter=" + this.f293284b + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$h;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ArrayList f293285a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f293286b;

        public h(@Y61.l ArrayList arrayList, @Y61.k String str) {
            this.f293285a = arrayList;
            this.f293286b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f293285a, hVar.f293285a) && L.f(this.f293286b, hVar.f293286b);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f293285a;
            return this.f293286b.hashCode() + ((arrayList == null ? 0 : arrayList.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReRenderSearchList(addresses=");
            sb2.append(this.f293285a);
            sb2.append(", searchInput=");
            return C22026a.c(sb2, this.f293286b, ')');
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$i;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressAddResult f293287a;

        public i(@Y61.k SxAddressAddResult sxAddressAddResult) {
            this.f293287a = sxAddressAddResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f293287a, ((i) obj).f293287a);
        }

        public final int hashCode() {
            return this.f293287a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedAddResult(value=" + this.f293287a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressDeleteResult f293288a;

        public j(@Y61.k SxAddressDeleteResult sxAddressDeleteResult) {
            this.f293288a = sxAddressDeleteResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f293288a, ((j) obj).f293288a);
        }

        public final int hashCode() {
            return this.f293288a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedDeleteResult(value=" + this.f293288a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$k;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressEditResult f293289a;

        public k(@Y61.k SxAddressEditResult sxAddressEditResult) {
            this.f293289a = sxAddressEditResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f293289a, ((k) obj).f293289a);
        }

        public final int hashCode() {
            return this.f293289a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedEditResult(value=" + this.f293289a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$l;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressRevalidateResult f293290a;

        public l(@Y61.k SxAddressRevalidateResult sxAddressRevalidateResult) {
            this.f293290a = sxAddressRevalidateResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f293290a, ((l) obj).f293290a);
        }

        public final int hashCode() {
            return this.f293290a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedRevalidateResult(value=" + this.f293290a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$m;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScreenData f293291a;

        public m(@Y61.k ScreenData screenData) {
            this.f293291a = screenData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f293291a, ((m) obj).f293291a);
        }

        public final int hashCode() {
            return this.f293291a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SaveAndReRenderLoadedList(data=" + this.f293291a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$o;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressItem f293295a;

        public o(@Y61.k AddressItem addressItem) {
            this.f293295a = addressItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f293295a, ((o) obj).f293295a);
        }

        public final int hashCode() {
            return this.f293295a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowActionMenu(item=" + this.f293295a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$p;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293296a;

        public p(@Y61.k String str) {
            this.f293296a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f293296a, ((p) obj).f293296a);
        }

        public final int hashCode() {
            return this.f293296a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAddAddressError(error="), this.f293296a, ')');
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$q;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f293297a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1521437832;
        }

        @Y61.k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$r;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ActionModalDialogContent f293298a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f293299b;

        public r(@Y61.k ActionModalDialogContent actionModalDialogContent, @Y61.k DeepLink deepLink) {
            this.f293298a = actionModalDialogContent;
            this.f293299b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f293298a, rVar.f293298a) && L.f(this.f293299b, rVar.f293299b);
        }

        public final int hashCode() {
            return this.f293299b.hashCode() + (this.f293298a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowModalActionDialogClick(content=");
            sb2.append(this.f293298a);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f293299b, ')');
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$s;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InfoBannerData f293300a;

        public s(@Y61.k InfoBannerData infoBannerData) {
            this.f293300a = infoBannerData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f293300a, ((s) obj).f293300a);
        }

        public final int hashCode() {
            return this.f293300a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowRestrictionBottomSheet(content=" + this.f293300a + ')';
        }
    }

    /* compiled from: SxAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/b$n;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ScreenData f293292a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<AddressItem> f293293b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Filter f293294c;

        public n(@Y61.k ScreenData screenData, @Y61.l List<AddressItem> list, @Y61.k Filter filter) {
            this.f293292a = screenData;
            this.f293293b = list;
            this.f293294c = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f293292a, nVar.f293292a) && L.f(this.f293293b, nVar.f293293b) && this.f293294c == nVar.f293294c;
        }

        public final int hashCode() {
            int iHashCode = this.f293292a.hashCode() * 31;
            List<AddressItem> list = this.f293293b;
            return this.f293294c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "SaveLoadedAndReRenderFilteredList(data=" + this.f293292a + ", filteredList=" + this.f293293b + ", filter=" + this.f293294c + ')';
        }

        public /* synthetic */ n(ScreenData screenData, List list, Filter filter, int i12, C42822w c42822w) {
            this(screenData, list, (i12 & 4) != 0 ? Filter.f293146c : filter);
        }
    }
}
