package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import android.view.View;
import com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135424b;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        switch (this.f135424b) {
            case 0:
                int i12 = l.f135425A;
                if (!z12) {
                    K2.f(view, 3);
                    break;
                }
                break;
            default:
                EarlyAccessAdvertFeedbackFragment.a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
                if (!z12) {
                    K2.d(view, true);
                    break;
                }
                break;
        }
    }
}
