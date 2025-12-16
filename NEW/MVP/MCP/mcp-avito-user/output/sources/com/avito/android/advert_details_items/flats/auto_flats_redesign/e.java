package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.AdvertParameters;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertParameters.Parameter f84693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f84694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f84695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22602e f84696o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f84697p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advert_core.advert.k f84698q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f84699r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdvertParameters.Parameter parameter, String str, Integer num, C22602e c22602e, boolean z12, com.avito.android.advert_core.advert.k kVar, boolean z13) {
        super(2);
        this.f84693l = parameter;
        this.f84694m = str;
        this.f84695n = num;
        this.f84696o = c22602e;
        this.f84697p = z12;
        this.f84698q = kVar;
        this.f84699r = z13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        com.akita.compose.foundation.p pVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C22187u0.d(new d(this.f84697p, this.f84698q, this.f84699r, null), a13, this.f84693l.getAttributeId());
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(v.f42878y1, 0.0f, 8, 0.0f, 0.0f, 13);
            String str = this.f84694m;
            a13.C(1701344827);
            C22602e.b bVar = new C22602e.b(0, 1, null);
            if (this.f84695n != null) {
                a13.C(-1241248972);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                pVar = com.akita.compose.theme.re23.b.f63984b.f63915d0;
            } else {
                a13.C(-1241247180);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63987e.getClass();
                com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                pVar = X2.h.f18557e;
            }
            long jC2 = pVar.c(a13);
            a13.h();
            int iL2 = bVar.l(new e0(jC2, 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null));
            try {
                bVar.f(str);
                G0 g02 = G0.f406611a;
                bVar.h(iL2);
                C22602e c22602eM = bVar.m();
                a13.h();
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.description_list.d.c(c22602eM, this.f84696o, false, null, com.akita.compose.theme.re23.b.g(a13).getF66136b(), vVarM, true, a13, 1772928);
            } catch (Throwable th2) {
                bVar.h(iL2);
                throw th2;
            }
        }
        return G0.f406611a;
    }
}
