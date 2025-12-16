package com.google.android.material.textfield;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f357447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f357448c;

    public /* synthetic */ d(q qVar, int i12) {
        this.f357447b = i12;
        this.f357448c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f357447b) {
            case 0:
                ((g) this.f357448c).t(true);
                break;
            default:
                n nVar = (n) this.f357448c;
                boolean zIsPopupShowing = nVar.f357472h.isPopupShowing();
                nVar.t(zIsPopupShowing);
                nVar.f357477m = zIsPopupShowing;
                break;
        }
    }
}
