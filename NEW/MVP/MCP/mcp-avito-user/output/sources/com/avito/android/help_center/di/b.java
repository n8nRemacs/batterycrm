package com.avito.android.help_center.di;

import Y61.l;
import com.avito.android.di.B;
import com.avito.android.help_center.HelpCenterFragment;
import com.avito.android.help_center.HelpCenterPresenterState;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: HelpCenterComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/di/b;", "", "a", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: HelpCenterComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/di/b$a;", "", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @Y61.k
        a b(@Y61.k c cVar);

        @Y61.k
        b build();

        @h31.b
        @Y61.k
        a c(@l @k String str);

        @h31.b
        @Y61.k
        a d(@l HelpCenterPresenterState helpCenterPresenterState);
    }

    void a(@Y61.k HelpCenterFragment helpCenterFragment);
}
