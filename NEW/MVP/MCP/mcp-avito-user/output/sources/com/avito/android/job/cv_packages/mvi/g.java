package com.avito.android.job.cv_packages.mvi;

import cQ.InterfaceC27084a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActorSubscription$subscribeToDeepLinkHandlerResult$$inlined$transform$1", f = "CvPackageActorSubscription.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC27084a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f174465q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174466r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f174467s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f174468t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC27084a> f174469b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f174470c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActorSubscription$subscribeToDeepLinkHandlerResult$$inlined$transform$1$1", f = "CvPackageActorSubscription.kt", i = {}, l = {220}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.job.cv_packages.mvi.g$a$a, reason: collision with other inner class name */
        public static final class C5147a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f174471q;

            /* renamed from: r, reason: collision with root package name */
            public int f174472r;

            public C5147a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f174471q = obj;
                this.f174472r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, h hVar) {
            this.f174470c = hVar;
            this.f174469b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.job.cv_packages.mvi.g.a.C5147a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.job.cv_packages.mvi.g$a$a r0 = (com.avito.android.job.cv_packages.mvi.g.a.C5147a) r0
                int r1 = r0.f174472r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f174472r = r1
                goto L18
            L13:
                com.avito.android.job.cv_packages.mvi.g$a$a r0 = new com.avito.android.job.cv_packages.mvi.g$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f174471q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f174472r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L65
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kv.a r5 = (kv.C43501a) r5
                Ju.c r6 = r5.f413261b
                boolean r6 = r6 instanceof com.avito.android.contact_access.links.ContactsPackagesBuyLink.b.C3747b
                if (r6 == 0) goto L65
                cQ.c$a r6 = new cQ.c$a
                com.avito.android.deeplink_handler.handler.bundle.a r5 = r5.f413260a
                com.avito.android.job.cv_packages.mvi.h r2 = r4.f174470c
                r2.getClass()
                com.avito.android.deep_linking.links.DeepLink r5 = r5.f134520a
                boolean r2 = r5 instanceof com.avito.android.contact_access.links.ContactsPackagesBuyLink
                if (r2 == 0) goto L56
                com.avito.android.contact_access.links.ContactsPackagesBuyLink r5 = (com.avito.android.contact_access.links.ContactsPackagesBuyLink) r5
                java.lang.String r5 = r5.f126159c
                java.lang.String r2 = "13"
                boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
                goto L57
            L56:
                r5 = 0
            L57:
                r6.<init>(r5)
                r0.f174472r = r3
                kotlinx.coroutines.flow.j<cQ.a> r5 = r4.f174469b
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L65
                return r1
            L65:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_packages.mvi.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC43160i interfaceC43160i, Continuation continuation, h hVar) {
        super(2, continuation);
        this.f174467s = interfaceC43160i;
        this.f174468t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f174467s, continuation, this.f174468t);
        gVar.f174466r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC27084a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f174465q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f174466r, this.f174468t);
            this.f174465q = 1;
            if (((AbstractC43168f) this.f174467s).collect(aVar, this) == coroutine_suspended) {
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
