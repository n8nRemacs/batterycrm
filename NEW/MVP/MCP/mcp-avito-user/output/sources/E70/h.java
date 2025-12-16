package e70;

import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PersonalFiltersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le70/h;", "Le70/g;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<d> f394968a;

    @Inject
    public h(@Y61.k h31.e<d> eVar) {
        this.f394968a = eVar;
    }

    @Override // e70.g
    @Y61.l
    public final Object a(boolean z12, @Y61.k Map map, @Y61.k SuspendLambda suspendLambda) {
        Object objA = this.f394968a.get().a(z12, map, suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
