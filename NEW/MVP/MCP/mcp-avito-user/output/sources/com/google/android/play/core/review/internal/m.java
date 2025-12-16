package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.C37028k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class m extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f358626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f358627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, C37028k c37028k, j jVar) {
        super(c37028k);
        this.f358627d = tVar;
        this.f358626c = jVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    public final void a() {
        t tVar = this.f358627d;
        f fVar = tVar.f358646m;
        ArrayList arrayList = tVar.f358637d;
        j jVar = this.f358626c;
        i iVar = tVar.f358635b;
        if (fVar != null || tVar.f358640g) {
            if (!tVar.f358640g) {
                jVar.run();
                return;
            } else {
                iVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(jVar);
                return;
            }
        }
        iVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f358645l = sVar;
        tVar.f358640g = true;
        if (tVar.f358634a.bindService(tVar.f358641h, sVar, 1)) {
            return;
        }
        iVar.a("Failed to bind to the service.", new Object[0]);
        tVar.f358640g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar2 = (j) it.next();
            zzu zzuVar = new zzu();
            C37028k c37028k = jVar2.f358622b;
            if (c37028k != null) {
                c37028k.c(zzuVar);
            }
        }
        arrayList.clear();
    }
}
