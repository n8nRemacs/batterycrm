package com.akita.compose.component.date_picker;

import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: StateData.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "list", "Lcom/akita/compose/component/date_picker/K;", "invoke", "(Ljava/util/List;)Lcom/akita/compose/component/date_picker/K;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class J extends N implements Y41.l<List<? extends Object>, K> {

    /* renamed from: l, reason: collision with root package name */
    public static final J f61168l = new J();

    /* compiled from: StateData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DatePickerSelectionType.Key.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DatePickerSelectionType.Key key = DatePickerSelectionType.Key.f61201b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DatePickerSelectionType.Key key2 = DatePickerSelectionType.Key.f61201b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DatePickerSelectionType.Key key3 = DatePickerSelectionType.Key.f61201b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public J() {
        super(1);
    }

    @Override // Y41.l
    public final K invoke(List<? extends Object> list) {
        DatePickerSelectionType aVar;
        List<? extends Object> list2 = list;
        List list3 = (List) list2.get(0);
        Long l12 = (Long) list2.get(1);
        boolean zBooleanValue = ((Boolean) list2.get(2)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list2.get(3)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) list2.get(4)).booleanValue();
        int iOrdinal = DatePickerSelectionType.Key.valueOf((String) list2.get(5)).ordinal();
        if (iOrdinal == 0) {
            aVar = DatePickerSelectionType.c.f61211a;
        } else if (iOrdinal == 1) {
            Object obj = list2.get(6);
            aVar = new DatePickerSelectionType.a(obj instanceof Integer ? (Integer) obj : null);
        } else if (iOrdinal == 2) {
            aVar = DatePickerSelectionType.d.f61213a;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = DatePickerSelectionType.b.f61209a;
        }
        Object obj2 = list2.get(7);
        return new K(zBooleanValue3, l12, list3, zBooleanValue, zBooleanValue2, aVar, obj2 instanceof Long ? (Long) obj2 : null, ((Integer) list2.get(8)).intValue(), ((Boolean) list2.get(9)).booleanValue(), null, 512, null);
    }
}
