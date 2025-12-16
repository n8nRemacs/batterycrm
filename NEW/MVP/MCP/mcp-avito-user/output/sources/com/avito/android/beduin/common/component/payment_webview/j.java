package com.avito.android.beduin.common.component.payment_webview;

import android.view.View;
import com.avito.android.beduin.common.component.payment_webview.BeduinWebPaymentModel;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f101870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f101871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BeduinWebPaymentModel.ErrorPlaceholder f101872d;

    public /* synthetic */ j(m mVar, BeduinWebPaymentModel.ErrorPlaceholder errorPlaceholder, int i12) {
        this.f101870b = i12;
        this.f101871c = mVar;
        this.f101872d = errorPlaceholder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f101871c;
        BeduinWebPaymentModel.ErrorPlaceholder errorPlaceholder = this.f101872d;
        switch (this.f101870b) {
            case 0:
                int i12 = m.f101875l;
                mVar.a(errorPlaceholder.getButtonActions());
                break;
            default:
                List<BeduinAction> buttonActions = errorPlaceholder.getButtonActions();
                int i13 = m.f101875l;
                mVar.a(buttonActions);
                break;
        }
    }
}
