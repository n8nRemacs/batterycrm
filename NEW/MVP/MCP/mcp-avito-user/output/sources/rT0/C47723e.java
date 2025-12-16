package rt0;

import Ht0.h;
import Y61.k;
import android.net.Uri;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.service_booking.SbCheckPriceListBlock;
import com.avito.android.service_booking.SbCommentBlock;
import com.avito.android.service_booking.SbContactBlock;
import com.avito.android.service_booking.SbDateBlock;
import com.avito.android.service_booking.SbDaysBlock;
import com.avito.android.service_booking.SbGeoReferenceBlock;
import com.avito.android.service_booking.SbInfoBannerBlock;
import com.avito.android.service_booking.SbInputBlock;
import com.avito.android.service_booking.SbOfferBlock;
import com.avito.android.service_booking.SbPartnerLogoBlock;
import com.avito.android.service_booking.SbPriceListBlock;
import com.avito.android.service_booking.SbSpecialistsBlock;
import com.avito.android.service_booking.SbTextBlock;
import com.avito.android.service_booking.ServiceBookingBlock;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import com.avito.android.service_booking_common.n;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingParamSpecialistsV3ValuesItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import qt0.C47438b;
import qt0.C47439c;
import qt0.C47441e;
import qt0.C47442f;
import qt0.C47443g;
import qt0.C47444h;
import qt0.i;
import qt0.j;

/* compiled from: ServiceBookingItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrt0/e;", "Lrt0/d;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rt0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47723e implements InterfaceC47722d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47719a f430280a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f430281b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f430282c;

    /* compiled from: ServiceBookingItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rt0.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f430283a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f430284b;

        static {
            int[] iArr = new int[BookingParamSpecialistsV3ValuesItem.Type.values().length];
            try {
                iArr[BookingParamSpecialistsV3ValuesItem.Type.Specialist.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingParamSpecialistsV3ValuesItem.Type.AnySpecialist.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f430283a = iArr;
            int[] iArr2 = new int[SbInputBlock.DataFormat.values().length];
            try {
                iArr2[SbInputBlock.DataFormat.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f430284b = iArr2;
        }
    }

    @Inject
    public C47723e(@k InterfaceC47719a interfaceC47719a, @k n nVar, @k B2 b22) {
        this.f430280a = interfaceC47719a;
        this.f430281b = nVar;
        this.f430282c = b22;
    }

    @Override // rt0.InterfaceC47722d
    @k
    public final ArrayList a(@k List list) {
        List<com.avito.conveyor_item.a> listSingletonList;
        ArrayList arrayList;
        com.avito.conveyor_item.a c47438b;
        ArrayList arrayList2;
        C47439c.a aVar;
        String duration;
        com.avito.android.service_booking_common.blueprints.contact.c cVar;
        List<ServiceBookingBlock> list2 = list;
        int i12 = 10;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
        for (ServiceBookingBlock serviceBookingBlock : list2) {
            String strValueOf = String.valueOf(serviceBookingBlock.hashCode());
            if (serviceBookingBlock instanceof SbTextBlock) {
                SbTextBlock sbTextBlock = (SbTextBlock) serviceBookingBlock;
                listSingletonList = Collections.singletonList(new qt0.k(strValueOf, sbTextBlock.getTitle(), sbTextBlock.getText()));
            } else if (serviceBookingBlock instanceof SbContactBlock) {
                B2 b22 = this.f430282c;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[18];
                if (((Boolean) b22.f67226t.a().invoke()).booleanValue()) {
                    SbContactBlock sbContactBlock = (SbContactBlock) serviceBookingBlock;
                    String text = sbContactBlock.getText();
                    SbContactBlock.Icon icon = sbContactBlock.getIcon();
                    DeepLink uri = sbContactBlock.getUri();
                    String header = sbContactBlock.getHeader();
                    String toastMessage = sbContactBlock.getToastMessage();
                    String showPhoneText = sbContactBlock.getShowPhoneText();
                    String phone = sbContactBlock.getPhone();
                    String phone2 = sbContactBlock.getPhone();
                    cVar = new com.avito.android.service_booking_common.blueprints.contact.c(strValueOf, text, icon, uri, header, toastMessage, showPhoneText, !(phone2 == null || phone2.length() == 0), phone);
                } else {
                    SbContactBlock sbContactBlock2 = (SbContactBlock) serviceBookingBlock;
                    cVar = new com.avito.android.service_booking_common.blueprints.contact.c(strValueOf, sbContactBlock2.getText(), sbContactBlock2.getIcon(), sbContactBlock2.getUri(), null, null, null, false, null);
                }
                listSingletonList = Collections.singletonList(cVar);
            } else if (serviceBookingBlock instanceof SbCommentBlock) {
                SbCommentBlock sbCommentBlock = (SbCommentBlock) serviceBookingBlock;
                String id2 = sbCommentBlock.getId();
                String placeholder = sbCommentBlock.getPlaceholder();
                String value = sbCommentBlock.getValue();
                listSingletonList = Collections.singletonList(new com.avito.android.service_booking_common.blueprints.comment.c(strValueOf, id2, placeholder, value != null ? value : ""));
            } else if (serviceBookingBlock instanceof SbCheckPriceListBlock) {
                SbCheckPriceListBlock sbCheckPriceListBlock = (SbCheckPriceListBlock) serviceBookingBlock;
                List<SbCheckPriceListBlock.Value> listD = sbCheckPriceListBlock.d();
                int iF2 = P0.f(C42745f0.q(listD, i12));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (SbCheckPriceListBlock.Value value2 : listD) {
                    linkedHashMap.put(value2.getId(), value2);
                }
                List<SbCheckPriceListBlock.Group> groups = sbCheckPriceListBlock.getGroups();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(groups, i12));
                for (SbCheckPriceListBlock.Group group : groups) {
                    String strValueOf2 = String.valueOf(group.hashCode());
                    String id3 = sbCheckPriceListBlock.getId();
                    String groupTitle = group.getGroupTitle();
                    List<String> listC = group.c();
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        SbCheckPriceListBlock.Value value3 = (SbCheckPriceListBlock.Value) linkedHashMap.get((String) it.next());
                        if (value3 != null) {
                            String id4 = value3.getId();
                            String title = value3.getTitle();
                            String price = value3.getPrice();
                            List<String> listC2 = sbCheckPriceListBlock.c();
                            boolean zContains = listC2 != null ? listC2.contains(value3.getId()) : false;
                            String description = value3.getDescription();
                            arrayList2 = arrayList5;
                            aVar = new C47439c.a(id4, strValueOf2, title, price, zContains, ((description == null || description.length() == 0) && ((duration = value3.getDuration()) == null || duration.length() == 0)) ? null : c(value3.getTitle(), value3.getDuration(), value3.getDescription()));
                        } else {
                            arrayList2 = arrayList5;
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList2.add(aVar);
                        }
                        arrayList5 = arrayList2;
                    }
                    arrayList4.add(new C47439c(strValueOf2, id3, groupTitle, arrayList5, false));
                }
                listSingletonList = arrayList4;
            } else if (serviceBookingBlock instanceof SbPriceListBlock) {
                String strValueOf3 = String.valueOf(serviceBookingBlock.hashCode());
                SbPriceListBlock sbPriceListBlock = (SbPriceListBlock) serviceBookingBlock;
                String title2 = sbPriceListBlock.getTitle();
                List<SbPriceListBlock.Value> listC3 = sbPriceListBlock.c();
                ArrayList arrayList6 = new ArrayList(C42745f0.q(listC3, i12));
                for (SbPriceListBlock.Value value4 : listC3) {
                    String strValueOf4 = String.valueOf(value4.hashCode());
                    String title3 = value4.getTitle();
                    String price2 = value4.getPrice();
                    Boolean isBold = value4.getIsBold();
                    arrayList6.add(new i.a(strValueOf4, title3, price2, isBold != null ? isBold.booleanValue() : false));
                }
                listSingletonList = Collections.singletonList(new i(strValueOf3, title2, arrayList6));
            } else if (serviceBookingBlock instanceof SbOfferBlock) {
                listSingletonList = Collections.singletonList(new C47443g(strValueOf, ((SbOfferBlock) serviceBookingBlock).getText()));
            } else if (serviceBookingBlock instanceof SbInputBlock) {
                SbInputBlock sbInputBlock = (SbInputBlock) serviceBookingBlock;
                String id5 = sbInputBlock.getId();
                String title4 = sbInputBlock.getTitle();
                String placeholder2 = sbInputBlock.getPlaceholder();
                SbInputBlock.DataFormat dataFormat = sbInputBlock.getDataFormat();
                SbInputItem.Format format = dataFormat != null ? a.f430284b[dataFormat.ordinal()] == 1 ? SbInputItem.Format.f276233b : null : null;
                String value5 = sbInputBlock.getValue();
                listSingletonList = Collections.singletonList(new SbInputItem(id5, title4, placeholder2, format, value5 == null ? "" : value5, sbInputBlock.getId()));
            } else {
                boolean z12 = serviceBookingBlock instanceof SbDateBlock;
                InterfaceC47719a interfaceC47719a = this.f430280a;
                if (z12) {
                    listSingletonList = interfaceC47719a.a((SbDateBlock) serviceBookingBlock);
                } else if (serviceBookingBlock instanceof SbDaysBlock) {
                    listSingletonList = interfaceC47719a.d((SbDaysBlock) serviceBookingBlock);
                } else if (serviceBookingBlock instanceof SbSpecialistsBlock) {
                    SbSpecialistsBlock sbSpecialistsBlock = (SbSpecialistsBlock) serviceBookingBlock;
                    List<SbSpecialistsBlock.SbSpecialist> listD2 = sbSpecialistsBlock.d();
                    if (listD2 != null) {
                        List<SbSpecialistsBlock.SbSpecialist> list3 = listD2;
                        ArrayList arrayList7 = new ArrayList(C42745f0.q(list3, i12));
                        for (SbSpecialistsBlock.SbSpecialist sbSpecialist : list3) {
                            if (sbSpecialist instanceof SbSpecialistsBlock.SbSpecialistBlock) {
                                SbSpecialistsBlock.SbSpecialistBlock sbSpecialistBlock = (SbSpecialistsBlock.SbSpecialistBlock) sbSpecialist;
                                String id6 = sbSpecialistBlock.getId();
                                Boolean readOnly = sbSpecialistsBlock.getReadOnly();
                                c47438b = new j(id6, readOnly == null || !readOnly.booleanValue(), sbSpecialistsBlock.getId(), sbSpecialistBlock.getAvatar(), sbSpecialistBlock.getName(), sbSpecialistBlock.getSpeciality(), sbSpecialistBlock.getRating(), sbSpecialistBlock.getReviewsCount(), sbSpecialistBlock.getValue());
                            } else {
                                if (!(sbSpecialist instanceof SbSpecialistsBlock.SbAnySpecialistBlock)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                SbSpecialistsBlock.SbAnySpecialistBlock sbAnySpecialistBlock = (SbSpecialistsBlock.SbAnySpecialistBlock) sbSpecialist;
                                String id7 = sbAnySpecialistBlock.getId();
                                Boolean readOnly2 = sbSpecialistsBlock.getReadOnly();
                                c47438b = new C47438b(id7, sbSpecialistsBlock.getId(), sbAnySpecialistBlock.getText(), sbAnySpecialistBlock.getValue(), readOnly2 == null || !readOnly2.booleanValue());
                            }
                            arrayList7.add(c47438b);
                        }
                        listSingletonList = arrayList7;
                    } else {
                        listSingletonList = C42784z0.f406748b;
                    }
                } else if (serviceBookingBlock instanceof SbPartnerLogoBlock) {
                    listSingletonList = Collections.singletonList(new C47444h(strValueOf, ((SbPartnerLogoBlock) serviceBookingBlock).getImage()));
                } else if (serviceBookingBlock instanceof SbGeoReferenceBlock) {
                    SbGeoReferenceBlock sbGeoReferenceBlock = (SbGeoReferenceBlock) serviceBookingBlock;
                    String title5 = sbGeoReferenceBlock.getTitle();
                    String address = sbGeoReferenceBlock.getAddress();
                    List<GeoReference> listD3 = sbGeoReferenceBlock.d();
                    if (listD3 != null) {
                        List<GeoReference> list4 = listD3;
                        ArrayList arrayList8 = new ArrayList(C42745f0.q(list4, i12));
                        for (GeoReference geoReference : list4) {
                            List<String> colors = geoReference.getColors();
                            String content = geoReference.getContent();
                            String after = geoReference.getAfter();
                            AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                            String iconName = afterWithIcon != null ? afterWithIcon.getIconName() : null;
                            AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                            arrayList8.add(new C47441e.a(colors, content, after, new C47441e.a.C12341a(iconName, afterWithIcon2 != null ? afterWithIcon2.getText() : null)));
                        }
                        arrayList = arrayList8;
                    } else {
                        arrayList = null;
                    }
                    SbGeoReferenceBlock.SbRedirectMap redirectMap = sbGeoReferenceBlock.getRedirectMap();
                    DeepLink uri2 = redirectMap != null ? redirectMap.getUri() : null;
                    SbGeoReferenceBlock.SbRedirectMap redirectMap2 = sbGeoReferenceBlock.getRedirectMap();
                    listSingletonList = Collections.singletonList(new C47441e(title5, address, arrayList, new C47441e.b(redirectMap2 != null ? redirectMap2.getAddress() : null, uri2), strValueOf));
                } else if (serviceBookingBlock instanceof SbInfoBannerBlock) {
                    SbInfoBannerBlock sbInfoBannerBlock = (SbInfoBannerBlock) serviceBookingBlock;
                    listSingletonList = Collections.singletonList(new C47442f(sbInfoBannerBlock.getTitle(), sbInfoBannerBlock.getDescription(), sbInfoBannerBlock.getStyle(), strValueOf));
                } else {
                    listSingletonList = C42784z0.f406748b;
                }
            }
            arrayList3.add(listSingletonList);
            i12 = 10;
        }
        return C42745f0.H(arrayList3);
    }

    @Override // rt0.InterfaceC47722d
    @k
    public final ArrayList b(@k List list) {
        List<com.avito.conveyor_item.a> listSingletonList;
        BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3 bookingParamSpecialistsV3;
        com.avito.conveyor_item.a jVar;
        ArrayList arrayList;
        C47439c.a aVar;
        String duration;
        List<BookingFormResponseV3SuccessParamsItem> list2 = list;
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (BookingFormResponseV3SuccessParamsItem bookingFormResponseV3SuccessParamsItem : list2) {
            if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamTextV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamTextV3 bookingParamTextV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamTextV3) bookingFormResponseV3SuccessParamsItem;
                String text = bookingParamTextV3.getText();
                listSingletonList = Collections.singletonList(new qt0.k(String.valueOf(bookingParamTextV3.getTitle().hashCode() + ((text != null ? text.hashCode() : 0) * 31)), bookingParamTextV3.getTitle(), bookingParamTextV3.getText()));
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3 bookingParamCommentV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamCommentV3) bookingFormResponseV3SuccessParamsItem;
                listSingletonList = Collections.singletonList(new com.avito.android.service_booking_common.blueprints.comment.c(String.valueOf(bookingParamCommentV3.getPlaceholder().hashCode()), bookingParamCommentV3.getId().f277498b, bookingParamCommentV3.getPlaceholder(), null));
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3 bookingParamCheckPriceListV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamCheckPriceListV3) bookingFormResponseV3SuccessParamsItem;
                List<Ht0.i> listD = bookingParamCheckPriceListV3.d();
                int iF2 = P0.f(C42745f0.q(listD, i12));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (Ht0.i iVar : listD) {
                    linkedHashMap.put(iVar.getId(), iVar);
                }
                List<h> listA = bookingParamCheckPriceListV3.a();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, i12));
                for (h hVar : listA) {
                    String strValueOf = String.valueOf(hVar.a().hashCode() + (hVar.getGroupTitle().hashCode() * 31));
                    String str = bookingParamCheckPriceListV3.getId().f277492b;
                    String groupTitle = hVar.getGroupTitle();
                    List<String> listA2 = hVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it = listA2.iterator();
                    while (it.hasNext()) {
                        Ht0.i iVar2 = (Ht0.i) linkedHashMap.get((String) it.next());
                        if (iVar2 != null) {
                            String id2 = iVar2.getId();
                            String title = iVar2.getTitle();
                            String price = iVar2.getPrice();
                            List<String> listC = bookingParamCheckPriceListV3.c();
                            boolean zContains = listC != null ? listC.contains(iVar2.getId()) : false;
                            String description = iVar2.getDescription();
                            arrayList = arrayList4;
                            aVar = new C47439c.a(id2, strValueOf, title, price, zContains, ((description == null || description.length() == 0) && ((duration = iVar2.getDuration()) == null || duration.length() == 0)) ? null : c(iVar2.getTitle(), iVar2.getDuration(), iVar2.getDescription()));
                        } else {
                            arrayList = arrayList4;
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                        arrayList4 = arrayList;
                    }
                    arrayList3.add(new C47439c(strValueOf, str, groupTitle, arrayList4, false));
                }
                listSingletonList = arrayList3;
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamPriceListV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamPriceListV3 bookingParamPriceListV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamPriceListV3) bookingFormResponseV3SuccessParamsItem;
                String title2 = bookingParamPriceListV3.getTitle();
                int iHashCode = (title2 != null ? title2.hashCode() : 0) * 31;
                Iterator<T> it2 = bookingParamPriceListV3.b().iterator();
                int iA2 = 0;
                while (it2.hasNext()) {
                    iA2 = (iA2 * 31) + com.avito.android.service_booking_common.a.a((Ht0.j) it2.next());
                }
                String strValueOf2 = String.valueOf(iHashCode + iA2);
                String title3 = bookingParamPriceListV3.getTitle();
                List<Ht0.j> listB = bookingParamPriceListV3.b();
                ArrayList arrayList5 = new ArrayList(C42745f0.q(listB, i12));
                for (Ht0.j jVar2 : listB) {
                    String strValueOf3 = String.valueOf(com.avito.android.service_booking_common.a.a(jVar2));
                    String title4 = jVar2.getTitle();
                    String price2 = jVar2.getPrice();
                    Boolean isBold = jVar2.getIsBold();
                    arrayList5.add(new i.a(strValueOf3, title4, price2, isBold != null ? isBold.booleanValue() : false));
                }
                listSingletonList = Collections.singletonList(new i(strValueOf2, title3, arrayList5));
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamOfferV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamOfferV3 bookingParamOfferV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamOfferV3) bookingFormResponseV3SuccessParamsItem;
                listSingletonList = Collections.singletonList(new C47443g(bookingParamOfferV3.getText().getText(), bookingParamOfferV3.getText()));
            } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3) {
                BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3 bookingParamInputTextV3 = (BookingFormResponseV3SuccessParamsItem.BookingParamInputTextV3) bookingFormResponseV3SuccessParamsItem;
                String title5 = bookingParamInputTextV3.getTitle();
                String placeholder = bookingParamInputTextV3.getPlaceholder();
                String dataFormat = bookingParamInputTextV3.getDataFormat();
                SbInputItem.Format format = dataFormat != null ? dataFormat.equals("phone") ? SbInputItem.Format.f276233b : null : null;
                String value = bookingParamInputTextV3.getValue();
                String dataFormat2 = bookingParamInputTextV3.getDataFormat();
                int iHashCode2 = (dataFormat2 != null ? dataFormat2.hashCode() : 0) * 31;
                Boolean optional = bookingParamInputTextV3.getOptional();
                int iHashCode3 = (iHashCode2 + (optional != null ? optional.hashCode() : 0)) * 31;
                String placeholder2 = bookingParamInputTextV3.getPlaceholder();
                int iHashCode4 = (bookingParamInputTextV3.getTitle().hashCode() + ((iHashCode3 + (placeholder2 != null ? placeholder2.hashCode() : 0)) * 31)) * 31;
                String value2 = bookingParamInputTextV3.getValue();
                listSingletonList = Collections.singletonList(new SbInputItem(String.valueOf(iHashCode4 + (value2 != null ? value2.hashCode() : 0)), title5, placeholder, format, value, bookingParamInputTextV3.getId().f277516b));
            } else {
                boolean z12 = bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDateV3;
                InterfaceC47719a interfaceC47719a = this.f430280a;
                if (z12) {
                    listSingletonList = interfaceC47719a.b((BookingFormResponseV3SuccessParamsItem.BookingParamDateV3) bookingFormResponseV3SuccessParamsItem);
                } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3) {
                    listSingletonList = interfaceC47719a.c((BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3) bookingFormResponseV3SuccessParamsItem);
                } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) {
                    BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3 bookingParamSpecialistsV32 = (BookingFormResponseV3SuccessParamsItem.BookingParamSpecialistsV3) bookingFormResponseV3SuccessParamsItem;
                    List<BookingParamSpecialistsV3ValuesItem> listC2 = bookingParamSpecialistsV32.c();
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(listC2, i12));
                    for (BookingParamSpecialistsV3ValuesItem bookingParamSpecialistsV3ValuesItem : listC2) {
                        int i13 = a.f430283a[bookingParamSpecialistsV3ValuesItem.getType().ordinal()];
                        boolean z13 = true;
                        if (i13 == 1) {
                            String id3 = bookingParamSpecialistsV3ValuesItem.getId();
                            Boolean readOnly = bookingParamSpecialistsV32.getReadOnly();
                            if (readOnly != null && readOnly.booleanValue()) {
                                z13 = false;
                            }
                            String str2 = bookingParamSpecialistsV32.getId().f277526b;
                            String name = bookingParamSpecialistsV3ValuesItem.getName();
                            String avatar = bookingParamSpecialistsV3ValuesItem.getAvatar();
                            Uri uri = avatar != null ? Uri.parse(avatar) : null;
                            String specialization = bookingParamSpecialistsV3ValuesItem.getSpecialization();
                            String rating = bookingParamSpecialistsV3ValuesItem.getRating();
                            Double reviewsCount = bookingParamSpecialistsV3ValuesItem.getReviewsCount();
                            bookingParamSpecialistsV3 = bookingParamSpecialistsV32;
                            jVar = new j(id3, z13, str2, uri, name, specialization, rating, reviewsCount != null ? Integer.valueOf((int) reviewsCount.doubleValue()) : null, bookingParamSpecialistsV3ValuesItem.getValue());
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String id4 = bookingParamSpecialistsV3ValuesItem.getId();
                            Boolean readOnly2 = bookingParamSpecialistsV32.getReadOnly();
                            jVar = new C47438b(id4, bookingParamSpecialistsV32.getId().f277526b, bookingParamSpecialistsV3ValuesItem.getName(), bookingParamSpecialistsV3ValuesItem.getValue(), readOnly2 == null || !readOnly2.booleanValue());
                            bookingParamSpecialistsV3 = bookingParamSpecialistsV32;
                        }
                        arrayList6.add(jVar);
                        bookingParamSpecialistsV32 = bookingParamSpecialistsV3;
                    }
                    listSingletonList = arrayList6;
                } else if (bookingFormResponseV3SuccessParamsItem instanceof BookingFormResponseV3SuccessParamsItem.BookingImagesV3) {
                    BookingFormResponseV3SuccessParamsItem.BookingImagesV3 bookingImagesV3 = (BookingFormResponseV3SuccessParamsItem.BookingImagesV3) bookingFormResponseV3SuccessParamsItem;
                    UniversalImage universalImage = new UniversalImage(bookingImagesV3.getImage().getValue(), bookingImagesV3.getImage().getValueDark());
                    int iHashCode5 = bookingImagesV3.getImage().getValue().hashCode() * 31;
                    Image valueDark = bookingImagesV3.getImage().getValueDark();
                    listSingletonList = Collections.singletonList(new C47444h(String.valueOf(iHashCode5 + (valueDark != null ? valueDark.hashCode() : 0)), universalImage));
                } else {
                    listSingletonList = C42784z0.f406748b;
                }
            }
            arrayList2.add(listSingletonList);
            i12 = 10;
        }
        return C42745f0.H(arrayList2);
    }

    public final DetailsSheetLink c(String str, String str2, String str3) {
        List listU = C42745f0.U(str2, str3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            String str4 = (String) obj;
            if (str4 != null && str4.length() != 0) {
                arrayList.add(obj);
            }
        }
        return new DetailsSheetLink(new DetailsSheetLinkBody(str, null, null, null, new AttributedText("{{text}}", Collections.singletonList(new FontAttribute("text", C42745f0.O(arrayList, "\n", null, null, null, 62), Collections.singletonList(new FontParameter.ParagraphSpacingParameter(16.0f)))), 1), null, null, new DetailsSheetButton(this.f430281b.c(), "secondary", null, null, null, null, 60, null), null, null, null, null, null, null, Theme.AVITO_RE_23, null, null, false, null, 507758, null), null, 2, null);
    }
}
