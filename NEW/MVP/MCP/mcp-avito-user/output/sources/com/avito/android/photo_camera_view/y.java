package com.avito.android.photo_camera_view;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f216425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f216426c;

    public /* synthetic */ y(A a12, int i12) {
        this.f216425b = i12;
        this.f216426c = a12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f216425b) {
            case 0:
                this.f216426c.f216344c.f();
                break;
            case 1:
                this.f216426c.f216344c.e();
                break;
            case 2:
                this.f216426c.f216344c.b();
                break;
            case 3:
                this.f216426c.f216344c.c();
                break;
            case 4:
                this.f216426c.f216344c.c();
                break;
            default:
                this.f216426c.f216344c.p();
                break;
        }
    }
}
