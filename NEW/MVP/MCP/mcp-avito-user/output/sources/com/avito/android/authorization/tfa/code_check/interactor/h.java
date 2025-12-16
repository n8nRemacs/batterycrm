package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.code_check_public.model.Phone;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaCodeCheckPhoneRequestInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/h;", "Lcom/avito/android/authorization/tfa/code_check/interactor/g;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f94672a;

    /* compiled from: TfaCodeCheckPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckPhoneRequestInteractorImpl$request$1", f = "TfaCodeCheckPhoneRequestInteractor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f94673q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f94674r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f94675s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h f94676t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94675s = str;
            this.f94676t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f94675s, this.f94676t, continuation);
            aVar.f94674r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f94673q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f94674r;
                String str = this.f94675s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for TfaCodeCheckPhoneRequestInteractorImpl");
                }
                this.f94674r = interfaceC43172j;
                this.f94673q = 1;
                obj = this.f94676t.d(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f94674r;
                C42729a0.b(obj);
            }
            this.f94674r = null;
            this.f94673q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.remote.r rVar) {
        this.f94672a = rVar;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    public final InterfaceC43160i<To.d> c(@Y61.l String str) {
        return C43175k.G(new a(str, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.authorization.tfa.code_check.interactor.i
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.authorization.tfa.code_check.interactor.i r0 = (com.avito.android.authorization.tfa.code_check.interactor.i) r0
            int r1 = r0.f94681u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94681u = r1
            goto L18
        L13:
            com.avito.android.authorization.tfa.code_check.interactor.i r0 = new com.avito.android.authorization.tfa.code_check.interactor.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f94679s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94681u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.authorization.tfa.code_check.interactor.h r5 = r0.f94678r
            java.lang.String r0 = r0.f94677q
            kotlin.C42729a0.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r0.f94677q = r5
            r0.f94678r = r4
            r0.f94681u = r3
            com.avito.android.remote.r r6 = r4.f94672a
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
            r5 = r4
        L49:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            com.avito.android.authorization.tfa.code_check.interactor.j r1 = new com.avito.android.authorization.tfa.code_check.interactor.j
            r1.<init>(r0)
            r5.getClass()
            To.d r5 = com.avito.android.code_check_public.screen.f.a(r6, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.tfa.code_check.interactor.h.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
