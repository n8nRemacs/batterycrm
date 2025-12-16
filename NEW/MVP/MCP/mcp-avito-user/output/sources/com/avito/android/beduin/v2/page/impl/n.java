package com.avito.android.beduin.v2.page.impl;

import com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinV2PageFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/i;", "LeT/c;", "invoke", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.a<InterfaceC43160i<? extends AbstractC40048c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinV2PageFragment f105126l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BeduinV2PageFragment beduinV2PageFragment) {
        super(0);
        this.f105126l = beduinV2PageFragment;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends AbstractC40048c> invoke() {
        BeduinV2PageFragment.a aVar = BeduinV2PageFragment.f104859L0;
        return this.f105126l.s5().getState();
    }
}
