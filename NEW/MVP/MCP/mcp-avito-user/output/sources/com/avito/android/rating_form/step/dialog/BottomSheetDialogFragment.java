package com.avito.android.rating_form.step.dialog;

import Cd.C13243a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BottomSheetDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/BottomSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BottomSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f249322m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public m f249323h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f249324i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f249325j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f249326k0;

    /* renamed from: l0, reason: collision with root package name */
    public com.avito.android.rating_form.step.dialog.i f249327l0;

    /* compiled from: BottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/BottomSheetDialogFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_DIALOG_INFO", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BottomSheetDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating_form.step.dialog.BottomSheetDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C7486a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ RatingFormStepArguments f249328l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ DialogInfo f249329m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7486a(RatingFormStepArguments ratingFormStepArguments, DialogInfo dialogInfo) {
                super(1);
                this.f249328l = ratingFormStepArguments;
                this.f249329m = dialogInfo;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("key_arguments", this.f249328l);
                bundle2.putParcelable("key_dialog_info", this.f249329m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BottomSheetDialogFragment a(@Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k DialogInfo dialogInfo) {
            BottomSheetDialogFragment bottomSheetDialogFragment = new BottomSheetDialogFragment();
            C35966w1.a(bottomSheetDialogFragment, -1, new C7486a(ratingFormStepArguments, dialogInfo));
            return bottomSheetDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f249331m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f249331m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            BottomSheetDialogFragment bottomSheetDialogFragment = BottomSheetDialogFragment.this;
            Context contextRequireContext = bottomSheetDialogFragment.requireContext();
            l lVar = (l) bottomSheetDialogFragment.f249324i0.getValue();
            com.avito.android.deeplink_handler.handler.composite.a aVar = bottomSheetDialogFragment.f249325j0;
            if (aVar == null) {
                aVar = null;
            }
            bottomSheetDialogFragment.f249327l0 = new com.avito.android.rating_form.step.dialog.i(contextRequireContext, lVar, bottomSheetDialogFragment, aVar, new com.avito.android.rating_form.step.dialog.b(1, bottomSheetDialogFragment, BottomSheetDialogFragment.class, "showErrorToast", "showErrorToast(Lcom/avito/android/printable_text/PrintableText;)V", 0), new com.avito.android.rating_form.step.dialog.c(1, bottomSheetDialogFragment, BottomSheetDialogFragment.class, "openUrl", "openUrl(Ljava/lang/String;)V", 0), new com.avito.android.rating_form.step.dialog.d(0, this.f249331m, com.avito.android.lib.design.bottom_sheet.d.class, "dismiss", "dismiss()V", 0));
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetDialogFragment.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Integer, View> {
        @Override // Y41.l
        public final View invoke(Integer num) {
            return ((Dialog) this.receiver).findViewById(num.intValue());
        }
    }

    /* compiled from: BottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/widget/TextView;", "it", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f249332l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f249332l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            this.f249332l.H(textView);
            return G0.f406611a;
        }
    }

    /* compiled from: BottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating_form/step/dialog/BottomSheetDialogFragment$e", "Landroidx/activity/x;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends x {
        public e() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            com.avito.android.rating_form.step.dialog.i iVar = BottomSheetDialogFragment.this.f249327l0;
            if (iVar == null) {
                iVar = null;
            }
            Y41.a<G0> aVar = iVar.f249406j;
            if (aVar != null) {
                ((com.avito.android.rating_form.step.dialog.k) aVar).invoke();
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f249334l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f249334l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f249334l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BottomSheetDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f249336l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f249336l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f249336l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249337l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f249337l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f249338l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f249338l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f249338l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/dialog/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating_form/step/dialog/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<l> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = BottomSheetDialogFragment.this.f249323h0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public BottomSheetDialogFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f249324i0 = new O0(m0.f406844a.b(l.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        Parcelable parcelable = i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_dialog_info", DialogInfo.class) : bundleRequireArguments.getParcelable("key_dialog_info");
        if (parcelable == null) {
            throw new IllegalArgumentException("bottom sheet dialog info are not provided");
        }
        DialogInfo dialogInfo = (DialogInfo) parcelable;
        Bundle bundleRequireArguments2 = requireArguments();
        Parcelable parcelable2 = i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("key_arguments", RatingFormStepArguments.class) : bundleRequireArguments2.getParcelable("key_arguments");
        if (parcelable2 == null) {
            throw new IllegalArgumentException("RatingFormStepArguments not set");
        }
        com.avito.android.rating_form.step.dialog.di.a.a().a(getF42820b(), (RatingFormStepArguments) parcelable2, dialogInfo, (com.avito.android.rating_form.di.g) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.g.class), cv.c.b(this), (com.avito.android.rating_form.di.e) C29972i.a(C29972i.b(this), com.avito.android.rating_form.di.e.class)).b(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.C(R.layout.bottom_sheet_dialog_layout, new b(dVar));
        com.avito.android.rating_form.step.dialog.i iVar = this.f249327l0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.a(new c(1, dVar, N0.class, "findView", "findView(Landroid/app/Dialog;I)Landroid/view/View;", 1), new d(dVar));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.f21241d.b(new e());
        dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.rating_form.step.dialog.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i iVar2 = this.f249386b.f249327l0;
                if (iVar2 == null) {
                    iVar2 = null;
                }
                Y41.a<G0> aVar = iVar2.f249406j;
                if (aVar != null) {
                    ((k) aVar).invoke();
                }
            }
        });
        return dVar;
    }
}
