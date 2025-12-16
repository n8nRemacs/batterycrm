package com.avito.avcalls.android.logger;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.avcalls.android.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: LogMessageSender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/logger/f;", "Lcom/avito/avcalls/android/logger/c;", "Lkotlinx/coroutines/T;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements c, T {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.f f331746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC43129d1 f331747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C43238h f331748d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f331749e = f2.b(0, 0, null, 7);

    /* compiled from: LogMessageSender.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.logger.LogMessageSenderImpl$send$1", f = "LogMessageSender.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f331750q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.avcalls.android.logger.a f331752s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.avcalls.android.logger.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f331752s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new a(this.f331752s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f331750q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = f.this.f331749e;
                this.f331750q = 1;
                if (e2Var.emit(this.f331752s, this) == coroutine_suspended) {
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

    public f(@k a.f fVar, @k AbstractC43129d1 abstractC43129d1, @k C43238h c43238h) {
        this.f331746b = fVar;
        this.f331747c = abstractC43129d1;
        this.f331748d = c43238h;
        C43259k.d(this, null, null, new d(this, null), 3);
    }

    public final void b(@k com.avito.avcalls.android.logger.a aVar) {
        C43259k.d(this, null, null, new a(aVar, null), 3);
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF400145h() {
        return this.f331748d.f411905b;
    }
}
