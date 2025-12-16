package com.avito.android.profile_settings_basic.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.profile_settings_basic.BasicProfileSettingsFragment;
import com.avito.android.profile_settings_basic.BasicProfileSettingsScreen;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: BasicProfileSettingsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/di/a;", "", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: BasicProfileSettingsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/di/a$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC6961a {
        @k
        a a(@h31.b @k BasicProfileSettingsFragment basicProfileSettingsFragment, @h31.b @k Resources resources, @h31.b @k l lVar, @h31.b @k r rVar, @h31.b @k BasicProfileSettingsScreen basicProfileSettingsScreen, @h31.b @Y61.l @g String str, @h31.b @k FragmentManager fragmentManager, @k InterfaceC29970g interfaceC29970g, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k BasicProfileSettingsFragment basicProfileSettingsFragment);
}
