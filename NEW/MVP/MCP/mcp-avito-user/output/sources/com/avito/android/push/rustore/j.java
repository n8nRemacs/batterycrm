package com.avito.android.push.rustore;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* compiled from: RustorePushTokenProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.push.rustore.RustorePushTokenProviderImpl$getPushToken$1", f = "RustorePushTokenProvider.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class j extends SuspendLambda implements p<I0<? super String>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f246100q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f246101r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f246102s;

    /* compiled from: RustorePushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f246103l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Pa1.c.f13143a.getClass();
            ru.rustore.sdk.core.tasks.f fVarA = Pa1.c.a();
            fVarA.getClass();
            fVarA.e(new TaskCancellationException());
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f246102s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f246102s, continuation);
        jVar.f246101r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super String> i02, Continuation<? super G0> continuation) {
        return ((j) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f246100q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f246101r;
            g gVar = this.f246102s;
            i iVar = new i(gVar, i02);
            i iVar2 = new i(gVar, i02);
            Pa1.c.f13143a.getClass();
            ru.rustore.sdk.core.tasks.f fVarA = Pa1.c.a();
            fVarA.b(iVar, null, null);
            fVarA.b(null, iVar2, null);
            a aVar = a.f246103l;
            this.f246100q = 1;
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
