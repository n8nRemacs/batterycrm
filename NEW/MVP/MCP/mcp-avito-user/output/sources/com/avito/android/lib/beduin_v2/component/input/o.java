package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: InputCompose.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/focus/f0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.l<f0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f175736l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f175737m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Y41.l<? super Boolean, G0> lVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
        super(1);
        this.f175736l = lVar;
        this.f175737m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(f0 f0Var) {
        f0 f0Var2 = f0Var;
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f175737m;
        if (interfaceC22204y1.getF42167b() != null && !L.f(interfaceC22204y1.getF42167b(), Boolean.valueOf(f0Var2.a()))) {
            this.f175736l.invoke(Boolean.valueOf(f0Var2.a()));
        }
        interfaceC22204y1.setValue(Boolean.valueOf(f0Var2.a()));
        return G0.f406611a;
    }
}
