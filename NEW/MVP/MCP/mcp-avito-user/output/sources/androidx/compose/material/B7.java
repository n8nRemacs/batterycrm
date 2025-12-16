package androidx.compose.material;

import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.C22143q0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f32388a = androidx.compose.runtime.S.c(a.f32394l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C7 f32389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C7 f32390c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.material.ripple.l f32391d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.material.ripple.l f32392e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.material.ripple.l f32393f;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material/z7;", "invoke", "()Landroidx/compose/material/z7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<C21432z7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f32394l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C21432z7 invoke() {
            return new C21432z7(0L, null, 3, null);
        }
    }

    static {
        androidx.compose.ui.unit.h.f42849c.getClass();
        float f12 = androidx.compose.ui.unit.h.f42851e;
        androidx.compose.ui.graphics.T.f39320b.getClass();
        long j12 = androidx.compose.ui.graphics.T.f39330l;
        f32389b = new C7(true, f12, j12, (C42822w) null);
        f32390c = new C7(false, f12, j12, (C42822w) null);
        f32391d = new androidx.compose.material.ripple.l(0.16f, 0.24f, 0.08f, 0.24f);
        f32392e = new androidx.compose.material.ripple.l(0.08f, 0.12f, 0.04f, 0.12f);
        f32393f = new androidx.compose.material.ripple.l(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static InterfaceC21084v1 a(float f12, int i12, long j12, boolean z12) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        float f13 = f12;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            j12 = androidx.compose.ui.graphics.T.f39330l;
        }
        long j13 = j12;
        androidx.compose.ui.unit.h.f42849c.getClass();
        if (androidx.compose.ui.unit.h.b(f13, androidx.compose.ui.unit.h.f42851e)) {
            androidx.compose.ui.graphics.T.f39320b.getClass();
            if (androidx.compose.ui.graphics.T.d(j13, androidx.compose.ui.graphics.T.f39330l)) {
                return z13 ? f32389b : f32390c;
            }
        }
        return new C7(z13, f13, j13, (C42822w) null);
    }
}
