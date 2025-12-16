package com.akita.compose.component.modal;

import com.akita.compose.foundation.modifier.e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62053l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C27348b> f62054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C c12, List list) {
        super(2);
        ModalButtonsOrientation modalButtonsOrientation = ModalButtonsOrientation.f62005b;
        this.f62053l = c12;
        this.f62054m = list;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.g(this.f62053l, this.f62054m, ModalButtonsOrientation.f62005b, a13, 72);
        }
        return G0.f406611a;
    }
}
