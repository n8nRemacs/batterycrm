package com.avito.android.personal_selections.di;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.personal_selections.mvi.o;
import com.avito.android.user_adverts.tab_screens.di.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import kotlin.Metadata;
import n70.InterfaceC44207a;

/* compiled from: PersonalSelectionsFeatureProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_selections/di/c;", "", "a", "b", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PersonalSelectionsFeatureProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_selections/di/c$a;", "", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        InterfaceC28373a a();

        @k
        R0 c();

        @k
        InterfaceC44207a y6();
    }

    /* compiled from: PersonalSelectionsFeatureProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_selections/di/c$b;", "", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        c a(@k m mVar, @k InterfaceC39417a interfaceC39417a, @k com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h hVar, @k com.avito.android.personal_selections.mvi.a aVar);
    }

    @k
    o.a a();

    @k
    com.avito.android.personal_selections.view.a b();

    @k
    com.avito.android.personal_selections.view.d c();
}
