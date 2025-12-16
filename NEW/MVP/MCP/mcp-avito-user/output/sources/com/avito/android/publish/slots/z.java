package com.avito.android.publish.slots;

import Af0.C13027a;
import Kj.C14319a;
import We0.C15755a;
import Xe0.InterfaceC16996b;
import Ye0.C18260b;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.slots.network_stores_fake_door_slot.InterfaceC34122b;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.AdvantageBannersSlot;
import com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.anonymous_number.AnonymousNumberSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.additional_options.GroupAdditionalOptionsSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition.GroupBodyConditionBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.contact.GroupContactSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarInfoShortSlot;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelectSlot;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.CheckVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_reassignment.CpaReassignmentSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlot;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.CvUploadSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles.DeliveryAllTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy_block.DeliveryReturnPolicyBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_seller.DeliverySellerSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlot;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.generate_text_buttons.GenerateTextButtonsSlot;
import com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot.GroupInlinedBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlot;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlot;
import com.avito.android.remote.model.category_parameters.slot.image_perception.ImagePerceptionSlot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.ImagesGroupsRecommendationsSlot;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationWithUserIdSlot;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.job_premoderation.JobPremoderationSlot;
import com.avito.android.remote.model.category_parameters.slot.job_warning_toast.JobToastSlot;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlot;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlot;
import com.avito.android.remote.model.category_parameters.slot.network_stores_fake_door.NetworkStoresFakeDoorSlot;
import com.avito.android.remote.model.category_parameters.slot.no_car.NoCarSlot;
import com.avito.android.remote.model.category_parameters.slot.notification_banner.FashionAuthenticationCheckBannerSlot;
import com.avito.android.remote.model.category_parameters.slot.parameters_suggest.ParametersSuggestByAddressSlot;
import com.avito.android.remote.model.category_parameters.slot.profile_info.ProfileInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlot;
import com.avito.android.remote.model.category_parameters.slot.regnum_suggest.RegnumSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;
import com.avito.android.remote.model.category_parameters.slot.salary_range.SalaryRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesSlot;
import com.avito.android.remote.model.category_parameters.slot.stockManagement.StockManagementSlot;
import com.avito.android.remote.model.category_parameters.slot.text_suggests.TextSuggestionsSlot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlot;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.verification.VerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.vin_cropped_image.VinCroppedImageSlot;
import com.avito.android.util.NotFoundException;
import df0.C39722a;
import ef0.InterfaceC40101b;
import ff0.InterfaceC40412b;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import jf0.InterfaceC42369b;
import kf0.InterfaceC42683b;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import mf0.C44076a;
import nf0.C44417a;
import pf0.C47074d;
import tf0.InterfaceC48661b;
import xe0.InterfaceC49930a;
import xf0.C49936a;
import yf0.InterfaceC50240c;
import zf0.C50559b;

/* compiled from: SlotsFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/z;", "Lcom/avito/android/publish/slots/y;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z implements y {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40412b f245198A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_all_toggles.d f245199B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.job_premoderation.b f245200C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.job_warning_toast.b f245201D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42683b f245202E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final s f245203F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.final_state_suggest.b f245204G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.universal_beduin.j f245205H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final InterfaceC16996b f245206I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.sleeping_places.f f245207J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Ue0.c f245208K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.item_info.f f245209L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Te0.c f245210M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.group_inlined_block.n f245211N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.check_verification.d f245212O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.cv_upload.b f245213P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final Ve0.d f245214Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_addresses.n f245215R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50240c f245216S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.advantage_banners.g f245217T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.generate_text_buttons.j f245218U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.images_enhancement.f f245219V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34122b f245220W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49930a f245221X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.regnum_suggest.b f245222Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final Q1 f245223Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48661b f245224a;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f245225a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.anonymous_number.m f245226b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final Map<Class<? extends Slot<?>>, x<?, ?>> f245227b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.contact_info.j f245228c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final bf0.g f245229d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.market_price.l f245230e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.iac_devices.c f245231f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final g f245232g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.promoblock.c f245233h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.accordion.k f245234i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.imv.l f245235j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.parameters_suggest.g f245236k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_summary.m f245237l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_summary_edit.q f245238m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_subsidies.b f245239n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_seller.b f245240o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40101b f245241p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.information_with_user_id.b f245242q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.images_groups.c f245243r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.images_groups_recommendations.m f245244s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.salary_range.f f245245t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Re0.b f245246u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final gf0.d f245247v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_return_policy_block.b f245248w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final m f245249x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42369b f245250y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.address_from_profile.A f245251z;

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f245252l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Slot);
        }
    }

    /* compiled from: SlotsFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Slot<?>, com.avito.android.category_parameters.j<? extends Slot<?>>> {
        @Override // Y41.l
        public final com.avito.android.category_parameters.j<? extends Slot<?>> invoke(Slot<?> slot) throws NotFoundException {
            com.avito.android.category_parameters.j<? extends Slot<?>> c44417a;
            com.avito.android.category_parameters.j<? extends Slot<?>> wVar;
            Slot<?> slot2 = slot;
            z zVar = (z) this.receiver;
            zVar.getClass();
            x<?, ?> xVar = zVar.f245227b0.get(slot2.getClass());
            x<?, ?> xVar2 = xVar instanceof x ? xVar : null;
            if (xVar2 != null) {
                return xVar2.a(slot2);
            }
            if (slot2 instanceof ProfileInfoSlot) {
                return zVar.f245224a.a(slot2);
            }
            if (slot2 instanceof ContactInfoSlot) {
                return zVar.f245228c.a(slot2);
            }
            if (slot2 instanceof AnonymousNumberSlot) {
                return zVar.f245226b.a(slot2);
            }
            if (slot2 instanceof NoCarSlot) {
                c44417a = new com.avito.android.publish.slots.no_car.d((NoCarSlot) slot2);
            } else {
                if (!(slot2 instanceof TextSuggestionsSlot)) {
                    if (slot2 instanceof MarketPriceSlot) {
                        return zVar.f245230e.a(slot2);
                    }
                    if (slot2 instanceof ContactMethodSlot) {
                        return zVar.f245229d.a(slot2);
                    }
                    if (slot2 instanceof IacDevicesSlot) {
                        return zVar.f245231f.a(slot2);
                    }
                    boolean z12 = slot2 instanceof EditCategorySlot;
                    Q1 q12 = zVar.f245223Z;
                    if (z12) {
                        wVar = new p((EditCategorySlot) slot2, q12, zVar.f245225a0);
                    } else {
                        if (slot2 instanceof AutoPublishSlot) {
                            return zVar.f245232g.a(slot2);
                        }
                        if (slot2 instanceof InstantMarketValueSlot) {
                            return zVar.f245235j.a(slot2);
                        }
                        if (slot2 instanceof ResidentialComplexSlot) {
                            return zVar.f245203F.a(slot2);
                        }
                        if (slot2 instanceof InformationSlot) {
                            c44417a = new C14319a((InformationSlot) slot2);
                        } else if (slot2 instanceof ImageSlot) {
                            c44417a = new C44076a((ImageSlot) slot2);
                        } else {
                            if (slot2 instanceof ImagesGroupsSlot) {
                                return zVar.f245243r.a(slot2);
                            }
                            if (slot2 instanceof ImagesGroupsRecommendationsSlot) {
                                return zVar.f245244s.a(slot2);
                            }
                            if (slot2 instanceof LinkSlot) {
                                c44417a = new C47074d((LinkSlot) slot2);
                            } else {
                                if (slot2 instanceof PromoblockSlot) {
                                    return zVar.f245233h.a(slot2);
                                }
                                if (slot2 instanceof AccordionSlot) {
                                    return zVar.f245234i.a(slot2);
                                }
                                if (slot2 instanceof SectionSeparatorSlot) {
                                    wVar = new w((SectionSeparatorSlot) slot2, zVar.f245221X, q12);
                                } else {
                                    if (slot2 instanceof InformationWithUserIdSlot) {
                                        return zVar.f245242q.a(slot2);
                                    }
                                    if (slot2 instanceof ParametersSuggestByAddressSlot) {
                                        return zVar.f245236k.a(slot2);
                                    }
                                    if (slot2 instanceof CpaTariffSlot) {
                                        c44417a = new com.avito.android.publish.slots.cpa_tariff.d((CpaTariffSlot) slot2);
                                    } else if (slot2 instanceof CpaReassignmentSlot) {
                                        c44417a = new C39722a((CpaReassignmentSlot) slot2);
                                    } else {
                                        if (slot2 instanceof SalaryRangeSlot) {
                                            return zVar.f245245t.a(slot2);
                                        }
                                        if (slot2 instanceof AgeRangeSlot) {
                                            return zVar.f245246u.a(slot2);
                                        }
                                        if (slot2 instanceof JobPremoderationSlot) {
                                            return zVar.f245200C.a(slot2);
                                        }
                                        if (slot2 instanceof JobToastSlot) {
                                            return zVar.f245201D.a(slot2);
                                        }
                                        if (slot2 instanceof DeliverySellerSlot) {
                                            return zVar.f245240o.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryCncTogglesSlot) {
                                            return zVar.f245198A.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryAllTogglesSlot) {
                                            return zVar.f245199B.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryTogglesSlot) {
                                            return zVar.f245250y.a(slot2);
                                        }
                                        if (slot2 instanceof DeliverySubsidiesSlot) {
                                            return zVar.f245239n.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryDbsTogglesSlot) {
                                            return zVar.f245249x.a(slot2);
                                        }
                                        if (slot2 instanceof DeliverySummarySlot) {
                                            return zVar.f245237l.a(slot2);
                                        }
                                        if (slot2 instanceof DeliverySummaryEditSlot) {
                                            return zVar.f245238m.a(slot2);
                                        }
                                        if (slot2 instanceof CptUnswitchableDeliverySlot) {
                                            return zVar.f245241p.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryReturnPolicySlot) {
                                            return zVar.f245247v.a(slot2);
                                        }
                                        if (slot2 instanceof DeliveryReturnPolicyBlockSlot) {
                                            return zVar.f245248w.a(slot2);
                                        }
                                        if (slot2 instanceof CarBodyConditionSlot) {
                                            return zVar.f245206I.a(slot2);
                                        }
                                        if (slot2 instanceof CardSelectSlot) {
                                            c44417a = new C18260b((CardSelectSlot) slot2);
                                        } else if (slot2 instanceof CarInfoShortSlot) {
                                            c44417a = new C15755a((CarInfoShortSlot) slot2);
                                        } else {
                                            if (slot2 instanceof ItemInfoSlot) {
                                                return zVar.f245209L.a(slot2);
                                            }
                                            if (slot2 instanceof RegnumSuggestSlot) {
                                                return zVar.f245222Y.a(slot2);
                                            }
                                            if (slot2 instanceof StockManagementSlot) {
                                                c44417a = new B((StockManagementSlot) slot2);
                                            } else {
                                                if (slot2 instanceof FashionAuthenticationCheckBannerSlot) {
                                                    return zVar.f245202E.a(slot2);
                                                }
                                                if (slot2 instanceof VerificationSlot) {
                                                    c44417a = new C50559b((VerificationSlot) slot2);
                                                } else {
                                                    if (slot2 instanceof UserVerificationSlot) {
                                                        return zVar.f245216S.a(slot2);
                                                    }
                                                    if (slot2 instanceof AdvantageBannersSlot) {
                                                        return zVar.f245217T.a(slot2);
                                                    }
                                                    if (slot2 instanceof VinCroppedImageSlot) {
                                                        c44417a = new C13027a((VinCroppedImageSlot) slot2);
                                                    } else {
                                                        if (slot2 instanceof FinalStateSuggestSlot) {
                                                            return zVar.f245204G.a(slot2);
                                                        }
                                                        if (slot2 instanceof UniversalBeduinSlot) {
                                                            return zVar.f245205H.a(slot2);
                                                        }
                                                        if (slot2 instanceof CvUploadSlot) {
                                                            return zVar.f245213P.a(slot2);
                                                        }
                                                        if (slot2 instanceof SleepingPlacesSlot) {
                                                            return zVar.f245207J.a(slot2);
                                                        }
                                                        if (slot2 instanceof GroupBodyConditionBlockSlot) {
                                                            return zVar.f245208K.a(slot2);
                                                        }
                                                        if (slot2 instanceof GroupAdditionalOptionsSlot) {
                                                            return zVar.f245210M.a(slot2);
                                                        }
                                                        if (slot2 instanceof GroupInlinedBlockSlot) {
                                                            return zVar.f245211N.a(slot2);
                                                        }
                                                        if (slot2 instanceof CheckVerificationSlot) {
                                                            return zVar.f245212O.a(slot2);
                                                        }
                                                        if (slot2 instanceof GroupContactSlot) {
                                                            return zVar.f245214Q.a(slot2);
                                                        }
                                                        if (slot2 instanceof DeliveryAddressesSlot) {
                                                            return zVar.f245215R.a(slot2);
                                                        }
                                                        if (slot2 instanceof GenerateTextButtonsSlot) {
                                                            return zVar.f245218U.a(slot2);
                                                        }
                                                        if (slot2 instanceof ImagesEnhancementSlot) {
                                                            return zVar.f245219V.a(slot2);
                                                        }
                                                        if (!(slot2 instanceof ImagePerceptionSlot)) {
                                                            if (slot2 instanceof AddressesFromProfileSlot) {
                                                                return zVar.f245251z.a(slot2);
                                                            }
                                                            if (slot2 instanceof NetworkStoresFakeDoorSlot) {
                                                                return zVar.f245220W.a(slot2);
                                                            }
                                                            throw new NotFoundException(slot2.toString(), (Throwable) null, 2, (C42822w) null);
                                                        }
                                                        c44417a = new C44417a((ImagePerceptionSlot) slot2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return wVar;
                }
                c44417a = new C49936a((TextSuggestionsSlot) slot2);
            }
            return c44417a;
        }
    }

    @Inject
    public z(@Y61.k InterfaceC48661b interfaceC48661b, @Y61.k com.avito.android.publish.slots.anonymous_number.m mVar, @Y61.k com.avito.android.publish.slots.contact_info.j jVar, @Y61.k bf0.g gVar, @Y61.k com.avito.android.publish.slots.market_price.l lVar, @Y61.k com.avito.android.publish.slots.iac_devices.c cVar, @Y61.k g gVar2, @Y61.k com.avito.android.publish.slots.promoblock.c cVar2, @Y61.k com.avito.android.publish.slots.accordion.k kVar, @Y61.k com.avito.android.publish.slots.imv.l lVar2, @Y61.k com.avito.android.publish.slots.parameters_suggest.g gVar3, @Y61.k com.avito.android.publish.slots.delivery_summary.m mVar2, @Y61.k com.avito.android.publish.slots.delivery_summary_edit.q qVar, @Y61.k com.avito.android.publish.slots.delivery_subsidies.b bVar, @Y61.k com.avito.android.publish.slots.delivery_seller.b bVar2, @Y61.k InterfaceC40101b interfaceC40101b, @Y61.k com.avito.android.publish.slots.information_with_user_id.b bVar3, @Y61.k com.avito.android.publish.slots.images_groups.c cVar3, @Y61.k com.avito.android.publish.slots.images_groups_recommendations.m mVar3, @Y61.k com.avito.android.publish.slots.salary_range.f fVar, @Y61.k Re0.b bVar4, @Y61.k gf0.d dVar, @Y61.k com.avito.android.publish.slots.delivery_return_policy_block.b bVar5, @Y61.k m mVar4, @Y61.k InterfaceC42369b interfaceC42369b, @Y61.k com.avito.android.publish.slots.address_from_profile.A a12, @Y61.k InterfaceC40412b interfaceC40412b, @Y61.k com.avito.android.publish.slots.delivery_all_toggles.d dVar2, @Y61.k com.avito.android.publish.slots.job_premoderation.b bVar6, @Y61.k com.avito.android.publish.slots.job_warning_toast.b bVar7, @Y61.k InterfaceC42683b interfaceC42683b, @Y61.k s sVar, @Y61.k com.avito.android.publish.slots.final_state_suggest.b bVar8, @Y61.k com.avito.android.publish.slots.universal_beduin.j jVar2, @Y61.k InterfaceC16996b interfaceC16996b, @Y61.k com.avito.android.publish.slots.sleeping_places.f fVar2, @Y61.k Ue0.c cVar4, @Y61.k com.avito.android.publish.slots.item_info.f fVar3, @Y61.k Te0.c cVar5, @Y61.k com.avito.android.publish.slots.group_inlined_block.n nVar, @Y61.k com.avito.android.publish.slots.check_verification.d dVar3, @Y61.k com.avito.android.publish.slots.cv_upload.b bVar9, @Y61.k Ve0.d dVar4, @Y61.k com.avito.android.publish.slots.delivery_addresses.n nVar2, @Y61.k InterfaceC50240c interfaceC50240c, @Y61.k com.avito.android.publish.slots.advantage_banners.g gVar4, @Y61.k com.avito.android.publish.slots.generate_text_buttons.j jVar3, @Y61.k com.avito.android.publish.slots.images_enhancement.f fVar4, @Y61.k InterfaceC34122b interfaceC34122b, @Y61.k InterfaceC49930a interfaceC49930a, @Y61.k com.avito.android.publish.slots.regnum_suggest.b bVar10, @Y61.k Q1 q12, @Y61.k C33771m1 c33771m1, @Y61.k Map<Class<? extends Slot<?>>, x<?, ?>> map) {
        this.f245224a = interfaceC48661b;
        this.f245226b = mVar;
        this.f245228c = jVar;
        this.f245229d = gVar;
        this.f245230e = lVar;
        this.f245231f = cVar;
        this.f245232g = gVar2;
        this.f245233h = cVar2;
        this.f245234i = kVar;
        this.f245235j = lVar2;
        this.f245236k = gVar3;
        this.f245237l = mVar2;
        this.f245238m = qVar;
        this.f245239n = bVar;
        this.f245240o = bVar2;
        this.f245241p = interfaceC40101b;
        this.f245242q = bVar3;
        this.f245243r = cVar3;
        this.f245244s = mVar3;
        this.f245245t = fVar;
        this.f245246u = bVar4;
        this.f245247v = dVar;
        this.f245248w = bVar5;
        this.f245249x = mVar4;
        this.f245250y = interfaceC42369b;
        this.f245251z = a12;
        this.f245198A = interfaceC40412b;
        this.f245199B = dVar2;
        this.f245200C = bVar6;
        this.f245201D = bVar7;
        this.f245202E = interfaceC42683b;
        this.f245203F = sVar;
        this.f245204G = bVar8;
        this.f245205H = jVar2;
        this.f245206I = interfaceC16996b;
        this.f245207J = fVar2;
        this.f245208K = cVar4;
        this.f245209L = fVar3;
        this.f245210M = cVar5;
        this.f245211N = nVar;
        this.f245212O = dVar3;
        this.f245213P = bVar9;
        this.f245214Q = dVar4;
        this.f245215R = nVar2;
        this.f245216S = interfaceC50240c;
        this.f245217T = gVar4;
        this.f245218U = jVar3;
        this.f245219V = fVar4;
        this.f245220W = interfaceC34122b;
        this.f245221X = interfaceC49930a;
        this.f245222Y = bVar10;
        this.f245223Z = q12;
        this.f245225a0 = c33771m1;
        this.f245227b0 = map;
    }

    @Override // com.avito.android.publish.slots.y
    @Y61.k
    public final Set<com.avito.android.category_parameters.j<? extends Slot<?>>> a(@Y61.k ParametersTree parametersTree) {
        return C43033p.F(new o0(C43033p.i(new C42770s0(parametersTree), a.f245252l), new b(1, this, z.class, "createWrapperFromFactory", "createWrapperFromFactory(Lcom/avito/android/remote/model/category_parameters/slot/Slot;)Lcom/avito/android/category_parameters/SlotWrapper;", 0)));
    }
}
