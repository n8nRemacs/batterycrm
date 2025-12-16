package com.avito.android.publish.details;

import af0.InterfaceC19882a;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.view.C23060r0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.f;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublishSlotUpdateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.details.b;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_cache.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.beduin.custom_actions.ContinuePublishAction;
import com.avito.android.publish.details.beduin.custom_actions.a;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.publish.slots.contact_info.d;
import com.avito.android.publish.uxfeedback_helper.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MultipleIntParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TextualTag;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.base.BaseEditableParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasTags;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.ParameterHolder;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import com.avito.android.ux.feedback.impl.x;
import com.avito.android.validation.InterfaceC36030r0;
import com.avito.android.validation.l1;
import com.avito.android.validation.n1;
import gj.InterfaceC40691b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kv.C43501a;
import okhttp3.internal.Util;
import xM.C49860a;

/* compiled from: PublishDetailsViewModel.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/details/K1;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/ItemDetailsView$b;", "Lcom/avito/android/publish/details/b;", "Lcom/avito/android/publish/details/w2;", "Lcom/avito/android/publish/details/k0;", "Lcom/avito/android/details/b$b;", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class K1 extends androidx.view.M0 implements ItemDetailsView.b, InterfaceC33678b, w2, InterfaceC33764k0, b.InterfaceC4110b {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f232960E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final V0 f232961J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232962K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f232963L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33779p0 f232964M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f232965N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f232966O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232967P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C33794u1 f232968Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.realty_address_submission.h f232969R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.computer_vision.a f232970S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.item_wrapper.a f232971T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final PublishDetailsFlowTracker f232972U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.widget.tagged_input.l f232973V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19882a f232974W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final S0 f232975X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.uxfeedback_helper.b f232976Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Q1 f232977Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f232978a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f232979b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.T0 f232980c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f232981d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f232982e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.beduin.custom_actions.a f232983f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.seller_protection.c f232984g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.publish.details.auto.a> f232985h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f232986i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f232987j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f232988k0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public ItemDetailsView f232991n0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f232993p0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f232999v0;

    /* renamed from: l0, reason: collision with root package name */
    public final /* synthetic */ C33767l0 f232989l0 = new C33767l0();

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232990m0 = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o0, reason: collision with root package name */
    public int f232992o0 = -1;

    /* renamed from: q0, reason: collision with root package name */
    public int f232994q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public int f232995r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> f232996s0 = new LinkedHashSet();

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<AbstractC33668b> f232997t0 = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: u0, reason: collision with root package name */
    public boolean f232998u0 = true;

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f233001c;

        public A(String str) {
            this.f233001c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) obj;
            boolean zEquals = abstractC35806h3.equals(AbstractC35806h3.e.f318894a);
            K1 k12 = K1.this;
            if (zEquals) {
                ItemDetailsView itemDetailsView = k12.f232991n0;
                if (itemDetailsView != null) {
                    itemDetailsView.h();
                    return;
                }
                return;
            }
            boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.d;
            String str = this.f233001c;
            if (!z12) {
                if (!(abstractC35806h3 instanceof AbstractC35806h3.a)) {
                    if ((abstractC35806h3 instanceof AbstractC35806h3.b) || abstractC35806h3.equals(AbstractC35806h3.c.f318892a)) {
                        return;
                    }
                    abstractC35806h3.equals(AbstractC35806h3.f.f318895a);
                    return;
                }
                CategoryParameters categoryParametersC0 = k12.f232975X.C0();
                Parcelable parcelableFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(str) : null;
                MultiselectParameter multiselectParameter = parcelableFindParameter instanceof MultiselectParameter ? (MultiselectParameter) parcelableFindParameter : null;
                if (multiselectParameter != null) {
                    multiselectParameter.rollbackToOldValue();
                }
                AbstractC35806h3.a aVar = (AbstractC35806h3.a) abstractC35806h3;
                ItemDetailsView itemDetailsView2 = k12.f232991n0;
                if (itemDetailsView2 != null) {
                    itemDetailsView2.i();
                }
                k12.f232997t0.setValue(new AbstractC33668b.j(aVar.f318890a.getF244063c()));
                return;
            }
            CategoryParameters categoryParameters = k12.f232960E.f231873k0;
            List<CategoryPublishStep> steps = categoryParameters != null ? categoryParameters.getSteps() : null;
            CategoryParameters categoryParametersC02 = k12.f232975X.C0();
            ParameterSlot parameterSlotFindParameter = categoryParametersC02 != null ? categoryParametersC02.findParameter(str) : null;
            SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
            if (selectParameter != null) {
                selectParameter.applyChosenValue();
            }
            ItemDetailsView itemDetailsView3 = k12.f232991n0;
            if (itemDetailsView3 != null) {
                itemDetailsView3.i();
            }
            CategoryParameters categoryParameters2 = (CategoryParameters) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
            com.avito.android.publish.C0 c02 = k12.f232960E;
            c02.Ke(categoryParameters2);
            k12.f232996s0 = k12.f232968Q.d(k12.f232996s0, k12.ne());
            K1.se(k12, false, new PublishDetailsFlowTracker.FlowContext[]{PublishDetailsFlowTracker.FlowContext.f233449o}, 3);
            k12.we();
            if (steps != null) {
                c02.Se(steps);
            }
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B<T> implements l41.g {
        public B() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(K1.this.f232967P, "Failed to updateForm", (Throwable) obj, 4);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep.Params f233003l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(CategoryPublishStep.Params params) {
            super(1);
            this.f233003l = params;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            CategoryPublishStep.Params.Config config = this.f233003l.getConfig();
            return InterfaceC33764k0.a.a(aVar2, config != null ? config.getContinueTitle() : null, false, true, false, null, 26);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D<T> implements l41.g {
        public D() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            K1.this.C(q2.f234903l);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00000\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "items", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set<String> f233006c;

        public E(Set<String> set) {
            this.f233006c = set;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            return K1.this.f232966O.h(list, this.f233006c).r(new r2(list));
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f233008c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233009d;

        /* JADX WARN: Multi-variable type inference failed */
        public F(Y41.a<kotlin.G0> aVar, Y41.l<? super Boolean, kotlin.G0> lVar) {
            this.f233008c = aVar;
            this.f233009d = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            l1.b bVar = (l1.b) q12.f406619b;
            List<? extends com.avito.conveyor_item.a> list = (List) q12.f406620c;
            ?? r42 = this.f233009d;
            K1 k12 = K1.this;
            s2 s2Var = new s2(k12, r42);
            boolean z12 = bVar instanceof l1.b.a;
            Y41.a<kotlin.G0> aVar = this.f233008c;
            if (z12) {
                k12.ve(list, k12.f232996s0, aVar, s2Var);
                return;
            }
            if (bVar instanceof l1.b.C9896b) {
                l1.b.C9896b c9896b = (l1.b.C9896b) bVar;
                boolean z13 = c9896b.f319396b;
                ArrayList arrayList = c9896b.f319397c;
                if (z13) {
                    Integer num = (Integer) k12.f232978a0.b("retries_with_warnings_count");
                    if ((num != null ? num.intValue() : 0) == 0) {
                        k12.re();
                        k12.f232967P.F0(arrayList, k12.f232975X.U(), k12.f232960E.ne());
                        C23060r0 c23060r0 = k12.f232978a0;
                        Integer num2 = (Integer) c23060r0.b("retries_with_warnings_count");
                        c23060r0.e(Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1), "retries_with_warnings_count");
                        k12.pe(list);
                        k12.f232997t0.setValue(new AbstractC33668b.j(k12.f232963L.f234838e));
                        DeepLink deepLinkA = c9896b.a();
                        if (deepLinkA != null) {
                            b.a.a(k12.f232981d0, deepLinkA, null, null, 6);
                        }
                        r42.invoke(Boolean.FALSE);
                        return;
                    }
                }
                if (!c9896b.f319395a) {
                    k12.ve(list, k12.f232996s0, aVar, s2Var);
                    return;
                }
                k12.re();
                k12.f232967P.F0(arrayList, k12.f232975X.U(), k12.f232960E.ne());
                k12.pe(list);
                n1.a aVar2 = arrayList != null ? (n1.a) C42745f0.G(arrayList) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar2 != null ? aVar2.f319403b : null);
                sb2.append(" - ");
                sb2.append(aVar2 != null ? aVar2.f319404c : null);
                K1.le(k12, new C33667a(aVar2 != null ? aVar2.f319402a : null, sb2.toString(), false, aVar2 != null ? aVar2.f319404c : null, 4, null));
                DeepLink deepLinkA2 = c9896b.a();
                if (deepLinkA2 != null) {
                    b.a.a(k12.f232981d0, deepLinkA2, null, null, 6);
                }
                r42.invoke(Boolean.FALSE);
            }
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G<T> implements l41.g {
        public G() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            K1.this.f232997t0.setValue(new AbstractC33668b.j(com.avito.android.error.z.l((Throwable) obj)));
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233011l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public H(Y41.l<? super Boolean, kotlin.G0> lVar) {
            super(0);
            this.f233011l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f233011l.invoke(Boolean.TRUE);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.K1$a, reason: case insensitive filesystem */
    public static final class C33667a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f233012a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f233013b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f233014c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f233015d;

        public C33667a(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? true : z12;
            str3 = (i12 & 8) != 0 ? null : str3;
            this.f233012a = str;
            this.f233013b = str2;
            this.f233014c = z12;
            this.f233015d = str3;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/publish/details/K1$b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/publish/details/K1$b$a;", "Lcom/avito/android/publish/details/K1$b$b;", "Lcom/avito/android/publish/details/K1$b$c;", "Lcom/avito/android/publish/details/K1$b$d;", "Lcom/avito/android/publish/details/K1$b$e;", "Lcom/avito/android/publish/details/K1$b$f;", "Lcom/avito/android/publish/details/K1$b$g;", "Lcom/avito/android/publish/details/K1$b$h;", "Lcom/avito/android/publish/details/K1$b$i;", "Lcom/avito/android/publish/details/K1$b$j;", "Lcom/avito/android/publish/details/K1$b$k;", "Lcom/avito/android/publish/details/K1$b$l;", "Lcom/avito/android/publish/details/K1$b$m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.K1$b, reason: case insensitive filesystem */
    public static abstract class AbstractC33668b {

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$a;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$a */
        public static final class a extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final RealtyAddressSubmissionInfo f233016a;

            public a(@Y61.k RealtyAddressSubmissionInfo realtyAddressSubmissionInfo) {
                super(null);
                this.f233016a = realtyAddressSubmissionInfo;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$b;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$b, reason: collision with other inner class name */
        public static final class C7076b extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final CategoryPublishStep.Params.Confirmation f233017a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final CategoryPublishStep.Params.NavigationButtonAction f233018b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final DeepLink f233019c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final List<BeduinAction> f233020d;

            /* JADX WARN: Multi-variable type inference failed */
            public C7076b(@Y61.k CategoryPublishStep.Params.Confirmation confirmation, @Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list) {
                super(null);
                this.f233017a = confirmation;
                this.f233018b = navigationButtonAction;
                this.f233019c = deepLink;
                this.f233020d = list;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$c;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$c */
        public static final class c extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final IacPermissionRequestSource f233021a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Y41.a<kotlin.G0> f233022b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Y41.a<kotlin.G0> f233023c;

            public c(@Y61.k IacPermissionRequestSource iacPermissionRequestSource, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2) {
                super(null);
                this.f233021a = iacPermissionRequestSource;
                this.f233022b = aVar;
                this.f233023c = aVar2;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/K1$b$d;", "Lcom/avito/android/publish/details/K1$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$d */
        public static final /* data */ class d extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f233024a = new d();

            public d() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -782765569;
            }

            @Y61.k
            public final String toString() {
                return "LeaveFillingParamsScreen";
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/K1$b$e;", "Lcom/avito/android/publish/details/K1$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$e */
        public static final /* data */ class e extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final e f233025a = new e();

            public e() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -408973730;
            }

            @Y61.k
            public final String toString() {
                return "LeaveScreen";
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$f;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$f */
        public static final /* data */ class f extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final DeepLink f233026a;

            public f(@Y61.k DeepLink deepLink) {
                super(null);
                this.f233026a = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && kotlin.jvm.internal.L.f(this.f233026a, ((f) obj).f233026a);
            }

            public final int hashCode() {
                return this.f233026a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f233026a, ')');
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$g;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$g */
        public static final class g extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final d.b f233027a;

            public g(@Y61.k d.b bVar) {
                super(null);
                this.f233027a = bVar;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$h;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$h */
        public static final class h extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f233028a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f233029b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f233030c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f233031d;

            public h(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12) {
                super(null);
                this.f233028a = str;
                this.f233029b = str2;
                this.f233030c = str3;
                this.f233031d = z12;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$i;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$i */
        public static final /* data */ class i extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PrintableText f233032a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final PrintableText f233033b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final SlotType f233034c;

            public /* synthetic */ i(PrintableText printableText, PrintableText printableText2, SlotType slotType, int i12, C42822w c42822w) {
                this(printableText, (i12 & 2) != 0 ? null : printableText2, slotType);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return kotlin.jvm.internal.L.f(this.f233032a, iVar.f233032a) && kotlin.jvm.internal.L.f(this.f233033b, iVar.f233033b) && this.f233034c == iVar.f233034c;
            }

            public final int hashCode() {
                int iHashCode = this.f233032a.hashCode() * 31;
                PrintableText printableText = this.f233033b;
                return this.f233034c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "ShowActionError(errorMessage=" + this.f233032a + ", actionText=" + this.f233033b + ", slotType=" + this.f233034c + ')';
            }

            public i(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.k SlotType slotType) {
                super(null);
                this.f233032a = printableText;
                this.f233033b = printableText2;
                this.f233034c = slotType;
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$j;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$j */
        public static final /* data */ class j extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f233035a;

            public j(@Y61.k String str) {
                super(null);
                this.f233035a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && kotlin.jvm.internal.L.f(this.f233035a, ((j) obj).f233035a);
            }

            public final int hashCode() {
                return this.f233035a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowError(message="), this.f233035a, ')');
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/K1$b$k;", "Lcom/avito/android/publish/details/K1$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$k */
        public static final /* data */ class k extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final k f233036a = new k();

            public k() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1026430146;
            }

            @Y61.k
            public final String toString() {
                return "ShowSellerProtectionDialog";
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$l;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$l */
        public static final /* data */ class l extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f233037a;

            public l(@Y61.k String str) {
                super(null);
                this.f233037a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && kotlin.jvm.internal.L.f(this.f233037a, ((l) obj).f233037a);
            }

            public final int hashCode() {
                return this.f233037a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowToastBarError(text="), this.f233037a, ')');
            }
        }

        /* compiled from: PublishDetailsViewModel.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/K1$b$m;", "Lcom/avito/android/publish/details/K1$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.details.K1$b$m */
        public static final /* data */ class m extends AbstractC33668b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final CategoryPublishStep f233038a;

            public m(@Y61.l CategoryPublishStep categoryPublishStep) {
                super(null);
                this.f233038a = categoryPublishStep;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && kotlin.jvm.internal.L.f(this.f233038a, ((m) obj).f233038a);
            }

            public final int hashCode() {
                CategoryPublishStep categoryPublishStep = this.f233038a;
                if (categoryPublishStep == null) {
                    return 0;
                }
                return categoryPublishStep.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "UpdateToolbar(currentStep=" + this.f233038a + ')';
            }
        }

        public /* synthetic */ AbstractC33668b(C42822w c42822w) {
            this();
        }

        public AbstractC33668b() {
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.K1$c, reason: case insensitive filesystem */
    public /* synthetic */ class C33669c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233039a;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.NavigationButtonAction.values().length];
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONDITIONAL_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.PERFORM_DEEP_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.SET_MANUAL_DATA_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.EXECUTE_BEDUIN_ACTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f233039a = iArr;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/x;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/ux/feedback/impl/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.K1$d, reason: case insensitive filesystem */
    public static final class C33670d<T> implements l41.g {
        public C33670d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.ux.feedback.impl.x xVar = (com.avito.android.ux.feedback.impl.x) obj;
            boolean zEquals = xVar.equals(x.d.f319186a);
            K1 k12 = K1.this;
            if (zEquals) {
                k12.re();
                return;
            }
            if (xVar.equals(x.e.f319187a) ? true : xVar.equals(x.b.f319184a) ? true : xVar.equals(x.a.f319183a) ? true : xVar.equals(x.c.f319185a)) {
                k12.nb();
            }
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUV0/a;", "Lcom/avito/conveyor_item/a;", "items", "Lkotlin/G0;", "accept", "(LUV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.K1$e, reason: case insensitive filesystem */
    public static final class C33671e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ItemDetailsView f233042c;

        public C33671e(ItemDetailsView itemDetailsView) {
            this.f233042c = itemDetailsView;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12;
            UV0.a<? extends com.avito.conveyor_item.a> aVarA;
            UV0.a<? extends com.avito.conveyor_item.a> aVar = (UV0.a) obj;
            K1 k12 = K1.this;
            com.avito.conveyor_item.a aVarA2 = k12.f232979b0.a();
            if (aVarA2 != null && (aVarA = com.avito.konveyor.util.g.a(new UV0.c(Collections.singletonList(aVarA2)), aVar)) != null) {
                aVar = aVarA;
            }
            Iterator<T> it = com.avito.konveyor.util.g.b(aVar).iterator();
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i12 = -1;
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                T next = it.next();
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                z2 z2Var = z2.f235116a;
                String f282186b = ((com.avito.conveyor_item.a) next).getF262931b();
                z2Var.getClass();
                if (f282186b.equals("1396")) {
                    break;
                } else {
                    i14++;
                }
            }
            k12.f232994q0 = i14;
            Iterator<T> it2 = com.avito.konveyor.util.g.b(aVar).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                if (((com.avito.conveyor_item.a) next2) instanceof ParameterElement.q) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            k12.f232995r0 = i12;
            this.f233042c.d(aVar);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.K1$f, reason: case insensitive filesystem */
    public static final class C33672f<T> implements l41.g {
        public C33672f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(K1.this.f232967P, "PublishDetailsViewModel.UpdateItems", (Throwable) obj, 4);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.K1$g, reason: case insensitive filesystem */
    public static final class C33673g<T> implements l41.g {
        public C33673g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            K1.this.B9(PublishDetailsFlowTracker.FlowContext.f233447m);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/l$a;", NotificationsSettings.Section.SECTION_PAID_SERVICES, "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.K1$h, reason: case insensitive filesystem */
    public static final class C33674h<T> implements l41.g {
        public C33674h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33878l.a aVar = (InterfaceC33878l.a) obj;
            String str = aVar.f237373a;
            if (C43066x.K(str)) {
                return;
            }
            K1 k12 = K1.this;
            k12.f232967P.y(aVar.f237374b, aVar.f237375c);
            k12.f232997t0.setValue(new AbstractC33668b.j(str));
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/a$a;", "params", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/details/beduin/custom_actions/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.slots.card_select.item.k cVar;
            ContinuePublishAction continuePublishAction = ((a.C7085a) obj).f233557a;
            if (continuePublishAction == null) {
                return;
            }
            if (continuePublishAction instanceof ContinuePublishAction.PerformDeeplink) {
                cVar = new k.a(null, ((ContinuePublishAction.PerformDeeplink) continuePublishAction).getDeeplink(), CategoryPublishStep.Params.NavigationButtonAction.PERFORM_DEEP_LINK);
            } else {
                if (!(continuePublishAction instanceof ContinuePublishAction.ContinuePublish)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new k.c(CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH);
            }
            K1.this.C(new L1(cVar));
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T> f233047b = new j<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof PublishSlotUpdateLink.b;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {
        public k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            List<ParameterSlot> parameters;
            Long l12;
            for (Map.Entry<String, Map<String, Object>> entry : ((PublishSlotUpdateLink) ((C43501a) obj).f413260a.f134520a).f133627b.entrySet()) {
                kotlin.reflect.d<?> slotClass = SlotType.INSTANCE.valueOfStr(entry.getKey()).getSlotClass();
                if (slotClass == null) {
                    slotClass = null;
                }
                Class<?> clsF = slotClass != null ? ((InterfaceC42819t) slotClass).f() : null;
                if (clsF != null) {
                    CategoryParameters categoryParametersC0 = K1.this.f232975X.C0();
                    ParameterSlot firstParameterOfType = categoryParametersC0 != null ? categoryParametersC0.getFirstParameterOfType(clsF) : null;
                    ParameterHolder parameterHolder = firstParameterOfType instanceof ParameterHolder ? (ParameterHolder) firstParameterOfType : null;
                    if (parameterHolder == null || (parameters = parameterHolder.getParameters()) == null) {
                        parameters = C42784z0.f406748b;
                    }
                    for (ParameterSlot parameterSlot : parameters) {
                        if (entry.getValue().containsKey(parameterSlot.getId())) {
                            if (parameterSlot instanceof CharParameter) {
                                CharParameter charParameter = (CharParameter) parameterSlot;
                                Object obj2 = entry.getValue().get(parameterSlot.getId());
                                charParameter.set_value(obj2 != null ? obj2.toString() : null);
                            } else if (parameterSlot instanceof IntParameter) {
                                IntParameter intParameter = (IntParameter) parameterSlot;
                                Object obj3 = entry.getValue().get(parameterSlot.getId());
                                if (obj3 != null) {
                                    if (!(obj3 instanceof Long)) {
                                        obj3 = null;
                                    }
                                    l12 = (Long) obj3;
                                } else {
                                    l12 = null;
                                }
                                intParameter.set_value(l12);
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.card_select.item.k f233049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.avito.android.publish.slots.card_select.item.k kVar) {
            super(1);
            this.f233049l = kVar;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, false, false, false, this.f233049l, 15);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ItemDetailsView itemDetailsView = K1.this.f232991n0;
            if (itemDetailsView != null) {
                itemDetailsView.a();
            }
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needConfirmation", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f233052c;

        public n(String str) {
            this.f233052c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            K1 k12 = K1.this;
            ItemDetailsView itemDetailsView = k12.f232991n0;
            if (itemDetailsView != null) {
                itemDetailsView.C0();
            }
            if (!zBooleanValue) {
                k12.nb();
                return;
            }
            long longOrDefault = Util.toLongOrDefault(this.f233052c, 0L);
            V0 v02 = k12.f232961J;
            k12.f232997t0.setValue(new AbstractC33668b.f(new PriceReductionLink(longOrDefault, v02.e8(), v02.qd())));
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSuccess", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Y41.a<kotlin.G0> aVar) {
            super(1);
            this.f233053l = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f233053l.invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            K1.this.f232997t0.setValue(AbstractC33668b.d.f233024a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            K1 k12 = K1.this;
            k12.getClass();
            k12.f232990m0.b(k12.f232970S.a(new M1(k12), new N1(k12)));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "it", "", "invoke", "(Lcom/avito/android/category_parameters/j;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.category_parameters.j<? extends Slot<?>>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final r f233056l = new r();

        public r() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(com.avito.android.category_parameters.j<? extends Slot<?>> jVar) {
            return Boolean.valueOf(jVar.g() instanceof SlotWithValue);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ PublishMethodWithAllSelectedValueParameter f233057l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
            super(1);
            this.f233057l = publishMethodWithAllSelectedValueParameter;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            String value = this.f233057l.getValue();
            return InterfaceC33764k0.a.a(aVar2, null, false, !(value == null || value.length() == 0), false, null, 27);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep.Params.Predicate f233058l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(CategoryPublishStep.Params.Predicate predicate) {
            super(1);
            this.f233058l = predicate;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            CategoryPublishStep.Params.Predicate predicate = this.f233058l;
            return InterfaceC33764k0.a.a(aVar2, predicate.getAction().getContinueTitle(), false, false, predicate.getAction().getContinueStyle() == CategoryPublishStep.Params.Predicate.Action.ContinueStyle.SECONDARY, null, 22);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep f233059l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(CategoryPublishStep categoryPublishStep) {
            super(1);
            this.f233059l = categoryPublishStep;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            CategoryPublishStep.Params.Config config = ((CategoryPublishStep.Params) this.f233059l).getConfig();
            return InterfaceC33764k0.a.a(aVar2, config != null ? config.getContinueTitle() : null, false, false, false, null, 22);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final v f233060l = new v();

        public v() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, true, false, false, null, 29);
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public w() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            K1 k12 = K1.this;
            S0 s02 = k12.f232975X;
            CategoryParameters categoryParametersC0 = s02.C0();
            if (categoryParametersC0 != null) {
                k12.f232990m0.b(io.reactivex.rxjava3.kotlin.A1.e(k12.f232961J.a(s02.U(), categoryParametersC0).s(k12.f232962K.e()), new f2(k12), new g2(k12)));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/details/K1$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/details/K1$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.l<C33667a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f233062l = new x();

        public x() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(C33667a c33667a) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ PhotoParameter f233064m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233065n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(PhotoParameter photoParameter, Y41.l<? super C33667a, kotlin.G0> lVar) {
            super(1);
            this.f233064m = photoParameter;
            this.f233065n = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            PhotoParameter photoParameter = this.f233064m;
            K1.this.ue(this.f233065n, photoParameter);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_cache/q;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.photo_cache.q, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f233067m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233068n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f233069o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, Y41.a<kotlin.G0> aVar, Y41.l<? super C33667a, kotlin.G0> lVar) {
            super(1);
            this.f233067m = set;
            this.f233068n = (kotlin.jvm.internal.N) aVar;
            this.f233069o = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.photo_cache.q qVar) {
            com.avito.android.photo_cache.q qVar2 = qVar;
            K1 k12 = K1.this;
            PhotoParameter photoParameter = (PhotoParameter) k12.ne().getFirstParameterOfType(PhotoParameter.class);
            boolean z12 = qVar2 instanceof q.c;
            ?? r32 = this.f233068n;
            ?? r42 = this.f233069o;
            Set<com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f233067m;
            C33794u1 c33794u1 = k12.f232968Q;
            com.avito.android.publish.C0 c02 = k12.f232960E;
            if (z12) {
                if (c02.Be() && ((q.c) qVar2).f216338a.isEmpty()) {
                    k12.f232967P.I();
                }
                if (photoParameter != null) {
                    photoParameter.setValue(new PhotoParameter.ImageUploadListWrapper(C42745f0.E0(((q.c) qVar2).f216338a, PhotoParameterKt.maxPhotos(photoParameter))));
                }
                c33794u1.b(set, r32, r42);
            } else if (c02.Be()) {
                k12.ue(r42, photoParameter);
            } else {
                c33794u1.b(set, r32, r42);
            }
            return kotlin.G0.f406611a;
        }
    }

    public K1(@Y61.k com.avito.android.publish.C0 c02, @Y61.k V0 v02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C33771m1 c33771m1, @Y61.k InterfaceC33779p0 interfaceC33779p0, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C33794u1 c33794u1, @Y61.k com.avito.android.publish.realty_address_submission.h hVar, @Y61.k com.avito.android.publish.details.computer_vision.a aVar, @Y61.k com.avito.android.publish.details.item_wrapper.a aVar2, @Y61.k PublishDetailsFlowTracker publishDetailsFlowTracker, @Y61.k com.avito.android.ui.widget.tagged_input.l lVar, @Y61.k InterfaceC19882a interfaceC19882a, @Y61.k S0 s02, @Y61.k com.avito.android.publish.uxfeedback_helper.b bVar, @Y61.k com.avito.android.Q1 q12, @Y61.k C23060r0 c23060r0, @Y61.k com.avito.android.publish.items.e eVar, @Y61.k com.avito.android.publish.T0 t02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.publish.details.beduin.custom_actions.a aVar4, @Y61.k com.avito.android.publish.details.seller_protection.c cVar, @Y61.k h31.e<com.avito.android.publish.details.auto.a> eVar2, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k u3.l<SimpleTestGroupWithNone> lVar2, @Y61.k u3.l<SimpleTestGroupWithNone> lVar3) {
        this.f232960E = c02;
        this.f232961J = v02;
        this.f232962K = interfaceC35745a5;
        this.f232963L = c33771m1;
        this.f232964M = interfaceC33779p0;
        this.f232965N = jVar;
        this.f232966O = interfaceC36030r0;
        this.f232967P = interfaceC33535v;
        this.f232968Q = c33794u1;
        this.f232969R = hVar;
        this.f232970S = aVar;
        this.f232971T = aVar2;
        this.f232972U = publishDetailsFlowTracker;
        this.f232973V = lVar;
        this.f232974W = interfaceC19882a;
        this.f232975X = s02;
        this.f232976Y = bVar;
        this.f232977Z = q12;
        this.f232978a0 = c23060r0;
        this.f232979b0 = eVar;
        this.f232980c0 = t02;
        this.f232981d0 = aVar3;
        this.f232982e0 = interfaceC40691b;
        this.f232983f0 = aVar4;
        this.f232984g0 = cVar;
        this.f232985h0 = eVar2;
        this.f232986i0 = interfaceC30978i;
        this.f232987j0 = lVar2;
        this.f232988k0 = lVar3;
    }

    public static final void ke(K1 k12, ApiError apiError) {
        ItemDetailsView itemDetailsView = k12.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.i();
        }
        ItemDetailsView itemDetailsView2 = k12.f232991n0;
        if (itemDetailsView2 != null) {
            itemDetailsView2.C0();
        }
        com.avito.android.error.z.g(apiError, new O1(k12), null, null, null, null, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void le(com.avito.android.publish.details.K1 r9, com.avito.android.publish.details.K1.C33667a r10) {
        /*
            r9.getClass()
            java.lang.String r0 = r10.f233012a
            r1 = 0
            if (r0 == 0) goto L11
            com.avito.android.remote.model.category_parameters.ParametersTree r2 = r9.ne()
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r0 = r2.findParameter(r0)
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L38
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r3 = 8
            java.lang.String r8 = kotlin.text.C43066x.t0(r3, r2)
            com.avito.android.publish.details.S0 r2 = r9.f232975X
            com.avito.android.remote.model.Navigation r5 = r2.U()
            com.avito.android.publish.C0 r2 = r9.f232960E
            java.lang.String r6 = r2.ne()
            com.avito.android.publish.analytics.v r2 = r9.f232967P
            java.lang.String r7 = r10.f233013b
            r3 = r8
            r4 = r0
            r2.k0(r3, r4, r5, r6, r7)
            goto L39
        L38:
            r8 = r1
        L39:
            boolean r2 = r10.f233014c
            if (r2 == 0) goto L76
            boolean r2 = r0 instanceof com.avito.android.remote.model.category_parameters.MultiselectParameter
            if (r2 == 0) goto L66
            com.avito.android.remote.model.category_parameters.MultiselectParameter r0 = (com.avito.android.remote.model.category_parameters.MultiselectParameter) r0
            com.avito.android.remote.model.category_parameters.MultiselectParameter$Displaying r0 = r0.getDisplaying()
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.getType()
        L4d:
            java.lang.String r0 = "selectorCardGroup"
            boolean r0 = kotlin.jvm.internal.L.f(r1, r0)
            if (r0 == 0) goto L66
            java.lang.String r10 = r10.f233015d
            if (r10 == 0) goto L66
            int r0 = r10.length()
            if (r0 != 0) goto L60
            goto L66
        L60:
            com.avito.android.publish.details.K1$b$l r0 = new com.avito.android.publish.details.K1$b$l
            r0.<init>(r10)
            goto L71
        L66:
            com.avito.android.publish.details.K1$b$j r0 = new com.avito.android.publish.details.K1$b$j
            com.avito.android.publish.details.m1 r10 = r9.f232963L
            java.lang.String r10 = r10.a(r8)
            r0.<init>(r10)
        L71:
            com.avito.android.util.architecture_components.D<com.avito.android.publish.details.K1$b> r9 = r9.f232997t0
            r9.setValue(r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.K1.le(com.avito.android.publish.details.K1, com.avito.android.publish.details.K1$a):void");
    }

    public static void se(K1 k12, boolean z12, PublishDetailsFlowTracker.FlowContext[] flowContextArr, int i12) {
        boolean z13 = (i12 & 1) != 0 ? false : z12;
        boolean z14 = (i12 & 2) == 0;
        if ((i12 & 4) != 0) {
            flowContextArr = new PublishDetailsFlowTracker.FlowContext[0];
        }
        PublishDetailsFlowTracker.FlowContext[] flowContextArr2 = flowContextArr;
        ParametersTree parametersTreeNe = k12.ne();
        k12.C(b2.f233554l);
        if (k12.f232996s0.isEmpty()) {
            k12.te(parametersTreeNe, z13, z14, flowContextArr2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> it = k12.f232996s0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        k12.f232990m0.b(io.reactivex.rxjava3.core.z.L0(arrayList, c2.f233583b).j0(k12.f232962K.e()).v0(new d2(k12, parametersTreeNe, z13, z14, flowContextArr2), new e2(k12), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void B9(@Y61.k PublishDetailsFlowTracker.FlowContext... flowContextArr) {
        ParametersTree parametersTreeNe = ne();
        CpaTariffSlot cpaTariffSlot = (CpaTariffSlot) parametersTreeNe.getFirstParameterOfType(CpaTariffSlot.class);
        if (cpaTariffSlot != null) {
            this.f232967P.s(((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getButton().getAction());
        }
        CategoryParameters categoryParametersC0 = this.f232975X.C0();
        InterfaceC36030r0 interfaceC36030r0 = this.f232966O;
        interfaceC36030r0.f(parametersTreeNe, categoryParametersC0);
        interfaceC36030r0.getF319331j().accept(Ha(parametersTreeNe, flowContextArr));
    }

    @Override // com.avito.android.publish.details.InterfaceC33761j0
    public final void C(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
        this.f232989l0.C(lVar);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    @SuppressLint({"HardcodeStringDetector"})
    public final void C5(@Y61.k AddressParameter addressParameter) {
        ItemDetailsView itemDetailsView;
        AddressParameter.Widget.Config config;
        AddressParameter.Widget.Config config2;
        TooltipOptions tooltipOptions;
        AddressParameter.Widget.Config config3;
        TooltipOptions tooltipOptions2 = null;
        if (addressParameter.getValue() == null) {
            InterfaceC33535v.a.b(this.f232967P, "Address must not be null!", null, 6);
            return;
        }
        oe();
        if (this.f232994q0 != -1) {
            z2 z2Var = z2.f235116a;
            AddressParameter.Widget widget = addressParameter.getWidget();
            String type = (widget == null || (config3 = widget.getConfig()) == null) ? null : config3.getType();
            AddressParameter.Value value = addressParameter.getValue();
            String text = value != null ? value.getText() : null;
            AddressParameter.Widget widget2 = addressParameter.getWidget();
            String onShowRegexp = (widget2 == null || (config2 = widget2.getConfig()) == null || (tooltipOptions = config2.getTooltipOptions()) == null) ? null : tooltipOptions.getOnShowRegexp();
            z2Var.getClass();
            if ((!kotlin.jvm.internal.L.f(type, "vacancy") || onShowRegexp == null || new C43059p(onShowRegexp).a(String.valueOf(text))) && (itemDetailsView = this.f232991n0) != null) {
                int i12 = this.f232994q0;
                AddressParameter.Widget widget3 = addressParameter.getWidget();
                if (widget3 != null && (config = widget3.getConfig()) != null) {
                    tooltipOptions2 = config.getTooltipOptions();
                }
                itemDetailsView.j(i12, tooltipOptions2, new a2(addressParameter, this));
            }
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
        C(new l(kVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @Y61.k
    public final List<com.avito.conveyor_item.a> Ha(@Y61.k UV0.a<ParameterSlot> aVar, @Y61.k PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        u3.l<SimpleTestGroupWithNone> lVar = this.f232987j0;
        if (lVar.f439745a.f439749b.a()) {
            lVar.b();
        }
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f232988k0;
        if (lVar2.f439745a.f439749b.a()) {
            lVar2.b();
        }
        this.f232972U.a((PublishDetailsFlowTracker.FlowContext[]) Arrays.copyOf(flowContextArr, flowContextArr.length));
        return this.f232964M.b(aVar, this.f232996s0, this.f232960E.ve());
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void I8(@Y61.l Y41.a aVar, boolean z12) {
        this.f232998u0 = z12;
        this.f232999v0 = aVar;
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void J5(@Y61.k JO.a aVar) {
        Object next;
        ItemDetailsView itemDetailsView;
        ParametersTree parametersTreeNe = ne();
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parametersTreeNe) {
            if (parameterSlot instanceof AccordionSlot) {
                arrayList.add(parameterSlot);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((AccordionSlot) next).getId(), aVar.f8933b)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AccordionSlot accordionSlot = (AccordionSlot) next;
        if (accordionSlot == null) {
            return;
        }
        Iterator<ParameterSlot> it2 = parametersTreeNe.iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            }
            ParameterSlot next2 = it2.next();
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (kotlin.jvm.internal.L.f(next2.getId(), C42745f0.Q(((AccordionSlotConfig) accordionSlot.getWidget().getConfig()).getContentFields()))) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1 || (itemDetailsView = this.f232991n0) == null) {
            return;
        }
        itemDetailsView.e(i12, true);
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void Mb(@Y61.k com.avito.conveyor_item.a aVar) {
        PublishDetailsFlowTracker.FlowContext flowContextA;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> it = this.f232996s0.iterator();
        while (it.hasNext()) {
            com.avito.android.category_parameters.f fVarD = it.next().d(aVar);
            if ((fVarD instanceof f.b) && (flowContextA = com.avito.android.publish.details.analytics.d.a(fVarD.f117642a)) != null) {
                arrayList.add(flowContextA);
            }
        }
        if (!arrayList.isEmpty()) {
            PublishDetailsFlowTracker.FlowContext[] flowContextArr = (PublishDetailsFlowTracker.FlowContext[]) arrayList.toArray(new PublishDetailsFlowTracker.FlowContext[0]);
            B9((PublishDetailsFlowTracker.FlowContext[]) Arrays.copyOf(flowContextArr, flowContextArr.length));
        }
        ParameterSlot parameterSlotFindParameter = ne().findParameter(aVar.getF262931b());
        if ((parameterSlotFindParameter instanceof BaseEditableParameter) && kotlin.jvm.internal.L.f(((BaseEditableParameter) parameterSlotFindParameter).getUpdatesForm(), Boolean.TRUE)) {
            V8(parameterSlotFindParameter.getId());
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
        C(new s(publishMethodWithAllSelectedValueParameter));
        se(this, false, null, 7);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
        se(this, false, null, 7);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void O5() {
        oe();
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @SuppressLint({"HardcodeStringDetector"})
    public final void V8(@Y61.k String str) {
        b.InterfaceC4110b.a.a(this, null, 3);
        S0 s02 = this.f232975X;
        io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> zVarC = this.f232961J.c(s02.U(), s02.C0(), this.f232960E.f231868f0);
        InterfaceC35745a5 interfaceC35745a5 = this.f232962K;
        this.f232990m0.b(zVarC.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new A(str), new B(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void Zc(@Y61.k String str) {
        this.f232967P.L0(str);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    @j.K
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
        if (str != null) {
            V8(str);
            return;
        }
        if (parameterSlot instanceof SelectParameter) {
            C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(this.f232996s0), r.f233056l));
            while (aVar.hasNext()) {
                ((com.avito.android.category_parameters.j) aVar.next()).e(parameterSlot);
            }
        }
        se(this, false, null, 7);
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        if (confirmation == null) {
            me(navigationButtonAction, deepLink, list, paramsToFill);
        } else {
            this.f232997t0.setValue(new AbstractC33668b.C7076b(confirmation, navigationButtonAction, deepLink, list));
        }
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f232990m0.e();
        if (!this.f232977Z.v().invoke().booleanValue()) {
            this.f232968Q.f235042e.e();
        }
        this.f232966O.a();
        this.f232997t0.postValue(null);
        this.f232986i0.K();
        this.f232991n0 = null;
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void e7() {
        se(this, false, null, 5);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
        if (str == null) {
            se(this, false, null, 7);
            return;
        }
        ParameterSlot parameterSlotFindParameter = ne().findParameter(str);
        if ((parameterSlotFindParameter instanceof BaseEditableParameter) && kotlin.jvm.internal.L.f(((BaseEditableParameter) parameterSlotFindParameter).getUpdatesForm(), Boolean.TRUE)) {
            V8(parameterSlotFindParameter.getId());
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void k2(boolean z12) {
        ItemDetailsView itemDetailsView = this.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.W();
        }
        boolean zMa = this.f232975X.Ma();
        com.avito.android.util.architecture_components.D<AbstractC33668b> d12 = this.f232997t0;
        if (zMa) {
            this.f232985h0.get().a();
            d12.setValue(AbstractC33668b.d.f233024a);
        } else if (z12) {
            d12.setValue(AbstractC33668b.e.f233025a);
        } else {
            this.f232960E.ye();
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b, Xd0.d
    public final void l(@Y61.l String str) {
        b.InterfaceC4110b.a.a(this, str, 2);
    }

    public final void me(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, DeepLink deepLink, List<? extends BeduinAction> list, CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        CategoryPublishStep.Params.Config config;
        ParameterSlot parameterSlot;
        ParameterSlot parameterSlot2;
        ParameterSlot parameterSlot3;
        List<ParameterSlot> parameters;
        Object next;
        String vehicleNumberId;
        String autoRegNumByPhoto;
        ParameterSlot parameterSlot4;
        ParameterSlot parameterSlot5;
        List<ParameterSlot> parameters2;
        Object next2;
        List<ParameterSlot> parameters3;
        Object next3;
        List<ParameterSlot> parameters4;
        Object next4;
        List<ParameterSlot> parameters5;
        Object next5;
        int i12 = navigationButtonAction == null ? -1 : C33669c.f233039a[navigationButtonAction.ordinal()];
        if (i12 == -1) {
            nb();
            return;
        }
        if (i12 == 2) {
            if (deepLink == null) {
                return;
            }
            boolean z12 = deepLink instanceof AddAutoToC2CTrxLink;
            if ((deepLink instanceof AuctionAddLink) || z12) {
                xe(kotlin.collections.B0.f406639b, new k2(this, deepLink));
                return;
            } else {
                this.f232997t0.setValue(new AbstractC33668b.f(deepLink));
                return;
            }
        }
        Object obj = null;
        if (i12 == 3) {
            CategoryPublishStep categoryPublishStepA = this.f232975X.a();
            CategoryPublishStep.Params params = categoryPublishStepA instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepA : null;
            List<CategoryPublishStep.Params.NavigationButton> navigationButtons = (params == null || (config = params.getConfig()) == null) ? null : config.getNavigationButtons();
            if (navigationButtons != null) {
                Iterator<T> it = navigationButtons.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next6 = it.next();
                    if (((CategoryPublishStep.Params.NavigationButton) next6).getDeepLink() instanceof AuctionAddLink) {
                        obj = next6;
                        break;
                    }
                }
                obj = (CategoryPublishStep.Params.NavigationButton) obj;
            }
            if (obj != null) {
                com.avito.android.Q1 q12 = this.f232977Z;
                q12.getClass();
                kotlin.reflect.n<Object> nVar = com.avito.android.Q1.f67448x0[11];
                if (((Boolean) q12.f67498m.a().invoke()).booleanValue()) {
                    ItemDetailsView itemDetailsView = this.f232991n0;
                    if (itemDetailsView != null) {
                        itemDetailsView.a();
                    }
                    C(Z1.f233194l);
                    this.f232990m0.b(this.f232976Y.a(a.C7356a.f245512b).t0(new C33670d()));
                    return;
                }
            }
            nb();
            return;
        }
        if (i12 != 4) {
            if (i12 != 5) {
                return;
            }
            com.avito.android.beduin_shared.model.utils.a.a(this.f232982e0, list);
            return;
        }
        com.avito.android.publish.C0 c02 = this.f232960E;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null || (parameters5 = categoryParameters.getParameters()) == null) {
            parameterSlot = null;
        } else {
            Iterator<T> it2 = parameters5.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next5 = null;
                    break;
                } else {
                    next5 = it2.next();
                    if (kotlin.jvm.internal.L.f(((ParameterSlot) next5).getId(), paramsToFill != null ? paramsToFill.getVinByRegNumUserBackstepId() : null)) {
                        break;
                    }
                }
            }
            parameterSlot = (ParameterSlot) next5;
        }
        SelectParameter.Flat flat = parameterSlot instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot : null;
        if (flat != null) {
            flat.set_value("1");
            CategoryParameters categoryParameters2 = c02.f231873k0;
            if (categoryParameters2 != null) {
                CategoryParameters.cloneWithNewParameters$default(categoryParameters2, Collections.singletonList(flat), null, 2, null);
            }
        }
        CategoryParameters categoryParameters3 = c02.f231873k0;
        if (categoryParameters3 == null || (parameters4 = categoryParameters3.getParameters()) == null) {
            parameterSlot2 = null;
        } else {
            Iterator<T> it3 = parameters4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it3.next();
                    if (kotlin.jvm.internal.L.f(((ParameterSlot) next4).getId(), paramsToFill != null ? paramsToFill.getAutoFillItemId() : null)) {
                        break;
                    }
                }
            }
            parameterSlot2 = (ParameterSlot) next4;
        }
        SelectParameter.Flat flat2 = parameterSlot2 instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot2 : null;
        if (flat2 != null) {
            flat2.set_value("0");
            CategoryParameters categoryParameters4 = c02.f231873k0;
            if (categoryParameters4 != null) {
                CategoryParameters.cloneWithNewParameters$default(categoryParameters4, Collections.singletonList(flat2), null, 2, null);
            }
        }
        if (paramsToFill != null && (vehicleNumberId = paramsToFill.getVehicleNumberId()) != null && (autoRegNumByPhoto = paramsToFill.getAutoRegNumByPhoto()) != null) {
            CategoryParameters categoryParameters5 = c02.f231873k0;
            if (categoryParameters5 == null || (parameters3 = categoryParameters5.getParameters()) == null) {
                parameterSlot4 = null;
            } else {
                Iterator<T> it4 = parameters3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it4.next();
                        if (kotlin.jvm.internal.L.f(((ParameterSlot) next3).getId(), autoRegNumByPhoto)) {
                            break;
                        }
                    }
                }
                parameterSlot4 = (ParameterSlot) next3;
            }
            SelectParameter.Flat flat3 = parameterSlot4 instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot4 : null;
            if (kotlin.jvm.internal.L.f(flat3 != null ? flat3.get_value() : null, "1")) {
                CategoryParameters categoryParameters6 = c02.f231873k0;
                if (categoryParameters6 == null || (parameters2 = categoryParameters6.getParameters()) == null) {
                    parameterSlot5 = null;
                } else {
                    Iterator<T> it5 = parameters2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it5.next();
                            if (kotlin.jvm.internal.L.f(((ParameterSlot) next2).getId(), vehicleNumberId)) {
                                break;
                            }
                        }
                    }
                    parameterSlot5 = (ParameterSlot) next2;
                }
                CharParameter charParameter = parameterSlot5 instanceof CharParameter ? (CharParameter) parameterSlot5 : null;
                if (charParameter != null) {
                    charParameter.set_value((String) null);
                    CategoryParameters categoryParameters7 = c02.f231873k0;
                    if (categoryParameters7 != null) {
                        CategoryParameters.cloneWithNewParameters$default(categoryParameters7, Collections.singletonList(charParameter), null, 2, null);
                    }
                }
            }
        }
        CategoryParameters categoryParameters8 = c02.f231873k0;
        if (categoryParameters8 == null || (parameters = categoryParameters8.getParameters()) == null) {
            parameterSlot3 = null;
        } else {
            Iterator<T> it6 = parameters.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it6.next();
                    if (kotlin.jvm.internal.L.f(((ParameterSlot) next).getId(), paramsToFill != null ? paramsToFill.getVinId() : null)) {
                        break;
                    }
                }
            }
            parameterSlot3 = (ParameterSlot) next;
        }
        CharParameter charParameter2 = parameterSlot3 instanceof CharParameter ? (CharParameter) parameterSlot3 : null;
        if (charParameter2 != null && charParameter2.getInputType() == CharParameter.InputType.VIN) {
            charParameter2.set_value((String) null);
            CategoryParameters categoryParameters9 = c02.f231873k0;
            if (categoryParameters9 != null) {
                CategoryParameters.cloneWithNewParameters$default(categoryParameters9, Collections.singletonList(charParameter2), null, 2, null);
            }
        }
        c02.ye();
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b, com.avito.android.publish.screen.step.params.view.actions.r
    public final void n(@Y61.k DeepLink deepLink) {
        b.a.a(this.f232981d0, deepLink, null, null, 6);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
        oe();
        qe(this.f232995r0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void nb() {
        Object next;
        ParameterSlot next2;
        List<? extends Long> list;
        Iterator<T> it = this.f232996s0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof com.avito.android.publish.slots.images_enhancement.e) {
                    break;
                }
            }
        }
        if (!(next instanceof com.avito.android.publish.slots.images_enhancement.e)) {
            next = null;
        }
        com.avito.android.publish.slots.images_enhancement.e eVar = (com.avito.android.publish.slots.images_enhancement.e) next;
        if (eVar != null) {
            eVar.l();
        }
        boolean z12 = eVar != null;
        Iterator<ParameterSlot> it2 = ne().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (C49860a.a(next2)) {
                    break;
                }
            }
        }
        MultipleIntParameter multipleIntParameter = next2 instanceof MultipleIntParameter ? (MultipleIntParameter) next2 : null;
        if (multipleIntParameter != null) {
            List<? extends Long> value = multipleIntParameter.getValue();
            if (!z12 && (list = value) != null && !list.isEmpty() && this.f232986i0.K0(value)) {
                multipleIntParameter.setValue(null);
            }
        }
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f232996s0;
        com.avito.android.publish.details.seller_protection.c cVar = this.f232984g0;
        if (cVar.c(set)) {
            this.f232997t0.setValue(AbstractC33668b.k.f233036a);
            cVar.a();
            return;
        }
        com.avito.android.publish.C0 c02 = this.f232960E;
        if (c02.Be()) {
            V0 v02 = this.f232961J;
            if (v02.Ca()) {
                ItemBrief itemBrief = c02.f231867e0;
                String id2 = itemBrief != null ? itemBrief.getId() : null;
                if (id2 != null) {
                    this.f232990m0.b(v02.z9(id2).j(new m()).s(this.f232962K.e()).x(new n(id2), io.reactivex.rxjava3.internal.functions.a.f401996f));
                    return;
                }
            }
        }
        if (this.f232998u0) {
            xe(kotlin.collections.B0.f406639b, new o(this.f232975X.Ma() ? new p() : new q()));
            return;
        }
        Y41.a<kotlin.G0> aVar = this.f232999v0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final ParametersTree ne() {
        ParametersTree parametersTreeWa = this.f232975X.wa();
        if (parametersTreeWa != null) {
            return parametersTreeWa;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void oe() {
        CategoryParameters categoryParametersC0 = this.f232975X.C0();
        if (categoryParametersC0 == null) {
            return;
        }
        ItemDetailsView itemDetailsView = this.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.C0();
        }
        this.f232960E.Ke(categoryParametersC0);
        se(this, false, null, 7);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        if (this.f232977Z.v().invoke().booleanValue()) {
            this.f232968Q.f235042e.e();
        }
        this.f232982e0.onCleared();
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f232996s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof com.avito.android.publish.slots.q) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.avito.android.publish.slots.q) it.next()).clear();
        }
        this.f232971T.clear();
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
        Object next;
        this.f232991n0 = itemDetailsView;
        S0 s02 = this.f232975X;
        if (s02.Ma()) {
            this.f232985h0.get().b();
        }
        this.f232996s0 = this.f232968Q.d(this.f232996s0, ne());
        com.avito.android.publish.C0 c02 = this.f232960E;
        io.reactivex.rxjava3.disposables.d dVarT0 = c02.f231882t0.t0(new j2(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f232990m0;
        cVar.b(dVarT0);
        cVar.b(c02.f231882t0.N(h2.f234641b).t0(new i2(this)));
        InterfaceC36030r0 interfaceC36030r0 = this.f232966O;
        com.jakewharton.rxrelay3.c cVarG = interfaceC36030r0.getF319332k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f232962K;
        cVar.b(C35896f0.g(cVarG.y(50L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e()), new Q1(this)));
        cVar.b(C35896f0.g(interfaceC36030r0.getF319332k().y(300L, timeUnit, interfaceC35745a5.c()).d0(R1.f233157b).j0(interfaceC35745a5.e()), new S1(this)));
        cVar.b(C35896f0.g(interfaceC36030r0.getF319332k(), new T1(this)));
        cVar.b(interfaceC36030r0.getF319334m().j0(interfaceC35745a5.e()).t0(new P1(this)));
        this.f232986i0.E0();
        com.jakewharton.rxrelay3.c cVarG2 = interfaceC36030r0.getF319332k();
        C33671e c33671e = new C33671e(itemDetailsView);
        C33672f c33672f = new C33672f();
        cVarG2.getClass();
        cVar.b(cVarG2.v0(c33671e, c33672f, io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(this.f232971T.getF234783e().j0(interfaceC35745a5.e()).t0(new C33673g()));
        cVar.b(this.f232961J.H8().j0(interfaceC35745a5.e()).t0(new C33674h()));
        cVar.b(this.f232983f0.f233556b.t0(new i()));
        cVar.b(this.f232981d0.d9().N(j.f233047b).t0(new k()));
        C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(ne()), W1.f233180l));
        while (true) {
            if (!aVar.hasNext()) {
                next = null;
                break;
            } else {
                next = aVar.next();
                if (((HasTags) next).getTags() != null) {
                    break;
                }
            }
        }
        HasTags hasTags = (HasTags) next;
        if (hasTags != null) {
            EditableParameter editableParameter = (EditableParameter) (!(hasTags instanceof EditableParameter) ? null : hasTags);
            if (editableParameter != null) {
                String str = (String) editableParameter.getValue();
                if (str == null) {
                    str = "";
                }
                List<TextualTag> tags = hasTags.getTags();
                this.f232973V.m3(editableParameter.getId(), tags != null ? C43033p.D(new kotlin.sequences.o0(C43033p.l(new C42770s0(tags), new X1(str)), Y1.f233190l)) : null);
            }
        }
        se(this, c02.Ee(), new PublishDetailsFlowTracker.FlowContext[]{PublishDetailsFlowTracker.FlowContext.f233437c}, 2);
        we();
        if (kotlin.jvm.internal.L.f(this.f232980c0.j(true), Boolean.TRUE) && c02.Be()) {
            ParametersTree parametersTreeNe = ne();
            interfaceC36030r0.f(parametersTreeNe, s02.C0());
            com.avito.android.util.rx3.S0.b(new io.reactivex.rxjava3.internal.operators.single.G(new J1(this, parametersTreeNe, 0)).n(new m2(this)).s(interfaceC35745a5.e()), new p2(this));
        }
    }

    public final void pe(List<? extends com.avito.conveyor_item.a> list) {
        int i12 = this.f232992o0;
        if (i12 != -1) {
            qe(i12, list.get(i12) instanceof ParameterElement.y);
        } else {
            this.f232993p0 = true;
        }
    }

    public final void qe(int i12, boolean z12) {
        ItemDetailsView itemDetailsView = this.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.e(i12, z12);
        }
        this.f232992o0 = -1;
        this.f232993p0 = false;
    }

    public final void re() {
        ItemDetailsView itemDetailsView = this.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.C0();
        }
        C(v.f233060l);
    }

    public final void te(ParametersTree parametersTree, boolean z12, boolean z13, PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        ItemDetailsView itemDetailsView;
        String value;
        re();
        PriceParameter priceParameter = (PriceParameter) parametersTree.getFirstParameterOfType(PriceParameter.class);
        if (priceParameter != null && (value = priceParameter.getValue()) != null) {
            this.f232961J.Eb(value);
        }
        CategoryParameters categoryParametersC0 = this.f232975X.C0();
        InterfaceC36030r0 interfaceC36030r0 = this.f232966O;
        interfaceC36030r0.f(parametersTree, categoryParametersC0);
        List<com.avito.conveyor_item.a> listHa = Ha(parametersTree, flowContextArr);
        if (this.f232960E.Oe() && (itemDetailsView = this.f232991n0) != null) {
            itemDetailsView.g();
        }
        if (z13) {
            pe(listHa);
        }
        interfaceC36030r0.getF319331j().accept(listHa);
        if (z12) {
            ve(listHa, this.f232996s0, new w(), x.f233062l);
        }
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void ue(Y41.l lVar, PhotoParameter photoParameter) {
        lVar.invoke(new C33667a(photoParameter != null ? photoParameter.getId() : null, "Photos are still loading", false, null, 12, null));
        if (photoParameter != null) {
            photoParameter.setErrorMessage(this.f232963L.f234837d);
        }
        e7();
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void v3(boolean z12) {
        D(z12 ? k.b.f243161a : null);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
        oe();
    }

    public final void ve(List<? extends com.avito.conveyor_item.a> list, Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, Y41.a<kotlin.G0> aVar, Y41.l<? super C33667a, kotlin.G0> lVar) {
        PhotoParameter photoParameter = (PhotoParameter) ne().getFirstParameterOfType(PhotoParameter.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.I) {
                arrayList.add(obj);
            }
        }
        ParameterElement.I i12 = (ParameterElement.I) C42745f0.G(arrayList);
        if ((i12 != null ? i12.f117327h : null) instanceof ParameterElement.I.a.c) {
            lVar.invoke(new C33667a(i12.f117181b, null, false, null, 12, null));
        } else if (photoParameter != null) {
            this.f232990m0.b(io.reactivex.rxjava3.kotlin.A1.i(new io.reactivex.rxjava3.internal.operators.observable.S(this.f232965N.b()).k(this.f232962K.e()), new y(photoParameter, lVar), new z(set, aVar, lVar), 2));
        } else {
            this.f232968Q.b(set, aVar, lVar);
        }
    }

    public final void we() {
        CategoryPublishStep categoryPublishStepA = this.f232975X.a();
        this.f232997t0.setValue(new AbstractC33668b.m(categoryPublishStepA));
        if (categoryPublishStepA instanceof CategoryPublishStep.Params) {
            C(new C((CategoryPublishStep.Params) categoryPublishStepA));
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void x4(@Y61.k Set<String> set, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        xe(set, lVar);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void xe(Set<String> set, Y41.l<? super Boolean, kotlin.G0> lVar) {
        H h12 = new H(lVar);
        ItemDetailsView itemDetailsView = this.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.W();
        }
        ParametersTree parametersTreeNe = ne();
        this.f232966O.f(parametersTreeNe, this.f232975X.C0());
        this.f232990m0.b(new io.reactivex.rxjava3.internal.operators.single.G(new J1(this, parametersTreeNe, 1)).j(new D()).n(new E(set)).s(this.f232962K.e()).x(new F(h12, lVar), new G()));
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void z4(boolean z12) {
        CategoryPublishStep.Params.Config config;
        List<CategoryPublishStep.Params.Predicate> continueButtonChanges;
        CategoryPublishStep.Params.Predicate.Condition.PredicateField.PredicateValue value;
        CategoryPublishStep categoryPublishStepA = this.f232975X.a();
        CategoryPublishStep.Params params = categoryPublishStepA instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepA : null;
        if (params == null || (config = params.getConfig()) == null || (continueButtonChanges = config.getContinueButtonChanges()) == null) {
            return;
        }
        for (CategoryPublishStep.Params.Predicate predicate : continueButtonChanges) {
            CategoryPublishStep.Params.Predicate.Condition.PredicateField videoUploader = predicate.getCondition().getField().getVideoUploader();
            if (videoUploader == null || (value = videoUploader.getValue()) == null || value.isEmpty() != (!z12)) {
                C(new u(categoryPublishStepA));
            } else {
                C(new t(predicate));
            }
        }
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void j2() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
    }

    @Override // com.avito.android.publish.details.ItemDetailsView.b
    public final void s(@Y61.k BubbleInfo bubbleInfo) {
    }
}
