package com.avito.android.captcha;

import android.app.Dialog;
import com.geetest.captcha.GTCaptcha4Client;
import kotlin.Metadata;

/* compiled from: GeetestCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/C;", "Lcom/geetest/captcha/GTCaptcha4Client$OnDialogShowListener;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C implements GTCaptcha4Client.OnDialogShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f114928a;

    public C(B b12) {
        this.f114928a = b12;
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnDialogShowListener
    public final void actionAfterDialogShow(@Y61.l Dialog dialog) {
        this.f114928a.f114922j = dialog;
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnDialogShowListener
    public final void actionBeforeDialogShow(@Y61.l Dialog dialog) {
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnDialogShowListener
    public final void onDialogFocusChanged(@Y61.l Dialog dialog, boolean z12) {
    }
}
