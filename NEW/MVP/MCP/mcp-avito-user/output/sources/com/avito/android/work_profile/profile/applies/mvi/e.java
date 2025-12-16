package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import com.avito.android.work_profile.profile.applies.mvi.entity.Loader;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AppliesToVacancyBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements com.avito.android.arch.mvi.b<AppliesToVacancyInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f330888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.profile.applies.mvi.action_handlers.a f330889b;

    @Inject
    public e(boolean z12, @Y61.k com.avito.android.work_profile.profile.applies.mvi.action_handlers.a aVar) {
        this.f330888a = z12;
        this.f330889b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AppliesToVacancyInternalAction> a() {
        if (this.f330888a) {
            return C43175k.w();
        }
        return this.f330889b.a(Loader.f330894b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
