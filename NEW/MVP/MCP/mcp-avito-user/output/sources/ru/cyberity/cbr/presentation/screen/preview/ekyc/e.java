package ru.cyberity.cbr.presentation.screen.preview.ekyc;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f435039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f435040c;

    public /* synthetic */ e(a aVar, int i12) {
        this.f435039b = i12;
        this.f435040c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f435039b) {
            case 0:
                a.d(this.f435040c, view);
                break;
            case 1:
                a.e(this.f435040c, view);
                break;
            case 2:
                a.a(this.f435040c, view);
                break;
            case 3:
                a.c(this.f435040c, view);
                break;
            default:
                a.b(this.f435040c, view);
                break;
        }
    }
}
