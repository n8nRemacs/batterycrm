package coil.request;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Parameters.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u0007\b\tB\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcoil/request/u;", "", "Lkotlin/Q;", "", "Lcoil/request/u$c;", "<init>", "()V", "a", "b", "c", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u implements Iterable<Q<? extends String, ? extends c>>, Z41.a {

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final u f58732c;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, c> f58733b;

    /* compiled from: Parameters.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/request/u$b;", "", "<init>", "()V", "Lcoil/request/u;", "EMPTY", "Lcoil/request/u;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/u$c;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                cVar.getClass();
                if (L.f(null, null)) {
                    cVar.getClass();
                    if (L.f(null, null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return 0;
        }

        @Y61.k
        public final String toString() {
            return "Entry(value=null, memoryCacheKey=null)";
        }
    }

    static {
        new b(null);
        f58732c = new u();
    }

    public /* synthetic */ u(Map map, C42822w c42822w) {
        this(map);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            if (L.f(this.f58733b, ((u) obj).f58733b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58733b.hashCode();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Q<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f58733b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(new Q(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("Parameters(entries="), this.f58733b, ')');
    }

    /* compiled from: Parameters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/request/u$a;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f58734a;

        public a() {
            this.f58734a = new LinkedHashMap();
        }

        public a(@Y61.k u uVar) {
            this.f58734a = new LinkedHashMap(uVar.f58733b);
        }
    }

    public u(Map<String, c> map) {
        this.f58733b = map;
    }

    public u() {
        this(P0.c());
    }
}
