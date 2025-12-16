package N61;

import Q61.A;
import Q61.j;
import Q61.v;
import Q61.z;
import org.commonmark.internal.f;

/* compiled from: EmphasisDelimiterProcessor.java */
/* loaded from: classes7.dex */
public abstract class b implements S61.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f11206a;

    public b(char c12) {
        this.f11206a = c12;
    }

    @Override // S61.a
    public final char a() {
        return this.f11206a;
    }

    @Override // S61.a
    public final int b() {
        return 1;
    }

    @Override // S61.a
    public final char c() {
        return this.f11206a;
    }

    @Override // S61.a
    public final int d(f fVar, f fVar2) {
        if (fVar.f420272d || fVar2.f420271c) {
            int i12 = fVar2.f420276h;
            if (i12 % 3 != 0 && (i12 + fVar.f420276h) % 3 == 0) {
                return 0;
            }
        }
        return (fVar.f420275g < 2 || fVar2.f420275g < 2) ? 1 : 2;
    }

    @Override // S61.a
    public final void e(A a12, A a13, int i12) {
        String.valueOf(this.f11206a);
        v jVar = i12 == 1 ? new j() : new z();
        v vVar = a12.f13504e;
        while (vVar != null && vVar != a13) {
            v vVar2 = vVar.f13504e;
            jVar.b(vVar);
            vVar = vVar2;
        }
        jVar.f();
        v vVar3 = a12.f13504e;
        jVar.f13504e = vVar3;
        if (vVar3 != null) {
            vVar3.f13503d = jVar;
        }
        jVar.f13503d = a12;
        a12.f13504e = jVar;
        v vVar4 = a12.f13500a;
        jVar.f13500a = vVar4;
        if (jVar.f13504e == null) {
            vVar4.f13502c = jVar;
        }
    }
}
