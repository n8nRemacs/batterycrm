package Vq0;

import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import dU0.InterfaceC39628a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerRoomOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"LVq0/b;", "", "a", "b", "c", "d", "e", "f", "g", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/b$a;", "LVq0/b$e;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17415a;

        public a(@k String str) {
            this.f17415a = str;
        }
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/b$b;", "LVq0/b$f;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1202b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC39628a f17416a;

        public C1202b(@k InterfaceC39628a interfaceC39628a) {
            this.f17416a = interfaceC39628a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1202b) && L.f(this.f17416a, ((C1202b) obj).f17416a);
        }

        public final int hashCode() {
            return this.f17416a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleComponentInteraction(componentInteraction=" + this.f17416a + ')';
        }
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/b$c;", "LVq0/b$f;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final dU0.b f17417a;

        public c(@k dU0.b bVar) {
            this.f17417a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17417a, ((c) obj).f17417a);
        }

        public final int hashCode() {
            return this.f17417a.hashCode();
        }

        @k
        public final String toString() {
            return "HandlePlatformInteraction(platformInteraction=" + this.f17417a + ')';
        }
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVq0/b$d;", "LVq0/b$f;", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f17418a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 797042223;
        }

        @k
        public final String toString() {
            return "HandleReload";
        }
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LVq0/b$e;", "LVq0/b;", "LVq0/b$a;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e extends b {
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LVq0/b$f;", "LVq0/b;", "LVq0/b$b;", "LVq0/b$c;", "LVq0/b$d;", "LVq0/b$g;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f extends b {
    }

    /* compiled from: SellerRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVq0/b$g;", "LVq0/b$f;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent.ShowToastBar f17419a;

        public g(@k BeduinOneTimeEvent.ShowToastBar showToastBar) {
            this.f17419a = showToastBar;
        }
    }
}
