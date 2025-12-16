package com.avito.android.extended_profile_universal_widget_edit.edit_block.di;

import Y61.k;
import android.app.Application;
import android.content.Context;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.extended_profile_image_edit.u;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: UniversalWidgetEditBlockDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/di/c;", "Lcom/avito/android/di/h;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes13.dex */
public interface c extends InterfaceC29971h {
    @k
    com.avito.android.photo_cache.b F();

    @k
    D0 S2();

    @k
    PhotoPickerIntentFactory X();

    @k
    InterfaceC28481c b();

    @k
    R0 c();

    @k
    Context g();

    @k
    Application k();

    @k
    InterfaceC35863o4 m();

    @k
    Gson s();

    @k
    u u2();
}
