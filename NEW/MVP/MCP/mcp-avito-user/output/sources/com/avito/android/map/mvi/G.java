package com.avito.android.map.mvi;

import com.avito.android.avito_map.AvitoAreaObjectKt;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.remote.InterfaceC34333n0;
import com.avito.android.remote.model.SaveDrawAreaResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$saveDrawArea$1", f = "MapInteractor.kt", i = {}, l = {191, 190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class G extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184953q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f184954r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C f184955s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<AvitoMapPoint> f184956t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C c12, List<AvitoMapPoint> list, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f184955s = c12;
        this.f184956t = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f184955s, this.f184956t, continuation);
        g12.f184954r = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((G) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        MapInternalAction error;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184953q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f184954r;
            InterfaceC34333n0 interfaceC34333n0 = this.f184955s.f184891a;
            List<AvitoMapPoint> list = this.f184956t;
            String base64EncodedJsonString = list != null ? AvitoAreaObjectKt.fromValues("Polygon", list).toBase64EncodedJsonString() : null;
            this.f184954r = interfaceC43172j;
            this.f184953q = 1;
            obj = interfaceC34333n0.a(base64EncodedJsonString, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f184954r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            error = new MapInternalAction.AreaSaved(((SaveDrawAreaResponse) ((TypedResult.Success) typedResult).getResult()).getDrawId());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error2 = (TypedResult.Error) typedResult;
            error = new MapInternalAction.Error(C35936s.a(error2.getError(), error2.getCause()), MapErrorType.f185055d);
        }
        this.f184954r = null;
        this.f184953q = 2;
        if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
