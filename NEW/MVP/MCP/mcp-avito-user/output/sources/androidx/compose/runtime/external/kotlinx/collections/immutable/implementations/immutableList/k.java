package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SmallPersistentVector.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k<E> extends b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f38317d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final k f38318e = new k(new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object[] f38319c;

    /* compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Object[] objArr) {
        this.f38319c = objArr;
        int length = objArr.length;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> X4(int i12) {
        Object[] objArr = this.f38319c;
        i0.e.a(i12, objArr.length);
        if (objArr.length == 1) {
            return f38318e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        C42756l.o(objArr, i12, objArrCopyOf, i12 + 1, objArr.length);
        return new k(objArrCopyOf);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int i12, E e12) {
        Object[] objArr = this.f38319c;
        i0.e.b(i12, objArr.length);
        if (i12 == objArr.length) {
            return add((k<E>) e12);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            C42756l.s(objArr, 0, objArr2, i12, 6);
            C42756l.o(objArr, i12 + 1, objArr2, i12, objArr.length);
            objArr2[i12] = e12;
            return new k(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C42756l.o(objArr, i12 + 1, objArrCopyOf, i12, objArr.length - 1);
        objArrCopyOf[i12] = e12;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(objArrCopyOf, objArr.length + 1, 0, objArr3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@Y61.k Collection<? extends E> collection) {
        Object[] objArr = this.f38319c;
        if (collection.size() + objArr.length > 32) {
            g gVarBuilder = builder();
            gVarBuilder.addAll(collection);
            return gVarBuilder.b();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new k(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final g builder() {
        return new g(this, null, this.f38319c, 0);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final E get(int i12) {
        i0.e.a(i12, getF38299e());
        return (E) this.f38319c[i12];
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF38299e() {
        return this.f38319c.length;
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int indexOf(Object obj) {
        return C42756l.H(obj, this.f38319c);
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f38319c;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i12 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i12 < 0) {
                    return -1;
                }
                length = i12;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i13 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i13 < 0) {
                    return -1;
                }
                length2 = i13;
            }
        }
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List
    @Y61.k
    public final ListIterator<E> listIterator(int i12) {
        Object[] objArr = this.f38319c;
        i0.e.b(i12, objArr.length);
        return new d(objArr, i12, objArr.length);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> q5(@Y61.k Y41.l<? super E, Boolean> lVar) {
        Object[] objArr = this.f38319c;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z12 = false;
        for (int i12 = 0; i12 < length2; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) ((b.a) lVar).invoke(obj)).booleanValue()) {
                if (!z12) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z12 = true;
                    length = i12;
                }
            } else if (z12) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f38318e : new k(C42756l.w(0, length, objArrCopyOf));
    }

    @Override // kotlin.collections.AbstractC42738c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int i12, E e12) {
        i0.e.a(i12, getF38299e());
        Object[] objArr = this.f38319c;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i12] = e12;
        return new k(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E e12) {
        Object[] objArr = this.f38319c;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = e12;
            return new k(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e12;
        return new f(objArr, objArr.length + 1, 0, objArr2);
    }
}
