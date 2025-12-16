package com.geetest.captcha;

import android.content.Context;
import androidx.camera.core.Q;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final g0 f342726a = new g0();

    public final int a(@Y61.k Context context, @Y61.k String str) {
        return a(context, str, "string");
    }

    public final int b(@Y61.k Context context, @Y61.k String str) {
        return a(context, str, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
    }

    public final int a(Context context, String str, String str2) {
        int identifier = context.getApplicationContext().getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            h0.f342732d.c(Q.a("ID.getIdentifier resource: ", str, ", type: ", str2, ", undefined"));
        }
        return identifier;
    }
}
