package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.str_seller_orders.generated.api.api_4_str_seller_orders_list_post.ApiBookingsListV5FiltersDisplaying;
import com.avito.android.str_seller_orders.orders_seller.domain.models.FiltersDisplaying;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import jz0.C42455a;
import jz0.C42457c;
import jz0.C42460f;
import jz0.InterfaceC42456b;
import jz0.InterfaceC42458d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sz0.AbstractC48441b;
import sz0.C48442c;
import sz0.C48443d;
import sz0.C48445f;
import sz0.C48446g;
import sz0.InterfaceC48440a;

/* compiled from: Api4StrSellerOrdersListPostResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/x;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/w;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class x implements w {

    /* compiled from: Api4StrSellerOrdersListPostResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f289361a;

        static {
            int[] iArr = new int[ApiBookingsListV5FiltersDisplaying.Style.values().length];
            try {
                iArr[ApiBookingsListV5FiltersDisplaying.Style.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiBookingsListV5FiltersDisplaying.Style.CHECKMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f289361a = iArr;
        }
    }

    @Inject
    public x() {
    }

    public static FiltersDisplaying b(ApiBookingsListV5FiltersDisplaying apiBookingsListV5FiltersDisplaying) {
        FiltersDisplaying.Style style;
        String buttonTitle = apiBookingsListV5FiltersDisplaying.getButtonTitle();
        ApiBookingsListV5FiltersDisplaying.Style style2 = apiBookingsListV5FiltersDisplaying.getStyle();
        if (style2 != null) {
            int i12 = a.f289361a[style2.ordinal()];
            if (i12 == 1) {
                style = FiltersDisplaying.Style.f289343b;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                style = FiltersDisplaying.Style.f289344c;
            }
        } else {
            style = null;
        }
        return new FiltersDisplaying(buttonTitle, style, apiBookingsListV5FiltersDisplaying.getTitle());
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.w
    @Y61.k
    public final C48445f a(@Y61.k C42455a c42455a) {
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC48440a bVar;
        AbstractC48441b cVar;
        List<InterfaceC42456b> listA = c42455a.a();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, 10));
        for (InterfaceC42456b interfaceC42456b : listA) {
            if (interfaceC42456b instanceof InterfaceC42456b.a) {
                InterfaceC42456b.a aVar = (InterfaceC42456b.a) interfaceC42456b;
                String id2 = aVar.getId();
                String text = aVar.getText();
                Boolean value = aVar.getValue();
                cVar = new AbstractC48441b.a(id2, text, value != null ? value.booleanValue() : false);
            } else if (interfaceC42456b instanceof InterfaceC42456b.C11598b) {
                InterfaceC42456b.C11598b c11598b = (InterfaceC42456b.C11598b) interfaceC42456b;
                FiltersDisplaying filtersDisplayingB = b(c11598b.getDisplaying());
                String id3 = c11598b.getId();
                List<C42457c> listC = c11598b.c();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listC, 10));
                for (C42457c c42457c : listC) {
                    arrayList4.add(new C48442c(c42457c.getId(), c42457c.getText()));
                }
                cVar = new AbstractC48441b.C12655b(id3, c11598b.getText(), filtersDisplayingB, arrayList4, c11598b.e());
            } else {
                if (!(interfaceC42456b instanceof InterfaceC42456b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC42456b.c cVar2 = (InterfaceC42456b.c) interfaceC42456b;
                FiltersDisplaying filtersDisplayingB2 = b(cVar2.getDisplaying());
                String id4 = cVar2.getId();
                List<C42457c> listC2 = cVar2.c();
                ArrayList arrayList5 = new ArrayList(C42745f0.q(listC2, 10));
                for (C42457c c42457c2 : listC2) {
                    arrayList5.add(new C48442c(c42457c2.getId(), c42457c2.getText()));
                }
                cVar = new AbstractC48441b.c(id4, cVar2.getText(), filtersDisplayingB2, arrayList5, cVar2.getValue());
            }
            arrayList3.add(cVar);
        }
        String header = c42455a.getHeader();
        List<InterfaceC42458d> listC3 = c42455a.c();
        if (listC3 != null) {
            List<InterfaceC42458d> list = listC3;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (InterfaceC42458d interfaceC42458d : list) {
                if (interfaceC42458d instanceof InterfaceC42458d.a) {
                    InterfaceC42458d.a aVar2 = (InterfaceC42458d.a) interfaceC42458d;
                    bVar = new InterfaceC48440a.C12654a(aVar2.getCircleImage(), aVar2.getDeepLink(), aVar2.getDescription(), aVar2.getDetails(), aVar2.getHasAction(), aVar2.getId(), aVar2.getImage(), aVar2.getSubtitle(), aVar2.getTitle());
                } else {
                    if (!(interfaceC42458d instanceof InterfaceC42458d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC42458d.b bVar2 = (InterfaceC42458d.b) interfaceC42458d;
                    bVar = new InterfaceC48440a.b(bVar2.getDeepLink(), bVar2.getIconName(), bVar2.getSubtitle(), bVar2.getTitle());
                }
                arrayList.add(bVar);
            }
        } else {
            arrayList = null;
        }
        DeepLink onboardingDeepLink = c42455a.getOnboardingDeepLink();
        C48443d c48443d = new C48443d(c42455a.getPagination().getCursor(), Boolean.valueOf(c42455a.getPagination().getHasMore()), Long.valueOf(c42455a.getPagination().getLimit()));
        String title = c42455a.getTitle();
        List<C42460f> listG = c42455a.g();
        if (listG != null) {
            List<C42460f> list2 = listG;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list2, 10));
            for (C42460f c42460f : list2) {
                arrayList6.add(new C48446g(c42460f.getDeepLink(), c42460f.getImage() != null ? new UniversalImage(c42460f.getImage().getValue(), c42460f.getImage().getValueDark()) : null, c42460f.getSubtitle(), c42460f.getTitle(), c42460f.getIcon(), c42460f.getIconName()));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        return new C48445f(arrayList3, header, arrayList, onboardingDeepLink, c48443d, title, arrayList2);
    }
}
