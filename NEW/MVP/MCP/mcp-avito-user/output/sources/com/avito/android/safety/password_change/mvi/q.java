package com.avito.android.safety.password_change.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.account.G;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PasswordChangeInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/q;", "Lcom/avito/android/safety/password_change/mvi/p;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f257388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.common.a f257389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f257390c;

    /* compiled from: PasswordChangeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.password_change.mvi.PasswordChangeInteractorImpl$changePassword$1", f = "PasswordChangeInteractor.kt", i = {0, 1, 2}, l = {50, 51, 58, 76}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PasswordChangeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257391q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257392r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f257394t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f257395u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f257396v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f257397w;

        /* compiled from: PasswordChangeInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safety.password_change.mvi.q$a$a, reason: collision with other inner class name */
        public static final class C7724a extends N implements Y41.l<PasswordChangeResult, Object> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ q f257398l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7724a(q qVar) {
                super(1);
                this.f257398l = qVar;
            }

            @Override // Y41.l
            public final Object invoke(PasswordChangeResult passwordChangeResult) {
                return new PasswordChangeInternalAction.FinishContent(passwordChangeResult.getText(), this.f257398l.f257390c.a());
            }
        }

        /* compiled from: PasswordChangeInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends N implements Y41.l<String, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f257399l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(String str) {
                return new PasswordChangeInternalAction.ShowError(com.avito.android.printable_text.b.f(str), null, 2, null);
            }
        }

        /* compiled from: PasswordChangeInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "messages", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends N implements Y41.l<Map<String, ? extends String>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f257400l = new c();

            public c() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(Map<String, ? extends String> map) {
                Map<String, ? extends String> map2 = map;
                String str = map2.get("oldpass");
                PrintableText printableTextF = str != null ? com.avito.android.printable_text.b.f(str) : null;
                String str2 = map2.get("password");
                PrintableText printableTextF2 = str2 != null ? com.avito.android.printable_text.b.f(str2) : null;
                if (printableTextF != null || printableTextF2 != null) {
                    return new PasswordChangeInternalAction.HighlightInputs(printableTextF, printableTextF2);
                }
                String str3 = (String) C42745f0.F(map2.values());
                PrintableText printableTextF3 = str3 != null ? com.avito.android.printable_text.b.f(str3) : null;
                if (printableTextF3 == null) {
                    printableTextF3 = com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]);
                }
                return new PasswordChangeInternalAction.ShowError(printableTextF3, null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f257394t = str;
            this.f257395u = str2;
            this.f257396v = str3;
            this.f257397w = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = q.this.new a(this.f257394t, this.f257395u, this.f257396v, this.f257397w, continuation);
            aVar.f257392r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PasswordChangeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f257391q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.safety.password_change.mvi.q r6 = com.avito.android.safety.password_change.mvi.q.this
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L33
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                kotlin.C42729a0.b(r14)
                goto Laf
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f257392r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L87
            L2b:
                java.lang.Object r1 = r13.f257392r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L68
            L33:
                java.lang.Object r1 = r13.f257392r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L53
            L3b:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f257392r
                r1 = r14
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$ShowLoading r14 = new com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction$ShowLoading
                r14.<init>()
                r13.f257392r = r1
                r13.f257391q = r5
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto L53
                return r0
            L53:
                com.avito.android.account.G r14 = r6.f257390c
                com.jakewharton.rxrelay3.b r14 = r14.getF68056k()
                io.reactivex.rxjava3.internal.operators.observable.T r14 = r14.S()
                r13.f257392r = r1
                r13.f257391q = r4
                java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.b(r14, r13)
                if (r14 != r0) goto L68
                return r0
            L68:
                com.avito.android.remote.model.Session r14 = (com.avito.android.remote.model.Session) r14
                com.avito.android.remote.z0 r7 = r6.f257388a
                java.lang.String r10 = r14.getPhash()
                java.lang.String r8 = r13.f257394t
                java.lang.String r9 = r13.f257395u
                java.lang.String r11 = r13.f257396v
                java.lang.String r12 = r13.f257397w
                io.reactivex.rxjava3.core.I r14 = r7.q(r8, r9, r10, r11, r12)
                r13.f257392r = r1
                r13.f257391q = r3
                java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.b(r14, r13)
                if (r14 != r0) goto L87
                return r0
            L87:
                r7 = r14
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                com.avito.android.safety.password_change.mvi.q$a$a r8 = new com.avito.android.safety.password_change.mvi.q$a$a
                r8.<init>(r6)
                com.avito.android.safety.password_change.mvi.q$a$b r9 = com.avito.android.safety.password_change.mvi.q.a.b.f257399l
                com.avito.android.safety.password_change.mvi.q$a$c r10 = com.avito.android.safety.password_change.mvi.q.a.c.f257400l
                r14 = 0
                java.io.Serializable[] r14 = new java.io.Serializable[r14]
                r3 = 2131952221(0x7f13025d, float:1.9540879E38)
                com.avito.android.printable_text.PrintableText r11 = com.avito.android.printable_text.b.c(r3, r14)
                r12 = 24
                java.lang.Object r14 = com.avito.android.error.z.r(r7, r8, r9, r10, r11, r12)
                r3 = 0
                r13.f257392r = r3
                r13.f257391q = r2
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Laf
                return r0
            Laf:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.password_change.mvi.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public q(@Y61.k G g12, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k com.avito.android.safety.common.a aVar) {
        this.f257388a = interfaceC34401z0;
        this.f257389b = aVar;
        this.f257390c = g12;
    }

    @Override // com.avito.android.safety.password_change.mvi.p
    @Y61.k
    public final r a() {
        return new r(this.f257389b.invoke());
    }

    @Override // com.avito.android.safety.password_change.mvi.p
    @Y61.l
    public final PasswordChangeInternalAction b(@Y61.l String str) {
        G g12 = this.f257390c;
        if (!g12.b()) {
            return PasswordChangeInternalAction.NavigateToAuth.f257328b;
        }
        if (str == null || !str.equals(g12.a())) {
            return PasswordChangeInternalAction.Close.f257315b;
        }
        return null;
    }

    @Override // com.avito.android.safety.password_change.mvi.p
    @Y61.k
    public final InterfaceC43160i<PasswordChangeInternalAction> c(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        return C43175k.G(new a(str, str2, str3, str4, null));
    }
}
