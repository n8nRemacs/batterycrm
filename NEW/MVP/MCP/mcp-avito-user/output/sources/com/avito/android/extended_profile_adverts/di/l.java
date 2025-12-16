package com.avito.android.extended_profile_adverts.di;

import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.extended_profile_adverts.ProfileAdvertsFragment;
import com.avito.android.extended_profile_adverts.di.n;
import com.avito.android.remote.model.SearchParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import zd0.InterfaceC50550a;

/* compiled from: ProfileAdvertsComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/di/l;", "", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface l {

    /* compiled from: ProfileAdvertsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_adverts/di/l$a;", "", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        l a(@h31.b @n.g @Y61.k String str, @n.h @h31.b boolean z12, @h31.b @Y61.l @n.c String str2, @n.i @h31.b @Y61.k String str3, @h31.b @Y61.l @n.f String str4, @n.e @h31.b @Y61.l String str5, @h31.b @Y61.k Resources resources, @h31.b @Y61.k @InterfaceC50550a Screen screen, @h31.b @Y61.k @InterfaceC50550a com.avito.android.analytics.screens.r rVar, @h31.b @InterfaceC50550a boolean z13, @h31.b @Y61.k S0 s02, @n.a @h31.b @Y61.l SearchParams searchParams, @h31.b @Y61.k ProfileAdvertsFragment.b bVar, @Y61.k m mVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k ProfileAdvertsFragment profileAdvertsFragment);
}
