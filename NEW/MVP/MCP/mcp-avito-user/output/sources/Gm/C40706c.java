package gm;

import Y61.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pm.C47111b;

/* compiled from: SaleBlockItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: gm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40706c {
    @k
    public static final ArrayList a(@k List list) {
        List<C40705b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C40705b c40705b : list2) {
            arrayList.add(new C47111b(c40705b.f396773b, c40705b.f396779h, c40705b.f396777f));
        }
        return arrayList;
    }
}
