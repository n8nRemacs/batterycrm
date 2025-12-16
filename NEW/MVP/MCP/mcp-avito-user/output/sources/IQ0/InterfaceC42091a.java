package iq0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectMetroAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Liq0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Liq0/a$a;", "Liq0/a$b;", "Liq0/a$c;", "Liq0/a$d;", "Liq0/a$e;", "Liq0/a$f;", "Liq0/a$g;", "Liq0/a$h;", "Liq0/a$i;", "Liq0/a$j;", "Liq0/a$k;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42091a {

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/a$a;", "Liq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$a, reason: collision with other inner class name */
    public static final class C11537a implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11537a f405255a = new C11537a();
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/a$b;", "Liq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$b */
    public static final class b implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f405256a = new b();
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/a$c;", "Liq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$c */
    public static final class c implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f405257a = new c();
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$d;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$d */
    public static final /* data */ class d implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MetroFilterItem f405258a;

        public d(@Y61.k MetroFilterItem metroFilterItem) {
            this.f405258a = metroFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f405258a, ((d) obj).f405258a);
        }

        public final int hashCode() {
            return this.f405258a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FilterItemChanged(item=" + this.f405258a + ')';
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$e;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$e */
    public static final /* data */ class e implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405259a;

        public e(boolean z12) {
            this.f405259a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f405259a == ((e) obj).f405259a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405259a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f405259a, ')');
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$f;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$f */
    public static final /* data */ class f implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MetroLineItem f405260a;

        public f(@Y61.k MetroLineItem metroLineItem) {
            this.f405260a = metroLineItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f405260a, ((f) obj).f405260a);
        }

        public final int hashCode() {
            return this.f405260a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MetroLineItemChanged(item=" + this.f405260a + ')';
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$g;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$g */
    public static final /* data */ class g implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MetroListOutputTypeItem f405261a;

        public g(@Y61.k MetroListOutputTypeItem metroListOutputTypeItem) {
            this.f405261a = metroListOutputTypeItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f405261a, ((g) obj).f405261a);
        }

        public final int hashCode() {
            return this.f405261a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NewOutputTypeSelected(item=" + this.f405261a + ')';
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq0/a$h;", "Liq0/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$h */
    public static final class h implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f405262a = new h();
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$i;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$i */
    public static final /* data */ class i implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f405263a;

        public i(@Y61.k String str) {
            this.f405263a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f405263a, ((i) obj).f405263a);
        }

        public final int hashCode() {
            return this.f405263a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchTextChanged(query="), this.f405263a, ')');
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$j;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$j */
    public static final /* data */ class j implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MetroSelectedStationsItem f405264a;

        public j(@Y61.k MetroSelectedStationsItem metroSelectedStationsItem) {
            this.f405264a = metroSelectedStationsItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f405264a, ((j) obj).f405264a);
        }

        public final int hashCode() {
            return this.f405264a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectedStationsItemChanged(item=" + this.f405264a + ')';
        }
    }

    /* compiled from: SelectMetroAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liq0/a$k;", "Liq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iq0.a$k */
    public static final /* data */ class k implements InterfaceC42091a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MetroStationItem f405265a;

        public k(@Y61.k MetroStationItem metroStationItem) {
            this.f405265a = metroStationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f405265a, ((k) obj).f405265a);
        }

        public final int hashCode() {
            return this.f405265a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "StationItemChanged(item=" + this.f405265a + ')';
        }
    }
}
