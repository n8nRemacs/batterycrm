package x60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WebPaymentMviAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lx60/a;", "", "a", "b", "c", "d", "e", "f", "Lx60/a$a;", "Lx60/a$b;", "Lx60/a$c;", "Lx60/a$d;", "Lx60/a$e;", "Lx60/a$f;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x60.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC49775a {

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/a$a;", "Lx60/a;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$a, reason: collision with other inner class name */
    public static final class C12845a implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12845a f442222a = new C12845a();
    }

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/a$b;", "Lx60/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$b */
    public static final /* data */ class b implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f442223a;

        public b(@k String str) {
            this.f442223a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442223a, ((b) obj).f442223a);
        }

        public final int hashCode() {
            return this.f442223a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandlePostMessage(message="), this.f442223a, ')');
        }
    }

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/a$c;", "Lx60/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$c */
    public static final /* data */ class c implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PowerWebViewStateChangeEvent f442224a;

        public c(@k PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            this.f442224a = powerWebViewStateChangeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f442224a, ((c) obj).f442224a);
        }

        public final int hashCode() {
            return this.f442224a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleWebViewStateChangeEvent(event=" + this.f442224a + ')';
        }
    }

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/a$d;", "Lx60/a;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$d */
    public static final class d implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f442225a = new d();
    }

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx60/a$e;", "Lx60/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$e */
    public static final /* data */ class e implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442226a;

        public e(@k DeepLink deepLink) {
            this.f442226a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f442226a, ((e) obj).f442226a);
        }

        public final int hashCode() {
            return this.f442226a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ProcessDeeplink(deeplink="), this.f442226a, ')');
        }
    }

    /* compiled from: WebPaymentMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx60/a$f;", "Lx60/a;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x60.a$f */
    public static final class f implements InterfaceC49775a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f442227a = new f();
    }
}
