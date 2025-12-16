package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.C37028k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class r extends o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f358922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f358923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, C37028k c37028k, o oVar) {
        super(c37028k);
        this.f358923d = zVar;
        this.f358922c = oVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        z zVar = this.f358923d;
        k kVar = zVar.f358942m;
        ArrayList arrayList = zVar.f358933d;
        o oVar = this.f358922c;
        n nVar = zVar.f358931b;
        if (kVar != null || zVar.f358936g) {
            if (!zVar.f358936g) {
                oVar.run();
                return;
            } else {
                nVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(oVar);
                return;
            }
        }
        nVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(oVar);
        y yVar = new y(zVar, null);
        zVar.f358941l = yVar;
        zVar.f358936g = true;
        if (zVar.f358930a.bindService(zVar.f358937h, yVar, 1)) {
            return;
        }
        nVar.a("Failed to bind to the service.", new Object[0]);
        zVar.f358936g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(new w());
        }
        arrayList.clear();
    }
}
