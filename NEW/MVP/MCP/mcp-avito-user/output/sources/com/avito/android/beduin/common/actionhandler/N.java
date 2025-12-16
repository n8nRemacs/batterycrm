package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinDelayAction;
import kotlin.Metadata;

/* compiled from: BeduinDelayActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinDelayAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/action/BeduinDelayAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<BeduinDelayAction, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f100102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o12) {
        super(1);
        this.f100102l = o12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(BeduinDelayAction beduinDelayAction) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f100102l.f100104a.get(), beduinDelayAction.getActions());
        return kotlin.G0.f406611a;
    }
}
