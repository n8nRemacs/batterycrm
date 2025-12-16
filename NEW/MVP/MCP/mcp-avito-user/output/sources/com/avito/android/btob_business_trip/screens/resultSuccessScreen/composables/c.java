package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.q;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f108060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f108061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super(3);
        this.f108060l = str;
        this.f108061m = str2;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            float f12 = 8;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 12;
            v vVarM = R1.m(aVar, 0.0f, f13, 0.0f, f12, 5);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i12 = androidx.compose.ui.text.style.i.f42678e;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            p.b(this.f108060l, iVar.f65232c, vVarM, false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 984);
            p.b(this.f108061m, iVar.f65241l, R1.m(aVar, 0.0f, f13, 0.0f, f12, 5), false, 0L, androidx.compose.ui.text.style.i.a(i12), 0, 0, false, null, a13, 0, 984);
        }
        return G0.f406611a;
    }
}
