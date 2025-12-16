package com.avito.android.iac_dialer_finished.impl_module.screens.fragment_factory;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import cL.InterfaceC27060a;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenFragment;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenFragment;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.ui.fragments.BaseFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: IacDialerFinishedFragmentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/fragment_factory/a;", "LcL/a;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements InterfaceC27060a {
    @Inject
    public a() {
    }

    @Override // cL.InterfaceC27060a
    @l
    public final BaseFragment a(@k Parcelable parcelable) {
        if (parcelable instanceof IacFinishedFallbackScreenArgument) {
            IacFinishedFallbackScreenFragment.f166522u0.getClass();
            IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment = new IacFinishedFallbackScreenFragment();
            iacFinishedFallbackScreenFragment.setArguments(C22777e.b(new Q("screen_argument", (IacFinishedFallbackScreenArgument) parcelable)));
            return iacFinishedFallbackScreenFragment;
        }
        if (parcelable instanceof IacFinishedFeedbackScreenArgument) {
            IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument = (IacFinishedFeedbackScreenArgument) parcelable;
            IacFinishedFeedbackScreenFragment.f166628t0.getClass();
            IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment = new IacFinishedFeedbackScreenFragment();
            iacFinishedFeedbackScreenFragment.setArguments(C22777e.b(new Q("screen_argument", iacFinishedFeedbackScreenArgument.copy((2047 & 1) != 0 ? iacFinishedFeedbackScreenArgument.callId : null, (2047 & 2) != 0 ? iacFinishedFeedbackScreenArgument.isVideo : false, (2047 & 4) != 0 ? iacFinishedFeedbackScreenArgument.peerName : null, (2047 & 8) != 0 ? iacFinishedFeedbackScreenArgument.peerAvatar : null, (2047 & 16) != 0 ? iacFinishedFeedbackScreenArgument.peerRating : null, (2047 & 32) != 0 ? iacFinishedFeedbackScreenArgument.peerCallerReviewCount : null, (2047 & 64) != 0 ? iacFinishedFeedbackScreenArgument.scenario : null, (2047 & 128) != 0 ? iacFinishedFeedbackScreenArgument.status : null, (2047 & 256) != 0 ? iacFinishedFeedbackScreenArgument.direction : null, (2047 & 512) != 0 ? iacFinishedFeedbackScreenArgument.itemId : null, (2047 & 1024) != 0 ? iacFinishedFeedbackScreenArgument.duration : null, (2047 & 2048) != 0 ? iacFinishedFeedbackScreenArgument.availableProblems : C42745f0.r0(iacFinishedFeedbackScreenArgument.getAvailableProblems())))));
            return iacFinishedFeedbackScreenFragment;
        }
        if (!(parcelable instanceof IacFinishedMicRequestScreenArgument)) {
            return null;
        }
        IacFinishedMicRequestScreenFragment.f166698u0.getClass();
        IacFinishedMicRequestScreenFragment iacFinishedMicRequestScreenFragment = new IacFinishedMicRequestScreenFragment();
        iacFinishedMicRequestScreenFragment.setArguments(C22777e.b(new Q("screen_argument", (IacFinishedMicRequestScreenArgument) parcelable)));
        return iacFinishedMicRequestScreenFragment;
    }
}
