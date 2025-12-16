package com.avito.android.gig_tutorials.gigtutorials.mvi;

import OH.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import com.avito.android.gig_tutorials.gigtutorials.mvi.entity.GigTutorialsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigTutorialsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LOH/a;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "LOH/c;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<OH.a, GigTutorialsInternalAction, OH.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_tutorials.gigtutorials.domain.a f161137a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigTutorialsOpenParams f161138b;

    @Inject
    public a(@Y61.k com.avito.android.gig_tutorials.gigtutorials.domain.a aVar, @Y61.k GigTutorialsOpenParams gigTutorialsOpenParams) {
        this.f161137a = aVar;
        this.f161138b = gigTutorialsOpenParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<GigTutorialsInternalAction> b(OH.a aVar, OH.c cVar) {
        OH.a aVar2 = aVar;
        if (aVar2 instanceof a.C0785a) {
            return new C43210w(new GigTutorialsInternalAction.OpenDeeplink(((a.C0785a) aVar2).f12147a));
        }
        if (aVar2 instanceof a.b) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(new C43210w(GigTutorialsInternalAction.Loading.f161153b), this.f161137a.a(this.f161138b.f161113b)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
