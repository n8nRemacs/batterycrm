package ru.cyberity.cbr.presentation.screen.error;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.Serializable;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.widget.CBRImageView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.presentation.screen.error.c;
import ru.cyberity.internal.R;

/* compiled from: CBRErrorFragment.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\n\u0010$J+\u0010*\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u001b\u00102\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u001d\u00107\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R\u001d\u0010;\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b9\u0010:R\u001d\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b=\u0010>R\u001d\u0010A\u001a\u0004\u0018\u00010<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\b@\u0010>R\u001d\u0010C\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b\n\u0010BR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010DR\u001a\u0010K\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/b;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/presentation/screen/error/c$b;", "Lru/cyberity/cbr/presentation/screen/error/c;", "<init>", "()V", "Lru/cyberity/cbr/core/data/model/p;", "error", VoiceInfo.STATE, "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/p;Lru/cyberity/cbr/presentation/screen/error/c$b;)V", "", "layout", "", "icon", "Lru/cyberity/cbr/core/widget/CBRStepState;", "iconState", "Lru/cyberity/cbr/core/analytics/Control;", "clickControl", "(ILjava/lang/String;Lru/cyberity/cbr/core/widget/CBRStepState;Lru/cyberity/cbr/core/analytics/Control;)V", "b", "()Lru/cyberity/cbr/core/data/model/p;", "getLayoutId", "()I", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "(Lru/cyberity/cbr/presentation/screen/error/c$b;Landroid/os/Bundle;)V", "reason", "", "payload", "", "delay", "finish", "(Lru/cyberity/cbr/core/common/a0;Ljava/lang/Object;Ljava/lang/Long;)V", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "onCancelResult", "()Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "Lkotlin/C;", "g", "()Lru/cyberity/cbr/presentation/screen/error/c;", "viewModel", "Landroid/view/ViewGroup;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "d", "()Landroid/view/ViewGroup;", "stub", "Lru/cyberity/cbr/core/widget/CBRImageView;", "c", "()Lru/cyberity/cbr/core/widget/CBRImageView;", "ivIcon", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "tvTitle", "e", "tvSubTitle", "()Landroid/view/View;", "btn", "Z", "callCancelledCallbackOnBackPress", "Lru/cyberity/cbr/core/analytics/Screen;", "h", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "i", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends BaseFragment<c.b, ru.cyberity.cbr.presentation.screen.error.c> {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434680j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.error.c.class), new e(new d(this)), new f());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView stub = i0.a(this, R.id.cbr_view_stub);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivIcon = i0.a(this, R.id.cbr_error_icon);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_error_title);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubTitle = i0.a(this, R.id.cbr_error_subtitle);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btn = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean callCancelledCallbackOnBackPress = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final Screen screen;

    /* compiled from: CBRErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/presentation/screen/error/b$a;", "", "Lru/cyberity/cbr/core/data/model/p;", "error", "", "idDocSetType", "Landroidx/fragment/app/Fragment;", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.error.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a(@k p error, @l String idDocSetType) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("arg_error", error);
            if (idDocSetType != null) {
                bundle.putString("arg_iddocsettype", idDocSetType);
            }
            bVar.setArguments(bundle);
            return bVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.error.b$b, reason: collision with other inner class name */
    public static final class C12510b extends N implements Y41.l<String, G0> {
        public C12510b() {
            super(1);
        }

        public final void a(@k String str) {
            b.this.getViewModel().onLinkClicked(str);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelInternalState;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.error.CBRErrorFragment$initUi$4", f = "CBRErrorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<CBRViewModel.CBRViewModelInternalState, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434690a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434691b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k CBRViewModel.CBRViewModelInternalState cBRViewModelInternalState, @l Continuation<? super G0> continuation) {
            return ((c) create(cBRViewModelInternalState, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.f434691b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434690a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            b.this.updateCommonUiState((CBRViewModel.CBRViewModelInternalState) this.f434691b);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f434693a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434693a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f434694a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434694a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRErrorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<P0.c> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            b bVar = b.this;
            return new ru.cyberity.cbr.presentation.screen.error.d(bVar, bVar.getServiceLocator(), b.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(b.class, "stub", "getStub()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f434680j = new n[]{n0Var.i(h0Var), C0.k(b.class, "ivIcon", "getIvIcon()Lru/cyberity/cbr/core/widget/CBRImageView;", 0, n0Var), C0.k(b.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "tvSubTitle", "getTvSubTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "btn", "getBtn()Landroid/view/View;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    public b() {
        p pVarB = b();
        this.screen = pVarB instanceof p.a ? Screen.OopsFatalScreen : pVarB instanceof p.b ? Screen.OopsNetworkScreen : Screen.Other;
    }

    private final p b() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("arg_error") : null;
        p pVar = serializable instanceof p ? (p) serializable : null;
        return pVar == null ? new p.a(null, null, 3, null) : pVar;
    }

    private final CBRImageView c() {
        return (CBRImageView) this.ivIcon.a(this, f434680j[1]);
    }

    private final ViewGroup d() {
        return (ViewGroup) this.stub.a(this, f434680j[0]);
    }

    private final TextView e() {
        return (TextView) this.tvSubTitle.a(this, f434680j[3]);
    }

    private final TextView f() {
        return (TextView) this.tvTitle.a(this, f434680j[2]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void finish(@k a0 reason, @l Object payload, @l Long delay) {
        this.callCancelledCallbackOnBackPress = false;
        super.finish(reason, payload, delay);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.error.c getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.error.c) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_iddocsettype") : null;
        return string == null ? "TYPE_UNKNOWN" : string;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_error;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public CBRCompletionResult onCancelResult() {
        return new CBRCompletionResult.AbnormalTermination(b().getException());
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        p pVarB = b();
        if (pVarB instanceof p.b) {
            if (this.callCancelledCallbackOnBackPress && finishReason.equals(a0.c.f432638a)) {
                g appListener = getAppListener();
                if (appListener != null) {
                    appListener.b(b());
                }
            } else {
                g appListener2 = getAppListener();
                if (appListener2 != null) {
                    appListener2.a(b());
                }
            }
        } else if ((pVarB instanceof p.a) && finishReason.equals(a0.c.f432638a)) {
            g appListener3 = getAppListener();
            if (appListener3 == null) {
                return false;
            }
            appListener3.a(b());
            return false;
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        String message;
        super.onViewCreated(view, savedInstanceState);
        ru.cyberity.cbr.core.analytics.c analyticsDelegate = getAnalyticsDelegate();
        Screen screen = getScreen();
        String idDocSetType = getIdDocSetType();
        Throwable exception = b().getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "unknown";
        }
        analyticsDelegate.d(screen, idDocSetType, Collections.singletonMap("error", message));
    }

    private final View a() {
        return this.btn.a(this, f434680j[4]);
    }

    private final void a(p error, c.b state) {
        ViewGroup viewGroupD = d();
        if ((viewGroupD != null ? viewGroupD.getChildCount() : 0) > 0 || L.f(state, c.b.a.f434700a)) {
            return;
        }
        if (L.f(state, c.b.C12512c.f434704a)) {
            a(R.layout.cbr_fragment_init_error, null, null, Control.CancelButton);
            return;
        }
        if (error instanceof p.b) {
            a(R.layout.cbr_fragment_network_error, CBRIconHandler.CBRResultIcons.WARNING.getImageName(), CBRStepState.PENDING, Control.RetryButton);
            return;
        }
        if (error instanceof p.a) {
            a(R.layout.cbr_fragment_common_error, CBRIconHandler.CBRResultIcons.FAILURE.getImageName(), CBRStepState.REJECTED, Control.GoBackButton);
            TextView textViewE = e();
            if (textViewE != null) {
                ExtensionsKt.handleUrlClicks(textViewE, new C12510b());
            }
        }
    }

    private final void a(int layout, String icon, CBRStepState iconState, Control clickControl) {
        CBRImageView cBRImageViewC;
        LayoutInflater.from(requireContext()).inflate(layout, d());
        if (iconState != null && (cBRImageViewC = c()) != null) {
            CBRStepStateKt.setStepState(cBRImageViewC, iconState);
        }
        if (icon != null) {
            Drawable drawableOnResolveIcon = ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), icon);
            CBRImageView cBRImageViewC2 = c();
            if (cBRImageViewC2 != null) {
                cBRImageViewC2.setImageDrawable(drawableOnResolveIcon);
            }
        }
        View viewA = a();
        if (viewA != null) {
            viewA.setOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(1, clickControl, this));
        }
        initCommonUI();
        j0.b(getViewModel().getViewModelInternalState(), getViewLifecycleOwner(), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Control control, b bVar, View view) {
        if (control != null) {
            ru.cyberity.cbr.core.analytics.c.b(bVar.getAnalyticsDelegate(), bVar.getScreen(), bVar.getIdDocSetType(), control, null, 8, null);
        }
        BaseFragment.finish$default(bVar, null, null, null, 7, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k c.b state, @l Bundle savedInstanceState) {
        a(b(), state);
        if (state instanceof c.b.C12511b) {
            TextView textViewF = f();
            if (textViewF != null) {
                textViewF.setText(((c.b.C12511b) state).getTitle());
            }
            TextView textViewE = e();
            if (textViewE != null) {
                textViewE.setText(((c.b.C12511b) state).getSubtitle());
            }
            View viewA = a();
            TextView textView = viewA instanceof TextView ? (TextView) viewA : null;
            if (textView == null) {
                return;
            }
            textView.setText(((c.b.C12511b) state).getButton());
        }
    }
}
