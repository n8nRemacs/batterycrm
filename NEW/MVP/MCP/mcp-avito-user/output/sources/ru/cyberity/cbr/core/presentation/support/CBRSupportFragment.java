package ru.cyberity.cbr.core.presentation.support;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.verification.verification_input_inn.o;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.core.widget.CBRSupportItemView;
import ru.cyberity.log.a;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRSupportFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportFragment;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel;", "<init>", "()V", "", "getLayoutId", "()I", VoiceInfo.STATE, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "handleState", "(Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;Landroid/os/Bundle;)V", "viewModel$delegate", "Lkotlin/C;", "getViewModel", "()Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel;", "viewModel", "Lru/cyberity/cbr/core/analytics/Screen;", "screen", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "", "idDocSetType", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "tvTitle", "getTvSubtitle", "tvSubtitle", "Landroid/view/ViewGroup;", "getVgItems", "()Landroid/view/ViewGroup;", "vgItems", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRSupportFragment extends BaseFragment<CBRSupportViewModel.ViewState, CBRSupportViewModel> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(CBRSupportViewModel.class), new CBRSupportFragment$special$$inlined$viewModels$default$2(new CBRSupportFragment$special$$inlined$viewModels$default$1(this)), new CBRSupportFragment$viewModel$2(this));

    @k
    private final Screen screen = Screen.SupportScreen;

    @k
    private final String idDocSetType = "TYPE_UNKNOWN";

    /* compiled from: CBRSupportFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Landroidx/fragment/app/Fragment;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment newInstance() {
            return new CBRSupportFragment();
        }

        private Companion() {
        }
    }

    private final TextView getTvSubtitle() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R.id.cbr_subtitle);
        }
        return null;
    }

    private final TextView getTvTitle() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R.id.cbr_title);
        }
        return null;
    }

    private final ViewGroup getVgItems() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.cbr_list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleState$lambda-2$lambda-1, reason: not valid java name */
    public static final void m282handleState$lambda2$lambda1(CBRSupportViewModel.SupportItem supportItem, CBRSupportFragment cBRSupportFragment, View view) {
        if (ExtensionsKt.resolve(supportItem.getItem(), cBRSupportFragment.requireContext())) {
            return;
        }
        Logger.e$default(a.f436064a, "CBRSupportFragment", "The SDK is not possible to resolve a click on support item (" + supportItem + ')', null, 4, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_bottom_sheet_support;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return this.screen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public CBRSupportViewModel getViewModel() {
        return (CBRSupportViewModel) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleState(@k CBRSupportViewModel.ViewState state, @l Bundle savedInstanceState) {
        TextView tvTitle = getTvTitle();
        if (tvTitle != null) {
            s.a(tvTitle, state.getTitle());
        }
        TextView tvSubtitle = getTvSubtitle();
        if (tvSubtitle != null) {
            s.a(tvSubtitle, state.getSubtitle());
        }
        ViewGroup vgItems = getVgItems();
        if (vgItems != null) {
            vgItems.removeAllViews();
        }
        for (CBRSupportViewModel.SupportItem supportItem : state.getSupportItems()) {
            CBRSupportItemView cBRSupportItemView = new CBRSupportItemView(requireContext(), null, 0, 0, 14, null);
            CBRStepStateKt.setStepState(cBRSupportItemView, supportItem.getStepState());
            Drawable icon = supportItem.getIcon();
            if (icon == null) {
                String iconName = supportItem.getItem().getIconName();
                icon = iconName != null ? n0.f432787a.getIconHandler().onResolveIcon(requireContext(), iconName) : null;
            }
            cBRSupportItemView.setIconStart(icon);
            cBRSupportItemView.setTitle(supportItem.getTitle());
            cBRSupportItemView.setSubtitle(supportItem.getSubtitle());
            cBRSupportItemView.setOnClickListener(new o(28, supportItem, this));
            ViewGroup vgItems2 = getVgItems();
            if (vgItems2 != null) {
                vgItems2.addView(cBRSupportItemView);
            }
        }
    }
}
