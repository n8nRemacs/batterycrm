package com.akita.compose.component.multiselect;

import Y41.q;
import Y41.s;
import androidx.compose.foundation.layout.InterfaceC20611q1;
import androidx.compose.runtime.A;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Multiselect.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/q1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/q1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements q<InterfaceC20611q1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f62156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f62157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62158n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, g gVar, boolean z12) {
        super(3);
        this.f62156l = fVar;
        this.f62157m = gVar;
        this.f62158n = z12;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20611q1 interfaceC20611q1, A a12, Integer num) {
        InterfaceC20611q1 interfaceC20611q12 = interfaceC20611q1;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20611q12) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            Iterator it = this.f62156l.f62173a.iterator();
            while (it.hasNext()) {
                ((s) ((Q) it.next()).f406619b).invoke(interfaceC20611q12, this.f62157m, Boolean.valueOf(this.f62158n), a13, Integer.valueOf(iIntValue & 14));
            }
        }
        return G0.f406611a;
    }
}
