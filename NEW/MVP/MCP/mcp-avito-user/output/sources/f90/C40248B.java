package f90;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PrefVersionStorage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lf90/B;", "Lf90/L;", "Lf90/J;", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f90.B, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C40248B implements L, J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f395690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395691b;

    @Inject
    public C40248B(@Y61.k AK0.l lVar, int i12) {
        this.f395690a = lVar;
        AK0.h.f304a.getClass();
        String str = AK0.h.f307d;
        if (!lVar.contains(str)) {
            lVar.a(a(), str);
        }
        boolean z12 = false;
        int i13 = lVar.getInt(str, 0);
        if (i13 != i12 && i13 != 0) {
            z12 = true;
        }
        this.f395691b = z12;
    }

    @Override // f90.L
    public final int a() {
        AK0.h.f304a.getClass();
        return this.f395690a.getInt(AK0.h.f306c, 0);
    }

    @Override // f90.J
    /* renamed from: b, reason: from getter */
    public final boolean getF395691b() {
        return this.f395691b;
    }

    @Override // f90.L
    public final void c(int i12) {
        AK0.h.f304a.getClass();
        this.f395690a.a(i12, AK0.h.f306c);
    }
}
