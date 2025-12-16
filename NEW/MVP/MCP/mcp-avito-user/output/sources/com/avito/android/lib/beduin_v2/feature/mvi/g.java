package com.avito.android.lib.beduin_v2.feature.mvi;

import LU0.b;
import com.avito.android.arch.mvi.a;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import gT.C40620a;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BeduinActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LeT/a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "LeT/c;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC40047a, BeduinInternalAction, AbstractC40048c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.avito.parser.b f176285a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f176286b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.handler.flow.processor.b f176287c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.interaction.navigation_controller.c f176288d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36238a f176289e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.tracker.c f176290f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C40620a f176291g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.cache.c f176292h;

    @Inject
    public g(@Y61.k com.avito.beduin.v2.avito.parser.b bVar, @Y61.k R0 r02, @Y61.k com.avito.beduin.v2.handler.flow.processor.b bVar2, @Y61.k com.avito.beduin.v2.interaction.navigation_controller.c cVar, @Y61.k InterfaceC36238a interfaceC36238a, @Y61.k com.avito.android.lib.beduin_v2.feature.tracker.c cVar2, @Y61.k C40620a c40620a, @Y61.k com.avito.android.lib.beduin_v2.feature.cache.c cVar3) {
        this.f176285a = bVar;
        this.f176286b = r02;
        this.f176287c = bVar2;
        this.f176288d = cVar;
        this.f176289e = interfaceC36238a;
        this.f176290f = cVar2;
        this.f176291g = c40620a;
        this.f176292h = cVar3;
    }

    public static final Object c(g gVar, com.avito.beduin.v2.avito.parser.a aVar, SuspendLambda suspendLambda) {
        gVar.getClass();
        Object objA = gVar.f176287c.a(new dU0.f(b.a.f9967b.f393887a, new LU0.b(aVar.f335462b, false, true), null, 4, null), suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BeduinInternalAction> b(InterfaceC40047a interfaceC40047a, AbstractC40048c abstractC40048c) {
        InterfaceC40047a interfaceC40047a2 = interfaceC40047a;
        if (interfaceC40047a2 instanceof InterfaceC40047a.C11082a) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC40047a2 instanceof InterfaceC40047a.f) {
            return C43175k.G(new b(this, interfaceC40047a2, null));
        }
        if (interfaceC40047a2 instanceof InterfaceC40047a.e) {
            return C43175k.I(this.f176286b.a(), C43175k.G(new c(this, interfaceC40047a2, null)));
        }
        if (interfaceC40047a2 instanceof InterfaceC40047a.c) {
            return C43175k.h(new d(this, interfaceC40047a2, null));
        }
        if (interfaceC40047a2 instanceof InterfaceC40047a.d) {
            return C43175k.G(new e(this, interfaceC40047a2, null));
        }
        if (interfaceC40047a2.equals(InterfaceC40047a.b.f395205a)) {
            return C43175k.G(new f(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
