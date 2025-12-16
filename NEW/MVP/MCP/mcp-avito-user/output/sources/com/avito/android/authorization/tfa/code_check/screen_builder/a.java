package com.avito.android.authorization.tfa.code_check.screen_builder;

import To.d;
import ae.C19873a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaCodeCheckScreenBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/screen_builder/a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class a {

    /* compiled from: TfaCodeCheckScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/authorization/tfa/code_check/screen_builder/a$a", "Lcom/avito/android/code_check_public/screen/d$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.authorization.tfa.code_check.screen_builder.a$a, reason: collision with other inner class name */
    public static final class C2813a extends d.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CodeCheckLink.Flow.TfaCheck.LoginInfo f94709b;

        /* compiled from: TfaCodeCheckScreenBuilder.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.screen_builder.TfaCodeCheckScreenBuilder$createPushScreen$screen$3$request$1", f = "TfaCodeCheckScreenBuilder.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.tfa.code_check.screen_builder.a$a$a, reason: collision with other inner class name */
        public static final class C2814a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f94710q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f94711r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a f94712s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ CodeCheckLink.Flow.TfaCheck.LoginInfo f94713t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2814a(a aVar, CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo, Continuation<? super C2814a> continuation) {
                super(2, continuation);
                this.f94712s = aVar;
                this.f94713t = loginInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2814a c2814a = new C2814a(this.f94712s, this.f94713t, continuation);
                c2814a.f94711r = obj;
                return c2814a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C2814a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f94710q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f94711r;
                    d.C1084d c1084d = new d.C1084d(this.f94712s.d(this.f94713t));
                    this.f94710q = 1;
                    if (interfaceC43172j.emit(c1084d, this) == coroutine_suspended) {
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

        public C2813a(CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
            this.f94709b = loginInfo;
        }

        @Override // com.avito.android.code_check_public.screen.d.b
        @Y61.k
        public final InterfaceC43160i<To.d> c(@Y61.l String str) {
            return C43175k.G(new C2814a(a.this, this.f94709b, null));
        }
    }

    /* compiled from: TfaCodeCheckScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "it", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Phone, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC28373a f94714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28373a interfaceC28373a) {
            super(1);
            this.f94714l = interfaceC28373a;
        }

        @Override // Y41.l
        public final G0 invoke(Phone phone) {
            this.f94714l.c(new C19873a(null, CodeConfirmationSource.f92757e));
            return G0.f406611a;
        }
    }

    @Y61.k
    public static a.InterfaceC3494a.d b(@Y61.k String str, @Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.k c.b bVar, @Y61.l com.avito.android.code_check_public.screen.a aVar, @Y61.k a.InterfaceC3494a.C3495a c3495a, @Y61.k d.b bVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c(str, new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.InterfaceC3494a.C3495a(null, 1, null), new com.avito.android.code_check_public.screen.b(c3495a, AppbarNavigationIcon.f119297b, aVar), null, 8, null), new com.avito.android.authorization.tfa.code_check.screen_builder.b(interfaceC28373a), new c.a(printableText, null, new c.d.b(printableText2, new com.avito.android.authorization.auto_recovery.phone_confirm.b(6)), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_hint, new Serializable[0]), new com.avito.android.authorization.auto_recovery.phone_confirm.b(7), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_resend, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_resend_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_button, new Serializable[0]), 2, null), bVar, bVar2, null, new c(2, null), 64, null), false, null, 6, null);
    }

    @Y61.k
    public final a.InterfaceC3494a.d a(@Y61.k String str, @Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.k c.b bVar, @Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo, @Y61.k InterfaceC28373a interfaceC28373a) {
        a.InterfaceC3494a.d dVarD = d(loginInfo);
        c.a aVar = new c.a(printableText, null, new c.d.C3506c(printableText2, new com.avito.android.authorization.auto_recovery.phone_confirm.b(8)), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_push_hint, new Serializable[0]), new com.avito.android.authorization.auto_recovery.phone_confirm.b(9), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_push_to_sms, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_push_button, new Serializable[0]), 66, null);
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c(str, new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), Collections.singleton(dVarD)), new b(interfaceC28373a), aVar, bVar, new C2813a(loginInfo), null, null, 192, null), false, null, 6, null);
    }

    @Y61.k
    public abstract a.InterfaceC3494a.d c(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo);

    @Y61.k
    public abstract a.InterfaceC3494a.d d(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo);
}
