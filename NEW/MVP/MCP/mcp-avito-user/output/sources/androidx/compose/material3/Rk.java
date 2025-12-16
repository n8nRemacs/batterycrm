package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "value", "Landroidx/compose/material3/Sk;", "invoke", "(Ljava/util/List;)Landroidx/compose/material3/Sk;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Rk extends kotlin.jvm.internal.N implements Y41.l<List, Sk> {
    static {
        new Rk();
    }

    public Rk() {
        super(1);
    }

    @Override // Y41.l
    public final Sk invoke(List list) {
        List list2 = list;
        return new Sk(((Integer) list2.get(0)).intValue(), ((Integer) list2.get(1)).intValue(), ((Boolean) list2.get(2)).booleanValue());
    }
}
