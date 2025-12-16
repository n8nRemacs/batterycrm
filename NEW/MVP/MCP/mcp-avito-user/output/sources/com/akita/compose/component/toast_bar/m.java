package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f63261m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC27357f interfaceC27357f, C22096n c22096n) {
        super(2);
        this.f63260l = interfaceC27357f;
        this.f63261m = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC27357f interfaceC27357f = this.f63260l;
            if (interfaceC27357f != null) {
                this.f63261m.invoke(interfaceC27357f, a13, 0);
            }
        }
        return G0.f406611a;
    }
}
