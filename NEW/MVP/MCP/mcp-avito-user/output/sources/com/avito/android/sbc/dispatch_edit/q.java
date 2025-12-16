package com.avito.android.sbc.dispatch_edit;

import Wo0.C15785a;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class q extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f260154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Wo0.d f260155m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l f260156n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f260157o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, Wo0.d dVar, Y41.l lVar, float f12) {
        super(4);
        this.f260154l = list;
        this.f260155m = dVar;
        this.f260156n = lVar;
        this.f260157o = f12;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            C15785a c15785a = (C15785a) this.f260154l.get(iIntValue);
            a13.C(602898030);
            Wo0.d dVar = this.f260155m;
            e.a(c15785a, dVar.f18064e.size(), dVar.f18063d, this.f260156n, this.f260157o, a13, 0);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
