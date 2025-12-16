package com.avito.android.multi_message_send.composable;

import G20.b;
import G20.c;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.multi_message_send.model.MultiSendAnchor;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MultiSendContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_multi-message-send_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.multi_message_send.composable.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32878z {

    /* compiled from: MultiSendContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiSendContentKt$MultiSendContent$1", f = "MultiSendContent.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.multi_message_send.composable.z$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206590q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<G20.c> f206591r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ G20.f f206592s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f206593t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w0 f206594u;

        /* compiled from: MultiSendContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG20/c;", "event", "Lkotlin/G0;", "emit", "(LG20/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.multi_message_send.composable.z$a$a, reason: collision with other inner class name */
        public static final class C6150a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G20.f f206595b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f206596c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ w0 f206597d;

            public C6150a(G20.f fVar, kotlinx.coroutines.T t12, w0 w0Var) {
                this.f206595b = fVar;
                this.f206596c = t12;
                this.f206597d = w0Var;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                G20.c cVar = (G20.c) obj;
                if (cVar instanceof c.C0330c) {
                    G20.f fVar = this.f206595b;
                    if (fVar.f6259b != null) {
                        C43259k.d(this.f206596c, null, null, new C32877y(this.f206597d, fVar, cVar, null), 3);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends G20.c> interfaceC43160i, G20.f fVar, kotlinx.coroutines.T t12, w0 w0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206591r = interfaceC43160i;
            this.f206592s = fVar;
            this.f206593t = t12;
            this.f206594u = w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f206591r, this.f206592s, this.f206593t, this.f206594u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206590q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C6150a c6150a = new C6150a(this.f206592s, this.f206593t, this.f206594u);
                this.f206590q = 1;
                if (this.f206591r.collect(c6150a, this) == coroutine_suspended) {
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

    /* compiled from: MultiSendContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiSendContentKt$MultiSendContent$2", f = "MultiSendContent.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.multi_message_send.composable.z$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206598q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f206599r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ G20.f f206600s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206601t;

        /* compiled from: MultiSendContent.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "", "", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.multi_message_send.composable.z$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.Q<? extends Integer, ? extends Boolean>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f206602l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var) {
                super(0);
                this.f206602l = w0Var;
            }

            @Override // Y41.a
            public final kotlin.Q<? extends Integer, ? extends Boolean> invoke() {
                w0 w0Var = this.f206602l;
                return new kotlin.Q<>(Integer.valueOf(w0Var.h()), Boolean.valueOf(((androidx.compose.foundation.lazy.K) C42745f0.Q(w0Var.j().h())).getF29645a() == w0Var.j().getF28948n() - 1));
            }
        }

        /* compiled from: MultiSendContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiSendContentKt$MultiSendContent$2$2", f = "MultiSendContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.multi_message_send.composable.z$b$b, reason: collision with other inner class name */
        public static final class C6151b extends SuspendLambda implements Y41.p<kotlin.Q<? extends Integer, ? extends Boolean>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f206603q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ G20.f f206604r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.l<G20.b, G0> f206605s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6151b(G20.f fVar, Y41.l<? super G20.b, G0> lVar, Continuation<? super C6151b> continuation) {
                super(2, continuation);
                this.f206604r = fVar;
                this.f206605s = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C6151b c6151b = new C6151b(this.f206604r, this.f206605s, continuation);
                c6151b.f206603q = obj;
                return c6151b;
            }

            @Override // Y41.p
            public final Object invoke(kotlin.Q<? extends Integer, ? extends Boolean> q12, Continuation<? super G0> continuation) {
                return ((C6151b) create(q12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlin.Q q12 = (kotlin.Q) this.f206603q;
                int iIntValue = ((Number) q12.f406619b).intValue();
                boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                List<F20.e> list = this.f206604r.f6259b;
                if (list != null) {
                    Y41.l<G20.b, G0> lVar = this.f206605s;
                    if (zBooleanValue) {
                        String str = ((F20.e) C42745f0.Q(list)).f4508b;
                        if (str != null) {
                            lVar.invoke(new b.g(str));
                        }
                    } else {
                        String str2 = list.get(iIntValue + 1).f4508b;
                        if (str2 != null) {
                            lVar.invoke(new b.g(str2));
                        }
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G20.f fVar, Y41.l lVar, w0 w0Var, Continuation continuation) {
            super(2, continuation);
            this.f206599r = w0Var;
            this.f206600s = fVar;
            this.f206601t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f206600s, this.f206601t, this.f206599r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206598q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iN = C43175k.n(C22126m3.n(new a(this.f206599r)), 100L);
                C6151b c6151b = new C6151b(this.f206600s, this.f206601t, null);
                this.f206598q = 1;
                if (C43175k.j(interfaceC43160iN, c6151b, this) == coroutine_suspended) {
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

    /* compiled from: MultiSendContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.composable.MultiSendContentKt$MultiSendContent$3", f = "MultiSendContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.multi_message_send.composable.z$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ G20.f f206606q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f206607r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206608s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G20.f fVar, Y41.l lVar, w0 w0Var, Continuation continuation) {
            super(2, continuation);
            this.f206606q = fVar;
            this.f206607r = w0Var;
            this.f206608s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            w0 w0Var = this.f206607r;
            return new c(this.f206606q, this.f206608s, w0Var, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            List<MultiSendAnchor> list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            G20.f fVar = this.f206606q;
            if (fVar.f6262e == null && (list = fVar.f6260c) != null && !list.isEmpty()) {
                List<F20.e> list2 = fVar.f6259b;
                boolean z12 = false;
                if (list2 != null && this.f206607r.j().h().size() == list2.size()) {
                    z12 = true;
                }
                this.f206608s.invoke(new b.f(!z12));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MultiSendContent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/akita/compose/component/chips/b;", "chips", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.multi_message_send.composable.z$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<Integer, InterfaceC27333b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206609l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super G20.b, G0> lVar) {
            super(2);
            this.f206609l = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
            num.intValue();
            this.f206609l.invoke(new b.c(((MultiSendAnchor) interfaceC27333b).f206737b));
            return G0.f406611a;
        }
    }

    /* compiled from: MultiSendContent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.multi_message_send.composable.z$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ G20.f f206610l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206611m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(G20.f fVar, Y41.l<? super G20.b, G0> lVar) {
            super(1);
            this.f206610l = fVar;
            this.f206611m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            G20.f fVar = this.f206610l;
            List<F20.e> list = fVar.f6259b;
            if (list != null) {
                A a12 = A.f206468l;
                m0Var2.a(list.size(), a12 != null ? new B(a12, list) : null, new C(list), new C22096n(-1091073711, new D(list, this.f206611m, fVar), true));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MultiSendContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.multi_message_send.composable.z$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ G20.f f206612l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<G20.b, G0> f206613m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<G20.c> f206614n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f206615o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f206616p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f206617q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f206618r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(G20.f fVar, Y41.l<? super G20.b, G0> lVar, InterfaceC43160i<? extends G20.c> interfaceC43160i, kotlinx.coroutines.T t12, androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f206612l = fVar;
            this.f206613m = lVar;
            this.f206614n = interfaceC43160i;
            this.f206615o = t12;
            this.f206616p = vVar;
            this.f206617q = i12;
            this.f206618r = i13;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f206617q | 1);
            G20.f fVar = this.f206612l;
            InterfaceC43160i<G20.c> interfaceC43160i = this.f206614n;
            C32878z.a(fVar, this.f206613m, interfaceC43160i, this.f206615o, this.f206616p, a12, iA2, this.f206618r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k G20.f r22, @Y61.k Y41.l<? super G20.b, kotlin.G0> r23, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends G20.c> r24, @Y61.k kotlinx.coroutines.T r25, @Y61.l androidx.compose.ui.v r26, @Y61.l androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multi_message_send.composable.C32878z.a(G20.f, Y41.l, kotlinx.coroutines.flow.i, kotlinx.coroutines.T, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
