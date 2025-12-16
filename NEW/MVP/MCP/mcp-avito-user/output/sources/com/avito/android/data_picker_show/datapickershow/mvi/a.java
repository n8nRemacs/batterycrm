package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.data_picker_show.datapickershow.mvi.entity.DataPickerShowInternalAction;
import gu.InterfaceC40736a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DataPickerShowActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lgu/a;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "Lgu/c;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40736a, DataPickerShowInternalAction, gu.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DataPickerShowInternalAction> b(InterfaceC40736a interfaceC40736a, gu.c cVar) {
        InterfaceC40736a interfaceC40736a2 = interfaceC40736a;
        gu.c cVar2 = cVar;
        if (interfaceC40736a2 instanceof InterfaceC40736a.b) {
            return new C43210w(new DataPickerShowInternalAction.Content(null));
        }
        boolean z12 = interfaceC40736a2 instanceof InterfaceC40736a.c;
        List<String> list = cVar2.f396934c;
        if (!z12) {
            if (interfaceC40736a2.equals(InterfaceC40736a.C11235a.f396927a)) {
                return new C43210w(new DataPickerShowInternalAction.Close(list));
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = list != null ? list.get(((InterfaceC40736a.c) interfaceC40736a2).f396928a) : null;
        InterfaceC40736a.c cVar3 = (InterfaceC40736a.c) interfaceC40736a2;
        String str2 = cVar3.f396929b;
        return !L.f(str, str2) ? new C43210w(new DataPickerShowInternalAction.WheelValueSelected(cVar3.f396928a, str2)) : C43175k.w();
    }
}
