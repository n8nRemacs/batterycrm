package com.my.target;

import android.view.View;
import com.my.target.InterfaceC37815v;

/* loaded from: classes7.dex */
public class J0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f364414b;

    public J0(K0 k02) {
        this.f364414b = k02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC37815v.a aVar = this.f364414b.f364430q;
        if (aVar != null) {
            aVar.d();
        }
    }
}
