package ys;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditPartnerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lys/c;", "", "a", "b", "c", "d", "Lys/c$a;", "Lys/c$b;", "Lys/c$c;", "Lys/c$d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50288c {

    /* compiled from: CreditPartnerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/c$a;", "Lys/c;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.c$a */
    public static final class a implements InterfaceC50288c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443537a = new a();
    }

    /* compiled from: CreditPartnerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/c$b;", "Lys/c;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.c$b */
    public static final /* data */ class b implements InterfaceC50288c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443538a;

        public b(@k String str) {
            this.f443538a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443538a, ((b) obj).f443538a);
        }

        public final int hashCode() {
            return this.f443538a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f443538a, ')');
        }
    }

    /* compiled from: CreditPartnerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/c$c;", "Lys/c;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.c$c, reason: collision with other inner class name */
    public static final class C12924c implements InterfaceC50288c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12924c f443539a = new C12924c();
    }

    /* compiled from: CreditPartnerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/c$d;", "Lys/c;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.c$d */
    public static final /* data */ class d implements InterfaceC50288c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ValueCallback<Uri[]> f443540a;

        public d(@k ValueCallback<Uri[]> valueCallback) {
            this.f443540a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f443540a, ((d) obj).f443540a);
        }

        public final int hashCode() {
            return this.f443540a.hashCode();
        }

        @k
        public final String toString() {
            return "TryToOpenCamera(filePathCallback=" + this.f443540a + ')';
        }
    }
}
