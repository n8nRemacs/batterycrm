package com.avito.android.sx_address.list.mvi;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.b;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/z;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z implements com.avito.android.arch.mvi.b<com.avito.android.sx_address.list.mvi.entity.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.domain.b f293392a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SxAddressListParams f293393b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f293394c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f293395d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.analytics.i f293396e;

    /* compiled from: SxAddressListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListBootstrap$produce$1", f = "SxAddressListBootstrap.kt", i = {0, 1, 2, 2, 2, 3, 3}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 30, 35, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response", "data", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f293397q;

        /* renamed from: r, reason: collision with root package name */
        public ScreenData f293398r;

        /* renamed from: s, reason: collision with root package name */
        public int f293399s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f293400t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = z.this.new a(continuation);
            aVar.f293400t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.list.mvi.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SxAddressListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListBootstrap$produce$2", f = "SxAddressListBootstrap.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f293402q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f293403r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f293404s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f293403r = interfaceC43172j;
            bVar.f293404s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f293402q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f293403r;
                b.c cVar = new b.c(this.f293404s);
                this.f293403r = null;
                this.f293402q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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
    public z(@Y61.k com.avito.android.sx_address.list.domain.b bVar, @Y61.k SxAddressListParams sxAddressListParams, @Y61.k @com.avito.android.sx_address.list.di.A SharedPreferences sharedPreferences, @Y61.k com.avito.android.analytics.provider.a aVar, @Y61.k com.avito.android.sx_address.list.analytics.i iVar) {
        this.f293392a = bVar;
        this.f293393b = sxAddressListParams;
        this.f293394c = sharedPreferences;
        this.f293395d = aVar;
        this.f293396e = iVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<com.avito.android.sx_address.list.mvi.entity.b> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
