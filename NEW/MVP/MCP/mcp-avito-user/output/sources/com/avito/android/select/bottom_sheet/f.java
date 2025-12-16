package com.avito.android.select.bottom_sheet;

import Xp0.AbstractC17036a;
import android.view.View;
import dq0.InterfaceC39781c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f265287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f265288c;

    public /* synthetic */ f(g gVar, int i12) {
        this.f265287b = i12;
        this.f265288c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f265287b) {
            case 0:
                this.f265288c.f265292d.invoke(InterfaceC39781c.i.f394127a);
                break;
            case 1:
                this.f265288c.f265292d.invoke(InterfaceC39781c.a.f394119a);
                break;
            default:
                this.f265288c.f265292d.invoke(AbstractC17036a.c.f19077a);
                break;
        }
    }
}
