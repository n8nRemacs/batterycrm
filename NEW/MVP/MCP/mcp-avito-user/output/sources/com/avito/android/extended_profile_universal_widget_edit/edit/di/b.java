package com.avito.android.extended_profile_universal_widget_edit.edit.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: UniversalWidgetEditComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/di/b;", "", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: UniversalWidgetEditComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/di/b$a;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k UniversalWidgetEditArguments universalWidgetEditArguments, @h31.b @k C28478k c28478k, @h31.b @k UniversalWidgetEditFragment universalWidgetEditFragment, @h31.b @k Resources resources, @h31.b @k l lVar, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k UniversalWidgetEditFragment universalWidgetEditFragment);
}
