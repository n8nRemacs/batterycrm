package com.avito.android.user_address;

import Y61.k;
import Y61.l;
import com.avito.android.SxAddAddressSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/g;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: UserAddressRouter.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D(int i12, @k String str, @l DeepLink deepLink, boolean z12);

    void K();

    void M(@l String str, int i12, @k String str2, @l Boolean bool);

    void O();

    void Q(@l UserAddressLink.Result.Success success);

    void U(int i12, @l String str, @k String str2);

    void Z0();

    void o1(@l String str, @k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode, @l DeepLink deepLink);

    void q1();

    void u0();

    void v0(@k String str, @k String str2, @l Integer num, @k NavigationController.Mode mode, @k JobMultiGeoLink.FlowType flowType, @l DeepLink deepLink);

    void x1(@l String str, long j12, long j13, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource);

    void z(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map);

    void z0(@l UserAddressLink.Result.Success success, @k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode);
}
