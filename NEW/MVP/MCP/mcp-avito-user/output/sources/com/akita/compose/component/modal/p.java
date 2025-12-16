package com.akita.compose.component.modal;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Modal.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f62104l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f62105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f62106n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62107o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C f62108p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, C22096n c22096n, C22096n c22096n2, C c12) {
        super(2);
        this.f62104l = str;
        this.f62105m = str2;
        this.f62106n = c22096n;
        this.f62107o = c22096n2;
        this.f62108p = c12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        String str;
        int i12;
        C c12;
        p pVar;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39077c, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            this.f62107o.invoke(a13, 0);
            a13.z();
            a13.C(-1900353881);
            String str2 = this.f62105m;
            C c13 = this.f62108p;
            String str3 = this.f62104l;
            if (str3 == null) {
                c12 = c13;
                str = str2;
                i12 = 0;
            } else {
                str = str2;
                i12 = 0;
                com.akita.compose.foundation.ui.p.b(str3, c13.f61991i, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                a13.C(-1900350140);
                c12 = c13;
                if (str != null) {
                    C20608p2.a(a13, C20588k2.f(aVar, c12.f61993k));
                }
                a13.h();
                G0 g02 = G0.f406611a;
            }
            a13.h();
            a13.C(-1900345458);
            if (str == null) {
                pVar = this;
            } else {
                pVar = this;
                com.akita.compose.foundation.ui.p.b(pVar.f62105m, c12.f61992j, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
                G0 g03 = G0.f406611a;
            }
            a13.h();
            pVar.f62106n.invoke(a13, Integer.valueOf(i12));
        }
        return G0.f406611a;
    }
}
