package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bve implements rhg {
    public final /* synthetic */ shg a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ shg c;
    public final /* synthetic */ List d;
    public final /* synthetic */ shg e;
    public final /* synthetic */ ArrayList f;

    public bve(shg shgVar, ArrayList arrayList, shg shgVar2, ArrayList arrayList2, shg shgVar3, ArrayList arrayList3) {
        this.a = shgVar;
        this.b = arrayList;
        this.c = shgVar2;
        this.d = arrayList2;
        this.e = shgVar3;
        this.f = arrayList3;
    }

    @Override // defpackage.rhg
    public final void a(shg shgVar) {
        List list;
        shg shgVar2 = this.a;
        if (shgVar2 != null) {
            vfi.g(shgVar2, this.b, null);
        }
        shg shgVar3 = this.c;
        if (shgVar3 != null && (list = this.d) != null) {
            vfi.g(shgVar3, list, null);
        }
        shg shgVar4 = this.e;
        if (shgVar4 != null) {
            vfi.g(shgVar4, this.f, null);
        }
    }

    @Override // defpackage.rhg
    public final void b() {
    }

    @Override // defpackage.rhg
    public final void c(shg shgVar) {
    }

    @Override // defpackage.rhg
    public final void f() {
    }

    @Override // defpackage.rhg
    public final void h(shg shgVar) {
    }
}
