package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: AndroidObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1;", "heapObject", "", "invoke", "(Lshark/M1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48338s extends kotlin.jvm.internal.N implements Y41.l<M1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48338s f438694l = new C48338s();

    public C48338s() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(M1 m12) {
        M1 m13 = m12;
        boolean z12 = false;
        if (m13 instanceof M1.c) {
            M1.c cVar = (M1.c) m13;
            if (cVar.h("android.widget.Toast")) {
                K1 k1J = cVar.j("android.widget.Toast", "mTN");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1 m1E = k1J.f438095c.e();
                if (m1E == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = m1E.a();
                if (cVarA == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                K1 k1J2 = cVarA.j("android.widget.Toast$TN", "mWM");
                if (k1J2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                if (k1J2.f438095c.g()) {
                    K1 k1J3 = cVarA.j("android.widget.Toast$TN", "mView");
                    if (k1J3 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (k1J3.f438095c.h()) {
                        z12 = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
