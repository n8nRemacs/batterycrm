package com.avito.android.extended_profile_ui_components;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f153364c;

    public /* synthetic */ m(n nVar, int i12) {
        this.f153363b = i12;
        this.f153364c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f153363b) {
            case 0:
                this.f153364c.b();
                break;
            default:
                this.f153364c.f153367c.requestLayout();
                break;
        }
    }
}
