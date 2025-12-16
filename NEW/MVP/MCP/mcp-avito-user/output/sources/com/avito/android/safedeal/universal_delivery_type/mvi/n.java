package com.avito.android.safedeal.universal_delivery_type.mvi;

import Wi.b;
import com.avito.android.safedeal.universal_delivery_type.ReloadReason;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.mvi.UniversalDeliveryTypeBootstrap$handleReloadScreenActions$$inlined$flatMapLatest$1", f = "UniversalDeliveryTypeBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UniversalDeliveryTypeInternalAction>, b.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f256704q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f256705r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f256706s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f256707t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(3, continuation);
        this.f256707t = pVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UniversalDeliveryTypeInternalAction> interfaceC43172j, b.a aVar, Continuation<? super G0> continuation) {
        n nVar = new n(this.f256707t, continuation);
        nVar.f256705r = interfaceC43172j;
        nVar.f256706s = aVar;
        return nVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f256704q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f256705r;
            b.a aVar = (b.a) this.f256706s;
            Object obj2 = aVar.f18021a.get("reason");
            Integer numY0 = null;
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                str = (String) obj2;
            } else {
                str = null;
            }
            Object obj3 = aVar.f18021a.get("addressId");
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str2 = (String) obj3;
                if (str2 != null) {
                    numY0 = C43066x.y0(str2);
                }
            }
            p pVar = this.f256707t;
            com.avito.android.safedeal.universal_delivery_type.domain.a aVar2 = pVar.f256716b;
            ReloadReason.f256398b.getClass();
            InterfaceC43160i<UniversalDeliveryTypeInternalAction> interfaceC43160iA = aVar2.a(UniversalDeliveryTypeParams.a(pVar.f256715a, numY0, ReloadReason.a.a(str)));
            this.f256704q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
