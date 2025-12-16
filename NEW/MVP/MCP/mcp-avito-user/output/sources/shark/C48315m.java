package shark;

import kotlin.Metadata;
import shark.AndroidObjectInspectors;
import shark.M1;

/* compiled from: AndroidObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1;", "heapObject", "", "invoke", "(Lshark/M1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48315m extends kotlin.jvm.internal.N implements Y41.l<M1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48315m f438652l = new C48315m();

    public C48315m() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(M1 m12) {
        boolean zBooleanValue;
        X1 x12;
        M1 m1E;
        M1 m13 = m12;
        boolean z12 = false;
        if (m13 instanceof M1.c) {
            M1.c cVar = (M1.c) m13;
            if (cVar.h("android.widget.Editor")) {
                K1 k1J = cVar.j("android.widget.Editor", "mTextView");
                if (k1J == null || (x12 = k1J.f438095c) == null || (m1E = x12.e()) == null) {
                    zBooleanValue = false;
                } else {
                    Y41.l<M1, Boolean> lVar = ((AndroidObjectInspectors.D) AndroidObjectInspectors.f437947c).f437957g;
                    if (lVar == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    zBooleanValue = ((Boolean) ((C48342t) lVar).invoke(m1E)).booleanValue();
                }
                if (zBooleanValue) {
                    z12 = true;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
