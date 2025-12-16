package com.avito.android.deal_confirmation.sheet;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DealConfirmationSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "terminalResult", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DealConfirmationSheetActivity f132798b;

    public h(DealConfirmationSheetActivity dealConfirmationSheetActivity) {
        this.f132798b = dealConfirmationSheetActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    @Override // l41.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r13) {
        /*
            r12 = this;
            kv.a r13 = (kv.C43501a) r13
            Ju.c r13 = r13.f413261b
            boolean r0 = r13 instanceof Ju.C14248b
            com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity r1 = r12.f132798b
            r2 = 0
            if (r0 == 0) goto L1b
            com.avito.android.util.V2 r13 = com.avito.android.util.V2.f318762a
            java.lang.String r0 = "Trying to open unknown deeplink on deal confirmation sheet"
            r13.e(r0, r2)
            com.avito.android.deal_confirmation.sheet.c r13 = r1.f132777o
            if (r13 == 0) goto L84
            r13.r()
            goto L84
        L1b:
            boolean r0 = r13 instanceof com.avito.android.deal_confirmation.deep_link.a.AbstractC3975a.b
            r3 = 1
            if (r0 == 0) goto L45
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.avito.android.deal_confirmation.deep_link.a$a$b r13 = (com.avito.android.deal_confirmation.deep_link.a.AbstractC3975a.b) r13
            java.lang.String r13 = r13.f132745b
            java.lang.String r4 = "result_key.message"
            r0.putExtra(r4, r13)
            kotlin.G0 r13 = kotlin.G0.f406611a
            r13 = -1
            r1.setResult(r13, r0)
            com.avito.android.deal_confirmation.sheet.c r13 = r1.f132777o
            if (r13 == 0) goto L3f
            r13.f132786G = r3
            r13.r()
            kotlin.G0 r2 = kotlin.G0.f406611a
        L3f:
            if (r2 != 0) goto L84
            r1.finish()
            goto L84
        L45:
            boolean r0 = r13 instanceof com.avito.android.deal_confirmation.deep_link.a.AbstractC3975a.C3976a
            if (r0 == 0) goto L84
            com.avito.android.deal_confirmation.deep_link.a$a$a r13 = (com.avito.android.deal_confirmation.deep_link.a.AbstractC3975a.C3976a) r13
            java.lang.String r13 = r13.f132744b
            if (r13 == 0) goto L74
            com.avito.android.deal_confirmation.sheet.c r5 = r1.f132777o
            if (r5 == 0) goto L6e
            com.avito.android.component.toast.c r4 = com.avito.android.component.toast.c.f125244a
            com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.f(r13)
            com.avito.android.component.toast.f$c$a r13 = com.avito.android.component.toast.f.c.f125255c
            r13.getClass()
            com.avito.android.component.toast.f$c r8 = com.avito.android.component.toast.f.c.a.b()
            com.avito.android.lib.design.toast_bar.ToastBarPosition r10 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
            r7 = 0
            r9 = 0
            r11 = 942(0x3ae, float:1.32E-42)
            com.avito.android.component.toast.c.d(r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.G0 r13 = kotlin.G0.f406611a
            goto L6f
        L6e:
            r13 = r2
        L6f:
            if (r13 != 0) goto L72
            goto L74
        L72:
            r2 = r13
            goto L7f
        L74:
            com.avito.android.deal_confirmation.sheet.c r13 = r1.f132777o
            if (r13 == 0) goto L7f
            r13.f132786G = r3
            r13.r()
            kotlin.G0 r2 = kotlin.G0.f406611a
        L7f:
            if (r2 != 0) goto L84
            r1.finish()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.deal_confirmation.sheet.h.accept(java.lang.Object):void");
    }
}
