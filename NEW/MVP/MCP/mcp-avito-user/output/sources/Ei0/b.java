package EI0;

import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OverlayAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEI0/b;", "", "a", "b", "c", "d", "LEI0/b$a;", "LEI0/b$b;", "LEI0/b$c;", "LEI0/b$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: OverlayAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEI0/b$a;", "LEI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3923a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 212975489;
        }

        @k
        public final String toString() {
            return "Pause";
        }
    }

    /* compiled from: OverlayAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEI0/b$b;", "LEI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0224b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final j f3924a;

        public C0224b(@k j jVar) {
            this.f3924a = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0224b) && L.f(this.f3924a, ((C0224b) obj).f3924a);
        }

        public final int hashCode() {
            return this.f3924a.hashCode();
        }

        @k
        public final String toString() {
            return "Queue(overlay=" + this.f3924a + ')';
        }
    }

    /* compiled from: OverlayAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEI0/b$c;", "LEI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final j f3925a;

        public c(@k j jVar) {
            this.f3925a = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3925a, ((c) obj).f3925a);
        }

        public final int hashCode() {
            return this.f3925a.hashCode();
        }

        @k
        public final String toString() {
            return "Remove(overlay=" + this.f3925a + ')';
        }
    }

    /* compiled from: OverlayAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEI0/b$d;", "LEI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3926a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1926799358;
        }

        @k
        public final String toString() {
            return "Resume";
        }
    }
}
