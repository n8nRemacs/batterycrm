package com.avito.android.screens.bbip_private_v2.mvi;

import com.avito.android.screens.bbip_private_v2.ui.BbipPrivateV2ActionGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tp0.InterfaceC48700a;

/* compiled from: BbipPrivateV2Actor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltp0/a;", "it", "Lcom/avito/android/screens/bbip_private_v2/ui/BbipPrivateV2ActionGroup;", "invoke", "(Ltp0/a;)Lcom/avito/android/screens/bbip_private_v2/ui/BbipPrivateV2ActionGroup;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.l<InterfaceC48700a, BbipPrivateV2ActionGroup> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f260967l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final BbipPrivateV2ActionGroup invoke(InterfaceC48700a interfaceC48700a) {
        InterfaceC48700a interfaceC48700a2 = interfaceC48700a;
        if (interfaceC48700a2 instanceof InterfaceC48700a.m) {
            return BbipPrivateV2ActionGroup.f261113b;
        }
        return interfaceC48700a2 instanceof InterfaceC48700a.c ? true : interfaceC48700a2 instanceof InterfaceC48700a.d ? BbipPrivateV2ActionGroup.f261114c : BbipPrivateV2ActionGroup.f261115d;
    }
}
