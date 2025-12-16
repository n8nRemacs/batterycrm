package com.avito.android.publish.input_imei.mvi;

import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InputImeiBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiBootstrap$collectInputState$1", f = "InputImeiBootstrap.kt", i = {0, 0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 93}, m = "invokeSuspend", n = {"$this$channelFlow", "presenter"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<I0<? super InputImeiInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.blueprints.input.d f236401q;

    /* renamed from: r, reason: collision with root package name */
    public int f236402r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f236403s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f236404t;

    /* compiled from: InputImeiBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/ItemWithAdditionalButton;", "item", "Lkotlin/G0;", "emit", "(Lcom/avito/android/items/ItemWithAdditionalButton;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f236405b;

        public a(m mVar) {
            this.f236405b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            m.c(this.f236405b, (ItemWithAdditionalButton) obj);
            return G0.f406611a;
        }
    }

    /* compiled from: InputImeiBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/items/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_imei.mvi.InputImeiBootstrap$collectInputState$1$2", f = "InputImeiBootstrap.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<com.avito.android.items.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f236406q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f236407r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I0<InputImeiInternalAction> f236408s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super InputImeiInternalAction> i02, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f236408s = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f236408s, continuation);
            bVar.f236407r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.items.a aVar, Continuation<? super G0> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f236406q;
            if (i12 == 0) {
                C42729a0.b(obj);
                String f117481f = ((com.avito.android.items.a) this.f236407r).getF117481f();
                if (f117481f == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                InputImeiInternalAction.UpdateImeiText updateImeiText = new InputImeiInternalAction.UpdateImeiText(f117481f);
                this.f236406q = 1;
                if (this.f236408s.send(updateImeiText, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f236404t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f236404t, continuation);
        hVar.f236403s = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super InputImeiInternalAction> i02, Continuation<? super G0> continuation) {
        return ((h) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f236402r
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.C42729a0.b(r9)
            goto L93
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            com.avito.android.blueprints.input.d r1 = r8.f236401q
            java.lang.Object r3 = r8.f236403s
            kotlinx.coroutines.channels.I0 r3 = (kotlinx.coroutines.channels.I0) r3
            kotlin.C42729a0.b(r9)
            goto L73
        L26:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f236403s
            kotlinx.coroutines.channels.I0 r9 = (kotlinx.coroutines.channels.I0) r9
            com.avito.android.publish.input_imei.mvi.m r1 = r8.f236404t
            java.util.Set<TV0.d<?, ?>> r5 = r1.f236434e
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r5.next()
            boolean r7 = r6 instanceof com.avito.android.blueprints.input.d
            if (r7 == 0) goto L39
            goto L49
        L48:
            r6 = r4
        L49:
            boolean r5 = r6 instanceof com.avito.android.blueprints.input.d
            if (r5 != 0) goto L4e
            r6 = r4
        L4e:
            r5 = r6
            com.avito.android.blueprints.input.d r5 = (com.avito.android.blueprints.input.d) r5
            if (r5 == 0) goto L75
            com.jakewharton.rxrelay3.c r6 = r5.getF105960r()
            if (r6 == 0) goto L75
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.rx3.y.a(r6)
            com.avito.android.publish.input_imei.mvi.h$a r7 = new com.avito.android.publish.input_imei.mvi.h$a
            r7.<init>(r1)
            r8.f236403s = r9
            r8.f236401q = r5
            r8.f236402r = r3
            kotlinx.coroutines.flow.internal.f r6 = (kotlinx.coroutines.flow.internal.AbstractC43168f) r6
            java.lang.Object r1 = r6.collect(r7, r8)
            if (r1 != r0) goto L71
            return r0
        L71:
            r3 = r9
            r1 = r5
        L73:
            r5 = r1
            r9 = r3
        L75:
            if (r5 == 0) goto L93
            io.reactivex.rxjava3.core.z r1 = r5.b()
            if (r1 == 0) goto L93
            kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.rx3.y.a(r1)
            com.avito.android.publish.input_imei.mvi.h$b r3 = new com.avito.android.publish.input_imei.mvi.h$b
            r3.<init>(r9, r4)
            r8.f236403s = r4
            r8.f236401q = r4
            r8.f236402r = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.j(r1, r3, r8)
            if (r9 != r0) goto L93
            return r0
        L93:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.input_imei.mvi.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
