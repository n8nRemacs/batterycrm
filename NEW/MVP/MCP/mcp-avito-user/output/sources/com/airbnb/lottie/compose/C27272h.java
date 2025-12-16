package com.airbnb.lottie.compose;

import androidx.compose.runtime.C22082i3;
import com.airbnb.lottie.C27291k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.airbnb.lottie.compose.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27272h extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C27271g f59467q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C27291k f59468r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f59469s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f59470t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27272h(C27271g c27271g, C27291k c27291k, float f12, boolean z12, Continuation continuation) {
        super(1, continuation);
        this.f59467q = c27271g;
        this.f59468r = c27291k;
        this.f59469s = f12;
        this.f59470t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new C27272h(this.f59467q, this.f59468r, this.f59469s, this.f59470t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((C27272h) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C27271g c27271g = this.f59467q;
        ((C22082i3) c27271g.f59457j).setValue(this.f59468r);
        c27271g.p(this.f59469s);
        c27271g.j(1);
        C27271g.d(c27271g, false);
        if (this.f59470t) {
            ((C22082i3) c27271g.f59460m).setValue(Long.MIN_VALUE);
        }
        return G0.f406611a;
    }
}
