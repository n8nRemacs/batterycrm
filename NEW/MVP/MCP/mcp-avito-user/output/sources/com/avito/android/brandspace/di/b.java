package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.brandspace.brandspace.BrandspaceFragmentMvi;
import com.avito.android.brandspace.view.BrandspaceFragment;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.ui.fragments.TabBaseFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: BrandspaceFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/di/b;", "", "a", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BrandspaceFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/di/b$a;", "", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k @j String str, @h31.b @k @Y61.k String str2, @l @h31.b @Y61.l String str3, @h31.b @Y61.k TabBaseFragment tabBaseFragment, @h31.b @Y61.k TabBaseFragment tabBaseFragment2, @h31.b @Y61.k r rVar, @Y61.l C31138n0 c31138n0, @Y61.k c cVar, @Y61.k InterfaceC30106l7 interfaceC30106l7, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k BrandspaceFragmentMvi brandspaceFragmentMvi);

    void b(@Y61.k BrandspaceFragment brandspaceFragment);
}
