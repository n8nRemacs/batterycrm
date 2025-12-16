package com.avito.android.bottom_sheet_group;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f107406c;

    public /* synthetic */ m(n nVar, int i12) {
        this.f107405b = i12;
        this.f107406c = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f107405b) {
            case 0:
                this.f107406c.f107410d.accept(G0.f406611a);
                break;
            default:
                this.f107406c.f107411e.accept(G0.f406611a);
                break;
        }
    }
}
