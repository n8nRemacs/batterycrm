package mY;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.avito.android.deep_linking.links.DeepLink;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FinanceMarketplaceAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LmY/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LmY/a$a;", "LmY/a$b;", "LmY/a$c;", "LmY/a$d;", "LmY/a$e;", "LmY/a$f;", "LmY/a$g;", "LmY/a$h;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC44028a {

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmY/a$a;", "LmY/a;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$a, reason: collision with other inner class name */
    public static final class C11831a implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11831a f414559a = new C11831a();
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmY/a$b;", "LmY/a;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$b */
    public static final /* data */ class b implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PowerWebViewStateChangeEvent f414560a;

        public b(@k PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            this.f414560a = powerWebViewStateChangeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f414560a, ((b) obj).f414560a);
        }

        public final int hashCode() {
            return this.f414560a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleWebViewStateChangeEvent(event=" + this.f414560a + ')';
        }
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmY/a$c;", "LmY/a;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$c */
    public static final /* data */ class c implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f414561a;

        public c(@l ValueCallback<Uri[]> valueCallback) {
            this.f414561a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f414561a, ((c) obj).f414561a);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f414561a;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @k
        public final String toString() {
            return "OnCameraPermissionGranted(filePathCallback=" + this.f414561a + ')';
        }
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmY/a$d;", "LmY/a;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$d */
    public static final class d implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f414562a = new d();
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmY/a$e;", "LmY/a;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$e */
    public static final class e implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f414563a = new e();
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmY/a$f;", "LmY/a;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$f */
    public static final /* data */ class f implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ValueCallback<Uri[]> f414564a;

        public f(@k ValueCallback<Uri[]> valueCallback) {
            this.f414564a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f414564a, ((f) obj).f414564a);
        }

        public final int hashCode() {
            return this.f414564a.hashCode();
        }

        @k
        public final String toString() {
            return "OnWebShowFileChooserCalled(filePathCallback=" + this.f414564a + ')';
        }
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmY/a$g;", "LmY/a;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$g */
    public static final /* data */ class g implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414565a;

        public g(@k DeepLink deepLink) {
            this.f414565a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f414565a, ((g) obj).f414565a);
        }

        public final int hashCode() {
            return this.f414565a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ProcessDeeplink(deeplink="), this.f414565a, ')');
        }
    }

    /* compiled from: FinanceMarketplaceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmY/a$h;", "LmY/a;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mY.a$h */
    public static final class h implements InterfaceC44028a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f414566a = new h();
    }
}
