package Vq0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerRoomState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LVq0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f17420c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f17421d = new c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f17422b;

    /* compiled from: SellerRoomState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVq0/c$a;", "", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerRoomState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVq0/c$b;", "", "a", "b", "c", "LVq0/c$b$a;", "LVq0/c$b$b;", "LVq0/c$b$c;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SellerRoomState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/c$b$a;", "LVq0/c$b;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f17423a;

            public a(@k D d12) {
                this.f17423a = d12;
            }
        }

        /* compiled from: SellerRoomState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/c$b$b;", "LVq0/c$b;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vq0.c$b$b, reason: collision with other inner class name */
        public static final class C1203b implements b {
        }

        /* compiled from: SellerRoomState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/c$b$c;", "LVq0/c$b;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vq0.c$b$c, reason: collision with other inner class name */
        public static final class C1204c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f17424a;

            public C1204c() {
                this(false, 1, null);
            }

            public C1204c(boolean z12) {
                this.f17424a = z12;
            }

            public /* synthetic */ C1204c(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f17422b, ((c) obj).f17422b);
    }

    public final int hashCode() {
        return this.f17422b.hashCode();
    }

    @k
    public final String toString() {
        return "SellerRoomState(viewState=" + this.f17422b + ')';
    }

    public /* synthetic */ c(b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new b.C1204c(false, 1, null) : bVar);
    }

    public c(@k b bVar) {
        this.f17422b = bVar;
    }
}
