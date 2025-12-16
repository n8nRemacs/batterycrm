package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.yandex.div.core.view2.C38029k;
import com.yandex.mobile.ads.R;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class tq implements zj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.u f390284a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f390285b;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Dialog f390289f;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final mq f390287d = new mq();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final jr f390288e = new jr();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final br f390286c = new br();

    public tq(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar) {
        this.f390284a = uVar;
        this.f390285b = plVar;
    }

    @Override // com.yandex.mobile.ads.impl.zj
    public final void a(@j.N Context context) {
        br brVar = this.f390286c;
        com.yandex.mobile.ads.nativeads.u uVar = this.f390284a;
        brVar.getClass();
        vq vqVarA = br.a(uVar);
        if (vqVarA == null) {
            this.f390285b.e();
            return;
        }
        this.f390287d.getClass();
        com.yandex.div2.H0 h0A = mq.a(vqVarA);
        if (h0A == null) {
            this.f390285b.e();
            return;
        }
        Dialog dialog = new Dialog(context, R.style.MonetizationAdsInternal_FullscreenDialog);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.U1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f383322b.a(dialogInterface);
            }
        });
        yj yjVar = new yj(new xj(dialog, this.f390285b));
        this.f390288e.getClass();
        C38029k c38029kA = jr.a(context);
        c38029kA.setActionHandler(yjVar);
        c38029kA.s(h0A, new q21.c(UUID.randomUUID().toString()));
        dialog.setContentView(c38029kA);
        this.f390289f = dialog;
        dialog.show();
    }

    @Override // com.yandex.mobile.ads.impl.zj
    public final void a() {
        Dialog dialog = this.f390289f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DialogInterface dialogInterface) {
        this.f390289f = null;
    }
}
