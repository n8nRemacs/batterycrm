package coil.request;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Tags.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/request/y;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f58745b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final y f58746c = new y(P0.c());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Class<?>, Object> f58747a;

    /* compiled from: Tags.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/request/y$a;", "", "<init>", "()V", "Lcoil/request/y;", "EMPTY", "Lcoil/request/y;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ y(Map map, C42822w c42822w) {
        this(map);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            if (L.f(this.f58747a, ((y) obj).f58747a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58747a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("Tags(tags="), this.f58747a, ')');
    }

    public y(Map<Class<?>, ? extends Object> map) {
        this.f58747a = map;
    }
}
