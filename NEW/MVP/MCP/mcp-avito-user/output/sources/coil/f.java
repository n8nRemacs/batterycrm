package coil;

import coil.request.p;
import coil.request.x;
import j.K;
import kotlin.Metadata;

/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcoil/f;", "Lcoil/request/p$b;", "b", "d", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends p.b {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a f58371a;

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/f$a", "Lcoil/f;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcoil/f$b;", "", "<init>", "()V", "Lcoil/f;", "NONE", "Lcoil/f;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f58372a = 0;

        static {
            new b();
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/f$d;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* renamed from: K1, reason: collision with root package name */
        @X41.f
        @Y61.k
        public static final androidx.media3.exoplayer.analytics.m f58373K1;

        /* compiled from: EventListener.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcoil/f$d$a;", "", "<init>", "()V", "Lcoil/f$d;", "NONE", "Lcoil/f$d;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f58374a = 0;

            static {
                new a();
            }
        }

        static {
            int i12 = a.f58374a;
            f58373K1 = new androidx.media3.exoplayer.analytics.m(27);
        }

        @Y61.k
        f create();
    }

    static {
        int i12 = b.f58372a;
        f58371a = new a();
    }

    @Override // coil.request.p.b
    @K
    default void onCancel() {
    }

    @Override // coil.request.p.b
    @K
    default void a(@Y61.k coil.request.p pVar) {
    }

    @Override // coil.request.p.b
    @K
    default void b(@Y61.k coil.request.p pVar, @Y61.k coil.request.e eVar) {
    }

    @Override // coil.request.p.b
    @K
    default void c(@Y61.k coil.request.p pVar, @Y61.k x xVar) {
    }
}
