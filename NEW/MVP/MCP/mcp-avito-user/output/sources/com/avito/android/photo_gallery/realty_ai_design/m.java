package com.avito.android.photo_gallery.realty_ai_design;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u000e²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/u;", "actualGallerySize", "", "sliderX", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "rightUri", "leftUri", "Lkotlin/Function0;", "Lkotlin/G0;", "latestOnImageLoaded", "Lkotlin/Function1;", "", "latestOnImageFailed", "_avito_photo-gallery_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(float f12, float f13, v vVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(473326064);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f13) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            FillElement fillElement = C20588k2.f28681b;
            v vVarY = C20588k2.y(vVar.d0(fillElement), null, 3);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarY);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar2 = v.f42878y1;
            v vVarD0 = C20588k2.t(aVar2, f13).d0(fillElement);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar3.f63870O.c(bE2);
            Y0.a aVar4 = Y0.f39346a;
            C20632w.a(androidx.compose.foundation.A.b(vVarD0, jC2, aVar4), bE2, 0);
            C20632w.a(androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, f12), o.f30153a), aVar3.f63870O.c(bE2), aVar4), bE2, 0);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.b(3128, 0, aVar3.f63882S.c(bE2), bE2, aVar2, u0.e.a(com.akita.compose.theme.re23.e.f64416Yc, 0, bE2), null);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(f12, f13, i12, vVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c6  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l com.avito.android.remote.model.Image r39, @Y61.l com.avito.android.remote.model.Image r40, @Y61.k Y41.a r41, @Y61.k Y41.l r42, @Y61.k Y41.a r43, @Y61.k android.view.ViewGroup r44, @Y61.l androidx.compose.runtime.A r45, int r46) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.realty_ai_design.m.b(com.avito.android.remote.model.Image, com.avito.android.remote.model.Image, Y41.a, Y41.l, Y41.a, android.view.ViewGroup, androidx.compose.runtime.A, int):void");
    }
}
