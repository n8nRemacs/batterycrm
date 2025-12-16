package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tF.AbstractC48544a;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LtF/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)LtF/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.location_picker.LocationPickerBinderImpl$combinedStateChanges$1$suggestionsLoadingV2$2$1", f = "LocationPickerBinder.kt", i = {}, l = {424}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.location_picker.t0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31576t0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super AbstractC48544a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f182498q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0 f182499r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocationPickerState f182500s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AvitoMapBounds f182501t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31576t0(x0 x0Var, LocationPickerState locationPickerState, AvitoMapBounds avitoMapBounds, Continuation<? super C31576t0> continuation) {
        super(2, continuation);
        this.f182499r = x0Var;
        this.f182500s = locationPickerState;
        this.f182501t = avitoMapBounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C31576t0(this.f182499r, this.f182500s, this.f182501t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super AbstractC48544a> continuation) {
        return ((C31576t0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f182498q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC31564a interfaceC31564a = this.f182499r.f182811e;
            String str = this.f182500s.f182361f;
            this.f182498q = 1;
            obj = interfaceC31564a.g(str, this.f182501t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
