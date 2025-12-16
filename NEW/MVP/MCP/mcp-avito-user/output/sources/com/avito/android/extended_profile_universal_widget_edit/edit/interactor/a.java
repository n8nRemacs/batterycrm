package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y61.l;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import jB.InterfaceC42228b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalWidgetEditInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/interactor/a;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @Y61.k
    InterfaceC43160i a(@Y61.k UniversalWidgetSectionModel.Section section);

    void b(@Y61.k UniversalWidgetSectionModel.ImageWithTextBlock imageWithTextBlock);

    @l
    Object c(@Y61.k Continuation<? super G0> continuation);

    @Y61.k
    InterfaceC43160i<InterfaceC42228b> d(boolean z12);

    @Y61.k
    InterfaceC43160i<InterfaceC42228b> e();
}
