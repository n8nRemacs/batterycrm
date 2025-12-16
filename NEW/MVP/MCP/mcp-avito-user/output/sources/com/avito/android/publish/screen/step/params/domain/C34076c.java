package com.avito.android.publish.screen.step.params.domain;

import af0.InterfaceC19882a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import androidx.view.C23071x;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.f;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.details.b;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.T0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33767l0;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33794u1;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.InterfaceC33779p0;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.V0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.seller_protection.SellerProtectionDialogResult;
import com.avito.android.publish.details.z2;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.publish.uxfeedback_helper.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.MultipleIntParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TextualTag;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.base.BaseEditableParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasTags;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlotConfig;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.rx3.C35896f0;
import com.avito.android.validation.InterfaceC36030r0;
import com.avito.android.validation.l1;
import com.avito.android.validation.n1;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import kotlin.text.C43059p;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import t3.k0;
import t3.l0;
import xM.C49860a;

/* compiled from: PublishDetailsInteractorAsync.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/params/domain/c;", "Lcom/avito/android/publish/screen/step/params/domain/a;", "Lcom/avito/android/publish/details/V0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.screen.step.params.domain.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34076c implements InterfaceC34074a, V0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f241171A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f241172B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f241173C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f241174D;

    /* renamed from: G, reason: collision with root package name */
    public boolean f241177G;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f241184N;

    /* renamed from: P, reason: collision with root package name */
    public int f241186P;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final V0 f241187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f241188c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f241189d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f241190e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33779p0 f241191f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f241192g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f241193h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f241194i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C33794u1 f241195j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.realty_address_submission.h f241196k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.computer_vision.a f241197l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.item_wrapper.a f241198m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final PublishDetailsFlowTracker f241199n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.widget.tagged_input.l f241200o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19882a f241201p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final S0 f241202q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.uxfeedback_helper.b f241203r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Q1 f241204s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f241205t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final T0 f241206u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f241207v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f241208w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.beduin.custom_actions.a f241209x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.seller_protection.c f241210y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.publish.details.auto.a> f241211z;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f241175E = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: F, reason: collision with root package name */
    public int f241176F = -1;

    /* renamed from: H, reason: collision with root package name */
    public int f241178H = -1;

    /* renamed from: I, reason: collision with root package name */
    public int f241179I = -1;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> f241180J = new LinkedHashSet();

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final e2 f241181K = f2.b(32, 32, null, 4);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<K1.AbstractC33668b> f241182L = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: M, reason: collision with root package name */
    public boolean f241183M = true;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C33767l0 f241185O = new C33767l0();

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f241212a;

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
            f241212a = iArr;
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.card_select.item.k f241213l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.publish.slots.card_select.item.k kVar) {
            super(1);
            this.f241213l = kVar;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            return InterfaceC33764k0.a.a(aVar, null, false, false, false, this.f241213l, 15);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "it", "", "invoke", "(Lcom/avito/android/category_parameters/j;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$c, reason: collision with other inner class name */
    public static final class C7222c extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.category_parameters.j<? extends Slot<?>>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7222c f241214l = new C7222c();

        public C7222c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(com.avito.android.category_parameters.j<? extends Slot<?>> jVar) {
            return Boolean.valueOf(jVar.g() instanceof SlotWithValue);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ PublishMethodWithAllSelectedValueParameter f241215l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
            super(1);
            this.f241215l = publishMethodWithAllSelectedValueParameter;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            String value = this.f241215l.getValue();
            return InterfaceC33764k0.a.a(aVar2, null, false, !(value == null || value.length() == 0), false, null, 27);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$e */
    public static final class e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SlotType f241217c;

        public e(SlotType slotType) {
            this.f241217c = slotType;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((P2) obj) instanceof P2.b) {
                PublishDetailsFlowTracker.FlowContext flowContextA = com.avito.android.publish.details.analytics.d.a(this.f241217c);
                if (flowContextA == null) {
                    flowContextA = PublishDetailsFlowTracker.FlowContext.f233436b;
                }
                C34076c.this.B9(flowContextA);
            }
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$f */
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            ((C34076c) this.receiver).r();
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep.Params.Predicate f241218l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CategoryPublishStep.Params.Predicate predicate) {
            super(1);
            this.f241218l = predicate;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            CategoryPublishStep.Params.Predicate predicate = this.f241218l;
            return InterfaceC33764k0.a.a(aVar2, predicate.getAction().getContinueTitle(), false, false, predicate.getAction().getContinueStyle() == CategoryPublishStep.Params.Predicate.Action.ContinueStyle.SECONDARY, null, 22);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "it", "invoke", "(Lcom/avito/android/publish/details/k0$a;)Lcom/avito/android/publish/details/k0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, InterfaceC33764k0.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep f241219l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CategoryPublishStep categoryPublishStep) {
            super(1);
            this.f241219l = categoryPublishStep;
        }

        @Override // Y41.l
        public final InterfaceC33764k0.a invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            CategoryPublishStep.Params.Config config = ((CategoryPublishStep.Params) this.f241219l).getConfig();
            return InterfaceC33764k0.a.a(aVar2, config != null ? config.getContinueTitle() : null, false, false, false, null, 22);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$i */
    public static final class i<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f241221c;

        public i(String str) {
            this.f241221c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) obj;
            boolean zEquals = abstractC35806h3.equals(AbstractC35806h3.e.f318894a);
            C34076c c34076c = C34076c.this;
            if (zEquals) {
                c34076c.f241181K.K5(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(true));
                return;
            }
            boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.d;
            String str = this.f241221c;
            if (!z12) {
                if (!(abstractC35806h3 instanceof AbstractC35806h3.a)) {
                    if ((abstractC35806h3 instanceof AbstractC35806h3.b) || abstractC35806h3.equals(AbstractC35806h3.c.f318892a)) {
                        return;
                    }
                    abstractC35806h3.equals(AbstractC35806h3.f.f318895a);
                    return;
                }
                CategoryParameters categoryParametersC0 = c34076c.f241202q.C0();
                Parcelable parcelableFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(str) : null;
                MultiselectParameter multiselectParameter = parcelableFindParameter instanceof MultiselectParameter ? (MultiselectParameter) parcelableFindParameter : null;
                if (multiselectParameter != null) {
                    multiselectParameter.rollbackToOldValue();
                }
                c34076c.f241181K.K5(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(false));
                c34076c.f241182L.setValue(new K1.AbstractC33668b.j(((AbstractC35806h3.a) abstractC35806h3).f318890a.getF244063c()));
                return;
            }
            CategoryParameters categoryParameters = c34076c.f241188c.f231873k0;
            List<CategoryPublishStep> steps = categoryParameters != null ? categoryParameters.getSteps() : null;
            CategoryParameters categoryParametersC02 = c34076c.f241202q.C0();
            ParameterSlot parameterSlotFindParameter = categoryParametersC02 != null ? categoryParametersC02.findParameter(str) : null;
            SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
            if (selectParameter != null) {
                selectParameter.applyChosenValue();
            }
            c34076c.f241181K.K5(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(false));
            CategoryParameters categoryParameters2 = (CategoryParameters) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
            C0 c02 = c34076c.f241188c;
            c02.Ke(categoryParameters2);
            c34076c.f241180J = c34076c.f241195j.d(c34076c.f241180J, c34076c.q());
            C34076c.v(c34076c, false, new PublishDetailsFlowTracker.FlowContext[]{PublishDetailsFlowTracker.FlowContext.f233449o}, 3);
            c34076c.z();
            if (steps != null) {
                c02.Se(steps);
            }
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$j */
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(C34076c.this.f241194i, "Failed to updateForm", (Throwable) obj, 4);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$k */
    public static final class k<T> implements l41.g {
        public k() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C34076c.this.f241185O.C(Z.f241164l);
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00000\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "items", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$l */
    public static final class l<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set<String> f241225c;

        public l(Set<String> set) {
            this.f241225c = set;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            return C34076c.this.f241193h.h(list, this.f241225c).r(new a0(list));
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/validation/l1$b;", "", "Lcom/avito/conveyor_item/a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$m */
    public static final class m<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f241227c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f241228d;

        /* JADX WARN: Multi-variable type inference failed */
        public m(Y41.a<G0> aVar, Y41.l<? super Boolean, G0> lVar) {
            this.f241227c = aVar;
            this.f241228d = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            l1.b bVar = (l1.b) q12.f406619b;
            List<? extends com.avito.conveyor_item.a> list = (List) q12.f406620c;
            ?? r42 = this.f241228d;
            C34076c c34076c = C34076c.this;
            b0 b0Var = new b0(c34076c, r42);
            boolean z12 = bVar instanceof l1.b.a;
            Y41.a<G0> aVar = this.f241227c;
            if (z12) {
                c34076c.y(list, c34076c.f241180J, aVar, b0Var);
                return;
            }
            if (bVar instanceof l1.b.C9896b) {
                l1.b.C9896b c9896b = (l1.b.C9896b) bVar;
                boolean z13 = c9896b.f319396b;
                ArrayList arrayList = c9896b.f319397c;
                if (z13 && c34076c.f241186P == 0) {
                    c34076c.u();
                    c34076c.f241194i.F0(arrayList, c34076c.f241202q.U(), c34076c.f241188c.ne());
                    c34076c.f241186P++;
                    c34076c.s(list);
                    c34076c.f241182L.setValue(new K1.AbstractC33668b.j(c34076c.f241190e.f234838e));
                    DeepLink deepLinkA = c9896b.a();
                    if (deepLinkA != null) {
                        b.a.a(c34076c.f241207v, deepLinkA, null, null, 6);
                    }
                    r42.invoke(Boolean.FALSE);
                    return;
                }
                if (!c9896b.f319395a) {
                    c34076c.y(list, c34076c.f241180J, aVar, b0Var);
                    return;
                }
                c34076c.u();
                c34076c.f241194i.F0(arrayList, c34076c.f241202q.U(), c34076c.f241188c.ne());
                c34076c.s(list);
                n1.a aVar2 = arrayList != null ? (n1.a) C42745f0.G(arrayList) : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar2 != null ? aVar2.f319403b : null);
                sb2.append(" - ");
                sb2.append(aVar2 != null ? aVar2.f319404c : null);
                C34076c.o(c34076c, new K1.C33667a(aVar2 != null ? aVar2.f319402a : null, sb2.toString(), false, aVar2 != null ? aVar2.f319404c : null, 4, null));
                DeepLink deepLinkA2 = c9896b.a();
                if (deepLinkA2 != null) {
                    b.a.a(c34076c.f241207v, deepLinkA2, null, null, 6);
                }
                r42.invoke(Boolean.FALSE);
            }
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$n */
    public static final class n<T> implements l41.g {
        public n() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C34076c.this.f241182L.setValue(new K1.AbstractC33668b.j(com.avito.android.error.z.l((Throwable) obj)));
        }
    }

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.domain.c$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f241230l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Y41.l<? super Boolean, G0> lVar) {
            super(0);
            this.f241230l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f241230l.invoke(Boolean.TRUE);
            return G0.f406611a;
        }
    }

    @Inject
    public C34076c(@Y61.k V0 v02, @Y61.k C0 c02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C33771m1 c33771m1, @Y61.k InterfaceC33779p0 interfaceC33779p0, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C33794u1 c33794u1, @Y61.k com.avito.android.publish.realty_address_submission.h hVar, @Y61.k com.avito.android.publish.details.computer_vision.a aVar, @Y61.k com.avito.android.publish.details.item_wrapper.a aVar2, @Y61.k PublishDetailsFlowTracker publishDetailsFlowTracker, @Y61.k com.avito.android.ui.widget.tagged_input.l lVar, @Y61.k InterfaceC19882a interfaceC19882a, @Y61.k S0 s02, @Y61.k com.avito.android.publish.uxfeedback_helper.b bVar, @Y61.k Q1 q12, @Y61.k com.avito.android.publish.items.e eVar, @Y61.k T0 t02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.publish.details.beduin.custom_actions.a aVar4, @Y61.k com.avito.android.publish.details.seller_protection.c cVar, @Y61.k h31.e<com.avito.android.publish.details.auto.a> eVar2, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k @k0 u3.l<SimpleTestGroupWithNone> lVar2, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar3, @Y61.k Set<TV0.d<?, ?>> set) {
        this.f241187b = v02;
        this.f241188c = c02;
        this.f241189d = interfaceC35745a5;
        this.f241190e = c33771m1;
        this.f241191f = interfaceC33779p0;
        this.f241192g = jVar;
        this.f241193h = interfaceC36030r0;
        this.f241194i = interfaceC33535v;
        this.f241195j = c33794u1;
        this.f241196k = hVar;
        this.f241197l = aVar;
        this.f241198m = aVar2;
        this.f241199n = publishDetailsFlowTracker;
        this.f241200o = lVar;
        this.f241201p = interfaceC19882a;
        this.f241202q = s02;
        this.f241203r = bVar;
        this.f241204s = q12;
        this.f241205t = eVar;
        this.f241206u = t02;
        this.f241207v = aVar3;
        this.f241208w = interfaceC40691b;
        this.f241209x = aVar4;
        this.f241210y = cVar;
        this.f241211z = eVar2;
        this.f241171A = interfaceC30978i;
        this.f241172B = lVar2;
        this.f241173C = lVar3;
        this.f241174D = set;
    }

    public static final void n(C34076c c34076c, ApiError apiError) {
        e2 e2Var = c34076c.f241181K;
        e2Var.K5(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
        e2Var.K5(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(false));
        com.avito.android.error.z.g(apiError, new C34088o(c34076c), null, null, null, null, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(com.avito.android.publish.screen.step.params.domain.C34076c r9, com.avito.android.publish.details.K1.C33667a r10) {
        /*
            r9.getClass()
            java.lang.String r0 = r10.f233012a
            r1 = 0
            if (r0 == 0) goto L11
            com.avito.android.remote.model.category_parameters.ParametersTree r2 = r9.q()
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
            com.avito.android.publish.details.S0 r2 = r9.f241202q
            com.avito.android.remote.model.Navigation r5 = r2.U()
            com.avito.android.publish.C0 r2 = r9.f241188c
            java.lang.String r6 = r2.ne()
            com.avito.android.publish.analytics.v r2 = r9.f241194i
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
            com.avito.android.publish.details.m1 r10 = r9.f241190e
            java.lang.String r10 = r10.a(r8)
            r0.<init>(r10)
        L71:
            com.avito.android.util.architecture_components.D<com.avito.android.publish.details.K1$b> r9 = r9.f241182L
            r9.setValue(r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.params.domain.C34076c.o(com.avito.android.publish.screen.step.params.domain.c, com.avito.android.publish.details.K1$a):void");
    }

    public static void v(C34076c c34076c, boolean z12, PublishDetailsFlowTracker.FlowContext[] flowContextArr, int i12) {
        boolean z13 = (i12 & 1) != 0 ? false : z12;
        boolean z14 = (i12 & 2) == 0;
        if ((i12 & 4) != 0) {
            flowContextArr = new PublishDetailsFlowTracker.FlowContext[0];
        }
        PublishDetailsFlowTracker.FlowContext[] flowContextArr2 = flowContextArr;
        ParametersTree parametersTreeQ = c34076c.q();
        c34076c.f241185O.C(E.f241133l);
        if (c34076c.f241180J.isEmpty()) {
            c34076c.w(parametersTreeQ, z13, z14, flowContextArr2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> it = c34076c.f241180J.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        c34076c.f241175E.b(io.reactivex.rxjava3.core.z.L0(arrayList, F.f241134b).j0(c34076c.f241189d.e()).v0(new G(c34076c, parametersTreeQ, z13, z14, flowContextArr2), new H(c34076c), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void B9(@Y61.k PublishDetailsFlowTracker.FlowContext... flowContextArr) {
        ParametersTree parametersTreeQ = q();
        CpaTariffSlot cpaTariffSlot = (CpaTariffSlot) parametersTreeQ.getFirstParameterOfType(CpaTariffSlot.class);
        if (cpaTariffSlot != null) {
            this.f241194i.s(((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getButton().getAction());
        }
        CategoryParameters categoryParametersC0 = this.f241202q.C0();
        InterfaceC36030r0 interfaceC36030r0 = this.f241193h;
        interfaceC36030r0.f(parametersTreeQ, categoryParametersC0);
        interfaceC36030r0.getF319331j().accept(Ha(parametersTreeQ, flowContextArr));
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    @SuppressLint({"HardcodeStringDetector"})
    public final void C5(@Y61.k AddressParameter addressParameter) {
        AddressParameter.Widget.Config config;
        TooltipOptions tooltipOptions;
        TooltipOptions.Button button;
        AddressParameter.Widget.Config config2;
        AddressParameter.Widget.Config config3;
        TooltipOptions tooltipOptions2;
        AddressParameter.Widget.Config config4;
        DeepLink deeplink = null;
        if (addressParameter.getValue() == null) {
            InterfaceC33535v.a.b(this.f241194i, "Address must not be null!", null, 6);
            return;
        }
        d6();
        if (this.f241178H != -1) {
            z2 z2Var = z2.f235116a;
            AddressParameter.Widget widget = addressParameter.getWidget();
            String type = (widget == null || (config4 = widget.getConfig()) == null) ? null : config4.getType();
            AddressParameter.Value value = addressParameter.getValue();
            String text = value != null ? value.getText() : null;
            AddressParameter.Widget widget2 = addressParameter.getWidget();
            String onShowRegexp = (widget2 == null || (config3 = widget2.getConfig()) == null || (tooltipOptions2 = config3.getTooltipOptions()) == null) ? null : tooltipOptions2.getOnShowRegexp();
            z2Var.getClass();
            if (!kotlin.jvm.internal.L.f(type, "vacancy") || onShowRegexp == null || new C43059p(onShowRegexp).a(String.valueOf(text))) {
                int i12 = this.f241178H;
                AddressParameter.Widget widget3 = addressParameter.getWidget();
                TooltipOptions tooltipOptions3 = (widget3 == null || (config2 = widget3.getConfig()) == null) ? null : config2.getTooltipOptions();
                AddressParameter.Widget widget4 = addressParameter.getWidget();
                if (widget4 != null && (config = widget4.getConfig()) != null && (tooltipOptions = config.getTooltipOptions()) != null && (button = tooltipOptions.getButton()) != null) {
                    deeplink = button.getDeeplink();
                }
                this.f241181K.K5(new PublishDetailsInternalAction.InternalViewAction.ShowTooltipForItem(i12, tooltipOptions3, deeplink));
            }
        }
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final boolean Ca() {
        return this.f241187b.Ca();
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
        this.f241185O.C(new b(kVar));
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void D5(@Y61.k SellerProtectionDialogResult sellerProtectionDialogResult) {
        this.f241210y.b(sellerProtectionDialogResult, this.f241180J, new f(0, this, C34076c.class, "onMainButtonClicked", "onMainButtonClicked()V", 0));
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void Eb(@Y61.k String str) {
        this.f241187b.Eb(str);
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InterfaceC33878l.a> H8() {
        return this.f241187b.H8();
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @Y61.k
    public final List<com.avito.conveyor_item.a> Ha(@Y61.k UV0.a<ParameterSlot> aVar, @Y61.k PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        u3.l<SimpleTestGroupWithNone> lVar = this.f241172B;
        if (lVar.f439745a.f439749b.a()) {
            lVar.b();
        }
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f241173C;
        if (lVar2.f439745a.f439749b.a()) {
            lVar2.b();
        }
        this.f241199n.a((PublishDetailsFlowTracker.FlowContext[]) Arrays.copyOf(flowContextArr, flowContextArr.length));
        return this.f241191f.b(aVar, this.f241180J, this.f241188c.ve());
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void I8(@Y61.l Y41.a aVar, boolean z12) {
        this.f241183M = z12;
        this.f241184N = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r1 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        r6.f241181K.K5(new com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction.InternalViewAction.ScrollToAccordionContent(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        return;
     */
    @Override // com.avito.android.publish.details.InterfaceC33678b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J5(@Y61.k JO.a r7) {
        /*
            r6 = this;
            com.avito.android.remote.model.category_parameters.ParametersTree r0 = r6.q()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot
            if (r4 == 0) goto Ld
            r1.add(r3)
            goto Ld
        L1f:
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot r4 = (com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot) r4
            java.lang.String r4 = r4.getId()
            java.lang.String r5 = r7.f8933b
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L23
            goto L3f
        L3e:
            r2 = r3
        L3f:
            com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot r2 = (com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot) r2
            if (r2 == 0) goto L5e
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r7 = r2.getWidget()
            if (r7 == 0) goto L5e
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r7 = r7.getConfig()
            com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlotConfig r7 = (com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlotConfig) r7
            if (r7 == 0) goto L5e
            java.util.List r7 = r7.getContentFields()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = kotlin.collections.C42745f0.S(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L5f
        L5e:
            r7 = r3
        L5f:
            if (r7 != 0) goto L62
            return
        L62:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L67:
            boolean r2 = r0.hasNext()
            r4 = -1
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            if (r1 < 0) goto L84
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r2 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r7)
            if (r2 == 0) goto L81
            goto L89
        L81:
            int r1 = r1 + 1
            goto L67
        L84:
            kotlin.collections.C42745f0.H0()
            throw r3
        L88:
            r1 = r4
        L89:
            if (r1 != r4) goto L8c
            return
        L8c:
            kotlinx.coroutines.flow.e2 r7 = r6.f241181K
            com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction$InternalViewAction$ScrollToAccordionContent r0 = new com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction$InternalViewAction$ScrollToAccordionContent
            r0.<init>(r1)
            r7.K5(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.params.domain.C34076c.J5(JO.a):void");
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void J7(@Y61.k PriceReductionLink.b bVar) {
        boolean z12 = bVar instanceof PriceReductionLink.b.C4066b;
        V0 v02 = this.f241187b;
        if (!z12) {
            v02.oc();
            return;
        }
        PriceParameter priceParameter = (PriceParameter) q().getFirstParameterOfType(PriceParameter.class);
        if (priceParameter != null) {
            long j12 = ((PriceReductionLink.b.C4066b) bVar).f134787b;
            priceParameter.setValue(String.valueOf(j12));
            v02.Eb(String.valueOf(j12));
            l(null);
            r();
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void Mb(@Y61.k com.avito.conveyor_item.a aVar) {
        PublishDetailsFlowTracker.FlowContext flowContextA;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> it = this.f241180J.iterator();
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
        ParameterSlot parameterSlotFindParameter = q().findParameter(aVar.getF157692b());
        if ((parameterSlotFindParameter instanceof BaseEditableParameter) && kotlin.jvm.internal.L.f(((BaseEditableParameter) parameterSlotFindParameter).getUpdatesForm(), Boolean.TRUE)) {
            V8(parameterSlotFindParameter.getId());
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
        this.f241185O.C(new d(publishMethodWithAllSelectedValueParameter));
        v(this, false, null, 7);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
        v(this, false, null, 7);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    @Y61.k
    public final Bundle P() {
        return C22777e.b(new kotlin.Q("retries_with_warnings_count", Integer.valueOf(this.f241186P)));
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    @Y61.k
    public final InterfaceC43160i<PublishDetailsInternalAction> Q0() {
        return C43175k.w();
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void Q7() {
        r();
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void Ta(boolean z12) {
        this.f241181K.K5(PublishDetailsInternalAction.InternalViewAction.HideKeyboard.f241455b);
        boolean zMa = this.f241202q.Ma();
        com.avito.android.util.architecture_components.D<K1.AbstractC33668b> d12 = this.f241182L;
        if (zMa) {
            this.f241211z.get().a();
            d12.setValue(K1.AbstractC33668b.d.f233024a);
        } else if (z12) {
            d12.setValue(K1.AbstractC33668b.e.f233025a);
        } else {
            this.f241188c.ye();
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @SuppressLint({"HardcodeStringDetector"})
    public final void V8(@Y61.k String str) {
        b.InterfaceC4110b.a.a(this, null, 3);
        S0 s02 = this.f241202q;
        io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> zVarC = this.f241187b.c(s02.U(), s02.C0(), this.f241188c.f231868f0);
        InterfaceC35745a5 interfaceC35745a5 = this.f241189d;
        this.f241175E.b(zVarC.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new i(str), new j(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void W8(@Y61.k EditableParameter<?> editableParameter, @Y61.l String str, @Y61.l Integer num, @Y61.l CategoryParameters categoryParameters) {
        this.f241187b.W8(editableParameter, str, num, categoryParameters);
    }

    @Override // com.avito.android.publish.pretend.e
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PretendResult> a(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return this.f241187b.a(navigation2, categoryParameters);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void b(@Y61.l Bundle bundle) {
        this.f241186P = bundle != null ? bundle.getInt("retries_with_warnings_count") : 0;
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> c(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, @Y61.l String str) {
        return this.f241187b.c(navigation2, categoryParameters, str);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    @j.K
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
        if (str != null) {
            V8(str);
            return;
        }
        if (parameterSlot instanceof SelectParameter) {
            C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(this.f241180J), C7222c.f241214l));
            while (aVar.hasNext()) {
                ((com.avito.android.category_parameters.j) aVar.next()).e(parameterSlot);
            }
        }
        v(this, false, null, 7);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill) {
        if (confirmation == null) {
            p(navigationButtonAction, deepLink, list, paramsToFill);
        } else {
            this.f241181K.K5(new PublishDetailsInternalAction.InternalRouteAction.ShowConfirmationDialog(navigationButtonAction, confirmation, deepLink, list, null, 16, null));
        }
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void d6() {
        CategoryParameters categoryParametersC0 = this.f241202q.C0();
        if (categoryParametersC0 == null) {
            return;
        }
        this.f241181K.K5(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
        this.f241188c.Ke(categoryParametersC0);
        v(this, false, null, 7);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> e(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, boolean z12, @Y61.l String str) {
        return this.f241187b.e(navigation2, categoryParameters, z12, str);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void e0() {
        this.f241175E.e();
        if (!this.f241204s.v().invoke().booleanValue()) {
            this.f241195j.f235042e.e();
        }
        this.f241193h.a();
        this.f241182L.postValue(null);
        this.f241171A.K();
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void e7() {
        v(this, false, null, 5);
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long e8() {
        return this.f241187b.e8();
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.l
    public final Object f(@Y61.l CategoryParameters categoryParameters, long j12, @Y61.k Continuation<? super TypedResult<String>> continuation) {
        return this.f241187b.f(categoryParameters, j12, continuation);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void f0() {
        if (this.f241204s.v().invoke().booleanValue()) {
            this.f241195j.f235042e.e();
        }
        this.f241208w.onCleared();
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f241180J;
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
        this.f241198m.clear();
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> g(@Y61.k Navigation navigation2, @Y61.l String str, @Y61.l Map<String, ? extends Object> map, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        return this.f241187b.g(navigation2, str, map, str2, bool, str3);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ItemBrief> h(@Y61.k String str) {
        return this.f241187b.h(str);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
        if (str == null) {
            v(this, false, null, 7);
            return;
        }
        ParameterSlot parameterSlotFindParameter = q().findParameter(str);
        if ((parameterSlotFindParameter instanceof BaseEditableParameter) && kotlin.jvm.internal.L.f(((BaseEditableParameter) parameterSlotFindParameter).getUpdatesForm(), Boolean.TRUE)) {
            V8(parameterSlotFindParameter.getId());
        }
    }

    @Override // com.avito.android.publish.InterfaceC33513a
    @Y61.k
    public final io.reactivex.rxjava3.core.I<AIDescription> i(@Y61.l CategoryParameters categoryParameters, @Y61.l String str, @Y61.l String str2) {
        return this.f241187b.i(categoryParameters, str, str2);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> j(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f241187b.j(navigation2, str, str2, str3);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z k(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters, @Y61.k String str) {
        return this.f241187b.k(navigation2, categoryParameters, str);
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b, Xd0.d
    public final void l(@Y61.l String str) {
        b.InterfaceC4110b.a.a(this, str, 2);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void l0() {
        this.f241182L.setValue(new K1.AbstractC33668b.g(this.f241201p.a()));
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void l2(@Y61.k SelectParameter.Value value) {
        Object next;
        Iterator<T> it = this.f241180J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.category_parameters.j) next).g() instanceof ResidentialComplexSlot) {
                    break;
                }
            }
        }
        com.avito.android.category_parameters.j jVar = (com.avito.android.category_parameters.j) next;
        if (jVar != null) {
            com.avito.android.publish.slots.r rVar = (com.avito.android.publish.slots.r) jVar;
            rVar.j(value);
            V8(((ResidentialComplexSlotConfig) rVar.f244730b.getWidget().getConfig()).getDevelopment().getId());
        }
    }

    @Override // com.avito.android.publish.pretend.e
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<PretendResult>> m(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return this.f241187b.m(navigation2, categoryParameters);
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void n6() {
        this.f241187b.n6();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
        d6();
        t(this.f241179I, true);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m o1() {
        return C43175k.N(this.f241181K, new d0(C23071x.a(this.f241185O.f234824b)), new e0(this.f241195j.c()), new e0(C23071x.a(this.f241182L)), new e0(C23071x.a(this.f241191f.getF234900d())), new e0(C23071x.a(this.f241196k.f239059P)));
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void oc() {
        this.f241187b.oc();
    }

    public final void p(CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, DeepLink deepLink, List<? extends BeduinAction> list, CategoryPublishStep.Params.ParamsToFill paramsToFill) {
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
        int i12 = navigationButtonAction == null ? -1 : a.f241212a[navigationButtonAction.ordinal()];
        if (i12 == -1) {
            r();
            return;
        }
        if (i12 == 2) {
            if (deepLink == null) {
                return;
            }
            boolean z12 = deepLink instanceof AddAutoToC2CTrxLink;
            if ((deepLink instanceof AuctionAddLink) || z12) {
                x4(B0.f406639b, new T(this, deepLink));
                return;
            } else {
                this.f241182L.setValue(new K1.AbstractC33668b.f(deepLink));
                return;
            }
        }
        Object obj = null;
        if (i12 == 3) {
            CategoryPublishStep categoryPublishStepA = this.f241202q.a();
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
                Q1 q12 = this.f241204s;
                q12.getClass();
                kotlin.reflect.n<Object> nVar = Q1.f67448x0[11];
                if (((Boolean) q12.f67498m.a().invoke()).booleanValue()) {
                    this.f241181K.K5(PublishDetailsInternalAction.InternalStateAction.ShowProgress.f241447b);
                    this.f241185O.C(D.f241132l);
                    this.f241175E.b(this.f241203r.a(a.C7356a.f245512b).t0(new C34077d(this)));
                    return;
                }
            }
            r();
            return;
        }
        if (i12 != 4) {
            if (i12 != 5) {
                return;
            }
            com.avito.android.beduin_shared.model.utils.a.a(this.f241208w, list);
            return;
        }
        C0 c02 = this.f241188c;
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

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void p7(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
        this.f241185O.C(lVar);
    }

    public final ParametersTree q() {
        ParametersTree parametersTreeWa = this.f241202q.wa();
        if (parametersTreeWa != null) {
            return parametersTreeWa;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void qb() {
        Object next;
        InterfaceC36030r0 interfaceC36030r0 = this.f241193h;
        interfaceC36030r0.i(this.f241174D);
        S0 s02 = this.f241202q;
        if (s02.Ma()) {
            this.f241211z.get().b();
        }
        this.f241180J = this.f241195j.d(this.f241180J, q());
        C0 c02 = this.f241188c;
        io.reactivex.rxjava3.disposables.d dVarT0 = c02.f231882t0.t0(new Q(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f241175E;
        cVar.b(dVarT0);
        cVar.b(c02.f231882t0.N(O.f241152b).t0(new P(this)));
        com.jakewharton.rxrelay3.c f319332k = interfaceC36030r0.getF319332k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f241189d;
        cVar.b(C35896f0.g(f319332k.y(50L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e()), new C34090q(this)));
        cVar.b(C35896f0.g(interfaceC36030r0.getF319332k().y(300L, timeUnit, interfaceC35745a5.c()).d0(r.f241288b).j0(interfaceC35745a5.e()), new C34091s(this)));
        cVar.b(C35896f0.g(interfaceC36030r0.getF319332k(), new C34092t(this)));
        cVar.b(interfaceC36030r0.getF319334m().j0(interfaceC35745a5.e()).t0(new C34089p(this)));
        this.f241171A.E0();
        com.jakewharton.rxrelay3.c f319332k2 = interfaceC36030r0.getF319332k();
        C34078e c34078e = new C34078e(this);
        C34079f c34079f = new C34079f(this);
        f319332k2.getClass();
        cVar.b(f319332k2.v0(c34078e, c34079f, io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(this.f241198m.getF234783e().j0(interfaceC35745a5.e()).t0(new C34080g(this)));
        cVar.b(this.f241187b.H8().j0(interfaceC35745a5.e()).t0(new C34081h(this)));
        cVar.b(this.f241209x.f233556b.t0(new C34083j(this)));
        cVar.b(this.f241207v.d9().N(C34084k.f241281b).t0(new C34085l(this)));
        C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(q()), C34098z.f241297l));
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
                this.f241200o.m3(editableParameter.getId(), tags != null ? C43033p.D(new o0(C43033p.l(new C42770s0(tags), new A(str)), B.f241130l)) : null);
            }
        }
        v(this, c02.Ee(), new PublishDetailsFlowTracker.FlowContext[]{PublishDetailsFlowTracker.FlowContext.f233437c}, 2);
        z();
        if (kotlin.jvm.internal.L.f(this.f241206u.j(true), Boolean.TRUE) && c02.Be()) {
            ParametersTree parametersTreeQ = q();
            interfaceC36030r0.f(parametersTreeQ, s02.C0());
            com.avito.android.util.rx3.S0.b(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC34075b(this, parametersTreeQ, 0)).n(new V(this)).s(interfaceC35745a5.e()), new Y(this));
        }
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final long qd() {
        return this.f241187b.qd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        Object next;
        ParameterSlot next2;
        List<? extends Long> list;
        Iterator<T> it = this.f241180J.iterator();
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
        Iterator<ParameterSlot> it2 = q().iterator();
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
            if (!z12 && (list = value) != null && !list.isEmpty() && this.f241171A.K0(value)) {
                multipleIntParameter.setValue(null);
            }
        }
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f241180J;
        com.avito.android.publish.details.seller_protection.c cVar = this.f241210y;
        if (cVar.c(set)) {
            this.f241182L.setValue(K1.AbstractC33668b.k.f233036a);
            cVar.a();
            return;
        }
        C0 c02 = this.f241188c;
        if (c02.Be()) {
            V0 v02 = this.f241187b;
            if (v02.Ca()) {
                ItemBrief itemBrief = c02.f231867e0;
                String id2 = itemBrief != null ? itemBrief.getId() : null;
                if (id2 != null) {
                    this.f241175E.b(v02.z9(id2).j(new C34093u(this)).s(this.f241189d.e()).x(new C34094v(this, id2), io.reactivex.rxjava3.internal.functions.a.f401996f));
                    return;
                }
            }
        }
        if (this.f241183M) {
            x4(B0.f406639b, new C34095w(this.f241202q.Ma() ? new C34096x(this) : new C34097y(this)));
            return;
        }
        Y41.a<G0> aVar = this.f241184N;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    public final void r3(@Y61.k String str) {
        this.f241187b.r3(str);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void r9(@Y61.k SlotType slotType) {
        Object next;
        io.reactivex.rxjava3.core.z<P2<G0>> zVarH;
        Iterator<T> it = this.f241180J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.avito.android.category_parameters.j) next).g().getSlotType() == slotType) {
                    break;
                }
            }
        }
        com.avito.android.category_parameters.j jVar = (com.avito.android.category_parameters.j) next;
        if (jVar == null || (zVarH = jVar.h()) == null) {
            zVarH = io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        this.f241175E.b(zVarH.j0(this.f241189d.e()).t0(new e(slotType)));
    }

    public final void s(List<? extends com.avito.conveyor_item.a> list) {
        int i12 = this.f241176F;
        if (i12 != -1) {
            t(i12, list.get(i12) instanceof ParameterElement.y);
        } else {
            this.f241177G = true;
        }
    }

    public final void t(int i12, boolean z12) {
        this.f241181K.K5(new PublishDetailsInternalAction.InternalViewAction.ScrollToItem(i12, z12));
        this.f241176F = -1;
        this.f241177G = false;
    }

    public final void u() {
        this.f241181K.K5(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
        this.f241185O.C(C.f241131l);
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void v3(boolean z12) {
        D(z12 ? k.b.f243161a : null);
    }

    @Override // com.avito.android.publish.screen.step.params.domain.InterfaceC34074a
    public final void vb(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list) {
        p(navigationButtonAction, deepLink, list, null);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
        d6();
    }

    public final void w(ParametersTree parametersTree, boolean z12, boolean z13, PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        String value;
        u();
        PriceParameter priceParameter = (PriceParameter) parametersTree.getFirstParameterOfType(PriceParameter.class);
        if (priceParameter != null && (value = priceParameter.getValue()) != null) {
            this.f241187b.Eb(value);
        }
        CategoryParameters categoryParametersC0 = this.f241202q.C0();
        InterfaceC36030r0 interfaceC36030r0 = this.f241193h;
        interfaceC36030r0.f(parametersTree, categoryParametersC0);
        List<com.avito.conveyor_item.a> listHa = Ha(parametersTree, flowContextArr);
        if (this.f241188c.Oe()) {
            this.f241181K.K5(new PublishDetailsInternalAction.InternalStateAction.SetupDownScrollListener());
        }
        if (z13) {
            s(listHa);
        }
        interfaceC36030r0.getF319331j().accept(listHa);
        if (z12) {
            y(listHa, this.f241180J, new I(this), J.f241142l);
        }
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void x(Y41.l lVar, PhotoParameter photoParameter) {
        lVar.invoke(new K1.C33667a(photoParameter != null ? photoParameter.getId() : null, "Photos are still loading", false, null, 12, null));
        if (photoParameter != null) {
            photoParameter.setErrorMessage(this.f241190e.f234837d);
        }
        e7();
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @SuppressLint({"HardcodeStringDetector"})
    public final void x4(@Y61.k Set<String> set, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        o oVar = new o(lVar);
        this.f241181K.K5(PublishDetailsInternalAction.InternalViewAction.HideKeyboard.f241455b);
        ParametersTree parametersTreeQ = q();
        this.f241193h.f(parametersTreeQ, this.f241202q.C0());
        this.f241175E.b(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC34075b(this, parametersTreeQ, 1)).j(new k()).n(new l(set)).s(this.f241189d.e()).x(new m(oVar, lVar), new n()));
    }

    public final void y(List<? extends com.avito.conveyor_item.a> list, Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, Y41.a<G0> aVar, Y41.l<? super K1.C33667a, G0> lVar) {
        PhotoParameter photoParameter = (PhotoParameter) q().getFirstParameterOfType(PhotoParameter.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ParameterElement.I) {
                arrayList.add(obj);
            }
        }
        ParameterElement.I i12 = (ParameterElement.I) C42745f0.G(arrayList);
        if ((i12 != null ? i12.f117327h : null) instanceof ParameterElement.I.a.c) {
            lVar.invoke(new K1.C33667a(i12.f117181b, null, false, null, 12, null));
        } else if (photoParameter != null) {
            this.f241175E.b(A1.i(new io.reactivex.rxjava3.internal.operators.observable.S(this.f241192g.b()).k(this.f241189d.e()), new K(this, photoParameter, lVar), new L(this, set, aVar, lVar), 2));
        } else {
            this.f241195j.b(set, aVar, lVar);
        }
    }

    public final void z() {
        CategoryPublishStep categoryPublishStepA = this.f241202q.a();
        this.f241182L.setValue(new K1.AbstractC33668b.m(categoryPublishStepA));
        if (categoryPublishStepA instanceof CategoryPublishStep.Params) {
            this.f241185O.C(new S((CategoryPublishStep.Params) categoryPublishStepA));
        }
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void z4(boolean z12) {
        CategoryPublishStep.Params.Config config;
        List<CategoryPublishStep.Params.Predicate> continueButtonChanges;
        CategoryPublishStep.Params.Predicate.Condition.PredicateField.PredicateValue value;
        CategoryPublishStep categoryPublishStepA = this.f241202q.a();
        CategoryPublishStep.Params params = categoryPublishStepA instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepA : null;
        if (params == null || (config = params.getConfig()) == null || (continueButtonChanges = config.getContinueButtonChanges()) == null) {
            return;
        }
        for (CategoryPublishStep.Params.Predicate predicate : continueButtonChanges) {
            CategoryPublishStep.Params.Predicate.Condition.PredicateField videoUploader = predicate.getCondition().getField().getVideoUploader();
            C33767l0 c33767l0 = this.f241185O;
            if (videoUploader == null || (value = videoUploader.getValue()) == null || value.isEmpty() != (!z12)) {
                c33767l0.C(new h(categoryPublishStepA));
            } else {
                c33767l0.C(new g(predicate));
            }
        }
    }

    @Override // com.avito.android.publish.InterfaceC34150w0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> z9(@Y61.k String str) {
        return this.f241187b.z9(str);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
    }
}
