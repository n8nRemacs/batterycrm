package zg;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.advertising.CommercialBanner;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvlPlayerInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lzg/f;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lzg/f$a;", "Lzg/f$b;", "Lzg/f$c;", "Lzg/f$d;", "Lzg/f$e;", "Lzg/f$f;", "Lzg/f$g;", "Lzg/f$h;", "Lzg/f$i;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f {

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$a;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444146a = new a();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$b;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f444147a = new b();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$c;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f444148a = new c();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$d;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f444149a = new d();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/f$e;", "Lzg/f;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f444150a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@k List<? extends com.avito.conveyor_item.a> list) {
            this.f444150a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f444150a, ((e) obj).f444150a);
        }

        public final int hashCode() {
            return this.f444150a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("NewVideosList(shortVideosList="), this.f444150a, ')');
        }
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$f;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zg.f$f, reason: collision with other inner class name */
    public static final class C12966f implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12966f f444151a = new C12966f();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$g;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f444152a = new g();
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzg/f$h;", "Lzg/f;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommercialBanner f444153a;

        public h(@k CommercialBanner commercialBanner) {
            this.f444153a = commercialBanner;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f444153a, ((h) obj).f444153a);
        }

        public final int hashCode() {
            return this.f444153a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateAd(commercialBanner=" + this.f444153a + ')';
        }
    }

    /* compiled from: AvlPlayerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/f$i;", "Lzg/f;", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f444154a = new i();
    }
}
