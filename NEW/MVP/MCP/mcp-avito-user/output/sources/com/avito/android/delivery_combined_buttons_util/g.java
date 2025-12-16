package com.avito.android.delivery_combined_buttons_util;

import android.view.animation.OvershootInterpolator;
import androidx.transition.C23494e;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.util.Q5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: DeliveryCombinedButtonsView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/Q5;", "Landroidx/transition/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/Q5;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<Q5<C23494e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f134993l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(Q5<C23494e> q52) {
        Q5<C23494e> q53 = q52;
        e.a aVar = kotlin.time.e.f410651c;
        q53.d().E(kotlin.time.e.e(kotlin.time.g.g(Constants.MINIMAL_ERROR_STATUS_CODE, DurationUnit.f410633e)));
        q53.f318729d = new OvershootInterpolator();
        q53.a(R.id.combined_cart_button);
        return G0.f406611a;
    }
}
