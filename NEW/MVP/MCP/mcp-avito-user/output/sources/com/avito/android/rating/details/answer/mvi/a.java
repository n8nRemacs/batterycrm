package com.avito.android.rating.details.answer.mvi;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.rating.details.answer.RatingAddAnswerArguments;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextArguments;
import com.avito.android.util.InterfaceC35863o4;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vg0.InterfaceC49326a;

/* compiled from: RatingAddAnswerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lvg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.b<InterfaceC49326a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RatingAddAnswerArguments f246605a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f246606b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f246607c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f246608d;

    /* compiled from: RatingAddAnswerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lvg0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.answer.mvi.RatingAddAnswerBootstrap$produce$1", f = "RatingAddAnswerBootstrap.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.rating.details.answer.mvi.a$a, reason: collision with other inner class name */
    public static final class C7397a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC49326a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f246609q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f246610r;

        public C7397a(Continuation<? super C7397a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7397a c7397a = a.this.new C7397a(continuation);
            c7397a.f246610r = obj;
            return c7397a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC49326a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7397a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f246609q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f246610r;
                if (!a.this.f246608d) {
                    a aVar = a.this;
                    if (!aVar.f246606b) {
                        aVar.f246608d = true;
                        a aVar2 = a.this;
                        RatingAddAnswerArguments ratingAddAnswerArguments = aVar2.f246605a;
                        InterfaceC49326a.C12786a c12786a = new InterfaceC49326a.C12786a(new RatingAddAnswerTextArguments(ratingAddAnswerArguments.f246592b, ratingAddAnswerArguments.f246593c, aVar2.f246607c.a()));
                        this.f246609q = 1;
                        if (interfaceC43172j.emit(c12786a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k RatingAddAnswerArguments ratingAddAnswerArguments, boolean z12, @k InterfaceC35863o4 interfaceC35863o4) {
        this.f246605a = ratingAddAnswerArguments;
        this.f246606b = z12;
        this.f246607c = interfaceC35863o4;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<InterfaceC49326a> a() {
        return C43175k.G(new C7397a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
