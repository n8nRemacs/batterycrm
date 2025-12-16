package com.avito.android.mortgage.landing;

import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.util.B6;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: LandingView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class l extends C42801a implements Y41.p<Boolean, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        o oVar = (o) this.receiver;
        FrameLayout frameLayout = oVar.f200319t;
        if (zBooleanValue) {
            D6.w(frameLayout);
        } else {
            B6 b62 = B6.f318559a;
            View view = oVar.f200300a;
            b62.getClass();
            if (!B6.a(view)) {
                view.getRootView().clearFocus();
            }
            D6.G(frameLayout, oVar.f200298C);
        }
        oVar.f200297B = zBooleanValue;
        return G0.f406611a;
    }
}
