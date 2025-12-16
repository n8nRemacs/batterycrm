package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.PinFloatingButton;
import com.avito.android.remote.model.PinFloatingContainer;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.map.SerpFloatingButton;
import com.avito.android.remote.model.search.map.SerpFloatingContainer;
import com.avito.android.util.C35936s;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
@DebugMetadata(c = "com.avito.android.map.mvi.MapInteractorImpl$loadSerpAdvertsInPin$1", f = "MapInteractor.kt", i = {0, 1}, l = {279, 297, 317, 345}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class D extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f184935A;

    /* renamed from: q, reason: collision with root package name */
    public a.C5436a.C5437a f184936q;

    /* renamed from: r, reason: collision with root package name */
    public int f184937r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f184938s;

    /* renamed from: t, reason: collision with root package name */
    public int f184939t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f184940u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C f184941v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SearchParams f184942w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a.C5436a.C5437a f184943x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PresentationType f184944y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f184945z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C c12, SearchParams searchParams, a.C5436a.C5437a c5437a, PresentationType presentationType, int i12, boolean z12, Continuation continuation) {
        super(2, continuation);
        this.f184941v = c12;
        this.f184942w = searchParams;
        this.f184943x = c5437a;
        this.f184944y = presentationType;
        this.f184945z = i12;
        this.f184935A = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        D d12 = new D(this.f184941v, this.f184942w, this.f184943x, this.f184944y, this.f184945z, this.f184935A, continuation);
        d12.f184940u = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((D) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<String> list;
        boolean z12;
        int i12;
        Object objB;
        Object obj2;
        a.C5436a.C5437a c5437a;
        InterfaceC43172j interfaceC43172j;
        int i13;
        Object objA;
        Object obj3;
        boolean z13;
        a.C5436a.C5437a c5437a2;
        InterfaceC43172j interfaceC43172j2;
        TypedResult typedResult;
        boolean z14;
        a.C5436a.C5437a c5437a3;
        InterfaceC43172j interfaceC43172j3;
        PinFloatingContainer pinFloatingContainer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = this.f184939t;
        if (i14 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j4 = (InterfaceC43172j) this.f184940u;
            C c12 = this.f184941v;
            Map mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(c12.f184893c, this.f184942w, null, false, null, 14, null);
            a.C5436a.C5437a c5437a4 = this.f184943x;
            if (c5437a4 == null || (list = c5437a4.f185190b) == null) {
                C43175k.w();
                return G0.f406611a;
            }
            boolean zIsLongRequest = this.f184942w.isLongRequest();
            com.avito.android.map.analytics.e eVar = c12.f184895e;
            Set<String> set = c12.f184897g;
            PresentationType presentationType = this.f184944y;
            int i15 = this.f184945z;
            boolean z15 = this.f184935A;
            if (zIsLongRequest) {
                String strA = ZS.d.a(set);
                String parameterValue = PresentationTypeKt.toParameterValue(presentationType);
                String strF = C.f(c12, list, i15);
                String parameterValue2 = SerpDisplayTypeKt.toParameterValue(SerpDisplayType.MiniRich);
                String f184839a = eVar.getF184839a();
                Integer numBoxInt = Boxing.boxInt(1);
                Boolean boolBoxBoolean = Boxing.boxBoolean(z15);
                Integer numBoxInt2 = Boxing.boxInt(20);
                this.f184940u = interfaceC43172j4;
                this.f184936q = c5437a4;
                this.f184937r = i15;
                this.f184938s = z15;
                this.f184939t = 1;
                i13 = i15;
                objA = InterfaceC34323k.a.a(c12.f184892b, strA, parameterValue, numBoxInt, null, c5437a4.f185191c, null, mapConvertToMap$default, null, null, null, parameterValue2, strF, boolBoxBoolean, numBoxInt2, f184839a, this, 66560);
                obj3 = coroutine_suspended;
                if (objA == obj3) {
                    return obj3;
                }
                z13 = z15;
                c5437a2 = c5437a4;
                interfaceC43172j2 = interfaceC43172j4;
                typedResult = (TypedResult) objA;
                z14 = z13;
                c5437a3 = c5437a2;
                interfaceC43172j3 = interfaceC43172j2;
                obj2 = obj3;
            } else {
                String strA2 = ZS.d.a(set);
                String parameterValue3 = PresentationTypeKt.toParameterValue(presentationType);
                String strF2 = C.f(c12, list, i15);
                String parameterValue4 = SerpDisplayTypeKt.toParameterValue(SerpDisplayType.MiniRich);
                String f184839a2 = eVar.getF184839a();
                Integer numBoxInt3 = Boxing.boxInt(1);
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z15);
                Integer numBoxInt4 = Boxing.boxInt(20);
                this.f184940u = interfaceC43172j4;
                this.f184936q = c5437a4;
                this.f184937r = i15;
                this.f184938s = z15;
                this.f184939t = 2;
                z12 = z15;
                i12 = i15;
                objB = InterfaceC34323k.a.b(c12.f184892b, strA2, parameterValue3, numBoxInt3, null, c5437a4.f185191c, null, mapConvertToMap$default, null, null, null, parameterValue4, null, null, strF2, boolBoxBoolean2, numBoxInt4, f184839a2, this, 271360);
                obj2 = coroutine_suspended;
                if (objB == obj2) {
                    return obj2;
                }
                c5437a = c5437a4;
                interfaceC43172j = interfaceC43172j4;
                typedResult = (TypedResult) objB;
                c5437a3 = c5437a;
                interfaceC43172j3 = interfaceC43172j;
                i13 = i12;
                z14 = z12;
            }
        } else if (i14 == 1) {
            boolean z16 = this.f184938s;
            int i16 = this.f184937r;
            c5437a2 = this.f184936q;
            interfaceC43172j2 = (InterfaceC43172j) this.f184940u;
            C42729a0.b(obj);
            i13 = i16;
            obj3 = coroutine_suspended;
            z13 = z16;
            objA = obj;
            typedResult = (TypedResult) objA;
            z14 = z13;
            c5437a3 = c5437a2;
            interfaceC43172j3 = interfaceC43172j2;
            obj2 = obj3;
        } else {
            if (i14 != 2) {
                if (i14 != 3 && i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            boolean z17 = this.f184938s;
            int i17 = this.f184937r;
            c5437a = this.f184936q;
            interfaceC43172j = (InterfaceC43172j) this.f184940u;
            C42729a0.b(obj);
            z12 = z17;
            i12 = i17;
            obj2 = coroutine_suspended;
            objB = obj;
            typedResult = (TypedResult) objB;
            c5437a3 = c5437a;
            interfaceC43172j3 = interfaceC43172j;
            i13 = i12;
            z14 = z12;
        }
        if (typedResult instanceof TypedResult.Success) {
            BxContentResult bxContentResult = (BxContentResult) ((TypedResult.Success) typedResult).getResult();
            List<SerpElement> items = bxContentResult.getItems();
            SerpDisplayType displayType = bxContentResult.getDisplayType();
            int size = bxContentResult.getItems().size() + i13;
            SerpFloatingContainer floatingContainer = bxContentResult.getFloatingContainer();
            if (floatingContainer != null) {
                SerpFloatingButton secondaryButton = floatingContainer.getSecondaryButton();
                PinFloatingButton pinFloatingButton = secondaryButton != null ? new PinFloatingButton(secondaryButton.getTitle(), secondaryButton.getDeepLink(), secondaryButton.getStyle()) : null;
                SerpFloatingButton primaryButton = floatingContainer.getPrimaryButton();
                pinFloatingContainer = new PinFloatingContainer(pinFloatingButton, primaryButton != null ? new PinFloatingButton(primaryButton.getTitle(), primaryButton.getDeepLink(), primaryButton.getStyle()) : null);
            } else {
                pinFloatingContainer = null;
            }
            MapInternalAction.PinAdvertsLoaded pinAdvertsLoaded = new MapInternalAction.PinAdvertsLoaded(items, displayType, c5437a3, size, z14, pinFloatingContainer);
            this.f184940u = null;
            this.f184936q = null;
            this.f184939t = 3;
            if (interfaceC43172j3.emit(pinAdvertsLoaded, this) == obj2) {
                return obj2;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            MapInternalAction.Error error2 = new MapInternalAction.Error(C35936s.a(error.getError(), error.getCause()), MapErrorType.f185053b);
            this.f184940u = null;
            this.f184936q = null;
            this.f184939t = 4;
            if (interfaceC43172j3.emit(error2, this) == obj2) {
                return obj2;
            }
        }
        return G0.f406611a;
    }
}
