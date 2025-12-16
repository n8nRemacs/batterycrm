package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes6.dex */
class o implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f356690b;

    public o(m mVar) {
        this.f356690b = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar = this.f356690b;
        float rotation = mVar.f356669w.getRotation();
        if (mVar.f356662p == rotation) {
            return true;
        }
        mVar.f356662p = rotation;
        mVar.q();
        return true;
    }
}
