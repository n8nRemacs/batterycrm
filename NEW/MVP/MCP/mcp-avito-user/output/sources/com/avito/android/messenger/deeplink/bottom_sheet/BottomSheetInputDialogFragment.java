package com.avito.android.messenger.deeplink.bottom_sheet;

import Cd.C13243a;
import VY.b;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.I5;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BottomSheetInputDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/BottomSheetInputDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BottomSheetInputDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f195452l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.deeplink.bottom_sheet.e f195453h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f195454i0;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public Input f195455j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public Button f195456k0;

    /* compiled from: BottomSheetInputDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/BottomSheetInputDialogFragment$a;", "", "<init>", "()V", "", "DEEPLINK_KEY", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetInputDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.messenger_bottom_sheet_input);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input = (Input) viewFindViewById;
            a aVar = BottomSheetInputDialogFragment.f195452l0;
            BottomSheetInputDialogFragment bottomSheetInputDialogFragment = BottomSheetInputDialogFragment.this;
            String string = bottomSheetInputDialogFragment.f5().f195312f;
            if (string == null) {
                string = input.getContext().getString(R.string.messenger_default_bottom_input_hint);
            }
            input.setHint(string);
            String str = bottomSheetInputDialogFragment.f5().f195313g;
            if (str == null) {
                str = "";
            }
            Input.t(input, str, false, 6);
            n.c(input, new com.avito.android.messenger.deeplink.bottom_sheet.b(bottomSheetInputDialogFragment));
            bottomSheetInputDialogFragment.f195455j0 = input;
            View viewFindViewById2 = view2.findViewById(R.id.messenger_bottom_sheet_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById2, bottomSheetInputDialogFragment.f5().f195311e, false);
            String string2 = bottomSheetInputDialogFragment.f5().f195314h;
            if (string2 == null) {
                string2 = bottomSheetInputDialogFragment.getString(R.string.messenger_default_bottom_input_action_text);
            }
            View viewFindViewById3 = view2.findViewById(R.id.messenger_bottom_sheet_action);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById3;
            button.setText(string2);
            button.setOnClickListener(new ViewOnClickListenerC31873b(bottomSheetInputDialogFragment, 7));
            bottomSheetInputDialogFragment.f195456k0 = button;
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetInputDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<VY.b, G0> {
        @Override // Y41.l
        public final G0 invoke(VY.b bVar) {
            VY.b bVar2 = bVar;
            BottomSheetInputDialogFragment bottomSheetInputDialogFragment = (BottomSheetInputDialogFragment) this.receiver;
            a aVar = BottomSheetInputDialogFragment.f195452l0;
            bottomSheetInputDialogFragment.getClass();
            if (bVar2 instanceof b.C1184b) {
                Dialog dialog = bottomSheetInputDialogFragment.getDialog();
                com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                if (dVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.d(cVar, dVar, ((b.C1184b) bVar2).f17190a, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
                }
            } else if (L.f(bVar2, b.a.f17189a)) {
                N0.a(bottomSheetInputDialogFragment.getDialog());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetInputDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<VY.c, G0> {
        @Override // Y41.l
        public final G0 invoke(VY.c cVar) {
            VY.c cVar2 = cVar;
            BottomSheetInputDialogFragment bottomSheetInputDialogFragment = (BottomSheetInputDialogFragment) this.receiver;
            Button button = bottomSheetInputDialogFragment.f195456k0;
            if (button != null) {
                button.setEnabled(cVar2.f17193b);
            }
            Button button2 = bottomSheetInputDialogFragment.f195456k0;
            boolean z12 = cVar2.f17194c;
            if (button2 != null) {
                button2.setLoading(z12);
            }
            Input input = bottomSheetInputDialogFragment.f195455j0;
            if (input != null) {
                input.setEnabled(!z12);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f195458l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f195458l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f195458l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomSheetInputDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f195460l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f195460l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f195460l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f195461l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f195461l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f195461l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f195462l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f195462l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f195462l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BottomSheetInputDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/messenger/deeplink/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.messenger.deeplink.bottom_sheet.d> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger.deeplink.bottom_sheet.d invoke() {
            com.avito.android.messenger.deeplink.bottom_sheet.e eVar = BottomSheetInputDialogFragment.this.f195453h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.messenger.deeplink.bottom_sheet.d) eVar.get();
        }
    }

    public BottomSheetInputDialogFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f195454i0 = new O0(m0.f406844a.b(com.avito.android.messenger.deeplink.bottom_sheet.d.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.messenger.deeplink.bottom_sheet.di.c.a().a((com.avito.android.messenger.deeplink.bottom_sheet.di.b) C29972i.a(C29972i.b(this), com.avito.android.messenger.deeplink.bottom_sheet.di.b.class), f5()).a(this);
    }

    public final ChannelBottomSheetInputLink f5() {
        return (ChannelBottomSheetInputLink) requireArguments().getParcelable("deeplink_key");
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.C(R.layout.messenger_fragment_bottom_sheet_input_dialog, new b());
        String string = f5().f195310d;
        if (string == null) {
            string = getString(R.string.messenger_default_bottom_input_title);
        }
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, string, true, true, 2);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.messenger.deeplink.bottom_sheet.d) this.f195454i0.getValue(), dVar, Lifecycle.State.f46682e, new c(1, this, BottomSheetInputDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputOneTimeEvent;)V", 0), new d(1, this, BottomSheetInputDialogFragment.class, "render", "render(Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputState;)V", 0));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}
