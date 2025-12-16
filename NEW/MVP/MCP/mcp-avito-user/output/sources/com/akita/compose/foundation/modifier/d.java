package com.akita.compose.foundation.modifier;

import Y41.q;
import Y61.k;
import android.os.Build;
import androidx.compose.runtime.A;
import androidx.compose.ui.draw.o;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Shadow.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f63611a;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<v, A, Integer, v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f63612l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f63613m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e f63614n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, float f12, e eVar2) {
            super(3);
            this.f63612l = eVar;
            this.f63613m = f12;
            this.f63614n = eVar2;
        }

        @Override // Y41.q
        public final v invoke(v vVar, A a12, Integer num) {
            A a13 = a12;
            num.intValue();
            a13.C(1996084337);
            v.a aVar = v.f42878y1;
            e eVar = this.f63612l;
            v vVarB = d.b(aVar, eVar.f63620d.c(a13), this.f63613m, eVar.f63619c, eVar.f63618b, eVar.f63617a);
            e eVar2 = this.f63614n;
            v vVarD0 = vVarB.d0(d.b(aVar, eVar2.f63620d.c(a13), this.f63613m, eVar2.f63619c, eVar2.f63618b, eVar2.f63617a));
            a13.h();
            return vVarD0;
        }
    }

    static {
        h.a aVar = h.f42849c;
        f63611a = 0;
    }

    @k
    public static final v a(@k v vVar, @k e eVar, @k e eVar2, float f12) {
        return n.a(vVar, C22535v1.f41625a, new a(eVar, f12, eVar2));
    }

    public static v b(v.a aVar, long j12, float f12, float f13, float f14, float f15) {
        v vVarB;
        float f16 = 0;
        h.a aVar2 = h.f42849c;
        if (Build.VERSION.SDK_INT >= 28) {
            vVarB = o.b(v.f42878y1, new b(f13, f15, f14, f16, f12, V.j(T.c(j12, 0.0f)), V.j(j12)));
        } else {
            vVarB = o.b(v.f42878y1, new c(f13, V.j(j12), f15, f16, f14, f12));
        }
        aVar.getClass();
        return vVarB;
    }
}
