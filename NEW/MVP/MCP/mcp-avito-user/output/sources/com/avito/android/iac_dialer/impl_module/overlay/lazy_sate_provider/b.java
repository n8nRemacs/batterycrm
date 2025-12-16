package com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import sK.InterfaceC48062a;

/* compiled from: IacOverlayLazyStateProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/b;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/a;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/h;", "LRK/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a, h, RK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48062a f166137a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f166138b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Z1<IacOverlayState> f166139c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Z1<Boolean> f166140d;

    /* compiled from: IacOverlayLazyStateProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacOverlayLazyStateProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.IacOverlayLazyStateProviderImpl$subscribeToDialer$1", f = "IacOverlayLazyStateProvider.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.b$b, reason: collision with other inner class name */
    public static final class C4923b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166141q;

        /* compiled from: IacOverlayLazyStateProvider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.b$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f166143b;

            public a(b bVar) {
                this.f166143b = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                IacOverlayState iacOverlayState = (IacOverlayState) obj;
                b bVar = this.f166143b;
                bVar.f166139c.setValue(iacOverlayState);
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacOverlayLazyStateProvider", "new state: " + iacOverlayState, null);
                bVar.f166140d.setValue(Boxing.boxBoolean(iacOverlayState instanceof IacOverlayState.Visible));
                return G0.f406611a;
            }
        }

        public C4923b(Continuation<? super C4923b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new C4923b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4923b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166141q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                C0 c0B = C43175k.B(new c(new l0.h(), null), bVar.f166137a.getState());
                a aVar = new a(bVar);
                this.f166141q = 1;
                if (c0B.collect(aVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public b(@k InterfaceC48062a interfaceC48062a, @k R0 r02) {
        this.f166137a = interfaceC48062a;
        this.f166138b = r02;
        IacOverlayState.Hidden hidden = IacOverlayState.Hidden.INSTANCE;
        com.avito.android.iac_dialer.impl_module.utils.b bVar = com.avito.android.iac_dialer.impl_module.utils.b.f166511a;
        HasIndex hasIndexA = bVar.a(hidden.getIndexType());
        if (hasIndexA == null) {
            hidden.setIndex(0);
            bVar.b(hidden.getIndexType(), hidden);
        } else if (hasIndexA.equals(hidden)) {
            hidden.setIndex(hasIndexA.getIndex());
        } else {
            hidden.setIndex(hasIndexA.getIndex() + 1);
            bVar.b(hidden.getIndexType(), hidden);
        }
        this.f166139c = p2.a(hidden);
        this.f166140d = p2.a(Boolean.FALSE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a
    public final InterfaceC43160i a() {
        return this.f166139c;
    }

    @Override // com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.h
    public final void b() {
        C43259k.d(U.a(this.f166138b.b()), null, null, new C4923b(null), 3);
    }

    @Override // RK.a
    public final n2 c() {
        return this.f166140d;
    }
}
