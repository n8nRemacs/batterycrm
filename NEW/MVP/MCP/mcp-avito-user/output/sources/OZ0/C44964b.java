package oz0;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.StrOrdersBuyerResponseSection;
import com.avito.android.remote.model.StrOrdersBuyerResponseSectionButton;
import com.avito.android.remote.model.StrOrdersBuyerResponseSectionItem;
import com.avito.android.remote.model.StrOrdersBuyerResponseSectionItemValue;
import com.avito.android.remote.model.StrOrdersBuyerResponseSectionItemValueStatus;
import com.avito.android.remote.model.StrOrdersBuyerResponseSectionPagination;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.SizeViewType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import nz0.C44494a;
import pz0.C47173d;
import pz0.InterfaceC47171b;
import pz0.e;

/* compiled from: StrOrdersBuyerViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loz0/b;", "Loz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44964b implements InterfaceC44963a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f422383a;

    @Inject
    public C44964b(@k J0 j02) {
        this.f422383a = j02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    @Override // oz0.InterfaceC44963a
    @k
    public final C47173d a(@k C47173d c47173d) {
        e aVar;
        boolean z12;
        ?? arrayList;
        Integer page;
        List<String> images;
        StrOrdersBuyerResponseSectionItemValueStatus status;
        StrOrdersBuyerResponseSectionItemValueStatus status2;
        StrOrdersBuyerResponseSectionItemValueStatus status3;
        InterfaceC47171b interfaceC47171b = c47173d.f428932b;
        boolean z13 = false;
        if (interfaceC47171b instanceof InterfaceC47171b.C12300b) {
            aVar = new e.b(com.avito.android.printable_text.b.c(R.string.str_orders_buyer_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.str_orders_buyer_error_description, new Serializable[0]));
        } else if (interfaceC47171b instanceof InterfaceC47171b.a) {
            List<StrOrdersBuyerResponseSection> list = ((InterfaceC47171b.a) interfaceC47171b).f428925a;
            ArrayList arrayList2 = new ArrayList();
            for (StrOrdersBuyerResponseSection strOrdersBuyerResponseSection : list) {
                ArrayList arrayList3 = new ArrayList();
                String title = strOrdersBuyerResponseSection.getTitle();
                StringBuilder sb2 = new StringBuilder("item_id_prefix_header_");
                J0 j02 = this.f422383a;
                arrayList3.add(new com.avito.android.str_seller_orders.orders_buyer.items.header.c(title, f.k(j02, sb2)));
                List<StrOrdersBuyerResponseSectionItem> items = strOrdersBuyerResponseSection.getItems();
                if (items == null || items.isEmpty()) {
                    z12 = z13;
                    String description = strOrdersBuyerResponseSection.getDescription();
                    StrOrdersBuyerResponseSectionButton button = strOrdersBuyerResponseSection.getButton();
                    String title2 = button != null ? button.getTitle() : null;
                    StrOrdersBuyerResponseSectionButton button2 = strOrdersBuyerResponseSection.getButton();
                    arrayList3.add(new com.avito.android.str_seller_orders.orders_buyer.items.section_empty.c(description, title2, button2 != null ? button2.getUrl() : null, f.k(j02, new StringBuilder("item_id_prefix_empty_section_"))));
                } else {
                    String size = strOrdersBuyerResponseSection.getSize();
                    SizeViewType sizeViewType = (!L.f(size, Constants.SMALL) && L.f(size, "big")) ? SizeViewType.f289081b : SizeViewType.f289082c;
                    List<StrOrdersBuyerResponseSectionItem> items2 = strOrdersBuyerResponseSection.getItems();
                    if (items2 != null) {
                        List<StrOrdersBuyerResponseSectionItem> list2 = items2;
                        arrayList = new ArrayList(C42745f0.q(list2, 10));
                        for (StrOrdersBuyerResponseSectionItem strOrdersBuyerResponseSectionItem : list2) {
                            String id2 = strOrdersBuyerResponseSectionItem.getId();
                            StrOrdersBuyerResponseSectionItemValue value = strOrdersBuyerResponseSectionItem.getValue();
                            String orderTitle = value != null ? value.getOrderTitle() : null;
                            StrOrdersBuyerResponseSectionItemValue value2 = strOrdersBuyerResponseSectionItem.getValue();
                            DeepLink orderDeepLink = value2 != null ? value2.getOrderDeepLink() : null;
                            StrOrdersBuyerResponseSectionItemValue value3 = strOrdersBuyerResponseSectionItem.getValue();
                            String itemTitle = value3 != null ? value3.getItemTitle() : null;
                            StrOrdersBuyerResponseSectionItemValue value4 = strOrdersBuyerResponseSectionItem.getValue();
                            String text = (value4 == null || (status3 = value4.getStatus()) == null) ? null : status3.getText();
                            StrOrdersBuyerResponseSectionItemValue value5 = strOrdersBuyerResponseSectionItem.getValue();
                            Boolean hasActiveAction = (value5 == null || (status2 = value5.getStatus()) == null) ? null : status2.getHasActiveAction();
                            StrOrdersBuyerResponseSectionItemValue value6 = strOrdersBuyerResponseSectionItem.getValue();
                            UniversalColor color = (value6 == null || (status = value6.getStatus()) == null) ? null : status.getColor();
                            StrOrdersBuyerResponseSectionItemValue value7 = strOrdersBuyerResponseSectionItem.getValue();
                            arrayList.add(new com.avito.android.str_seller_orders.orders_buyer.items.order.e(id2, sizeViewType, orderTitle, orderDeepLink, itemTitle, text, hasActiveAction, color, (value7 == null || (images = value7.getImages()) == null) ? null : (String) C42745f0.G(images), "item_id_prefix_order_" + strOrdersBuyerResponseSectionItem.getId()));
                        }
                    } else {
                        arrayList = C42784z0.f406748b;
                    }
                    arrayList3.addAll((Collection) arrayList);
                    StrOrdersBuyerResponseSectionPagination pagination = strOrdersBuyerResponseSection.getPagination();
                    if (pagination != null ? L.f(pagination.getHasMore(), Boolean.TRUE) : false) {
                        StrOrdersBuyerResponseSectionPagination pagination2 = strOrdersBuyerResponseSection.getPagination();
                        int iIntValue = ((pagination2 == null || (page = pagination2.getPage()) == null) ? 1 : page.intValue()) + 1;
                        z12 = false;
                        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.str_orders_buyer_pagination_button_title, new Serializable[0]);
                        String name = strOrdersBuyerResponseSection.getName();
                        if (name == null) {
                            name = "";
                        }
                        arrayList3.add(new com.avito.android.str_seller_orders.orders_buyer.items.button_pagination.c(printableTextC, new C44494a(name, iIntValue), f.k(j02, new StringBuilder("item_id_prefix_pagination_button_"))));
                    } else {
                        z12 = false;
                    }
                }
                C42745f0.h(arrayList3, arrayList2);
                z13 = z12;
            }
            aVar = new e.a(arrayList2);
        } else {
            aVar = e.c.f428937a;
        }
        return C47173d.a(c47173d, null, aVar, 1);
    }
}
