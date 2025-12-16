package com.avito.android.str_booking.ui.delegates;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22823h0;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenInsetsDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/delegates/g;", "Lcom/avito/android/str_booking/ui/delegates/e;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {
    @Override // com.avito.android.str_booking.ui.delegates.e
    public final void a(@k View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.str_toolbar);
        if (frameLayout == null) {
            return;
        }
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setBackground(null);
        }
        C22823h0.K(view, new com.avito.android.gig_shift_action.ui.a(6, frameLayout, view));
    }
}
