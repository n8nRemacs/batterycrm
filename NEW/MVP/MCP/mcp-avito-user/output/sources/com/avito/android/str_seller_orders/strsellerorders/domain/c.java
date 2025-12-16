package com.avito.android.str_seller_orders.strsellerorders.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ImportantToNoteBlockInfo;
import com.avito.android.remote.model.StrOrdersListBody;
import com.avito.android.remote.model.StrOrdersListSectionBody;
import com.avito.android.remote.model.StrSellerOrder;
import com.avito.android.remote.model.StrSellerOrdersBuyerInfo;
import com.avito.android.remote.model.StrSellerOrdersEstateInfo;
import com.avito.android.remote.model.StrSellerOrdersImportantToNote;
import com.avito.android.remote.model.StrSellerOrdersListPageInfo;
import com.avito.android.remote.model.StrSellerOrdersListResponse;
import com.avito.android.remote.model.StrSellerOrdersListSection;
import com.avito.android.remote.model.StrSellerOrdersScreenWidget;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_seller_orders.generated.api.api_2_str_seller_orders_list_post.BookingButtonV3;
import ez0.InterfaceC40183a;
import hz0.C41197a;
import hz0.C41198b;
import hz0.C41199c;
import hz0.C41200d;
import hz0.e;
import hz0.f;
import hz0.g;
import hz0.h;
import hz0.i;
import hz0.j;
import hz0.m;
import hz0.n;
import hz0.o;
import hz0.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import wz0.C49707a;
import wz0.C49708b;

/* compiled from: StrSellerOrdersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrSellerOrdersListResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.domain.StrSellerOrdersInteractorImpl$makePostSellerOrdersListRequest$2", f = "StrSellerOrdersInteractor.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<StrSellerOrdersListResponse>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289807q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrOrdersListBody f289808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f289809s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(StrOrdersListBody strOrdersListBody, b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f289808r = strOrdersListBody;
        this.f289809s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f289808r, this.f289809s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<StrSellerOrdersListResponse>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objC;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote;
        ArrayList arrayList;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote2;
        ArrayList arrayList2;
        StrSellerOrdersListPageInfo strSellerOrdersListPageInfo;
        Iterator it;
        ArrayList arrayList3;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote3;
        ArrayList arrayList4;
        StrSellerOrdersListSection strSellerOrdersListSection;
        Iterator it2;
        StrSellerOrdersEstateInfo strSellerOrdersEstateInfo;
        Iterator it3;
        ArrayList arrayList5;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote4;
        ArrayList arrayList6;
        Iterator it4;
        Iterator it5;
        ArrayList arrayList7;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote5;
        ButtonAction buttonAction;
        Map mapG;
        Prompt prompt;
        Map mapSingletonMap;
        ArrayList arrayList8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289807q;
        SuggestAnalyticsEvent suggestAnalyticsEvent = null;
        if (i12 == 0) {
            C42729a0.b(obj);
            C49707a.f441897a.getClass();
            List<StrOrdersListSectionBody> sections = this.f289808r.getSections();
            ArrayList arrayList9 = new ArrayList(C42745f0.q(sections, 10));
            for (StrOrdersListSectionBody strOrdersListSectionBody : sections) {
                C49707a.f441897a.getClass();
                arrayList9.add(new j(strOrdersListSectionBody.getId(), new i(null, strOrdersListSectionBody.getPageInfo().getPageNumber() != null ? Long.valueOf(r7.intValue()) : null)));
            }
            h hVar = new h(arrayList9);
            InterfaceC40183a interfaceC40183a = this.f289809s.f289780b;
            this.f289807q = 1;
            objC = interfaceC40183a.c(hVar, this);
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
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C41197a c41197a = (C41197a) ((TypedResult.Success) typedResult).getResult();
        C49708b.f441898a.getClass();
        String title = c41197a.getTitle();
        String header = c41197a.getHeader();
        DeepLink onboardingDeeplink = c41197a.getOnboardingDeeplink();
        C41199c importantToNote = c41197a.getImportantToNote();
        if (importantToNote != null) {
            String blockTitle = importantToNote.getBlockTitle();
            List<C41200d> listA = importantToNote.a();
            if (listA != null) {
                List<C41200d> list = listA;
                arrayList8 = new ArrayList(C42745f0.q(list, 10));
                for (C41200d c41200d : list) {
                    String id2 = c41200d.getId();
                    AttributedText title2 = c41200d.getTitle();
                    AttributedText subtitle = c41200d.getSubtitle();
                    AttributedText bottomSheetTitle = c41200d.getBottomSheetTitle();
                    String iconName = c41200d.getIconName();
                    hz0.p clickstream = c41200d.getClickstream();
                    arrayList8.add(new ImportantToNoteBlockInfo(id2, title2, subtitle, bottomSheetTitle, iconName, clickstream != null ? C49708b.a(clickstream) : suggestAnalyticsEvent));
                    suggestAnalyticsEvent = null;
                }
            } else {
                arrayList8 = null;
            }
            strSellerOrdersImportantToNote = new StrSellerOrdersImportantToNote(blockTitle, arrayList8);
        } else {
            strSellerOrdersImportantToNote = null;
        }
        List<g> listF = c41197a.f();
        ArrayList arrayList10 = new ArrayList(C42745f0.q(listF, 10));
        for (g gVar : listF) {
            arrayList10.add(new StrSellerOrdersScreenWidget(gVar.getType(), gVar.getTitle(), gVar.getSubtitle(), gVar.getDeeplink()));
        }
        List<e> listD = c41197a.d();
        if (listD != null) {
            ArrayList arrayList11 = new ArrayList();
            Iterator it6 = listD.iterator();
            while (it6.hasNext()) {
                e eVar = (e) it6.next();
                if (eVar.getId() == null) {
                    it = it6;
                    arrayList3 = arrayList10;
                    strSellerOrdersImportantToNote3 = strSellerOrdersImportantToNote;
                    strSellerOrdersListSection = null;
                } else {
                    String id3 = eVar.getId();
                    String title3 = eVar.getTitle();
                    f pageInfo = eVar.getPageInfo();
                    if (pageInfo != null) {
                        Long pageNumber = pageInfo.getPageNumber();
                        strSellerOrdersListPageInfo = new StrSellerOrdersListPageInfo(pageNumber != null ? Integer.valueOf((int) pageNumber.longValue()) : null, pageInfo.getHasMore());
                    } else {
                        strSellerOrdersListPageInfo = null;
                    }
                    List<C41198b> listB = eVar.b();
                    if (listB != null) {
                        List<C41198b> list2 = listB;
                        ArrayList arrayList12 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            C41198b c41198b = (C41198b) it7.next();
                            String bookingId = c41198b.getBookingId();
                            String str = bookingId == null ? "" : bookingId;
                            String title4 = c41198b.getTitle();
                            String str2 = title4 == null ? "" : title4;
                            String subtitle2 = c41198b.getSubtitle();
                            Boolean hasAction = c41198b.getHasAction();
                            DeepLink deeplink = c41198b.getDeeplink();
                            Boolean active = c41198b.getActive();
                            o buyerInfo = c41198b.getBuyerInfo();
                            StrSellerOrdersBuyerInfo strSellerOrdersBuyerInfo = buyerInfo != null ? new StrSellerOrdersBuyerInfo(buyerInfo.getPicUrl(), buyerInfo.getName(), buyerInfo.getReview()) : null;
                            r estateInfo = c41198b.getEstateInfo();
                            if (estateInfo != null) {
                                it2 = it6;
                                strSellerOrdersEstateInfo = new StrSellerOrdersEstateInfo(estateInfo.getPicUrl(), estateInfo.getTitle(), estateInfo.getAddress(), estateInfo.getDescription());
                            } else {
                                it2 = it6;
                                strSellerOrdersEstateInfo = null;
                            }
                            List<BookingButtonV3> listC = c41198b.c();
                            if (listC != null) {
                                List<BookingButtonV3> list3 = listC;
                                ArrayList arrayList13 = new ArrayList(C42745f0.q(list3, 10));
                                Iterator it8 = list3.iterator();
                                while (it8.hasNext()) {
                                    BookingButtonV3 bookingButtonV3 = (BookingButtonV3) it8.next();
                                    String title5 = bookingButtonV3.getTitle();
                                    BookingButtonV3.Preset preset = bookingButtonV3.getPreset();
                                    String str3 = preset != null ? preset.f288800b : null;
                                    m action = bookingButtonV3.getAction();
                                    if (action != null) {
                                        n content = action.getContent();
                                        it4 = it8;
                                        if (content != null) {
                                            it5 = it7;
                                            strSellerOrdersImportantToNote5 = strSellerOrdersImportantToNote;
                                            arrayList7 = arrayList10;
                                            mapG = P0.g(new Q("action", content.getAction()), new Q("orderID", content.getOrderID()));
                                        } else {
                                            it5 = it7;
                                            arrayList7 = arrayList10;
                                            strSellerOrdersImportantToNote5 = strSellerOrdersImportantToNote;
                                            mapG = null;
                                        }
                                        hz0.k prompt2 = action.getPrompt();
                                        if (prompt2 != null) {
                                            String approve = prompt2.getApprove();
                                            String cancel = prompt2.getCancel();
                                            String header2 = prompt2.getHeader();
                                            AttributedText description = prompt2.getDescription();
                                            hz0.l analytics = prompt2.getAnalytics();
                                            if (analytics != null) {
                                                hz0.p approve2 = analytics.getApprove();
                                                mapSingletonMap = Collections.singletonMap("approve", approve2 != null ? C49708b.a(approve2) : null);
                                            } else {
                                                mapSingletonMap = null;
                                            }
                                            prompt = new Prompt(approve, cancel, header2, description, mapSingletonMap);
                                        } else {
                                            prompt = null;
                                        }
                                        buttonAction = new ButtonAction(mapG, action.getUrl(), prompt, action.getRedirect(), null);
                                    } else {
                                        it4 = it8;
                                        it5 = it7;
                                        arrayList7 = arrayList10;
                                        strSellerOrdersImportantToNote5 = strSellerOrdersImportantToNote;
                                        buttonAction = null;
                                    }
                                    hz0.p clickstream2 = bookingButtonV3.getClickstream();
                                    arrayList13.add(new Button(title5, str3, buttonAction, clickstream2 != null ? C49708b.a(clickstream2) : null));
                                    it8 = it4;
                                    it7 = it5;
                                    strSellerOrdersImportantToNote = strSellerOrdersImportantToNote5;
                                    arrayList10 = arrayList7;
                                }
                                it3 = it7;
                                arrayList5 = arrayList10;
                                strSellerOrdersImportantToNote4 = strSellerOrdersImportantToNote;
                                arrayList6 = arrayList13;
                            } else {
                                it3 = it7;
                                arrayList5 = arrayList10;
                                strSellerOrdersImportantToNote4 = strSellerOrdersImportantToNote;
                                arrayList6 = null;
                            }
                            arrayList12.add(new StrSellerOrder(str, str2, subtitle2, hasAction, deeplink, active, strSellerOrdersBuyerInfo, strSellerOrdersEstateInfo, arrayList6));
                            it6 = it2;
                            it7 = it3;
                            strSellerOrdersImportantToNote = strSellerOrdersImportantToNote4;
                            arrayList10 = arrayList5;
                        }
                        it = it6;
                        arrayList3 = arrayList10;
                        strSellerOrdersImportantToNote3 = strSellerOrdersImportantToNote;
                        arrayList4 = arrayList12;
                    } else {
                        it = it6;
                        arrayList3 = arrayList10;
                        strSellerOrdersImportantToNote3 = strSellerOrdersImportantToNote;
                        arrayList4 = null;
                    }
                    strSellerOrdersListSection = new StrSellerOrdersListSection(id3, title3, null, strSellerOrdersListPageInfo, arrayList4);
                }
                if (strSellerOrdersListSection != null) {
                    arrayList11.add(strSellerOrdersListSection);
                }
                it6 = it;
                strSellerOrdersImportantToNote = strSellerOrdersImportantToNote3;
                arrayList10 = arrayList3;
            }
            arrayList = arrayList10;
            strSellerOrdersImportantToNote2 = strSellerOrdersImportantToNote;
            arrayList2 = arrayList11;
        } else {
            arrayList = arrayList10;
            strSellerOrdersImportantToNote2 = strSellerOrdersImportantToNote;
            arrayList2 = null;
        }
        return new TypedResult.Success(new StrSellerOrdersListResponse(title, header, onboardingDeeplink, arrayList2, arrayList, strSellerOrdersImportantToNote2));
    }
}
