package com.avito.android.referral_program.di;

import C11.b;
import Y61.k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.referral_program.ReferralPageStatusBarFragment;
import kotlin.Metadata;

/* compiled from: ReferralPageComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/di/e;", "", "a", "b", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: ReferralPageComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_program/di/e$a;", "", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        e a(@k C31138n0 c31138n0, @h31.b @k String str);
    }

    /* compiled from: ReferralPageComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_program/di/e$b;", "Lcom/avito/android/di/h;", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        a og();
    }

    void a(@k ReferralPageStatusBarFragment referralPageStatusBarFragment);
}
