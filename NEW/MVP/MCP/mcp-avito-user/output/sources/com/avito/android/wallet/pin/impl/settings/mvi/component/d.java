package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsActor$process$$inlined$transform$1", f = "WalletSecuritySettingsActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletSecuritySettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328787q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f328789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.pin.impl.settings.mvi.component.a f328790t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f328791u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<WalletSecuritySettingsInternalAction> f328792b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.settings.mvi.component.a f328793c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a f328794d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsActor$process$$inlined$transform$1$1", f = "WalletSecuritySettingsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.component.d$a$a, reason: collision with other inner class name */
        public static final class C10206a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f328795q;

            /* renamed from: r, reason: collision with root package name */
            public int f328796r;

            public C10206a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f328795q = obj;
                this.f328796r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, com.avito.android.wallet.pin.impl.settings.mvi.component.a aVar, Y41.a aVar2) {
            this.f328793c = aVar;
            this.f328794d = aVar2;
            this.f328792b = interfaceC43172j;
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
                boolean r0 = r6 instanceof com.avito.android.wallet.pin.impl.settings.mvi.component.d.a.C10206a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.wallet.pin.impl.settings.mvi.component.d$a$a r0 = (com.avito.android.wallet.pin.impl.settings.mvi.component.d.a.C10206a) r0
                int r1 = r0.f328796r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f328796r = r1
                goto L18
            L13:
                com.avito.android.wallet.pin.impl.settings.mvi.component.d$a$a r0 = new com.avito.android.wallet.pin.impl.settings.mvi.component.d$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f328795q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f328796r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L4d
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kv.a r5 = (kv.C43501a) r5
                Y41.a r6 = r4.f328794d
                java.lang.Object r6 = r6.invoke()
                com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState r6 = (com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsState) r6
                Ju.c r5 = r5.f413261b
                r0.f328796r = r3
                com.avito.android.wallet.pin.impl.settings.mvi.component.a r2 = r4.f328793c
                kotlinx.coroutines.flow.j<com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction> r3 = r4.f328792b
                java.lang.Object r5 = com.avito.android.wallet.pin.impl.settings.mvi.component.a.c(r2, r3, r6, r5, r0)
                if (r5 != r1) goto L4d
                return r1
            L4d:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.settings.mvi.component.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation continuation, com.avito.android.wallet.pin.impl.settings.mvi.component.a aVar, Y41.a aVar2) {
        super(2, continuation);
        this.f328789s = cVar;
        this.f328790t = aVar;
        this.f328791u = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f328789s, continuation, this.f328790t, this.f328791u);
        dVar.f328788r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WalletSecuritySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f328787q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f328788r, this.f328790t, this.f328791u);
            this.f328787q = 1;
            if (this.f328789s.collect(aVar, this) == coroutine_suspended) {
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
