package com.avito.android.bxcontent;

import android.view.View;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bxcontent.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC29249s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f112823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112824c;

    public /* synthetic */ ViewOnClickListenerC29249s(Object obj, int i12) {
        this.f112823b = i12;
        this.f112824c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f112823b) {
            case 0:
                ((com.avito.android.lib.design.tooltip.k) this.f112824c).dismiss();
                break;
            default:
                ((C29240o1) this.f112824c).f112693U.K5(InterfaceC29127b.D0.f112075a);
                break;
        }
    }
}
