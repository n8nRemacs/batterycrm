package com.avito.android.util;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class C6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f318572c;

    public /* synthetic */ C6(View view, int i12) {
        this.f318571b = i12;
        this.f318572c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f318571b) {
            case 0:
                D6.w(this.f318572c);
                break;
            default:
                View view = this.f318572c;
                view.setAlpha(0.0f);
                D6.H(view);
                break;
        }
    }
}
