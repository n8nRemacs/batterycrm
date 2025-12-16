package com.avito.android.mortgage.pre_approval.form;

import Cd.C13243a;
import Q00.a;
import Q00.b;
import R00.a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.pre_approval.form.di.b;
import com.avito.android.mortgage.pre_approval.form.list.items.select.SelectItem;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.pre_approval.result.PreApprovalResultFragment;
import com.avito.android.mortgage.screens.MortgagePreApprovalFormScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import com.avito.android.select.p;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: PreApprovalFormFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/PreApprovalFormFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/select/p;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreApprovalFormFragment extends BaseFragment implements p, InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f201682s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.pre_approval.form.d f201683n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f201684o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f201685p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.pre_approval.form.f f201686q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f201687r0;

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/PreApprovalFormFragment$a;", "", "<init>", "()V", "", "AUTHORIZE_REQUEST_CODE", "Ljava/lang/String;", "PRE_APPROVAL_ARGS", "SELECT_BOTTOM_SHEET_DIALOG_TAG", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PreApprovalFormFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.pre_approval.form.PreApprovalFormFragment$a$a, reason: collision with other inner class name */
        public static final class C5978a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ PreApprovalArguments f201688l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5978a(PreApprovalArguments preApprovalArguments) {
                super(1);
                this.f201688l = preApprovalArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("PRE_APPROVAL_ARGS", this.f201688l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BaseFragment a(@Y61.k PreApprovalArguments preApprovalArguments) {
            PreApprovalFormFragment preApprovalFormFragment = new PreApprovalFormFragment();
            C35966w1.a(preApprovalFormFragment, -1, new C5978a(preApprovalArguments));
            return preApprovalFormFragment;
        }

        public a() {
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/pre_approval/form/PreApprovalFormFragment$b", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(a.e.f13401a);
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(a.e.f13401a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(a.b.f13398a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(a.d.f13400a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(a.f.f13402a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<Q00.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Q00.b bVar) {
            Q00.b bVar2 = bVar;
            PreApprovalFormFragment preApprovalFormFragment = (PreApprovalFormFragment) this.receiver;
            a aVar = PreApprovalFormFragment.f201682s0;
            preApprovalFormFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.mortgage.pre_approval.form.d dVar = preApprovalFormFragment.f201683n0;
                ViewGroup viewGroup = (dVar != null ? dVar : null).f201704b;
                if (viewGroup != null) {
                    K2.d(viewGroup, true);
                }
                androidx.fragment.app.H hE2 = preApprovalFormFragment.getParentFragmentManager().e();
                hE2.m(preApprovalFormFragment);
                hE2.e();
            } else if (bVar2 instanceof b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = preApprovalFormFragment.f201684o0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new AuthenticateLink(AuthSource.f92715m0, false, (DeepLink) null, 6, (C42822w) null), "auth_request", null, 4);
            } else if (bVar2 instanceof b.e) {
                b.e eVar = (b.e) bVar2;
                com.avito.android.mortgage.pre_approval.form.d dVar2 = preApprovalFormFragment.f201683n0;
                ViewGroup viewGroup2 = (dVar2 != null ? dVar2 : null).f201704b;
                if (viewGroup2 != null) {
                    K2.d(viewGroup2, true);
                }
                com.avito.android.select.bottom_sheet.c.a(preApprovalFormFragment, eVar.f13419a).show(preApprovalFormFragment.getParentFragmentManager(), "SelectBottomSheetDialog");
            } else if (bVar2 instanceof b.d) {
                PreApprovalResultFragment.a aVar3 = PreApprovalResultFragment.f201978s0;
                PreApprovalArguments preApprovalArguments = ((b.d) bVar2).f13418a;
                aVar3.getClass();
                BaseFragment baseFragmentA = PreApprovalResultFragment.a.a(preApprovalArguments);
                androidx.fragment.app.H hE3 = preApprovalFormFragment.getParentFragmentManager().e();
                hE3.j(R.id.container, baseFragmentA, null, 1);
                hE3.m(preApprovalFormFragment);
                hE3.e();
            } else if (bVar2 instanceof b.C0880b) {
                com.avito.android.mortgage.pre_approval.form.d dVar3 = preApprovalFormFragment.f201683n0;
                ViewGroup viewGroup3 = (dVar3 != null ? dVar3 : null).f201704b;
                if (viewGroup3 != null) {
                    K2.d(viewGroup3, true);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR00/b;", "it", "Lkotlin/G0;", "invoke", "(LR00/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<R00.b, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(R00.b bVar) {
            a aVar = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment preApprovalFormFragment = PreApprovalFormFragment.this;
            R00.c cVar = bVar.f14061g;
            R00.a aVar2 = cVar.f14066e;
            boolean z12 = aVar2 instanceof a.c;
            PrintableText printableText = cVar.f14062a;
            boolean z13 = cVar.f14064c;
            if (z12) {
                com.avito.android.mortgage.pre_approval.form.d dVar = preApprovalFormFragment.f201683n0;
                if (dVar == null) {
                    dVar = null;
                }
                com.avito.android.progress_overlay.l lVar = dVar.f201710h;
                if (lVar != null) {
                    lVar.k(null);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar2 = preApprovalFormFragment.f201683n0;
                if (dVar2 == null) {
                    dVar2 = null;
                }
                String strK0 = printableText.k0(preApprovalFormFragment.requireContext());
                TextView textView = dVar2.f201706d;
                if (textView != null) {
                    textView.setText(strK0);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar3 = preApprovalFormFragment.f201683n0;
                ImageButton imageButton = (dVar3 != null ? dVar3 : null).f201705c;
                if (imageButton != null) {
                    imageButton.setVisibility(z13 ? 0 : 4);
                }
            } else if (aVar2 instanceof a.b) {
                ApiError apiError = ((a.b) aVar2).f14052a;
                com.avito.android.mortgage.pre_approval.form.d dVar4 = preApprovalFormFragment.f201683n0;
                if (dVar4 == null) {
                    dVar4 = null;
                }
                com.avito.android.progress_overlay.l lVar2 = dVar4.f201710h;
                if (lVar2 != null) {
                    lVar2.a(z.k(apiError));
                }
                com.avito.android.mortgage.pre_approval.form.d dVar5 = preApprovalFormFragment.f201683n0;
                if (dVar5 == null) {
                    dVar5 = null;
                }
                String strK02 = printableText.k0(preApprovalFormFragment.requireContext());
                TextView textView2 = dVar5.f201706d;
                if (textView2 != null) {
                    textView2.setText(strK02);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar6 = preApprovalFormFragment.f201683n0;
                ImageButton imageButton2 = (dVar6 != null ? dVar6 : null).f201705c;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(z13 ? 0 : 4);
                }
            } else if (aVar2 instanceof a.C0932a) {
                com.avito.android.mortgage.pre_approval.form.d dVar7 = preApprovalFormFragment.f201683n0;
                if (dVar7 == null) {
                    dVar7 = null;
                }
                com.avito.android.progress_overlay.l lVar3 = dVar7.f201710h;
                if (lVar3 != null) {
                    lVar3.j();
                }
                com.avito.android.mortgage.pre_approval.form.d dVar8 = preApprovalFormFragment.f201683n0;
                if (dVar8 == null) {
                    dVar8 = null;
                }
                String strK03 = printableText.k0(preApprovalFormFragment.requireContext());
                TextView textView3 = dVar8.f201706d;
                if (textView3 != null) {
                    textView3.setText(strK03);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar9 = preApprovalFormFragment.f201683n0;
                if (dVar9 == null) {
                    dVar9 = null;
                }
                ImageButton imageButton3 = dVar9.f201705c;
                if (imageButton3 != null) {
                    imageButton3.setVisibility(z13 ? 0 : 4);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar10 = preApprovalFormFragment.f201683n0;
                if (dVar10 == null) {
                    dVar10 = null;
                }
                String strK04 = cVar.f14065d.k0(preApprovalFormFragment.requireContext());
                Button button = dVar10.f201708f;
                if (button != null) {
                    button.setText(strK04);
                }
                com.avito.android.mortgage.pre_approval.form.d dVar11 = preApprovalFormFragment.f201683n0;
                if (dVar11 == null) {
                    dVar11 = null;
                }
                dVar11.f201703a.l(cVar.f14063b, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ00/a;", "it", "Lkotlin/G0;", "invoke", "(LQ00/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<Q00.a, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Q00.a aVar) {
            a aVar2 = PreApprovalFormFragment.f201682s0;
            PreApprovalFormFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f201696l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f201696l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f201696l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return PreApprovalFormFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f201698l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f201698l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f201698l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f201699l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f201699l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f201699l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f201700l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f201700l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f201700l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PreApprovalFormFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/pre_approval/form/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.mortgage.pre_approval.form.e> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.pre_approval.form.e invoke() {
            com.avito.android.mortgage.pre_approval.form.f fVar = PreApprovalFormFragment.this.f201686q0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.mortgage.pre_approval.form.e) fVar.get();
        }
    }

    public PreApprovalFormFragment() {
        super(R.layout.pre_approval_fragment);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f201687r0 = new O0(m0.f406844a.b(com.avito.android.mortgage.pre_approval.form.e.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SelectItem.Option) {
                arrayList.add(obj);
            }
        }
        SelectItem.Option option = (SelectItem.Option) C42745f0.G(arrayList);
        if (option != null) {
            q5().accept(new a.i(str, option));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getF21241d().a(this, new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f201685p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (getParentFragmentManager().G(R.id.container) == null) {
            requireActivity().finish();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.mortgage.pre_approval.form.d dVar = this.f201683n0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f201704b = null;
        dVar.f201705c = null;
        dVar.f201706d = null;
        dVar.f201707e = null;
        dVar.f201708f = null;
        dVar.f201709g = null;
        dVar.f201710h = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Context context;
        Activity activityA;
        super.onViewCreated(view, bundle);
        com.avito.android.mortgage.pre_approval.form.d dVar = this.f201683n0;
        if (dVar == null) {
            dVar = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        dVar.f201704b = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.back_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        dVar.f201705c = (ImageButton) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        dVar.f201706d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        dVar.f201707e = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.navigation);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        dVar.f201708f = (Button) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        dVar.f201709g = (RecyclerView) viewFindViewById5;
        viewGroup.getContext();
        RecyclerView recyclerView = dVar.f201709g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = dVar.f201709g;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(dVar.f201703a);
        }
        RecyclerView recyclerView3 = dVar.f201709g;
        if (recyclerView3 != null) {
            recyclerView3.l(new N00.a(), -1);
        }
        dVar.f201710h = new com.avito.android.progress_overlay.l(dVar.f201704b, R.id.content, null, 0, 0, 28, null);
        ViewGroup viewGroup2 = dVar.f201704b;
        if (viewGroup2 != null && (context = viewGroup2.getContext()) != null && (activityA = C35835l0.a(context)) != null) {
            K2.a(activityA, new com.avito.android.mortgage.pre_approval.form.c(viewGroup));
        }
        com.avito.android.mortgage.pre_approval.form.d dVar2 = this.f201683n0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        c cVar = new c();
        d dVar3 = new d();
        e eVar = new e();
        f fVar = new f();
        ImageButton imageButton = dVar2.f201705c;
        if (imageButton != null) {
            imageButton.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(14, cVar));
        }
        ImageButton imageButton2 = dVar2.f201707e;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(15, dVar3));
        }
        Button button = dVar2.f201708f;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(16, eVar));
        }
        com.avito.android.progress_overlay.l lVar = dVar2.f201710h;
        if (lVar != null) {
            lVar.f231600j = fVar;
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f201685p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, q5(), new g(1, this, PreApprovalFormFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormOneTimeEvent;)V", 0), new h());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f201685p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgagePreApprovalFormScreen.f203385d, s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.mortgage.pre_approval.form.di.a.a();
        com.avito.android.mortgage.di.o oVar = (com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class);
        com.avito.android.mortgage.pre_approval.form.di.c cVar = (com.avito.android.mortgage.pre_approval.form.di.c) C29972i.a(C29972i.b(this), com.avito.android.mortgage.pre_approval.form.di.c.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        i iVar = new i();
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a(oVar, cVar, interfaceC39417aB, c28478k, iVar, (PreApprovalArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("PRE_APPROVAL_ARGS", PreApprovalArguments.class) : bundleRequireArguments.getParcelable("PRE_APPROVAL_ARGS"))).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f201685p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.mortgage.pre_approval.form.e q5() {
        return (com.avito.android.mortgage.pre_approval.form.e) this.f201687r0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
