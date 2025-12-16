package ru.cyberity.cbr.presentation.screen.verification;

import Fc1.D3;
import Y61.k;
import Y61.l;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collections;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import pY0.C47034b;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRInstructionsViewHandler;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentListAdapter;
import ru.cyberity.cbr.core.presentation.intro.InstructionsRender;
import ru.cyberity.cbr.core.presentation.intro.IntroScene;
import ru.cyberity.cbr.presentation.screen.verification.b;
import ru.cyberity.cbr.presentation.screen.verification.d;
import ru.cyberity.internal.R;

/* compiled from: CBRApplicantStatusFragment.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\t\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0014X\u0094D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010*\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010,\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010)R\u001d\u0010-\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b&\u0010)R\u001d\u00100\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b\t\u0010/R\u001d\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b \u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/presentation/screen/verification/d;", "Lru/cyberity/cbr/presentation/screen/verification/b;", "<init>", "()V", "Lru/cyberity/cbr/presentation/screen/verification/e;", "exitDialog", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/presentation/screen/verification/e;)V", "", "getLayoutId", "()I", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "Landroid/os/Bundle;", "savedInstanceState", "(Lru/cyberity/cbr/presentation/screen/verification/d;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lkotlin/C;", "f", "()Lru/cyberity/cbr/presentation/screen/verification/b;", "viewModel", "", "b", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/TextView;", "c", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "e", "()Landroid/widget/TextView;", "tvTitle", "d", "tvSubtitle", "tvFooter", "Landroid/widget/Button;", "()Landroid/widget/Button;", "btnContinue", "Landroidx/recyclerview/widget/RecyclerView;", "g", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/appcompat/app/l;", "h", "Landroidx/appcompat/app/l;", "exitConfirmationDialog", "i", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<ru.cyberity.cbr.presentation.screen.verification.d, ru.cyberity.cbr.presentation.screen.verification.b> {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f435497j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.verification.b.class), new e(new d(this)), new f());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String idDocSetType = "TYPE_UNKNOWN";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvFooter = i0.a(this, R.id.cbr_footer);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnContinue = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView recycler = i0.a(this, R.id.cbr_list);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.appcompat.app.l exitConfirmationDialog;

    /* compiled from: CBRApplicantStatusFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/a$a;", "", "Landroidx/fragment/app/Fragment;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.verification.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a() {
            return new a();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRApplicantStatusFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        public final void a(@k String str) {
            a.this.getViewModel().a(str);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRApplicantStatusFragment.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ru/cyberity/cbr/presentation/screen/verification/a$c", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter$Callback;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Lkotlin/G0;", "onDocumentClicked", "(Lru/cyberity/cbr/core/data/model/Document;)V", "", ContextActionHandler.Link.URL, "onLinkClicked", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements CBRDocumentListAdapter.Callback {
        public c() {
        }

        @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentListAdapter.Callback
        public void onDocumentClicked(@l Document document) {
            if (document != null) {
                a.this.getViewModel().a(document);
            }
        }

        @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentListAdapter.Callback
        public void onLinkClicked(@l String url) {
            if (url != null) {
                a.this.getViewModel().onLinkClicked(url);
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f435508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f435508a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f435508a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f435509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f435509a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f435509a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRApplicantStatusFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<P0.c> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.presentation.screen.verification.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f435497j = new n[]{n0Var.i(h0Var), C0.k(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final RecyclerView b() {
        return (RecyclerView) this.recycler.a(this, f435497j[4]);
    }

    private final TextView c() {
        return (TextView) this.tvFooter.a(this, f435497j[2]);
    }

    private final TextView d() {
        return (TextView) this.tvSubtitle.a(this, f435497j[1]);
    }

    private final TextView e() {
        return (TextView) this.tvTitle.a(this, f435497j[0]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.verification.b getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.verification.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_applicant_status;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof b.C12539b) {
            BaseFragment.navigateTo$default(this, ru.cyberity.cbr.presentation.dialogs.bottomsheet.a.INSTANCE.a(((b.C12539b) event).getText()), null, 2, null);
        } else {
            super.handleEvent(event);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (!(finishReason instanceof a0.c)) {
            return super.onFinishCalled(finishReason);
        }
        androidx.appcompat.app.l lVar = this.exitConfirmationDialog;
        if (lVar != null) {
            lVar.show();
        } else {
            BaseFragment.finish$default(this, new a0.d(null, 1, 0 == true ? 1 : 0), null, null, 6, null);
        }
        return false;
    }

    private final Button a() {
        return (Button) this.btnContinue.a(this, f435497j[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        ru.cyberity.cbr.core.common.g appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ru.cyberity.cbr.presentation.screen.verification.d$e] */
    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k ru.cyberity.cbr.presentation.screen.verification.d state, @l Bundle savedInstanceState) throws Resources.NotFoundException {
        Button button;
        TextView textViewE = e();
        final int i12 = 1;
        boolean z12 = false;
        boolean z13 = false;
        if (textViewE != null) {
            CharSequence charSequenceE = state.getTitle();
            s.a(textViewE, charSequenceE == null || charSequenceE.length() == 0);
            CharSequence charSequenceE2 = state.getTitle();
            textViewE.setText(charSequenceE2 != null ? s.a(charSequenceE2, textViewE.getContext()) : null);
        }
        TextView textViewD = d();
        if (textViewD != null) {
            CharSequence charSequenceD = state.getSubtitle();
            s.a(textViewD, charSequenceD == null || charSequenceD.length() == 0);
            CharSequence charSequenceD2 = state.getSubtitle();
            textViewD.setText(charSequenceD2 != null ? s.a(charSequenceD2, textViewD.getContext()) : null);
        }
        TextView textViewC = c();
        if (textViewC != null) {
            CharSequence charSequenceC = state.getFooter();
            s.a(textViewC, charSequenceC == null || charSequenceC.length() == 0);
            CharSequence charSequenceC2 = state.getFooter();
            textViewC.setText(charSequenceC2 != null ? s.a(charSequenceC2, textViewC.getContext()) : null);
            ExtensionsKt.handleUrlClicks(textViewC, new b());
        }
        Button buttonA = a();
        if (buttonA != null) {
            CharSequence charSequenceA = state.getButtonText();
            s.a(buttonA, charSequenceA == null || charSequenceA.length() == 0);
            buttonA.setText(state.getButtonText());
        }
        RecyclerView recyclerViewB = b();
        if (recyclerViewB != null) {
            s.a(recyclerViewB, state.b().isEmpty());
            if (!state.b().isEmpty()) {
                if (recyclerViewB.getAdapter() == null) {
                    recyclerViewB.getContext();
                    recyclerViewB.setLayoutManager(new LinearLayoutManager());
                    recyclerViewB.setAdapter(new CBRDocumentListAdapter(new c()));
                }
                RecyclerView.Adapter adapter = recyclerViewB.getAdapter();
                if (adapter != null) {
                    ((CBRDocumentListAdapter) adapter).setResources(state.b());
                    ViewGroup.LayoutParams layoutParams = recyclerViewB.getLayoutParams();
                    ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                    if (state instanceof d.c) {
                        if (bVar != null) {
                            ((ViewGroup.MarginLayoutParams) bVar).height = -2;
                        }
                    } else if (bVar != null) {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        this.exitConfirmationDialog = null;
        if (state instanceof d.e) {
            if (getView() != null) {
                View view = getView();
                View viewFindViewById = view != null ? view.findViewById(R.id.cbr_content) : null;
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                CBRInstructionsViewHandler instructionsViewHandler = ru.cyberity.cbr.core.common.n0.f432787a.getInstructionsViewHandler();
                View viewOnVerificationStep = instructionsViewHandler != null ? instructionsViewHandler.onVerificationStep(requireContext(), "VIDEO_IDENT", null, IntroScene.VIDEO_IDENT.getSceneName(), CBRInstructionsViewHandler.Position.FULLSCREEN.getValue(), null) : null;
                if (viewOnVerificationStep != null) {
                    View view2 = getView();
                    View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.cbr_content) : null;
                    ViewGroup viewGroup = viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : null;
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
                        marginLayoutParams.setMarginStart(dimensionPixelSize);
                        marginLayoutParams.setMarginEnd(dimensionPixelSize);
                        G0 g02 = G0.f406611a;
                        viewGroup.addView(viewOnVerificationStep, marginLayoutParams);
                    }
                    View view3 = getView();
                    if (view3 != null && (button = (Button) view3.findViewById(R.id.cbr_primary_button)) != null) {
                        Object obj = ((d.e) state).f().get("actionTitle");
                        button.setText(obj instanceof String ? (String) obj : null);
                    }
                } else {
                    new InstructionsRender(getServiceLocator().getExtensionProvider(), z12, 2, FindViewById).renderInstructions(requireView(), ((d.e) state).f(), R.id.cbr_content, R.id.cbr_primary_button);
                }
            }
            Button buttonA2 = a();
            if (buttonA2 != null) {
                final boolean z14 = z13 ? 1 : 0;
                buttonA2.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.verification.f

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ a f435602c;

                    {
                        this.f435602c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (z14) {
                            case 0:
                                a.b(this.f435602c, view4);
                                break;
                            default:
                                a.a(this.f435602c, view4);
                                break;
                        }
                    }
                });
            }
            d.e eVar = (d.e) state;
            if (eVar.getExitConfirmation() != null) {
                a(eVar.getExitConfirmation());
                return;
            }
            return;
        }
        View view4 = getView();
        FindViewById = view4 != null ? view4.findViewById(R.id.cbr_content) : 0;
        if (FindViewById != 0) {
            FindViewById.setVisibility(8);
        }
        Button buttonA3 = a();
        if (buttonA3 != null) {
            buttonA3.setOnClickListener(new View.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.verification.f

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f435602c;

                {
                    this.f435602c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view42) {
                    switch (i12) {
                        case 0:
                            a.b(this.f435602c, view42);
                            break;
                        default:
                            a.a(this.f435602c, view42);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, Map map, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        aVar.getAnalyticsDelegate().b(Screen.VerificationExitPopup, aVar.getIdDocSetType(), Control.CancelButton, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, Map map, DialogInterface dialogInterface) {
        aVar.getAnalyticsDelegate().d(Screen.VerificationExitPopup, aVar.getIdDocSetType(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreen(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        aVar.getViewModel().b();
    }

    private final void a(ru.cyberity.cbr.presentation.screen.verification.e exitDialog) {
        final Map mapSingletonMap = Collections.singletonMap("fromScreen", Screen.StatusScreen.getText());
        final int i12 = 0;
        final int i13 = 1;
        androidx.appcompat.app.l lVarCreate = new C47034b(requireContext()).setMessage(exitDialog.getMessage()).setPositiveButton(exitDialog.getButtonPositive(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.verification.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f435604c;

            {
                this.f435604c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                switch (i12) {
                    case 0:
                        a.a(this.f435604c, mapSingletonMap, dialogInterface, i14);
                        break;
                    default:
                        a.b(this.f435604c, mapSingletonMap, dialogInterface, i14);
                        break;
                }
            }
        }).setNegativeButton(exitDialog.getButtonNegative(), new DialogInterface.OnClickListener(this) { // from class: ru.cyberity.cbr.presentation.screen.verification.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f435604c;

            {
                this.f435604c = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                switch (i13) {
                    case 0:
                        a.a(this.f435604c, mapSingletonMap, dialogInterface, i14);
                        break;
                    default:
                        a.b(this.f435604c, mapSingletonMap, dialogInterface, i14);
                        break;
                }
            }
        }).setOnCancelListener((DialogInterface.OnCancelListener) new D3(this, 20)).setOnDismissListener((DialogInterface.OnDismissListener) new com.avito.android.advert.item.properties.g(10, this, mapSingletonMap)).create();
        lVarCreate.setOnShowListener(new Da1.b(4, this, mapSingletonMap));
        this.exitConfirmationDialog = lVarCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Map map, DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
        aVar.getAnalyticsDelegate().b(Screen.VerificationExitPopup, aVar.getIdDocSetType(), Control.ConfirmButton, map);
        ru.cyberity.cbr.core.common.g appListener = aVar.getAppListener();
        if (appListener != null) {
            appListener.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, DialogInterface dialogInterface) {
        androidx.appcompat.app.l lVar = aVar.exitConfirmationDialog;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Map map, DialogInterface dialogInterface) {
        aVar.getAnalyticsDelegate().c(Screen.VerificationExitPopup, aVar.getIdDocSetType(), map);
    }
}
