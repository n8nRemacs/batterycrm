package Ax0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigStatusDocAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LAx0/b;", "", "a", "b", "c", "d", "LAx0/b$a;", "LAx0/b$b;", "LAx0/b$c;", "LAx0/b$d;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ax0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13098b {

    /* compiled from: GigStatusDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx0/b$a;", "LAx0/b;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ax0.b$a */
    public static final /* data */ class a implements InterfaceC13098b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C13097a f718a;

        public a(@k C13097a c13097a) {
            this.f718a = c13097a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f718a, ((a) obj).f718a);
        }

        public final int hashCode() {
            return this.f718a.hashCode();
        }

        @k
        public final String toString() {
            return "ActionButtonClicked(button=" + this.f718a + ')';
        }
    }

    /* compiled from: GigStatusDocAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAx0/b$b;", "LAx0/b;", "<init>", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ax0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0030b implements InterfaceC13098b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0030b f719a = new C0030b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0030b);
        }

        public final int hashCode() {
            return 1820701608;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigStatusDocAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAx0/b$c;", "LAx0/b;", "<init>", "()V", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ax0.b$c */
    public static final /* data */ class c implements InterfaceC13098b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f720a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1724259352;
        }

        @k
        public final String toString() {
            return "ReloadPage";
        }
    }

    /* compiled from: GigStatusDocAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAx0/b$d;", "LAx0/b;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ax0.b$d */
    public static final /* data */ class d implements InterfaceC13098b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f721a;

        public d(@k DeepLink deepLink) {
            this.f721a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f721a, ((d) obj).f721a);
        }

        public final int hashCode() {
            return this.f721a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SupportButtonClick(deeplink="), this.f721a, ')');
        }
    }
}
