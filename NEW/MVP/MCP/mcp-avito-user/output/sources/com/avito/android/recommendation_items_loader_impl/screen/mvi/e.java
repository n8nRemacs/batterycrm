package com.avito.android.recommendation_items_loader_impl.screen.mvi;

import Ii0.InterfaceC14116a;
import Mi0.C14495d;
import Mi0.InterfaceC14492a;
import Mi0.InterfaceC14493b;
import com.avito.android.arch.mvi.a;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RecommendationLoaderActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LMi0/a;", "LMi0/b;", "LMi0/d;", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC14492a, InterfaceC14493b, C14495d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14116a f252326a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f252327b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecommendationLoaderActivityArgument f252328c;

    @Inject
    public e(@Y61.k InterfaceC14116a interfaceC14116a, @Y61.k R0 r02, @Y61.k RecommendationLoaderActivityArgument recommendationLoaderActivityArgument) {
        this.f252326a = interfaceC14116a;
        this.f252327b = r02;
        this.f252328c = recommendationLoaderActivityArgument;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14493b> b(InterfaceC14492a interfaceC14492a, C14495d c14495d) {
        InterfaceC14492a interfaceC14492a2 = interfaceC14492a;
        if (interfaceC14492a2 instanceof InterfaceC14492a.b) {
            return c();
        }
        if (interfaceC14492a2.equals(InterfaceC14492a.C0698a.f10992a)) {
            return c();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C43152f0 c() {
        RecommendationLoaderActivityArgument recommendationLoaderActivityArgument = this.f252328c;
        if (recommendationLoaderActivityArgument instanceof RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument) {
            return new C43152f0(C43175k.G(new c(this, (RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument) recommendationLoaderActivityArgument, null)), new d(3, null));
        }
        if (recommendationLoaderActivityArgument instanceof RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument) {
            return new C43152f0(C43175k.G(new a(this, (RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument) recommendationLoaderActivityArgument, null)), new b(3, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
