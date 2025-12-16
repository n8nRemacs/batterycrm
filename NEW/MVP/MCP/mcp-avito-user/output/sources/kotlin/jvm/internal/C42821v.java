package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC42831n;
import kotlin.Metadata;

/* compiled from: CollectionToArray.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: kotlin.jvm.internal.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42821v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object[] f406857a = new Object[0];

    @InterfaceC42830m
    @InterfaceC42831n
    @X41.i
    @Y61.k
    public static final Object[] a(@Y61.k Collection<?> collection) {
        int size = collection.size();
        Object[] objArr = f406857a;
        if (size == 0) {
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            objArrCopyOf[i12] = it.next();
            if (i13 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i14 = ((i13 * 3) + 1) >>> 1;
                if (i14 <= i13) {
                    i14 = 2147483645;
                    if (i13 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i13);
            }
            i12 = i13;
        }
    }

    @InterfaceC42830m
    @InterfaceC42831n
    @X41.i
    @Y61.k
    public static final Object[] b(@Y61.k Collection<?> collection, @Y61.l Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i12 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        while (true) {
            int i13 = i12 + 1;
            objArrCopyOf[i12] = it.next();
            if (i13 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i14 = ((i13 * 3) + 1) >>> 1;
                if (i14 <= i13) {
                    i14 = 2147483645;
                    if (i13 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
            } else if (!it.hasNext()) {
                if (objArrCopyOf != objArr) {
                    return Arrays.copyOf(objArrCopyOf, i13);
                }
                objArr[i13] = null;
                return objArr;
            }
            i12 = i13;
        }
    }
}
