package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.data_picker_show.datapickershow.mvi.entity.DataPickerShowInternalAction;
import gu.InterfaceC40737b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DataPickerShowOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "Lgu/b;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<DataPickerShowInternalAction, InterfaceC40737b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40737b b(DataPickerShowInternalAction dataPickerShowInternalAction) {
        DataPickerShowInternalAction dataPickerShowInternalAction2 = dataPickerShowInternalAction;
        if (dataPickerShowInternalAction2 instanceof DataPickerShowInternalAction.Close) {
            return new InterfaceC40737b.a(((DataPickerShowInternalAction.Close) dataPickerShowInternalAction2).f132517b);
        }
        return null;
    }
}
