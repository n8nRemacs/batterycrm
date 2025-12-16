package com.avito.android.advert.item.spare_parts;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SparePartsParameters;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import vx0.InterfaceC49391a;

/* compiled from: SparePartsRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.spare_parts.SparePartsRepositoryImpl$loadSparePartsV2$1", f = "SparePartsRepository.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f80455q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f80456r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SparePartsParameters f80457s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f80458t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1<P2<SparePartsV2Response>> f80459u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, SparePartsParameters sparePartsParameters, String str, Z1<P2<SparePartsV2Response>> z12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f80456r = hVar;
        this.f80457s = sparePartsParameters;
        this.f80458t = str;
        this.f80459u = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f80456r, this.f80457s, this.f80458t, this.f80459u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f80455q;
        Z1<P2<SparePartsV2Response>> z12 = this.f80459u;
        h hVar = this.f80456r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC49391a interfaceC49391a = hVar.f80471a.get();
                String microcategoryId = this.f80457s.getMicrocategoryId();
                String str = this.f80458t;
                this.f80455q = 1;
                obj = interfaceC49391a.a(microcategoryId, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            z12.setValue(new P2.b((SparePartsV2Response) obj));
        } catch (Exception e12) {
            z12.setValue(new P2.a(hVar.f80473c.a(e12)));
        }
        return G0.f406611a;
    }
}
