package com.avito.android.advertising.ui;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: AdViewHolder+Avl.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    public static final void a(@Y61.k e eVar, boolean z12) {
        Drawable drawableH;
        TextView f6596j = eVar.getF6596j();
        if (f6596j != null) {
            if (z12 || (drawableH = C35835l0.h(R.attr.ic_openInNew16, eVar.getF88600b().getContext())) == null) {
                drawableH = null;
            } else {
                drawableH.setBounds(0, 0, y6.b(16), y6.b(16));
            }
            I5.d(f6596j, drawableH, null, 14);
        }
        TextView f6596j2 = eVar.getF6596j();
        if (f6596j2 == null) {
            return;
        }
        f6596j2.setCompoundDrawablePadding(z12 ? 0 : y6.b(3));
    }

    public static final void b(@Y61.k e eVar, boolean z12) {
        int iT2;
        D6.G(eVar.uC(), z12);
        ViewGroup f7319x = eVar.getF7319x();
        if (f7319x != null) {
            if (z12) {
                iT2 = D6.t(eVar.getF88600b(), R.dimen.ad_avl_icon_to_text) + D6.t(eVar.getF88600b(), R.dimen.ad_avl_icon_size);
            } else {
                iT2 = 0;
            }
            D6.c(f7319x, Integer.valueOf(iT2), null, null, null, 14);
        }
    }
}
