package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.InterfaceC22196w1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactScreenKt$EqualHeightCardsRow$2$1", f = "AutoSelectNoClickContactScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f79482q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f79483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f79484s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC22196w1 interfaceC22196w1, InterfaceC22196w1 interfaceC22196w12, InterfaceC22196w1 interfaceC22196w13, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f79482q = interfaceC22196w1;
        this.f79483r = interfaceC22196w12;
        this.f79484s = interfaceC22196w13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new p(this.f79482q, this.f79483r, this.f79484s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC22196w1 interfaceC22196w1 = this.f79482q;
        if (interfaceC22196w1.e() > 0) {
            InterfaceC22196w1 interfaceC22196w12 = this.f79483r;
            if (interfaceC22196w12.e() > 0) {
                this.f79484s.L3(Math.max(interfaceC22196w1.e(), interfaceC22196w12.e()));
            }
        }
        return G0.f406611a;
    }
}
