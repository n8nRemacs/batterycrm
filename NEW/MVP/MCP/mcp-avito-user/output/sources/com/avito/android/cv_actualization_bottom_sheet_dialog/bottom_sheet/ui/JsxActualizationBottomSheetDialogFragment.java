package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetDialogFragment;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import yt.AbstractC50297a;
import z1.AbstractC50339a;
import zt.C50626a;

/* compiled from: JsxActualizationBottomSheetDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxActualizationBottomSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public zt.b f131532h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f131533i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final O0 f131534j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final C35968w3 f131535k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f131536l0;

    /* renamed from: m0, reason: collision with root package name */
    public Button f131537m0;

    /* renamed from: n0, reason: collision with root package name */
    public Button f131538n0;

    /* renamed from: o0, reason: collision with root package name */
    public TextView f131539o0;

    /* renamed from: p0, reason: collision with root package name */
    public TextView f131540p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f131531r0 = {m0.f406844a.e(new Y(JsxActualizationBottomSheetDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetOpenParams;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f131530q0 = new a(null);

    /* compiled from: JsxActualizationBottomSheetDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/ui/JsxActualizationBottomSheetDialogFragment$a;", "", "<init>", "()V", "", "CV_ACTUALIZATION_BOTTOM_SHEET_REQUEST_KEY", "Ljava/lang/String;", "CV_ACTUALIZATION_BOTTOM_SHEET_RESULT_KEY", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JsxActualizationBottomSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final JsxActualizationBottomSheetDialogFragment jsxActualizationBottomSheetDialogFragment = (JsxActualizationBottomSheetDialogFragment) this.receiver;
            a aVar = JsxActualizationBottomSheetDialogFragment.f131530q0;
            jsxActualizationBottomSheetDialogFragment.getClass();
            jsxActualizationBottomSheetDialogFragment.f131539o0 = (TextView) view2.findViewById(R.id.title);
            jsxActualizationBottomSheetDialogFragment.f131540p0 = (TextView) view2.findViewById(R.id.description);
            jsxActualizationBottomSheetDialogFragment.f131537m0 = (Button) view2.findViewById(R.id.primary_action_btn);
            jsxActualizationBottomSheetDialogFragment.f131538n0 = (Button) view2.findViewById(R.id.secondary_action_btn);
            TextView textView = jsxActualizationBottomSheetDialogFragment.f131539o0;
            if (textView == null) {
                textView = null;
            }
            String string = jsxActualizationBottomSheetDialogFragment.f5().f131549d;
            if (string == null) {
                string = jsxActualizationBottomSheetDialogFragment.getString(R.string.jsx_cv_actualization_bottom_sheet_title, jsxActualizationBottomSheetDialogFragment.f5().f131547b);
            }
            textView.setText(string);
            TextView textView2 = jsxActualizationBottomSheetDialogFragment.f131540p0;
            if (textView2 == null) {
                textView2 = null;
            }
            String string2 = jsxActualizationBottomSheetDialogFragment.f5().f131550e;
            if (string2 == null) {
                string2 = jsxActualizationBottomSheetDialogFragment.getString(R.string.jsx_cv_actualization_bottom_sheet_description);
            }
            textView2.setText(string2);
            Button button = jsxActualizationBottomSheetDialogFragment.f131537m0;
            if (button == null) {
                button = null;
            }
            String string3 = jsxActualizationBottomSheetDialogFragment.f5().f131551f;
            if (string3 == null) {
                string3 = jsxActualizationBottomSheetDialogFragment.getString(R.string.jsx_cv_actualization_bottom_primary_action_btn);
            }
            button.setText(string3);
            Button button2 = jsxActualizationBottomSheetDialogFragment.f131538n0;
            if (button2 == null) {
                button2 = null;
            }
            String string4 = jsxActualizationBottomSheetDialogFragment.f5().f131552g;
            if (string4 == null) {
                string4 = jsxActualizationBottomSheetDialogFragment.getString(R.string.jsx_cv_actualization_bottom_secondary_action_btn);
            }
            button2.setText(string4);
            Button button3 = jsxActualizationBottomSheetDialogFragment.f131537m0;
            if (button3 == null) {
                button3 = null;
            }
            final int i12 = 0;
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    JsxActualizationBottomSheetDialogFragment jsxActualizationBottomSheetDialogFragment2 = jsxActualizationBottomSheetDialogFragment;
                    switch (i12) {
                        case 0:
                            JsxActualizationBottomSheetDialogFragment.a aVar2 = JsxActualizationBottomSheetDialogFragment.f131530q0;
                            ((C50626a) jsxActualizationBottomSheetDialogFragment2.f131534j0.getValue()).accept(AbstractC50297a.C12926a.f443555a);
                            break;
                        default:
                            JsxActualizationBottomSheetDialogFragment.a aVar3 = JsxActualizationBottomSheetDialogFragment.f131530q0;
                            ((C50626a) jsxActualizationBottomSheetDialogFragment2.f131534j0.getValue()).accept(AbstractC50297a.b.f443556a);
                            break;
                    }
                }
            });
            Button button4 = jsxActualizationBottomSheetDialogFragment.f131538n0;
            if (button4 == null) {
                button4 = null;
            }
            final int i13 = 1;
            button4.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    JsxActualizationBottomSheetDialogFragment jsxActualizationBottomSheetDialogFragment2 = jsxActualizationBottomSheetDialogFragment;
                    switch (i13) {
                        case 0:
                            JsxActualizationBottomSheetDialogFragment.a aVar2 = JsxActualizationBottomSheetDialogFragment.f131530q0;
                            ((C50626a) jsxActualizationBottomSheetDialogFragment2.f131534j0.getValue()).accept(AbstractC50297a.C12926a.f443555a);
                            break;
                        default:
                            JsxActualizationBottomSheetDialogFragment.a aVar3 = JsxActualizationBottomSheetDialogFragment.f131530q0;
                            ((C50626a) jsxActualizationBottomSheetDialogFragment2.f131534j0.getValue()).accept(AbstractC50297a.b.f443556a);
                            break;
                    }
                }
            });
            ScreenPerformanceTracker screenPerformanceTracker = jsxActualizationBottomSheetDialogFragment.f131533i0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.b(jsxActualizationBottomSheetDialogFragment, screenPerformanceTracker, (C50626a) jsxActualizationBottomSheetDialogFragment.f131534j0.getValue(), new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.b(1, jsxActualizationBottomSheetDialogFragment, JsxActualizationBottomSheetDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetOneTimeEvent;)V", 0), new com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.c(1, jsxActualizationBottomSheetDialogFragment, JsxActualizationBottomSheetDialogFragment.class, "renderState", "renderState(Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetState;)V", 0));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f131541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f131541l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f131541l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return JsxActualizationBottomSheetDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f131543l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f131543l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f131543l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131544l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131544l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f131544l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f131545l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f131545l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f131545l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: JsxActualizationBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzt/a;", "kotlin.jvm.PlatformType", "invoke", "()Lzt/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<C50626a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final C50626a invoke() {
            zt.b bVar = JsxActualizationBottomSheetDialogFragment.this.f131532h0;
            if (bVar == null) {
                bVar = null;
            }
            return (C50626a) bVar.get();
        }
    }

    public JsxActualizationBottomSheetDialogFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f131534j0 = new O0(m0.f406844a.b(C50626a.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f131535k0 = new C35968w3(this);
        this.f131536l0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.a.a().a((com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.e) C29972i.a(C29972i.b(this), com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.di.e.class), cv.c.b(this), s.b(this), f5().f131548c, f5().f131553h).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f131533i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final JsxActualizationBottomSheetOpenParams f5() {
        return (JsxActualizationBottomSheetOpenParams) this.f131535k0.getValue(this, f131531r0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f131533i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.C(R.layout.jsx_cv_actualization_bottom_sheet, new b(1, this, JsxActualizationBottomSheetDialogFragment.class, "initializeView", "initializeView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f131533i0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f131536l0.e();
        super.onDetach();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        if (!isStateSaved()) {
            ((C50626a) this.f131534j0.getValue()).accept(AbstractC50297a.c.f443557a);
        }
        super.onDismiss(dialogInterface);
    }
}
