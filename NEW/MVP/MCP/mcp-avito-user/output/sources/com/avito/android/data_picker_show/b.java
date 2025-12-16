package com.avito.android.data_picker_show;

import Y61.k;
import android.os.Bundle;
import com.avito.android.data_picker_show.datapickershow.DataPickerShowFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DataPickerShowDialogFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/data_picker_show/b;", "Lcom/avito/android/data_picker_show/a;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.data_picker_show.a
    @k
    public final DataPickerShowFragment a(@k DataPickerArgs dataPickerArgs, @k String str) {
        DataPickerShowFragment.f132472s0.getClass();
        DataPickerShowFragment dataPickerShowFragment = new DataPickerShowFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data_picker.args", dataPickerArgs);
        bundle.putString("data_picker.request_key", str);
        dataPickerShowFragment.setArguments(bundle);
        return dataPickerShowFragment;
    }
}
