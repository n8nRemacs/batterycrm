package com.avito.android.messenger.conversation.mvi.multi_message;

import com.avito.android.messenger.conversation.mvi.multi_message.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: MultiMessagePresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.multi_message.MultiMessagePresenterImpl$CloseBannerMutator$invoke$1$1", f = "MultiMessagePresenter.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f193748q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f193749r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m.b.C5728b f193750s;

    /* compiled from: MultiMessagePresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.multi_message.MultiMessagePresenterImpl$CloseBannerMutator$invoke$1$1$1", f = "MultiMessagePresenter.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f193751q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f193752r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n f193753s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m.b.C5728b f193754t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, m.b.C5728b c5728b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f193753s = nVar;
            this.f193754t = c5728b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f193753s, this.f193754t, continuation);
            aVar.f193752r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f193751q;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    n nVar = this.f193753s;
                    m.b.C5728b c5728b = this.f193754t;
                    int i13 = Z.f406624c;
                    com.avito.android.multi_message_send.domain.n nVar2 = nVar.f193722X;
                    long j12 = c5728b.f193718b.f193711a;
                    this.f193751q = 1;
                    if (nVar2.a(j12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                G0 g02 = G0.f406611a;
                int i14 = Z.f406624c;
            } catch (Throwable unused) {
                int i15 = Z.f406624c;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, m.b.C5728b c5728b, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f193749r = nVar;
        this.f193750s = c5728b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f193749r, this.f193750s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f193748q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43135f1 c43135f1 = C43135f1.f411090b;
            a aVar = new a(this.f193749r, this.f193750s, null);
            this.f193748q = 1;
            if (C43259k.g(c43135f1, aVar, this) == coroutine_suspended) {
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
