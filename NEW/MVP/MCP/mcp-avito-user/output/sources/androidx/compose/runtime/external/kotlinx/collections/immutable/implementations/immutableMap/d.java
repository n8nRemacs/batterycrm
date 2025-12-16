package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u;
import androidx.compose.runtime.internal.P;
import h0.C40753a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.AbstractC42740d;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentHashMap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "K", "V", "Lkotlin/collections/d;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class d<K, V> extends AbstractC42740d<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.h<K, V> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f38327g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final d f38328h;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u<K, V> f38329e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38330f;

    /* compiled from: PersistentHashMap.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d$a;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        u.f38351e.getClass();
        f38328h = new d(u.f38352f, 0);
    }

    public d(@Y61.k u<K, V> uVar, int i12) {
        this.f38329e = uVar;
        this.f38330f = i12;
    }

    @Override // kotlin.collections.AbstractC42740d
    @X
    @Y61.k
    public final Set<Map.Entry<K, V>> b() {
        return new o(this);
    }

    @Override // kotlin.collections.AbstractC42740d
    public final Set c() {
        return new q(this);
    }

    @Override // kotlin.collections.AbstractC42740d, java.util.Map
    public boolean containsKey(K k12) {
        return this.f38329e.d(k12 != null ? k12.hashCode() : 0, 0, k12);
    }

    @Override // kotlin.collections.AbstractC42740d
    public final Collection d() {
        return new s(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder() {
        return new f<>(this);
    }

    @Y61.k
    public final d g(Object obj, C40753a c40753a) {
        u.b<K, V> bVarU = this.f38329e.u(obj != null ? obj.hashCode() : 0, obj, c40753a, 0);
        if (bVarU == null) {
            return this;
        }
        return new d(bVarU.f38357a, this.f38330f + bVarU.f38358b);
    }

    @Override // kotlin.collections.AbstractC42740d, java.util.Map
    @Y61.l
    public V get(K k12) {
        return (V) this.f38329e.g(k12 != null ? k12.hashCode() : 0, 0, k12);
    }

    @Override // kotlin.collections.AbstractC42740d
    /* renamed from: getSize, reason: from getter */
    public final int getF38330f() {
        return this.f38330f;
    }
}
