package com.akita.compose.component.toggle;

import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.N;
import androidx.compose.animation.l2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToggleColors.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/toggle/s;", "", "toggle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f63427a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f63428b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63429c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63430d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63431e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63432f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63433g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63434h;

    public s() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    @InterfaceC22132o
    public final I3 a(ToggleState toggleState, com.akita.compose.foundation.c cVar, A a12) {
        long jC2;
        I3 i3M;
        a12.C(1497586844);
        ToggleState toggleState2 = ToggleState.f63312c;
        if (toggleState == toggleState2 && cVar.f63577c.f63641d) {
            a12.C(-1382483554);
            jC2 = cVar.f63577c.c(a12);
            a12.h();
        } else if (toggleState == ToggleState.f63313d && cVar.f63576b.f63641d) {
            a12.C(-1382480741);
            jC2 = cVar.f63576b.c(a12);
            a12.h();
        } else {
            a12.C(-1382479619);
            jC2 = cVar.f63575a.c(a12);
            a12.h();
        }
        long j12 = jC2;
        if (toggleState != toggleState2) {
            a12.C(92879359);
            i3M = l2.b(j12, C20310q.e(this.f63427a, 0, this.f63428b, 2), a12, 0, 12);
            a12.h();
        } else {
            a12.C(93055408);
            i3M = C22126m3.m(T.a(j12), a12);
            a12.h();
        }
        a12.h();
        return i3M;
    }

    @InterfaceC22132o
    @Y61.k
    public final I3<T> b(@Y61.k ToggleState toggleState, boolean z12, @Y61.l A a12, int i12) {
        a12.C(962456985);
        I3<T> i3A = a(toggleState, z12 ? this.f63430d : this.f63429c, a12);
        a12.h();
        return i3A;
    }

    @InterfaceC22132o
    @Y61.k
    public final I3<T> c(@Y61.k ToggleState toggleState, boolean z12, @Y61.l A a12, int i12) {
        a12.C(585626659);
        I3<T> i3A = a(toggleState, z12 ? this.f63432f : this.f63431e, a12);
        a12.h();
        return i3A;
    }

    @InterfaceC22132o
    @Y61.k
    public final I3<T> d(@Y61.k ToggleState toggleState, boolean z12, @Y61.l A a12, int i12) {
        a12.C(1536018495);
        I3<T> i3A = a(toggleState, z12 ? this.f63434h : this.f63433g, a12);
        a12.h();
        return i3A;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        s sVar = (s) obj;
        if (L.f(this.f63429c, sVar.f63429c) && L.f(this.f63432f, sVar.f63432f)) {
            return L.f(this.f63434h, sVar.f63434h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63434h.hashCode() + ((this.f63432f.hashCode() + (this.f63429c.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(int i12, N n12, com.akita.compose.foundation.c cVar, com.akita.compose.foundation.c cVar2, com.akita.compose.foundation.c cVar3, com.akita.compose.foundation.c cVar4, com.akita.compose.foundation.c cVar5, com.akita.compose.foundation.c cVar6, int i13, C42822w c42822w) {
        com.akita.compose.foundation.c cVar7;
        com.akita.compose.foundation.c cVar8;
        com.akita.compose.foundation.c cVar9;
        com.akita.compose.foundation.c cVar10;
        com.akita.compose.foundation.c cVar11;
        com.akita.compose.foundation.c cVar12;
        int i14 = (i13 & 1) != 0 ? 120 : i12;
        N n13 = (i13 & 2) != 0 ? t.f63435a : n12;
        if ((i13 & 4) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar7 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar7 = cVar;
        }
        if ((i13 & 8) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar8 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar8 = cVar2;
        }
        if ((i13 & 16) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar9 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar9 = cVar3;
        }
        if ((i13 & 32) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar10 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar10 = cVar4;
        }
        if ((i13 & 64) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar11 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar11 = cVar5;
        }
        if ((i13 & 128) != 0) {
            com.akita.compose.foundation.c.f63573e.getClass();
            cVar12 = com.akita.compose.foundation.c.f63574f;
        } else {
            cVar12 = cVar6;
        }
        this(i14, n13, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    public s(int i12, @Y61.k N n12, @Y61.k com.akita.compose.foundation.c cVar, @Y61.k com.akita.compose.foundation.c cVar2, @Y61.k com.akita.compose.foundation.c cVar3, @Y61.k com.akita.compose.foundation.c cVar4, @Y61.k com.akita.compose.foundation.c cVar5, @Y61.k com.akita.compose.foundation.c cVar6) {
        this.f63427a = i12;
        this.f63428b = n12;
        this.f63429c = cVar;
        this.f63430d = cVar2;
        this.f63431e = cVar3;
        this.f63432f = cVar4;
        this.f63433g = cVar5;
        this.f63434h = cVar6;
    }
}
