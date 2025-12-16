package com.avito.android.user_stats.extended_user_stats;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f317301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f317302c;

    public /* synthetic */ o(r rVar, int i12) {
        this.f317301b = i12;
        this.f317302c = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f317301b) {
            case 0:
                this.f317302c.f317327q.accept(String.valueOf(view.getId()));
                break;
            case 1:
                this.f317302c.f317323m.accept(G0.f406611a);
                break;
            default:
                com.avito.android.lib.design.tooltip.k kVar = this.f317302c.f317321k;
                if (kVar != null) {
                    kVar.dismiss();
                    break;
                }
                break;
        }
    }
}
