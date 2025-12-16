package com.avito.android.code_check.code_confirm;

import Cd.C13243a;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.CodeCheckAbstractFragment;
import com.avito.android.code_check.code_confirm.E;
import com.avito.android.code_check.g;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35966w1;
import com.avito.android.util.S3;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: CodeConfirmFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check/code_confirm/CodeConfirmFragment;", "Lcom/avito/android/code_check/CodeCheckAbstractFragment;", "<init>", "()V", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CodeConfirmFragment extends CodeCheckAbstractFragment {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f118629G0;

    /* renamed from: H0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f118630H0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118631A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118632B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118633C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118634D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118635E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final O0 f118636F0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public dagger.internal.u f118637s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check_public.screen.c f118638t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check.d f118639u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C29386d f118640v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f118641w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.code_check.otp.a f118642x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118643y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f118644z0;

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/code_check/code_confirm/CodeConfirmFragment$a;", "", "<init>", "()V", "", "ARGS_SCREEN_NAME", "Ljava/lang/String;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CodeConfirmFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.code_check.code_confirm.CodeConfirmFragment$a$a, reason: collision with other inner class name */
        public static final class C3452a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f118645l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3452a(String str) {
                super(1);
                this.f118645l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("code_check.code_confirm.screen_name", this.f118645l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static CodeConfirmFragment a(@Y61.k String str) {
            CodeConfirmFragment codeConfirmFragment = new CodeConfirmFragment();
            C35966w1.a(codeConfirmFragment, -1, new C3452a(str));
            return codeConfirmFragment;
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f118646l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f118646l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f118646l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CodeConfirmFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f118648l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f118648l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f118648l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118649l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118649l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f118649l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f118650l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f118650l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f118650l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/A;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/code_check/code_confirm/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<A> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final A invoke() {
            dagger.internal.u uVar = CodeConfirmFragment.this.f118637s0;
            if (uVar == null) {
                uVar = null;
            }
            return (A) uVar.get();
        }
    }

    static {
        Y y12 = new Y(CodeConfirmFragment.class, "codeInput", "getCodeInput()Lcom/avito/android/lib/design/input/Input;", 0);
        n0 n0Var = m0.f406844a;
        f118630H0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "codeInputContainer", "getCodeInputContainer()Lcom/avito/android/lib/design/component_container/ComponentContainer;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "requestButton", "getRequestButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "confirmButton", "getConfirmButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(CodeConfirmFragment.class, "legal", "getLegal()Landroid/widget/TextView;", 0, n0Var)};
        f118629G0 = new a(null);
    }

    public CodeConfirmFragment() {
        super(R.layout.code_confirm_fragment, R.id.code_confirm_scroll, R.id.code_confirm_nav_bar);
        this.f118643y0 = new C47313c(null, 1, null);
        this.f118644z0 = new C47313c(null, 1, null);
        this.f118631A0 = new C47313c(null, 1, null);
        this.f118632B0 = new C47313c(null, 1, null);
        this.f118633C0 = new C47313c(null, 1, null);
        this.f118634D0 = new C47313c(null, 1, null);
        this.f118635E0 = new C47313c(null, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f118636F0 = new O0(m0.f406844a.b(A.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x5(com.avito.android.code_check.code_confirm.CodeConfirmFragment r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.avito.android.code_check.code_confirm.o
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.code_check.code_confirm.o r0 = (com.avito.android.code_check.code_confirm.o) r0
            int r1 = r0.f118777s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f118777s = r1
            goto L1b
        L16:
            com.avito.android.code_check.code_confirm.o r0 = new com.avito.android.code_check.code_confirm.o
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f118775q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f118777s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.C42729a0.b(r6)
            goto L5d
        L34:
            kotlin.C42729a0.b(r6)
            com.avito.android.code_check.d r6 = r5.f118639u0
            if (r6 == 0) goto L3c
            goto L3d
        L3c:
            r6 = 0
        L3d:
            com.avito.android.code_check.g$a r6 = r6.G3()
            com.avito.android.code_check.g r2 = com.avito.android.code_check.g.this
            java.lang.String r4 = r6.f118832b
            java.io.Serializable r6 = r6.f118831a
            java.io.Serializable r6 = (java.io.Serializable) r6
            androidx.lifecycle.r0 r2 = r2.f118826E
            kotlinx.coroutines.flow.n2 r6 = r2.c(r4, r6)
            com.avito.android.code_check.code_confirm.p r2 = new com.avito.android.code_check.code_confirm.p
            r2.<init>(r5)
            r0.f118777s = r3
            java.lang.Object r5 = r6.collect(r2, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.CodeConfirmFragment.x5(com.avito.android.code_check.code_confirm.CodeConfirmFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Button A5() {
        C47313c c47313c = this.f118631A0;
        kotlin.reflect.n<Object> nVar = f118630H0[2];
        return (Button) c47313c.a();
    }

    public final TextView B5() {
        C47313c c47313c = this.f118634D0;
        kotlin.reflect.n<Object> nVar = f118630H0[5];
        return (TextView) c47313c.a();
    }

    public final void C5(String str) {
        com.avito.android.code_check_public.c cVar;
        com.avito.android.code_check_public.screen.c cVar2 = this.f118638t0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        c.d dVar = cVar2.f119336d.f119343c;
        if (dVar != null) {
            if (dVar instanceof c.d.a) {
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for CodeConfirm.Subtitle.Formatter");
                }
                B5().getContext();
                cVar = ((c.d.a) dVar).f119354a.a();
            } else if (dVar instanceof c.d.b) {
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for CodeConfirm.Subtitle.TextWithPhone");
                }
                C29386d c29386d = this.f118640v0;
                C29386d c29386d2 = c29386d != null ? c29386d : null;
                Context context = B5().getContext();
                c29386d2.getClass();
                cVar = new androidx.camera.camera2.internal.compat.workaround.v(((c.d.b) dVar).f119356a, context, c29386d2, str, 2);
            } else {
                if (!(dVar instanceof c.d.C3506c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(dVar, 4);
            }
            AttributedText attributedText = (AttributedText) cVar.k0(B5().getContext());
            com.avito.android.util.text.j.c(B5(), attributedText, null);
            attributedText.setOnDeepLinkClickListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        new E.c();
        E.b bVar = new E.b(new r(), (InterfaceC29384b) C29972i.a(C29972i.b(this), InterfaceC29384b.class), com.avito.android.analytics.screens.s.c(this), requireContext(), this, requireArguments().getString("code_check.code_confirm.screen_name"), null);
        this.f118637s0 = bVar.f118676x;
        this.f118638t0 = bVar.f118656d.get();
        com.avito.android.code_check.d dVarVj = bVar.f118653a.Vj();
        dagger.internal.t.c(dVarVj);
        this.f118639u0 = dVarVj;
        this.f118640v0 = new C29386d(S3.a());
        this.f118641w0 = bVar.f118662j.get();
        this.f118642x0 = bVar.f118671s.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f118641w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle == null) {
            com.avito.android.code_check_public.screen.c cVar = this.f118638t0;
            if (cVar == null) {
                cVar = null;
            }
            Y41.l<Phone, G0> lVar = cVar.f119335c;
            if (lVar != null) {
                com.avito.android.code_check.d dVar = this.f118639u0;
                if (dVar == null) {
                    dVar = null;
                }
                String strA = dVar.G3().a();
                String strA2 = strA != null ? To.c.a(strA) : null;
                lVar.invoke(strA2 != null ? Phone.a(strA2) : null);
            }
        }
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final com.avito.android.code_check_public.screen.h q5() {
        com.avito.android.code_check_public.screen.c cVar = this.f118638t0;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    @Y61.k
    public final ScreenPerformanceTracker r5() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f118641w0;
        if (screenPerformanceTracker != null) {
            return screenPerformanceTracker;
        }
        return null;
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void s5() {
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.code_check.code_confirm.g(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f118641w0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, (A) this.f118636F0.getValue(), new h(1, this, CodeConfirmFragment.class, "handleEvent", "handleEvent(Ljava/lang/Object;)V", 0), new i(1, this, CodeConfirmFragment.class, "renderState", "renderState(Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmViewState;)V", 0));
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void t5() {
        com.avito.android.util.concurrent.b.f318855a.post(new Oa1.B(4, new m(this)));
    }

    @Override // com.avito.android.code_check.CodeCheckAbstractFragment
    public final void u5(@Y61.k View view) {
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.code_confirm_input_cc);
        C47313c c47313c = this.f118644z0;
        kotlin.reflect.n<Object>[] nVarArr = f118630H0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, componentContainer);
        Input input = (Input) view.findViewById(R.id.code_confirm_input);
        com.avito.android.code_check_public.screen.c cVar = this.f118638t0;
        if (cVar == null) {
            cVar = null;
        }
        com.avito.android.code_check.u.a(input, cVar.f119336d.f119345e);
        input.setAutofillHints((String[]) Arrays.copyOf(new String[]{"smsOTPCode"}, 1));
        com.avito.android.code_check_public.screen.c cVar2 = this.f118638t0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        input.setHint(cVar2.f119336d.f119344d.k0(input.getContext()));
        com.avito.android.code_check.d dVar = this.f118639u0;
        if (dVar == null) {
            dVar = null;
        }
        g.a<Integer> aVarG5 = dVar.G5();
        C43175k.K(new C43197r1(new n(input, null), com.avito.android.code_check.g.this.f118826E.c(aVarG5.f118832b, aVarG5.f118831a)), C22984Q.a(getViewLifecycleOwner()));
        C47313c c47313c2 = this.f118643y0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, input);
        Button button = (Button) view.findViewById(R.id.code_confirm_send_button);
        com.avito.android.code_check_public.screen.c cVar3 = this.f118638t0;
        if (cVar3 == null) {
            cVar3 = null;
        }
        button.setText(cVar3.f119336d.f119348h.k0(button.getContext()));
        C47313c c47313c3 = this.f118632B0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, button);
        Button button2 = (Button) view.findViewById(R.id.code_confirm_request_button);
        com.avito.android.code_check_public.screen.c cVar4 = this.f118638t0;
        if (cVar4 == null) {
            cVar4 = null;
        }
        button2.setText(cVar4.f119336d.f119346f.k0(button2.getContext()));
        C47313c c47313c4 = this.f118631A0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, button2);
        TextView textView = (TextView) view.findViewById(R.id.code_confirm_title);
        com.avito.android.code_check_public.screen.c cVar5 = this.f118638t0;
        if (cVar5 == null) {
            cVar5 = null;
        }
        textView.setText(cVar5.f119336d.f119341a.k0(textView.getContext()));
        C47313c c47313c5 = this.f118633C0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, textView);
        com.avito.android.code_check_public.screen.c cVar6 = this.f118638t0;
        if (cVar6 == null) {
            cVar6 = null;
        }
        TextView textViewB = com.avito.android.code_check.u.b(this, view, R.id.code_confirm_legal, cVar6.f119336d.f119342b);
        C47313c c47313c6 = this.f118635E0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[6];
        c47313c6.b(this, textViewB);
        com.avito.android.code_check_public.screen.c cVar7 = this.f118638t0;
        if (cVar7 == null) {
            cVar7 = null;
        }
        c.d dVar2 = cVar7.f119336d.f119343c;
        TextView textView2 = (TextView) view.findViewById(R.id.code_confirm_subtitle);
        textView2.setVisibility(dVar2 == null ? 8 : 0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        com.avito.android.code_check.u.a(textView2, dVar2 != null ? dVar2.a() : null);
        C47313c c47313c7 = this.f118634D0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c7.b(this, textView2);
        com.avito.android.code_check.d dVar3 = this.f118639u0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        String strA = dVar3.G3().a();
        C5(strA != null ? To.c.a(strA) : null);
    }

    public final Input y5() {
        C47313c c47313c = this.f118643y0;
        kotlin.reflect.n<Object> nVar = f118630H0[0];
        return (Input) c47313c.a();
    }

    public final Button z5() {
        C47313c c47313c = this.f118632B0;
        kotlin.reflect.n<Object> nVar = f118630H0[3];
        return (Button) c47313c.a();
    }
}
