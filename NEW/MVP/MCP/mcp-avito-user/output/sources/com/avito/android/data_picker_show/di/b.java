package com.avito.android.data_picker_show.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.datapickershow.DataPickerShowFragment;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: DataPickerShowComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/di/b;", "Lcom/avito/android/di/h;", "a", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface b extends InterfaceC29971h {

    /* compiled from: DataPickerShowComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/di/b$a;", "", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k C28478k c28478k, @l @h31.b @Y61.k DataPickerArgs dataPickerArgs, @Y61.k c cVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void fj(@Y61.k DataPickerShowFragment dataPickerShowFragment);
}
