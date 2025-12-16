package com.akita.compose.component.chips.internal;

import Y61.l;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: SingleLineStretchedLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chips_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(float f12, @l v.a aVar, @l T1 t12, @l d2 d2Var, @Y61.k C22096n c22096n, @l A a12, int i12) {
        int i13;
        v.a aVar2;
        d2 d2VarA;
        B bE2 = a12.E(1193010888);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i12 & 896) == 0) {
            i14 |= bE2.B(t12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i14 & 46811) == 9362 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            d2VarA = d2Var;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar2 = v.f42878y1;
                d2VarA = a2.a(bE2);
            } else {
                bE2.f();
                aVar2 = aVar;
                d2VarA = d2Var;
            }
            bE2.Y();
            E.a(null, null, false, r.c(-1750478178, new h(c22096n, aVar2, t12, d2VarA, f12), bE2), bE2, 3072, 7);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(f12, aVar2, t12, d2VarA, c22096n, i12);
        }
    }

    public static final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, ArrayList arrayList, int i12, int i13, int i14) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = ((K0) it.next()).f40346c;
        while (it.hasNext()) {
            int i16 = ((K0) it.next()).f40346c;
            if (i15 < i16) {
                i15 = i16;
            }
        }
        return interfaceC22369k0.L0(i12, i15, P0.c(), new j(arrayList, i13, i14));
    }
}
