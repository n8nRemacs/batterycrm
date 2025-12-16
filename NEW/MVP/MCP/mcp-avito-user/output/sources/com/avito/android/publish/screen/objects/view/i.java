package com.avito.android.publish.screen.objects.view;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f240344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.screen.step.params.view.actions.k f240345c;

    public /* synthetic */ i(com.avito.android.publish.screen.step.params.view.actions.k kVar, int i12) {
        this.f240344b = i12;
        this.f240345c = kVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        switch (this.f240344b) {
            case 0:
                com.avito.android.publish.screen.step.params.view.actions.k kVar = this.f240345c;
                kVar.c(kVar.getF241566e() + kVar.b());
                break;
            default:
                com.avito.android.publish.screen.step.params.view.actions.k kVar2 = this.f240345c;
                kVar2.c(kVar2.getF241566e() + kVar2.b());
                break;
        }
    }
}
