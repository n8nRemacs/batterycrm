package com.avito.android.beduin.v2.page.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35959v1;
import com.avito.android.util.C35966w1;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2BottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2BottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2BottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35959v1 f104843h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104844i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104845j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104846k0;

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104842m0 = {m0.f406844a.i(new h0(BeduinV2BottomSheetFragment.class, "bottomSheetMode", "getBottomSheetMode()Ljava/lang/String;", 0))};

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f104841l0 = new a(null);

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2BottomSheetFragment$a;", "", "<init>", "()V", "", "DEFAULT_BOTTOM_SHEET_LOADING_HEIGHT", "I", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            a aVar = BeduinV2BottomSheetFragment.f104841l0;
            BeduinV2BottomSheetFragment beduinV2BottomSheetFragment = BeduinV2BottomSheetFragment.this;
            String strF5 = beduinV2BottomSheetFragment.f5();
            if (strF5 != null) {
                int iHashCode = strF5.hashCode();
                if (iHashCode != 101393) {
                    if (iHashCode != 107876) {
                        if (iHashCode == 3194931 && strF5.equals("half")) {
                            return Integer.valueOf(C35835l0.g(beduinV2BottomSheetFragment.requireContext()).y / 2);
                        }
                    } else if (strF5.equals("max")) {
                        return Integer.valueOf(C35835l0.g(beduinV2BottomSheetFragment.requireContext()).y);
                    }
                } else if (strF5.equals("fit")) {
                    return Integer.valueOf((int) (120 * Resources.getSystem().getDisplayMetrics().density));
                }
            }
            return null;
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/v2/page/BeduinV2BottomSheetDeepLink$ContentPaddings;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<BeduinV2BottomSheetDeepLink.ContentPaddings> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final BeduinV2BottomSheetDeepLink.ContentPaddings invoke() {
            Object serializable;
            Bundle arguments = BeduinV2BottomSheetFragment.this.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("bottomSheetContentPaddings", BeduinV2BottomSheetDeepLink.ContentPaddings.class);
                } else {
                    Object serializable2 = arguments.getSerializable("bottomSheetContentPaddings");
                    if (!(serializable2 instanceof BeduinV2BottomSheetDeepLink.ContentPaddings)) {
                        serializable2 = null;
                    }
                    serializable = (BeduinV2BottomSheetDeepLink.ContentPaddings) serializable2;
                }
                BeduinV2BottomSheetDeepLink.ContentPaddings contentPaddings = (BeduinV2BottomSheetDeepLink.ContentPaddings) serializable;
                if (contentPaddings != null) {
                    return contentPaddings;
                }
            }
            return BeduinV2BottomSheetDeepLink.ContentPaddings.f104769c;
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            BeduinV2BottomSheetFragment beduinV2BottomSheetFragment = BeduinV2BottomSheetFragment.this;
            if (((BeduinV2BottomSheetDeepLink.ContentPaddings) beduinV2BottomSheetFragment.f104845j0.getValue()) == BeduinV2BottomSheetDeepLink.ContentPaddings.f104770d) {
                return Integer.valueOf(beduinV2BottomSheetFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_header_start_margin));
            }
            return null;
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/v2/page/impl/BeduinV2BottomSheetFragment$e", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends com.avito.android.lib.design.bottom_sheet.d {
        public e(Context context) {
            super(context, 0, 2, null);
            T();
            com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            Integer num = (Integer) BeduinV2BottomSheetFragment.this.f104844i0.getValue();
            if (num != null) {
                S(num.intValue());
                J(true);
            }
            if (L.f(BeduinV2BottomSheetFragment.this.f5(), "fit")) {
                com.avito.android.lib.design.bottom_sheet.d.I(this, true);
            }
            InterfaceC42726C interfaceC42726C = BeduinV2BottomSheetFragment.this.f104845j0;
            if (((BeduinV2BottomSheetDeepLink.ContentPaddings) interfaceC42726C.getValue()) == BeduinV2BottomSheetDeepLink.ContentPaddings.f104771e) {
                com.avito.android.lib.design.bottom_sheet.j.b(this, false, 4);
                return;
            }
            if (((BeduinV2BottomSheetDeepLink.ContentPaddings) interfaceC42726C.getValue()) == BeduinV2BottomSheetDeepLink.ContentPaddings.f104769c) {
                this.f178528v = true;
                com.avito.android.lib.design.bottom_sheet.q qVar = this.f178530x;
                if (qVar != null) {
                    qVar.j();
                }
            }
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        public final void onBackPressed() {
            BeduinV2BottomSheetFragment.this.requireActivity().getF21241d().c();
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Bundle, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            BeduinV2BottomSheetFragment beduinV2BottomSheetFragment = BeduinV2BottomSheetFragment.this;
            bundle2.putAll(beduinV2BottomSheetFragment.getArguments());
            Integer num = (Integer) beduinV2BottomSheetFragment.f104844i0.getValue();
            if (num != null) {
                bundle2.putInt("extra_content_height", num.intValue());
            }
            Integer num2 = (Integer) beduinV2BottomSheetFragment.f104846k0.getValue();
            if (num2 != null) {
                bundle2.putInt("extra_with_horizontal_paddings", num2.intValue());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinV2PageFragment f104852l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BeduinV2PageFragment beduinV2PageFragment) {
            super(0);
            this.f104852l = beduinV2PageFragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinV2PageFragment beduinV2PageFragment = this.f104852l;
            beduinV2PageFragment.f104869J0 = null;
            beduinV2PageFragment.f104870K0 = null;
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2BottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinV2PageFragment f104853l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BeduinV2PageFragment beduinV2PageFragment) {
            super(1);
            this.f104853l = beduinV2PageFragment;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f104853l.f104870K0 = null;
            return G0.f406611a;
        }
    }

    public BeduinV2BottomSheetFragment() {
        super(0, 1, null);
        this.f104843h0 = new C35959v1(this, "bottomSheetHeightMode");
        this.f104844i0 = C42727D.c(new b());
        this.f104845j0 = C42727D.c(new c());
        this.f104846k0 = C42727D.c(new d());
    }

    public final String f5() {
        return (String) this.f104843h0.getValue(this, f104842m0[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return new e(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_empty, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            BeduinV2PageFragment.f104859L0.getClass();
            BeduinV2PageFragment beduinV2PageFragment = new BeduinV2PageFragment();
            C35966w1.a(beduinV2PageFragment, -1, new f());
            if (L.f(f5(), "fit")) {
                beduinV2PageFragment.f104869J0 = new g(beduinV2PageFragment);
                beduinV2PageFragment.f104870K0 = new h(beduinV2PageFragment);
            }
            androidx.fragment.app.H hE2 = getChildFragmentManager().e();
            hE2.n(R.id.content_container, beduinV2PageFragment, null);
            hE2.e();
        }
    }
}
