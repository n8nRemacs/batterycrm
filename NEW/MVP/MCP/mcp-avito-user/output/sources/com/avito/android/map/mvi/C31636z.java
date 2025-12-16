package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.remote.model.PinAdvertsResult;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadAdvertsInPin$1", f = "MapInteractor.kt", i = {}, l = {224, 233, 222}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31636z extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f185320q;

    /* renamed from: r, reason: collision with root package name */
    public int f185321r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f185322s;

    /* renamed from: t, reason: collision with root package name */
    public int f185323t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f185324u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C f185325v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SearchParams f185326w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a.C5436a.C5437a f185327x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f185328y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f185329z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31636z(C c12, SearchParams searchParams, a.C5436a.C5437a c5437a, int i12, boolean z12, Continuation continuation) {
        super(2, continuation);
        this.f185325v = c12;
        this.f185326w = searchParams;
        this.f185327x = c5437a;
        this.f185328y = i12;
        this.f185329z = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31636z c31636z = new C31636z(this.f185325v, this.f185326w, this.f185327x, this.f185328y, this.f185329z, continuation);
        c31636z.f185324u = obj;
        return c31636z;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31636z) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<String> list;
        boolean z12;
        Object objC;
        InterfaceC43172j interfaceC43172j;
        a.C5436a.C5437a c5437a;
        int i12;
        Object objE;
        TypedResult typedResult;
        MapInternalAction error;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f185323t;
        if (i13 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f185324u;
            C c12 = this.f185325v;
            Map<String, String> mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(c12.f184893c, this.f185326w, null, false, null, 14, null);
            a.C5436a.C5437a c5437a2 = this.f185327x;
            if (c5437a2 == null || (list = c5437a2.f185190b) == null) {
                C43175k.w();
                return G0.f406611a;
            }
            boolean zIsLongRequest = this.f185326w.isLongRequest();
            com.avito.android.map.analytics.e eVar = c12.f184895e;
            int i14 = this.f185328y;
            z12 = this.f185329z;
            if (zIsLongRequest) {
                String strF = C.f(c12, list, i14);
                String f184839a = eVar.getF184839a();
                Boolean boolBoxBoolean = Boxing.boxBoolean(z12);
                this.f185324u = c5437a2;
                this.f185320q = interfaceC43172j2;
                this.f185321r = i14;
                this.f185322s = z12;
                this.f185323t = 1;
                objE = c12.f184891a.e(strF, 20, f184839a, boolBoxBoolean, mapConvertToMap$default, c5437a2.f185191c, this);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                c5437a = c5437a2;
                i12 = i14;
                typedResult = (TypedResult) objE;
            } else {
                String strF2 = C.f(c12, list, i14);
                String f184839a2 = eVar.getF184839a();
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z12);
                this.f185324u = c5437a2;
                this.f185320q = interfaceC43172j2;
                this.f185321r = i14;
                this.f185322s = z12;
                this.f185323t = 2;
                objC = c12.f184891a.c(strF2, 20, f184839a2, boolBoxBoolean2, mapConvertToMap$default, c5437a2.f185191c, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                c5437a = c5437a2;
                i12 = i14;
                typedResult = (TypedResult) objC;
            }
        } else if (i13 == 1) {
            boolean z13 = this.f185322s;
            i12 = this.f185321r;
            interfaceC43172j = this.f185320q;
            c5437a = (a.C5436a.C5437a) this.f185324u;
            C42729a0.b(obj);
            z12 = z13;
            objE = obj;
            typedResult = (TypedResult) objE;
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            boolean z14 = this.f185322s;
            i12 = this.f185321r;
            interfaceC43172j = this.f185320q;
            c5437a = (a.C5436a.C5437a) this.f185324u;
            C42729a0.b(obj);
            z12 = z14;
            objC = obj;
            typedResult = (TypedResult) objC;
        }
        boolean z15 = z12;
        a.C5436a.C5437a c5437a3 = c5437a;
        if (typedResult instanceof TypedResult.Success) {
            PinAdvertsResult pinAdvertsResult = (PinAdvertsResult) ((TypedResult.Success) typedResult).getResult();
            error = new MapInternalAction.PinAdvertsLoaded(pinAdvertsResult.getItems(), pinAdvertsResult.getDisplayType(), c5437a3, pinAdvertsResult.getItems().size() + i12, z15, pinAdvertsResult.getFloatingContainer());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error2 = (TypedResult.Error) typedResult;
            error = new MapInternalAction.Error(C35936s.a(error2.getError(), error2.getCause()), MapErrorType.f185053b);
        }
        this.f185324u = null;
        this.f185320q = null;
        this.f185323t = 3;
        if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
