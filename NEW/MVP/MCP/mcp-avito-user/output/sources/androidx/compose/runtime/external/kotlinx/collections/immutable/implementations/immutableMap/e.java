package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentIterators.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "K", "V", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v<K, V, T>[] f38331b;

    /* renamed from: c, reason: collision with root package name */
    public int f38332c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38333d = true;

    public e(@Y61.k u<K, V> uVar, @Y61.k v<K, V, T>[] vVarArr) {
        this.f38331b = vVarArr;
        vVarArr[0].a(Integer.bitCount(uVar.f38353a) * 2, 0, uVar.f38356d);
        this.f38332c = 0;
        a();
    }

    public final void a() {
        int i12 = this.f38332c;
        v<K, V, T>[] vVarArr = this.f38331b;
        v<K, V, T> vVar = vVarArr[i12];
        if (vVar.f38361d < vVar.f38360c) {
            return;
        }
        while (-1 < i12) {
            int iB2 = b(i12);
            if (iB2 == -1) {
                v<K, V, T> vVar2 = vVarArr[i12];
                int i13 = vVar2.f38361d;
                Object[] objArr = vVar2.f38359b;
                if (i13 < objArr.length) {
                    int length = objArr.length;
                    vVar2.f38361d = i13 + 1;
                    iB2 = b(i12);
                }
            }
            if (iB2 != -1) {
                this.f38332c = iB2;
                return;
            }
            if (i12 > 0) {
                v<K, V, T> vVar3 = vVarArr[i12 - 1];
                int i14 = vVar3.f38361d;
                int length2 = vVar3.f38359b.length;
                vVar3.f38361d = i14 + 1;
            }
            v<K, V, T> vVar4 = vVarArr[i12];
            u.f38351e.getClass();
            vVar4.a(0, 0, u.f38352f.f38356d);
            i12--;
        }
        this.f38333d = false;
    }

    public final int b(int i12) {
        v<K, V, T>[] vVarArr = this.f38331b;
        v<K, V, T> vVar = vVarArr[i12];
        int i13 = vVar.f38361d;
        if (i13 < vVar.f38360c) {
            return i12;
        }
        Object[] objArr = vVar.f38359b;
        if (i13 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        u uVar = (u) objArr[i13];
        if (i12 == 6) {
            v<K, V, T> vVar2 = vVarArr[i12 + 1];
            Object[] objArr2 = uVar.f38356d;
            vVar2.a(objArr2.length, 0, objArr2);
        } else {
            vVarArr[i12 + 1].a(Integer.bitCount(uVar.f38353a) * 2, 0, uVar.f38356d);
        }
        return b(i12 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38333d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f38333d) {
            throw new NoSuchElementException();
        }
        T next = this.f38331b[this.f38332c].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
