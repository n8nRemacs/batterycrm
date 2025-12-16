package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity.ImmutableInfoDescriptionInternalAction;
import d10.C39483c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImmutableInfoDescriptionReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "Ld10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements u<ImmutableInfoDescriptionInternalAction, C39483c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C39483c a(ImmutableInfoDescriptionInternalAction immutableInfoDescriptionInternalAction, C39483c c39483c) {
        ImmutableInfoDescriptionInternalAction immutableInfoDescriptionInternalAction2 = immutableInfoDescriptionInternalAction;
        C39483c c39483c2 = c39483c;
        return immutableInfoDescriptionInternalAction2 instanceof ImmutableInfoDescriptionInternalAction.SelectTab ? new C39483c(c39483c2.f393618b, ((ImmutableInfoDescriptionInternalAction.SelectTab) immutableInfoDescriptionInternalAction2).f202621b, c39483c2.f393620d, c39483c2.f393621e) : c39483c2;
    }
}
