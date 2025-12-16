package com.avito.android.component.user_hat;

import Y61.k;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: Avatar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes12.dex */
public final class b {
    @InterfaceC41178c
    public static final void a(@k SimpleDraweeView simpleDraweeView, @k com.avito.android.image_loader.a aVar, boolean z12, boolean z13) {
        if (z12) {
            simpleDraweeView.getHierarchy().n(s.c.f340137i);
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.f340152b = true;
            hierarchy.s(roundingParams);
            int i12 = z13 ? 120 : 84;
            simpleDraweeView.getLayoutParams().width = y6.b(i12);
            simpleDraweeView.getLayoutParams().height = y6.b(i12);
        } else {
            simpleDraweeView.getHierarchy().n(s.c.f340133e);
            simpleDraweeView.getHierarchy().s(RoundingParams.b(y6.b(6)));
            simpleDraweeView.getLayoutParams().width = -2;
            simpleDraweeView.getLayoutParams().height = y6.b(z13 ? 112 : 64);
        }
        C35949t5.b(simpleDraweeView, aVar, new a(simpleDraweeView));
    }
}
