package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.code_check_public.model.Phone;
import com.squareup.anvil.annotations.ContributesBinding;
import io0.InterfaceC42082a;
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

/* compiled from: TfaEnableCodeCheckPhoneRequestInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/m;", "Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/l;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42082a f258177a;

    /* compiled from: TfaEnableCodeCheckPhoneRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckPhoneRequestInteractorImpl$request$1", f = "TfaEnableCodeCheckPhoneRequestInteractor.kt", i = {}, l = {30, 30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f258178q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f258179r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f258180s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f258181t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, m mVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f258180s = str;
            this.f258181t = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f258180s, this.f258181t, continuation);
            aVar.f258179r = obj;
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
            int i12 = this.f258178q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f258179r;
                String str = this.f258180s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for TfaEnableCodeCheckPhoneRequestInteractorImpl");
                }
                this.f258179r = interfaceC43172j;
                this.f258178q = 1;
                obj = this.f258181t.d(str, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f258179r;
                C42729a0.b(obj);
            }
            this.f258179r = null;
            this.f258178q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k InterfaceC42082a interfaceC42082a) {
        this.f258177a = interfaceC42082a;
    }

    @Override // com.avito.android.code_check_public.screen.d.b
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
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
            boolean r0 = r6 instanceof com.avito.android.safety.tfa_enable_confirm.code_check.interactor.n
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.n r0 = (com.avito.android.safety.tfa_enable_confirm.code_check.interactor.n) r0
            int r1 = r0.f258186u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f258186u = r1
            goto L18
        L13:
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.n r0 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f258184s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f258186u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.m r5 = r0.f258183r
            java.lang.String r0 = r0.f258182q
            kotlin.C42729a0.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r0.f258182q = r5
            r0.f258183r = r4
            r0.f258186u = r3
            io0.a r6 = r4.f258177a
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
            r5 = r4
        L49:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.o r1 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.o
            r1.<init>(r0)
            r5.getClass()
            To.d r5 = com.avito.android.code_check_public.screen.f.a(r6, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.m.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
