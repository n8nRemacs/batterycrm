package com.avito.android.serp.adapter.serp_advert_card;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.avito.android.avito_map.marker.MarkerItemKt;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.UniversalColor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import sK0.C48063a;

/* compiled from: SerpAdvertTileCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k android.widget.TextView r9, @Y61.k android.widget.TextView r10, @Y61.l java.lang.String r11, @Y61.l com.avito.android.remote.model.DiscountIcon r12, boolean r13, boolean r14, boolean r15) {
        /*
            r0 = 11
            r1 = 0
            if (r11 == 0) goto L8c
            int r2 = r11.length()
            if (r2 != 0) goto Ld
            goto L8c
        Ld:
            if (r12 == 0) goto L37
            android.content.Context r2 = r9.getContext()
            java.lang.String r3 = r12.getName()     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r3 = com.avito.android.lib.util.q.a(r3)     // Catch: java.lang.Throwable -> L37
            com.avito.android.remote.model.UniversalColor r12 = r12.getColor()     // Catch: java.lang.Throwable -> L37
            sK0.a r4 = sK0.C48063a.f437606a     // Catch: java.lang.Throwable -> L37
            int r12 = r4.a(r2, r12)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L30
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L37
            android.graphics.drawable.Drawable r2 = com.avito.android.util.C35835l0.h(r3, r2)     // Catch: java.lang.Throwable -> L37
            goto L31
        L30:
            r2 = r1
        L31:
            if (r2 == 0) goto L37
            r2.setTint(r12)     // Catch: java.lang.Throwable -> L37
            goto L38
        L37:
            r2 = r1
        L38:
            if (r2 != 0) goto L47
            if (r14 == 0) goto L49
            android.content.Context r12 = r9.getContext()
            r14 = 2131234816(0x7f081000, float:1.8085808E38)
            android.graphics.drawable.Drawable r2 = androidx.core.content.d.getDrawable(r12, r14)
        L47:
            r4 = r2
            goto L57
        L49:
            android.content.Context r12 = r9.getContext()
            r14 = 2131234815(0x7f080fff, float:1.8085806E38)
            android.graphics.drawable.Drawable r2 = androidx.core.content.d.getDrawable(r12, r14)
            if (r2 != 0) goto L47
            return
        L57:
            if (r13 == 0) goto L68
            android.graphics.drawable.InsetDrawable r12 = new android.graphics.drawable.InsetDrawable
            r13 = 5
            int r6 = com.avito.android.util.D6.j(r9, r13)
            r8 = 0
            r5 = 0
            r7 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r4 = r12
        L68:
            com.avito.android.util.I5.d(r10, r1, r4, r0)
            if (r15 == 0) goto L71
            r9.setText(r11)
            goto L88
        L71:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r11)
            android.text.style.StrikethroughSpan r12 = new android.text.style.StrikethroughSpan
            r12.<init>()
            int r11 = r11.length()
            r13 = 33
            r14 = 0
            r10.setSpan(r12, r14, r11, r13)
            com.avito.android.util.I5.a(r9, r10, r14)
        L88:
            com.avito.android.util.D6.H(r9)
            goto L97
        L8c:
            com.avito.android.util.I5.d(r10, r1, r1, r0)
            java.lang.String r10 = ""
            r9.setText(r10)
            com.avito.android.util.D6.w(r9)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.serp_advert_card.D.a(android.widget.TextView, android.widget.TextView, java.lang.String, com.avito.android.remote.model.DiscountIcon, boolean, boolean, boolean):void");
    }

    @Y61.k
    public static final void c(@Y61.k SpannableString spannableString, @Y61.k RadiusInfo radiusInfo, @Y61.k Context context) {
        UniversalColor color = radiusInfo.getColor();
        if (color != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C48063a.f437606a.a(context, color));
            String distance = radiusInfo.getDistance();
            if (distance != null) {
                spannableString.setSpan(foregroundColorSpan, 0, distance.length(), 17);
            }
        }
    }

    @Y61.k
    public static final String d(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        if (str == null || str.length() == 0) {
            u0 u0Var = u0.f406856a;
            return String.format("%s", Arrays.copyOf(new Object[]{radiusInfo.getDistance()}, 1));
        }
        u0 u0Var2 = u0.f406856a;
        return String.format(MarkerItemKt.ID_LITE_MARKER, Arrays.copyOf(new Object[]{radiusInfo.getDistance(), radiusInfo.getDelimiter(), str}, 3));
    }
}
