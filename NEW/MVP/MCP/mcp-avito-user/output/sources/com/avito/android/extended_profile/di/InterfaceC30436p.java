package com.avito.android.extended_profile.di;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.view.S0;
import com.avito.android.analytics.screens.ExtendedProfileScreen;
import com.avito.android.extended_profile.C30446i;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.extended_profile.di.r;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.Kundle;
import h31.d;
import iT.C41343c;
import kotlin.Metadata;
import oW.InterfaceC44697a;
import ob.C44742f;

/* compiled from: ExtendedProfileComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/di/p;", "", "a", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.extended_profile.di.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30436p {

    /* compiled from: ExtendedProfileComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/di/p$a;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.di.p$a */
    public interface a {
        @Y61.k
        InterfaceC30436p a(@h31.b @r.h @Y61.k String str, @h31.b @r.d @Y61.k String str2, @h31.b @r.i boolean z12, @r.b @h31.b @Y61.l SearchParams searchParams, @h31.b @Y61.l @r.a FloatingBuyBlock floatingBuyBlock, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k ExtendedProfileFragment extendedProfileFragment, @h31.b @Y61.k Resources resources, @r.c @h31.b @Y61.k FragmentManager fragmentManager, @h31.b @NB.b @Y61.k FragmentManager fragmentManager2, @h31.b @Y61.k ExtendedProfileFragment extendedProfileFragment2, @h31.b @Y61.k S0 s02, @h31.b @Y61.k ExtendedProfileFragment extendedProfileFragment3, @h31.b @Y61.l @com.avito.android.inline_filters.di.s Kundle kundle, @h31.b @Y61.k Y41.l lVar, @h31.b @Y61.k Y41.l lVar2, @V @h31.b @Y61.l Bundle bundle, @com.avito.android.advertising.di.v @h31.b @Y61.l Kundle kundle2, @h31.b @Y61.k C44742f c44742f, @h31.b @Y61.k ExtendedProfileFragment extendedProfileFragment4, @h31.b @Y61.k ExtendedProfileScreen extendedProfileScreen, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @Y61.k f.a aVar, @h31.b @Y61.k C41343c c41343c, @h31.b @Y61.k C30446i c30446i, @Y61.k C31138n0 c31138n0, @Y61.k InterfaceC30437q interfaceC30437q, @Y61.k InterfaceC44697a interfaceC44697a, @Y61.k cv.d dVar);
    }

    void a(@Y61.k ExtendedProfileFragment extendedProfileFragment);
}
