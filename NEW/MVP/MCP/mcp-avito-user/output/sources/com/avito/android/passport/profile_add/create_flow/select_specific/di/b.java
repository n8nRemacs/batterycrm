package com.avito.android.passport.profile_add.create_flow.select_specific.di;

import Y41.l;
import Y61.k;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificFragment;
import com.avito.android.passport.profile_add.perf_const.SelectSpecificScreen;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectSpecificComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/di/b;", "", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SelectSpecificComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/di/b$a;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k com.avito.android.passport.profile_add.di.a aVar, @h31.b @k S0 s02, @h31.b @k SelectSpecificArguments selectSpecificArguments, @k InterfaceC39417a interfaceC39417a, @h31.b @k Z1 z12, @h31.b @k Z1 z13, @h31.b @k Z1 z14, @h31.b @k D d12, @h31.b @k r rVar, @h31.b @k SelectSpecificScreen selectSpecificScreen, @h31.b @k l lVar, @h31.b boolean z15);
    }

    void a(@k SelectSpecificFragment selectSpecificFragment);
}
