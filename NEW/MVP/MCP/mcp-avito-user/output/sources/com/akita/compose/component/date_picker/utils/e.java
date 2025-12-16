package com.akita.compose.component.date_picker.utils;

import Y41.l;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerDatesValidator.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "list", "Lcom/akita/compose/component/date_picker/utils/f;", "invoke", "(Ljava/util/List;)Lcom/akita/compose/component/date_picker/utils/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<List<? extends Object>, f> {
    static {
        new e();
    }

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final f invoke(List<? extends Object> list) {
        String string;
        List<? extends Object> list2 = list;
        Set set = (Set) list2.get(0);
        Set set2 = (Set) list2.get(1);
        Long l12 = (Long) list2.get(2);
        Long l13 = (Long) list2.get(3);
        Object obj = list2.get(4);
        return new f(set, set2, null, l13, l12, (obj == null || (string = obj.toString()) == null) ? null : DisableDatesOption.valueOf(string), 4, null);
    }
}
