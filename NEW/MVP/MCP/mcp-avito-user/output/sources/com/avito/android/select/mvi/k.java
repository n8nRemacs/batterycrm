package com.avito.android.select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.select.SelectSignificantState;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: SelectBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements com.avito.android.arch.mvi.b<SelectInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Arguments f265612a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.g f265613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f265614c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SelectSignificantState f265615d;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<SelectInternalAction.VariantsLoaded> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f265616b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.select.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C7935a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f265617b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.select.mvi.SelectBootstrap$produce$$inlined$map$1$2", f = "SelectBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.select.mvi.k$a$a$a, reason: collision with other inner class name */
            public static final class C7936a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f265618q;

                /* renamed from: r, reason: collision with root package name */
                public int f265619r;

                public C7936a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f265618q = obj;
                    this.f265619r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7935a.this.emit(null, this);
                }
            }

            public C7935a(InterfaceC43172j interfaceC43172j) {
                this.f265617b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.select.mvi.k.a.C7935a.C7936a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.select.mvi.k$a$a$a r0 = (com.avito.android.select.mvi.k.a.C7935a.C7936a) r0
                    int r1 = r0.f265619r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f265619r = r1
                    goto L18
                L13:
                    com.avito.android.select.mvi.k$a$a$a r0 = new com.avito.android.select.mvi.k$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f265618q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f265619r
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
                    Zp0.e r5 = (Zp0.e) r5
                    com.avito.android.select.mvi.entity.SelectInternalAction$VariantsLoaded r6 = new com.avito.android.select.mvi.entity.SelectInternalAction$VariantsLoaded
                    r6.<init>(r5)
                    r0.f265619r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f265617b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.mvi.k.a.C7935a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f265616b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super SelectInternalAction.VariantsLoaded> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f265616b.collect(new C7935a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SelectBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.mvi.SelectBootstrap$produce$2", f = "SelectBootstrap.kt", i = {0}, l = {38, 39}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f265621q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f265622r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = k.this.new b(continuation);
            bVar.f265622r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f265621q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f265622r;
                SelectSignificantState selectSignificantState = k.this.f265615d;
                String str = selectSignificantState != null ? selectSignificantState.f264980b : null;
                if (str == null) {
                    str = "";
                }
                SelectInternalAction.QueryChanged queryChanged = new SelectInternalAction.QueryChanged(str);
                this.f265622r = interfaceC43172j;
                this.f265621q = 1;
                if (interfaceC43172j.emit(queryChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f265622r;
                C42729a0.b(obj);
            }
            SelectInternalAction.Loading loading = new SelectInternalAction.Loading();
            this.f265622r = null;
            this.f265621q = 2;
            if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.mvi.SelectBootstrap$produce$3", f = "SelectBootstrap.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SelectInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f265624q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f265625r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f265626s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SelectInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f265625r = interfaceC43172j;
            cVar.f265626s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f265624q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f265625r;
                SelectInternalAction.Error error = new SelectInternalAction.Error(this.f265626s);
                this.f265625r = null;
                this.f265624q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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
    public k(@Y61.k Arguments arguments, @Y61.k com.avito.android.select.g gVar, @Y61.k R0 r02, @Y61.l SelectSignificantState selectSignificantState) {
        this.f265612a = arguments;
        this.f265613b = gVar;
        this.f265614c = r02;
        this.f265615d = selectSignificantState;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectInternalAction> a() {
        Set<ParcelableEntity<String>> setP0;
        Arguments arguments = this.f265612a;
        InterfaceC43160i c43210w = arguments.getRequestFocus() ? new C43210w(SelectInternalAction.RequestSearchFocus.f265588b) : C43175k.w();
        SelectSignificantState selectSignificantState = this.f265615d;
        if (selectSignificantState == null || (setP0 = selectSignificantState.f264981c) == null) {
            setP0 = C42745f0.P0(arguments.getSelected());
        }
        C43210w c43210w2 = new C43210w(new SelectInternalAction.UpdateSelected(setP0));
        String str = selectSignificantState != null ? selectSignificantState.f264980b : null;
        if (str == null) {
            str = "";
        }
        return C43175k.N(c43210w, c43210w2, new C43152f0(new C43137a0(new b(null), new a(C43175k.I(this.f265614c.a(), y.a(this.f265613b.b(str))))), new c(3, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
