package com.avito.android.photo_picker.legacy.di;

import android.app.Application;
import android.content.Context;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.b0;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.image.enhancement.InterfaceC30973d;
import com.avito.android.permissions.G;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import kotlin.Metadata;
import t3.e0;

/* compiled from: PhotoPickerDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/e;", "Lcom/avito/android/di/h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface e extends InterfaceC29971h {
    @Y61.k
    InterfaceC30973d E4();

    @Y61.k
    com.avito.android.photo_cache.b F();

    @e0
    @Y61.k
    u3.l<SimpleTestGroupWithNone> H4();

    @Y61.k
    G N();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    b0 Z3();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    HM.a d7();

    @Y61.k
    Context g();

    @Y61.k
    com.avito.android.computer_vision.a g6();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    Application k();

    @Y61.k
    InterfaceC35863o4 m();

    @Y61.k
    L0 z();
}
