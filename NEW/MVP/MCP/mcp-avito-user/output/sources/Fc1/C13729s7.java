package Fc1;

import java.util.LinkedHashMap;

/* renamed from: Fc1.s7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13729s7 implements I4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public com.avito.android.ux.feedback.impl.q f5825a;

    @Override // Fc1.I4
    public final void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str, int i12) {
    }

    @Override // Fc1.I4
    public final void b(int i12, int i13, @Y61.k String str, int i14) {
        SK0.d dVar;
        com.avito.android.ux.feedback.impl.q qVar = this.f5825a;
        if (qVar == null || (dVar = qVar.f319169d) == null) {
            return;
        }
        dVar.Od(str);
    }

    @Override // Fc1.I4
    public final void a() {
        com.avito.android.ux.feedback.impl.q qVar = this.f5825a;
        if (qVar != null) {
            com.avito.android.ux.feedback.impl.v vVar = qVar.f319166a;
            if (!vVar.f319182e || vVar.f319180c) {
                return;
            }
            vVar.f319180c = true;
            Long l12 = vVar.f319179b;
            if (l12 != null) {
                vVar.f319178a.c(new UK0.b(System.currentTimeMillis() - l12.longValue(), vVar.f319181d));
            }
        }
    }

    @Override // Fc1.I4
    public final void a(int i12, @Y61.k String str) {
        SK0.d dVar;
        com.avito.android.ux.feedback.impl.q qVar = this.f5825a;
        if (qVar == null || (dVar = qVar.f319169d) == null) {
            return;
        }
        dVar.ha(str);
    }
}
