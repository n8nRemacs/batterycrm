package com.avito.android.cpt.activation.di;

import Nr.InterfaceC14604a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CptActivationComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/di/a;", "", "a", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CptActivationComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/di/a$a;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpt.activation.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3751a {
        @k
        a a(@k InterfaceC14604a interfaceC14604a, @k InterfaceC39417a interfaceC39417a, @h31.b @k r rVar, @j @h31.b @k String str, @h31.b @k DeepLink deepLink, @h31.b @k l lVar);
    }

    void a(@k CptActivationFragment cptActivationFragment);
}
