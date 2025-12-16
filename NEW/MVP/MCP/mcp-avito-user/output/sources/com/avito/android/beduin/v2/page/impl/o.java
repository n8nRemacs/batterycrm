package com.avito.android.beduin.v2.page.impl;

import com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2PageFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinV2PageFragment f105140l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BeduinV2PageFragment beduinV2PageFragment) {
        super(0);
        this.f105140l = beduinV2PageFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BeduinV2PageFragment.a aVar = BeduinV2PageFragment.f104859L0;
        BeduinV2PageFragment beduinV2PageFragment = this.f105140l;
        y yVarS5 = beduinV2PageFragment.s5();
        String str = beduinV2PageFragment.f104882z0;
        if (str == null) {
            str = null;
        }
        ZS.b bVar = beduinV2PageFragment.f104862C0;
        yVarS5.accept(new InterfaceC40047a.c(str, bVar != null ? bVar : null));
        return G0.f406611a;
    }
}
