package com.avito.android.gig_apply.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pH.AbstractC46953a;
import pH.AbstractC46954b;
import pH.C46956d;

/* compiled from: GigApplyActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_apply/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LpH/a;", "LpH/b;", "LpH/d;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.a<AbstractC46953a, AbstractC46954b, C46956d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.domain.c f159718a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigApplyOpenParams f159719b;

    @Inject
    public c(@Y61.k com.avito.android.gig_apply.domain.c cVar, @Y61.k GigApplyOpenParams gigApplyOpenParams) {
        this.f159718a = cVar;
        this.f159719b = gigApplyOpenParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC46954b> b(AbstractC46953a abstractC46953a, C46956d c46956d) {
        AbstractC46953a abstractC46953a2 = abstractC46953a;
        if (abstractC46953a2 instanceof AbstractC46953a.C12258a) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new C30720a(2, null)), this.f159718a.a(this.f159719b.f159857b)));
        }
        if (abstractC46953a2 instanceof AbstractC46953a.c) {
            return C43175k.G(new C30721b(2, null));
        }
        if (abstractC46953a2 instanceof AbstractC46953a.b) {
            return new C43210w(AbstractC46954b.C12259b.f428306a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
