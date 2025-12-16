package com.akita.compose.component.base_select;

import Y41.q;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.T;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.u;
import com.akita.compose.component.input.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseSelect.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f60478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f60479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InputState f60480n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60481o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60482p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, boolean z12, InputState inputState, Y41.a aVar, int i12) {
        super(3);
        this.f60478l = vVar;
        this.f60479m = z12;
        this.f60480n = inputState;
        this.f60481o = aVar;
        this.f60482p = i12;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v vVar = this.f60478l;
            long j12 = vVar.f61838k;
            v.a.C2090a c2090a = v.a.f61852e;
            u.c(interfaceC20640y2, j12, ((T) vVar.f61848u.a(this.f60479m, this.f60480n, a13).getF42167b()).f39331a, this.f60481o, androidx.compose.ui.v.f42878y1, r.c(1513699591, new a(this.f60482p), a13), a13, (iIntValue & 14) | 221184, 0);
        }
        return G0.f406611a;
    }
}
