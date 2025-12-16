package com.avito.android.early_access_advert.di;

import Wx.InterfaceC15806a;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import h31.d;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertFeedbackComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/di/f;", "", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface f {

    /* compiled from: EarlyAccessAdvertFeedbackComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access_advert/di/f$a;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        f a(@k e eVar, @h31.b @k C28478k c28478k, @InterfaceC15806a @h31.b @k String str, @h31.b @k EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @h31.b @k EarlyAccessFeedback earlyAccessFeedback);
    }

    void a(@k EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment);
}
