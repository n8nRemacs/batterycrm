package com.avito.android.autoteka.items.purchaseViaPackage;

import Y41.l;
import android.view.View;
import com.avito.android.remote.autoteka.model.AutotekaAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f96930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AutotekaAction f96932d;

    public /* synthetic */ h(l lVar, AutotekaAction autotekaAction, int i12) {
        this.f96930b = i12;
        this.f96931c = lVar;
        this.f96932d = autotekaAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f96931c;
        AutotekaAction autotekaAction = this.f96932d;
        switch (this.f96930b) {
            case 0:
                int i12 = i.f96933f;
                lVar.invoke(autotekaAction.getDeepLink());
                break;
            default:
                int i13 = i.f96933f;
                lVar.invoke(autotekaAction.getDeepLink());
                break;
        }
    }
}
