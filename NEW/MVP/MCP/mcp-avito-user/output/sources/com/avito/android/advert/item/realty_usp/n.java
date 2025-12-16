package com.avito.android.advert.item.realty_usp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f78426c;

    public /* synthetic */ n(o oVar, int i12) {
        this.f78425b = i12;
        this.f78426c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78425b) {
            case 0:
                o oVar = this.f78426c;
                oVar.f78429d.setData(oVar.f78432g);
                break;
            default:
                o oVar2 = this.f78426c;
                oVar2.f78429d.setData(oVar2.f78432g);
                break;
        }
    }
}
