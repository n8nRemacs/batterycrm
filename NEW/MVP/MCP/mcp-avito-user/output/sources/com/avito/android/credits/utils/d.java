package com.avito.android.credits.utils;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.credit_broker.Icon;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: Icons.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_credits_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    @l
    public static final Drawable a(@k Icon icon, @k Context context) {
        Drawable drawableH;
        String name = icon.getName();
        if (name == null) {
            return null;
        }
        UniversalColor dynamicColor = icon.getDynamicColor();
        Integer numValueOf = dynamicColor != null ? Integer.valueOf(C48063a.f437606a.a(context, dynamicColor)) : null;
        Integer numA = q.a(name);
        if (numA == null || (drawableH = C35835l0.h(numA.intValue(), context)) == null) {
            return null;
        }
        if (numValueOf != null) {
            V0.a(drawableH, numValueOf.intValue());
        }
        return drawableH;
    }
}
