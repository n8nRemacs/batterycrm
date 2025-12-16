package com.avito.android.beduin.ui.universal;

import Ai.C13036b;
import Ai.C13038d;
import Ai.C13039e;
import Ai.DialogInterfaceOnDismissListenerC13035a;
import Ai.InterfaceC13037c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.x;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.ui.universal.f;
import com.avito.android.beduin_shared.model.context.PresentationStyle;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.appbar.MaterialToolbar;
import gj.o;
import ij.C41414a;
import j.InterfaceC42165v;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalBeduinFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/UniversalBeduinFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "Params", "Lcom/avito/android/lib/design/bottom_sheet/d;", "dialog", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class UniversalBeduinFragment extends BaseFragment implements InterfaceC28477j.b, gj.i, com.avito.android.ui.status_bar.a {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f104416B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public boolean f104417A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f104418n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f104419o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.common.navigation_bar.b f104420p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f104421q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public gj.n f104422r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104423s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f104424t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f104425u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.beduin.ui.universal.view.c f104426v0;

    /* renamed from: w0, reason: collision with root package name */
    public InterfaceC13037c f104427w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public Long f104428x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public Long f104429y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public F f104430z0;

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/universal/UniversalBeduinFragment$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static boolean a(@Y61.k ScreenStyle screenStyle) {
            return screenStyle == ScreenStyle.BOTTOM_SHEET || screenStyle == ScreenStyle.PUSH_BOTTOM_SHEET;
        }

        public a() {
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104439a;

        static {
            int[] iArr = new int[ScreenStyle.values().length];
            try {
                iArr[ScreenStyle.BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenStyle.PUSH_BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenStyle.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenStyle.PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104439a = iArr;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isExpanded", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin.ui.universal.c f104440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.beduin.ui.universal.c cVar) {
            super(1);
            this.f104440l = cVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            com.avito.android.beduin.ui.universal.c cVar;
            Boolean bool2 = bool;
            if (bool2 != null && (cVar = this.f104440l) != null) {
                cVar.s2(bool2.booleanValue());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "()Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.lib.design.bottom_sheet.d> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f104442m;

        /* compiled from: UniversalBeduinFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f104443a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f104444b;

            static {
                int[] iArr = new int[BeduinComponentTheme.values().length];
                try {
                    iArr[BeduinComponentTheme.AVITO_RE_23.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BeduinComponentTheme.AVITO_LOOK_AND_FEEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f104443a = iArr;
                int[] iArr2 = new int[BottomSheetContentPaddings.values().length];
                try {
                    iArr2[BottomSheetContentPaddings.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[BottomSheetContentPaddings.TOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f104444b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f104442m = context;
        }

        @Override // Y41.a
        public final com.avito.android.lib.design.bottom_sheet.d invoke() {
            a aVar = UniversalBeduinFragment.f104416B0;
            UniversalBeduinFragment universalBeduinFragment = UniversalBeduinFragment.this;
            BeduinComponentTheme beduinComponentTheme = universalBeduinFragment.r5().f104436g;
            int i12 = beduinComponentTheme == null ? -1 : a.f104443a[beduinComponentTheme.ordinal()];
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(this.f104442m, i12 != 1 ? i12 != 2 ? R.style.UniversalBeduinDialog : R.style.UniversalBeduinDialog_LookAndFeel : R.style.UniversalBeduinDialog_Re23);
            if (a.f104444b[universalBeduinFragment.r5().f104438i.ordinal()] == 1) {
                com.avito.android.lib.design.bottom_sheet.j.b(dVar, false, 7);
            }
            return dVar;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldAvoid", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Boolean, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            UniversalBeduinFragment.this.requireActivity().getWindow().setSoftInputMode(bool.booleanValue() ? 16 : 48);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = UniversalBeduinFragment.f104416B0;
            UniversalBeduinFragment universalBeduinFragment = UniversalBeduinFragment.this;
            m mVar = universalBeduinFragment.f104418n0;
            if (mVar == null) {
                mVar = null;
            }
            com.avito.android.beduin_shared.model.utils.a.a(mVar.f104497N, mVar.f104502S);
            ActivityC22955m activityC22955mL1 = universalBeduinFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<x, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            a aVar = UniversalBeduinFragment.f104416B0;
            UniversalBeduinFragment universalBeduinFragment = UniversalBeduinFragment.this;
            ScreenStyle screenStyleS5 = universalBeduinFragment.s5();
            aVar.getClass();
            if (!a.a(screenStyleS5)) {
                m mVar = universalBeduinFragment.f104418n0;
                if (mVar == null) {
                    mVar = null;
                }
                com.avito.android.beduin_shared.model.utils.a.a(mVar.f104497N, mVar.f104503T);
            }
            m mVar2 = universalBeduinFragment.f104418n0;
            if ((mVar2 != null ? mVar2 : null).f104524o0) {
                universalBeduinFragment.t0();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin/ui/universal/UniversalBeduinFragment$Params;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<Params> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Params invoke() {
            return (Params) UniversalBeduinFragment.this.requireArguments().getParcelable("key_params");
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ScreenStyle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<ScreenStyle> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final ScreenStyle invoke() {
            a aVar = UniversalBeduinFragment.f104416B0;
            ScreenStyle screenStyle = UniversalBeduinFragment.this.r5().f104435f;
            return screenStyle == null ? ScreenStyle.MODAL : screenStyle;
        }
    }

    public UniversalBeduinFragment() {
        super(0, 1, null);
        this.f104423s0 = C42727D.c(new h());
        this.f104424t0 = new io.reactivex.rxjava3.disposables.c();
        this.f104425u0 = C42727D.c(new i());
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        com.avito.android.beduin.ui.universal.view.c cVar;
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        if (str.equals(mVar.f104517h0.getF103350r())) {
            com.avito.android.beduin.ui.universal.view.c cVar2 = this.f104426v0;
            if (cVar2 != null) {
                return cVar2.getF104569m();
            }
            return null;
        }
        m mVar2 = this.f104418n0;
        if (mVar2 == null) {
            mVar2 = null;
        }
        if (str.equals(mVar2.f104519j0.getF103350r())) {
            com.avito.android.beduin.ui.universal.view.c cVar3 = this.f104426v0;
            if (cVar3 != null) {
                return cVar3.getF104570n();
            }
            return null;
        }
        m mVar3 = this.f104418n0;
        if (mVar3 == null) {
            mVar3 = null;
        }
        if (!str.equals(mVar3.f104521l0.getF103350r()) || (cVar = this.f104426v0) == null) {
            return null;
        }
        return cVar.getF104571o();
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.l
    public final gj.o c1() {
        com.avito.android.beduin.ui.universal.view.c cVar = this.f104426v0;
        if (cVar == null) {
            return null;
        }
        o.a aVar = new o.a(cVar.getF104557a(), ToastBarPosition.f181047e);
        View viewA = cVar.a();
        ScreenStyle screenStyleS5 = s5();
        f104416B0.getClass();
        return new gj.o(aVar, new o.a(viewA, a.a(screenStyleS5) ? ToastBarPosition.f181046d : ToastBarPosition.f181045c));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new C41414a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        return mVar.f104519j0.getF103350r();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(r5().f104436g));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        if (this.f104426v0 == null) {
            t5();
        }
        C19918B.a(requireActivity().getF21241d(), this, new g(), 2);
        this.f104417A0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        D.f90335a.getClass();
        this.f104430z0 = D.a.a();
        int i12 = b.f104439a[s5().ordinal()];
        return layoutInflater.inflate(i12 != 1 ? i12 != 2 ? R.layout.beduin_fragment : R.layout.beduin_bottom_sheet_constraint_view : R.layout.beduin_bottom_sheet_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.beduin.ui.universal.view.c cVar = this.f104426v0;
        if (cVar != null) {
            m mVar = this.f104418n0;
            if (mVar == null) {
                mVar = null;
            }
            cVar.d(mVar);
        }
        ActivityC22955m activityC22955mL1 = l1();
        androidx.appcompat.app.m mVar2 = activityC22955mL1 instanceof androidx.appcompat.app.m ? (androidx.appcompat.app.m) activityC22955mL1 : null;
        if (mVar2 != null) {
            mVar2.setSupportActionBar(null);
        }
        this.f104424t0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        com.avito.android.beduin_shared.model.utils.a.a(mVar.f104497N, mVar.f104504U);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        com.avito.android.beduin_shared.model.utils.a.a(mVar.f104497N, mVar.f104505V);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        ScreenStyle screenStyleS5 = s5();
        f104416B0.getClass();
        if (a.a(screenStyleS5)) {
            com.avito.android.ui.status_bar.e eVar = this.f104419o0;
            if (eVar == null) {
                eVar = null;
            }
            eVar.a(this);
        }
        t5();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.beduin.ui.universal.di.b.a().a(this, r5().f104431b, r5().f104432c, s.c(this), r5().f104437h, (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), (com.avito.android.beduin.ui.universal.di.e) C29972i.a(C29972i.b(this), com.avito.android.beduin.ui.universal.di.e.class), cv.c.b(this)).a(this);
        this.f104428x0 = Long.valueOf(fA2.b());
    }

    public final AbstractC25658a<? extends RecyclerView.C> q5() {
        InterfaceC25659b interfaceC25659b = this.f104421q0;
        Integer numValueOf = null;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        if (r5().f104436g == BeduinComponentTheme.AVITO_RE_23) {
            Context context = getContext();
            if (context != null) {
                numValueOf = Integer.valueOf(C35835l0.f(R.attr.horizontalOffset, context));
            }
        } else {
            numValueOf = Integer.valueOf(y6.b(24));
        }
        return interfaceC25659b.b(numValueOf);
    }

    public final Params r5() {
        return (Params) this.f104423s0.getValue();
    }

    public final ScreenStyle s5() {
        return (ScreenStyle) this.f104425u0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        com.avito.android.beduin_shared.model.utils.a.a(mVar.f104497N, mVar.f104502S);
        InterfaceC13037c interfaceC13037c = this.f104427w0;
        (interfaceC13037c != null ? interfaceC13037c : null).close();
    }

    public final void t5() {
        View view;
        com.avito.android.beduin.ui.universal.c cVar;
        InterfaceC13037c c13036b;
        boolean z12;
        com.avito.android.beduin.ui.universal.view.c aVar;
        boolean z13;
        com.avito.android.beduin.ui.universal.view.c bVar;
        Context context = getContext();
        if (context == null || (view = getView()) == null) {
            return;
        }
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(context));
        if (s5() == ScreenStyle.PUSH_BOTTOM_SHEET) {
            InterfaceC23487e parentFragment = getParentFragment();
            com.avito.android.beduin.ui.universal.c cVar2 = parentFragment instanceof com.avito.android.beduin.ui.universal.c ? (com.avito.android.beduin.ui.universal.c) parentFragment : null;
            if (cVar2 == null) {
                throw new IllegalStateException("ParentFragment must implement PushBottomSheetDialogCallbacks");
            }
            cVar = cVar2;
        } else {
            cVar = null;
        }
        ScreenStyle screenStyleS5 = s5();
        int[] iArr = b.f104439a;
        int i12 = iArr[screenStyleS5.ordinal()];
        if (i12 == 1) {
            c13036b = new C13036b((com.avito.android.lib.design.bottom_sheet.d) interfaceC42726CB.getValue(), requireActivity());
        } else if (i12 == 2) {
            c13036b = new C13039e(cVar, String.valueOf(hashCode()));
        } else {
            if (i12 != 3 && i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c13036b = new C13038d(requireActivity());
        }
        this.f104427w0 = c13036b;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aQ5 = q5();
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aQ52 = q5();
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aQ53 = q5();
        e eVar = new e();
        int i13 = iArr[s5().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.beduin_toolbar);
                materialToolbar.setTitle("");
                o5(materialToolbar);
                Integer num = r5().f104433d;
                if (num != null) {
                    Drawable drawable = androidx.core.content.d.getDrawable(materialToolbar.getContext(), num.intValue());
                    Integer num2 = r5().f104434e;
                    if (num2 != null) {
                        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(materialToolbar.getContext(), num2.intValue());
                        if (drawable != null) {
                            drawable.setTintList(colorStateList);
                        }
                    }
                    materialToolbar.setNavigationIcon(drawable);
                }
                materialToolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 15));
                InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
                com.avito.android.beduin.common.navigation_bar.b bVar2 = this.f104420p0;
                z13 = true;
                bVar = new com.avito.android.beduin.ui.universal.view.d(view, viewLifecycleOwner, this.f104424t0, bVar2 != null ? bVar2 : null, abstractC25658aQ5, abstractC25658aQ52, abstractC25658aQ53, materialToolbar, eVar);
            } else {
                z13 = true;
                com.avito.android.lib.design.bottom_sheet.d dVarJ0 = cVar.J0();
                InterfaceC22983P viewLifecycleOwner2 = getViewLifecycleOwner();
                com.avito.android.beduin.common.navigation_bar.b bVar3 = this.f104420p0;
                bVar = new com.avito.android.beduin.ui.universal.view.b(dVarJ0, view, viewLifecycleOwner2, this.f104424t0, bVar3 != null ? bVar3 : null, abstractC25658aQ5, abstractC25658aQ52, abstractC25658aQ53, eVar);
                cVar.k1(new f());
            }
            z12 = z13;
            aVar = bVar;
        } else {
            z12 = true;
            com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) interfaceC42726CB.getValue();
            InterfaceC22983P viewLifecycleOwner3 = getViewLifecycleOwner();
            com.avito.android.beduin.common.navigation_bar.b bVar4 = this.f104420p0;
            aVar = new com.avito.android.beduin.ui.universal.view.a(dVar, viewLifecycleOwner3, this.f104424t0, bVar4 != null ? bVar4 : null, abstractC25658aQ5, abstractC25658aQ52, abstractC25658aQ53, eVar, R.layout.beduin_bottom_sheet_constraint_view, null, 512, null);
            ((com.avito.android.lib.design.bottom_sheet.d) interfaceC42726CB.getValue()).setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 13));
        }
        this.f104426v0 = aVar;
        m mVar = this.f104418n0;
        if (mVar == null) {
            mVar = null;
        }
        aVar.f(mVar);
        m mVar2 = this.f104418n0;
        if (mVar2 == null) {
            mVar2 = null;
        }
        mVar2.f104512c0.observe(getViewLifecycleOwner(), new f.a(new com.avito.android.beduin.ui.universal.d(this)));
        m mVar3 = this.f104418n0;
        if (mVar3 == null) {
            mVar3 = null;
        }
        mVar3.f104514e0.observe(getViewLifecycleOwner(), new f.a(new com.avito.android.beduin.ui.universal.e(this)));
        gj.n nVar = this.f104422r0;
        if (nVar == null) {
            nVar = null;
        }
        com.avito.android.beduin.view.c cVarA = nVar.a(getViewLifecycleOwner(), requireActivity(), this, new gj.l(null, false, iArr[s5().ordinal()] == 2 ? this.f104417A0 ? PresentationStyle.f105309d : PresentationStyle.f105308c : PresentationStyle.f105307b, null, 11, null));
        m mVar4 = this.f104418n0;
        if (mVar4 == null) {
            mVar4 = null;
        }
        cVarA.l(mVar4.f104497N);
        this.f104417A0 = z12;
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(0);
        }
        F f12 = this.f104430z0;
        this.f104429y0 = f12 != null ? Long.valueOf(f12.b()) : null;
        this.f104430z0 = null;
        m mVar5 = this.f104418n0;
        if (mVar5 == null) {
            mVar5 = null;
        }
        ScreenPerformanceTracker screenPerformanceTrackerLe = mVar5.le();
        if (screenPerformanceTrackerLe != null) {
            u5(screenPerformanceTrackerLe);
        }
        m mVar6 = this.f104418n0;
        (mVar6 != null ? mVar6 : null).f104508Y.observe(getViewLifecycleOwner(), new f.a(new c(cVar)));
    }

    public final void u5(ScreenPerformanceTracker screenPerformanceTracker) {
        com.avito.android.beduin.ui.universal.view.c cVar = this.f104426v0;
        if (cVar == null) {
            return;
        }
        screenPerformanceTracker.c(this, g5());
        screenPerformanceTracker.b(cVar.getF104570n());
        Long l12 = this.f104428x0;
        if (l12 != null) {
            screenPerformanceTracker.a(l12.longValue());
        }
        Long l13 = this.f104429y0;
        if (l13 != null) {
            screenPerformanceTracker.t(l13.longValue());
        }
    }

    /* compiled from: UniversalBeduinFragment.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/UniversalBeduinFragment$Params;", "Landroid/os/Parcelable;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class Params implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Params> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f104431b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f104432c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f104433d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f104434e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final ScreenStyle f104435f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final BeduinComponentTheme f104436g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f104437h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final BottomSheetContentPaddings f104438i;

        /* compiled from: UniversalBeduinFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                return new Params(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null, parcel.readString(), BottomSheetContentPaddings.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i12) {
                return new Params[i12];
            }
        }

        public Params(@Y61.l Long l12, @Y61.l String str, @InterfaceC42165v @Y61.l Integer num, @Y61.l Integer num2, @Y61.l ScreenStyle screenStyle, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l String str2, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings) {
            this.f104431b = l12;
            this.f104432c = str;
            this.f104433d = num;
            this.f104434e = num2;
            this.f104435f = screenStyle;
            this.f104436g = beduinComponentTheme;
            this.f104437h = str2;
            this.f104438i = bottomSheetContentPaddings;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Long l12 = this.f104431b;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f104432c);
            Integer num = this.f104433d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f104434e;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            ScreenStyle screenStyle = this.f104435f;
            if (screenStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(screenStyle.name());
            }
            BeduinComponentTheme beduinComponentTheme = this.f104436g;
            if (beduinComponentTheme == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinComponentTheme.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f104437h);
            parcel.writeString(this.f104438i.name());
        }

        public /* synthetic */ Params(Long l12, String str, Integer num, Integer num2, ScreenStyle screenStyle, BeduinComponentTheme beduinComponentTheme, String str2, BottomSheetContentPaddings bottomSheetContentPaddings, int i12, C42822w c42822w) {
            this(l12, str, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : num2, (i12 & 16) != 0 ? ScreenStyle.MODAL : screenStyle, (i12 & 32) != 0 ? null : beduinComponentTheme, str2, (i12 & 128) != 0 ? BottomSheetContentPaddings.TOP : bottomSheetContentPaddings);
        }
    }
}
