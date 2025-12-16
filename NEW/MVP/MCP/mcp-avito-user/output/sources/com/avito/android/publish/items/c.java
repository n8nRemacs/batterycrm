package com.avito.android.publish.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.MarketPriceItem;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import com.avito.android.publish.items.iac_for_pro_enabled.IacForProEnabledItem;
import com.avito.android.publish.slots.address_from_profile.publish_item.r;
import com.avito.android.publish.slots.contact_method.item.ContactMethodItem;
import com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem;
import com.avito.android.publish.slots.images_groups_recommendations.item.ImagesGroupsRecommendationsItem;
import com.avito.android.util.D3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishParametersListContentsComparator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/c;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.recycler.data_aware.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final D3 f236794a = new D3();

    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF78384b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF78384b()) : null)) {
            return false;
        }
        if ((aVar instanceof JO.g) && (aVar2 instanceof JO.g)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof MarketPriceItem) && (aVar2 instanceof MarketPriceItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof JO.l) && (aVar2 instanceof JO.l)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.salary_range.item.c) && (aVar2 instanceof com.avito.android.publish.slots.salary_range.item.c)) {
            return L.f(((com.avito.android.publish.slots.salary_range.item.c) aVar).f244801h, ((com.avito.android.publish.slots.salary_range.item.c) aVar2).f244801h);
        }
        if ((aVar instanceof com.avito.android.publish.items.int_range.b) && (aVar2 instanceof com.avito.android.publish.items.int_range.b)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof JO.d) && (aVar2 instanceof JO.d)) {
            return L.f(((JO.d) aVar).f8944d, ((JO.d) aVar2).f8944d);
        }
        if ((aVar instanceof com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k) && (aVar2 instanceof com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k)) {
            return L.f(((com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k) aVar).f233279c, ((com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k) aVar2).f233279c);
        }
        if ((aVar instanceof JO.e) && (aVar2 instanceof JO.e)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof IacForProItem) && (aVar2 instanceof IacForProItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof IacForProEnabledItem) && (aVar2 instanceof IacForProEnabledItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof IacDevicesItem) && (aVar2 instanceof IacDevicesItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof ContactMethodItem) && (aVar2 instanceof ContactMethodItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.final_state_suggest.item.a) && (aVar2 instanceof com.avito.android.publish.slots.final_state_suggest.item.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.beduin_items.item_with_loader.a) && (aVar2 instanceof com.avito.android.beduin_items.item_with_loader.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.card_select.item.a) && (aVar2 instanceof com.avito.android.publish.slots.card_select.item.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.sleeping_places.item.a) && (aVar2 instanceof com.avito.android.publish.slots.sleeping_places.item.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.auto_group_block.item.c) && (aVar2 instanceof com.avito.android.publish.slots.auto_group_block.item.c)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.item_info.item.d) && (aVar2 instanceof com.avito.android.publish.slots.item_info.item.d)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.group_inlined_block.item.a) && (aVar2 instanceof com.avito.android.publish.slots.group_inlined_block.item.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.auto_group_block.contact.item.c) && (aVar2 instanceof com.avito.android.publish.slots.auto_group_block.contact.item.c)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof ImagesGroupsRecommendationsItem) && (aVar2 instanceof ImagesGroupsRecommendationsItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.publish.slots.delivery_addresses.item.c) && (aVar2 instanceof com.avito.android.publish.slots.delivery_addresses.item.c)) {
            com.avito.android.publish.slots.delivery_addresses.item.c cVar = (com.avito.android.publish.slots.delivery_addresses.item.c) aVar;
            com.avito.android.publish.slots.delivery_addresses.item.c cVar2 = (com.avito.android.publish.slots.delivery_addresses.item.c) aVar2;
            if (!L.f(cVar.f243441c, cVar2.f243441c) || !L.f(cVar.f243442d, cVar2.f243442d)) {
                return false;
            }
        } else {
            if ((aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.m) && (aVar2 instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar2).f117213i instanceof ParameterElement.DisplayType.m)) {
                return L.f(aVar, aVar2);
            }
            if ((aVar instanceof r) && (aVar2 instanceof r)) {
                if (aVar != aVar2) {
                    return false;
                }
            } else {
                if ((aVar instanceof GenerateTextButtonsItem) && (aVar2 instanceof GenerateTextButtonsItem)) {
                    return L.f(aVar, aVar2);
                }
                if (!(aVar instanceof PublishDeliveryTogglesItem) || !(aVar2 instanceof PublishDeliveryTogglesItem)) {
                    return this.f236794a.a(aVar, aVar2);
                }
                if (aVar != aVar2) {
                    return false;
                }
            }
        }
        return true;
    }
}
