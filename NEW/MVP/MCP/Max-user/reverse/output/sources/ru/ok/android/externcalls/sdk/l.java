package ru.ok.android.externcalls.sdk;

import defpackage.gu3;
import defpackage.hu3;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu3 b;

    public /* synthetic */ l(hu3 hu3Var, int i) {
        this.a = i;
        this.b = hu3Var;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept((Throwable) obj);
                break;
            case 1:
                this.b.accept((Throwable) obj);
                break;
            default:
                this.b.accept((Throwable) obj);
                break;
        }
    }
}
