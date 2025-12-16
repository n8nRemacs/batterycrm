package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.util.V2;
import com.avito.beduin.v2.engine.C36272i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CommercialBDUIBannerObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advertising.loaders.beduin.CommercialBDUIBannerObserveInteractionHandler$observeData$1", f = "CommercialBDUIBannerObserveInteractionHandler.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advertising.loaders.beduin.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28358l extends SuspendLambda implements Y41.p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f88145q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88146r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f88147s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28357k f88148t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f88149u;

    /* compiled from: CommercialBDUIBannerObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.loaders.beduin.l$a */
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N0 f88150l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N0 n02) {
            super(0);
            this.f88150l = n02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((V0) this.f88150l).c(null);
            return G0.f406611a;
        }
    }

    /* compiled from: CommercialBDUIBannerObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advertising.loaders.beduin.CommercialBDUIBannerObserveInteractionHandler$observeData$1$job$1", f = "CommercialBDUIBannerObserveInteractionHandler.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advertising.loaders.beduin.l$b */
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f88151q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f88152r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C28357k f88153s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f88154t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C36272i f88155u;

        /* compiled from: CommercialBDUIBannerObserveInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/H$c;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/advertising/loaders/beduin/H$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advertising.loaders.beduin.l$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C36272i f88156b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C28357k f88157c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f88158d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(C36272i c36272i, C28357k c28357k, I0<? super com.avito.beduin.v2.engine.field.d> i02) {
                this.f88156b = c36272i;
                this.f88157c = c28357k;
                this.f88158d = i02;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                H.c cVar = (H.c) obj;
                boolean z12 = cVar instanceof H.c.C2608c;
                I0<com.avito.beduin.v2.engine.field.d> i02 = this.f88158d;
                C36272i c36272i = this.f88156b;
                if (z12) {
                    try {
                        i02.w(C28355i.b(((H.c.C2608c) cVar).f88086a, c36272i, this.f88157c.f88143f));
                    } catch (Throwable unused) {
                        i02.w(C28355i.a(c36272i));
                    }
                } else if (cVar instanceof H.c.b) {
                    i02.w(C28355i.a(c36272i));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m mVar, C28357k c28357k, I0<? super com.avito.beduin.v2.engine.field.d> i02, C36272i c36272i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f88152r = mVar;
            this.f88153s = c28357k;
            this.f88154t = i02;
            this.f88155u = c36272i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f88152r, this.f88153s, this.f88154t, this.f88155u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f88151q;
            I0<com.avito.beduin.v2.engine.field.d> i02 = this.f88154t;
            if (i12 == 0) {
                C42729a0.b(obj);
                H h12 = (H) ((r) this.f88152r.f88159c).invoke();
                C28357k c28357k = this.f88153s;
                InterfaceC43160i<H.c> interfaceC43160iA = h12.a(c28357k.f88142e);
                a aVar = new a(this.f88155u, c28357k, i02);
                this.f88151q = 1;
                if (interfaceC43160iA.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            i02.h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28358l(m mVar, C28357k c28357k, C36272i c36272i, Continuation<? super C28358l> continuation) {
        super(2, continuation);
        this.f88147s = mVar;
        this.f88148t = c28357k;
        this.f88149u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C28358l c28358l = new C28358l(this.f88147s, this.f88148t, this.f88149u, continuation);
        c28358l.f88146r = obj;
        return c28358l;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super com.avito.beduin.v2.engine.field.d> i02, Continuation<? super G0> continuation) {
        return ((C28358l) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f88145q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f88146r;
            a aVar = new a(C43259k.d(i02, null, null, new b(this.f88147s, this.f88148t, i02, this.f88149u, null), 3));
            this.f88145q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        V2.f318762a.b(AdvertStatus.CLOSED, null);
        return G0.f406611a;
    }
}
