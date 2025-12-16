package com.avito.android.rating.details;

import Cd.C13243a;
import Cg0.InterfaceC13303a;
import Dh0.InterfaceC13400a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.adapter.analytic.GalleryFromBlock;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.floating_buy_block.FloatingBuyBlockItem;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.photo_gallery.F;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating.RatingDetailsScreen;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.rating.details.answer.a;
import com.avito.android.rating.details.di.b;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating.details.mvi.entity.b;
import com.avito.android.rating.details.text_sheet.TextSheetArguments;
import com.avito.android.rating.details.text_sheet.TextSheetDialog;
import com.avito.android.rating.summary.RatingSummaryActivity;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.recycler.layout_manager.UnpredictiveLinearLayoutManager;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.screenshot_observer.a;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import fn0.C40450a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import z1.AbstractC50339a;

/* compiled from: RatingDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingDetailsFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public static final C34165a f246422S0 = new C34165a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.info_screen.b f246423A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public F f246424B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public C40450a f246425C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f246426D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.screenshot_observer.a f246427E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.details.answer.a f246428F0;

    /* renamed from: G0, reason: collision with root package name */
    public androidx.view.result.h<a.C7394a> f246429G0;

    /* renamed from: H0, reason: collision with root package name */
    public AppBarLayoutWithTextAction f246430H0;

    /* renamed from: I0, reason: collision with root package name */
    public C42670a f246431I0;

    /* renamed from: J0, reason: collision with root package name */
    public SwipeRefreshLayout f246432J0;

    /* renamed from: K0, reason: collision with root package name */
    public RecyclerView f246433K0;

    /* renamed from: L0, reason: collision with root package name */
    public FloatingContainer f246434L0;

    /* renamed from: M0, reason: collision with root package name */
    public FrameLayout f246435M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public KE.a f246436N0;

    /* renamed from: O0, reason: collision with root package name */
    public View f246437O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.rating_ui.reviews_options.c f246438P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f246439Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f246440R0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.arch.mvi.b<RatingDetailsInternalAction> f246441t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.details.s f246442u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f246443v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f246444w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f246445x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f246446y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.rating.g f246447z0;

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ z f246448l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(z zVar) {
            super(0);
            this.f246448l = zVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f246448l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246449l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246449l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f246449l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f246450l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f246450l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f246450l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating/details/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating/details/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D extends N implements Y41.a<com.avito.android.rating.details.r> {
        public D() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.rating.details.r invoke() {
            com.avito.android.rating.details.s sVar = RatingDetailsFragment.this.f246442u0;
            if (sVar == null) {
                sVar = null;
            }
            return (com.avito.android.rating.details.r) sVar.get();
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "", "RECYCLER_VIEW_PADDING_BOTTOM_WITHOUT_COMMENT_BUTTON", "I", "RECYCLER_VIEW_PADDING_BOTTOM_WITH_COMMENT_BUTTON", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.RatingDetailsFragment$a, reason: case insensitive filesystem */
    public static final class C34165a {
        public /* synthetic */ C34165a(C42822w c42822w) {
            this();
        }

        public C34165a() {
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/rating/details/RatingDetailsArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.RatingDetailsFragment$b, reason: case insensitive filesystem */
    public static final class C34166b extends N implements Y41.a<RatingDetailsArguments> {
        public C34166b() {
            super(0);
        }

        @Override // Y41.a
        public final RatingDetailsArguments invoke() {
            Bundle bundleRequireArguments = RatingDetailsFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_arguments", RatingDetailsArguments.class) : bundleRequireArguments.getParcelable("key_arguments");
            if (parcelable != null) {
                return (RatingDetailsArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.RatingDetailsFragment$c, reason: case insensitive filesystem */
    public /* synthetic */ class C34167c extends H implements Y41.l<InterfaceC13303a, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, com.avito.android.lib.design.floating_container.FloatingContainer] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.w] */
        /* JADX WARN: Type inference failed for: r4v1, types: [com.avito.android.rating.info_screen.b] */
        /* JADX WARN: Type inference failed for: r4v2 */
        public final void f(@Y61.k InterfaceC13303a interfaceC13303a) throws Resources.NotFoundException {
            f.c cVarB;
            DeepLink deepLink;
            com.avito.android.lib.design.bottom_sheet.q qVar;
            int i12 = 16;
            RatingDetailsFragment ratingDetailsFragment = (RatingDetailsFragment) this.receiver;
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            ratingDetailsFragment.getClass();
            int i13 = 0;
            if (interfaceC13303a instanceof InterfaceC13303a.l) {
                InterfaceC13303a.l lVar = (InterfaceC13303a.l) interfaceC13303a;
                com.avito.android.rating_ui.reviews_options.c cVar = ratingDetailsFragment.f246438P0;
                if (cVar != null) {
                    cVar.r();
                }
                View view = ratingDetailsFragment.f246437O0;
                com.avito.android.rating_ui.reviews_options.c cVar2 = new com.avito.android.rating_ui.reviews_options.c((view != null ? view : null).getContext());
                I5.a(cVar2.f250404E, ratingDetailsFragment.getResources().getString(R.string.reviews_sort), false);
                for (SearchParametersEntry.SearchParametersBlock.Sort.SortOption sortOption : lVar.f2603b) {
                    String label = sortOption.getLabel();
                    boolean zF2 = L.f(sortOption.getValue(), lVar.f2602a);
                    com.avito.android.rating.details.l lVar2 = new com.avito.android.rating.details.l(ratingDetailsFragment, sortOption, cVar2);
                    View viewV = cVar2.V(label, zF2);
                    viewV.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(11, lVar2));
                    cVar2.f250405F.addView(viewV);
                }
                ratingDetailsFragment.f246438P0 = cVar2;
                com.avito.android.lib.util.g.a(cVar2);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.j) {
                InterfaceC13303a.j jVar = (InterfaceC13303a.j) interfaceC13303a;
                com.avito.android.rating_ui.reviews_options.c cVar3 = ratingDetailsFragment.f246438P0;
                if (cVar3 != null) {
                    cVar3.r();
                }
                View view2 = ratingDetailsFragment.f246437O0;
                com.avito.android.rating_ui.reviews_options.c cVar4 = new com.avito.android.rating_ui.reviews_options.c((view2 != null ? view2 : null).getContext());
                I5.a(cVar4.f250404E, jVar.f2599c, false);
                for (BaseRatingReviewItem.ReviewAction reviewAction : jVar.f2598b) {
                    com.avito.android.rating.details.k kVar = new com.avito.android.rating.details.k(cVar4, ratingDetailsFragment, jVar.f2597a, reviewAction);
                    View viewV2 = cVar4.V(reviewAction.f250247c.f250269b, false);
                    viewV2.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(15, (Object) kVar, (Object) reviewAction));
                    cVar4.f250405F.addView(viewV2);
                }
                ratingDetailsFragment.f246438P0 = cVar4;
                com.avito.android.lib.util.g.a(cVar4);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.h) {
                InterfaceC13303a.h hVar = (InterfaceC13303a.h) interfaceC13303a;
                com.avito.android.rating_ui.reviews_options.c cVar5 = ratingDetailsFragment.f246438P0;
                if (cVar5 != null) {
                    cVar5.r();
                }
                View view3 = ratingDetailsFragment.f246437O0;
                com.avito.android.rating_ui.reviews_options.c cVar6 = new com.avito.android.rating_ui.reviews_options.c((view3 != null ? view3 : null).getContext());
                com.avito.android.rating_ui.reviews.model_review.a aVar = hVar.f2594a;
                List<ModelAction> actions = aVar.getActions();
                if (actions != null) {
                    for (ModelAction modelAction : actions) {
                        com.avito.android.rating.details.j jVar2 = new com.avito.android.rating.details.j(ratingDetailsFragment, aVar, modelAction, cVar6);
                        View viewV3 = cVar6.V(modelAction.f250138c.f250143b, false);
                        viewV3.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(i12, (Object) jVar2, (Object) modelAction));
                        cVar6.f250405F.addView(viewV3);
                    }
                }
                ratingDetailsFragment.f246438P0 = cVar6;
                com.avito.android.lib.util.g.a(cVar6);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.b) {
                androidx.view.result.h<a.C7394a> hVar2 = ratingDetailsFragment.f246429G0;
                InterfaceC13303a.b bVar = (InterfaceC13303a.b) interfaceC13303a;
                (hVar2 != null ? hVar2 : null).b(new a.C7394a(bVar.f2583a, bVar.f2584b));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.m) {
                TextSheetDialog.a aVar2 = TextSheetDialog.f247525s0;
                TextSheetArguments textSheetArguments = new TextSheetArguments(((InterfaceC13303a.m) interfaceC13303a).f2604a);
                aVar2.getClass();
                TextSheetDialog.a.a(textSheetArguments).show(ratingDetailsFragment.getParentFragmentManager(), "TextSheetDialog");
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.d) {
                InterfaceC13303a.d dVar = (InterfaceC13303a.d) interfaceC13303a;
                a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
                Context contextRequireContext = ratingDetailsFragment.requireContext();
                com.avito.android.rating.details.i iVar = new com.avito.android.rating.details.i(dVar.f2588b, ratingDetailsFragment, dVar.f2587a);
                c5284a.getClass();
                com.avito.android.lib.util.g.a(a.C5284a.a(contextRequireContext, 0, R.style.Re23_Modal_Default, iVar));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.c) {
                InterfaceC13303a.c cVar7 = (InterfaceC13303a.c) interfaceC13303a;
                a.C5284a c5284a2 = com.avito.android.lib.design.modal.a.f179704d;
                Context contextRequireContext2 = ratingDetailsFragment.requireContext();
                com.avito.android.rating.details.f fVar = new com.avito.android.rating.details.f(cVar7.f2586b, ratingDetailsFragment, cVar7.f2585a);
                c5284a2.getClass();
                com.avito.android.lib.util.g.a(a.C5284a.a(contextRequireContext2, 0, R.style.Re23_Modal_Default, fVar));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.e) {
                InterfaceC13303a.e eVar = (InterfaceC13303a.e) interfaceC13303a;
                F f12 = ratingDetailsFragment.f246424B0;
                if (f12 == null) {
                    f12 = null;
                }
                ratingDetailsFragment.startActivity(f12.b(eVar.f2589a, eVar.f2590b, false, null));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.f) {
                InterfaceC13303a.f fVar2 = (InterfaceC13303a.f) interfaceC13303a;
                com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(ratingDetailsFragment.requireContext(), R.style.Theme_DesignSystem_Re23), i13, 2, );
                dVar2.D(R.layout.rating_info_hint, true);
                boolean z12 = ratingDetailsFragment.getResources().getBoolean(R.bool.is_tablet);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true ^ z12, 7);
                if (z12 && (qVar = dVar2.f178530x) != null) {
                    qVar.y(0);
                }
                dVar2.S(ratingDetailsFragment.getResources().getDimensionPixelOffset(R.dimen.dialog_peek_height));
                TextView textView = (TextView) dVar2.findViewById(R.id.title);
                RatingInfoWithHintItem.Hint hint = fVar2.f2591a;
                I5.a(textView, hint.f250029b, false);
                I5.a((TextView) dVar2.findViewById(R.id.text), hint.f250030c, false);
                ?? r02 = (FloatingContainer) dVar2.findViewById(R.id.button);
                String str = hint.f250031d;
                if (str == null || str.length() == 0 || (deepLink = hint.f250032e) == null) {
                    D6.w(r02);
                } else {
                    r02.a(str);
                    D6.H(r02);
                    r02.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(ratingDetailsFragment, deepLink, dVar2, 12));
                }
                com.avito.android.lib.util.g.a(dVar2);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.i) {
                com.avito.android.rating.g gVar = ratingDetailsFragment.f246447z0;
                com.avito.android.rating.g gVar2 = gVar != null ? gVar : null;
                InterfaceC13303a.i iVar2 = (InterfaceC13303a.i) interfaceC13303a;
                ArrayList arrayList = iVar2.f2596b;
                gVar2.getClass();
                RatingSummaryActivity.f247640n.getClass();
                ratingDetailsFragment.startActivity(new Intent(gVar2.f247574a, (Class<?>) RatingSummaryActivity.class).putExtra("KEY_TITLE", iVar2.f2595a).putParcelableArrayListExtra("KEY_SUMMARY_SCORES_DATA", C35755b0.a(arrayList)));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.r) {
                InterfaceC13303a.r rVar = (InterfaceC13303a.r) interfaceC13303a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(rVar.f2613a);
                String str2 = rVar.f2614b;
                ratingDetailsFragment.F5(printableTextF, str2 != null ? com.avito.android.printable_text.b.f(str2) : null, rVar.f2615c, f.a.f125253a, rVar.f2616d, null);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.q) {
                InterfaceC13303a.q qVar2 = (InterfaceC13303a.q) interfaceC13303a;
                Throwable th2 = qVar2.f2608b;
                if (th2 != null) {
                    cVarB = new f.c(th2);
                } else {
                    f.c.f125255c.getClass();
                    cVarB = f.c.a.b();
                }
                com.avito.android.rating.details.mvi.entity.a aVar3 = qVar2.f2611e;
                ratingDetailsFragment.F5(qVar2.f2607a, qVar2.f2609c, qVar2.f2610d, cVarB, qVar2.f2612f, aVar3 != null ? new i(new c(ratingDetailsFragment, aVar3)) : null);
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.k) {
                C40450a c40450a = ratingDetailsFragment.f246425C0;
                if (c40450a == null) {
                    c40450a = null;
                }
                InterfaceC13303a.k kVar2 = (InterfaceC13303a.k) interfaceC13303a;
                RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) ratingDetailsFragment.f246440R0.getValue();
                RatingDetailsArguments.ItemReviews itemReviews = ratingDetailsArguments instanceof RatingDetailsArguments.ItemReviews ? (RatingDetailsArguments.ItemReviews) ratingDetailsArguments : null;
                String strValueOf = String.valueOf(itemReviews != null ? Long.valueOf(itemReviews.f246412f) : null);
                GalleryFromBlock[] galleryFromBlockArr = GalleryFromBlock.f68396b;
                ratingDetailsFragment.startActivity(c40450a.a(kVar2.f2600a, kVar2.f2601b, strValueOf, "reviews"));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.n) {
                if (Build.VERSION.SDK_INT >= 30) {
                    RecyclerView recyclerView = ratingDetailsFragment.f246433K0;
                    (recyclerView != null ? recyclerView : null).performHapticFeedback(16);
                    return;
                }
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.g) {
                com.avito.android.rating.info_screen.b bVar2 = ratingDetailsFragment.f246423A0;
                 = bVar2 != null ? bVar2 : 0;
                InterfaceC13303a.g gVar3 = (InterfaceC13303a.g) interfaceC13303a;
                BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue = gVar3.f2593b;
                ratingDetailsFragment.startActivity(a(gVar3.f2592a, reviewActionValue.f250281n, reviewActionValue.f250282o));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.p) {
                ratingDetailsFragment.E5().accept(new a.w(((InterfaceC13303a.p) interfaceC13303a).f2606a));
                return;
            }
            if (interfaceC13303a instanceof InterfaceC13303a.C0120a) {
                ratingDetailsFragment.D5();
            } else if (interfaceC13303a instanceof InterfaceC13303a.o) {
                com.avito.android.rating.details.r rVarE5 = ratingDetailsFragment.E5();
                b.e.C7423b c7423b = b.e.C7423b.f247441a;
                ((InterfaceC13303a.o) interfaceC13303a).getClass();
                rVarE5.accept(new a.s(c7423b, true));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC13303a interfaceC13303a) throws Resources.NotFoundException {
            f(interfaceC13303a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.RatingDetailsFragment$d, reason: case insensitive filesystem */
    public /* synthetic */ class C34168d extends H implements Y41.l<com.avito.android.rating.details.mvi.entity.b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(@Y61.k com.avito.android.rating.details.mvi.entity.b bVar) {
            RatingDetailsFragment ratingDetailsFragment = (RatingDetailsFragment) this.receiver;
            SwipeRefreshLayout swipeRefreshLayout = ratingDetailsFragment.f246432J0;
            if (swipeRefreshLayout == null) {
                swipeRefreshLayout = null;
            }
            b.e eVar = bVar.f247429l;
            swipeRefreshLayout.setRefreshing(eVar instanceof b.e.C7423b);
            if (eVar instanceof b.e.a) {
                C42670a c42670a = ratingDetailsFragment.f246431I0;
                C42670a.d(c42670a != null ? c42670a : null);
                return;
            }
            if (bVar.f247430m) {
                C42670a c42670a2 = ratingDetailsFragment.f246431I0;
                if (c42670a2 == null) {
                    c42670a2 = null;
                }
                c42670a2.c(null, new com.avito.android.rating.details.m(ratingDetailsFragment));
                return;
            }
            List<com.avito.conveyor_item.a> list = bVar.f247419b;
            if (list.isEmpty() && (((RatingDetailsArguments) ratingDetailsFragment.f246440R0.getValue()) instanceof RatingDetailsArguments.UserReviews)) {
                C42670a c42670a3 = ratingDetailsFragment.f246431I0;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.c(null, new com.avito.android.rating.details.n(bVar, ratingDetailsFragment));
                return;
            }
            C42670a c42670a4 = ratingDetailsFragment.f246431I0;
            if (c42670a4 == null) {
                c42670a4 = null;
            }
            c42670a4.b();
            com.avito.android.recycler.data_aware.c cVar = ratingDetailsFragment.f246445x0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.c(new UV0.c(list));
            ratingDetailsFragment.f246439Q0 = bVar.f247421d != null;
            Object[] objArr = ratingDetailsFragment.f246436N0 != null;
            b.a aVar = bVar.f247423f;
            Action action = aVar.f247432b;
            boolean z12 = ((action != null ? action.getDeepLink() : null) == null || objArr == true) ? false : true;
            FloatingContainer floatingContainer = ratingDetailsFragment.f246434L0;
            FloatingContainer floatingContainer2 = floatingContainer == null ? null : floatingContainer;
            if (floatingContainer == null) {
                floatingContainer = null;
            }
            floatingContainer2.a(aVar.f247431a.k0(floatingContainer.getContext()));
            FloatingContainer floatingContainer3 = ratingDetailsFragment.f246434L0;
            if (floatingContainer3 == null) {
                floatingContainer3 = null;
            }
            D6.G(floatingContainer3, z12);
            int iB2 = (z12 || objArr == true) ? y6.b(104) : y6.b(24);
            RecyclerView recyclerView = ratingDetailsFragment.f246433K0;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iB2);
            boolean z13 = aVar.f247433c;
            if (z12) {
                FloatingContainer floatingContainer4 = ratingDetailsFragment.f246434L0;
                if (floatingContainer4 == null) {
                    floatingContainer4 = null;
                }
                int i12 = C35835l0.g(floatingContainer4.getContext()).y;
                FloatingContainer floatingContainer5 = ratingDetailsFragment.f246434L0;
                if (floatingContainer5 == null) {
                    floatingContainer5 = null;
                }
                int top = i12 - floatingContainer5.getTop();
                if (z13) {
                    top = 0;
                }
                FloatingContainer floatingContainer6 = ratingDetailsFragment.f246434L0;
                if (floatingContainer6 == null) {
                    floatingContainer6 = null;
                }
                floatingContainer6.animate().translationY(top).setDuration(300L).start();
            }
            boolean z14 = (z12 && z13) || objArr == true;
            if (ratingDetailsFragment.isAdded() && !ratingDetailsFragment.isDetached() && ratingDetailsFragment.getView() != null && ratingDetailsFragment.getViewLifecycleOwner().getLifecycle().getF46705d().a(Lifecycle.State.f46682e)) {
                ratingDetailsFragment.getParentFragmentManager().o0(C22777e.b(new Q("extended_profile_tabs_result_bundle_floating_buttons", Boolean.valueOf(z14))), "extended_profile_tab_floating_buttons_result");
            }
            AppBarLayoutWithTextAction appBarLayoutWithTextAction = ratingDetailsFragment.f246430H0;
            if (appBarLayoutWithTextAction == null) {
                appBarLayoutWithTextAction = null;
            }
            Action action2 = bVar.f247428k;
            appBarLayoutWithTextAction.setAction(action2 != null ? action2.getTitle() : null);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.rating.details.mvi.entity.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating/details/RatingDetailsFragment$e", "Lru/avito/component/toolbar/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements ru.avito.component.toolbar.a {
        public e() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.D5();
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.r.f247405a);
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f246454l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f246454l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f246454l.findViewById(R.id.rating_details_recycler);
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Boolean> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(RatingDetailsFragment.this.f246439Q0);
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating.details.RatingDetailsFragment$onViewCreated$4$2", f = "RatingDetailsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f246456q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = RatingDetailsFragment.this.new h(continuation);
            hVar.f246456q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((h) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Boolean bool = (Boolean) this.f246456q;
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.e(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i implements i.b, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f246458b;

        public i(Y41.a aVar) {
            this.f246458b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof i.b) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f246458b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f246458b;
        }

        public final int hashCode() {
            return this.f246458b.hashCode();
        }

        @Override // com.avito.android.lib.design.toast_bar.i.b
        public final /* synthetic */ void invoke() {
            this.f246458b.invoke();
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem;", "item", "", "pos", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/adapter/gallery/GalleryItem;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.p<GalleryItem, Integer, G0> {
        public j() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(GalleryItem galleryItem, Integer num) {
            int iIntValue = num.intValue();
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.h(galleryItem, iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_ui/info_with_hint/RatingInfoWithHintItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<RatingInfoWithHintItem, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RatingInfoWithHintItem ratingInfoWithHintItem) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.k(ratingInfoWithHintItem));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/adapter/RatingDetailsItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/adapter/RatingDetailsItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<RatingDetailsItem, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RatingDetailsItem ratingDetailsItem) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.o(ratingDetailsItem));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.l<DeepLink, G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.q(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<DeepLink, G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.p(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating/details/RatingDetailsFragment$o", "Lcom/avito/android/screenshot_observer/a$a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o implements a.InterfaceC7827a {
        public o() {
        }

        @Override // com.avito.android.screenshot_observer.a.InterfaceC7827a
        public final void R1(@Y61.k Uri uri) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.z.f247416a);
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh0/a;", "it", "Lkotlin/G0;", "invoke", "(LDh0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.l<InterfaceC13400a, G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13400a interfaceC13400a) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.y(interfaceC13400a));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.l<Long, G0> {
        public q() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.C34180b(jLongValue));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<G0> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.C34181c.f247386a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends N implements Y41.l<String, G0> {
        public s() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.B.f247381a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends N implements Y41.l<String, G0> {
        public t() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(new a.l(str));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends N implements Y41.a<G0> {
        public u() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.D.f247383a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends N implements Y41.a<G0> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.m.f247399a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends N implements Y41.a<G0> {
        public w() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(a.x.f247414a);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.rating.details.mvi.entity.a f246474m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(com.avito.android.rating.details.mvi.entity.a aVar) {
            super(0);
            this.f246474m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            C34165a c34165a = RatingDetailsFragment.f246422S0;
            RatingDetailsFragment.this.E5().accept(this.f246474m);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f246475l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Y41.a aVar) {
            super(0);
            this.f246475l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f246475l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends N implements Y41.a<Fragment> {
        public z() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return RatingDetailsFragment.this;
        }
    }

    public RatingDetailsFragment() {
        super(R.layout.fragment_rating_details);
        y yVar = new y(new D());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new A(new z()));
        this.f246443v0 = new O0(m0.f406844a.b(com.avito.android.rating.details.r.class), new B(interfaceC42726CB), yVar, new C(interfaceC42726CB));
        this.f246440R0 = C42727D.c(new C34166b());
    }

    public final void D5() {
        androidx.view.y f21241d;
        if (q5() != null) {
            r5();
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || (f21241d = activityC22955mL1.getF21241d()) == null) {
            return;
        }
        f21241d.c();
    }

    public final com.avito.android.rating.details.r E5() {
        return (com.avito.android.rating.details.r) this.f246443v0.getValue();
    }

    public final void F5(PrintableText printableText, PrintableText printableText2, com.avito.android.rating.details.mvi.entity.a aVar, com.avito.android.component.toast.f fVar, int i12, i.b bVar) {
        c.a.C3719a c3719a = (printableText2 == null || aVar == null) ? null : new c.a.C3719a(printableText2.k0(requireContext()), true, null, new x(aVar), 4, null);
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        RecyclerView recyclerView = this.f246433K0;
        com.avito.android.component.toast.c.b(cVar, recyclerView == null ? null : recyclerView, printableText, null, c3719a != null ? Collections.singletonList(c3719a) : null, null, fVar, i12, null, null, false, false, bVar, null, 3018);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f246426D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f246426D0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, E5(), new C34167c(1, this, RatingDetailsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/details/mvi/entity/RatingDetailsOneTimeEvent;)V", 0), new C34168d(1, this, RatingDetailsFragment.class, "render", "render(Lcom/avito/android/rating/details/mvi/entity/RatingDetailsState;)V", 0));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.screenshot_observer.a aVar = this.f246427E0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.screenshot_observer.a aVar = this.f246427E0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        com.avito.android.rating_ui.reviews_options.c cVar = this.f246438P0;
        if (cVar != null) {
            cVar.r();
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        int i12 = 0;
        super.onViewCreated(view, bundle);
        this.f246437O0 = view.findViewById(R.id.rating_details_screen_root);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = (AppBarLayoutWithTextAction) view.findViewById(R.id.rating_details_app_bar);
        CollapsingTitleAppBarLayout.m(appBarLayoutWithTextAction, R.drawable.ic_back_24);
        appBarLayoutWithTextAction.setClickListener(new e());
        this.f246430H0 = appBarLayoutWithTextAction;
        appBarLayoutWithTextAction.setActionTextStyle(C35835l0.j(R.attr.textM10, view.getContext()));
        AppBarLayoutWithTextAction appBarLayoutWithTextAction2 = this.f246430H0;
        if (appBarLayoutWithTextAction2 == null) {
            appBarLayoutWithTextAction2 = null;
        }
        appBarLayoutWithTextAction2.setActionTextColor(C35835l0.d(R.attr.blue600, view.getContext()));
        InterfaceC42726C interfaceC42726C = this.f246440R0;
        this.f246431I0 = new C42670a((ViewGroup) view.findViewById(R.id.rating_details_progress_overlay_container), new f(view), ((RatingDetailsArguments) interfaceC42726C.getValue()) instanceof RatingDetailsArguments.UserReviews ? R.layout.rating_details_user_reviews_skeleton : R.layout.rating_details_skeleton);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.rating_details_refresh);
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(R.attr.blue, swipeRefreshLayout.getContext()), C35835l0.d(R.attr.violet, swipeRefreshLayout.getContext()), C35835l0.d(R.attr.green, swipeRefreshLayout.getContext()), C35835l0.d(R.attr.red, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new a(this));
        this.f246432J0 = swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rating_details_recycler);
        com.avito.konveyor.adapter.j jVar = this.f246444w0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new UnpredictiveLinearLayoutManager());
        recyclerView.setItemAnimator(new ru.avito.component.animator.k(false, 1, null));
        com.avito.konveyor.a aVar = this.f246446y0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView.l(new com.avito.android.rating.details.adapter.e(aVar), -1);
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(Boolean.TRUE), new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.gig_shift_action.ui.a(4, recyclerView, new g())));
        zVarQ.getClass();
        C43175k.K(new C43197r1(new h(null), kotlinx.coroutines.rx3.y.a(zVarQ.D(io.reactivex.rxjava3.internal.functions.a.f401991a))), C22981N.a(getLifecycle()));
        this.f246433K0 = recyclerView;
        ScreenPerformanceTracker screenPerformanceTracker = this.f246426D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        FloatingContainer floatingContainer = (FloatingContainer) view.findViewById(R.id.rating_details_comment_button);
        floatingContainer.setOnClickListener(new b(this, i12));
        this.f246434L0 = floatingContainer;
        this.f246435M0 = (FrameLayout) view.findViewById(R.id.rating_details_floating_buy_block_container);
        RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) interfaceC42726C.getValue();
        RatingDetailsArguments.PublicProfileRating publicProfileRating = ratingDetailsArguments instanceof RatingDetailsArguments.PublicProfileRating ? (RatingDetailsArguments.PublicProfileRating) ratingDetailsArguments : null;
        FloatingBuyBlock floatingBuyBlock = publicProfileRating != null ? publicProfileRating.f246418i : null;
        if (floatingBuyBlock != null) {
            FrameLayout frameLayout = this.f246435M0;
            if (frameLayout == null) {
                frameLayout = null;
            }
            this.f246436N0 = new KE.a(frameLayout, new com.avito.android.rating.details.o(this), com.avito.android.rating.details.p.f247522l);
            FloatingBuyBlockItem floatingBuyBlockItem = new FloatingBuyBlockItem(floatingBuyBlock.getTitle(), floatingBuyBlock.getPrice(), floatingBuyBlock.getImagePreviewUrl(), floatingBuyBlock.getBuyButtonDeepLink());
            KE.a aVar2 = this.f246436N0;
            if (aVar2 != null) {
                aVar2.c(floatingBuyBlockItem);
            }
            FrameLayout frameLayout2 = this.f246435M0;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            D6.H(frameLayout2);
            KE.a aVar3 = this.f246436N0;
            if (aVar3 != null) {
                aVar3.a();
            }
        }
        getParentFragmentManager().p0("text_sheet_request_key", this, new a(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f246426D0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        b.a aVarQi = ((b.InterfaceC7417b) C29972i.a(C29972i.b(this), b.InterfaceC7417b.class)).Qi();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Resources resources = getResources();
        RatingDetailsArguments ratingDetailsArguments = (RatingDetailsArguments) this.f246440R0.getValue();
        RatingDetailsScreen ratingDetailsScreen = RatingDetailsScreen.f246402d;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        ratingDetailsScreen.getClass();
        aVarQi.a(activityC22955mRequireActivity, resources, ratingDetailsArguments, new C28478k(ratingDetailsScreen, rVarC, RatingDetailsScreen.f246403e), cv.c.d(this), bundle != null, new p(), new q(), new r(), new s(), new t(), new u(), new v(), new w(), new j(), new k(), new l(), new m(), new n(), new o(), getF42820b()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f246426D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f246426D0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.rating.details.answer.a aVar = this.f246428F0;
        this.f246429G0 = registerForActivityResult(aVar != null ? aVar : null, new L91.o(this, 24));
    }
}
