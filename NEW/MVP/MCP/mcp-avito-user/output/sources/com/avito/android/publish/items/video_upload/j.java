package com.avito.android.publish.items.video_upload;

import android.graphics.PointF;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f237309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f237310c;

    public /* synthetic */ j(ViewGroup viewGroup, int i12) {
        this.f237309b = i12;
        this.f237310c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.f237310c;
        switch (this.f237309b) {
            case 0:
                PointF pointF = k.f237311N;
                viewGroup.getLayoutParams().height = viewGroup.getWidth();
                viewGroup.requestLayout();
                break;
            default:
                PointF pointF2 = k.f237311N;
                viewGroup.getLayoutParams().height = viewGroup.getWidth();
                viewGroup.requestLayout();
                break;
        }
    }
}
