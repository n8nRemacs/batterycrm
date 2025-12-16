package com.avito.android.beduin.common.component.label.joiner.style_extractor;

import android.content.Context;
import android.content.res.ColorStateList;
import com.avito.android.beduin.network.model.FontProperties;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.F5;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: FontStyleExtractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/style_extractor/a;", "Lcom/avito/android/beduin/common/component/label/joiner/style_extractor/d;", "Lcom/avito/android/beduin/network/model/FontProperties;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements d<FontProperties> {
    @Inject
    public a() {
    }

    public static F5 a(Context context, FontProperties fontProperties) {
        ColorStateList colorStateListE;
        if (fontProperties == null) {
            return new F5(null, null, null, null, null, null, null, 127, null);
        }
        String style = fontProperties.getStyle();
        if (style == null) {
            style = "body";
        }
        Integer numQ = com.avito.android.lib.util.f.q(style);
        F5 f5F = numQ != null ? C48065c.f(C35835l0.j(numQ.intValue(), context), context) : new F5(null, null, null, null, null, null, null, 127, null);
        UniversalColor color = fontProperties.getColor();
        if (color != null) {
            C48063a.f437606a.getClass();
            colorStateListE = C48063a.e(context, color);
        } else {
            colorStateListE = null;
        }
        Float fValueOf = fontProperties.getSize() != null ? Float.valueOf(y6.b((int) r12.floatValue())) : null;
        if (colorStateListE == null) {
            colorStateListE = f5F.f318605b;
        }
        ColorStateList colorStateList = colorStateListE;
        if (fValueOf == null) {
            fValueOf = f5F.f318607d;
        }
        return new F5(f5F.f318604a, colorStateList, f5F.f318606c, fValueOf, f5F.f318608e, f5F.f318609f, f5F.f318610g);
    }
}
