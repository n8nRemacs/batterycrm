package com.google.android.material.textfield;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f357443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f357444c;

    public /* synthetic */ b(q qVar, int i12) {
        this.f357443b = i12;
        this.f357444c = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        switch (this.f357443b) {
            case 0:
                g gVar = (g) this.f357444c;
                gVar.t(gVar.u());
                break;
            default:
                n nVar = (n) this.f357444c;
                nVar.f357476l = z12;
                nVar.q();
                if (!z12) {
                    nVar.t(false);
                    nVar.f357477m = false;
                    break;
                }
                break;
        }
    }
}
