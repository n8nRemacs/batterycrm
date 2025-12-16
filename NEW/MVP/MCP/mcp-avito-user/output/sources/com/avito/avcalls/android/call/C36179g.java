package com.avito.avcalls.android.call;

import com.avito.avcalls.android.a;
import com.avito.avcalls.android.call.C36177e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CallManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallManager$handleStatsReport$1", f = "CallManager.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36179g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36177e f331515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f331516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ xQ0.b f331517t;

    /* compiled from: CallManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/avcalls/android/a$g;", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/android/a$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.android.call.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<a.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f331518l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ xQ0.b f331519m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, xQ0.b bVar) {
            super(1);
            this.f331518l = str;
            this.f331519m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(a.g gVar) {
            gVar.a(this.f331518l, this.f331519m);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36179g(C36177e c36177e, String str, xQ0.b bVar, Continuation<? super C36179g> continuation) {
        super(2, continuation);
        this.f331515r = c36177e;
        this.f331516s = str;
        this.f331517t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36179g(this.f331515r, this.f331516s, this.f331517t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36179g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331514q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f331516s, this.f331517t);
            this.f331514q = 1;
            C36177e.Companion companion = C36177e.INSTANCE;
            if (this.f331515r.i(aVar, this) == coroutine_suspended) {
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
