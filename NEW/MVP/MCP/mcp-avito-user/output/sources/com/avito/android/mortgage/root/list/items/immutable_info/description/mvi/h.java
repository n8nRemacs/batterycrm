package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity.ImmutableInfoDescriptionInternalAction;
import d10.InterfaceC39482b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImmutableInfoDescriptionOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "Ld10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<ImmutableInfoDescriptionInternalAction, InterfaceC39482b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39482b b(ImmutableInfoDescriptionInternalAction immutableInfoDescriptionInternalAction) {
        if (immutableInfoDescriptionInternalAction instanceof ImmutableInfoDescriptionInternalAction.Close) {
            return InterfaceC39482b.a.f393616a;
        }
        return null;
    }
}
