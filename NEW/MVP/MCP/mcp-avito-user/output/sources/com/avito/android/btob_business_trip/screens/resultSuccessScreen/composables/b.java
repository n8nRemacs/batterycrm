package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.q;
import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f108057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f108058m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f108059n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Uri uri, int i12, int i13) {
        super(3);
        this.f108057l = i12;
        this.f108058m = i13;
        this.f108059n = uri;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            float f12 = this.f108057l;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarQ = C20588k2.q(aVar, f12, this.f108058m);
            InterfaceC22374n.f40491a.getClass();
            InterfaceC22374n.a.C1667a c1667a = InterfaceC22374n.a.f40493b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            coil.compose.v.a(this.f108059n, null, vVarQ, new androidx.compose.ui.graphics.painter.d(aVar3.f63909b0.c(a13), null), new androidx.compose.ui.graphics.painter.d(aVar3.f63909b0.c(a13), null), null, null, null, null, null, c1667a, null, a13, 36920, 6, 64480);
        }
        return G0.f406611a;
    }
}
