package ru.cyberity.cbr.geo.presentation;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f434608c;

    public /* synthetic */ g(a aVar, int i12) {
        this.f434607b = i12;
        this.f434608c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f434607b) {
            case 0:
                a.f(this.f434608c, view);
                break;
            case 1:
                a.g(this.f434608c, view);
                break;
            case 2:
                a.a(this.f434608c, view);
                break;
            case 3:
                a.b(this.f434608c, view);
                break;
            case 4:
                a.e(this.f434608c, view);
                break;
            case 5:
                a.c(this.f434608c, view);
                break;
            default:
                a.d(this.f434608c, view);
                break;
        }
    }
}
