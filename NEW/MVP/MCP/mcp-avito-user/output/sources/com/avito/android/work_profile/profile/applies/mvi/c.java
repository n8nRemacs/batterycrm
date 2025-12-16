package com.avito.android.work_profile.profile.applies.mvi;

import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import com.avito.android.work_profile.profile.applies.mvi.entity.Loader;
import jQ0.AbstractC42297a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AppliesToVacancyActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LjQ0/a;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "LjQ0/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.a<AbstractC42297a, AppliesToVacancyInternalAction, jQ0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f330884a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.profile.applies.mvi.action_handlers.a f330885b;

    @Inject
    public c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.work_profile.profile.applies.mvi.action_handlers.a aVar2) {
        this.f330884a = aVar;
        this.f330885b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new a(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<AppliesToVacancyInternalAction> b(AbstractC42297a abstractC42297a, jQ0.b bVar) {
        return c(abstractC42297a);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k AbstractC42297a abstractC42297a) {
        boolean z12 = abstractC42297a instanceof AbstractC42297a.c;
        com.avito.android.work_profile.profile.applies.mvi.action_handlers.a aVar = this.f330885b;
        if (z12) {
            return aVar.a(Loader.f330895c);
        }
        if (abstractC42297a instanceof AbstractC42297a.b) {
            return aVar.a(Loader.f330894b);
        }
        if (abstractC42297a instanceof AbstractC42297a.C11564a) {
            return C43175k.G(new b(this, abstractC42297a, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
