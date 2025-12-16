package com.avito.android.payment;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.Metadata;

/* compiled from: PaymentTabletViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_payment_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {
    public static final void a(@Y61.k View view, @Y61.k RecyclerView recyclerView) {
        k kVar = new k(recyclerView);
        if (view.getResources().getBoolean(R.bool.is_tablet)) {
            C37722i.e(view).N(h.f214478b).d0(i.f214479b).t0(new j(view, kVar));
        }
    }
}
