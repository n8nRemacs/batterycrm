package ur0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SerpItemSorter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lur0/b;", "Lur0/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ur0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49105b implements InterfaceC49104a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    @Override // ur0.InterfaceC49104a
    @k
    public final List a(int i12, @k List list) {
        if (i12 == 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        LinkedList linkedList = new LinkedList(list);
        while (!linkedList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator = linkedList.listIterator();
            int i13 = 0;
            while (listIterator.hasNext() && i13 < i12) {
                l1 l1Var = (l1) listIterator.next();
                int f84435n = l1Var.getF84435n();
                if (f84435n > i12) {
                    f84435n = i12;
                }
                int i14 = f84435n + i13;
                if (i14 > i12) {
                    PersistableSerpItem persistableSerpItem = l1Var instanceof PersistableSerpItem ? (PersistableSerpItem) l1Var : null;
                    if (persistableSerpItem == null || !persistableSerpItem.getF68263k()) {
                        int i15 = i14 - i12;
                        Collection<?> arrayList3 = new ArrayList();
                        int size = arrayList2.size() - 1;
                        int i16 = 0;
                        while (true) {
                            if (-1 >= size) {
                                break;
                            }
                            l1 l1Var2 = (l1) arrayList2.get(size);
                            int f84435n2 = l1Var2.getF84435n();
                            if (f84435n2 > i12) {
                                f84435n2 = i12;
                            }
                            if (f84435n2 == i15) {
                                arrayList3 = C42745f0.e0(l1Var2);
                                i16 = f84435n2;
                                break;
                            }
                            int i17 = f84435n2 + i16;
                            if (i17 < i15) {
                                arrayList3.add(l1Var2);
                                i16 = i17;
                            }
                            size--;
                        }
                        if (i16 != i15) {
                            arrayList3 = C42784z0.f406748b;
                        }
                        Collection<?> collection = arrayList3;
                        if (!collection.isEmpty()) {
                            arrayList2.removeAll(collection);
                            arrayList2.add(l1Var);
                            listIterator.remove();
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                listIterator.add((l1) it.next());
                            }
                            i13 = i12;
                        }
                    }
                } else {
                    arrayList2.add(l1Var);
                    listIterator.remove();
                    i13 = i14;
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
