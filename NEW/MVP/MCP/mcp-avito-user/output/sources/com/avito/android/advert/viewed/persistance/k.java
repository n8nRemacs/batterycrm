package com.avito.android.advert.viewed.persistance;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ViewedAdvertsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/k;", "Lcom/avito/android/advert/viewed/persistance/j;", "b", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.persistance.b f81050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final wu.b f81051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f81052c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f81053d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public volatile Set<String> f81054e;

    /* compiled from: ViewedAdvertsStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.viewed.persistance.ViewedAdvertsStorageImpl$1", f = "ViewedAdvertsStorage.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f81055q;

        /* compiled from: ViewedAdvertsStorage.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "idList", "Lkotlin/G0;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.viewed.persistance.k$a$a, reason: collision with other inner class name */
        public static final class C2404a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f81057b;

            /* compiled from: ViewedAdvertsStorage.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert.viewed.persistance.ViewedAdvertsStorageImpl$1$1", f = "ViewedAdvertsStorage.kt", i = {0, 0}, l = {43, 47}, m = "emit", n = {"this", "idList"}, s = {"L$0", "L$1"})
            /* renamed from: com.avito.android.advert.viewed.persistance.k$a$a$a, reason: collision with other inner class name */
            public static final class C2405a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f81058q;

                /* renamed from: r, reason: collision with root package name */
                public List f81059r;

                /* renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f81060s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ C2404a<T> f81061t;

                /* renamed from: u, reason: collision with root package name */
                public int f81062u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2405a(C2404a<? super T> c2404a, Continuation<? super C2405a> continuation) {
                    super(continuation);
                    this.f81061t = c2404a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f81060s = obj;
                    this.f81062u |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f81061t.emit(null, this);
                }
            }

            public C2404a(k kVar) {
                this.f81057b = kVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@Y61.k java.util.List<java.lang.String> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.advert.viewed.persistance.k.a.C2404a.C2405a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.advert.viewed.persistance.k$a$a$a r0 = (com.avito.android.advert.viewed.persistance.k.a.C2404a.C2405a) r0
                    int r1 = r0.f81062u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f81062u = r1
                    goto L18
                L13:
                    com.avito.android.advert.viewed.persistance.k$a$a$a r0 = new com.avito.android.advert.viewed.persistance.k$a$a$a
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f81060s
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f81062u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r8)
                    goto L8b
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.util.List r7 = r0.f81059r
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Object r2 = r0.f81058q
                    com.avito.android.advert.viewed.persistance.k$a$a r2 = (com.avito.android.advert.viewed.persistance.k.a.C2404a) r2
                    kotlin.C42729a0.b(r8)
                    goto L67
                L40:
                    kotlin.C42729a0.b(r8)
                    r8 = r7
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.Set r8 = kotlin.collections.C42745f0.P0(r8)
                    com.avito.android.advert.viewed.persistance.k r2 = r6.f81057b
                    r2.f81054e = r8
                    com.avito.android.advert.viewed.persistance.k r2 = r6.f81057b
                    boolean r2 = r2.f81053d
                    if (r2 == 0) goto L6d
                    com.avito.android.advert.viewed.persistance.k r2 = r6.f81057b
                    r0.f81058q = r6
                    r5 = r7
                    java.util.List r5 = (java.util.List) r5
                    r0.f81059r = r5
                    r0.f81062u = r4
                    java.lang.Object r8 = com.avito.android.advert.viewed.persistance.k.d(r2, r8, r0)
                    if (r8 != r1) goto L66
                    return r1
                L66:
                    r2 = r6
                L67:
                    com.avito.android.advert.viewed.persistance.k r8 = r2.f81057b
                    r4 = 0
                    r8.f81053d = r4
                    goto L6e
                L6d:
                    r2 = r6
                L6e:
                    int r7 = r7.size()
                    r8 = 1000(0x3e8, float:1.401E-42)
                    if (r7 >= r8) goto L79
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                L79:
                    com.avito.android.advert.viewed.persistance.k r7 = r2.f81057b
                    com.avito.android.advert.viewed.persistance.b r7 = r7.f81050a
                    r8 = 0
                    r0.f81058q = r8
                    r0.f81059r = r8
                    r0.f81062u = r3
                    java.lang.Object r7 = r7.a(r0)
                    if (r7 != r1) goto L8b
                    return r1
                L8b:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.viewed.persistance.k.a.C2404a.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return k.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f81055q;
            if (i12 == 0) {
                C42729a0.b(obj);
                k kVar = k.this;
                InterfaceC43160i<List<String>> interfaceC43160iB = kVar.f81050a.b();
                C2404a c2404a = new C2404a(kVar);
                this.f81055q = 1;
                if (interfaceC43160iB.collect(c2404a, this) == coroutine_suspended) {
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

    /* compiled from: ViewedAdvertsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/viewed/persistance/k$b;", "", "<init>", "()V", "", "DELETE_VIEWED_ADVERTS_ON_OVERFLOW", "I", "MAX_VIEWED_ADVERTS", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    @Inject
    public k(@Y61.k com.avito.android.advert.viewed.persistance.b bVar, @Y61.k wu.b bVar2, @Y61.k R0 r02, @Y61.k com.avito.android.server_time.f fVar) {
        this.f81050a = bVar;
        this.f81051b = bVar2;
        this.f81052c = fVar;
        C43238h c43238hA = U.a(r02.a().plus(t1.b()));
        this.f81053d = true;
        this.f81054e = B0.f406639b;
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.advert.viewed.persistance.k r5, java.util.Set r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.advert.viewed.persistance.n
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.advert.viewed.persistance.n r0 = (com.avito.android.advert.viewed.persistance.n) r0
            int r1 = r0.f81067t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f81067t = r1
            goto L1b
        L16:
            com.avito.android.advert.viewed.persistance.n r0 = new com.avito.android.advert.viewed.persistance.n
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f81065r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f81067t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.advert.viewed.persistance.k r5 = r0.f81064q
            kotlin.C42729a0.b(r7)
            goto L96
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r7)
            wu.b r7 = r5.f81051b     // Catch: java.lang.Throwable -> L9e
            java.util.ArrayList r7 = r7.o()     // Catch: java.lang.Throwable -> L9e
            kotlin.collections.s0 r2 = new kotlin.collections.s0     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L9e
            com.avito.android.advert.viewed.persistance.m r7 = new com.avito.android.advert.viewed.persistance.m     // Catch: java.lang.Throwable -> L9e
            r7.<init>()     // Catch: java.lang.Throwable -> L9e
            kotlin.sequences.f0 r4 = new kotlin.sequences.f0     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r2, r7)     // Catch: java.lang.Throwable -> L9e
            com.avito.android.advert.viewed.persistance.o r7 = new com.avito.android.advert.viewed.persistance.o     // Catch: java.lang.Throwable -> L9e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L9e
            kotlin.sequences.h r7 = kotlin.sequences.C43033p.i(r4, r7)     // Catch: java.lang.Throwable -> L9e
            com.avito.android.advert.viewed.persistance.p r2 = com.avito.android.advert.viewed.persistance.p.f81069l     // Catch: java.lang.Throwable -> L9e
            kotlin.sequences.o0 r4 = new kotlin.sequences.o0     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r7, r2)     // Catch: java.lang.Throwable -> L9e
            java.util.List r7 = kotlin.sequences.C43033p.D(r4)     // Catch: java.lang.Throwable -> L9e
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L6b
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto La0
        L6b:
            int r6 = r6.size()
            int r6 = 1000 - r6
            r2 = 100
            int r6 = java.lang.Math.max(r6, r2)
            int r2 = r7.size()
            if (r2 <= r6) goto L89
            r2 = r7
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r7 = r7.size()
            int r7 = r7 - r6
            java.util.List r7 = kotlin.collections.C42745f0.w(r2, r7)
        L89:
            r0.f81064q = r5
            r0.f81067t = r3
            com.avito.android.advert.viewed.persistance.b r6 = r5.f81050a
            java.lang.Object r6 = r6.c(r7, r0)
            if (r6 != r1) goto L96
            goto La0
        L96:
            wu.b r5 = r5.f81051b
            r5.r()
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto La0
        L9e:
            kotlin.G0 r1 = kotlin.G0.f406611a
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.viewed.persistance.k.d(com.avito.android.advert.viewed.persistance.k, java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.advert.viewed.persistance.j
    public final boolean a(@Y61.k String str) {
        return this.f81054e.contains(str);
    }

    @Override // com.avito.android.advert.viewed.persistance.j
    @Y61.k
    public final Set b(@Y61.k ArrayList arrayList) {
        return C43033p.F(C43033p.i(new C42770s0(this.f81054e), new l(arrayList)));
    }

    @Override // com.avito.android.advert.viewed.persistance.j
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.k Continuation<? super G0> continuation) {
        Object objE = this.f81050a.e(new com.avito.android.advert.viewed.persistance.a(str, this.f81052c.now()), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }
}
