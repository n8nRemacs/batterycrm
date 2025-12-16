package androidx.compose.runtime.internal;

import androidx.compose.runtime.O1;
import androidx.compose.runtime.T3;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistentCompositionLocalMap.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/J;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "Landroidx/compose/runtime/O;", "", "Landroidx/compose/runtime/T3;", "Landroidx/compose/runtime/O1;", "a", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<androidx.compose.runtime.O<Object>, T3<Object>> implements O1 {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final b f38425i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final J f38426j;

    /* compiled from: PersistentCompositionLocalMap.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/internal/J$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "Landroidx/compose/runtime/O;", "", "Landroidx/compose/runtime/T3;", "Landroidx/compose/runtime/O1$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<androidx.compose.runtime.O<Object>, T3<Object>> implements O1.a {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public J f38427h;

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof androidx.compose.runtime.O) {
                return super.containsKey((androidx.compose.runtime.O) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof T3) {
                return super.containsValue((T3) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f
        @Y61.k
        /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final J d() {
            Object obj = this.f38336d;
            J j12 = this.f38427h;
            if (obj != j12.f38329e) {
                this.f38335c = new i0.f();
                j12 = new J(this.f38336d, getF38339g());
            }
            this.f38427h = j12;
            return j12;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof androidx.compose.runtime.O) {
                return (T3) super.get((androidx.compose.runtime.O) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof androidx.compose.runtime.O) ? obj2 : (T3) super.getOrDefault((androidx.compose.runtime.O) obj, (T3) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof androidx.compose.runtime.O) {
                return (T3) super.remove((androidx.compose.runtime.O) obj);
            }
            return null;
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/internal/J$b;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.f38351e.getClass();
        f38426j = new J(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u.f38352f, 0);
    }

    public J() {
        throw null;
    }

    @Override // androidx.compose.runtime.O1
    @Y61.k
    public final J P3(@Y61.k X1 x12, @Y61.k T3 t32) {
        u.b bVarU = this.f38329e.u(x12.hashCode(), x12, t32, 0);
        if (bVarU == null) {
            return this;
        }
        return new J(bVarU.f38357a, this.f38330f + bVarU.f38358b);
    }

    @Override // androidx.compose.runtime.U
    public final <T> T a(@Y61.k androidx.compose.runtime.O<T> o12) {
        return (T) androidx.compose.runtime.V.a(this, o12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    public final h.a<androidx.compose.runtime.O<Object>, T3<Object>> builder() {
        a aVar = new a(this);
        aVar.f38427h = this;
        return aVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.AbstractC42740d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.O) {
            return super.containsKey((androidx.compose.runtime.O) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC42740d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof T3) {
            return super.containsValue((T3) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d
    /* renamed from: f */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f<androidx.compose.runtime.O<Object>, T3<Object>> builder() {
        a aVar = new a(this);
        aVar.f38427h = this;
        return aVar;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, kotlin.collections.AbstractC42740d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof androidx.compose.runtime.O) {
            return (T3) super.get((androidx.compose.runtime.O) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof androidx.compose.runtime.O) ? obj2 : (T3) super.getOrDefault((androidx.compose.runtime.O) obj, (T3) obj2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d, androidx.compose.runtime.external.kotlinx.collections.immutable.h
    /* renamed from: builder, reason: avoid collision after fix types in other method */
    public final h.a<androidx.compose.runtime.O<Object>, T3<Object>> builder2() {
        a aVar = new a(this);
        aVar.f38427h = this;
        return aVar;
    }
}
