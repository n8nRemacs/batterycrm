package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: TextFieldDefaults.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Li;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Li {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Li f35084a = new Li();

    /* renamed from: b, reason: collision with root package name */
    public static final float f35085b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f35086c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f35087d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f35088e;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f35085b = 56;
        f35086c = 280;
        f35087d = 1;
        f35088e = 2;
    }

    public static androidx.compose.foundation.layout.V1 b(Li li2) {
        float f12 = C21457aj.f36050b;
        li2.getClass();
        return androidx.compose.foundation.layout.R1.d(f12, f12, f12, f12);
    }

    public static androidx.compose.foundation.layout.V1 c(Li li2) {
        float f12 = C21457aj.f36050b;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        li2.getClass();
        return androidx.compose.foundation.layout.R1.d(f12, C21457aj.f36052d, f12, 0);
    }

    @InterfaceC21537e7
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.k C21935vi c21935vi, @Y61.l androidx.compose.ui.graphics.h1 h1Var, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(918564008);
        if ((i12 & 6) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.j(z13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(kVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(c21935vi) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.B(h1Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.B(this) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((74899 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            C20632w.a(androidx.compose.ui.n.a(androidx.compose.foundation.A.b(androidx.compose.ui.v.f42878y1, c21935vi.a(z12, z13, kVar, bE2, i13 & 8190).getF42167b().f39331a, h1Var), C22535v1.f41625a, new Ji(z12, z13, kVar, c21935vi, f35088e, f35087d)), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21957wi(this, z12, z13, kVar, c21935vi, h1Var, i12);
        }
    }
}
