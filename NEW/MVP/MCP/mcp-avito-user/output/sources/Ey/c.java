package Ey;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmailConfirmationState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LEy/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f4433c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f4434d = new c(b.C0268c.f4438a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f4435b;

    /* compiled from: EmailConfirmationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEy/c$a;", "", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EmailConfirmationState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LEy/c$b;", "", "a", "b", "c", "LEy/c$b$a;", "LEy/c$b$b;", "LEy/c$b$c;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: EmailConfirmationState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEy/c$b$a;", "LEy/c$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f4436a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 222104709;
            }

            @k
            public final String toString() {
                return "ConfirmSuccessState";
            }
        }

        /* compiled from: EmailConfirmationState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEy/c$b$b;", "LEy/c$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ey.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0267b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0267b f4437a = new C0267b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0267b);
            }

            public final int hashCode() {
                return -1917794766;
            }

            @k
            public final String toString() {
                return "ErrorState";
            }
        }

        /* compiled from: EmailConfirmationState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEy/c$b$c;", "LEy/c$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Ey.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C0268c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0268c f4438a = new C0268c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0268c);
            }

            public final int hashCode() {
                return -1705146050;
            }

            @k
            public final String toString() {
                return "LoadingState";
            }
        }
    }

    public c(@k b bVar) {
        this.f4435b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f4435b, ((c) obj).f4435b);
    }

    public final int hashCode() {
        return this.f4435b.hashCode();
    }

    @k
    public final String toString() {
        return "EmailConfirmationState(viewState=" + this.f4435b + ')';
    }
}
