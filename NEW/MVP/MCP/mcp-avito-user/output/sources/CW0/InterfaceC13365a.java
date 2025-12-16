package Cw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: SilentUpdateDownloadAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCw0/a;", "", "a", "b", "LCw0/a$a;", "LCw0/a$b;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13365a {

    /* compiled from: SilentUpdateDownloadAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw0/a$a;", "LCw0/a;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0138a implements InterfaceC13365a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2795a;

        public C0138a(int i12) {
            this.f2795a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0138a) && this.f2795a == ((C0138a) obj).f2795a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f2795a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Fail(reasonCode="), this.f2795a, ')');
        }
    }

    /* compiled from: SilentUpdateDownloadAnalytics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw0/a$b;", "LCw0/a;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw0.a$b */
    public static final /* data */ class b implements InterfaceC13365a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2796a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1951702894;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
