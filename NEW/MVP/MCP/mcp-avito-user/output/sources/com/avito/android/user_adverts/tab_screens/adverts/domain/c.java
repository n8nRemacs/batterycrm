package com.avito.android.user_adverts.tab_screens.adverts.domain;

import Wl0.InterfaceC15774a;
import Y41.p;
import Y61.k;
import Y61.l;
import Yl0.C18277C;
import Yl0.C18280c;
import Yl0.C18282e;
import Yl0.C18283f;
import Yl0.C18287j;
import Yl0.C18288k;
import Yl0.C18291n;
import Yl0.C18292o;
import Yl0.C18294q;
import Yl0.C18295s;
import Yl0.C18297u;
import Yl0.D;
import Yl0.E;
import Yl0.F;
import Yl0.G;
import Yl0.H;
import Yl0.I;
import Yl0.InterfaceC18289l;
import Yl0.J;
import Yl0.K;
import Yl0.L;
import Yl0.M;
import Yl0.N;
import Yl0.O;
import Yl0.P;
import Yl0.Q;
import Yl0.S;
import Yl0.U;
import Yl0.r;
import Yl0.w;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertCpxPromo;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertItemRightActionV2;
import com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13.UserAdvertStatus;
import com.avito.android.user_adverts.tab_screens.adverts.domain.f;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertsListNextPageDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.DisclaimerItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.google.gson.Gson;
import eJ0.C40014a;
import eJ0.C40016c;
import eJ0.InterfaceC40015b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsListInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LeJ0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)LeJ0/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.domain.UserAdvertsListInteractorImpl$invoke$2", f = "UserAdvertsListInteractor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super C40016c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314968q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f314969r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f314970s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40014a f314971t;

    /* compiled from: UserAdvertsListInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LeJ0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LeJ0/b;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.domain.UserAdvertsListInteractorImpl$invoke$2$listResult$1", f = "UserAdvertsListInteractor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super InterfaceC40015b>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314972q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f314973r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40014a f314974s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, C40014a c40014a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f314973r = bVar;
            this.f314974s = c40014a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f314973r, this.f314974s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InterfaceC40015b> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object objC;
            UserAdvertActionsInfoDomain userAdvertActionsInfoDomain;
            UserAdvertItemDomain.Video video;
            UserAdvertItemDomain.Stats stats;
            ArrayList arrayList;
            UserAdvertItemDomain.Status status;
            UserAdvertItemDomain.PriceBadge priceBadge;
            Iterator it;
            UserAdvertItemDomain.RealtyOwnerBadge realtyOwnerBadge;
            UserAdvertItemDomain.ContactsBbl contactsBbl;
            UserAdvertItemDomain.LinkedAdvertisementsInfo linkedAdvertisementsInfo;
            UserAdvertItemDomain.RightAction rightAction;
            boolean z12;
            UserAdvertItemDomain.CpxPromoWidget cpxPromoWidget;
            Object userAdvertItemDomain;
            UserAdvertItemDomain.CpxPromoWidget.Color color;
            UserAdvertItemDomain.RightAction more;
            UserAdvertItemDomain.RightAction.Button.Style style;
            UserAdvertItemDomain.RealtyOwnerBadge.Tooltip tooltip;
            UserAdvertItemDomain.RealtyOwnerBadge.Button button;
            J button2;
            UniversalColor universalColor;
            UniversalColor universalColor2;
            Image videoImages;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314972q;
            boolean z13 = true;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = this.f314973r;
                InterfaceC15774a interfaceC15774a = bVar.f314963a.get();
                C40014a c40014a = this.f314974s;
                String str = c40014a.f395094b;
                if (str == null || C43066x.K(str)) {
                    str = null;
                }
                Boolean bool = c40014a.f395096d;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                String string = numValueOf != null ? numValueOf.toString() : null;
                Map<String, Object> map = c40014a.f395099g;
                String strL = (map == null || map.isEmpty()) ? null : ((Gson) bVar.f314966d.getValue()).l(map);
                Boolean boolBoxBoolean = Boxing.boxBoolean(c40014a.f395100h);
                this.f314972q = 1;
                objC = interfaceC15774a.c(c40014a.f395093a, str, string, null, c40014a.f395098f, strL, c40014a.f395097e, boolBoxBoolean, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                return new InterfaceC40015b.a(error.getError(), error.getCause());
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            C18288k c18288k = (C18288k) ((TypedResult.Success) typedResult).getResult();
            String nextPageOffset = c18288k.getNextPageOffset();
            UserAdvertsListNextPageDomain byOffset = (nextPageOffset == null || nextPageOffset.length() == 0) ? UserAdvertsListNextPageDomain.Empty.f315013b : new UserAdvertsListNextPageDomain.ByOffset(nextPageOffset);
            Long totalCount = c18288k.getTotalCount();
            Integer numValueOf2 = totalCount != null ? Integer.valueOf((int) totalCount.longValue()) : null;
            C18282e actionsInfo = c18288k.getActionsInfo();
            if (actionsInfo != null) {
                C18283f limitInfo = actionsInfo.getLimitInfo();
                UserAdvertActionsInfoDomain.Limit limit = new UserAdvertActionsInfoDomain.Limit(limitInfo.getTitle(), (int) limitInfo.getLimit());
                UserAdvertActionsInfoDomain.Config configC = f.c(actionsInfo.getDelete());
                UserAdvertActionsInfoDomain.Config configC2 = f.c(actionsInfo.getActivate());
                UserAdvertActionsInfoDomain.Config configC3 = f.c(actionsInfo.getClose());
                UserAdvertActionsInfoDomain.Config configC4 = f.c(actionsInfo.getRestore());
                C18280c copy = actionsInfo.getCopy();
                userAdvertActionsInfoDomain = new UserAdvertActionsInfoDomain(limit, configC, configC2, configC3, configC4, copy != null ? f.c(copy) : null);
            } else {
                userAdvertActionsInfoDomain = null;
            }
            List<InterfaceC18289l> listB = c18288k.b();
            int i13 = 10;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listB, 10));
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                InterfaceC18289l interfaceC18289l = (InterfaceC18289l) it2.next();
                if (interfaceC18289l instanceof InterfaceC18289l.a) {
                    userAdvertItemDomain = new DisclaimerItemDomain(((InterfaceC18289l.a) interfaceC18289l).getText());
                    it = it2;
                    z12 = z13;
                } else {
                    if (!(interfaceC18289l instanceof InterfaceC18289l.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC18289l.b bVar2 = (InterfaceC18289l.b) interfaceC18289l;
                    long id2 = bVar2.getId();
                    String title = bVar2.getTitle();
                    C18297u images = bVar2.getImages();
                    UserAdvertItemDomain.AdvertImage advertImage = images != null ? new UserAdvertItemDomain.AdvertImage((int) images.getCount(), images.getMain()) : null;
                    Yl0.T video2 = bVar2.getVideo();
                    if (video2 != null) {
                        String videoUrl = video2.getVideoUrl();
                        video = (videoUrl == null || (videoImages = video2.getVideoImages()) == null) ? null : new UserAdvertItemDomain.Video(Uri.parse(videoUrl), videoImages);
                    } else {
                        video = null;
                    }
                    String price = bVar2.getPrice();
                    AttributedText saleInfo = bVar2.getSaleInfo();
                    String shortcut = bVar2.getShortcut();
                    N stats2 = bVar2.getStats();
                    if (stats2 != null) {
                        U contacts = stats2.getContacts();
                        UserAdvertItemDomain.Stats.Counters countersD = contacts != null ? f.d(contacts) : null;
                        U views = stats2.getViews();
                        UserAdvertItemDomain.Stats.Counters countersD2 = views != null ? f.d(views) : null;
                        U favorites = stats2.getFavorites();
                        UserAdvertItemDomain.Stats.Counters countersD3 = favorites != null ? f.d(favorites) : null;
                        O viewsToContactsConversion = stats2.getViewsToContactsConversion();
                        stats = new UserAdvertItemDomain.Stats(countersD2, countersD3, countersD, viewsToContactsConversion != null ? viewsToContactsConversion.getTotalPercent() : null);
                    } else {
                        stats = null;
                    }
                    P tip = bVar2.getTip();
                    UserAdvertItemDomain.Tip tip2 = tip != null ? new UserAdvertItemDomain.Tip(tip.getTitle(), tip.getDeeplink()) : null;
                    List<L> listZ = bVar2.z();
                    if (listZ != null) {
                        List<L> list = listZ;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(list, i13));
                        for (L l12 : list) {
                            arrayList3.add(new UserAdvertItemDomain.ServiceIcon(l12.getId(), l12.getIcon()));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    Q ttl = bVar2.getTtl();
                    UserAdvertItemDomain.TimeToLive timeToLive = ttl != null ? new UserAdvertItemDomain.TimeToLive(ttl.getDescription()) : null;
                    String declineReason = bVar2.getDeclineReason();
                    String reservationInfo = bVar2.getReservationInfo();
                    G realtyLeadgen = bVar2.getRealtyLeadgen();
                    UserAdvertItemDomain.RealtyLeadgen realtyLeadgen2 = realtyLeadgen != null ? new UserAdvertItemDomain.RealtyLeadgen(realtyLeadgen.getText(), f.b(realtyLeadgen.getTextColor())) : null;
                    Boolean isModerated = bVar2.getIsModerated();
                    boolean zBooleanValue = isModerated != null ? isModerated.booleanValue() : false;
                    DeepLink uri = bVar2.getUri();
                    Boolean delivery = bVar2.getDelivery();
                    boolean zBooleanValue2 = delivery != null ? delivery.booleanValue() : false;
                    UserAdvertStatus status2 = bVar2.getStatus();
                    if (status2 == null) {
                        status = null;
                    } else {
                        if (f.a.f314981a[status2.getType().ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        status = new UserAdvertItemDomain.Status(UserAdvertItemDomain.Status.Type.f315134b, status2.getDescription());
                    }
                    String shortcutTitle = bVar2.getShortcutTitle();
                    F priceBadge2 = bVar2.getPriceBadge();
                    if (priceBadge2 != null) {
                        String title2 = priceBadge2.getTitle();
                        C18287j titleColor = priceBadge2.getTitleColor();
                        if (titleColor != null) {
                            String value = titleColor.getValue();
                            Color colorA = value != null ? f.a(value) : null;
                            String valueDark = titleColor.getValueDark();
                            universalColor = new UniversalColor(titleColor.getValueName(), valueDark != null ? f.a(valueDark) : null, colorA);
                        } else {
                            universalColor = null;
                        }
                        C18287j backgroundColor = priceBadge2.getBackgroundColor();
                        if (backgroundColor != null) {
                            String value2 = backgroundColor.getValue();
                            Color colorA2 = value2 != null ? f.a(value2) : null;
                            String valueDark2 = backgroundColor.getValueDark();
                            universalColor2 = new UniversalColor(backgroundColor.getValueName(), valueDark2 != null ? f.a(valueDark2) : null, colorA2);
                        } else {
                            universalColor2 = null;
                        }
                        priceBadge = new UserAdvertItemDomain.PriceBadge(title2, universalColor, universalColor2);
                    } else {
                        priceBadge = null;
                    }
                    H realtyOwnerBadge2 = bVar2.getRealtyOwnerBadge();
                    if (realtyOwnerBadge2 != null) {
                        String text = realtyOwnerBadge2.getText();
                        String textColor = realtyOwnerBadge2.getTextColor();
                        String backgroundColor2 = realtyOwnerBadge2.getBackgroundColor();
                        I tooltip2 = realtyOwnerBadge2.getTooltip();
                        if (tooltip2 != null) {
                            String text2 = tooltip2.getText();
                            String title3 = tooltip2.getTitle();
                            I tooltip3 = realtyOwnerBadge2.getTooltip();
                            if (tooltip3 == null || (button2 = tooltip3.getButton()) == null) {
                                it = it2;
                                button = null;
                            } else {
                                it = it2;
                                button = new UserAdvertItemDomain.RealtyOwnerBadge.Button(button2.getText(), button2.getUri());
                            }
                            tooltip = new UserAdvertItemDomain.RealtyOwnerBadge.Tooltip(title3, text2, button);
                        } else {
                            it = it2;
                            tooltip = null;
                        }
                        realtyOwnerBadge = new UserAdvertItemDomain.RealtyOwnerBadge(text, textColor, backgroundColor2, tooltip);
                    } else {
                        it = it2;
                        realtyOwnerBadge = null;
                    }
                    C18295s fashionAuthentication = bVar2.getFashionAuthentication();
                    UserAdvertItemDomain.FashionBadge fashionBadge = fashionAuthentication != null ? new UserAdvertItemDomain.FashionBadge(fashionAuthentication.getText(), fashionAuthentication.getTextColor(), fashionAuthentication.getBackgroundColor()) : null;
                    Boolean isAutoPublishOn = bVar2.getIsAutoPublishOn();
                    boolean zBooleanValue3 = isAutoPublishOn != null ? isAutoPublishOn.booleanValue() : false;
                    S verification = bVar2.getVerification();
                    UserAdvertItemDomain.VerificationStatus verificationStatus = verification != null ? new UserAdvertItemDomain.VerificationStatus(verification.getStatusText(), verification.getStatusTextColor()) : null;
                    C18277C liquidityStatus = bVar2.getLiquidityStatus();
                    UserAdvertItemDomain.LiquidityStatus liquidityStatus2 = liquidityStatus != null ? new UserAdvertItemDomain.LiquidityStatus(liquidityStatus.getStatusText(), liquidityStatus.getStatusTextColor(), liquidityStatus.getDeeplink(), liquidityStatus.getFinishTime()) : null;
                    List<String> listB2 = bVar2.b();
                    String availableStocks = bVar2.getAvailableStocks();
                    DeepLink editDeeplink = bVar2.getEditDeeplink();
                    String fillParameters = bVar2.getFillParameters();
                    String location = bVar2.getLocation();
                    C18292o addressesAdditionalInfo = bVar2.getAddressesAdditionalInfo();
                    UserAdvertItemDomain.AddressesAdditionalInfo addressesAdditionalInfo2 = addressesAdditionalInfo != null ? new UserAdvertItemDomain.AddressesAdditionalInfo(addressesAdditionalInfo.getDelimiter(), addressesAdditionalInfo.getContent()) : null;
                    C18294q contactsBbl2 = bVar2.getContactsBbl();
                    if (contactsBbl2 != null) {
                        String title4 = contactsBbl2.getTitle();
                        String titleColor2 = contactsBbl2.getTitleColor();
                        r progressbar = contactsBbl2.getProgressbar();
                        contactsBbl = new UserAdvertItemDomain.ContactsBbl(title4, titleColor2, progressbar != null ? new UserAdvertItemDomain.ContactsBbl.Progressbar((float) progressbar.getPercentage(), f.b(progressbar.getColor()), f.b(progressbar.getColorBackground())) : null);
                    } else {
                        contactsBbl = null;
                    }
                    w vacancyRostrudStatus = bVar2.getVacancyRostrudStatus();
                    UserAdvertItemDomain.VacancyRostrud vacancyRostrud = vacancyRostrudStatus != null ? new UserAdvertItemDomain.VacancyRostrud(vacancyRostrudStatus.getStatus(), vacancyRostrudStatus.getStatusTitle()) : null;
                    D multiItemsInfo = bVar2.getMultiItemsInfo();
                    if (multiItemsInfo != null) {
                        String title5 = multiItemsInfo.getTitle();
                        String count = multiItemsInfo.getCount();
                        DeepLink deeplink = multiItemsInfo.getDeeplink();
                        E onboarding = multiItemsInfo.getOnboarding();
                        linkedAdvertisementsInfo = new UserAdvertItemDomain.LinkedAdvertisementsInfo(title5, count, deeplink, onboarding != null ? new UserAdvertItemDomain.LinkedAdvertisementsInfo.Onboarding(onboarding.getTitle(), onboarding.getSubtitle(), multiItemsInfo.getDeeplink()) : null, multiItemsInfo.getCopyDeeplink());
                    } else {
                        linkedAdvertisementsInfo = null;
                    }
                    C18291n actionButton = bVar2.getActionButton();
                    UserAdvertItemDomain.ActionButton actionButton2 = actionButton != null ? new UserAdvertItemDomain.ActionButton(actionButton.getTitle(), actionButton.getUri()) : null;
                    K searchPosition = bVar2.getSearchPosition();
                    UserAdvertItemDomain.SearchPosition searchPosition2 = searchPosition != null ? new UserAdvertItemDomain.SearchPosition(searchPosition.getBlinking(), searchPosition.getText(), searchPosition.getUri()) : null;
                    String deliveryAlertText = bVar2.getDeliveryAlertText();
                    UserAdvertItemRightActionV2 rightActionV2 = bVar2.getRightActionV2();
                    if (rightActionV2 != null) {
                        if (rightActionV2 instanceof UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button) {
                            UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button userAdvertItemRightActionV2Button = (UserAdvertItemRightActionV2.UserAdvertItemRightActionV2Button) rightActionV2;
                            String title6 = userAdvertItemRightActionV2Button.getTitle();
                            DeepLink uri2 = userAdvertItemRightActionV2Button.getUri();
                            int i14 = f.a.f314983c[userAdvertItemRightActionV2Button.getStyle().ordinal()];
                            if (i14 == 1) {
                                style = UserAdvertItemDomain.RightAction.Button.Style.f315111b;
                            } else {
                                if (i14 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                style = UserAdvertItemDomain.RightAction.Button.Style.f315112c;
                            }
                            more = new UserAdvertItemDomain.RightAction.Button(title6, uri2, style, userAdvertItemRightActionV2Button.getSlug());
                        } else if (rightActionV2 instanceof UserAdvertItemRightActionV2.a) {
                            UserAdvertItemRightActionV2.a aVar = (UserAdvertItemRightActionV2.a) rightActionV2;
                            more = new UserAdvertItemDomain.RightAction.Icon(aVar.getName(), aVar.getUri(), aVar.getSlug());
                        } else {
                            if (!(rightActionV2 instanceof UserAdvertItemRightActionV2.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UserAdvertItemRightActionV2.b bVar3 = (UserAdvertItemRightActionV2.b) rightActionV2;
                            more = new UserAdvertItemDomain.RightAction.More(bVar3.getName(), bVar3.getSlug());
                        }
                        rightAction = more;
                    } else {
                        rightAction = null;
                    }
                    M space = bVar2.getSpace();
                    UserAdvertItemDomain.Space space2 = space != null ? new UserAdvertItemDomain.Space(space.getBadge()) : null;
                    UserAdvertCpxPromo cpxPromo = bVar2.getCpxPromo();
                    if (cpxPromo != null) {
                        Image icon = cpxPromo.getIcon();
                        String text3 = cpxPromo.getText();
                        DeepLink uri3 = cpxPromo.getUri();
                        int i15 = f.a.f314982b[cpxPromo.getColor().ordinal()];
                        z12 = true;
                        if (i15 == 1) {
                            color = UserAdvertItemDomain.CpxPromoWidget.Color.f315072b;
                        } else if (i15 == 2) {
                            color = UserAdvertItemDomain.CpxPromoWidget.Color.f315075e;
                        } else if (i15 == 3) {
                            color = UserAdvertItemDomain.CpxPromoWidget.Color.f315074d;
                        } else {
                            if (i15 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            color = UserAdvertItemDomain.CpxPromoWidget.Color.f315073c;
                        }
                        cpxPromoWidget = new UserAdvertItemDomain.CpxPromoWidget(color, icon, text3, uri3);
                    } else {
                        z12 = true;
                        cpxPromoWidget = null;
                    }
                    userAdvertItemDomain = new UserAdvertItemDomain(id2, title, advertImage, video, price, saleInfo, shortcut, stats, tip2, arrayList, timeToLive, declineReason, reservationInfo, realtyLeadgen2, zBooleanValue, uri, Boolean.valueOf(zBooleanValue2), status, shortcutTitle, priceBadge, realtyOwnerBadge, fashionBadge, Boolean.valueOf(zBooleanValue3), verificationStatus, liquidityStatus2, listB2, availableStocks, editDeeplink, fillParameters, deliveryAlertText, location, addressesAdditionalInfo2, contactsBbl, vacancyRostrud, linkedAdvertisementsInfo, actionButton2, searchPosition2, rightAction, space2, cpxPromoWidget);
                }
                arrayList2.add(userAdvertItemDomain);
                z13 = z12;
                it2 = it;
                i13 = 10;
            }
            return new InterfaceC40015b.C11066b(arrayList2, byOffset, numValueOf2, userAdvertActionsInfoDomain);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, C40014a c40014a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f314970s = bVar;
        this.f314971t = c40014a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f314970s, this.f314971t, continuation);
        cVar.f314969r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C40016c> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314968q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43076a0 interfaceC43076a0B = C43259k.b((T) this.f314969r, null, new a(this.f314970s, this.f314971t, null), 3);
            this.f314968q = 1;
            obj = interfaceC43076a0B.F(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return new C40016c((InterfaceC40015b) obj);
    }
}
