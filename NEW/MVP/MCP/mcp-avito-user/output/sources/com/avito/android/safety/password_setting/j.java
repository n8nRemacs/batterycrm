package com.avito.android.safety.password_setting;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: PasswordSettingInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_setting/j;", "Lcom/avito/android/safety/password_setting/i;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.common.a f257456a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f257457b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f257458c;

    /* compiled from: PasswordSettingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.password_setting.PasswordSettingInteractorImpl$setPassword$1", f = "PasswordSettingInteractor.kt", i = {0, 1, 2}, l = {AvailableCode.HMS_IS_SPOOF, 30, 31, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PasswordSettingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257459q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f257460r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f257462t;

        /* compiled from: PasswordSettingInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safety.password_setting.j$a$a, reason: collision with other inner class name */
        public static final class C7729a extends N implements Y41.l<PasswordChangeResult, Object> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ j f257463l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7729a(j jVar) {
                super(1);
                this.f257463l = jVar;
            }

            @Override // Y41.l
            public final Object invoke(PasswordChangeResult passwordChangeResult) {
                return new PasswordSettingInternalAction.FinishContent(passwordChangeResult.getText(), this.f257463l.f257457b.a());
            }
        }

        /* compiled from: PasswordSettingInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends N implements Y41.l<String, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f257464l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(String str) {
                return new PasswordSettingInternalAction.ShowError(com.avito.android.printable_text.b.f(str), null, 2, null);
            }
        }

        /* compiled from: PasswordSettingInteractor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends N implements Y41.l<Map<String, ? extends String>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f257465l = new c();

            public c() {
                super(1);
            }

            @Override // Y41.l
            public final Object invoke(Map<String, ? extends String> map) {
                return new PasswordSettingInternalAction.HighlightInput(com.avito.android.printable_text.b.f((String) C42745f0.D(map.values())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f257462t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(this.f257462t, continuation);
            aVar.f257460r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PasswordSettingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a0 A[RETURN] */
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
                int r1 = r13.f257459q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.safety.password_setting.j r6 = com.avito.android.safety.password_setting.j.this
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L33
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                kotlin.C42729a0.b(r14)
                goto La1
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.f257460r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L79
            L2b:
                java.lang.Object r1 = r13.f257460r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L64
            L33:
                java.lang.Object r1 = r13.f257460r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L53
            L3b:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f257460r
                r1 = r14
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction$ShowLoading r14 = new com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction$ShowLoading
                r14.<init>()
                r13.f257460r = r1
                r13.f257459q = r5
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto L53
                return r0
            L53:
                com.avito.android.account.G r14 = r6.f257457b
                com.jakewharton.rxrelay3.b r14 = r14.getF68056k()
                r13.f257460r = r1
                r13.f257459q = r4
                java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.c(r14, r13)
                if (r14 != r0) goto L64
                return r0
            L64:
                com.avito.android.remote.model.Session r14 = (com.avito.android.remote.model.Session) r14
                com.avito.android.remote.z0 r4 = r6.f257458c
                java.lang.String r14 = r14.getPhash()
                r13.f257460r = r1
                r13.f257459q = r3
                java.lang.String r3 = r13.f257462t
                java.lang.Object r14 = r4.F(r3, r14, r13)
                if (r14 != r0) goto L79
                return r0
            L79:
                r7 = r14
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                com.avito.android.safety.password_setting.j$a$a r8 = new com.avito.android.safety.password_setting.j$a$a
                r8.<init>(r6)
                com.avito.android.safety.password_setting.j$a$b r9 = com.avito.android.safety.password_setting.j.a.b.f257464l
                com.avito.android.safety.password_setting.j$a$c r10 = com.avito.android.safety.password_setting.j.a.c.f257465l
                r14 = 0
                java.io.Serializable[] r14 = new java.io.Serializable[r14]
                r3 = 2131952221(0x7f13025d, float:1.9540879E38)
                com.avito.android.printable_text.PrintableText r11 = com.avito.android.printable_text.b.c(r3, r14)
                r12 = 24
                java.lang.Object r14 = com.avito.android.error.z.r(r7, r8, r9, r10, r11, r12)
                r3 = 0
                r13.f257460r = r3
                r13.f257459q = r2
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto La1
                return r0
            La1:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.password_setting.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public j(@Y61.k G g12, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k com.avito.android.safety.common.a aVar) {
        this.f257456a = aVar;
        this.f257457b = g12;
        this.f257458c = interfaceC34401z0;
    }

    @Override // com.avito.android.safety.password_setting.i
    @Y61.k
    public final k a() {
        return new k(this.f257456a.invoke());
    }

    @Override // com.avito.android.safety.password_setting.i
    @Y61.k
    public final InterfaceC43160i<PasswordSettingInternalAction> b(@Y61.k String str) {
        return C43175k.G(new a(str, null));
    }
}
