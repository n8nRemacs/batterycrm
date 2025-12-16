package com.avito.android.autoteka.presentation.landing.mvi;

import Lf.InterfaceC14387a;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaLandingActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LLf/a;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "LLf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14387a, AutotekaLandingInternalAction, Lf.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.landing.a f97333a;

    @Inject
    public a(@Y61.k com.avito.android.autoteka.data.landing.a aVar) {
        this.f97333a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaLandingInternalAction> b(InterfaceC14387a interfaceC14387a, Lf.c cVar) {
        if (interfaceC14387a instanceof InterfaceC14387a.C0623a) {
            return this.f97333a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
