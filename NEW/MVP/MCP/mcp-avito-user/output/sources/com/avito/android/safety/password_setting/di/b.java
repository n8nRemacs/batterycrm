package com.avito.android.safety.password_setting.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PasswordSettingComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_setting/di/b;", "", "a", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: PasswordSettingComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/di/b$a;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k ActivityC22955m activityC22955m, @h31.b @k r rVar, @h31.b @k Resources resources, @h31.b @l Kundle kundle);
    }

    void a(@k PasswordSettingFragment passwordSettingFragment);
}
