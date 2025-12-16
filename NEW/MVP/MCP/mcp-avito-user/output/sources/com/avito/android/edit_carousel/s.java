package com.avito.android.edit_carousel;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: EditCarouselView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_carousel.EditCarouselViewImpl$inputFlow$1", f = "EditCarouselView.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class s extends SuspendLambda implements Y41.p<I0<? super String>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146536q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f146537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f146538s;

    /* compiled from: EditCarouselView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f146539l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.input.s f146540m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, com.avito.android.lib.design.input.s sVar) {
            super(0);
            this.f146539l = vVar;
            this.f146540m = sVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f146539l.f146551h.h(this.f146540m);
            return G0.f406611a;
        }
    }

    /* compiled from: EditCarouselView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<String> f146541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super String> i02) {
            super(1);
            this.f146541l = i02;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            D.c(this.f146541l, str);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f146538s = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        s sVar = new s(this.f146538s, continuation);
        sVar.f146537r = obj;
        return sVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super String> i02, Continuation<? super G0> continuation) {
        return ((s) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f146536q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f146537r;
            v vVar = this.f146538s;
            com.avito.android.lib.design.input.s sVar = new com.avito.android.lib.design.input.s(vVar.f146551h.m53getText(), new b(i02));
            vVar.f146551h.b(sVar);
            a aVar = new a(vVar, sVar);
            this.f146536q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
