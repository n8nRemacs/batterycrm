package com.avito.android.mortgage.landing;

import Cd.C13243a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
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
import com.avito.android.analytics.screens.MortgageLandingScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.mortgage.api.model.landing.LandingHeaderAction;
import com.avito.android.mortgage.api.model.landing.TitlePart;
import com.avito.android.mortgage.landing.di.i;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.landing.mvi.entity.BottomState;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewHeader;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewState;
import com.avito.android.mortgage.landing.utils.b;
import com.avito.android.mortgage.widgets.StackedImageView;
import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import com.avito.android.util.y6;
import cv.InterfaceC39417a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import q20.InterfaceC47188b;
import u00.InterfaceC48753a;
import w00.InterfaceC49409a;
import w00.InterfaceC49417c;
import z1.AbstractC50339a;

/* compiled from: LandingFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/landing/LandingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LandingFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final a f199475z0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.landing.r f199476n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f199477o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC47188b f199478p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f199479q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public Set<RecyclerView.l> f199480r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f199481s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f199482t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f199483u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC48753a f199484v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f199485w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage_invite.factory.a f199486x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.mortgage.landing.o f199487y0;

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/LandingFragment$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: LandingFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.landing.LandingFragment$a$a, reason: collision with other inner class name */
        public static final class C5891a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ LandingArguments f199488l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5891a(LandingArguments landingArguments) {
                super(1);
                this.f199488l = landingArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("landing_argument", this.f199488l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static LandingFragment a(@Y61.k LandingArguments landingArguments) {
            LandingFragment landingFragment = new LandingFragment();
            C35966w1.a(landingFragment, -1, new C5891a(landingArguments));
            return landingFragment;
        }

        public a() {
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/LandingFragment$b", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.C49411c.f441098a);
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC49417c, G0> {
        public final void f(@Y61.k InterfaceC49417c interfaceC49417c) {
            LandingFragment landingFragment = (LandingFragment) this.receiver;
            a aVar = LandingFragment.f199475z0;
            landingFragment.getClass();
            if (interfaceC49417c instanceof InterfaceC49417c.C12804c) {
                InterfaceC47188b interfaceC47188b = landingFragment.f199478p0;
                (interfaceC47188b != null ? interfaceC47188b : null).b(ApplicationCreateResult.Dismissed.f205964b);
                if (landingFragment.getParentFragmentManager().L() > 0) {
                    landingFragment.getParentFragmentManager().Y();
                    return;
                } else {
                    landingFragment.requireActivity().finish();
                    return;
                }
            }
            if (interfaceC49417c instanceof InterfaceC49417c.a) {
                InterfaceC49417c.a aVar2 = (InterfaceC49417c.a) interfaceC49417c;
                InterfaceC47188b interfaceC47188b2 = landingFragment.f199478p0;
                (interfaceC47188b2 != null ? interfaceC47188b2 : null).b(new ApplicationCreateResult.ApplicationCreated(aVar2.f441126a));
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.j) {
                com.avito.android.mortgage.landing.o oVar = landingFragment.f199487y0;
                if (oVar != null) {
                    K2.d(oVar.f200300a, false);
                }
                if (landingFragment.f199487y0 != null) {
                    InterfaceC49417c.j jVar = (InterfaceC49417c.j) interfaceC49417c;
                    Fragment fragmentH = landingFragment.getChildFragmentManager().H("SelectBottomSheetDialog");
                    DialogFragment dialogFragmentA = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
                    if (dialogFragmentA == null) {
                        dialogFragmentA = com.avito.android.select.bottom_sheet.c.a(landingFragment, jVar.f441137a);
                    }
                    if (dialogFragmentA.isAdded()) {
                        return;
                    }
                    dialogFragmentA.show(landingFragment.getParentFragmentManager(), "SelectBottomSheetDialog");
                    return;
                }
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.l) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                InterfaceC49417c.l lVar = (InterfaceC49417c.l) interfaceC49417c;
                ApiError apiError = lVar.f441140b;
                com.avito.android.component.toast.c.c(cVar, landingFragment, lVar.f441139a, null, null, apiError != null ? new f.c(apiError) : f.a.f125253a, 0, apiError != null ? ToastBarPosition.f181046d : ToastBarPosition.f181047e, 942);
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.i) {
                com.avito.android.mortgage.landing.o oVar2 = landingFragment.f199487y0;
                if (oVar2 != null) {
                    InterfaceC49417c.i iVar = (InterfaceC49417c.i) interfaceC49417c;
                    com.avito.android.mortgage.landing.a aVar3 = new com.avito.android.mortgage.landing.a(landingFragment);
                    com.avito.android.mortgage.landing.b bVar = new com.avito.android.mortgage.landing.b(landingFragment);
                    com.avito.android.mortgage.landing.dialog.f fVar = oVar2.f200296A;
                    if (fVar != null) {
                        fVar.r();
                    }
                    com.avito.android.mortgage.landing.dialog.f fVar2 = new com.avito.android.mortgage.landing.dialog.f(oVar2.f200303d, iVar.f441135a, iVar.f441136b, aVar3, bVar);
                    com.avito.android.lib.util.g.a(fVar2);
                    oVar2.f200296A = fVar2;
                    return;
                }
                return;
            }
            if (L.f(interfaceC49417c, InterfaceC49417c.f.f441131a)) {
                com.avito.android.mortgage.landing.o oVar3 = landingFragment.f199487y0;
                if (oVar3 != null) {
                    com.avito.android.lib.util.g.a(new com.avito.android.mortgage.landing.dialog.a(oVar3.f200303d, new com.avito.android.mortgage.landing.c(landingFragment), new com.avito.android.mortgage.landing.d(landingFragment)));
                    return;
                }
                return;
            }
            if (L.f(interfaceC49417c, InterfaceC49417c.b.f441127a)) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = landingFragment.f199483u0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, new AuthenticateLink(AuthSource.f92713l0, false, (DeepLink) null, 6, (C42822w) null), "auth_request", null, 4);
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.k) {
                com.avito.android.mortgage.landing.o oVar4 = landingFragment.f199487y0;
                if (oVar4 != null) {
                    oVar4.f200307h.F0(((InterfaceC49417c.k) interfaceC49417c).f441138a);
                    return;
                }
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.m) {
                landingFragment.q5().accept(InterfaceC49409a.B.f441085a);
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.g) {
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = landingFragment.f199483u0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, ((InterfaceC49417c.g) interfaceC49417c).f441133b, null, null, 6);
                ActivityC22955m activityC22955mL1 = landingFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                    return;
                }
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.d) {
                com.avito.android.mortgage.landing.o oVar5 = landingFragment.f199487y0;
                if (oVar5 != null) {
                    oVar5.f200318s.g(false, true, true);
                    return;
                }
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.e) {
                com.avito.android.deeplink_handler.handler.composite.a aVar6 = landingFragment.f199483u0;
                if (aVar6 == null) {
                    aVar6 = null;
                }
                b.a.a(aVar6, ((InterfaceC49417c.e) interfaceC49417c).f441130a, null, null, 6);
                return;
            }
            if (interfaceC49417c instanceof InterfaceC49417c.h) {
                androidx.fragment.app.H hE2 = landingFragment.getParentFragmentManager().e();
                com.avito.android.mortgage_invite.factory.a aVar7 = landingFragment.f199486x0;
                if (aVar7 == null) {
                    aVar7 = null;
                }
                hE2.n(R.id.container, aVar7.a(((InterfaceC49417c.h) interfaceC49417c).f441134a), null);
                hE2.c(null);
                hE2.e();
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC49417c interfaceC49417c) {
            f(interfaceC49417c);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage/landing/mvi/entity/LandingState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<LandingState, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LandingState landingState) {
            OffsetLayout offsetLayout;
            CharSequence charSequenceC;
            int I12;
            int i12 = 0;
            a aVar = LandingFragment.f199475z0;
            LandingFragment landingFragment = LandingFragment.this;
            LandingViewState landingViewState = landingState.f200241q;
            if (landingViewState instanceof LandingViewState.Content) {
                com.avito.android.mortgage.landing.o oVar = landingFragment.f199487y0;
                if (oVar != null) {
                    ArrayList arrayList = ((LandingViewState.Content) landingViewState).f200248c;
                    oVar.f200301b.l(arrayList, null);
                    oVar.f200302c.c(new UV0.c(arrayList));
                }
                com.avito.android.mortgage.landing.o oVar2 = landingFragment.f199487y0;
                if (oVar2 != null) {
                    D6.w(oVar2.f200305f);
                    D6.w(oVar2.f200306g);
                    D6.H(oVar2.f200304e);
                }
                com.avito.android.mortgage.landing.o oVar3 = landingFragment.f199487y0;
                if (oVar3 != null) {
                    oVar3.a(true);
                }
                com.avito.android.mortgage.landing.o oVar4 = landingFragment.f199487y0;
                if (oVar4 != null) {
                    BottomState bottomState = ((LandingViewState.Content) landingViewState).f200249d;
                    boolean zEquals = bottomState.equals(BottomState.NothingFound.f200155b);
                    LinearLayout linearLayout = oVar4.f200322w;
                    ConstraintLayout constraintLayout = oVar4.f200321v;
                    ConstraintLayout constraintLayout2 = oVar4.f200320u;
                    if (zEquals) {
                        D6.g(constraintLayout2);
                        D6.w(constraintLayout);
                        D6.H(linearLayout);
                    } else if (bottomState.equals(BottomState.Placeholders.f200156b)) {
                        D6.g(constraintLayout2);
                        D6.w(linearLayout);
                        D6.H(constraintLayout);
                    } else if (bottomState instanceof BottomState.Content) {
                        D6.w(linearLayout);
                        D6.w(constraintLayout);
                        D6.H(constraintLayout2);
                        BottomState.Content content = (BottomState.Content) bottomState;
                        Object[] objArr = {content.f200152b};
                        Context context = oVar4.f200303d;
                        oVar4.f200323x.setText(context.getString(R.string.landing_value_placeholder, objArr));
                        oVar4.f200324y.setText(context.getString(R.string.landing_price_placeholder, content.f200153c));
                        ArrayList arrayList2 = content.f200154d;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new StackedImageView.b.a((String) it.next(), Integer.valueOf(R.drawable.placeholder_circle_bg), Integer.valueOf(R.drawable.placeholder_circle_bg)));
                        }
                        int size = arrayList2.size();
                        StackedImageView stackedImageView = oVar4.f200325z;
                        if (size <= 4) {
                            int i13 = StackedImageView.f203958k;
                            stackedImageView.a(0, arrayList3);
                        } else {
                            stackedImageView.a(arrayList2.size() - 3, C42745f0.E0(arrayList3, 3));
                        }
                    }
                }
                com.avito.android.mortgage.landing.o oVar5 = landingFragment.f199487y0;
                if (oVar5 != null) {
                    LandingViewHeader landingViewHeader = ((LandingViewState.Content) landingViewState).f200247b;
                    ViewGroup viewGroup = oVar5.f200309j;
                    ViewGroup viewGroup2 = oVar5.f200310k;
                    if (landingViewHeader == null) {
                        D6.w(viewGroup2);
                        D6.H(viewGroup);
                    } else {
                        D6.w(viewGroup);
                        LandingHeaderAction landingHeaderAction = landingViewHeader.f200245e;
                        String title = landingHeaderAction != null ? landingHeaderAction.getTitle() : null;
                        Button button = oVar5.f200314o;
                        com.avito.android.lib.design.button.b.a(button, title, false);
                        LandingHeaderAction landingHeaderAction2 = landingViewHeader.f200246f;
                        String title2 = landingHeaderAction2 != null ? landingHeaderAction2.getTitle() : null;
                        Button button2 = oVar5.f200315p;
                        com.avito.android.lib.design.button.b.a(button2, title2, false);
                        button.setVisibility((landingHeaderAction != null ? landingHeaderAction.getType() : null) != null ? 0 : 8);
                        button2.setVisibility((landingHeaderAction2 != null ? landingHeaderAction2.getType() : null) != null ? 0 : 8);
                        D6.H(viewGroup2);
                        UniversalImage universalImage = landingViewHeader.f200242b;
                        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(oVar5.f200303d)) : null;
                        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault);
                        ImageView imageView = oVar5.f200311l;
                        if (imageDependsOnThemeOrDefault != null) {
                            D6.H(imageView);
                            com.avito.android.image_loader.glide.utils.b.d(imageView, aVarB);
                        } else {
                            D6.w(imageView);
                        }
                        com.avito.android.mortgage.landing.utils.b bVar = oVar5.f200312m;
                        ArrayList arrayList4 = bVar.f200331c;
                        Iterator it2 = arrayList4.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            offsetLayout = bVar.f200329a;
                            if (!zHasNext) {
                                break;
                            }
                            Iterator it3 = ((List) it2.next()).iterator();
                            while (it3.hasNext()) {
                                offsetLayout.removeView((View) it3.next());
                            }
                        }
                        arrayList4.clear();
                        ArrayList arrayList5 = bVar.f200333e;
                        ArrayList arrayList6 = bVar.f200332d;
                        arrayList5.addAll(arrayList6);
                        arrayList6.clear();
                        List<TitlePart> list = landingViewHeader.f200243c;
                        int size2 = list.size();
                        com.avito.android.util.text.a aVar2 = bVar.f200330b;
                        if (size2 == 1 && ((TitlePart) C42745f0.E(list)).d() == TitlePart.TitlePartType.PLAIN) {
                            CharSequence charSequenceC2 = aVar2.c(offsetLayout.getContext(), ((TitlePart) C42745f0.E(list)).getText());
                            if (charSequenceC2 != null && charSequenceC2.length() != 0) {
                                bVar.a(bVar.b(), charSequenceC2);
                            }
                        } else {
                            for (TitlePart titlePart : list) {
                                int i14 = b.a.f200334a[titlePart.d().ordinal()];
                                if (i14 == 1) {
                                    AttributedText text = titlePart.getText();
                                    com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(offsetLayout.getContext(), null, 0, 0, 14, null);
                                    com.avito.android.util.text.j.c(aVar3, text, null);
                                    aVar3.setBackgroundResource(R.drawable.bg_discount_badge_large);
                                    aVar3.setGravity(17);
                                    aVar3.setIncludeFontPadding(false);
                                    aVar3.setPadding(0, y6.b(1), 0, 0);
                                    offsetLayout.addView(aVar3);
                                    List list2 = (List) C42745f0.S(arrayList4);
                                    if (list2 == null) {
                                        arrayList4.add(C42745f0.e0(aVar3));
                                    } else {
                                        list2.add(aVar3);
                                    }
                                } else if (i14 == 2 && (charSequenceC = aVar2.c(offsetLayout.getContext(), titlePart.getText())) != null && charSequenceC.length() != 0) {
                                    TextView textViewB = bVar.b();
                                    int iS2 = D6.s(offsetLayout) - (offsetLayout.getPaddingEnd() + offsetLayout.getPaddingStart());
                                    if (iS2 <= 0) {
                                        int i15 = C35835l0.g(offsetLayout.getContext()).x;
                                        ViewGroup.LayoutParams layoutParams = offsetLayout.getLayoutParams();
                                        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : i12;
                                        ViewGroup.LayoutParams layoutParams2 = offsetLayout.getLayoutParams();
                                        iS2 = (i15 - (marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : i12))) - (offsetLayout.getPaddingEnd() + offsetLayout.getPaddingStart());
                                    }
                                    List list3 = (List) C42745f0.S(arrayList4);
                                    if (list3 != null) {
                                        Iterator it4 = list3.iterator();
                                        I12 = i12;
                                        while (it4.hasNext()) {
                                            I12 += D6.I((View) it4.next());
                                        }
                                    } else {
                                        I12 = i12;
                                    }
                                    int i16 = iS2 - I12;
                                    if (i16 > 0) {
                                        iS2 = i16;
                                    }
                                    StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequenceC, i12, charSequenceC.length(), textViewB.getPaint(), iS2).build();
                                    bVar.a(textViewB, charSequenceC.subSequence(staticLayoutBuild.getLineStart(i12), staticLayoutBuild.getLineEnd(i12)));
                                    int lineCount = staticLayoutBuild.getLineCount();
                                    for (int i17 = 1; i17 < lineCount; i17++) {
                                        bVar.a(bVar.b(), charSequenceC.subSequence(staticLayoutBuild.getLineStart(i17), staticLayoutBuild.getLineEnd(i17)));
                                    }
                                }
                                i12 = 0;
                            }
                        }
                        com.avito.android.util.text.j.a(oVar5.f200313n, landingViewHeader.f200244d, null);
                    }
                }
            } else if (L.f(landingViewState, LandingViewState.Error.f200250b)) {
                com.avito.android.mortgage.landing.o oVar6 = landingFragment.f199487y0;
                if (oVar6 != null) {
                    D6.w(oVar6.f200304e);
                    D6.w(oVar6.f200305f);
                    D6.H(oVar6.f200306g);
                }
                com.avito.android.mortgage.landing.o oVar7 = landingFragment.f199487y0;
                if (oVar7 != null) {
                    oVar7.a(false);
                }
            } else if (L.f(landingViewState, LandingViewState.Loading.f200251b)) {
                com.avito.android.mortgage.landing.o oVar8 = landingFragment.f199487y0;
                if (oVar8 != null) {
                    D6.w(oVar8.f200304e);
                    D6.w(oVar8.f200306g);
                    D6.H(oVar8.f200305f);
                }
                com.avito.android.mortgage.landing.o oVar9 = landingFragment.f199487y0;
                if (oVar9 != null) {
                    oVar9.a(false);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC49409a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC49409a interfaceC49409a) {
            ((com.avito.android.mortgage.landing.q) this.receiver).accept(interfaceC49409a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.C49411c.f441098a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.h.f441102a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.u.f441119a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.l.f441108a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(InterfaceC49409a.v.f441120a);
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<Boolean, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            LandingFragment landingFragment = LandingFragment.this;
            if (zBooleanValue) {
                com.avito.android.mortgage.landing.o oVar = landingFragment.f199487y0;
                if (oVar != null) {
                    oVar.f200319t.animate().translationY(r4.getHeight()).setDuration(150L).start();
                }
            } else {
                com.avito.android.mortgage.landing.o oVar2 = landingFragment.f199487y0;
                if (oVar2 != null) {
                    oVar2.f200319t.animate().translationY(0.0f).setDuration(150L).start();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw00/a;", "it", "Lkotlin/G0;", "invoke", "(Lw00/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<InterfaceC49409a, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC49409a interfaceC49409a) {
            a aVar = LandingFragment.f199475z0;
            LandingFragment.this.q5().accept(interfaceC49409a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f199498l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f199498l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f199498l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<Fragment> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return LandingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f199500l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f199500l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f199500l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f199501l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f199501l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f199501l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f199502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f199502l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f199502l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/landing/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<com.avito.android.mortgage.landing.q> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.landing.q invoke() {
            com.avito.android.mortgage.landing.r rVar = LandingFragment.this.f199476n0;
            if (rVar == null) {
                rVar = null;
            }
            return (com.avito.android.mortgage.landing.q) rVar.get();
        }
    }

    public LandingFragment() {
        super(0, 1, null);
        m mVar = new m(new r());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new o(new n()));
        this.f199477o0 = new O0(m0.f406844a.b(com.avito.android.mortgage.landing.q.class), new p(interfaceC42726CB), mVar, new q(interfaceC42726CB));
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        SelectItem.Option option;
        Iterator it = list.iterator();
        do {
            option = null;
            if (!it.hasNext()) {
                break;
            }
            ParcelableEntity parcelableEntity = (ParcelableEntity) it.next();
            if (parcelableEntity instanceof SelectItem.Option) {
                option = (SelectItem.Option) parcelableEntity;
            }
        } while (option == null);
        if (option == null) {
            return;
        }
        q5().accept(new InterfaceC49409a.G(str, option));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getF21241d().a(this, new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f199479q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.landing_layout, viewGroup, false);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f199479q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, LandingFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/landing/mvi/entity/LandingOneTimeEvent;)V", 0), new d());
        Set<RecyclerView.l> set = this.f199480r0;
        if (set == null) {
            set = null;
        }
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f199485w0;
        com.avito.konveyor.item_visibility_tracker.b bVar2 = bVar != null ? bVar : null;
        com.avito.konveyor.adapter.d dVar = this.f199481s0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.util.text.a aVar = this.f199482t0;
        com.avito.android.util.text.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f199483u0;
        com.avito.android.mortgage.landing.o oVar = new com.avito.android.mortgage.landing.o(viewInflate, dVar2, bVar2, aVar2, set, aVar3 != null ? aVar3 : null, C22984Q.a(getViewLifecycleOwner()), new e(1, q5(), com.avito.android.mortgage.landing.q.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        oVar.f200316q.setNavigationOnClickListener(new com.avito.android.mortgage.applicant_type.a(4, new f()));
        oVar.f200308i.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(3, new g()));
        oVar.f200319t.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(25, oVar, new h()));
        oVar.f200314o.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(2, new i()));
        oVar.f200315p.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(1, new j()));
        this.f199487y0 = oVar;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f199487y0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC48753a interfaceC48753a = this.f199484v0;
        if (interfaceC48753a == null) {
            interfaceC48753a = null;
        }
        bundle.putParcelable("scroll_state", interfaceC48753a.getF439721a());
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f199485w0;
        bundle.putBundle("visibility_tracker_state", (bVar != null ? bVar : null).d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(InterfaceC49409a.s.f441116a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        q5().accept(InterfaceC49409a.r.f441115a);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f199479q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Kundle kundle;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageLandingScreen.f90423d, s.c(this), null, 4, null);
        i.a aVarA = com.avito.android.mortgage.landing.di.a.a();
        com.avito.android.mortgage.di.o oVar = (com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class);
        com.avito.android.mortgage.landing.di.j jVar = (com.avito.android.mortgage.landing.di.j) C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        LandingArguments landingArguments = (LandingArguments) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("landing_argument", LandingArguments.class) : bundleRequireArguments.getParcelable("landing_argument"));
        if (bundle != null) {
            kundle = (Kundle) (i12 >= 34 ? (Parcelable) bundle.getParcelable("scroll_state", Kundle.class) : bundle.getParcelable("scroll_state"));
        } else {
            kundle = null;
        }
        aVarA.a(oVar, jVar, interfaceC39417aB, c28478k, landingArguments, kundle, bundle != null ? bundle.getBundle("visibility_tracker_state") : null, new k(), new l()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f199479q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.mortgage.landing.q q5() {
        return (com.avito.android.mortgage.landing.q) this.f199477o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
