package com.avito.android.authorization.reset_password.code_check;

import To.d;
import Y41.p;
import com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeCheckResult;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.recover_by_phone.RecoverByPhoneResult;
import com.avito.android.remote.r;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ResetPasswordPhoneRequestInteractor.kt */
@com.avito.android.code_check_public.g
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/j;", "Lcom/avito/android/code_check_public/screen/d$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends d.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f94133a;

    /* compiled from: ResetPasswordPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.reset_password.code_check.ResetPasswordPhoneRequestInteractor$request$1", f = "ResetPasswordPhoneRequestInteractor.kt", i = {0}, l = {33, 83}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public j f94134q;

        /* renamed from: r, reason: collision with root package name */
        public int f94135r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f94136s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f94137t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j f94138u;

        /* compiled from: ResetPasswordPhoneRequestInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "result", "LTo/d;", "invoke", "(Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.authorization.reset_password.code_check.j$a$a, reason: collision with other inner class name */
        public static final class C2788a extends N implements Y41.l<RecoverByPhoneResult, To.d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f94139l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2788a(String str) {
                super(1);
                this.f94139l = str;
            }

            @Override // Y41.l
            public final To.d invoke(RecoverByPhoneResult recoverByPhoneResult) {
                RecoverByPhoneResult recoverByPhoneResult2 = recoverByPhoneResult;
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.Ok) {
                    RecoverByPhoneResult.Ok ok2 = (RecoverByPhoneResult.Ok) recoverByPhoneResult2;
                    return new d.a(this.f94139l, ok2.getNextTryTime() - ok2.getLastTryTime(), 5, null, 8, null);
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.Confirmed) {
                    RecoverByPhoneResult.Confirmed confirmed = (RecoverByPhoneResult.Confirmed) recoverByPhoneResult2;
                    return new d.C1084d(new a.b.C3497b(new To.b(new ResetPasswordCodeCheckResult.Confirmed(this.f94139l, confirmed.getHash(), confirmed.getIsPhoneUsed())), null, null, null, null, 30, null));
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.ErrorDialog) {
                    return new d.f(new com.avito.android.code_check_public.i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((RecoverByPhoneResult.ErrorDialog) recoverByPhoneResult2).getUserDialog()), null, 2, null));
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.FollowDeeplink) {
                    return new d.C1084d(new a.InterfaceC3494a.b(((RecoverByPhoneResult.FollowDeeplink) recoverByPhoneResult2).getDeeplink(), null, 2, null));
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.Failure) {
                    return new d.b(com.avito.android.printable_text.b.f(((RecoverByPhoneResult.Failure) recoverByPhoneResult2).getMessage()), null, null);
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.IncorrectData) {
                    String str = (String) C42745f0.F(((RecoverByPhoneResult.IncorrectData) recoverByPhoneResult2).getMessages().values());
                    return new d.c.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
                }
                if (recoverByPhoneResult2 instanceof RecoverByPhoneResult.Unsafe) {
                    return new d.b(com.avito.android.printable_text.b.f(((RecoverByPhoneResult.Unsafe) recoverByPhoneResult2).getMessage()), null, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94137t = str;
            this.f94138u = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f94137t, this.f94138u, continuation);
            aVar.f94136s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            j jVar;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f94135r;
            String str = this.f94137t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f94136s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for ResetPasswordPhoneRequestInteractor");
                }
                jVar = this.f94138u;
                I<TypedResult<RecoverByPhoneResult>> iH2 = jVar.f94133a.h(str);
                this.f94136s = interfaceC43172j2;
                this.f94134q = jVar;
                this.f94135r = 1;
                Object objB = C43292o.b(iH2, this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objB;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                jVar = this.f94134q;
                interfaceC43172j = (InterfaceC43172j) this.f94136s;
                C42729a0.b(obj);
            }
            C2788a c2788a = new C2788a(str);
            jVar.getClass();
            To.d dVarA = com.avito.android.code_check_public.screen.f.a((TypedResult) obj, c2788a);
            this.f94136s = null;
            this.f94134q = null;
            this.f94135r = 2;
            if (interfaceC43172j.emit(dVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public j(@Y61.k r rVar) {
        this.f94133a = rVar;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new a(str, this, null));
    }
}
