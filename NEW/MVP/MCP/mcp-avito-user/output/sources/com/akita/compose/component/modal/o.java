package com.akita.compose.component.modal;

import com.akita.compose.foundation.modifier.e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C27348b> f62102m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ModalButtonsOrientation f62103n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C c12, List<C27348b> list, ModalButtonsOrientation modalButtonsOrientation) {
        super(2);
        this.f62101l = c12;
        this.f62102m = list;
        this.f62103n = modalButtonsOrientation;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.g(this.f62101l, this.f62102m, this.f62103n, a13, 72);
        }
        return G0.f406611a;
    }
}
