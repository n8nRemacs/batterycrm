package Dn0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDn0/b;", "", "a", "b", "c", "LDn0/b$a;", "LDn0/b$b;", "LDn0/b$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13422b {

    /* compiled from: ReasonDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDn0/b$a;", "LDn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.b$a */
    public static final /* data */ class a implements InterfaceC13422b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3441a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1133486028;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ReasonDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDn0/b$b;", "LDn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0192b implements InterfaceC13422b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0192b f3442a = new C0192b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0192b);
        }

        public final int hashCode() {
            return -1196303110;
        }

        @k
        public final String toString() {
            return "OpenBottomSheet";
        }
    }

    /* compiled from: ReasonDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDn0/b$c;", "LDn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.b$c */
    public static final /* data */ class c implements InterfaceC13422b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3443a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f3444b;

        public c(@k PrintableText printableText, @k ApiError apiError) {
            this.f3443a = printableText;
            this.f3444b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f3443a, cVar.f3443a) && L.f(this.f3444b, cVar.f3444b);
        }

        public final int hashCode() {
            return this.f3444b.hashCode() + (this.f3443a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(errorText=");
            sb2.append(this.f3443a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f3444b, ')');
        }
    }
}
