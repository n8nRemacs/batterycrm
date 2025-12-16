package com.avito.android.work_profile.profile.about_me.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import hQ0.C40868c;
import hQ0.InterfaceC40866a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AboutMeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LhQ0/a;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "LhQ0/c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40866a, AboutMeInternalAction, C40868c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.j f330787a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f330788b;

    @Inject
    public b(@Y61.k com.avito.android.work_profile.domain.j jVar, @Y61.k Set<String> set) {
        this.f330787a = jVar;
        this.f330788b = set;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AboutMeInternalAction> b(InterfaceC40866a interfaceC40866a, C40868c c40868c) {
        InterfaceC40866a interfaceC40866a2 = interfaceC40866a;
        if (interfaceC40866a2 instanceof InterfaceC40866a.d) {
            InterfaceC40866a.d dVar = (InterfaceC40866a.d) interfaceC40866a2;
            if (dVar instanceof InterfaceC40866a.b) {
                return C43175k.G(new a(dVar, this, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(interfaceC40866a2 instanceof InterfaceC40866a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40866a.c cVar = (InterfaceC40866a.c) interfaceC40866a2;
        if (cVar instanceof InterfaceC40866a.C11255a) {
            return new C43210w(new AboutMeInternalAction.HandleBeduinEvent(((InterfaceC40866a.C11255a) cVar).f397189a));
        }
        if (cVar instanceof InterfaceC40866a.e) {
            return new C43210w(new AboutMeInternalAction.HandleBeduinState(((InterfaceC40866a.e) cVar).f397191a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
