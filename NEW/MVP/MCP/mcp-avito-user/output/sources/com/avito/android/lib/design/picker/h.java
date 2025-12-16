package com.avito.android.lib.design.picker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f180015c;

    public /* synthetic */ h(i iVar, int i12) {
        this.f180014b = i12;
        this.f180015c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = 0;
        i iVar = this.f180015c;
        switch (this.f180014b) {
            case 0:
                i.setSelectedElement$lambda$8(iVar);
                break;
            case 1:
                int i13 = i.f180016t;
                iVar.f();
                iVar.e(true);
                break;
            case 2:
                int i14 = i.f180016t;
                if (iVar.f180032q != null) {
                    iVar.f180030o.clear();
                    iVar.f180033r = true;
                    iVar.f180022g.J0();
                    iVar.post(new h(iVar, i12));
                    break;
                }
                break;
            default:
                int i15 = i.f180016t;
                iVar.f();
                iVar.e(false);
                break;
        }
    }
}
