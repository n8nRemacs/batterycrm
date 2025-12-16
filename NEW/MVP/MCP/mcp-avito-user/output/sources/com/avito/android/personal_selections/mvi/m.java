package com.avito.android.personal_selections.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l70.b;

/* compiled from: PersonalSelectionsItemReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_selections/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Ll70/b;", "Lcom/avito/android/personal_selections/mvi/entity/PersonalSelectionsItemState;", "<init>", "()V", "_avito_personal-selections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<l70.b, PersonalSelectionsItemState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final PersonalSelectionsItemState a(l70.b bVar, PersonalSelectionsItemState personalSelectionsItemState) {
        l70.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return new PersonalSelectionsItemState(((b.a) bVar2).f413538a);
        }
        if (bVar2 instanceof b.C11776b) {
            return new PersonalSelectionsItemState(null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
