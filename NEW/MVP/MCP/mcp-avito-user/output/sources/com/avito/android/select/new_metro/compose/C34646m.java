package com.avito.android.select.new_metro.compose;

import androidx.compose.runtime.InterfaceC22196w1;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: MetroSelectedStations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.new_metro.compose.MetroSelectedStationsKt$MetroSelectedStations$1", f = "MetroSelectedStations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.select.new_metro.compose.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34646m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MetroSelectedStationsItem f266112q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f266113r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f266114s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34646m(MetroSelectedStationsItem metroSelectedStationsItem, Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar, InterfaceC22196w1 interfaceC22196w1, Continuation<? super C34646m> continuation) {
        super(2, continuation);
        this.f266112q = metroSelectedStationsItem;
        this.f266113r = pVar;
        this.f266114s = interfaceC22196w1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34646m(this.f266112q, this.f266113r, this.f266114s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C34646m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f266114s.e() == 0) {
            MetroSelectedStationsItem metroSelectedStationsItem = this.f266112q;
            if (metroSelectedStationsItem.f266195d) {
                this.f266113r.invoke(metroSelectedStationsItem, Boxing.boxBoolean(false));
            }
        }
        return G0.f406611a;
    }
}
