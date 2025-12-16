package com.avito.android.map.view;

import android.view.View;
import bY.InterfaceC25585b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.map.view.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class ViewOnClickListenerC31638b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31642f f185460c;

    public /* synthetic */ ViewOnClickListenerC31638b(C31642f c31642f, int i12) {
        this.f185459b = i12;
        this.f185460c = c31642f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f185459b) {
            case 0:
                this.f185460c.f185504e.invoke(InterfaceC25585b.C25591g.f57136a);
                break;
            case 1:
                this.f185460c.f185504e.invoke(InterfaceC25585b.E.f57123a);
                break;
            case 2:
                C31642f c31642f = this.f185460c;
                c31642f.f185504e.invoke(new InterfaceC25585b.J(c31642f.f185502d.h()));
                break;
            case 3:
                C31642f c31642f2 = this.f185460c;
                c31642f2.f185504e.invoke(new InterfaceC25585b.K(c31642f2.f185502d.h()));
                break;
            case 4:
                this.f185460c.f185504e.invoke(InterfaceC25585b.C25593i.f57139a);
                break;
            default:
                this.f185460c.f185504e.invoke(InterfaceC25585b.y.f57161a);
                break;
        }
    }
}
