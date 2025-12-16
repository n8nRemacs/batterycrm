package com.avito.android.authorization.auto_recovery.phone_confirm;

import To.d;
import android.annotation.SuppressLint;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import ie.InterfaceC41389a;
import ke.C42673b;
import ke.InterfaceC42674c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoRecoveryPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/a;", "Lcom/avito/android/code_check_public/screen/d$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class a extends d.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41389a f93198a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f93199b;

    /* compiled from: AutoRecoveryPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.phone_confirm.AbstractAutoRecoveryPhoneRequestInteractor$request$1", f = "AutoRecoveryPhoneRequestInteractor.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 43}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.authorization.auto_recovery.phone_confirm.a$a, reason: collision with other inner class name */
    public static final class C2753a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public a f93200q;

        /* renamed from: r, reason: collision with root package name */
        public int f93201r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f93202s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f93203t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f93204u;

        /* compiled from: AutoRecoveryPhoneRequestInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lke/c;", "result", "LTo/d;", "invoke", "(Lke/c;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.authorization.auto_recovery.phone_confirm.a$a$a, reason: collision with other inner class name */
        public static final class C2754a extends N implements Y41.l<InterfaceC42674c, To.d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a f93205l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f93206m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2754a(a aVar, String str) {
                super(1);
                this.f93205l = aVar;
                this.f93206m = str;
            }

            @Override // Y41.l
            public final To.d invoke(InterfaceC42674c interfaceC42674c) {
                InterfaceC42674c interfaceC42674c2 = interfaceC42674c;
                if (interfaceC42674c2 instanceof InterfaceC42674c.a) {
                    return new d.c.b(com.avito.android.printable_text.b.f(((InterfaceC42674c.a) interfaceC42674c2).getMessages().getPhone()));
                }
                if (!(interfaceC42674c2 instanceof InterfaceC42674c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC42674c.b bVar = (InterfaceC42674c.b) interfaceC42674c2;
                return this.f93205l.d(bVar, this.f93206m, bVar.getNextTryTime() - bVar.getLastTryTime());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2753a(String str, a aVar, Continuation<? super C2753a> continuation) {
            super(2, continuation);
            this.f93203t = str;
            this.f93204u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C2753a c2753a = new C2753a(this.f93203t, this.f93204u, continuation);
            c2753a.f93202s = obj;
            return c2753a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C2753a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f93201r;
            a aVar2 = this.f93204u;
            String str = this.f93203t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f93202s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for AbstractAutoRecoveryPhoneRequestInteractor");
                }
                InterfaceC41389a interfaceC41389a = aVar2.f93198a;
                C42673b c42673b = new C42673b(str);
                this.f93202s = interfaceC43172j2;
                this.f93200q = aVar2;
                this.f93201r = 1;
                Object objE = interfaceC41389a.e(c42673b, this);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objE;
                aVar = aVar2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                aVar = this.f93200q;
                interfaceC43172j = (InterfaceC43172j) this.f93202s;
                C42729a0.b(obj);
            }
            C2754a c2754a = new C2754a(aVar2, str);
            aVar.getClass();
            To.d dVarA = com.avito.android.code_check_public.screen.f.a((TypedResult) obj, c2754a);
            this.f93202s = null;
            this.f93200q = null;
            this.f93201r = 2;
            if (interfaceC43172j.emit(dVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    public a(@Y61.k InterfaceC41389a interfaceC41389a, @com.avito.android.code_check_public.g @Y61.k i iVar) {
        this.f93198a = interfaceC41389a;
        this.f93199b = iVar;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    public final InterfaceC43160i b() {
        return new C43210w(new d.f(this.f93199b.b()));
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new C2753a(str, this, null));
    }

    @Y61.k
    public abstract To.d d(@Y61.k InterfaceC42674c.b bVar, @Y61.k String str, long j12);
}
