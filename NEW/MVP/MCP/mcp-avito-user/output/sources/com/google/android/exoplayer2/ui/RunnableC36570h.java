package com.google.android.exoplayer2.ui;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.ui.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC36570h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f347462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f347463c;

    public /* synthetic */ RunnableC36570h(View view, int i12) {
        this.f347462b = i12;
        this.f347463c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f347463c;
        switch (this.f347462b) {
            case 0:
                int i12 = i.f347464Q;
                ((i) view).g(false);
                break;
            default:
                float[] fArr = s.f347553z0;
                ((s) view).n();
                break;
        }
    }
}
