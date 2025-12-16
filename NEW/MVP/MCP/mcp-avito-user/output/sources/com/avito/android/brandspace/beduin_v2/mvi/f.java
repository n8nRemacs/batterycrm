package com.avito.android.brandspace.beduin_v2.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.brandspace.beduin_v2.mvi.entity.BrandspaceBeduinV2InternalAction;
import ik.InterfaceC41417b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BrandspaceBeduinV2OneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lik/b;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements t<BrandspaceBeduinV2InternalAction, InterfaceC41417b> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC41417b b(BrandspaceBeduinV2InternalAction brandspaceBeduinV2InternalAction) {
        BrandspaceBeduinV2InternalAction brandspaceBeduinV2InternalAction2 = brandspaceBeduinV2InternalAction;
        if (brandspaceBeduinV2InternalAction2 instanceof BrandspaceBeduinV2InternalAction.HandleBeduinJsonScenario) {
            return new InterfaceC41417b.a(((BrandspaceBeduinV2InternalAction.HandleBeduinJsonScenario) brandspaceBeduinV2InternalAction2).f107577b);
        }
        return null;
    }
}
