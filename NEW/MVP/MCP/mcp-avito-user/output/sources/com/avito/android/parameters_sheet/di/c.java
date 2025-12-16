package com.avito.android.parameters_sheet.di;

import android.app.Application;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import t3.k0;
import t3.l0;

/* compiled from: ParametersListDialogComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/parameters_sheet/di/c;", "Lcom/avito/android/di/h;", "_avito_parameters-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.c
/* loaded from: classes15.dex */
public interface c extends InterfaceC29971h {
    @l0
    @Y61.k
    u3.l<SimpleTestGroupWithNone> O0();

    @Y61.k
    LlmDescriptionPresenter Y0();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    @k0
    u3.l<SimpleTestGroupWithNone> c1();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    com.avito.android.util.text.a e();

    @Y61.k
    Application k();

    @Y61.k
    AK0.l r();

    @Y61.k
    Q1 z0();
}
