package ru.cyberity.cbr.camera;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f432070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f432071c;

    public /* synthetic */ f(a aVar, int i12) {
        this.f432070b = i12;
        this.f432071c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f432070b) {
            case 0:
                a.b(this.f432071c, view);
                break;
            case 1:
                a.c(this.f432071c, view);
                break;
            default:
                a.a(this.f432071c, view);
                break;
        }
    }
}
