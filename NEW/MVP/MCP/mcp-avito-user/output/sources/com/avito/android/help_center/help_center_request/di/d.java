package com.avito.android.help_center.help_center_request.di;

import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.help_center.help_center_request.HelpCenterRequestFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: HelpCenterRequestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/help_center_request/di/d;", "", "a", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: HelpCenterRequestComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/help_center/help_center_request/di/d$a;", "", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @k
        a a(@l @h String str);

        @h31.b
        @k
        a b(@l @com.avito.android.help_center.help_center_request.di.a String str);

        @k
        d build();

        @h31.b
        @k
        a c(@b @l String str);

        @k
        a d(@k e eVar);
    }

    void a(@k HelpCenterRequestFragment helpCenterRequestFragment);
}
