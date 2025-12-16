package com.avito.android.installments.form.mvi;

import WN.b;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsFormOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments/form/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<InstallmentsFormInternalAction, WN.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f172795b;

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f172795b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final WN.b b(InstallmentsFormInternalAction installmentsFormInternalAction) {
        InstallmentsFormInternalAction installmentsFormInternalAction2 = installmentsFormInternalAction;
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.TryToOpenCamera) {
            ValueCallback<Uri[]> valueCallback = ((InstallmentsFormInternalAction.TryToOpenCamera) installmentsFormInternalAction2).f172765b;
            if (valueCallback != null) {
                return new b.h(valueCallback);
            }
            return null;
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowCancellationDialog) {
            return b.e.f17907a;
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowPermissionToast) {
            return b.f.f17908a;
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.HandleDeeplink) {
            b.a.a(this.f172795b, ((InstallmentsFormInternalAction.HandleDeeplink) installmentsFormInternalAction2).f172754b, null, null, 6);
            return null;
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.CloseScreenWithSuccessResult) {
            return b.C1269b.f17904a;
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.CloseScreenWithCancelResult) {
            return new b.a(((InstallmentsFormInternalAction.CloseScreenWithCancelResult) installmentsFormInternalAction2).f172752b);
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.LoadUrl) {
            return new b.c(((InstallmentsFormInternalAction.LoadUrl) installmentsFormInternalAction2).f172755b);
        }
        if (installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.OpenExternalUrl) {
            return new b.d(((InstallmentsFormInternalAction.OpenExternalUrl) installmentsFormInternalAction2).f172756b);
        }
        if (!(installmentsFormInternalAction2 instanceof InstallmentsFormInternalAction.ShowPostMessageDialog)) {
            return null;
        }
        InstallmentsFormInternalAction.ShowPostMessageDialog showPostMessageDialog = (InstallmentsFormInternalAction.ShowPostMessageDialog) installmentsFormInternalAction2;
        showPostMessageDialog.getClass();
        return new b.g(showPostMessageDialog.f172761b);
    }
}
