package Fc1;

import androidx.compose.runtime.internal.InterfaceC22085c;

/* renamed from: Fc1.j3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13645j3 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f5598l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13645j3(InterfaceC22085c interfaceC22085c) {
        super(2);
        this.f5598l = interfaceC22085c;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            this.f5598l.invoke(a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
