package com.avito.android.sbc.dispatch_edit.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SbcDispatchEditBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/dispatch_edit/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.b<SbcDispatchEditInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final long f260116a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34468d f260117b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<SbcDispatchEditInternalAction.Loaded> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f260118b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f260119c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.sbc.dispatch_edit.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C7803a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f260120b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f260121c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.sbc.dispatch_edit.mvi.SbcDispatchEditBootstrap$produce$$inlined$map$1$2", f = "SbcDispatchEditBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.sbc.dispatch_edit.mvi.e$a$a$a, reason: collision with other inner class name */
            public static final class C7804a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f260122q;

                /* renamed from: r, reason: collision with root package name */
                public int f260123r;

                public C7804a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f260122q = obj;
                    this.f260123r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7803a.this.emit(null, this);
                }
            }

            public C7803a(InterfaceC43172j interfaceC43172j, e eVar) {
                this.f260120b = interfaceC43172j;
                this.f260121c = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof com.avito.android.sbc.dispatch_edit.mvi.e.a.C7803a.C7804a
                    if (r0 == 0) goto L13
                    r0 = r10
                    com.avito.android.sbc.dispatch_edit.mvi.e$a$a$a r0 = (com.avito.android.sbc.dispatch_edit.mvi.e.a.C7803a.C7804a) r0
                    int r1 = r0.f260123r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f260123r = r1
                    goto L18
                L13:
                    com.avito.android.sbc.dispatch_edit.mvi.e$a$a$a r0 = new com.avito.android.sbc.dispatch_edit.mvi.e$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f260122q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f260123r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r10)
                    goto L79
                L29:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L31:
                    kotlin.C42729a0.b(r10)
                    com.avito.android.sbc.autodispatches.b r9 = (com.avito.android.sbc.autodispatches.C34466b) r9
                    java.util.List<com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut> r9 = r9.f258848a
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.Iterator r9 = r9.iterator()
                L3e:
                    boolean r10 = r9.hasNext()
                    if (r10 == 0) goto L58
                    java.lang.Object r10 = r9.next()
                    r2 = r10
                    com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut r2 = (com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut) r2
                    long r4 = r2.getId()
                    com.avito.android.sbc.dispatch_edit.mvi.e r2 = r8.f260121c
                    long r6 = r2.f260116a
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 != 0) goto L3e
                    goto L59
                L58:
                    r10 = 0
                L59:
                    com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut r10 = (com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut) r10
                    if (r10 == 0) goto L67
                    com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction$Loaded r9 = new com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction$Loaded
                    java.util.List r10 = r10.f()
                    r9.<init>(r10)
                    goto L6e
                L67:
                    com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction$Loaded r9 = new com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction$Loaded
                    kotlin.collections.z0 r10 = kotlin.collections.C42784z0.f406748b
                    r9.<init>(r10)
                L6e:
                    r0.f260123r = r3
                    kotlinx.coroutines.flow.j r10 = r8.f260120b
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L79
                    return r1
                L79:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.dispatch_edit.mvi.e.a.C7803a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, e eVar) {
            this.f260118b = interfaceC43160i;
            this.f260119c = eVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super SbcDispatchEditInternalAction.Loaded> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f260118b.collect(new C7803a(interfaceC43172j, this.f260119c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public e(long j12, @Y61.k InterfaceC34468d interfaceC34468d) {
        this.f260116a = j12;
        this.f260117b = interfaceC34468d;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SbcDispatchEditInternalAction> a() {
        return new a(this.f260117b.e(), this);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
