package com.avito.android.authorization.start_registration.code_check;

import To.d;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.i;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.remote.r;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: RegistrationPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/start_registration/code_check/f;", "Lcom/avito/android/code_check_public/screen/d$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends d.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f94632a;

    /* compiled from: RegistrationPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.start_registration.code_check.RegistrationPhoneRequestInteractor$request$1", f = "RegistrationPhoneRequestInteractor.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 69}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public f f94633q;

        /* renamed from: r, reason: collision with root package name */
        public int f94634r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f94635s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f94636t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ f f94637u;

        /* compiled from: RegistrationPhoneRequestInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/RequestCodeResult;", "result", "LTo/d;", "invoke", "(Lcom/avito/android/remote/model/registration/RequestCodeResult;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.authorization.start_registration.code_check.f$a$a, reason: collision with other inner class name */
        public static final class C2809a extends N implements l<RequestCodeResult, To.d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f94638l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2809a(String str) {
                super(1);
                this.f94638l = str;
            }

            @Override // Y41.l
            public final To.d invoke(RequestCodeResult requestCodeResult) {
                RequestCodeResult requestCodeResult2 = requestCodeResult;
                if (requestCodeResult2 instanceof RequestCodeResult.Ok) {
                    RequestCodeResult.Ok ok2 = (RequestCodeResult.Ok) requestCodeResult2;
                    return new d.a(this.f94638l, ok2.getNextTryTime() - ok2.getLastTryTime(), 5, null, 8, null);
                }
                if (requestCodeResult2 instanceof RequestCodeResult.ErrorDialog) {
                    return new d.f(new i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((RequestCodeResult.ErrorDialog) requestCodeResult2).getUserDialog()), null, 2, null));
                }
                if (requestCodeResult2 instanceof RequestCodeResult.Failure) {
                    return new d.b(com.avito.android.printable_text.b.f(((RequestCodeResult.Failure) requestCodeResult2).getMessage()), null, null, 6, null);
                }
                if (requestCodeResult2 instanceof RequestCodeResult.IncorrectData) {
                    String str = (String) C42745f0.F(((RequestCodeResult.IncorrectData) requestCodeResult2).getMessages().values());
                    return new d.c.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
                }
                if (requestCodeResult2 instanceof RequestCodeResult.VerifyByCall) {
                    throw new IllegalStateException();
                }
                if (!(requestCodeResult2 instanceof RequestCodeResult.Confirmed)) {
                    throw new NoWhenBranchMatchedException();
                }
                RequestCodeResult.Confirmed confirmed = (RequestCodeResult.Confirmed) requestCodeResult2;
                return new d.C1084d(new a.b.C3497b(new To.b(new ConfirmedCodeInfo(Phone.b(this.f94638l), confirmed.getHash(), confirmed.getIsPhoneUsed(), null, 8, null)), null, null, null, null, 30, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94636t = str;
            this.f94637u = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f94636t, this.f94637u, continuation);
            aVar.f94635s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            f fVar;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f94634r;
            String str = this.f94636t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f94635s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for RegistrationPhoneRequestInteractor");
                }
                fVar = this.f94637u;
                r rVar = fVar.f94632a;
                Parcelable.Creator<CodeConfirmationSource> creator = CodeConfirmationSource.CREATOR;
                this.f94635s = interfaceC43172j2;
                this.f94633q = fVar;
                this.f94634r = 1;
                Object objA = rVar.a(str, false, "registration", this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
                obj = objA;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                fVar = this.f94633q;
                interfaceC43172j = (InterfaceC43172j) this.f94635s;
                C42729a0.b(obj);
            }
            C2809a c2809a = new C2809a(str);
            fVar.getClass();
            To.d dVarA = com.avito.android.code_check_public.screen.f.a((TypedResult) obj, c2809a);
            this.f94635s = null;
            this.f94633q = null;
            this.f94634r = 2;
            if (interfaceC43172j.emit(dVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@k r rVar) {
        this.f94632a = rVar;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @k
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new a(str, this, null));
    }
}
