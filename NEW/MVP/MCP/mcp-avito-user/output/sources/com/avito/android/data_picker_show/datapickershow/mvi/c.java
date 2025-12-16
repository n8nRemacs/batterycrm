package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.datapickershow.mvi.entity.DataPickerShowInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DataPickerShowBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.b<DataPickerShowInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DataPickerArgs f132510a;

    @Inject
    public c(@com.avito.android.data_picker_show.di.l @Y61.k DataPickerArgs dataPickerArgs) {
        this.f132510a = dataPickerArgs;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DataPickerShowInternalAction> a() {
        return new C43210w(new DataPickerShowInternalAction.Content(this.f132510a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
