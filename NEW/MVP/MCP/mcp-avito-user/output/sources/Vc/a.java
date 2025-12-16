package VC;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteListUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LVC/a;", "", "<init>", "()V", "a", "b", "c", "LVC/a$a;", "LVC/a$b;", "LVC/a$c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class a {

    /* compiled from: FavoriteListUpdateEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVC/a$a;", "LVC/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VC.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1165a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f16990a;

        public C1165a(@k Throwable th2) {
            super(null);
            this.f16990a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1165a) && L.f(this.f16990a, ((C1165a) obj).f16990a);
        }

        public final int hashCode() {
            return this.f16990a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("UpdateError(error="), this.f16990a, ')');
        }
    }

    /* compiled from: FavoriteListUpdateEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVC/a$b;", "LVC/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16991a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f16992b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f16993c;

        public b(@k String str, @k List<String> list, @k List<String> list2) {
            super(null);
            this.f16991a = str;
            this.f16992b = list;
            this.f16993c = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16991a, bVar.f16991a) && L.f(this.f16992b, bVar.f16992b) && L.f(this.f16993c, bVar.f16993c);
        }

        public final int hashCode() {
            return this.f16993c.hashCode() + H.e(this.f16991a.hashCode() * 31, 31, this.f16992b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateFinished(id=");
            sb2.append(this.f16991a);
            sb2.append(", removedAdvert=");
            sb2.append(this.f16992b);
            sb2.append(", addedAdvert=");
            return H.p(sb2, this.f16993c, ')');
        }
    }

    /* compiled from: FavoriteListUpdateEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVC/a$c;", "LVC/a;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f16994a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
