package com.avito.android.payment.webview;

import android.content.res.Resources;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.data.DialogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultWebPaymentResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/webview/DefaultWebPaymentResourceProvider;", "Lcom/avito/android/payment/WebPaymentResourceProviderImpl;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultWebPaymentResourceProvider extends WebPaymentResourceProviderImpl {
    public /* synthetic */ DefaultWebPaymentResourceProvider(Resources resources, String str, DialogInfo dialogInfo, int i12, C42822w c42822w) {
        this(resources, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : dialogInfo);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DefaultWebPaymentResourceProvider(@Y61.k android.content.res.Resources r17, @Y61.l java.lang.String r18, @Y61.l com.avito.android.payment.data.DialogInfo r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            if (r18 == 0) goto L20
            boolean r2 = kotlin.text.C43066x.K(r18)
            if (r2 != 0) goto Le
            r2 = r18
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L20
            r2 = 2131955996(0x7f13111c, float:1.9548535E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r18}
            java.lang.String r2 = r0.getString(r2, r3)
            if (r2 == 0) goto L20
        L1e:
            r4 = r2
            goto L23
        L20:
            java.lang.String r2 = ""
            goto L1e
        L23:
            if (r19 == 0) goto L2e
            java.lang.String r2 = r19.getTitle()
            if (r2 != 0) goto L2c
            goto L2e
        L2c:
            r5 = r2
            goto L36
        L2e:
            r2 = 2131955955(0x7f1310f3, float:1.9548452E38)
            java.lang.String r2 = r0.getString(r2)
            goto L2c
        L36:
            if (r19 == 0) goto L3c
            java.lang.String r1 = r19.getSubtitle()
        L3c:
            r6 = r1
            if (r19 == 0) goto L48
            java.lang.String r1 = r19.getNegativeButtonTitle()
            if (r1 != 0) goto L46
            goto L48
        L46:
            r8 = r1
            goto L50
        L48:
            r1 = 2131955578(0x7f130f7a, float:1.9547687E38)
            java.lang.String r1 = r0.getString(r1)
            goto L46
        L50:
            if (r19 == 0) goto L5b
            java.lang.String r1 = r19.getPositiveButtonTitle()
            if (r1 != 0) goto L59
            goto L5b
        L59:
            r7 = r1
            goto L63
        L5b:
            r1 = 2131958262(0x7f1319f6, float:1.9553131E38)
            java.lang.String r1 = r0.getString(r1)
            goto L59
        L63:
            r1 = 2131955967(0x7f1310ff, float:1.9548476E38)
            java.lang.String r9 = r0.getString(r1)
            r1 = 2131955966(0x7f1310fe, float:1.9548474E38)
            java.lang.String r10 = r0.getString(r1)
            r1 = 2131955721(0x7f131009, float:1.9547977E38)
            java.lang.String r11 = r0.getString(r1)
            r1 = 2131953019(0x7f13057b, float:1.9542497E38)
            java.lang.String r12 = r0.getString(r1)
            r1 = 2131953403(0x7f1306fb, float:1.9543276E38)
            java.lang.String r14 = r0.getString(r1)
            r1 = 2131953402(0x7f1306fa, float:1.9543274E38)
            java.lang.String r15 = r0.getString(r1)
            r13 = 2131233928(0x7f080c88, float:1.8084007E38)
            r3 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.payment.webview.DefaultWebPaymentResourceProvider.<init>(android.content.res.Resources, java.lang.String, com.avito.android.payment.data.DialogInfo):void");
    }
}
