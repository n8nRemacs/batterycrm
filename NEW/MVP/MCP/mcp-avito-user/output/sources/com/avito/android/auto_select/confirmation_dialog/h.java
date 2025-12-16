package com.avito.android.auto_select.confirmation_dialog;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectConfirmationBottomSheetV2.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcf/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcf/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<cf.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectConfirmationBottomSheetV2 f95891l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2) {
        super(1);
        this.f95891l = autoSelectConfirmationBottomSheetV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(cf.d r14) throws android.content.res.Resources.NotFoundException {
        /*
            r13 = this;
            cf.d r14 = (cf.d) r14
            com.avito.android.auto_select.confirmation_dialog.g r7 = new com.avito.android.auto_select.confirmation_dialog.g
            com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetV2 r8 = r13.f95891l
            androidx.lifecycle.O0 r0 = r8.f95873j0
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            df.a r2 = (df.C39720a) r2
            java.lang.String r5 = "accept(Ljava/lang/Object;)V"
            r6 = 0
            r1 = 1
            java.lang.Class<df.a> r3 = df.C39720a.class
            java.lang.String r4 = "accept"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.widget.TextView r0 = r8.f95874k0
            r1 = 0
            if (r0 != 0) goto L21
            r0 = r1
        L21:
            com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectConfirmationDialogContent r2 = r14.f58082c
            java.lang.CharSequence r3 = r2.f95921c
            r4 = 0
            com.avito.android.util.I5.a(r0, r3, r4)
            android.widget.LinearLayout r0 = r8.f95875l0
            if (r0 != 0) goto L2e
            r0 = r1
        L2e:
            int r3 = r0.getChildCount()
            r5 = 1
            int r3 = r3 - r5
            r0.removeViews(r5, r3)
            android.content.Context r0 = r8.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131165523(0x7f070153, float:1.7945266E38)
            int r0 = r0.getDimensionPixelOffset(r3)
            java.util.List<com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectTypedButton> r2 = r2.f95922d
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()
            com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectTypedButton r3 = (com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectTypedButton) r3
            android.widget.LinearLayout r6 = r8.f95875l0
            if (r6 != 0) goto L5d
            r6 = r1
        L5d:
            android.app.Dialog r9 = r8.requireDialog()
            android.content.Context r9 = r9.getContext()
            java.lang.String r10 = r3.f95924b
            com.avito.android.auto_select.confirmation_dialog.e r11 = new com.avito.android.auto_select.confirmation_dialog.e
            r11.<init>(r3, r7, r14)
            com.avito.android.auto_select_core.ui.models.AutoSelectButtonStyle r12 = r3.f95926d
            com.avito.android.lib.design.button.Button r9 = lf.C43763b.a(r9, r10, r11, r12, r0)
            boolean r10 = r14.f58083d
            if (r10 == 0) goto L7e
            com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectButtonType r10 = com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectButtonType.f95916b
            com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectButtonType r3 = r3.f95925c
            if (r3 != r10) goto L7e
            r3 = r5
            goto L7f
        L7e:
            r3 = r4
        L7f:
            r9.setLoading(r3)
            r6.addView(r9)
            goto L4c
        L86:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_select.confirmation_dialog.h.invoke(java.lang.Object):java.lang.Object");
    }
}
