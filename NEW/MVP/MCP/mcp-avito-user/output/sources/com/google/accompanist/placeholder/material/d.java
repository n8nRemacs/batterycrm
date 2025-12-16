package com.google.accompanist.placeholder.material;

import Y41.q;
import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.V;
import androidx.compose.material.C21320r2;
import androidx.compose.material.C21365u5;
import androidx.compose.runtime.A;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.v;
import com.google.accompanist.placeholder.j;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "<anonymous>", "(Landroidx/compose/ui/v;)Landroidx/compose/ui/v;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes4.dex */
final class d extends N implements q<v, A, Integer, v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f342911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f342912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.google.accompanist.placeholder.c f342913n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q<C20288i1.b<Boolean>, A, Integer, V<Float>> f342914o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q<C20288i1.b<Boolean>, A, Integer, V<Float>> f342915p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j12, q qVar, q qVar2, h1 h1Var, com.google.accompanist.placeholder.c cVar) {
        super(3);
        this.f342911l = j12;
        this.f342912m = h1Var;
        this.f342913n = cVar;
        this.f342914o = qVar;
        this.f342915p = qVar2;
    }

    @Override // Y41.q
    public final v invoke(v vVar, A a12, Integer num) {
        long jG2;
        A a13 = a12;
        num.intValue();
        a13.I(-199242745);
        v.a aVar = v.f42878y1;
        T.f39320b.getClass();
        long j12 = T.f39330l;
        long j13 = this.f342911l;
        if (j13 != j12) {
            a13.I(-199242651);
            a13.O();
            jG2 = j13;
        } else {
            a13.I(-199242620);
            com.google.accompanist.placeholder.b bVar = com.google.accompanist.placeholder.b.f342882a;
            a13.I(-1938941826);
            C21365u5.f34242a.getClass();
            long jF2 = C21365u5.a(a13).f();
            jG2 = androidx.compose.ui.graphics.V.g(T.c(C21320r2.a(jF2, a13), 0.1f), jF2);
            a13.O();
            a13.O();
        }
        h1 h1Var = this.f342912m;
        if (h1Var == null) {
            a13.I(-199242565);
            C21365u5.f34242a.getClass();
            h1Var = C21365u5.b(a13).f33550a;
        } else {
            a13.I(-199242595);
        }
        a13.O();
        v vVarB = j.b(aVar, jG2, h1Var, this.f342913n, this.f342914o, this.f342915p);
        a13.O();
        return vVarB;
    }
}
