package com.avito.android.sbc.create.mvi;

import Uo0.e;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class K0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f259315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M0 f259316c;

    public /* synthetic */ K0(M0 m02, int i12) {
        this.f259315b = i12;
        this.f259316c = m02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f259315b) {
            case 0:
                this.f259316c.f259403o0.accept(kotlin.G0.f406611a);
                break;
            case 1:
                this.f259316c.f259411s0.accept(e.B.f16610a);
                break;
            case 2:
                this.f259316c.f259411s0.accept(e.D.f16612a);
                break;
            case 3:
                this.f259316c.f259401n0.accept(kotlin.G0.f406611a);
                break;
            case 4:
                this.f259316c.f259399m0.accept(kotlin.G0.f406611a);
                break;
            default:
                this.f259316c.f259411s0.accept(e.E.f16613a);
                break;
        }
    }
}
