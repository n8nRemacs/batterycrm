package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C21045x;
import kotlin.Metadata;

/* compiled from: SelectionManager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31854a = 0;

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31855a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.f30328b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.f30328b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.f30328b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31855a = iArr;
        }
    }

    static {
        new l0.j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    }

    public static final boolean a(long j12, @Y61.k l0.j jVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        if (jVar.f413390a <= fIntBitsToFloat && fIntBitsToFloat <= jVar.f413392c) {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
            if (jVar.f413391b <= fIntBitsToFloat2 && fIntBitsToFloat2 <= jVar.f413393d) {
                return true;
            }
        }
        return false;
    }

    public static final long b(L0 l02, long j12, C21045x.a aVar) {
        InterfaceC21041v interfaceC21041vC = l02.c(aVar);
        if (interfaceC21041vC == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (l02.f31852b == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (interfaceC21041vC.c() == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (aVar.f32160b <= interfaceC21041vC.e()) {
            throw null;
        }
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    @Y61.k
    public static final l0.j c(@Y61.k androidx.compose.ui.layout.A a12) {
        l0.j jVarB = androidx.compose.ui.layout.B.b(a12);
        long jA2 = a12.A(jVarB.i());
        long jA3 = a12.A(jVarB.e());
        return new l0.j(Float.intBitsToFloat((int) (jA2 >> 32)), Float.intBitsToFloat((int) (jA2 & 4294967295L)), Float.intBitsToFloat((int) (jA3 >> 32)), Float.intBitsToFloat((int) (jA3 & 4294967295L)));
    }
}
