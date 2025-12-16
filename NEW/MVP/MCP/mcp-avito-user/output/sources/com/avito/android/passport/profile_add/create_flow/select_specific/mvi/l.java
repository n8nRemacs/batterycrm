package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectSpecificReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "LT50/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements u<SelectSpecificInternalAction, T50.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create_flow.select_specific.f f211761b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectSpecificArguments f211762c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<Q<Integer, Integer>> f211763d;

    @Inject
    public l(@Y61.k com.avito.android.passport.profile_add.create_flow.select_specific.f fVar, @Y61.k SelectSpecificArguments selectSpecificArguments, @Y61.k Z1<Q<Integer, Integer>> z12) {
        this.f211761b = fVar;
        this.f211762c = selectSpecificArguments;
        this.f211763d = z12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final T50.c a(SelectSpecificInternalAction selectSpecificInternalAction, T50.c cVar) {
        SelectSpecificInternalAction selectSpecificInternalAction2 = selectSpecificInternalAction;
        T50.c cVar2 = cVar;
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.InitState) {
            Q<Integer, Integer> value = this.f211763d.getValue();
            Integer num = value.f406619b;
            Integer num2 = value.f406620c;
            int i12 = this.f211762c.f211616c;
            if (num == null || num.intValue() != i12) {
                num2 = null;
            }
            return b(cVar2, num2, false);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.SelectSpecific) {
            return b(cVar2, Integer.valueOf(((SelectSpecificInternalAction.SelectSpecific) selectSpecificInternalAction2).f211746b.f211653b), false);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.EmptySelectError) {
            return b(cVar2, cVar2.f15374e, true);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.StartActionProgress) {
            return T50.c.a(cVar2, null, false, true, null, 11);
        }
        if (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.FinishActionInProgress) {
            return T50.c.a(cVar2, null, false, false, null, 11);
        }
        if ((selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.Navigate) || (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.ActionError) || (selectSpecificInternalAction2 instanceof SelectSpecificInternalAction.OpenDeepLink)) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final T50.c b(T50.c cVar, Integer num, boolean z12) {
        SelectSpecificArguments selectSpecificArguments = this.f211762c;
        return T50.c.a(cVar, this.f211761b.a(selectSpecificArguments.f211618e, num, z12, selectSpecificArguments.f211619f), z12, false, num, 4);
    }
}
