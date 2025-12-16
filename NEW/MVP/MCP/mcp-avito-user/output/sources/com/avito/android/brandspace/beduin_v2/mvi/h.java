package com.avito.android.brandspace.beduin_v2.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.brandspace.beduin_v2.mvi.entity.BrandspaceBeduinV2InternalAction;
import ik.C41418c;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BrandspaceBeduinV2Reducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lik/c;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements u<BrandspaceBeduinV2InternalAction, C41418c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C41418c a(BrandspaceBeduinV2InternalAction brandspaceBeduinV2InternalAction, C41418c c41418c) {
        BrandspaceBeduinV2InternalAction brandspaceBeduinV2InternalAction2 = brandspaceBeduinV2InternalAction;
        C41418c c41418c2 = c41418c;
        if (!(brandspaceBeduinV2InternalAction2 instanceof BrandspaceBeduinV2InternalAction.UpdateBeduinState)) {
            return c41418c2;
        }
        AbstractC40048c abstractC40048c = ((BrandspaceBeduinV2InternalAction.UpdateBeduinState) brandspaceBeduinV2InternalAction2).f107578b;
        if (abstractC40048c instanceof AbstractC40048c.C11084c ? true : abstractC40048c instanceof AbstractC40048c.d ? true : abstractC40048c instanceof AbstractC40048c.b) {
            return new C41418c(C41418c.a.C11391a.f398712a);
        }
        if (abstractC40048c instanceof AbstractC40048c.a) {
            return new C41418c(new C41418c.a.b(((AbstractC40048c.a) abstractC40048c).getF395211c()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
