package androidx.datastore.preferences.core;

import Y41.l;
import androidx.datastore.preferences.core.f;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/preferences/core/a;", "Landroidx/datastore/preferences/core/f;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<f.a<?>, Object> f45556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f45557b;

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Landroidx/datastore/preferences/core/f$a;", "", "entry", "", "<anonymous>", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.preferences.core.a$a, reason: collision with other inner class name */
    public static final class C1777a extends N implements l<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1777a f45558l = new C1777a();

        public C1777a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            Map.Entry<f.a<?>, Object> entry2 = entry;
            return "  " + entry2.getKey().f45565a + " = " + entry2.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.f
    @Y61.k
    public final Map<f.a<?>, Object> a() {
        return Collections.unmodifiableMap(this.f45556a);
    }

    @Override // androidx.datastore.preferences.core.f
    @Y61.l
    public final <T> T b(@Y61.k f.a<T> aVar) {
        return (T) this.f45556a.get(aVar);
    }

    public final void c() {
        if (this.f45557b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(@Y61.k f.a<?> aVar, @Y61.l Object obj) {
        c();
        Map<f.a<?>, Object> map = this.f45556a;
        if (obj == null) {
            c();
            map.remove(aVar);
        } else if (obj instanceof Set) {
            map.put(aVar, Collections.unmodifiableSet(C42745f0.P0((Iterable) obj)));
        } else {
            map.put(aVar, obj);
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return L.f(this.f45556a, ((a) obj).f45556a);
    }

    public final int hashCode() {
        return this.f45556a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(this.f45556a.entrySet(), ",\n", "{\n", "\n}", C1777a.f45558l, 24);
    }

    public /* synthetic */ a(Map map, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new LinkedHashMap() : map, (i12 & 2) != 0 ? true : z12);
    }

    public a(@Y61.k Map<f.a<?>, Object> map, boolean z12) {
        this.f45556a = map;
        this.f45557b = new AtomicBoolean(z12);
    }
}
