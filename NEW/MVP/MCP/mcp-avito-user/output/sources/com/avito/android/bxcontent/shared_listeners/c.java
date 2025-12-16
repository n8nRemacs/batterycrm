package com.avito.android.bxcontent.shared_listeners;

import Y41.p;
import Y61.k;
import Y61.l;
import bY.InterfaceC25585b;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.PresentationType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/Location;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.shared_listeners.BxSharedLocationListenerInteractorImpl$listenLocationForAllSearch$2", f = "BxSharedLocationListenerInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<Q<? extends Location, ? extends Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112915q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f112916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PresentationType f112917s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, PresentationType presentationType, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f112916r = hVar;
        this.f112917s = presentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f112916r, this.f112917s, continuation);
        cVar.f112915q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends Location, ? extends Boolean> q12, Continuation<? super G0> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f112915q;
        Location location = (Location) q12.f406619b;
        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
        h hVar = this.f112916r;
        String locationId = ((C29235n) hVar.e()).f112645M.a().getLocationId();
        PresentationType presentationType = this.f112917s;
        if (!presentationType.isSearch() || locationId == null) {
            if (!presentationType.isMain()) {
                return G0.f406611a;
            }
            if (!zBooleanValue || L.f(locationId, location.getId())) {
                return G0.f406611a;
            }
            location = null;
        } else if (!hVar.f112924a.b(locationId) || locationId.equals(location.getId())) {
            return G0.f406611a;
        }
        ((C29235n) hVar.e()).accept(new InterfaceC29127b.C29134d0(location, hVar.f112925b.W0()));
        if (presentationType.isMap()) {
            ((C29235n) hVar.e()).accept(new InterfaceC25585b.x(location));
        }
        return G0.f406611a;
    }
}
