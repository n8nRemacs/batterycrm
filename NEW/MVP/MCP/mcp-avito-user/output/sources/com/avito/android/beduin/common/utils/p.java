package com.avito.android.beduin.common.utils;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: Buttons.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {
    public static final VU.d a(Context context, BeduinIconButtonModel.Style.Shadows.Shadow shadow) {
        if (shadow == null) {
            return new VU.d(0, 0, 0, 0, 15, null);
        }
        Integer offsetX = shadow.getOffsetX();
        int iB2 = offsetX != null ? y6.b(offsetX.intValue()) : 0;
        Integer offsetY = shadow.getOffsetY();
        int iB3 = offsetY != null ? y6.b(offsetY.intValue()) : 0;
        int iB4 = C48065c.b(context, shadow.getColor(), R.attr.transparentWhite);
        Integer blurRadius = shadow.getBlurRadius();
        return new VU.d(iB2, iB3, iB4, blurRadius != null ? y6.b(blurRadius.intValue()) : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.avito.android.lib.design.button.Button r7, @Y61.l com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel.Style r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L12
            java.lang.Integer r1 = r8.getCornerRadius()
            if (r1 == 0) goto L12
            int r1 = r1.intValue()
            int r1 = com.avito.android.util.y6.b(r1)
            goto L13
        L12:
            r1 = r0
        L13:
            android.content.Context r2 = r7.getContext()
            r3 = 0
            if (r8 == 0) goto L1f
            com.avito.android.remote.model.UniversalColor r4 = r8.getBackgroundColor()
            goto L20
        L1f:
            r4 = r3
        L20:
            r5 = 2130975933(0x7f041cbd, float:1.7560731E38)
            android.content.res.ColorStateList r2 = sK0.C48065c.a(r2, r4, r5)
            if (r8 == 0) goto L3d
            com.avito.android.remote.model.UniversalColor r4 = r8.getHighlightedColor()
            if (r4 == 0) goto L3d
            android.content.Context r5 = r7.getContext()
            sK0.a r6 = sK0.C48063a.f437606a
            r6.getClass()
            android.content.res.ColorStateList r4 = sK0.C48063a.e(r5, r4)
            goto L3e
        L3d:
            r4 = r3
        L3e:
            r7.e(r1, r2, r4)
            if (r8 == 0) goto L48
            com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style$Shadows r1 = r8.getShadows()
            goto L49
        L48:
            r1 = r3
        L49:
            if (r1 == 0) goto L50
            com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style$Shadows$Shadow r2 = r1.getUpperShadow()
            goto L51
        L50:
            r2 = r3
        L51:
            if (r2 != 0) goto L60
            if (r1 == 0) goto L5a
            com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style$Shadows$Shadow r2 = r1.getBottomShadow()
            goto L5b
        L5a:
            r2 = r3
        L5b:
            if (r2 == 0) goto L5e
            goto L60
        L5e:
            r2 = r0
            goto L61
        L60:
            r2 = 1
        L61:
            if (r1 == 0) goto L73
            java.lang.Integer r4 = r1.getCornerRadius()
            if (r4 == 0) goto L73
            int r4 = r4.intValue()
            int r4 = com.avito.android.util.y6.b(r4)
            float r4 = (float) r4
            goto L74
        L73:
            r4 = 0
        L74:
            android.content.Context r5 = r7.getContext()
            if (r1 == 0) goto L7f
            com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style$Shadows$Shadow r6 = r1.getUpperShadow()
            goto L80
        L7f:
            r6 = r3
        L80:
            VU.d r5 = a(r5, r6)
            android.content.Context r6 = r7.getContext()
            if (r1 == 0) goto L8f
            com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style$Shadows$Shadow r1 = r1.getBottomShadow()
            goto L90
        L8f:
            r1 = r3
        L90:
            VU.d r1 = a(r6, r1)
            com.avito.android.lib.design.button.c r6 = r7.f178632k
            r6.h(r4, r5, r1, r2)
            r7.requestLayout()
            if (r8 == 0) goto La2
            com.avito.android.beduin.common.component.model.BeduinContainerIndent r3 = r8.getContentInsets()
        La2:
            if (r3 == 0) goto Lad
            int r8 = r3.getLeftIndent()
            int r8 = com.avito.android.util.y6.b(r8)
            goto Lae
        Lad:
            r8 = r0
        Lae:
            if (r3 == 0) goto Lb9
            int r1 = r3.getTopIndent()
            int r1 = com.avito.android.util.y6.b(r1)
            goto Lba
        Lb9:
            r1 = r0
        Lba:
            if (r3 == 0) goto Lc5
            int r2 = r3.getRightIndent()
            int r2 = com.avito.android.util.y6.b(r2)
            goto Lc6
        Lc5:
            r2 = r0
        Lc6:
            if (r3 == 0) goto Ld0
            int r0 = r3.getBottomIndent()
            int r0 = com.avito.android.util.y6.b(r0)
        Ld0:
            r7.setPadding(r8, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.utils.p.b(com.avito.android.lib.design.button.Button, com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel$Style):void");
    }
}
