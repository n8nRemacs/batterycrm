package androidx.compose.material3;

import androidx.compose.material3.D6;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/z6;", "invoke", "(Ljava/util/List;)Landroidx/compose/material3/z6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21989y6 extends kotlin.jvm.internal.N implements Y41.l<List, C22011z6> {
    @Override // Y41.l
    public final C22011z6 invoke(List list) {
        List list2 = list;
        Long l12 = (Long) list2.get(0);
        Long l13 = (Long) list2.get(1);
        Long l14 = (Long) list2.get(2);
        kotlin.ranges.l lVar = new kotlin.ranges.l(((Integer) list2.get(3)).intValue(), ((Integer) list2.get(4)).intValue(), 1);
        int iIntValue = ((Integer) list2.get(5)).intValue();
        D6.a aVar = D6.f34620b;
        return new C22011z6(l12, l13, l14, lVar, iIntValue, null, null, null);
    }
}
