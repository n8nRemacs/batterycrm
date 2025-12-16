package com.avito.android.extended_profile;

import androidx.view.N0;
import fA.C40269b;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: ExtendedProfileMviViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "LfA/b;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b0 extends kotlin.jvm.internal.N implements Y41.a<n2<? extends C40269b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X f149388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(X x12) {
        super(0);
        this.f149388l = x12;
    }

    @Override // Y41.a
    public final n2<? extends C40269b> invoke() {
        X x12 = this.f149388l;
        com.avito.android.arch.mvi.c cVar = (com.avito.android.arch.mvi.c) x12.f149375N.getValue();
        InterfaceC42726C interfaceC42726C = x12.f149376O;
        C1 c12 = new C1(cVar, (com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726C.getValue(), new a0(3, null));
        A1.a aVarA = N0.a(x12);
        i2.f411430a.getClass();
        return C43175k.U(c12, aVarA, i2.a.f411433c, new C40269b((com.avito.android.extended_profile.mvi.entity.a) ((com.avito.android.arch.mvi.c) x12.f149375N.getValue()).f91929r.get(), (AbstractC40048c) ((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726C.getValue()).getState()));
    }
}
