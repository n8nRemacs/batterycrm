package com.avito.android.select.new_metro.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import iq0.InterfaceC42092b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectMetroOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Liq0/b;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements com.avito.android.arch.mvi.t<SelectMetroInternalAction, InterfaceC42092b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42092b b(SelectMetroInternalAction selectMetroInternalAction) {
        SelectMetroInternalAction selectMetroInternalAction2 = selectMetroInternalAction;
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.Cancel) {
            return InterfaceC42092b.a.f405266a;
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.StationItemChanged) {
            return InterfaceC42092b.c.f405268a;
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.ConfirmClicked) {
            return new InterfaceC42092b.C11538b(((SelectMetroInternalAction.ConfirmClicked) selectMetroInternalAction2).f266234b);
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.ResetScroll) {
            return InterfaceC42092b.d.f405269a;
        }
        return null;
    }
}
