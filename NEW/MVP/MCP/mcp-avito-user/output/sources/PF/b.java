package Pf;

import Bf.C13142a;
import Y61.k;
import Y61.l;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LPf/b;", "", "a", "b", "c", "LPf/b$a;", "LPf/b$b;", "LPf/b$c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AutotekaReportOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/b$a;", "LPf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13214a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InputStream f13215b;

        public a(@k InputStream inputStream, @k String str) {
            this.f13214a = str;
            this.f13215b = inputStream;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f13214a, aVar.f13214a) && L.f(this.f13215b, aVar.f13215b);
        }

        public final int hashCode() {
            return this.f13215b.hashCode() + (this.f13214a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "DownloadPdf(fileName=" + this.f13214a + ", inputStream=" + this.f13215b + ')';
        }
    }

    /* compiled from: AutotekaReportOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPf/b$b;", "LPf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0857b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0857b f13216a = new C0857b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0857b);
        }

        public final int hashCode() {
            return -479556655;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaReportOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/b$c;", "LPf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C13142a.C0064a f13217a;

        public c(@k C13142a.C0064a c0064a) {
            this.f13217a = c0064a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13217a, ((c) obj).f13217a);
        }

        public final int hashCode() {
            return this.f13217a.hashCode();
        }

        @k
        public final String toString() {
            return "ShareReport(sharingLink=" + this.f13217a + ')';
        }
    }
}
