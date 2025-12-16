package com.avito.android.avito_finance_user_profile.view.mvi;

import com.avito.android.avito_finance_user_profile.view.mvi.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoFinanceViewModelImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/q;", "Lcom/avito/android/avito_finance_user_profile/view/mvi/p;", "a", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends p {

    /* compiled from: AvitoFinanceViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/mvi/q$a;", "Lcom/avito/android/avito_finance_user_profile/view/mvi/p$a;", "_avito_avito-finance-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements p.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final i f98060a;

        @Inject
        public a(@Y61.k i iVar) {
            this.f98060a = iVar;
        }

        @Override // com.avito.android.avito_finance_user_profile.view.mvi.p.a
        @Y61.k
        public final q create() {
            return new q(this.f98060a, null, 2, null);
        }
    }
}
