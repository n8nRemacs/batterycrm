package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f43530m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f43513e = f.a.f43522c;
        } else {
            this.f43513e = f.a.f43523d;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d(int i12) {
        if (this.f43518j) {
            return;
        }
        this.f43518j = true;
        this.f43515g = i12;
        Iterator it = this.f43519k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
