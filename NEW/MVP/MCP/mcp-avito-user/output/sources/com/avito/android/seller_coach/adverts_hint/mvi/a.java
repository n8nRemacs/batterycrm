package com.avito.android.seller_coach.adverts_hint.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdviceHeader;
import com.avito.android.remote.model.Advices;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import com.avito.android.seller_coach.adverts_hint.mvi.entity.ShortAdvicesState;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import uq0.C49099a;
import vq0.C49370c;
import vq0.InterfaceC49368a;
import wq0.C49672a;
import yq0.InterfaceC50281a;
import yq0.InterfaceC50283c;

/* compiled from: ShortAdvicesActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lyq0/a;", "Lyq0/c;", "Lcom/avito/android/seller_coach/adverts_hint/mvi/entity/ShortAdvicesState;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50281a, InterfaceC50283c, ShortAdvicesState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49370c f267237a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f267238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f267239c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f267240d;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_coach.adverts_hint.mvi.a$a, reason: collision with other inner class name */
    public static final class C7971a implements InterfaceC43160i<InterfaceC50283c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f267241b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.seller_coach.adverts_hint.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C7972a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f267242b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.seller_coach.adverts_hint.mvi.ShortAdvicesActor$loadAdvices$$inlined$map$1$2", f = "ShortAdvicesActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.seller_coach.adverts_hint.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final class C7973a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f267243q;

                /* renamed from: r, reason: collision with root package name */
                public int f267244r;

                public C7973a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f267243q = obj;
                    this.f267244r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7972a.this.emit(null, this);
                }
            }

            public C7972a(InterfaceC43172j interfaceC43172j) {
                this.f267242b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.seller_coach.adverts_hint.mvi.a.C7971a.C7972a.C7973a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.seller_coach.adverts_hint.mvi.a$a$a$a r0 = (com.avito.android.seller_coach.adverts_hint.mvi.a.C7971a.C7972a.C7973a) r0
                    int r1 = r0.f267244r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f267244r = r1
                    goto L18
                L13:
                    com.avito.android.seller_coach.adverts_hint.mvi.a$a$a$a r0 = new com.avito.android.seller_coach.adverts_hint.mvi.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f267243q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f267244r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.remote.model.Advices r5 = (com.avito.android.remote.model.Advices) r5
                    yq0.c$b r6 = new yq0.c$b
                    r6.<init>(r5)
                    r0.f267244r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f267242b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.seller_coach.adverts_hint.mvi.a.C7971a.C7972a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C7971a(InterfaceC43160i interfaceC43160i) {
            this.f267241b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC50283c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f267241b.collect(new C7972a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ShortAdvicesActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lyq0/c;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_coach.adverts_hint.mvi.ShortAdvicesActor$loadAdvices$2", f = "ShortAdvicesActor.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC50283c>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267246q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f267247r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f267248s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC50283c> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f267247r = interfaceC43172j;
            bVar.f267248s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267246q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f267247r;
                InterfaceC50283c.a aVar = new InterfaceC50283c.a(this.f267248s);
                this.f267247r = null;
                this.f267246q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: ShortAdvicesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lyq0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.seller_coach.adverts_hint.mvi.ShortAdvicesActor$loadAdvices$3", f = "ShortAdvicesActor.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC50283c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f267249q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f267250r;

        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(2, continuation);
            cVar.f267250r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC50283c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f267249q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f267250r;
                InterfaceC50283c.C12921c c12921c = InterfaceC50283c.C12921c.f443515a;
                this.f267249q = 1;
                if (interfaceC43172j.emit(c12921c, this) == coroutine_suspended) {
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

    @Inject
    public a(@Y61.k C49370c c49370c, @Y61.k E e12, @Y61.k R0 r02, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f267237a = c49370c;
        this.f267238b = e12;
        this.f267239c = r02;
        this.f267240d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new f(aVar, this, null), C43175k.N(new com.avito.android.seller_coach.adverts_hint.mvi.b(c43197r1), new com.avito.android.seller_coach.adverts_hint.mvi.c(c43197r1), new d(c43197r1), new e(c43197r1))), C43175k.Y(C43175k.N(new g(c43197r1), new h(c43197r1), new j(C43175k.r(y.a(this.f267238b.g())))), new i(aVar, this, null)));
    }

    public final InterfaceC43160i<InterfaceC50283c> c() {
        if (!this.f267238b.b()) {
            return new C43210w(InterfaceC50283c.h.f443520a);
        }
        return new C43137a0(new c(2, null), new C43152f0(new C7971a(C43175k.I(this.f267239c.a(), y.a(((InterfaceC49368a) this.f267237a.get()).a().F()))), new b(3, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<InterfaceC50283c> b(@Y61.k InterfaceC50281a interfaceC50281a, @Y61.k ShortAdvicesState shortAdvicesState) {
        C43210w c43210w;
        AdviceHeader header;
        DeepLink deeplink;
        if (interfaceC50281a instanceof InterfaceC50281a.f) {
            return c();
        }
        if (interfaceC50281a instanceof InterfaceC50281a.e) {
            Advices advices = shortAdvicesState.f267272b;
            if (advices != null && (header = advices.getHeader()) != null && (deeplink = header.getDeeplink()) != null) {
                return new C43210w(new InterfaceC50283c.f(deeplink));
            }
            c43210w = new C43210w(InterfaceC50283c.e.f443517a);
        } else {
            if (interfaceC50281a instanceof InterfaceC50281a.c) {
                return new C43210w(new InterfaceC50283c.d(((InterfaceC50281a.c) interfaceC50281a).f443507a));
            }
            if (interfaceC50281a instanceof InterfaceC50281a.b) {
                return c();
            }
            boolean z12 = interfaceC50281a instanceof InterfaceC50281a.d;
            C49099a c49099a = shortAdvicesState.f267271a;
            if (!z12) {
                if (!(interfaceC50281a instanceof InterfaceC50281a.C12919a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((InterfaceC50281a.C12919a) interfaceC50281a).f443505a.f267209b;
                c49099a.getClass();
                return new C43210w(new InterfaceC50283c.g(str));
            }
            UserAdvertsHintItem userAdvertsHintItem = ((InterfaceC50281a.d) interfaceC50281a).f443508a;
            String str2 = userAdvertsHintItem.f267209b;
            List list = userAdvertsHintItem.f267216i;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            c49099a.getClass();
            this.f267240d.c(new C49672a(userAdvertsHintItem.f267210c, str2, list, "from_widget"));
            c43210w = new C43210w(InterfaceC50283c.e.f443517a);
        }
        return c43210w;
    }
}
