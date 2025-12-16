package com.avito.android.lib.design.toast_bar;

import com.avito.android.lib.design.toast_bar.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f181079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f181080c;

    public /* synthetic */ g(i iVar, int i12) {
        this.f181079b = i12;
        this.f181080c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f181080c;
        switch (this.f181079b) {
            case 0:
                iVar.f181107v = true;
                break;
            case 1:
                i.a aVar = i.f181082D;
                iVar.e();
                iVar.f181107v = false;
                break;
            default:
                iVar.f();
                break;
        }
    }
}
