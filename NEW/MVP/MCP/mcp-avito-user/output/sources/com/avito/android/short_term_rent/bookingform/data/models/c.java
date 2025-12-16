package com.avito.android.short_term_rent.bookingform.data.models;

import Y61.k;
import android.net.Uri;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.C34374q;
import com.avito.android.short_term_rent.bookingform.domain.models.items.BookingFormBlockItem;
import com.avito.android.short_term_rent.bookingform.items.toggle_v2.ToggleV2Options;
import com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get.BookingFormPageBlock;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import com.avito.android.travel_payment_methods.model.PaymentMethod;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jw0.C42435b;
import jw0.C42437d;
import jw0.C42438e;
import jw0.f;
import jw0.g;
import jw0.l;
import jw0.m;
import jw0.q;
import jw0.s;
import jw0.u;
import jw0.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormDtoBlocksToBlockItemsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/data/models/c;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.short_term_rent.utils.a f281227a;

    @Inject
    public c(@k com.avito.android.short_term_rent.utils.a aVar) {
        this.f281227a = aVar;
    }

    public static UniversalImage a(String str, String str2) {
        Uri uri;
        Uri uri2;
        try {
            return new UniversalImage((str2 == null || (uri2 = Uri.parse(str2)) == null) ? null : ImageKt.toImage(uri2), (str == null || (uri = Uri.parse(str)) == null) ? null : ImageKt.toImage(uri));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ParametrizedEvent c(l lVar) {
        Object bVar;
        Object bVar2;
        try {
            int i12 = Z.f406624c;
            Long id2 = lVar.getId();
            bVar = id2 != null ? Integer.valueOf((int) id2.longValue()) : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        Integer num = (Integer) bVar;
        if (num != null) {
            int iIntValue = num.intValue();
            try {
                bVar2 = Integer.valueOf((int) lVar.getVersion());
            } catch (Throwable th3) {
                int i14 = Z.f406624c;
                bVar2 = new Z.b(th3);
            }
            if (bVar2 instanceof Z.b) {
                bVar2 = null;
            }
            Integer num2 = (Integer) bVar2;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
                m parameters = lVar.getParameters();
                if (parameters != null) {
                    String actionType = parameters.getActionType();
                    if (actionType != null) {
                        dVar.put("action_type", actionType);
                    }
                    String from = parameters.getFrom();
                    if (from != null) {
                        dVar.put(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, from);
                    }
                    String fromPage = parameters.getFromPage();
                    if (fromPage != null) {
                        dVar.put("from_page", fromPage);
                    }
                    Long iid = parameters.getIid();
                    if (iid != null) {
                        dVar.put("iid", Long.valueOf(iid.longValue()));
                    }
                    String orderidString = parameters.getOrderidString();
                    if (orderidString != null) {
                        dVar.put("orderid_string", orderidString);
                    }
                    String source = parameters.getSource();
                    if (source != null) {
                        dVar.put(SearchParamsConverterKt.SOURCE, source);
                    }
                    String type = parameters.getType();
                    if (type != null) {
                        dVar.put("type", type);
                    }
                    Long uid = parameters.getUid();
                    if (uid != null) {
                        dVar.put("uid", Long.valueOf(uid.longValue()));
                    }
                }
                G0 g02 = G0.f406611a;
                return new ParametrizedEvent(iIntValue, iIntValue2, dVar.b());
            }
        }
        return null;
    }

    public static LoanTerm.Progress.ProgressBlock d(u uVar) {
        return new LoanTerm.Progress.ProgressBlock(uVar.getBlockWidth(), e(uVar.getDashColor()), uVar.getDashCount(), uVar.getDashSpacing(), uVar.getSubtitle(), uVar.getTextMarginTop(), uVar.getTitle());
    }

    public static UniversalColor e(v vVar) {
        Integer numA;
        new C34374q();
        Integer numA2 = C35787f0.a(vVar.getValue());
        Color color = null;
        Color color2 = numA2 != null ? new Color(numA2.intValue()) : null;
        String valueDark = vVar.getValueDark();
        if (valueDark != null && (numA = C35787f0.a(valueDark)) != null) {
            color = new Color(numA.intValue());
        }
        return new UniversalColor(vVar.getValueName(), color, color2);
    }

    @Y61.l
    public final BookingFormBlockItem b(@Y61.l BookingFormPageBlock bookingFormPageBlock) {
        List listU;
        l onClick;
        l onShow;
        BookingFormBlockItem infoBanner;
        BookingFormBlockItem refundToggle;
        if (bookingFormPageBlock instanceof BookingFormPageBlock.a) {
            BookingFormPageBlock.a aVar = (BookingFormPageBlock.a) bookingFormPageBlock;
            infoBanner = new BookingFormBlockItem.Badge(aVar.getId(), aVar.getTitle(), a(aVar.getDarkImageUrl(), aVar.getLightImageUrl()));
        } else if (bookingFormPageBlock instanceof BookingFormPageBlock.c) {
            BookingFormPageBlock.c cVar = (BookingFormPageBlock.c) bookingFormPageBlock;
            infoBanner = new BookingFormBlockItem.DottedText(cVar.getDeepLink(), cVar.getId(), cVar.getLeft(), cVar.getRight());
        } else if (bookingFormPageBlock instanceof BookingFormPageBlock.e) {
            BookingFormPageBlock.e eVar = (BookingFormPageBlock.e) bookingFormPageBlock;
            String id2 = eVar.getId();
            String value = eVar.getValue();
            String hint = eVar.getHint();
            Long maxLines = eVar.getMaxLines();
            Integer numValueOf = maxLines != null ? Integer.valueOf((int) maxLines.longValue()) : null;
            Long minLines = eVar.getMinLines();
            infoBanner = new BookingFormBlockItem.Input(id2, value, hint, eVar.getInputType(), eVar.getIsEnabled(), numValueOf, minLines != null ? Integer.valueOf((int) minLines.longValue()) : null);
        } else {
            if (!(bookingFormPageBlock instanceof BookingFormPageBlock.f)) {
                if (bookingFormPageBlock instanceof BookingFormPageBlock.l) {
                    BookingFormPageBlock.l lVar = (BookingFormPageBlock.l) bookingFormPageBlock;
                    refundToggle = new BookingFormBlockItem.Select(lVar.getDeepLink(), lVar.getId(), lVar.getValue(), lVar.getText(), lVar.getIsEnabled());
                } else if (bookingFormPageBlock instanceof BookingFormPageBlock.m) {
                    BookingFormPageBlock.m mVar = (BookingFormPageBlock.m) bookingFormPageBlock;
                    infoBanner = new BookingFormBlockItem.Spacing(mVar.getId(), (int) mVar.getHeight());
                } else if (bookingFormPageBlock instanceof BookingFormPageBlock.n) {
                    BookingFormPageBlock.n nVar = (BookingFormPageBlock.n) bookingFormPageBlock;
                    infoBanner = new BookingFormBlockItem.Text(nVar.getDeepLink(), nVar.getId(), nVar.getText());
                } else if (bookingFormPageBlock instanceof BookingFormPageBlock.o) {
                    BookingFormPageBlock.o oVar = (BookingFormPageBlock.o) bookingFormPageBlock;
                    String id3 = oVar.getId();
                    boolean needFormReload = oVar.getNeedFormReload();
                    Integer numA = com.avito.android.short_term_rent.bookingform.b.a(b.f281226l, oVar.c());
                    int iIntValue = numA != null ? numA.intValue() : 0;
                    List<f> listC = oVar.c();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
                    for (f fVar : listC) {
                        arrayList.add(new BookingFormBlockItem.Toggle.ToggleOption(fVar.getId(), fVar.getIsEnabled(), fVar.getIsSelected(), fVar.getText(), fVar.getValue()));
                    }
                    refundToggle = new BookingFormBlockItem.Toggle(id3, needFormReload, arrayList, iIntValue);
                } else if (bookingFormPageBlock instanceof BookingFormPageBlock.j) {
                    BookingFormPageBlock.j jVar = (BookingFormPageBlock.j) bookingFormPageBlock;
                    String id4 = jVar.getId();
                    String value2 = jVar.getValue();
                    boolean needFormReload2 = jVar.getNeedFormReload();
                    List<C42438e> listA = jVar.a();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
                    for (C42438e c42438e : listA) {
                        arrayList2.add(new BookingFormBlockItem.RefundToggle.RefundToggleButton(c42438e.getId(), c42438e.getText(), c42438e.getPriceWithDiscount(), c42438e.getDiscount(), c42438e.getTotalPrice(), c42438e.getTooltip()));
                    }
                    refundToggle = new BookingFormBlockItem.RefundToggle(id4, value2, arrayList2, needFormReload2);
                } else if (bookingFormPageBlock instanceof BookingFormPageBlock.h) {
                    BookingFormPageBlock.h hVar = (BookingFormPageBlock.h) bookingFormPageBlock;
                    String id5 = hVar.getId();
                    boolean needFormReload3 = hVar.getNeedFormReload();
                    List<q> listB = hVar.b();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, 10));
                    for (q qVar : listB) {
                        v color = qVar.getIcon().getColor();
                        PaymentMethod.PaymentMethodIcon paymentMethodIcon = new PaymentMethod.PaymentMethodIcon(color != null ? e(color) : null, qVar.getIcon().getName());
                        Boolean isNew = qVar.getIsNew();
                        boolean zBooleanValue = isNew != null ? isNew.booleanValue() : false;
                        Boolean isSelected = qVar.getIsSelected();
                        arrayList3.add(new PaymentMethod(paymentMethodIcon, zBooleanValue, isSelected != null ? isSelected.booleanValue() : false, qVar.getPaymentType(), qVar.getPlanId(), qVar.getSubtitle(), qVar.getTitle()));
                    }
                    infoBanner = new BookingFormBlockItem.PaymentMethods(id5, arrayList3, needFormReload3);
                } else {
                    if (!(bookingFormPageBlock instanceof BookingFormPageBlock.d)) {
                        if (bookingFormPageBlock instanceof BookingFormPageBlock.k) {
                            BookingFormPageBlock.k kVar = (BookingFormPageBlock.k) bookingFormPageBlock;
                            String id6 = kVar.getId();
                            List<C42435b> listA2 = kVar.a();
                            if (listA2 == null) {
                                listA2 = C42784z0.f406748b;
                            }
                            return new BookingFormBlockItem.RetroBadges(id6, this.f281227a.a(new a(1, this, c.class, "mapBadge", "mapBadge(Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BadgeV2;)Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItem;", 0), listA2));
                        }
                        if (bookingFormPageBlock instanceof BookingFormPageBlock.b) {
                            BookingFormPageBlock.b bVar = (BookingFormPageBlock.b) bookingFormPageBlock;
                            String id7 = bVar.getId();
                            C42437d clickstream = bVar.getClickstream();
                            ParametrizedEvent parametrizedEventC = (clickstream == null || (onShow = clickstream.getOnShow()) == null) ? null : c(onShow);
                            C42437d clickstream2 = bVar.getClickstream();
                            return new BookingFormBlockItem.Button(id7, "", null, parametrizedEventC, (clickstream2 == null || (onClick = clickstream2.getOnClick()) == null) ? null : c(onClick), bVar.getDeepLink());
                        }
                        if (!(bookingFormPageBlock instanceof BookingFormPageBlock.i)) {
                            if (!(bookingFormPageBlock instanceof BookingFormPageBlock.BookingFormBlockToggleV2)) {
                                if ((bookingFormPageBlock instanceof BookingFormPageBlock.p ? true : bookingFormPageBlock instanceof BookingFormPageBlock.g) || bookingFormPageBlock == null) {
                                    return null;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            BookingFormPageBlock.BookingFormBlockToggleV2 bookingFormBlockToggleV2 = (BookingFormPageBlock.BookingFormBlockToggleV2) bookingFormPageBlock;
                            String id8 = bookingFormBlockToggleV2.getId();
                            List<g> listC2 = bookingFormBlockToggleV2.c();
                            ArrayList arrayList4 = new ArrayList(C42745f0.q(listC2, 10));
                            for (g gVar : listC2) {
                                arrayList4.add(new ToggleV2Options(gVar.getId(), gVar.getIsEnabled(), gVar.getIsSelected(), gVar.getText(), gVar.getValue()));
                            }
                            return new BookingFormBlockItem.ToggleV2(id8, arrayList4, bookingFormBlockToggleV2.getNeedFormReload());
                        }
                        BookingFormPageBlock.i iVar = (BookingFormPageBlock.i) bookingFormPageBlock;
                        String id9 = iVar.getId();
                        boolean needFormReload4 = iVar.getNeedFormReload();
                        long checkedVariantsIndex = iVar.getCheckedVariantsIndex();
                        List<s> listD = iVar.d();
                        ArrayList arrayList5 = new ArrayList(C42745f0.q(listD, 10));
                        int i12 = 0;
                        for (Object obj : listD) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            s sVar = (s) obj;
                            String planId = sVar.getPlanId();
                            AttributedText title = sVar.getTitle();
                            AttributedText subtitle = sVar.getSubtitle();
                            String termTitle = sVar.getTermTitle();
                            String type = sVar.getType();
                            boolean z12 = ((int) iVar.getCheckedVariantsIndex()) == i12;
                            long blockSpacing = sVar.getProgress().getBlockSpacing();
                            long dashHeight = sVar.getProgress().getDashHeight();
                            List<u> listB2 = sVar.getProgress().b();
                            if (listB2 != null) {
                                List<u> list = listB2;
                                ArrayList arrayList6 = new ArrayList(C42745f0.q(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList6.add(d((u) it.next()));
                                }
                                listU = arrayList6;
                            } else {
                                listU = C42745f0.U(d(sVar.getProgress().getLeftBlock()), d(sVar.getProgress().getRightBlock()));
                            }
                            arrayList5.add(new LoanTerm(planId, new LoanTerm.Progress(blockSpacing, listU, dashHeight), subtitle, termTitle, title, type, z12));
                            i12 = i13;
                        }
                        return new BookingFormBlockItem.LoanTerms(id9, needFormReload4, checkedVariantsIndex, arrayList5);
                    }
                    BookingFormPageBlock.d dVar = (BookingFormPageBlock.d) bookingFormPageBlock;
                    infoBanner = new BookingFormBlockItem.InfoBanner(dVar.getId(), dVar.getText(), a(dVar.getDarkImageUrl(), dVar.getLightImageUrl()));
                }
                return refundToggle;
            }
            BookingFormPageBlock.f fVar2 = (BookingFormPageBlock.f) bookingFormPageBlock;
            infoBanner = new BookingFormBlockItem.ItemPreview(fVar2.getImage(), fVar2.getId(), fVar2.getTitle());
        }
        return infoBanner;
    }
}
