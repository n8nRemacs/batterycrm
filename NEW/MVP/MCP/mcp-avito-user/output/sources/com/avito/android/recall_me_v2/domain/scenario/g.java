package com.avito.android.recall_me_v2.domain.scenario;

import To.d;
import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.recall_me.domain.n;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.RecallMeError;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMePhoneRequestInteractor.kt */
@com.avito.android.code_check_public.g
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me_v2/domain/scenario/g;", "Lcom/avito/android/code_check_public/screen/d$b;", "a", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends d.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f252068a;

    /* compiled from: RecallMePhoneRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/recall_me_v2/domain/scenario/g$a;", "", "<init>", "()V", "", "DEFAULT_CODE_TIMEOUT", "J", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecallMePhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.domain.scenario.RecallMePhoneRequestInteractor$request$1", f = "RecallMePhoneRequestInteractor.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY, 41}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public g f252069q;

        /* renamed from: r, reason: collision with root package name */
        public int f252070r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f252071s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f252072t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g f252073u;

        /* compiled from: RecallMePhoneRequestInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/ConfirmCodeResponse;", "response", "LTo/d;", "invoke", "(Lcom/avito/android/remote/ConfirmCodeResponse;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements l<ConfirmCodeResponse, To.d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f252074l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(1);
                this.f252074l = str;
            }

            @Override // Y41.l
            public final To.d invoke(ConfirmCodeResponse confirmCodeResponse) {
                String message;
                ConfirmCodeResponse confirmCodeResponse2 = confirmCodeResponse;
                if (confirmCodeResponse2.getSuccess()) {
                    return new d.a(this.f252074l, confirmCodeResponse2.getRetryAfterSec() != null ? TimeUnit.SECONDS.toMillis(r0.intValue()) : 180000L, 5, null, 8, null);
                }
                RecallMeError error = confirmCodeResponse2.getError();
                PrintableText printableTextF = null;
                if (error != null && (message = error.getMessage()) != null) {
                    printableTextF = com.avito.android.printable_text.b.f(message);
                }
                return new d.b(printableTextF, null, null, 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, g gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f252072t = str;
            this.f252073u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f252072t, this.f252073u, continuation);
            bVar.f252071s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            g gVar;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252070r;
            String str = this.f252072t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f252071s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for RecallMePhoneRequestInteractor");
                }
                gVar = this.f252073u;
                n nVar = gVar.f252068a;
                String strB = Phone.b(str);
                this.f252071s = interfaceC43172j2;
                this.f252069q = gVar;
                this.f252070r = 1;
                Object objE = nVar.e(strB, this);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objE;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                gVar = this.f252069q;
                interfaceC43172j = (InterfaceC43172j) this.f252071s;
                C42729a0.b(obj);
            }
            a aVar = new a(str);
            gVar.getClass();
            To.d dVarA = com.avito.android.code_check_public.screen.f.a((TypedResult) obj, aVar);
            this.f252071s = null;
            this.f252069q = null;
            this.f252070r = 2;
            if (interfaceC43172j.emit(dVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@k n nVar) {
        this.f252068a = nVar;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @k
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new b(str, this, null));
    }
}
