package com.avito.android.lib.compose.design.shared.stepsbar;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepsBarContent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/stepsbar/g;", "", "_design-modules_compose_shared_stepsbar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f177746a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f177747b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f177748c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f177749d;

    public g() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f177746a, gVar.f177746a) && L.f(this.f177747b, gVar.f177747b) && L.f(this.f177748c, gVar.f177748c) && L.f(this.f177749d, gVar.f177749d);
    }

    public final int hashCode() {
        return this.f177749d.hashCode() + s.b(this.f177748c, s.b(this.f177747b, this.f177746a.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "StepsBarStyle(selectedStepColor=" + this.f177746a + ", emptyStepColor=" + this.f177747b + ", activeTitleColor=" + this.f177748c + ", inactiveTitleColor=" + this.f177749d + ')';
    }

    public g(@k p pVar, @k p pVar2, @k p pVar3, @k p pVar4) {
        this.f177746a = pVar;
        this.f177747b = pVar2;
        this.f177748c = pVar3;
        this.f177749d = pVar4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(p pVar, p pVar2, p pVar3, p pVar4, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar = com.akita.compose.theme.re23.b.f63984b.f63963t0;
        }
        if ((i12 & 2) != 0) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar2 = com.akita.compose.theme.re23.b.f63984b.f63842E1;
        }
        if ((i12 & 4) != 0) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar3 = com.akita.compose.theme.re23.b.f63984b.f63938l;
        }
        if ((i12 & 8) != 0) {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            pVar4 = com.akita.compose.theme.re23.b.f63984b.f63918e0;
        }
        this(pVar, pVar2, pVar3, pVar4);
    }
}
