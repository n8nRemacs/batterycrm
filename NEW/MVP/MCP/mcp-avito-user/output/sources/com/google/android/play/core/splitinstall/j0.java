package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class j0 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC37204f f358810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f358811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f358812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f358813d;

    public j0(l0 l0Var, AbstractC37204f abstractC37204f, Intent intent, Context context) {
        this.f358813d = l0Var;
        this.f358810a = abstractC37204f;
        this.f358811b = intent;
        this.f358812c = context;
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zza() {
        AbstractC37204f abstractC37204f = this.f358810a;
        l0 l0Var = this.f358813d;
        l0Var.f358821g.post(new k0(l0Var, abstractC37204f, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zzb(@PY0.a int i12) {
        AbstractC37204f abstractC37204f = this.f358810a;
        l0 l0Var = this.f358813d;
        l0Var.f358821g.post(new k0(l0Var, abstractC37204f, 6, i12));
    }

    @Override // com.google.android.play.core.splitinstall.U
    public final void zzc() {
        Intent intent = this.f358811b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f358813d.f358790a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            this.f358812c.sendBroadcast(intent);
        }
    }
}
