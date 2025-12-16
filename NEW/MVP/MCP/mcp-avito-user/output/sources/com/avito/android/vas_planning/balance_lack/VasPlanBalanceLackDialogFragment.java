package com.avito.android.vas_planning.balance_lack;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: VasPlanBalanceLackDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/VasPlanBalanceLackDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasPlanBalanceLackDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f322199r0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public j f322200h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f322201i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f322202j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f322203k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322204l0;

    /* renamed from: m0, reason: collision with root package name */
    public TextView f322205m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewGroup f322206n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f322207o0;

    /* renamed from: p0, reason: collision with root package name */
    public Button f322208p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final Object f322209q0;

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_planning/balance_lack/VasPlanBalanceLackDialogFragment$a;", "", "<init>", "()V", "", "REQUEST_CODE_VAS_PLAN_BALANCE_LACK_CHANGE", "I", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((C43501a) obj).f413261b instanceof TopUpFormLink.b.a) {
                VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment = VasPlanBalanceLackDialogFragment.this;
                vasPlanBalanceLackDialogFragment.requireActivity().setResult(-1);
                vasPlanBalanceLackDialogFragment.requireActivity().finish();
            }
        }
    }

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        public final void f(@Y61.k View view) {
            VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment = (VasPlanBalanceLackDialogFragment) this.receiver;
            int i12 = VasPlanBalanceLackDialogFragment.f322199r0;
            vasPlanBalanceLackDialogFragment.getClass();
            vasPlanBalanceLackDialogFragment.f322205m0 = (TextView) view.findViewById(R.id.vas_plan_balance_lack_description);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vas_plan_balance_lack_loading_container);
            vasPlanBalanceLackDialogFragment.f322206n0 = viewGroup;
            com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.vas_plan_balance_lack_content, null, 0, 0, 28, null);
            lVar.f231600j = new com.avito.android.vas_planning.balance_lack.b(vasPlanBalanceLackDialogFragment);
            vasPlanBalanceLackDialogFragment.f322207o0 = lVar;
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment = (VasPlanBalanceLackDialogFragment) this.receiver;
            int i12 = VasPlanBalanceLackDialogFragment.f322199r0;
            vasPlanBalanceLackDialogFragment.getClass();
            Button button = (Button) view.findViewById(R.id.vas_plan_balance_lack_button);
            vasPlanBalanceLackDialogFragment.f322208p0 = button;
            button.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(vasPlanBalanceLackDialogFragment, 9));
            return G0.f406611a;
        }
    }

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f322211b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l lVar) {
            this.f322211b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f322211b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f322211b;
        }

        public final int hashCode() {
            return this.f322211b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322211b.invoke(obj);
        }
    }

    /* compiled from: VasPlanBalanceLackDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<String> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return VasPlanBalanceLackDialogFragment.this.getResources().getString(R.string.vas_planning_balance_lack_title);
        }
    }

    static {
        new a(null);
    }

    public VasPlanBalanceLackDialogFragment() {
        super(0, 1, null);
        this.f322204l0 = new io.reactivex.rxjava3.disposables.c();
        this.f322209q0 = C42727D.b(LazyThreadSafetyMode.f406616d, new f());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.l
    /* renamed from: f5, reason: merged with bridge method [inline-methods] */
    public final com.avito.android.lib.design.bottom_sheet.d getDialog() {
        Dialog dialog = super.getDialog();
        if (dialog instanceof com.avito.android.lib.design.bottom_sheet.d) {
            return (com.avito.android.lib.design.bottom_sheet.d) dialog;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = this.f322202j0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(i12, i13, intent);
        if (i12 == 1 && i13 == -1) {
            requireActivity().setResult(-1);
            requireActivity().finish();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.vas_planning.balance_lack.di.a.a().a(this, (com.avito.android.vas_planning.balance_lack.di.c) C29972i.a(C29972i.b(this), com.avito.android.vas_planning.balance_lack.di.c.class), cv.c.b(this)).a(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322203k0;
        if (aVar == null) {
            aVar = null;
        }
        this.f322204l0.b(aVar.d9().t0(new b()));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.deeplink_handler.view.d dVar = this.f322202j0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, (com.avito.android.deeplink_handler.view.impl.i) b5(), 28);
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar2.B(R.layout.fragment_vas_plan_balance_lack, R.layout.fragment_vas_plan_balance_lack_footer, new c(1, this, VasPlanBalanceLackDialogFragment.class, "setupViews", "setupViews(Landroid/view/View;)V", 0), new d(1, this, VasPlanBalanceLackDialogFragment.class, "setupFooterViews", "setupFooterViews(Landroid/view/View;)V", 0), true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar2, (String) this.f322209q0.getValue(), false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
        dVar2.S(C35835l0.g(dVar2.getContext()).y);
        j jVar = this.f322200h0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f322227O.observe(requireActivity(), new e(new com.avito.android.vas_planning.balance_lack.c(this)));
        j jVar2 = this.f322200h0;
        (jVar2 != null ? jVar2 : null).f322228P.observe(requireActivity(), new e(new com.avito.android.vas_planning.balance_lack.d(this)));
        return dVar2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f322204l0.e();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (requireActivity().isChangingConfigurations() || requireActivity().isFinishing()) {
            return;
        }
        requireActivity().setResult(0);
        requireActivity().finish();
    }
}
