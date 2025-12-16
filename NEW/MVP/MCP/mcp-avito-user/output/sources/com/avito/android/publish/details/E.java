package com.avito.android.publish.details;

import Cd0.C13290x;
import Cd0.E;
import Ij.C14119a;
import android.annotation.SuppressLint;
import android.net.Uri;
import com.avito.android.analytics.events.j;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.blueprint.date.interval.f;
import com.avito.android.blueprint.suggest.InterfaceC28874c;
import com.avito.android.blueprints.input.C28876a;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.blueprints.publish.date_interval.f;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PointWithPosition;
import com.avito.android.image.enhancement.C30979j;
import com.avito.android.items.CheckBoxItemWithText;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.mandatory_verification.items.uploader.a;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.details.C33679b0;
import com.avito.android.publish.details.D;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import com.avito.android.publish.items.iac_for_pro_enabled.IacForProEnabledItem;
import com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem;
import com.avito.android.publish.items.tagged_input.InterfaceC33870b;
import com.avito.android.publish.slots.contact_method.info_item.ContactMethodInfoBlockItem;
import com.avito.android.publish.slots.contact_method.item.ContactMethodItem;
import com.avito.android.publish.slots.contact_method.publish.item.PublishContactMethodItem;
import com.avito.android.publish.video_upload.InterfaceC34146a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySidePoint;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaButtonAction;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.kotlin.C42039e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import javax.inject.Inject;
import kl0.C42711b;
import kl0.C42712c;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43183m1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import vf0.C49325f;
import yc.C50213a;

/* compiled from: ItemPresentersDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/E;", "Lcom/avito/android/publish/details/D;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class E implements com.avito.android.publish.details.D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232634a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232635b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f232636c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.view.i f232637d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.b f232638e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.iac.e f232639f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.tags.g f232640g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f232641h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f232642i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f232643j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C50213a f232644k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34146a f232645l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.alert_banner.n f232646m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f232647n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.auto_description.a f232648o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f232649p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_addresses.c f232650q;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public D.a f232652s;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C43238h f232654u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f232655v;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232651r = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C33772n f232653t = new C33772n(this, 1);

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A<T> implements l41.g {
        public A() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeMultiselectClearEvent", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A0<T> implements l41.g {
        public A0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deliverDescription click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/a;", "event", "Lkotlin/G0;", "accept", "(LIj/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A1<T> implements l41.g {

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[ParameterElement.SelectorCardsCarousel.SelectType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ParameterElement.SelectorCardsCarousel.SelectType selectType = ParameterElement.SelectorCardsCarousel.SelectType.f117362b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public A1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            T next;
            C14119a c14119a = (C14119a) obj;
            int iOrdinal = c14119a.f8493b.ordinal();
            E e12 = E.this;
            List<Ij.b> list = c14119a.f8492a;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return;
                }
                E.e(e12, list);
                return;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                } else {
                    next = it.next();
                    if (((Ij.b) next).f8495b.f8964e) {
                        break;
                    }
                }
            }
            Ij.b bVar = next;
            if (bVar != null) {
                E.f(e12, bVar);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A2<T> implements l41.g {
        public A2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe radiogroup select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A3<T> implements l41.g {
        public A3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe iacDevices state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B<T> implements l41.g {
        public B() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.v vVar = (ParameterElement.v) obj;
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(vVar.f117181b) : null;
            if (parameterSlotFindParameter instanceof MultiselectParameter) {
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
                boolean zF2 = kotlin.jvm.internal.L.f(multiselectParameter.getUpdatesForm(), Boolean.TRUE);
                InterfaceC33678b interfaceC33678b = e12.f232643j;
                if (!zF2) {
                    multiselectParameter.setValue(null);
                    interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
                } else {
                    multiselectParameter.setOldValue(multiselectParameter.getValue());
                    multiselectParameter.setValue(null);
                    interfaceC33678b.l(multiselectParameter.getId());
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B0<T> implements l41.g {
        public B0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232635b.A(e12.f232649p.f231865c0);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B1<T> implements l41.g {
        public B1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on selector card group click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B2<T> implements l41.g {
        public B2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B3<T> implements l41.g {
        public B3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C<T> implements l41.g {
        public C() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeMultiselectClearEvent", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "stringId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C0<T> implements l41.g {
        public C0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.o(str);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$SelectorCardsCarousel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C1<T> implements l41.g {
        public C1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.SelectorCardsCarousel) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C2<T> implements l41.g {
        public C2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe radiogroup select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public C3() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            E.this.f232635b.h0();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D0<T> implements l41.g {
        public D0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on AutoGroupBlockPresenter click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D1<T> implements l41.g {
        public D1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on supplementaryOption click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/category_parameters/ParameterElement$w;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D2<T> implements l41.g {
        public D2() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            ParameterElement.w wVar = (ParameterElement.w) q12.f406619b;
            int iIntValue = ((Number) q12.f406620c).intValue();
            E e12 = E.this;
            if (iIntValue != -1) {
                e12.f232637d.P9(wVar, iIntValue);
            } else {
                e12.f232635b.p0();
                e12.f232637d.g2(wVar);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C28876a f232676m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D3(C28876a c28876a) {
            super(0);
            this.f232676m = c28876a;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            E e12 = E.this;
            e12.f232635b.E();
            e12.f232648o.w3(this.f232676m);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$E, reason: collision with other inner class name */
    public static final class C7073E<T> implements l41.g {
        public C7073E() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeSwitcherValueChanges", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "slotWithStepConfigId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E0<T> implements l41.g {
        public E0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.o(str);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E1<T> implements l41.g {
        public E1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.D0();
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E2<T> implements l41.g {
        public E2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on objects item click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public E3() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            E.this.f232635b.U();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;", "itemAction", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F<T> implements l41.g {
        public F() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12;
            D.a aVar;
            IacDevicesItem.b bVar = (IacDevicesItem.b) obj;
            if (!(bVar instanceof IacDevicesItem.b.a) || (aVar = (e12 = E.this).f232652s) == null) {
                return;
            }
            IacDevicesItem iacDevicesItem = ((IacDevicesItem.b.a) bVar).f236859a;
            aVar.t(C42745f0.M0(iacDevicesItem.f236854d), iacDevicesItem.f236855e, new com.avito.android.publish.details.W(bVar, e12));
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F0<T> implements l41.g {
        public F0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on GroupContactPresenter click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F1<T> implements l41.g {
        public F1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on click UserVerificationBlocker button", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "link", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F2<T> implements l41.g {
        public F2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            E e12 = E.this;
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                C33771m1 c33771m1 = e12.f232636c;
                aVar.h2(null, c33771m1.f234839f, c33771m1.f234840g, c33771m1.f234835b, new com.avito.android.publish.details.V(e12, str));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G<T> implements l41.g {
        public G() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe iacDevices state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/E$G0", "Lcom/avito/android/details/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class G0 implements com.avito.android.details.e {
        public G0() {
        }

        @Override // com.avito.android.details.e
        @Y61.l
        public final ParametersTree wa() {
            return E.this.f232641h.C0();
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G1<T> implements l41.g {
        public G1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G2<T> implements l41.g {
        public G2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on noCarSlotClickObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/item/ContactMethodItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_method/item/ContactMethodItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H<T> implements l41.g {
        public H() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((ContactMethodItem) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H0<T> implements l41.g {
        public H0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H1<T> implements l41.g {
        public H1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$k;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H2<T> implements l41.g {
        public H2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.k) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I<T> implements l41.g {
        public I() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe contactMethod state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I1<T> implements l41.g {
        public I1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class I2<T> implements l41.g {
        public I2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on edit category item click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/PublishContactMethodItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_method/publish/item/PublishContactMethodItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J<T> implements l41.g {
        public J() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((PublishContactMethodItem) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "point", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class J0<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final J0<T> f232699b = new J0<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((PointWithPosition) obj) instanceof CarBodySidePoint;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J1<T> implements l41.g {
        public J1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "buttonTitle", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class J2<T> implements l41.g {
        public J2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.C(new com.avito.android.publish.details.X(str));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K<T> implements l41.g {
        public K() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe contactMethod state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "point", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class K0<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final K0<T, R> f232703b = new K0<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (CarBodySidePoint) ((PointWithPosition) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K1<T> implements l41.g {
        public K1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select text click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/link/item/a;", "alert", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/link/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class K2<T> implements l41.g {
        public K2() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.slots.link.item.a aVar = (com.avito.android.publish.slots.link.item.a) obj;
            D.a aVar2 = E.this.f232652s;
            if (aVar2 != 0) {
                aVar2.h2(aVar.f244482a, aVar.f244483b, aVar.f244484c, aVar.f244485d, aVar.f244486e);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/PublishDeliveryTogglesItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/blueprints/publish/delivery_toggles/PublishDeliveryTogglesItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L<T> implements l41.g {
        public L() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((PublishDeliveryTogglesItem) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "point", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L0<T> implements l41.g {
        public L0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CarBodySidePoint carBodySidePoint = (CarBodySidePoint) obj;
            E e12 = E.this;
            CategoryParameters categoryParametersC0 = e12.f232641h.C0();
            if (categoryParametersC0 != null) {
                List<String> params = carBodySidePoint.getParams();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = params.iterator();
                while (it.hasNext()) {
                    ParameterSlot parameterSlotFindParameter = categoryParametersC0.findParameter((String) it.next());
                    if (parameterSlotFindParameter != null) {
                        arrayList.add(parameterSlotFindParameter);
                    }
                }
                D.a aVar = e12.f232652s;
                if (aVar != null) {
                    aVar.C2(carBodySidePoint.getParamsTitle(), e12.f232643j.Ha(new UV0.c(arrayList), new PublishDetailsFlowTracker.FlowContext[0]), e12.f232638e);
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/G;", "image", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_list_view/G;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L1<T> implements l41.g {
        public L1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.photo_list_view.G g12 = (com.avito.android.photo_list_view.G) obj;
            List<InterfaceC33208b.a> list = g12.f218071d;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = ((InterfaceC33208b.a) it.next()).f218113d;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            InterfaceC33535v interfaceC33535v = E.this.f232635b;
            Long lZ02 = C43066x.z0(g12.f218072e);
            interfaceC33535v.D0(lZ02 != null ? lZ02.longValue() : -1L, arrayList2);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class L2<T> implements l41.g {
        public L2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link alert event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M<T> implements l41.g {
        public M() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe delivery toggles state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M0<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final M0<T> f232711b = new M0<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.a("DEFAULT_TAG", "Failed to observe carBodyConditionSlot pointsClicks", (Throwable) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LIj/b;", "items", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M1<T> implements l41.g {
        public M1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.e(E.this, (List) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class M2<T> implements l41.g {
        public M2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/info_item/ContactMethodInfoBlockItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/contact_method/info_item/ContactMethodInfoBlockItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N<T> implements l41.g {
        public N() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((ContactMethodInfoBlockItem) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k;", "buttonState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/card_select/item/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N0<T> implements l41.g {
        public N0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.slots.card_select.item.k kVar = (com.avito.android.publish.slots.card_select.item.k) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.k4(kVar);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N1<T> implements l41.g {
        public N1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on selector card group click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class N2<T> implements l41.g {
        public N2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class O<T> implements l41.g {
        public O() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe contactMethod state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class O0<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final O0<T> f232719b = new O0<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.a("DEFAULT_TAG", "Failed to observe conditionalActionChange", (Throwable) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.details.ItemPresentersDelegateImpl$process$1$202", f = "ItemPresentersDelegate.kt", i = {}, l = {1532}, m = "invokeSuspend", n = {}, s = {})
    public static final class O1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232720q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.publish_item.c f232721r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E f232722s;

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/k;", "item", "Lkotlin/G0;", "emit", "(Lcom/avito/android/publish/slots/address_from_profile/publish_item/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f232723b;

            public a(E e12) {
                this.f232723b = e12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                com.avito.android.publish.slots.address_from_profile.publish_item.k kVar = (com.avito.android.publish.slots.address_from_profile.publish_item.k) obj;
                C42711b c42711b = new C42711b(kVar.f242923c, kVar.f242922b, kVar.f242924d, kVar.f242925e, kVar.f242926f);
                E e12 = this.f232723b;
                InterfaceC33535v interfaceC33535v = e12.f232635b;
                AddressChoiceType addressChoiceType = AddressChoiceType.f232214f;
                C42712c c42712c = kVar.f242926f;
                interfaceC33535v.n0(addressChoiceType, new AddressParameter.Value(c42712c.getLat(), c42712c.getLng(), c42712c.getText(), null, null, 24, null));
                e12.f232638e.j2(c42711b);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O1(com.avito.android.publish.slots.address_from_profile.publish_item.c cVar, E e12, Continuation continuation) {
            super(2, continuation);
            this.f232721r = cVar;
            this.f232722s = e12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new O1(this.f232721r, this.f232722s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((O1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f232720q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.flow.d2<com.avito.android.publish.slots.address_from_profile.publish_item.k> d2VarV7 = this.f232721r.v7();
                a aVar = new a(this.f232722s);
                this.f232720q = 1;
                if (d2VarV7.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class O2<T> implements l41.g {
        public O2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P<T> implements l41.g {
        public P() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/a;", "cards", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/card_select/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P0<T> implements l41.g {
        public P0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((com.avito.android.publish.slots.card_select.item.a) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/CheckBoxItemWithText;", "checkedItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/CheckBoxItemWithText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P1<T> implements l41.g {
        public P1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((CheckBoxItemWithText) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class P2<T> implements l41.g {
        public P2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.details.ItemPresentersDelegateImpl$process$1$11", f = "ItemPresentersDelegate.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
    public static final class Q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232729q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.blueprints.selector_card_group_bottom_sheet.l f232730r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E f232731s;

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$F;", "item", "Lkotlin/G0;", "emit", "(Lcom/avito/android/category_parameters/ParameterElement$F;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f232732b;

            public a(E e12) {
                this.f232732b = e12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f232732b.f232637d.G((ParameterElement.F) obj);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(com.avito.android.blueprints.selector_card_group_bottom_sheet.l lVar, E e12, Continuation continuation) {
            super(2, continuation);
            this.f232730r = lVar;
            this.f232731s = e12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new Q(this.f232730r, this.f232731s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((Q) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f232729q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C43183m1 c43183m1 = new C43183m1(this.f232730r.getF236837c(), kotlin.jvm.internal.m0.f406844a.b(ParameterElement.F.class));
                a aVar = new a(this.f232731s);
                this.f232729q = 1;
                if (c43183m1.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Q0<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final Q0<T> f232733b = new Q0<>();

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.util.V2.f318762a.a("DEFAULT_TAG", "Failed to observe cardSelectSlot cardClick", (Throwable) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Q1<T> implements l41.g {
        public Q1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Q2<T> implements l41.g {
        public Q2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class R<T> implements l41.g {
        public R() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$w;", ObjectsParameter.TYPE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class R0<T> implements l41.g {
        public R0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.U3((ParameterElement.w) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.details.ItemPresentersDelegateImpl$process$1$205", f = "ItemPresentersDelegate.kt", i = {}, l = {1571}, m = "invokeSuspend", n = {}, s = {})
    public static final class R1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232738q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.items.file_uploader_redesign.e f232739r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E f232740s;

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a$b;", "action", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mandatory_verification/items/uploader/a$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f232741b;

            public a(E e12) {
                this.f232741b = e12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                E.c(this.f232741b, ((a.b) obj).f184689a, false);
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC43160i<Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f232742b;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f232743b;

                /* compiled from: Emitters.kt */
                @kotlin.jvm.internal.s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.publish.details.ItemPresentersDelegateImpl$process$1$205$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ItemPresentersDelegate.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.publish.details.E$R1$b$a$a, reason: collision with other inner class name */
                public static final class C7074a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f232744q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f232745r;

                    public C7074a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f232744q = obj;
                        this.f232745r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f232743b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.publish.details.E.R1.b.a.C7074a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.publish.details.E$R1$b$a$a r0 = (com.avito.android.publish.details.E.R1.b.a.C7074a) r0
                        int r1 = r0.f232745r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f232745r = r1
                        goto L18
                    L13:
                        com.avito.android.publish.details.E$R1$b$a$a r0 = new com.avito.android.publish.details.E$R1$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f232744q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f232745r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        boolean r6 = r5 instanceof com.avito.android.mandatory_verification.items.uploader.a.b
                        if (r6 == 0) goto L43
                        r0.f232745r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f232743b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.E.R1.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(InterfaceC43160i interfaceC43160i) {
                this.f232742b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f232742b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R1(com.avito.android.publish.items.file_uploader_redesign.e eVar, E e12, Continuation continuation) {
            super(2, continuation);
            this.f232739r = eVar;
            this.f232740s = e12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new R1(this.f232739r, this.f232740s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((R1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f232738q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = new b(this.f232739r.getF236837c());
                a aVar = new a(this.f232740s);
                this.f232738q = 1;
                if (bVar.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class R2<T> implements l41.g {
        public R2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S<T> implements l41.g {
        public S() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S0<T> implements l41.g {
        public S0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S1<T> implements l41.g {
        public S1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.v) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class S2<T> implements l41.g {
        public S2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T<T> implements l41.g {
        public T() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T0<T> implements l41.g {
        public T0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on preview price list item click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T1<T> implements l41.g {
        public T1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on multiselect click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class T2<T> implements l41.g {
        public T2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class U<T> implements l41.g {
        public U() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "selectedInfo", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class U0<T> implements l41.g {
        public U0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class U1<T> implements l41.g {
        public U1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.v) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class U2<T> implements l41.g {
        public U2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on read response button text", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V<T> implements l41.g {
        public V() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V0<T> implements l41.g {
        public V0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe radio card select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V1<T> implements l41.g {
        public V1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on multiselect click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/item/b;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/cpa_tariff/item/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class V2<T> implements l41.g {
        public V2() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Map<String, String> map;
            List<kotlin.Q> listO;
            com.avito.android.publish.slots.cpa_tariff.item.b bVar = (com.avito.android.publish.slots.cpa_tariff.item.b) obj;
            E e12 = E.this;
            InterfaceC33535v interfaceC33535v = e12.f232635b;
            CpaButtonAction cpaButtonAction = bVar.f243379f;
            interfaceC33535v.b(cpaButtonAction);
            int i12 = cpaButtonAction == null ? -1 : C33559a.f232780a[cpaButtonAction.ordinal()];
            if (i12 == 1) {
                Integer categoryId = e12.f232642i.U().getCategoryId();
                if (categoryId != null) {
                    int iIntValue = categoryId.intValue();
                    D.a aVar = e12.f232652s;
                    if (aVar != null) {
                        aVar.r4(iIntValue);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == 2) {
                D.a aVar2 = e12.f232652s;
                if (aVar2 != null) {
                    aVar2.K2(new AdvertPublicationLink.Public(null, null, false, null, false, null, null, null, null, null, 1023, null), null);
                    return;
                }
                return;
            }
            if (i12 != 3 || (map = bVar.f243380g) == null || (listO = kotlin.collections.P0.o(map)) == null) {
                return;
            }
            for (kotlin.Q q12 : listO) {
                CategoryParameters categoryParametersC0 = e12.f232641h.C0();
                ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter((String) q12.f406619b) : null;
                if (parameterSlotFindParameter instanceof SelectParameter.Flat) {
                    ((SelectParameter.Flat) parameterSlotFindParameter).setValue(q12.f406620c);
                }
            }
            e12.f232643j.V8((String) ((kotlin.Q) listO.get(0)).f406619b);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W<T> implements l41.g {
        public W() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W0<T> implements l41.g {
        public W0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$v;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W1<T> implements l41.g {
        public W1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.v) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class W2<T> implements l41.g {
        public W2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed cpa notification slot button click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/y;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/delivery_summary/item/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class X<T> implements l41.g {
        public X() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((com.avito.android.publish.slots.delivery_summary.item.y) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class X0<T> implements l41.g {
        public X0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe radio card url click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class X1<T> implements l41.g {
        public X1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on multiselect click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Y<T> implements l41.g {
        public Y() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deliverySummaryAdd item change event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Y0<T> implements l41.g {
        public Y0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Y1<T> implements l41.g {
        public Y1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Y2<T> implements l41.g {
        public Y2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on salaryRangeObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Z<T> implements l41.g {
        public Z() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Z0<T> implements l41.g {
        public Z0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on selector card group click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class Z1<T> implements l41.g {
        public Z1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.E$a, reason: case insensitive filesystem */
    public /* synthetic */ class C33559a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232780a;

        static {
            int[] iArr = new int[CpaButtonAction.values().length];
            try {
                iArr[CpaButtonAction.SHOW_CPA_TARIFF_FORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CpaButtonAction.START_NEW_PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CpaButtonAction.SWITCH_TO_DEVELOPMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f232780a = iArr;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$a0, reason: case insensitive filesystem */
    public static final class C33560a0<T> implements l41.g {
        public C33560a0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/final_state_suggest/item/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/final_state_suggest/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$a1, reason: case insensitive filesystem */
    public static final class C33561a1<T> implements l41.g {
        public C33561a1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((com.avito.android.publish.slots.final_state_suggest.item.a) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$a2, reason: case insensitive filesystem */
    public static final class C33562a2<T> implements l41.g {
        public C33562a2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$a3, reason: case insensitive filesystem */
    public static final class C33563a3<T> implements l41.g {
        public C33563a3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on salaryRangeObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.details.ItemPresentersDelegateImpl$collectDeepLinkClicks$1", f = "ItemPresentersDelegate.kt", i = {}, l = {1784}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.publish.details.E$b, reason: case insensitive filesystem */
    public static final class C33564b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f232785q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<DeepLink> f232786r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ E f232787s;

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "emit", "(Lcom/avito/android/deep_linking/links/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.details.E$b$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f232788b;

            public a(E e12) {
                this.f232788b = e12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f232788b.f232653t.i7((DeepLink) obj);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33564b(InterfaceC43160i<? extends DeepLink> interfaceC43160i, E e12, Continuation<? super C33564b> continuation) {
            super(2, continuation);
            this.f232786r = interfaceC43160i;
            this.f232787s = e12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C33564b(this.f232786r, this.f232787s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((C33564b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f232785q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f232787s);
                this.f232785q = 1;
                if (this.f232786r.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$b0, reason: case insensitive filesystem */
    public static final class C33565b0<T> implements l41.g {
        public C33565b0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$b1, reason: case insensitive filesystem */
    public static final class C33566b1<T> implements l41.g {
        public C33566b1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on update final state suggest", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$b2, reason: case insensitive filesystem */
    public static final class C33567b2<T> implements l41.g {
        public C33567b2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$c, reason: case insensitive filesystem */
    public static final class C33569c<T> implements l41.g {
        public C33569c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232635b.m();
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$c0, reason: case insensitive filesystem */
    public static final class C33570c0<T> implements l41.g {
        public C33570c0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$l;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$c1, reason: case insensitive filesystem */
    public static final class C33571c1<T> implements l41.g {
        public C33571c1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.l lVar = (ParameterElement.l) obj;
            List list = lVar.f117457g;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            E.c(E.this, list, lVar.f117462l);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$c2, reason: case insensitive filesystem */
    public static final class C33572c2<T> implements l41.g {
        public C33572c2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe badges", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$c3, reason: case insensitive filesystem */
    public static final class C33573c3<T> implements l41.g {
        public C33573c3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on ageRangeObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$d, reason: case insensitive filesystem */
    public static final class C33574d<T> implements l41.g {
        public C33574d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeSimpleRightIconClicks", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$d1, reason: case insensitive filesystem */
    public static final class C33576d1<T> implements l41.g {
        public C33576d1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$t;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$t;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$d2, reason: case insensitive filesystem */
    public static final class C33577d2<T> implements l41.g {
        public C33577d2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.t) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJO/a;", "item", "Lkotlin/G0;", "accept", "(LJO/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$d3, reason: case insensitive filesystem */
    public static final class C33578d3<T> implements l41.g {
        public C33578d3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            JO.a aVar = (JO.a) obj;
            E e12 = E.this;
            e12.f232643j.Mb(aVar);
            InterfaceC33678b interfaceC33678b = e12.f232643j;
            interfaceC33678b.l(null);
            if (aVar.f8935d) {
                interfaceC33678b.J5(aVar);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/E$e", "Lcom/avito/android/blueprints/publish/date_interval/f$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements f.a {

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ E f232804l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c.a f232805m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ ParameterElement.C29377e f232806n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e12, c.a aVar, ParameterElement.C29377e c29377e) {
                super(1);
                this.f232804l = e12;
                this.f232805m = aVar;
                this.f232806n = c29377e;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Long l12) {
                long jLongValue = l12.longValue();
                E e12 = this.f232804l;
                com.avito.android.publish.view.i iVar = e12.f232637d;
                ParameterElement.C29376d c29376d = this.f232805m.f106126a;
                Long lValueOf = Long.valueOf(jLongValue);
                ParameterElement.C29377e c29377e = this.f232806n;
                iVar.be(c29376d, c29377e, lValueOf, c29377e.f117413j, false);
                e12.f232643j.l(null);
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ E f232807l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c.a f232808m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ ParameterElement.C29377e f232809n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(E e12, c.a aVar, ParameterElement.C29377e c29377e) {
                super(1);
                this.f232807l = e12;
                this.f232808m = aVar;
                this.f232809n = c29377e;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Long l12) {
                long jLongValue = l12.longValue();
                E e12 = this.f232807l;
                com.avito.android.publish.view.i iVar = e12.f232637d;
                ParameterElement.C29376d c29376d = this.f232808m.f106126a;
                Long lValueOf = Long.valueOf(jLongValue);
                ParameterElement.C29377e c29377e = this.f232809n;
                iVar.be(c29376d, c29377e, lValueOf, c29377e.f117413j, false);
                e12.f232643j.l(null);
                return kotlin.G0.f406611a;
            }
        }

        public e() {
        }

        @Override // com.avito.android.blueprints.publish.date_interval.f.a
        public final void a(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
            E e12 = E.this;
            D.a aVar2 = e12.f232652s;
            if (aVar2 != null) {
                aVar2.F3(aVar, c29377e, new a(e12, aVar, c29377e));
            }
        }

        @Override // com.avito.android.blueprints.publish.date_interval.f.a
        public final void b(@Y61.k c.a aVar) {
            ParameterElement.C29376d c29376d = aVar.f106126a;
            ParameterElement.C29377e c29377e = c29376d.f117402f;
            E e12 = E.this;
            if (c29377e != null) {
                e12.f232637d.be(c29376d, c29377e, null, aVar.f106128c, false);
            }
            e12.f232643j.l(null);
        }

        @Override // com.avito.android.blueprints.publish.date_interval.f.a
        public final void c(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
            E e12 = E.this;
            D.a aVar2 = e12.f232652s;
            if (aVar2 != null) {
                aVar2.Z0(aVar, c29377e, new b(e12, aVar, c29377e));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$e0, reason: case insensitive filesystem */
    public static final class C33579e0<T> implements l41.g {
        public C33579e0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on delivery summary item change event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$e1, reason: case insensitive filesystem */
    public static final class C33580e1<T> implements l41.g {
        public C33580e1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on uploadVideo click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$e2, reason: case insensitive filesystem */
    public static final class C33581e2<T> implements l41.g {
        public C33581e2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select metro click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$e3, reason: case insensitive filesystem */
    public static final class C33582e3<T> implements l41.g {
        public C33582e3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on accordionObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/E$f", "Lcom/avito/android/blueprint/date/interval/f$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.E$f, reason: case insensitive filesystem */
    public static final class C33583f implements f.a {

        /* compiled from: ItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.details.E$f$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ E f232815l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c.a f232816m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ ParameterElement.C29377e f232817n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E e12, c.a aVar, ParameterElement.C29377e c29377e) {
                super(1);
                this.f232815l = e12;
                this.f232816m = aVar;
                this.f232817n = c29377e;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Long l12) {
                long jLongValue = l12.longValue();
                E e12 = this.f232815l;
                com.avito.android.publish.view.i iVar = e12.f232637d;
                ParameterElement.C29376d c29376d = this.f232816m.f106126a;
                Long lValueOf = Long.valueOf(jLongValue);
                ParameterElement.C29377e c29377e = this.f232817n;
                iVar.be(c29376d, c29377e, lValueOf, c29377e.f117413j, false);
                e12.f232643j.l(null);
                return kotlin.G0.f406611a;
            }
        }

        public C33583f() {
        }

        @Override // com.avito.android.blueprint.date.interval.f.a
        public final void a(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
            E e12 = E.this;
            D.a aVar2 = e12.f232652s;
            if (aVar2 != null) {
                aVar2.F3(aVar, c29377e, new a(e12, aVar, c29377e));
            }
        }

        @Override // com.avito.android.blueprint.date.interval.f.a
        public final void b(@Y61.k c.a aVar) {
            ParameterElement.C29376d c29376d = aVar.f106126a;
            ParameterElement.C29377e c29377e = c29376d.f117402f;
            E e12 = E.this;
            if (c29377e != null) {
                e12.f232637d.be(c29376d, c29377e, null, aVar.f106128c, false);
            }
            e12.f232643j.l(null);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$f0, reason: case insensitive filesystem */
    public static final class C33584f0<T> implements l41.g {
        public C33584f0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$l;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$f1, reason: case insensitive filesystem */
    public static final class C33585f1<T> implements l41.g {
        public C33585f1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.l lVar = (ParameterElement.l) obj;
            List list = lVar.f117457g;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            E.c(E.this, list, lVar.f117462l);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$g;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$f2, reason: case insensitive filesystem */
    public static final class C33586f2<T> implements l41.g {
        public C33586f2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C29379g) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/j$a;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/image/enhancement/j$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f3<T> implements l41.g {
        public f3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            D.a aVar;
            C30979j.a aVar2 = (C30979j.a) obj;
            boolean z12 = aVar2 instanceof C30979j.a.C5009a;
            E e12 = E.this;
            if (z12) {
                D.a aVar3 = e12.f232652s;
                if (aVar3 != null) {
                    aVar3.Y3();
                    return;
                }
                return;
            }
            if (!(aVar2 instanceof C30979j.a.b)) {
                if (!aVar2.equals(C30979j.a.c.f169397a) || (aVar = e12.f232652s) == null) {
                    return;
                }
                aVar.q1();
                return;
            }
            D.a aVar4 = e12.f232652s;
            if (aVar4 != null) {
                C30979j.a.b bVar = (C30979j.a.b) aVar2;
                aVar4.c(new com.avito.android.publish.details.Y(aVar2), bVar.f169394a, bVar.f169395b);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$g, reason: case insensitive filesystem */
    public static final class C33587g<T> implements l41.g {
        public C33587g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            boolean z12 = deepLink instanceof JobMultiGeoLink.AddAddress;
            E e12 = E.this;
            if (z12) {
                e12.f232635b.B0();
            }
            e12.f232653t.i7(deepLink);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$g0, reason: case insensitive filesystem */
    public static final class C33588g0<T> implements l41.g {
        public C33588g0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$g1, reason: case insensitive filesystem */
    public static final class C33589g1<T> implements l41.g {
        public C33589g1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on upload cpa ddu file click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$g2, reason: case insensitive filesystem */
    public static final class C33590g2<T> implements l41.g {
        public C33590g2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select metro click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$e;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g3<T> implements l41.g {
        public g3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.C29377e c29377e = (ParameterElement.C29377e) obj;
            E e12 = E.this;
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.T0(c29377e, new com.avito.android.publish.details.T(e12, c29377e));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$h, reason: case insensitive filesystem */
    public static final class C33591h<T> implements l41.g {
        public C33591h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeDeepLinkClicks", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$h0, reason: case insensitive filesystem */
    public static final class C33592h0<T> implements l41.g {
        public C33592h0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$h1, reason: case insensitive filesystem */
    public static final class C33593h1<T> implements l41.g {
        public C33593h1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.T4();
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$B;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$B;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$h2, reason: case insensitive filesystem */
    public static final class C33594h2<T> implements l41.g {
        public C33594h2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.B) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h3<T> implements l41.g {
        public h3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$i, reason: case insensitive filesystem */
    public static final class C33595i<T> implements l41.g {
        public C33595i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            E e12 = E.this;
            e12.f232635b.l0();
            D.a aVar = e12.f232652s;
            if (aVar == null) {
                throw new IllegalArgumentException("Failed to route because router is null");
            }
            aVar.u2(str);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$i0, reason: case insensitive filesystem */
    public static final class C33596i0<T> implements l41.g {
        public C33596i0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$i1, reason: case insensitive filesystem */
    public static final class C33597i1<T> implements l41.g {
        public C33597i1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on empty verification appeared event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$i2, reason: case insensitive filesystem */
    public static final class C33598i2<T> implements l41.g {
        public C33598i2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select region route click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$e;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i3<T> implements l41.g {
        public i3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.C29377e c29377e = (ParameterElement.C29377e) obj;
            E e12 = E.this;
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.T0(c29377e, new com.avito.android.publish.details.T(e12, c29377e));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$j, reason: case insensitive filesystem */
    public static final class C33599j<T> implements l41.g {
        public C33599j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on clickAttributedTextUrl", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$j0, reason: case insensitive filesystem */
    public static final class C33600j0<T> implements l41.g {
        public C33600j0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/d;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/item_info/item/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$j1, reason: case insensitive filesystem */
    public static final class C33601j1<T> implements l41.g {
        public C33601j1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((com.avito.android.publish.slots.item_info.item.d) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$j2, reason: case insensitive filesystem */
    public static final class C33602j2<T> implements l41.g {
        public C33602j2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j3<T> implements l41.g {
        public j3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$g;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$k, reason: case insensitive filesystem */
    public static final class C33603k<T> implements l41.g {
        public C33603k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.C29379g c29379g = (ParameterElement.C29379g) obj;
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(c29379g.f117181b) : null;
            if (parameterSlotFindParameter instanceof DistrictParameter) {
                DistrictParameter districtParameter = (DistrictParameter) parameterSlotFindParameter;
                boolean zF2 = kotlin.jvm.internal.L.f(districtParameter.getUpdatesForm(), Boolean.TRUE);
                InterfaceC33678b interfaceC33678b = e12.f232643j;
                if (!zF2) {
                    districtParameter.setValue(null);
                    interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
                } else {
                    districtParameter.setOldValue(districtParameter.getValue());
                    districtParameter.setValue(null);
                    interfaceC33678b.l(districtParameter.getId());
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$k0, reason: case insensitive filesystem */
    public static final class C33604k0<T> implements l41.g {
        public C33604k0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$k1, reason: case insensitive filesystem */
    public static final class C33605k1<T> implements l41.g {
        public C33605k1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on itemInfo change", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$k2, reason: case insensitive filesystem */
    public static final class C33606k2<T> implements l41.g {
        public C33606k2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on inlined multiselect click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$e;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k3<T> implements l41.g {
        public k3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232637d.U7((ParameterElement.C29377e) obj, null);
            e12.f232643j.l(null);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$l, reason: case insensitive filesystem */
    public static final class C33607l<T> implements l41.g {
        public C33607l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeDistrictClearEvent", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$l0, reason: case insensitive filesystem */
    public static final class C33608l0<T> implements l41.g {
        public C33608l0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;", "confetti", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$l1, reason: case insensitive filesystem */
    public static final class C33609l1<T> implements l41.g {
        public C33609l1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Confetti confetti = (Confetti) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.r2(confetti);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$l2, reason: case insensitive filesystem */
    public static final class C33610l2<T> implements l41.g {
        public C33610l2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l3<T> implements l41.g {
        public l3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on clearDateObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/ItemWithAdditionalButton;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/ItemWithAdditionalButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$m, reason: case insensitive filesystem */
    public static final class C33611m<T> implements l41.g {
        public C33611m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ItemWithAdditionalButton itemWithAdditionalButton = (ItemWithAdditionalButton) obj;
            ItemWithAdditionalButton.AdditionalButton f117488m = itemWithAdditionalButton.getF117488m();
            boolean z12 = itemWithAdditionalButton instanceof ParameterElement.I;
            E e12 = E.this;
            if (z12) {
                e12.f232635b.D();
            }
            if (f117488m != null) {
                e12.f232635b.j(f117488m.f173892d);
            }
            e12.f232637d.Q9(itemWithAdditionalButton);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$m0, reason: case insensitive filesystem */
    public static final class C33612m0<T> implements l41.g {
        public C33612m0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$m1, reason: case insensitive filesystem */
    public static final class C33613m1<T> implements l41.g {
        public C33613m1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on itemInfo confetti animation start", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$m2, reason: case insensitive filesystem */
    public static final class C33614m2<T> implements l41.g {
        public C33614m2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on inlined multiselect click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m3<T> implements l41.g {
        public m3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MicPermissionBlockItem.Action action = (MicPermissionBlockItem.Action) obj;
            E.b(E.this, action.getF237032c(), action.getF237033b());
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$n, reason: case insensitive filesystem */
    public static final class C33615n<T> implements l41.g {
        public C33615n() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeInputAdditionalButtonClickStream", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$n0, reason: case insensitive filesystem */
    public static final class C33616n0<T> implements l41.g {
        public C33616n0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/item/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/sleeping_places/item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$n1, reason: case insensitive filesystem */
    public static final class C33617n1<T> implements l41.g {
        public C33617n1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232643j.Mb((com.avito.android.publish.slots.sleeping_places.item.a) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isEnhanced", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$n2, reason: case insensitive filesystem */
    public static final class C33618n2<T> implements l41.g {
        public C33618n2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232635b.x0(((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n3<T> implements l41.g {
        public n3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on click mic permission action", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$o, reason: case insensitive filesystem */
    public static final class C33619o<T> implements l41.g {
        public C33619o() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.a aVar = (com.avito.android.items.a) ((kotlin.Q) obj).f406620c;
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(aVar.getF75720c()) : null;
            if (parameterSlotFindParameter instanceof CharParameter) {
                CharParameter charParameter = (CharParameter) parameterSlotFindParameter;
                DisplayingOptions displayingOptions = charParameter.getDisplayingOptions();
                if (displayingOptions != null ? kotlin.jvm.internal.L.f(displayingOptions.getShouldShowAlertBannerOnFocus(), Boolean.TRUE) : false) {
                    if (e12.f232646m.a(charParameter.getId())) {
                        e12.f232643j.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
                    }
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$o0, reason: case insensitive filesystem */
    public static final class C33620o0<T> implements l41.g {
        public C33620o0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.d(E.this, (String) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$o1, reason: case insensitive filesystem */
    public static final class C33621o1<T> implements l41.g {
        public C33621o1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$o2, reason: case insensitive filesystem */
    public static final class C33622o2<T> implements l41.g {
        public C33622o2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/mic_permission_block/MicPermissionBlockItem$Action;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o3<T> implements l41.g {
        public o3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MicPermissionBlockItem.Action action = (MicPermissionBlockItem.Action) obj;
            E.b(E.this, action.getF237032c(), action.getF237033b());
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$p, reason: case insensitive filesystem */
    public static final class C33623p<T> implements l41.g {
        public C33623p() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeInputFocusChanges", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$p0, reason: case insensitive filesystem */
    public static final class C33624p0<T> implements l41.g {
        public C33624p0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on link click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$p1, reason: case insensitive filesystem */
    public static final class C33625p1<T> implements l41.g {
        public C33625p1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on sleepingPlaces change", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$p2, reason: case insensitive filesystem */
    public static final class C33626p2<T> implements l41.g {
        public C33626p2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p3<T> implements l41.g {
        public p3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on click mic permission action", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprint/suggest/D;", "request", "Lkotlin/G0;", "accept", "(Lcom/avito/android/blueprint/suggest/D;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$q, reason: case insensitive filesystem */
    public static final class C33627q<T> implements l41.g {
        public C33627q() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.blueprint.suggest.D d12 = (com.avito.android.blueprint.suggest.D) obj;
            E e12 = E.this;
            e12.f232640g.t8(e12.f232642i.U().getCategoryId(), d12.f105692a, d12.f105693b);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$q0, reason: case insensitive filesystem */
    public static final class C33628q0<T> implements l41.g {
        public C33628q0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AddressParameter addressParameter;
            AddressParameter.Value value = (AddressParameter.Value) obj;
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            if (parametersTreeWa == null || (addressParameter = (AddressParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class)) == null) {
                return;
            }
            addressParameter.setValue(value);
            e12.f232635b.n0(AddressChoiceType.f232212d, value);
            e12.f232643j.l(null);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvf0/f;", "data", "Lkotlin/G0;", "accept", "(Lvf0/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$q1, reason: case insensitive filesystem */
    public static final class C33629q1<T> implements l41.g {
        public C33629q1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C49325f c49325f = (C49325f) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.m4(c49325f);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$q2, reason: case insensitive filesystem */
    public static final class C33630q2<T> implements l41.g {
        public C33630q2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q3<T> implements l41.g {
        public q3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe image-enhance state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/E;", "request", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/tagged_input/E;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$r, reason: case insensitive filesystem */
    public static final class C33631r<T> implements l41.g {
        public C33631r() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.items.tagged_input.E e12 = (com.avito.android.publish.items.tagged_input.E) obj;
            E e13 = E.this;
            e13.f232640g.t8(e13.f232642i.U().getCategoryId(), e12.f237129a, e12.f237130b);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$r0, reason: case insensitive filesystem */
    public static final class C33632r0<T> implements l41.g {
        public C33632r0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on select click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$r1, reason: case insensitive filesystem */
    public static final class C33633r1<T> implements l41.g {
        public C33633r1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on open sleepingPlacesBedTypesDialog", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$r2, reason: case insensitive filesystem */
    public static final class C33634r2<T> implements l41.g {
        public C33634r2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b;", "itemAction", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/iac_for_pro/IacForProItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r3<T> implements l41.g {
        public r3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            IacForProItem.b bVar = (IacForProItem.b) obj;
            if (bVar instanceof IacForProItem.b.a) {
                E e12 = E.this;
                InterfaceC33678b interfaceC33678b = e12.f232643j;
                IacForProItem iacForProItem = ((IacForProItem.b.a) bVar).f236911a;
                interfaceC33678b.Mb(iacForProItem);
                if (iacForProItem.f236904c) {
                    e12.f232643j.e7();
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$s0, reason: case insensitive filesystem */
    public static final class C33636s0<T> implements l41.g {
        public C33636s0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.J j12 = (ParameterElement.J) obj;
            E e12 = E.this;
            e12.f232635b.h(String.valueOf(e12.f232642i.U().getCategoryId()), e12.f232649p.Be());
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.v2(j12);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "pair", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$s1, reason: case insensitive filesystem */
    public static final class C33637s1<T> implements l41.g {
        public C33637s1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
            E e12 = E.this;
            if (!zBooleanValue) {
                e12.f232638e.D4();
                return;
            }
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.w3((AddressParameter.SellerAddresses.DeleteAddressSheet) q12.f406620c);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$s2, reason: case insensitive filesystem */
    public static final class C33638s2<T> implements l41.g {
        public C33638s2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s3<T> implements l41.g {
        public s3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe iacForPro state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$t, reason: case insensitive filesystem */
    public static final class C33639t<T> implements l41.g {
        public C33639t() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeInputValueChanges", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$t0, reason: case insensitive filesystem */
    public static final class C33640t0<T> implements l41.g {
        public C33640t0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232635b.h(String.valueOf(e12.f232642i.U().getCategoryId()), e12.f232649p.Be());
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.t1();
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/item/c;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/delivery_addresses/item/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$t1, reason: case insensitive filesystem */
    public static final class C33641t1<T> implements l41.g {
        public C33641t1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.slots.delivery_addresses.item.c cVar = (com.avito.android.publish.slots.delivery_addresses.item.c) obj;
            Integer num = cVar.f243441c;
            AddressInfo addressInfo = null;
            List<AddressInfo> list = cVar.f243442d;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int addressId = ((AddressInfo) next).getAddressId();
                    if (num != null && addressId == num.intValue()) {
                        addressInfo = next;
                        break;
                    }
                }
                addressInfo = addressInfo;
            }
            E e12 = E.this;
            if (num != null && addressInfo != null) {
                e12.f232635b.A0(new C13290x.a(String.valueOf(num), String.valueOf(addressInfo)));
            }
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.r(e12.f232650q, cVar);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$t2, reason: case insensitive filesystem */
    public static final class C33642t2<T> implements l41.g {
        public C33642t2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe checkbox select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t3<T> implements l41.g {
        public t3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/llm/ui/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/llm/ui/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$u, reason: case insensitive filesystem */
    public static final class C33643u extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.llm.ui.a, kotlin.G0> {
        public C33643u() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.llm.ui.a r8) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.E.C33643u.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$u0, reason: case insensitive filesystem */
    public static final class C33644u0<T> implements l41.g {
        public C33644u0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232635b.a(e12.f232642i.U().getCategoryId(), e12.f232647n.a(), ((ParameterElement.J) obj).f117341h);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$u1, reason: case insensitive filesystem */
    public static final class C33645u1<T> implements l41.g {
        public C33645u1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on open deliveryAddressesListDialog", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$u2, reason: case insensitive filesystem */
    public static final class C33646u2<T> implements l41.g {
        public C33646u2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u3<T> implements l41.g {
        public u3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$t;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$t;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$v, reason: case insensitive filesystem */
    public static final class C33647v<T> implements l41.g {
        public C33647v() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            ParameterElement.t tVar = (ParameterElement.t) obj;
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(tVar.f117181b) : null;
            if (parameterSlotFindParameter instanceof MetroParameter) {
                MetroParameter metroParameter = (MetroParameter) parameterSlotFindParameter;
                boolean zF2 = kotlin.jvm.internal.L.f(metroParameter.getUpdatesForm(), Boolean.TRUE);
                InterfaceC33678b interfaceC33678b = e12.f232643j;
                if (!zF2) {
                    metroParameter.setValue(null);
                    interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
                } else {
                    metroParameter.setOldValue(metroParameter.getValue());
                    metroParameter.setValue(null);
                    interfaceC33678b.l(metroParameter.getId());
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$v0, reason: case insensitive filesystem */
    public static final class C33648v0<T> implements l41.g {
        public C33648v0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on uploadVideo click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_addresses/item/c;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/slots/delivery_addresses/item/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$v1, reason: case insensitive filesystem */
    public static final class C33649v1<T> implements l41.g {
        public C33649v1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.publish.slots.delivery_addresses.item.c cVar = (com.avito.android.publish.slots.delivery_addresses.item.c) obj;
            Integer num = cVar.f243441c;
            AddressInfo addressInfo = null;
            List<AddressInfo> list = cVar.f243442d;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int addressId = ((AddressInfo) next).getAddressId();
                    if (num != null && addressId == num.intValue()) {
                        addressInfo = next;
                        break;
                    }
                }
                addressInfo = addressInfo;
            }
            E e12 = E.this;
            if (num != null && addressInfo != null) {
                e12.f232635b.N(new E.a(String.valueOf(num), String.valueOf(addressInfo)));
            }
            e12.f232650q.b();
            e12.f232643j.Mb(cVar);
            Integer num2 = cVar.f243447i;
            if (num2 != null) {
                e12.f232638e.u4(num2.intValue(), num);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$v2, reason: case insensitive filesystem */
    public static final class C33650v2<T> implements l41.g {
        public C33650v2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips multiselect", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b;", "itemAction", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v3<T> implements l41.g {
        public v3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            D.a aVar;
            IacForProEnabledItem.b bVar = (IacForProEnabledItem.b) obj;
            boolean z12 = bVar instanceof IacForProEnabledItem.b.a;
            E e12 = E.this;
            if (z12) {
                e12.f232643j.Mb(((IacForProEnabledItem.b.a) bVar).f236939a);
            } else {
                if (!(bVar instanceof IacForProEnabledItem.b.C7139b) || (aVar = e12.f232652s) == null) {
                    return;
                }
                aVar.G2(new com.avito.android.publish.details.Z(e12, bVar));
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$w, reason: case insensitive filesystem */
    public static final class C33651w<T> implements l41.g {
        public C33651w() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observeMetroClearEvent", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$w0, reason: case insensitive filesystem */
    public static final class C33652w0<T> implements l41.g {
        public C33652w0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe checkbox select", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$w1, reason: case insensitive filesystem */
    public static final class C33653w1<T> implements l41.g {
        public C33653w1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to save delivery address", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$w2, reason: case insensitive filesystem */
    public static final class C33654w2<T> implements l41.g {
        public C33654w2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w3<T> implements l41.g {
        public w3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe iacForProEnabled state", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/events/j$a;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics/events/j$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$x, reason: case insensitive filesystem */
    public static final class C33655x<T> implements l41.g {
        public C33655x() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232635b.x((j.a) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$x0, reason: case insensitive filesystem */
    public static final class C33656x0<T> implements l41.g {
        public C33656x0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232635b.B(String.valueOf(e12.f232642i.U().getCategoryId()));
            e12.f232645l.Ka((ParameterElement.J) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$A;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$x1, reason: case insensitive filesystem */
    public static final class C33657x1<T> implements l41.g {
        public C33657x1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232638e.L(((ParameterElement.A) obj).f117184e);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$x2, reason: case insensitive filesystem */
    public static final class C33658x2<T> implements l41.g {
        public C33658x2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed to observe chips multiselect", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x3<T> implements l41.g {
        public x3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink = (DeepLink) obj;
            D.a aVar = E.this.f232652s;
            if (aVar != null) {
                aVar.K2(deepLink, null);
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$y, reason: case insensitive filesystem */
    public static final class C33659y<T> implements l41.g {
        public C33659y() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on slotShownObservable", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$y0, reason: case insensitive filesystem */
    public static final class C33660y0<T> implements l41.g {
        public C33660y0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on removeVideo click", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$y1, reason: case insensitive filesystem */
    public static final class C33661y1<T> implements l41.g {
        public C33661y1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on publish method updated", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$y2, reason: case insensitive filesystem */
    public static final class C33662y2<T> implements l41.g {
        public C33662y2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on observe change toggle", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "e", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y3<T> implements l41.g {
        public y3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC33535v.a.b(E.this.f232635b, "Failed on deepLink click event", (Throwable) obj, 4);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "LJO/m;", "pair", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$z, reason: case insensitive filesystem */
    public static final class C33663z<T> implements l41.g {
        public C33663z() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            kotlin.Q q12 = (kotlin.Q) obj;
            ParameterElement.v vVar = (ParameterElement.v) q12.f406619b;
            JO.m mVar = (JO.m) q12.f406620c;
            ArrayList arrayList = new ArrayList(vVar.f117545f);
            final com.avito.android.publish.details.S s5 = new com.avito.android.publish.details.S(mVar);
            arrayList.removeIf(new Predicate() { // from class: com.avito.android.publish.details.Q
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((Boolean) s5.invoke(obj2)).booleanValue();
                }
            });
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((JO.m) it.next()).f8961b);
            }
            E e12 = E.this;
            ParametersTree parametersTreeWa = e12.f232641h.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa != null ? parametersTreeWa.findParameter(vVar.f117181b) : null;
            if (parameterSlotFindParameter instanceof MultiselectParameter) {
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
                boolean zF2 = kotlin.jvm.internal.L.f(multiselectParameter.getUpdatesForm(), Boolean.TRUE);
                InterfaceC33678b interfaceC33678b = e12.f232643j;
                if (!zF2) {
                    multiselectParameter.setValue(arrayList2);
                    interfaceC33678b.B9(PublishDetailsFlowTracker.FlowContext.f233438d);
                } else {
                    multiselectParameter.setOldValue(multiselectParameter.getValue());
                    multiselectParameter.setValue(arrayList2);
                    interfaceC33678b.l(multiselectParameter.getId());
                }
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$z0, reason: case insensitive filesystem */
    public static final class C33664z0<T> implements l41.g {
        public C33664z0() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E e12 = E.this;
            e12.f232635b.X(e12.f232642i.U().getCategoryId(), e12.f232647n.a(), ((ParameterElement.J) obj).f117341h);
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.m1();
            }
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$C;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/ParameterElement$C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$z1, reason: case insensitive filesystem */
    public static final class C33665z1<T> implements l41.g {
        public C33665z1() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.this.f232637d.G((ParameterElement.C) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.E$z2, reason: case insensitive filesystem */
    public static final class C33666z2<T> implements l41.g {
        public C33666z2() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.f(E.this, (Ij.b) obj);
        }
    }

    /* compiled from: ItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;", "itemAction", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/items/iac_devices/IacDevicesItem$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z3<T> implements l41.g {
        public z3() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            D.a aVar;
            IacDevicesItem.b bVar = (IacDevicesItem.b) obj;
            E e12 = E.this;
            e12.getClass();
            if (!(bVar instanceof IacDevicesItem.b.a) || (aVar = e12.f232652s) == null) {
                return;
            }
            IacDevicesItem iacDevicesItem = ((IacDevicesItem.b.a) bVar).f236859a;
            aVar.t(C42745f0.M0(iacDevicesItem.f236854d), iacDevicesItem.f236855e, new com.avito.android.publish.details.G(bVar, e12));
        }
    }

    @Inject
    public E(@Y61.k com.avito.android.util.R0 r02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C33771m1 c33771m1, @Y61.k com.avito.android.publish.view.i iVar, @Y61.k com.avito.android.details.b bVar, @Y61.k com.avito.android.publish.details.iac.e eVar, @Y61.k com.avito.android.publish.details.tags.g gVar, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k C50213a c50213a, @Y61.k InterfaceC34146a interfaceC34146a, @Y61.k com.avito.android.publish.items.alert_banner.n nVar, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.publish.details.auto_description.a aVar2, @Y61.k com.avito.android.publish.C0 c02, @Y61.k com.avito.android.publish.slots.delivery_addresses.c cVar) {
        this.f232634a = interfaceC35745a5;
        this.f232635b = interfaceC33535v;
        this.f232636c = c33771m1;
        this.f232637d = iVar;
        this.f232638e = bVar;
        this.f232639f = eVar;
        this.f232640g = gVar;
        this.f232641h = aVar;
        this.f232642i = interfaceC34155z;
        this.f232643j = interfaceC33678b;
        this.f232644k = c50213a;
        this.f232645l = interfaceC34146a;
        this.f232646m = nVar;
        this.f232647n = e12;
        this.f232648o = aVar2;
        this.f232649p = c02;
        this.f232650q = cVar;
        this.f232654u = kotlinx.coroutines.U.a(r02.b());
    }

    public static final void b(E e12, boolean z12, boolean z13) {
        e12.f232635b.W(z12, z13);
        IacPermissionRequestSource iacPermissionRequestSource = z13 ? IacPermissionRequestSource.f234702c : IacPermissionRequestSource.f234703d;
        if (z12) {
            e12.f232639f.a(new com.avito.android.publish.details.H(e12));
        } else {
            e12.f232639f.b(iacPermissionRequestSource, new com.avito.android.publish.details.I(e12), new com.avito.android.publish.details.J(e12), new com.avito.android.publish.details.K(e12), com.avito.android.publish.details.L.f233070l, com.avito.android.publish.details.M.f233073l, new com.avito.android.publish.details.N(e12), new com.avito.android.publish.details.O(e12), new com.avito.android.publish.details.P(e12));
        }
    }

    public static final void c(E e12, List list, boolean z12) {
        D.a aVar = e12.f232652s;
        if (aVar != null) {
            aVar.Q3((String[]) list.toArray(new String[0]), z12);
        }
    }

    public static final void d(E e12, String str) {
        e12.getClass();
        if (kotlin.jvm.internal.L.f(Uri.parse(str).getHost(), e12.f232636c.f234844k)) {
            D.a aVar = e12.f232652s;
            if (aVar != null) {
                aVar.W4(str);
                return;
            }
            return;
        }
        D.a aVar2 = e12.f232652s;
        if (aVar2 != null) {
            aVar2.u2(str);
        }
    }

    public static final void e(E e12, List list) {
        ParametersTree parametersTreeWa = e12.f232641h.wa();
        if (parametersTreeWa != null) {
            Ij.b bVar = (Ij.b) C42745f0.G(list);
            String str = bVar != null ? bVar.f8494a : null;
            if (str == null) {
                str = "";
            }
            ParameterSlot parameterSlotFindParameter = parametersTreeWa.findParameter(str);
            if (parameterSlotFindParameter != null) {
                e12.f232638e.v3(parameterSlotFindParameter, list);
            }
        }
    }

    public static final void f(E e12, Ij.b bVar) {
        ParameterSlot parameterSlotFindParameter;
        ParametersTree parametersTreeWa = e12.f232641h.wa();
        if (parametersTreeWa == null || (parameterSlotFindParameter = parametersTreeWa.findParameter(bVar.f8494a)) == null) {
            return;
        }
        e12.f232638e.m3(bVar, parameterSlotFindParameter, true);
    }

    @Override // com.avito.android.publish.details.D
    public final void A(@Y61.k D.a aVar) {
        this.f232652s = aVar;
        this.f232637d.A(aVar);
    }

    @Override // com.avito.android.publish.details.D
    @SuppressLint({"HardcodeStringDetector"})
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        this.f232637d.F(this.f232641h);
        io.reactivex.rxjava3.disposables.c cVar = this.f232651r;
        cVar.e();
        kotlinx.coroutines.N0 n02 = this.f232655v;
        if (n02 != null) {
            n02.c(null);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.photo_list_view.blueprints.c;
            InterfaceC35745a5 interfaceC35745a5 = this.f232634a;
            if (z12) {
                com.avito.android.photo_list_view.blueprints.c cVar2 = (com.avito.android.photo_list_view.blueprints.c) dVar;
                C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar2.n7().j0(interfaceC35745a5.e()).u0(new L1(), new C33572c2()));
                C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar2.getF218144h().j0(interfaceC35745a5.e()).u0(new C33618n2(), new C33662y2()));
                C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar2.X6().j0(interfaceC35745a5.e()).u0(new J2(), new U2()));
                C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar2.B0().j0(interfaceC35745a5.e()).u0(new f3(), new q3()));
            } else if (dVar instanceof com.avito.android.blueprints.select.c) {
                com.avito.android.blueprints.select.c cVar3 = (com.avito.android.blueprints.select.c) dVar;
                C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar3.c().j0(interfaceC35745a5.e()).u0(new B3(), new P()));
                k(cVar3.getF106603h());
            } else {
                boolean z13 = dVar instanceof com.avito.android.blueprints.selector_card_group_bottom_sheet.l;
                C43238h c43238h = this.f232654u;
                if (z13) {
                    C43259k.d(c43238h, null, null, new Q((com.avito.android.blueprints.selector_card_group_bottom_sheet.l) dVar, this, null), 3);
                } else if (dVar instanceof com.avito.android.blueprint.checkbox.c) {
                    com.avito.android.blueprint.checkbox.c cVar4 = (com.avito.android.blueprint.checkbox.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar4.g().j0(interfaceC35745a5.e()).u0(new C33608l0(), new C33652w0()));
                    k(cVar4.getF105395e());
                } else if (dVar instanceof com.avito.android.blueprint.select.c) {
                    com.avito.android.blueprint.select.c cVar5 = (com.avito.android.blueprint.select.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar5.c().j0(interfaceC35745a5.e()).u0(new H0(), new S0()));
                    k(cVar5.getF105669e());
                } else if (dVar instanceof com.avito.android.blueprint.address.c) {
                    com.avito.android.blueprint.address.c cVar6 = (com.avito.android.blueprint.address.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar6.c().j0(interfaceC35745a5.e()).u0(new C33576d1(), new C33621o1()));
                    k(cVar6.getF105371e());
                } else if (dVar instanceof com.avito.android.blueprints.auto_early_access.c) {
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.auto_early_access.c) dVar).c().j0(interfaceC35745a5.e()).u0(new C33665z1(), new K1()));
                } else if (dVar instanceof com.avito.android.blueprint.multiselect.c) {
                    com.avito.android.blueprint.multiselect.c cVar7 = (com.avito.android.blueprint.multiselect.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar7.c().j0(interfaceC35745a5.e()).u0(new S1(), new T1()));
                    w(cVar7.z());
                    k(cVar7.getF105598g());
                } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.c) {
                    com.avito.android.blueprints.publish.multiselect.c cVar8 = (com.avito.android.blueprints.publish.multiselect.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar8.c().j0(interfaceC35745a5.e()).u0(new U1(), new V1()));
                    w(cVar8.z());
                    k(cVar8.getF106360j());
                } else if (dVar instanceof com.avito.android.compose_items.multiselect.c) {
                    com.avito.android.compose_items.multiselect.c cVar9 = (com.avito.android.compose_items.multiselect.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar9.c().j0(interfaceC35745a5.e()).u0(new W1(), new X1()));
                    w(cVar9.z());
                    v(cVar9.getF125422l());
                    k(cVar9.f125439c);
                } else if (dVar instanceof com.avito.android.compose_items.chips_multiselect.c) {
                    com.avito.android.compose_items.chips_multiselect.c cVar10 = (com.avito.android.compose_items.chips_multiselect.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar10.h().j0(interfaceC35745a5.e()).u0(new Y1(), new Z1()));
                    k(cVar10.f125439c);
                } else if (dVar instanceof com.avito.android.compose_items.chips_select.c) {
                    com.avito.android.compose_items.chips_select.c cVar11 = (com.avito.android.compose_items.chips_select.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar11.h().j0(interfaceC35745a5.e()).u0(new C33562a2(), new C33567b2()));
                    k(cVar11.getF125443c());
                } else if (dVar instanceof com.avito.android.blueprints.metro.c) {
                    com.avito.android.blueprints.metro.c cVar12 = (com.avito.android.blueprints.metro.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar12.c().j0(interfaceC35745a5.e()).u0(new C33577d2(), new C33581e2()));
                    t(cVar12.z());
                } else if (dVar instanceof com.avito.android.blueprints.district.c) {
                    com.avito.android.blueprints.district.c cVar13 = (com.avito.android.blueprints.district.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar13.c().j0(interfaceC35745a5.e()).u0(new C33586f2(), new C33590g2()));
                    m(cVar13.z());
                } else if (dVar instanceof com.avito.android.blueprints.publish.region_route.c) {
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.publish.region_route.c) dVar).c().j0(interfaceC35745a5.e()).u0(new C33594h2(), new C33598i2()));
                } else if (dVar instanceof com.avito.android.blueprint.multiselect.inline.c) {
                    com.avito.android.blueprint.multiselect.inline.c cVar14 = (com.avito.android.blueprint.multiselect.inline.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar14.g().j0(interfaceC35745a5.e()).u0(new C33602j2(), new C33606k2()));
                    k(cVar14.E());
                } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.inline.c) {
                    com.avito.android.blueprints.publish.multiselect.inline.c cVar15 = (com.avito.android.blueprints.publish.multiselect.inline.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar15.g().j0(interfaceC35745a5.e()).u0(new C33610l2(), new C33614m2()));
                    k(cVar15.E());
                } else if (dVar instanceof com.avito.android.blueprints.chips.d) {
                    com.avito.android.blueprints.chips.d dVar2 = (com.avito.android.blueprints.chips.d) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar2.h().j0(interfaceC35745a5.e()).u0(new C33622o2(), new C33626p2()));
                    k(dVar2.getF105854h());
                } else if (dVar instanceof com.avito.android.blueprint.chips.single.d) {
                    com.avito.android.blueprint.chips.single.d dVar3 = (com.avito.android.blueprint.chips.single.d) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar3.h().j0(interfaceC35745a5.e()).u0(new C33630q2(), new C33634r2()));
                    k(dVar3.getF105439e());
                } else if (dVar instanceof com.avito.android.blueprints.publish.select.inline.c) {
                    com.avito.android.blueprints.publish.select.inline.c cVar16 = (com.avito.android.blueprints.publish.select.inline.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar16.g().j0(interfaceC35745a5.e()).u0(new C33638s2(), new C33642t2()));
                    k(cVar16.getF106480h());
                } else if (dVar instanceof com.avito.android.blueprints.chips_multiselect.c) {
                    com.avito.android.blueprints.chips_multiselect.c cVar17 = (com.avito.android.blueprints.chips_multiselect.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar17.h().j0(interfaceC35745a5.e()).u0(new C33646u2(), new C33650v2()));
                    k(cVar17.getF105880g());
                } else if (dVar instanceof com.avito.android.blueprint.chips.multiple.c) {
                    com.avito.android.blueprint.chips.multiple.c cVar18 = (com.avito.android.blueprint.chips.multiple.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar18.h().j0(interfaceC35745a5.e()).u0(new C33654w2(), new C33658x2()));
                    k(cVar18.getF105421e());
                } else if (dVar instanceof com.avito.android.blueprints.radiogroup.c) {
                    com.avito.android.blueprints.radiogroup.c cVar19 = (com.avito.android.blueprints.radiogroup.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar19.h().j0(interfaceC35745a5.e()).u0(new C33666z2(), new A2()));
                    k(cVar19.E());
                } else if (dVar instanceof com.avito.android.blueprint.radiogroup.c) {
                    com.avito.android.blueprint.radiogroup.c cVar20 = (com.avito.android.blueprint.radiogroup.c) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar20.h().j0(interfaceC35745a5.e()).u0(new B2(), new C2()));
                    k(cVar20.E());
                } else if (dVar instanceof com.avito.android.blueprints.publish.reg_number.c) {
                    r(((com.avito.android.blueprints.publish.reg_number.c) dVar).b());
                } else if (dVar instanceof com.avito.android.blueprints.input.d) {
                    com.avito.android.blueprints.input.d dVar4 = (com.avito.android.blueprints.input.d) dVar;
                    n(dVar4.getF105960r());
                    r(dVar4.b());
                    o(dVar4.n());
                    s(dVar4.getF105962t());
                    k(dVar4.y());
                    h(dVar4.r());
                } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                    com.avito.android.blueprint.input.c cVar21 = (com.avito.android.blueprint.input.c) dVar;
                    n(cVar21.getF105548n());
                    r(cVar21.b());
                    o(cVar21.n());
                    s(cVar21.getF105550p());
                    h(cVar21.r());
                } else if (dVar instanceof InterfaceC33870b) {
                    InterfaceC33870b interfaceC33870b = (InterfaceC33870b) dVar;
                    r(interfaceC33870b.b());
                    q(interfaceC33870b.getF237184r());
                    s(interfaceC33870b.getF237186t());
                    h(interfaceC33870b.r());
                    k(interfaceC33870b.y());
                } else if (dVar instanceof InterfaceC28874c) {
                    InterfaceC28874c interfaceC28874c = (InterfaceC28874c) dVar;
                    r(interfaceC28874c.b());
                    p(interfaceC28874c.getF105751p());
                    s(interfaceC28874c.getF105753r());
                    h(interfaceC28874c.r());
                } else if (dVar instanceof com.avito.android.publish.items.video.c) {
                    com.avito.android.publish.items.video.c cVar22 = (com.avito.android.publish.items.video.c) dVar;
                    r(cVar22.b());
                    n(cVar22.getF237211g());
                } else if (dVar instanceof com.avito.android.blueprint.video.url.c) {
                    com.avito.android.blueprint.video.url.c cVar23 = (com.avito.android.blueprint.video.url.c) dVar;
                    r(cVar23.b());
                    n(cVar23.getF105803g());
                } else if (dVar instanceof com.avito.android.publish.slots.imv.item.d) {
                    k(((com.avito.android.publish.slots.imv.item.d) dVar).k());
                } else if (dVar instanceof com.avito.android.blueprints.switcher.b) {
                    com.avito.android.blueprints.switcher.b bVar = (com.avito.android.blueprints.switcher.b) dVar;
                    x(bVar.b());
                    k(bVar.getF106760h());
                } else if (dVar instanceof com.avito.android.blueprint.switcher.c) {
                    com.avito.android.blueprint.switcher.c cVar24 = (com.avito.android.blueprint.switcher.c) dVar;
                    x(cVar24.b());
                    k(cVar24.getF105774e());
                } else if (dVar instanceof com.avito.android.publish.details.adapter.objects.o) {
                    com.avito.android.publish.details.adapter.objects.o oVar = (com.avito.android.publish.details.adapter.objects.o) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) oVar.getF233336g().y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).u0(new D2(), new E2()));
                    k(oVar.B());
                } else if (dVar instanceof com.avito.android.publish.slots.no_car.item.c) {
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.no_car.item.c) dVar).getF244661c().j0(interfaceC35745a5.e()).u0(new F2(), new G2()));
                } else if (dVar instanceof com.avito.android.publish.details.adapter.edit_category.b) {
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.details.adapter.edit_category.b) dVar).getF233221c().y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).u0(new H2(), new I2()));
                } else if (dVar instanceof com.avito.android.phone_protection_info.item.e) {
                    k(((com.avito.android.phone_protection_info.item.e) dVar).k());
                } else if (dVar instanceof com.avito.android.publish.slots.link.item.d) {
                    com.avito.android.publish.slots.link.item.d dVar5 = (com.avito.android.publish.slots.link.item.d) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar5.getF244503d().j0(interfaceC35745a5.e()).u0(new K2(), new L2()));
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar5.j().j0(interfaceC35745a5.e()).u0(new M2(), new N2()));
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar5.l().j0(interfaceC35745a5.e()).u0(new O2(), new P2()));
                } else if (dVar instanceof com.avito.android.publish.slots.market_price_v2.item.k) {
                    com.avito.android.publish.slots.market_price_v2.item.k kVar = (com.avito.android.publish.slots.market_price_v2.item.k) dVar;
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) kVar.j().j0(interfaceC35745a5.e()).u0(new Q2(), new R2()));
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) kVar.l().j0(interfaceC35745a5.e()).u0(new S2(), new T2()));
                } else if (dVar instanceof com.avito.android.publish.slots.cpa_tariff.item.c) {
                    C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.cpa_tariff.item.c) dVar).getF243384c().j0(interfaceC35745a5.e()).u0(new V2(), new W2()));
                } else {
                    boolean z14 = dVar instanceof com.avito.android.publish.slots.salary_range.item.g;
                    final InterfaceC33678b interfaceC33678b = this.f232643j;
                    if (z14) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.salary_range.item.g) dVar).b().j0(interfaceC35745a5.e()).u0(new l41.g() { // from class: com.avito.android.publish.details.E.X2
                            @Override // l41.g
                            public final void accept(Object obj) {
                                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
                            }
                        }, new Y2()));
                    } else if (dVar instanceof com.avito.android.publish.slots.salary_range.item.publish.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.salary_range.item.publish.d) dVar).b().j0(interfaceC35745a5.e()).u0(new l41.g() { // from class: com.avito.android.publish.details.E.Z2
                            @Override // l41.g
                            public final void accept(Object obj) {
                                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
                            }
                        }, new C33563a3()));
                    } else if (dVar instanceof com.avito.android.publish.items.int_range.f) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.int_range.f) dVar).b().j0(interfaceC35745a5.e()).u0(new l41.g() { // from class: com.avito.android.publish.details.E.b3
                            @Override // l41.g
                            public final void accept(Object obj) {
                                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
                            }
                        }, new C33573c3()));
                    } else if (dVar instanceof com.avito.android.publish.slots.accordion.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.accordion.d) dVar).b().j0(interfaceC35745a5.e()).u0(new C33578d3(), new C33582e3()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.date.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.publish.date.c) dVar).c().j0(interfaceC35745a5.e()).u0(new g3(), new h3()));
                    } else if (dVar instanceof com.avito.android.blueprint.date.single.c) {
                        com.avito.android.blueprint.date.single.c cVar25 = (com.avito.android.blueprint.date.single.c) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar25.c().j0(interfaceC35745a5.e()).u0(new i3(), new j3()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar25.r().j0(interfaceC35745a5.e()).u0(new k3(), new l3()));
                        k(cVar25.getF105503h());
                    } else if (dVar instanceof com.avito.android.publish.items.mic_permission_block.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.mic_permission_block.c) dVar).getF237041c().j0(interfaceC35745a5.e()).u0(new m3(), new n3()));
                    } else if (dVar instanceof com.avito.android.publish.items.mic_permission_block.re23.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.mic_permission_block.re23.c) dVar).getF237057c().j0(interfaceC35745a5.e()).u0(new o3(), new p3()));
                    } else if (dVar instanceof com.avito.android.publish.items.iac_for_pro.d) {
                        com.avito.android.publish.items.iac_for_pro.d dVar6 = (com.avito.android.publish.items.iac_for_pro.d) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar6.getF236921b().j0(interfaceC35745a5.e()).u0(new r3(), new s3()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar6.j().j0(interfaceC35745a5.e()).u0(new t3(), new u3()));
                    } else if (dVar instanceof com.avito.android.publish.items.iac_for_pro_enabled.d) {
                        com.avito.android.publish.items.iac_for_pro_enabled.d dVar7 = (com.avito.android.publish.items.iac_for_pro_enabled.d) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar7.getF236950b().j0(interfaceC35745a5.e()).u0(new v3(), new w3()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar7.j().j0(interfaceC35745a5.e()).u0(new x3(), new y3()));
                    } else if (dVar instanceof com.avito.android.publish.items.iac_devices.re23.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.iac_devices.re23.c) dVar).d().j0(interfaceC35745a5.e()).u0(new z3(), new A3()));
                    } else if (dVar instanceof com.avito.android.publish.items.iac_devices.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.iac_devices.d) dVar).d().j0(interfaceC35745a5.e()).u0(new F(), new G()));
                    } else if (dVar instanceof com.avito.android.publish.slots.contact_method.item.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.contact_method.item.d) dVar).getF243305b().j0(interfaceC35745a5.e()).u0(new H(), new I()));
                    } else if (dVar instanceof com.avito.android.publish.slots.contact_method.publish.item.e) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.contact_method.publish.item.e) dVar).getF243347b().j0(interfaceC35745a5.e()).u0(new J(), new K()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.delivery_toggles.e) {
                        com.avito.android.blueprints.publish.delivery_toggles.e eVar = (com.avito.android.blueprints.publish.delivery_toggles.e) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar.b().j0(interfaceC35745a5.e()).u0(new L(), new M()));
                        k(eVar.getF106192e());
                    } else if (dVar instanceof com.avito.android.publish.slots.contact_method.info_item.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.contact_method.info_item.c) dVar).getF243280d().j0(interfaceC35745a5.e()).u0(new N(), new O()));
                    } else if (dVar instanceof com.avito.android.publish.items.atributed_text.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.atributed_text.d) dVar).j().j0(interfaceC35745a5.e()).u0(new R(), new S()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_summary.re23.c) {
                        com.avito.android.publish.slots.delivery_summary.re23.c cVar26 = (com.avito.android.publish.slots.delivery_summary.re23.c) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar26.j().j0(interfaceC35745a5.e()).u0(new T(), new U()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar26.l().j0(interfaceC35745a5.e()).u0(new V(), new W()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar26.b().j0(interfaceC35745a5.e()).u0(new X(), new Y()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_summary.item.f) {
                        com.avito.android.publish.slots.delivery_summary.item.f fVar = (com.avito.android.publish.slots.delivery_summary.item.f) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) fVar.j().j0(interfaceC35745a5.e()).u0(new Z(), new C33560a0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) fVar.l().j0(interfaceC35745a5.e()).u0(new C33565b0(), new C33570c0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) fVar.b().j0(interfaceC35745a5.e()).u0(new l41.g() { // from class: com.avito.android.publish.details.E.d0
                            @Override // l41.g
                            public final void accept(Object obj) {
                                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
                            }
                        }, new C33579e0()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_summary_edit.item.c) {
                        com.avito.android.publish.slots.delivery_summary_edit.item.c cVar27 = (com.avito.android.publish.slots.delivery_summary_edit.item.c) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar27.j().j0(interfaceC35745a5.e()).u0(new C33584f0(), new C33588g0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar27.l().j0(interfaceC35745a5.e()).u0(new C33592h0(), new C33596i0()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_summary_edit.re23.c) {
                        com.avito.android.publish.slots.delivery_summary_edit.re23.c cVar28 = (com.avito.android.publish.slots.delivery_summary_edit.re23.c) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar28.j().j0(interfaceC35745a5.e()).u0(new C33600j0(), new C33604k0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar28.l().j0(interfaceC35745a5.e()).u0(new C33612m0(), new C33616n0()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_all_toggles.item.g) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.delivery_all_toggles.item.g) dVar).l().j0(interfaceC35745a5.e()).u0(new C33620o0(), new C33624p0()));
                    } else if (dVar instanceof com.avito.android.publish.details.adapter.historical_suggest.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.details.adapter.historical_suggest.c) dVar).getF233237c().j0(interfaceC35745a5.e()).u0(new C33628q0(), new C33632r0()));
                    } else if (dVar instanceof com.avito.android.publish.items.video_upload.d) {
                        com.avito.android.publish.items.video_upload.d dVar8 = (com.avito.android.publish.items.video_upload.d) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237288q().j0(interfaceC35745a5.e()).t0(new C33636s0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237283l().j0(interfaceC35745a5.e()).t0(new C33640t0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237289r().j0(interfaceC35745a5.e()).u0(new C33644u0(), new C33648v0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237290s().j0(interfaceC35745a5.e()).u0(new C33656x0(), new C33660y0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237291t().j0(interfaceC35745a5.e()).u0(new C33664z0(), new A0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar8.getF237292u().j0(interfaceC35745a5.e()).t0(new B0()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.header.e) {
                        k(((com.avito.android.blueprints.publish.header.e) dVar).B());
                    } else if (dVar instanceof com.avito.android.publish.slots.auto_group_block.item.e) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.auto_group_block.item.e) dVar).getF243110c().j0(interfaceC35745a5.e()).u0(new C0(), new D0()));
                    } else if (dVar instanceof com.avito.android.publish.slots.auto_group_block.contact.item.e) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.auto_group_block.contact.item.e) dVar).getF243090c().j0(interfaceC35745a5.e()).u0(new E0(), new F0()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.car_body_condition.a) {
                        com.avito.android.blueprints.publish.car_body_condition.a aVar = (com.avito.android.blueprints.publish.car_body_condition.a) dVar;
                        aVar.z3(new G0());
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) aVar.getF106805c().d0(new C33679b0.a(new kotlin.jvm.internal.h0() { // from class: com.avito.android.publish.details.E.I0
                            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
                            @Y61.l
                            public final Object get(@Y61.l Object obj) {
                                return ((kotlin.Q) obj).f406620c;
                            }
                        })).N(J0.f232699b).d0(K0.f232703b).j0(interfaceC35745a5.e()).u0(new L0(), M0.f232711b));
                    } else if (dVar instanceof com.avito.android.publish.slots.card_select.item.d) {
                        com.avito.android.publish.slots.card_select.item.d dVar9 = (com.avito.android.publish.slots.card_select.item.d) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar9.getF243151e().j0(interfaceC35745a5.e()).u0(new N0(), O0.f232719b));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar9.getF243149c().j0(interfaceC35745a5.e()).u0(new P0(), Q0.f232733b));
                        k(dVar9.getF243153g());
                    } else if (dVar instanceof com.avito.android.publish.items.alert_banner.c) {
                        k(((com.avito.android.publish.items.alert_banner.c) dVar).B());
                    } else if (dVar instanceof com.avito.android.publish.items.button.f) {
                        k(((com.avito.android.publish.items.button.f) dVar).B());
                    } else if (dVar instanceof com.avito.android.publish.details.adapter.objects.price_list.n) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.details.adapter.objects.price_list.n) dVar).getF233374h().j0(interfaceC35745a5.e()).u0(new R0(), new T0()));
                    } else if (dVar instanceof com.avito.android.blueprints.radio_card.radio_card_group.c) {
                        com.avito.android.blueprints.radio_card.radio_card_group.c cVar29 = (com.avito.android.blueprints.radio_card.radio_card_group.c) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar29.g().j0(interfaceC35745a5.e()).u0(new U0(), new V0()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar29.getF106544g().j0(interfaceC35745a5.e()).u0(new W0(), new X0()));
                        k(cVar29.getF106542e());
                    } else if (dVar instanceof com.avito.android.blueprints.selector_card.select.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.selector_card.select.c) dVar).g().j0(interfaceC35745a5.e()).u0(new Y0(), new Z0()));
                    } else if (dVar instanceof com.avito.android.publish.slots.final_state_suggest.item.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.final_state_suggest.item.d) dVar).getF243927c().j0(interfaceC35745a5.e()).u0(new C33561a1(), new C33566b1()));
                    } else if (dVar instanceof com.avito.android.publish.items.file_uploader.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.file_uploader.d) dVar).getF236812d().j0(interfaceC35745a5.e()).u0(new C33571c1(), new C33580e1()));
                    } else if (dVar instanceof com.avito.android.publish.slots.cpa_ddu_upload.e) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.cpa_ddu_upload.e) dVar).getF243357d().j0(interfaceC35745a5.e()).u0(new C33585f1(), new C33589g1()));
                    } else if (dVar instanceof com.avito.android.blueprints.job_multigeo_address.e) {
                        com.avito.android.blueprints.job_multigeo_address.e eVar2 = (com.avito.android.blueprints.job_multigeo_address.e) dVar;
                        k(eVar2.y());
                        u(eVar2.getF106017h());
                        l(eVar2.getF106019j());
                    } else if (dVar instanceof com.avito.android.publish.slots.check_verification.item.c) {
                        com.avito.android.publish.slots.check_verification.item.c cVar30 = (com.avito.android.publish.slots.check_verification.item.c) dVar;
                        k(cVar30.getF243192f());
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) cVar30.getF243190d().j0(interfaceC35745a5.e()).u0(new C33593h1(), new C33597i1()));
                    } else if (dVar instanceof com.avito.android.publish.slots.item_info.item.h) {
                        com.avito.android.publish.slots.item_info.item.h hVar = (com.avito.android.publish.slots.item_info.item.h) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) hVar.z2().j0(interfaceC35745a5.e()).u0(new C33601j1(), new C33605k1()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) hVar.t2().j0(interfaceC35745a5.e()).u0(new C33609l1(), new C33613m1()));
                    } else if (dVar instanceof com.avito.android.publish.slots.sleeping_places.item.e) {
                        com.avito.android.publish.slots.sleeping_places.item.e eVar3 = (com.avito.android.publish.slots.sleeping_places.item.e) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar3.getF244887c().j0(interfaceC35745a5.e()).u0(new C33617n1(), new C33625p1()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar3.getF244889e().j0(interfaceC35745a5.e()).u0(new C33629q1(), new C33633r1()));
                    } else if (dVar instanceof com.avito.android.publish.items.location_addresses.e) {
                        com.avito.android.publish.items.location_addresses.e eVar4 = (com.avito.android.publish.items.location_addresses.e) dVar;
                        k(eVar4.getF237004g());
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar4.getF237006i().j0(interfaceC35745a5.e()).t0(new C33637s1()));
                    } else if (dVar instanceof com.avito.android.publish.slots.delivery_addresses.item.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.delivery_addresses.item.d) dVar).getF243451c().j0(interfaceC35745a5.e()).u0(new C33641t1(), new C33645u1()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) this.f232650q.getF243426c().j0(interfaceC35745a5.e()).u0(new C33649v1(), new C33653w1()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.date_interval.c) {
                        j((com.avito.android.blueprints.publish.date_interval.c) dVar);
                    } else if (dVar instanceof com.avito.android.blueprint.date.interval.c) {
                        i((com.avito.android.blueprint.date.interval.c) dVar);
                    } else if (dVar instanceof com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e) {
                        k(((com.avito.android.publish.slots.cv_upload.item.cvUploadButton.e) dVar).getF243409d());
                    } else if (dVar instanceof com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.g) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.g) dVar).getF237098d().j0(interfaceC35745a5.e()).u0(new C33657x1(), new C33661y1()));
                    } else if (dVar instanceof com.avito.android.blueprints.selector_cards_carousel.e) {
                        com.avito.android.blueprints.selector_cards_carousel.e eVar5 = (com.avito.android.blueprints.selector_cards_carousel.e) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar5.getF106729g().j0(interfaceC35745a5.e()).u0(new A1(), new B1()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) eVar5.getF106731i().j0(interfaceC35745a5.e()).u0(new C1(), new D1()));
                        k(eVar5.getF106726d());
                    } else if (dVar instanceof com.avito.android.publish.slots.user_verification.blocker.d) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.publish.slots.user_verification.blocker.d) dVar).getF245115c().j0(interfaceC35745a5.e()).u0(new E1(), new F1()));
                    } else if (dVar instanceof com.avito.android.blueprints.withSuggestedOptions.d) {
                        com.avito.android.blueprints.withSuggestedOptions.d dVar10 = (com.avito.android.blueprints.withSuggestedOptions.d) dVar;
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar10.getF106781f().j0(interfaceC35745a5.e()).u0(new G1(), new H1()));
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) dVar10.getF106783h().j0(interfaceC35745a5.e()).u0(new I1(), new J1()));
                    } else if (dVar instanceof com.avito.android.blueprints.selector_card.multiselect.e) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.selector_card.multiselect.e) dVar).getF106645c().j0(interfaceC35745a5.e()).u0(new M1(), new N1()));
                    } else if (dVar instanceof com.avito.android.blueprints.publish.infomation.item.d) {
                        k(((com.avito.android.blueprints.publish.infomation.item.d) dVar).k());
                    } else if (dVar instanceof com.avito.android.publish.slots.address_from_profile.publish_item.c) {
                        this.f232655v = C43259k.d(c43238h, null, null, new O1((com.avito.android.publish.slots.address_from_profile.publish_item.c) dVar, this, null), 3);
                    } else if (dVar instanceof com.avito.android.blueprints.checkbox_with_text.c) {
                        C42039e.a(cVar, (io.reactivex.rxjava3.internal.observers.y) ((com.avito.android.blueprints.checkbox_with_text.c) dVar).c().j0(interfaceC35745a5.e()).u0(new P1(), new Q1()));
                    } else if (dVar instanceof com.avito.android.mandatory_verification.items.accountVerification.e) {
                        g(((com.avito.android.mandatory_verification.items.accountVerification.e) dVar).getF236837c());
                    } else if (dVar instanceof com.avito.android.publish.items.file_uploader_redesign.e) {
                        C43259k.d(c43238h, null, null, new R1((com.avito.android.publish.items.file_uploader_redesign.e) dVar, this, null), 3);
                    }
                }
            }
        }
    }

    @Override // com.avito.android.publish.details.D
    public final void c0() {
        this.f232652s = null;
        this.f232637d.c0();
    }

    public final void g(InterfaceC43160i<? extends DeepLink> interfaceC43160i) {
        C43259k.d(this.f232654u, null, null, new C33564b(interfaceC43160i, this, null), 3);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void h(io.reactivex.rxjava3.core.z<kotlin.G0> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33569c(), new C33574d(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void i(com.avito.android.blueprint.date.interval.c cVar) {
        new com.avito.android.blueprint.date.interval.f(new C33583f()).a(cVar, this.f232651r);
    }

    public final void j(com.avito.android.blueprints.publish.date_interval.c cVar) {
        new com.avito.android.blueprints.publish.date_interval.f(new e()).a(cVar, this.f232651r);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void k(io.reactivex.rxjava3.core.z<DeepLink> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33587g(), new C33591h(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void l(io.reactivex.rxjava3.core.z<String> zVar) {
        C33595i c33595i = new C33595i();
        C33599j c33599j = new C33599j();
        zVar.getClass();
        this.f232651r.b(zVar.v0(c33595i, c33599j, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void m(io.reactivex.rxjava3.core.z<ParameterElement.C29379g> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33603k(), new C33607l(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void n(io.reactivex.rxjava3.core.z<ItemWithAdditionalButton> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33611m(), new C33615n(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void o(io.reactivex.rxjava3.core.z<kotlin.Q<Boolean, com.avito.android.items.a>> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33619o(), new C33623p(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void p(io.reactivex.rxjava3.core.z<com.avito.android.blueprint.suggest.D> zVar) {
        this.f232651r.b(zVar.t0(new C33627q()));
    }

    public final void q(io.reactivex.rxjava3.core.z<com.avito.android.publish.items.tagged_input.E> zVar) {
        this.f232651r.b(zVar.t0(new C33631r()));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void r(io.reactivex.rxjava3.core.z<com.avito.android.items.a> zVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f232634a;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = zVar.y(800L, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e());
        final InterfaceC33678b interfaceC33678b = this.f232643j;
        this.f232651r.b(i0J0.v0(new l41.g() { // from class: com.avito.android.publish.details.E.s
            @Override // l41.g
            public final void accept(Object obj) {
                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
            }
        }, new C33639t(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void s(io.reactivex.rxjava3.core.z<com.avito.android.llm.ui.a> zVar) {
        this.f232651r.b(io.reactivex.rxjava3.kotlin.A1.h(zVar.j0(this.f232634a.e()), null, new C33643u(), 3));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void t(io.reactivex.rxjava3.core.z<ParameterElement.t> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33647v(), new C33651w(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void u(io.reactivex.rxjava3.core.z<j.a> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33655x(), new C33659y(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void v(io.reactivex.rxjava3.core.z<kotlin.Q<ParameterElement.v, JO.m>> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new C33663z(), new A(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void w(io.reactivex.rxjava3.core.z<ParameterElement.v> zVar) {
        this.f232651r.b(zVar.j0(this.f232634a.e()).v0(new B(), new C(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void x(io.reactivex.rxjava3.core.z<com.avito.android.items.b> zVar) {
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = zVar.j0(this.f232634a.e());
        final InterfaceC33678b interfaceC33678b = this.f232643j;
        this.f232651r.b(i0J0.v0(new l41.g() { // from class: com.avito.android.publish.details.E.D
            @Override // l41.g
            public final void accept(Object obj) {
                interfaceC33678b.Mb((com.avito.conveyor_item.a) obj);
            }
        }, new C7073E(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void y(C28876a c28876a) {
        CharParameter.AutoDescription.ConfirmDialog confirmDialog = c28876a.f105932b;
        if (confirmDialog == null) {
            this.f232648o.w3(c28876a);
            return;
        }
        D.a aVar = this.f232652s;
        if (aVar != null) {
            aVar.M3(confirmDialog.getTitle(), confirmDialog.getDescription(), confirmDialog.getButton(), new C3(), new D3(c28876a), new E3());
        }
    }
}
