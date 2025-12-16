package com.avito.android.profile.pro.impl.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.profile_tab.summary.factory.i;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import mg.InterfaceC44079c;

/* compiled from: ProfileProComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/di/d;", "Lcom/avito/android/profile_tab/summary/factory/i$a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes16.dex */
public interface d extends i.a {

    /* compiled from: ProfileProComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/di/d$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@Y61.k e eVar, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k com.avito.android.service_booking_user_profile.view.j jVar, @Y61.k InterfaceC44079c interfaceC44079c, @Y61.k com.avito.android.seller_coach.hints_dialog.provider.l lVar, @h31.b @Y61.k Y41.l lVar2, @h31.b @Y61.k l41.g gVar, @h31.b @Y61.k Resources resources, @h31.b @Y61.k ProfileTabUserType profileTabUserType, @h31.b @Y61.k ProfileProFragment profileProFragment, @h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker);
    }

    void b(@Y61.k ProfileProFragment profileProFragment);
}
