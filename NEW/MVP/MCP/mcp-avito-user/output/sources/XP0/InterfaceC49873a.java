package xP0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletWebViewAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LxP0/a;", "", "a", "b", "c", "d", "e", "LxP0/a$a;", "LxP0/a$b;", "LxP0/a$c;", "LxP0/a$d;", "LxP0/a$e;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC49873a {

    /* compiled from: WalletWebViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxP0/a$a;", "LxP0/a;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xP0.a$a, reason: collision with other inner class name */
    public static final class C12869a implements InterfaceC49873a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12869a f442459a = new C12869a();
    }

    /* compiled from: WalletWebViewAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxP0/a$b;", "LxP0/a;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xP0.a$b */
    public static final /* data */ class b implements InterfaceC49873a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PowerWebViewStateChangeEvent f442460a;

        public b(@k PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            this.f442460a = powerWebViewStateChangeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442460a, ((b) obj).f442460a);
        }

        public final int hashCode() {
            return this.f442460a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleWebViewStateChangeEvent(event=" + this.f442460a + ')';
        }
    }

    /* compiled from: WalletWebViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxP0/a$c;", "LxP0/a;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xP0.a$c */
    public static final class c implements InterfaceC49873a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f442461a = new c();
    }

    /* compiled from: WalletWebViewAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxP0/a$d;", "LxP0/a;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xP0.a$d */
    public static final /* data */ class d implements InterfaceC49873a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442462a;

        public d(@k DeepLink deepLink) {
            this.f442462a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f442462a, ((d) obj).f442462a);
        }

        public final int hashCode() {
            return this.f442462a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ProcessDeeplink(deeplink="), this.f442462a, ')');
        }
    }

    /* compiled from: WalletWebViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxP0/a$e;", "LxP0/a;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xP0.a$e */
    public static final class e implements InterfaceC49873a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f442463a = new e();
    }
}
