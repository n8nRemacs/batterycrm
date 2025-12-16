package z10;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import z10.InterfaceC50351d;

/* compiled from: OfferItem.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-calculator_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50352e {
    @l
    public static final InterfaceC50351d.a a(@k Y41.l lVar, @k ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                break;
            }
        }
        if (next instanceof InterfaceC50351d.a) {
            return (InterfaceC50351d.a) next;
        }
        return null;
    }
}
