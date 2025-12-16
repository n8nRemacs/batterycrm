package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/g;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> implements Iterator<T>, Z41.d {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final f<K, V> f38340e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public K f38341f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38342g;

    /* renamed from: h, reason: collision with root package name */
    public int f38343h;

    public g(@Y61.k f<K, V> fVar, @Y61.k v<K, V, T>[] vVarArr) {
        super(fVar.f38336d, vVarArr);
        this.f38340e = fVar;
        this.f38343h = fVar.f38338f;
    }

    public final void c(int i12, u<?, ?> uVar, K k12, int i13) {
        int i14 = i13 * 5;
        v<K, V, T>[] vVarArr = this.f38331b;
        if (i14 <= 30) {
            int iD2 = 1 << y.d(i12, i14);
            if (uVar.h(iD2)) {
                vVarArr[i13].a(Integer.bitCount(uVar.f38353a) * 2, uVar.f(iD2), uVar.f38356d);
                this.f38332c = i13;
                return;
            }
            int iT2 = uVar.t(iD2);
            u<?, ?> uVarS = uVar.s(iT2);
            vVarArr[i13].a(Integer.bitCount(uVar.f38353a) * 2, iT2, uVar.f38356d);
            c(i12, uVarS, k12, i13 + 1);
            return;
        }
        v<K, V, T> vVar = vVarArr[i13];
        Object[] objArr = uVar.f38356d;
        vVar.a(objArr.length, 0, objArr);
        while (true) {
            v<K, V, T> vVar2 = vVarArr[i13];
            if (L.f(vVar2.f38359b[vVar2.f38361d], k12)) {
                this.f38332c = i13;
                return;
            } else {
                vVarArr[i13].f38361d += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public final T next() {
        if (this.f38340e.f38338f != this.f38343h) {
            throw new ConcurrentModificationException();
        }
        if (!this.f38333d) {
            throw new NoSuchElementException();
        }
        v<K, V, T> vVar = this.f38331b[this.f38332c];
        this.f38341f = (K) vVar.f38359b[vVar.f38361d];
        this.f38342g = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e, java.util.Iterator
    public final void remove() {
        if (!this.f38342g) {
            throw new IllegalStateException();
        }
        boolean z12 = this.f38333d;
        f<K, V> fVar = this.f38340e;
        if (!z12) {
            v0.c(fVar).remove(this.f38341f);
        } else {
            if (!z12) {
                throw new NoSuchElementException();
            }
            v<K, V, T> vVar = this.f38331b[this.f38332c];
            Object obj = vVar.f38359b[vVar.f38361d];
            v0.c(fVar).remove(this.f38341f);
            c(obj != null ? obj.hashCode() : 0, fVar.f38336d, obj, 0);
        }
        this.f38341f = null;
        this.f38342g = false;
        this.f38343h = fVar.f38338f;
    }
}
