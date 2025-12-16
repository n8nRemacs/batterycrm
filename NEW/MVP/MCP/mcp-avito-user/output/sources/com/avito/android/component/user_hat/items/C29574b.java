package com.avito.android.component.user_hat.items;

import com.avito.android.R;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import m.C43852a;

/* compiled from: ParticularProfile.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.component.user_hat.items.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29574b {
    public static final void a(@Y61.k SimpleDraweeView simpleDraweeView) {
        simpleDraweeView.setForeground(C43852a.a(simpleDraweeView.getContext(), R.drawable.bg_btn_circle));
        simpleDraweeView.getHierarchy().n(s.c.f340137i);
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.f340152b = true;
        hierarchy.s(roundingParams);
    }
}
