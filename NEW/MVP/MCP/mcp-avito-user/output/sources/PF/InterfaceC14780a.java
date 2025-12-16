package Pf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: AutotekaReportAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPf/a;", "", "a", "b", "c", "d", "LPf/a$a;", "LPf/a$b;", "LPf/a$c;", "LPf/a$d;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14780a {

    /* compiled from: AutotekaReportAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPf/a$a;", "LPf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0856a implements InterfaceC14780a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0856a f13210a = new C0856a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0856a);
        }

        public final int hashCode() {
            return -1225342682;
        }

        @k
        public final String toString() {
            return "DownloadPdf";
        }
    }

    /* compiled from: AutotekaReportAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPf/a$b;", "LPf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.a$b */
    public static final /* data */ class b implements InterfaceC14780a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13211a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 7629775;
        }

        @k
        public final String toString() {
            return "ShareReport";
        }
    }

    /* compiled from: AutotekaReportAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/a$c;", "LPf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.a$c */
    public static final /* data */ class c implements InterfaceC14780a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13212a;

        public c(boolean z12) {
            this.f13212a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f13212a == ((c) obj).f13212a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13212a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateItems(isCheckAuth="), this.f13212a, ')');
        }
    }

    /* compiled from: AutotekaReportAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPf/a$d;", "LPf/a;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.a$d */
    public static final /* data */ class d implements InterfaceC14780a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13213a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -738945261;
        }

        @k
        public final String toString() {
            return "WebViewError";
        }
    }
}
