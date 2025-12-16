package ru.cyberity.cbr.core.presentation.screen.verification;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f434199c;

    public /* synthetic */ c(a aVar, int i12) {
        this.f434198b = i12;
        this.f434199c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f434198b) {
            case 0:
                a.a(this.f434199c, view);
                break;
            case 1:
                a.c(this.f434199c, view);
                break;
            default:
                a.b(this.f434199c, view);
                break;
        }
    }
}
