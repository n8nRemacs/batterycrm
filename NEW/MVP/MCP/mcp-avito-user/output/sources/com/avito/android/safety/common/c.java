package com.avito.android.safety.common;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.account.Z;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GetLoggedEmailUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/common/c;", "Lcom/avito/android/safety/common/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.safety.common.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final G f257191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B3.c f257192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B3.a f257193c;

    /* compiled from: GetLoggedEmailUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.common.GetLoggedEmailUseCaseImpl$invoke$1", f = "GetLoggedEmailUseCase.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super String>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257194q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257195r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f257196s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f257196s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f257196s, continuation);
            aVar.f257195r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super String> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257194q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f257195r;
                String str = this.f257196s;
                if (str != null) {
                    this.f257194q = 1;
                    if (interfaceC43172j.emit(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public c(@k G g12, @k B3.c cVar, @k B3.a aVar) {
        this.f257191a = g12;
        this.f257192b = cVar;
        this.f257193c = aVar;
    }

    @Override // com.avito.android.safety.common.a
    @k
    public final InterfaceC43160i<String> invoke() {
        String email;
        Z z12 = (Z) C42745f0.G(this.f257192b.c());
        if ((z12 == null || (email = z12.f68097b) == null) && (email = this.f257191a.e().getEmail()) == null) {
            email = this.f257193c.d();
        }
        return C43175k.G(new a(email, null));
    }
}
