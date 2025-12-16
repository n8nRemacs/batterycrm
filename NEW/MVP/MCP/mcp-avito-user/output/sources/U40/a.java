package U40;

import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LU40/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LU40/a$c;", "LU40/a$d;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/a$a;", "LU40/a$c;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U40.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1096a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f16163a;

        public C1096a(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f16163a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1096a) && L.f(this.f16163a, ((C1096a) obj).f16163a);
        }

        public final int hashCode() {
            return this.f16163a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f16163a + ')';
        }
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LU40/a$b;", "LU40/a$d;", "LU40/a$f;", "LU40/a$g;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends d {
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LU40/a$c;", "LU40/a;", "LU40/a$a;", "LU40/a$h;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends a {
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LU40/a$d;", "LU40/a;", "LU40/a$b;", "LU40/a$e;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends a {
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU40/a$e;", "LU40/a$d;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f16164a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 969954634;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU40/a$f;", "LU40/a$b;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f16165a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1341161486;
        }

        @k
        public final String toString() {
            return "StartPolling";
        }
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU40/a$g;", "LU40/a$b;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f16166a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1847316400;
        }

        @k
        public final String toString() {
            return "StopPolling";
        }
    }

    /* compiled from: OrderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU40/a$h;", "LU40/a$c;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f16167a;

        public h(@k AbstractC40048c abstractC40048c) {
            this.f16167a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f16167a, ((h) obj).f16167a);
        }

        public final int hashCode() {
            return this.f16167a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f16167a + ')';
        }
    }
}
