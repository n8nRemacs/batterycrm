package com.avito.android.safety.tfa_disable_password.mvi;

import Y41.p;
import com.avito.android.R;
import com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction;
import java.io.Serializable;
import ko0.InterfaceC42723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TfaDisablePasswordActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.tfa_disable_password.mvi.TfaDisablePasswordActor$confirmDisableTfa$1", f = "TfaDisablePasswordActor.kt", i = {0, 1}, l = {48, 49, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super TfaDisablePasswordInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258106q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258107r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.safety.tfa_disable_password.mvi.b f258108s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f258109t;

    /* compiled from: TfaDisablePasswordActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lko0/b;", "result", "", "invoke", "(Lko0/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.safety.tfa_disable_password.mvi.a$a, reason: collision with other inner class name */
    public static final class C7749a extends N implements Y41.l<InterfaceC42723b, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7749a f258110l = new C7749a();

        public C7749a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(InterfaceC42723b interfaceC42723b) {
            InterfaceC42723b interfaceC42723b2 = interfaceC42723b;
            if (interfaceC42723b2 instanceof InterfaceC42723b.a) {
                String password = ((InterfaceC42723b.a) interfaceC42723b2).getMessages().getPassword();
                return password != null ? new TfaDisablePasswordInternalAction.HighlightInput(com.avito.android.printable_text.b.f(password)) : new TfaDisablePasswordInternalAction.ShowError(com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]), null, 2, null);
            }
            if (interfaceC42723b2 instanceof InterfaceC42723b.C11627b) {
                return new TfaDisablePasswordInternalAction.Finish();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: TfaDisablePasswordActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<String, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f258111l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(String str) {
            return new TfaDisablePasswordInternalAction.ShowError(com.avito.android.printable_text.b.f(str), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.safety.tfa_disable_password.mvi.b bVar, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f258108s = bVar;
        this.f258109t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f258108s, this.f258109t, continuation);
        aVar.f258107r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TfaDisablePasswordInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f258106q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r10)
            goto L7a
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f258107r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L56
        L25:
            java.lang.Object r1 = r9.f258107r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L45
        L2d:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f258107r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction$ShowLoading r1 = new com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction$ShowLoading
            r1.<init>()
            r9.f258107r = r10
            r9.f258106q = r4
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r10
        L45:
            com.avito.android.safety.tfa_disable_password.mvi.b r10 = r9.f258108s
            com.avito.android.safety.safety_settings.domain.d r10 = r10.f258112a
            r9.f258107r = r1
            r9.f258106q = r3
            java.lang.String r3 = r9.f258109t
            java.lang.Object r10 = r10.a(r3, r9)
            if (r10 != r0) goto L56
            return r0
        L56:
            r3 = r10
            com.avito.android.remote.model.TypedResult r3 = (com.avito.android.remote.model.TypedResult) r3
            com.avito.android.safety.tfa_disable_password.mvi.a$a r4 = com.avito.android.safety.tfa_disable_password.mvi.a.C7749a.f258110l
            com.avito.android.safety.tfa_disable_password.mvi.a$b r5 = com.avito.android.safety.tfa_disable_password.mvi.a.b.f258111l
            r10 = 0
            java.io.Serializable[] r10 = new java.io.Serializable[r10]
            r6 = 2131952221(0x7f13025d, float:1.9540879E38)
            com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.c(r6, r10)
            r8 = 28
            r6 = 0
            java.lang.Object r10 = com.avito.android.error.z.r(r3, r4, r5, r6, r7, r8)
            r3 = 0
            r9.f258107r = r3
            r9.f258106q = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7a
            return r0
        L7a:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_disable_password.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
