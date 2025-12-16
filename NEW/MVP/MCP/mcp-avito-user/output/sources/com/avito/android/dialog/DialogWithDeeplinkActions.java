package com.avito.android.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import iR.C41336a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DialogWithDeeplinkActions.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/dialog/DialogWithDeeplinkActions;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DialogWithDeeplinkActions extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    public DeepLinksDialogInfo f144750h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f144751i0;

    public DialogWithDeeplinkActions() {
        super(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f5(com.avito.android.dialog.DialogWithDeeplinkActions r2, com.avito.android.deep_linking.links.DeepLink r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L7
            r2.g5(r0, r0)
            goto L37
        L7:
            boolean r1 = r2.i5(r3)
            if (r1 == 0) goto L11
            r2.g5(r0, r0)
            goto L37
        L11:
            r2.g5(r3, r4)
            androidx.fragment.app.Fragment r4 = r2.getParentFragment()
            if (r4 == 0) goto L27
            boolean r1 = r4 instanceof com.avito.android.dialog.A
            if (r1 == 0) goto L21
            com.avito.android.dialog.A r4 = (com.avito.android.dialog.A) r4
            goto L22
        L21:
            r4 = r0
        L22:
            if (r4 != 0) goto L25
            goto L27
        L25:
            r0 = r4
            goto L32
        L27:
            androidx.fragment.app.m r2 = r2.l1()
            boolean r4 = r2 instanceof com.avito.android.dialog.A
            if (r4 == 0) goto L32
            r0 = r2
            com.avito.android.dialog.A r0 = (com.avito.android.dialog.A) r0
        L32:
            if (r0 == 0) goto L37
            r0.a(r3)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.dialog.DialogWithDeeplinkActions.f5(com.avito.android.dialog.DialogWithDeeplinkActions, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    public final void g5(DeepLink deepLink, String str) {
        C41336a.C11375a.a();
        dismiss();
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("key_deeplink", deepLink);
        bundle.putString("key_action_title", str);
        getParentFragmentManager().o0(bundle, tag);
    }

    public void h5() {
        g5(null, null);
    }

    public boolean i5(@Y61.k DeepLink deepLink) {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@Y61.k DialogInterface dialogInterface) {
        C41336a.C11375a.a();
        g5(null, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        k5();
        Bundle arguments = getArguments();
        this.f144750h0 = arguments != null ? (DeepLinksDialogInfo) arguments.getParcelable("key_dialog_info") : null;
        Bundle arguments2 = getArguments();
        this.f144751i0 = arguments2 != null ? arguments2.getBoolean("key_re23_style") : false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        if (bundle == null) {
            j5();
        }
        Context contextThemeWrapper = this.f144751i0 ? new ContextThemeWrapper(requireContext(), R.style.Theme_DesignSystem_Re23) : requireContext();
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        int i12 = this.f144751i0 ? R.style.Re23_Modal_Default : R.style.Modal_Default;
        x xVar = new x(this, contextThemeWrapper);
        c5284a.getClass();
        com.avito.android.lib.design.modal.a aVarA = a.C5284a.a(contextThemeWrapper, 0, i12, xVar);
        DeepLinksDialogInfo deepLinksDialogInfo = this.f144750h0;
        if (deepLinksDialogInfo == null) {
            deepLinksDialogInfo = null;
        }
        Boolean boolIsCancellable = deepLinksDialogInfo.isCancellable();
        setCancelable(boolIsCancellable != null ? boolIsCancellable.booleanValue() : false);
        DeepLinksDialogInfo deepLinksDialogInfo2 = this.f144750h0;
        Boolean boolIsCancellable2 = (deepLinksDialogInfo2 != null ? deepLinksDialogInfo2 : null).isCancellable();
        aVarA.setCanceledOnTouchOutside(boolIsCancellable2 != null ? boolIsCancellable2.booleanValue() : false);
        return aVarA;
    }

    public void j5() {
    }

    public void k5() {
    }
}
