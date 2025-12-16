package ru.cyberity.cbr.presentation.screen.intro;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.internal.R;

/* compiled from: CBRIntroScreenFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001fR\u0014\u0010#\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001f¨\u0006'"}, d2 = {"Lru/cyberity/cbr/presentation/screen/intro/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "Lru/cyberity/cbr/presentation/screen/intro/b;", "<init>", "()V", "", "getLayoutId", "()I", VoiceInfo.STATE, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "handleState", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Landroid/view/ViewGroup;", "a", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "()Landroid/view/ViewGroup;", "content", "b", "Lkotlin/C;", "f", "()Lru/cyberity/cbr/presentation/screen/intro/b;", "viewModel", "", "()Ljava/lang/String;", "countryCode", "g", "()Z", "isCancelOnBackPressed", "getIdDocSetType", "idDocSetType", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<CBRViewModel.CBRViewModelState, ru.cyberity.cbr.presentation.screen.intro.b> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView content = i0.a(this, R.id.cbr_container);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.intro.b.class), new c(new b(this)), new d());

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434713d = {m0.f406844a.i(new h0(a.class, "content", "getContent()Landroid/view/ViewGroup;", 0))};

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CBRIntroScreenFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/presentation/screen/intro/a$a;", "", "", "step", "scene", "documentType", "", "cancelOnBackPressed", "countryCode", "Lru/cyberity/cbr/presentation/screen/intro/a;", "a", "ARG_PARAM_CANCELONBACK", "Ljava/lang/String;", "ARG_PARAM_COUNTRY_CODE", "ARG_PARAM_DOCUMENT_TYPE", "ARG_PARAM_SCENE", "ARG_PARAM_STEP", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.intro.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @X41.n
        @k
        public final a a(@k String step, @k String scene, @l String documentType, boolean cancelOnBackPressed, @l String countryCode) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("sns_param_step", step);
            bundle.putString("sns_param_document_type", documentType);
            bundle.putString("sns_param_scene", scene);
            bundle.putString("sns_param_country_code", countryCode);
            bundle.putBoolean("sns_param_cancel_on_back", cancelOnBackPressed);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434716a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f434716a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434716a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f434717a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434717a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRIntroScreenFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.presentation.screen.intro.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    private final String b() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("sns_param_country_code")) == null) ? "" : string;
    }

    private final boolean g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("sns_param_cancel_on_back");
        }
        return false;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.intro.b getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.intro.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("sns_param_step") : null;
        return string == null ? "TYPE_UNKNOWN" : string;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_intro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleState(@Y61.k ru.cyberity.cbr.core.presentation.base.CBRViewModel.CBRViewModelState r8, @Y61.l android.os.Bundle r9) {
        /*
            r7 = this;
            boolean r9 = r8 instanceof ru.cyberity.cbr.presentation.screen.intro.b.C12515b
            if (r9 == 0) goto Lb5
            ru.cyberity.cbr.presentation.screen.intro.b$b r8 = (ru.cyberity.cbr.presentation.screen.intro.b.C12515b) r8
            java.util.Map r9 = r8.c()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L12
            goto Lb5
        L12:
            ru.cyberity.cbr.core.common.n0 r9 = ru.cyberity.cbr.core.common.n0.f432787a
            ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler r0 = r9.getInstructionsViewHandler()
            r9 = 0
            if (r0 == 0) goto L63
            android.content.Context r1 = r7.requireContext()
            ru.cyberity.cbr.core.presentation.intro.CBRStepInfo r2 = r8.getStepInfo()
            java.lang.String r2 = r2.getStep()
            ru.cyberity.cbr.core.presentation.intro.CBRStepInfo r3 = r8.getStepInfo()
            java.lang.String r3 = r3.getDocumentType()
            ru.cyberity.cbr.core.presentation.intro.CBRStepInfo r4 = r8.getStepInfo()
            java.lang.String r4 = r4.getScene()
            ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler$Position r5 = ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler.Position.FULLSCREEN
            java.lang.String r5 = r5.getValue()
            java.lang.String r6 = r7.b()
            android.view.View r0 = r0.onVerificationStep(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L63
            android.view.ViewGroup r1 = r7.a()
            if (r1 == 0) goto L50
            r1.removeAllViews()
        L50:
            android.view.ViewGroup r1 = r7.a()
            if (r1 == 0) goto L63
            android.view.ViewGroup$MarginLayoutParams r2 = new android.view.ViewGroup$MarginLayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.addView(r0, r2)
            kotlin.G0 r0 = kotlin.G0.f406611a
            goto L64
        L63:
            r0 = r9
        L64:
            if (r0 != 0) goto L87
            ru.cyberity.cbr.core.presentation.intro.InstructionsRender r0 = new ru.cyberity.cbr.core.presentation.intro.InstructionsRender
            ru.cyberity.cbr.core.b r1 = r7.getServiceLocator()
            ru.cyberity.cbr.core.data.source.extensions.a r1 = r1.getExtensionProvider()
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3, r9)
            android.view.View r1 = r7.getView()
            if (r1 != 0) goto L7c
            goto L87
        L7c:
            java.util.Map r2 = r8.c()
            int r3 = ru.cyberity.internal.R.id.cbr_container
            int r4 = ru.cyberity.internal.R.id.cbr_primary_button
            r0.renderInstructions(r1, r2, r3, r4)
        L87:
            android.view.View r0 = r7.getView()
            if (r0 == 0) goto Lb5
            int r1 = ru.cyberity.internal.R.id.cbr_primary_button
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto Lb5
            java.util.Map r8 = r8.c()
            java.lang.String r1 = "actionTitle"
            java.lang.Object r8 = r8.get(r1)
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto La8
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        La8:
            r0.setText(r9)
            e11.j1 r8 = new e11.j1
            r9 = 27
            r8.<init>(r7, r9)
            r0.setOnClickListener(r8)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.intro.a.handleState(ru.cyberity.cbr.core.presentation.base.CBRViewModel$CBRViewModelState, android.os.Bundle):void");
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (!(finishReason instanceof a0.c) || !g()) {
            return super.onFinishCalled(finishReason);
        }
        BaseFragment.finish$default(this, new a0.d(new CBRCompletionResult.SuccessTermination(null, 1, null)), null, null, 6, null);
        return false;
    }

    private final ViewGroup a() {
        return (ViewGroup) this.content.a(this, f434713d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        BaseFragment.setResult$default(aVar, 0, new Bundle(), 1, null);
    }
}
