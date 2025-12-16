package com.avito.android.select.new_metro.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import gq0.InterfaceC40721a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectMetroBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.arch.mvi.b<SelectMetroInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectMetroParams f266263a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40721a f266264b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.new_metro.o f266265c;

    /* compiled from: SelectMetroBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroBootstrap$produce$1", f = "SelectMetroBootstrap.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 30, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectMetroInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f266266q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f266267r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f266267r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectMetroInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f266266q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.C42729a0.b(r8)
                goto L66
            L1e:
                java.lang.Object r1 = r7.f266267r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L45
            L26:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f266267r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.select.new_metro.mvi.g r8 = com.avito.android.select.new_metro.mvi.g.this
                com.avito.android.select.new_metro.SelectMetroParams r5 = r8.f266263a
                com.avito.android.remote.model.metro_lines.MetroResponseBody r6 = r5.f265940b
                if (r6 != 0) goto L58
                r7.f266267r = r1
                r7.f266266q = r4
                com.avito.android.select.new_metro.o r8 = r8.f266265c
                int r2 = r5.f265942d
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r0) goto L45
                return r0
            L45:
                com.avito.android.remote.model.metro_lines.MetroResponseBody r8 = (com.avito.android.remote.model.metro_lines.MetroResponseBody) r8
                com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction$MetroStationsLoadedSuccessfully r2 = new com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction$MetroStationsLoadedSuccessfully
                r2.<init>(r8)
                r8 = 0
                r7.f266267r = r8
                r7.f266266q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L66
                return r0
            L58:
                com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction$MetroStationsLoadedSuccessfully r8 = new com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction$MetroStationsLoadedSuccessfully
                r8.<init>(r6)
                r7.f266266q = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L66
                return r0
            L66:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_metro.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SelectMetroBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroBootstrap$produce$2", f = "SelectMetroBootstrap.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectMetroInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f266269q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f266270r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(continuation);
            bVar.f266270r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectMetroInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f266269q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f266270r;
                g gVar = g.this;
                SelectMetroParams selectMetroParams = gVar.f266263a;
                boolean z12 = selectMetroParams.f265945g;
                InterfaceC40721a interfaceC40721a = gVar.f266264b;
                if (z12) {
                    interfaceC40721a.f(selectMetroParams.f265944f);
                } else {
                    List<ParcelableEntity<String>> list = selectMetroParams.f265946h;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Integer numY0 = C43066x.y0((String) ((ParcelableEntity) it.next()).getId());
                        if (numY0 != null) {
                            arrayList.add(numY0);
                        }
                    }
                    interfaceC40721a.d(selectMetroParams.f265942d, selectMetroParams.f265943e, arrayList);
                }
                SelectMetroInternalAction.MetroStationsLoadingStarted metroStationsLoadingStarted = new SelectMetroInternalAction.MetroStationsLoadingStarted();
                this.f266269q = 1;
                if (interfaceC43172j.emit(metroStationsLoadingStarted, this) == coroutine_suspended) {
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

    /* compiled from: SelectMetroBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroBootstrap$produce$3", f = "SelectMetroBootstrap.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super SelectMetroInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f266272q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f266273r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f266274s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SelectMetroInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f266273r = interfaceC43172j;
            cVar.f266274s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f266272q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f266273r;
                SelectMetroInternalAction.MetroStationsLoadedError metroStationsLoadedError = new SelectMetroInternalAction.MetroStationsLoadedError(this.f266274s);
                this.f266273r = null;
                this.f266272q = 1;
                if (interfaceC43172j.emit(metroStationsLoadedError, this) == coroutine_suspended) {
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
    public g(@Y61.k SelectMetroParams selectMetroParams, @Y61.k InterfaceC40721a interfaceC40721a, @Y61.k com.avito.android.select.new_metro.o oVar) {
        this.f266263a = selectMetroParams;
        this.f266264b = interfaceC40721a;
        this.f266265c = oVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SelectMetroInternalAction> a() {
        SelectMetroParams selectMetroParams = this.f266263a;
        if (selectMetroParams.f265945g) {
            this.f266264b.g(selectMetroParams.f265944f);
        }
        return new C43152f0(new C43137a0(new b(null), C43175k.G(new a(null))), new c(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
