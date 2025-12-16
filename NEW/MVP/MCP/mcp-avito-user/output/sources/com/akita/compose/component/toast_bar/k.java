package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.InterfaceC22034b2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63253l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C27355d<InterfaceC27357f> f63254m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC27357f interfaceC27357f, C27355d<InterfaceC27357f> c27355d) {
        super(0);
        this.f63253l = interfaceC27357f;
        this.f63254m = c27355d;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C27355d<InterfaceC27357f> c27355d = this.f63254m;
        Object obj = c27355d.f63245a;
        InterfaceC27357f interfaceC27357f = this.f63253l;
        if (!L.f(interfaceC27357f, obj)) {
            C42745f0.l0(new C27361j(interfaceC27357f), c27355d.f63246b);
            InterfaceC22034b2 interfaceC22034b2 = c27355d.f63247c;
            if (interfaceC22034b2 != null) {
                interfaceC22034b2.invalidate();
            }
        }
        return G0.f406611a;
    }
}
