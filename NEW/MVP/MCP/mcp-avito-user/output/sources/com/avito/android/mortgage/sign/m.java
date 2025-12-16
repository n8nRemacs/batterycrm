package com.avito.android.mortgage.sign;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.C;
import com.avito.android.mortgage.sign.motions.MotionEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SignScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "pointerInputChange", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.l<C, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203726l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<MotionEvent> f203727m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.g> f203728n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC22204y1<MotionEvent> interfaceC22204y1, InterfaceC22204y1<MotionEvent> interfaceC22204y12, InterfaceC22204y1<l0.g> interfaceC22204y13) {
        super(1);
        this.f203726l = interfaceC22204y1;
        this.f203727m = interfaceC22204y12;
        this.f203728n = interfaceC22204y13;
    }

    @Override // Y41.l
    public final G0 invoke(C c12) {
        C c13 = c12;
        InterfaceC22204y1<MotionEvent> interfaceC22204y1 = this.f203726l;
        this.f203727m.setValue(interfaceC22204y1.getF42167b());
        interfaceC22204y1.setValue(MotionEvent.f203737c);
        this.f203728n.setValue(l0.g.a(c13.f40118c));
        if (c13.f40119d != c13.f40123h) {
            c13.a();
        }
        return G0.f406611a;
    }
}
