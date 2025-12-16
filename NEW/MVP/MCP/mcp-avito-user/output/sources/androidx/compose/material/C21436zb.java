package androidx.compose.material;

import androidx.compose.animation.core.C20283h;
import androidx.compose.animation.core.C20310q;
import androidx.compose.foundation.C20805p0;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "focused", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21436zb {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC22204y1 a(boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, InterfaceC21291ob interfaceC21291ob, float f12, float f13, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.I3 i3M;
        InterfaceC22204y1 interfaceC22204y1A = androidx.compose.foundation.interaction.f.a(kVar, a12, (i12 >> 6) & 14);
        androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i3C = interfaceC21291ob.c(z12, z13, kVar, a12, i12 & 8190);
        if (!((Boolean) interfaceC22204y1A.getF42167b()).booleanValue()) {
            f12 = f13;
        }
        if (z12) {
            a12.C(773088894);
            i3M = C20283h.a(f12, C20310q.e(150, 0, null, 6), a12, 48, 12);
            a12.h();
        } else {
            a12.C(773193116);
            i3M = C22126m3.m(androidx.compose.ui.unit.h.a(f13), a12);
            a12.h();
        }
        return C22126m3.m(new C20805p0(((androidx.compose.ui.unit.h) i3M.getF42167b()).f42852b, new androidx.compose.ui.graphics.k1(i3C.getF42167b().f39331a, null), null), a12);
    }
}
