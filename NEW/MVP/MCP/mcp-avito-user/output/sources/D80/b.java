package D80;

import Y61.k;
import Y61.l;
import com.google.android.exoplayer2.InterfaceC36534o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlayerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LD80/b;", "", "a", "b", "c", "d", "LD80/b$a;", "LD80/b$b;", "LD80/b$c;", "LD80/b$d;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: PlayerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/b$a;", "LD80/b;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f2970a = new a();
    }

    /* compiled from: PlayerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/b$b;", "LD80/b;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D80.b$b, reason: collision with other inner class name */
    public static final class C0151b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0151b f2971a = new C0151b();
    }

    /* compiled from: PlayerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD80/b$c;", "LD80/b;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f2972a = new c();
    }

    /* compiled from: PlayerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD80/b$d;", "LD80/b;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC36534o f2973a;

        public d(@k InterfaceC36534o interfaceC36534o) {
            this.f2973a = interfaceC36534o;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f2973a, ((d) obj).f2973a);
        }

        public final int hashCode() {
            return this.f2973a.hashCode();
        }

        @k
        public final String toString() {
            return "PlayerCreated(player=" + this.f2973a + ')';
        }
    }
}
