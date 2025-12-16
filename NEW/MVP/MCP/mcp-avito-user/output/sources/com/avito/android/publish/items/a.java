package com.avito.android.publish.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggle;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import com.avito.android.publish.items.iac_for_pro_enabled.IacForProEnabledItem;
import com.avito.android.publish.slots.address_from_profile.publish_item.q;
import com.avito.android.publish.slots.address_from_profile.publish_item.r;
import com.avito.android.publish.slots.contact_method.item.ContactMethodItem;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.A3;
import com.avito.android.util.C35799g4;
import com.avito.android.util.V1;
import com.avito.android.util.W1;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishParametersListChangePayloadCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.recycler.data_aware.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final A3 f236742a = new A3();

    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        Object bVar;
        Object c35799g4;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF189215e()) : null, aVar2 != null ? Long.valueOf(aVar2.getF189215e()) : null)) {
            return null;
        }
        if ((aVar instanceof JO.d) && (aVar2 instanceof JO.d)) {
            JO.d dVar = (JO.d) aVar2;
            JO.c cVar = dVar.f8944d;
            c35799g4 = new W1(cVar != null ? cVar.f8938a : null);
            if (!L.f(((JO.d) aVar).f8945e, dVar.f8945e)) {
                return null;
            }
        } else {
            if ((aVar instanceof com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k) && (aVar2 instanceof com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k)) {
                return new V1(((com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k) aVar2).f233279c);
            }
            if (!(aVar instanceof PublishDeliveryTogglesItem) || !(aVar2 instanceof PublishDeliveryTogglesItem)) {
                if ((aVar instanceof IacForProItem) && (aVar2 instanceof IacForProItem)) {
                    IacForProItem iacForProItem = (IacForProItem) aVar2;
                    boolean z12 = iacForProItem.f236904c;
                    Boolean boolValueOf = Boolean.valueOf(z12);
                    IacForProItem iacForProItem2 = (IacForProItem) aVar;
                    if (z12 == iacForProItem2.f236904c) {
                        boolValueOf = null;
                    }
                    boolean z13 = iacForProItem.f236909h;
                    bVar = new com.avito.android.publish.items.iac_for_pro.c(boolValueOf, z13 != iacForProItem2.f236909h ? Boolean.valueOf(z13) : null);
                } else if ((aVar instanceof IacForProEnabledItem) && (aVar2 instanceof IacForProEnabledItem)) {
                    boolean z14 = ((IacForProEnabledItem) aVar2).f236934c;
                    bVar = new com.avito.android.publish.items.iac_for_pro_enabled.c(z14 != ((IacForProEnabledItem) aVar).f236934c ? Boolean.valueOf(z14) : null);
                } else if ((aVar instanceof IacDevicesItem) && (aVar2 instanceof IacDevicesItem)) {
                    IacDevicesItem iacDevicesItem = (IacDevicesItem) aVar2;
                    List<IacDevice> list = iacDevicesItem.f236854d;
                    IacDevicesItem iacDevicesItem2 = (IacDevicesItem) aVar;
                    if (L.f(list, iacDevicesItem2.f236854d)) {
                        list = null;
                    }
                    boolean z15 = iacDevicesItem.f236857g;
                    Boolean boolValueOf2 = Boolean.valueOf(z15);
                    if (z15 == iacDevicesItem2.f236857g) {
                        boolValueOf2 = null;
                    }
                    boolean z16 = iacDevicesItem.f236856f;
                    Boolean boolValueOf3 = Boolean.valueOf(z16);
                    if (z16 == iacDevicesItem2.f236856f) {
                        boolValueOf3 = null;
                    }
                    boolean z17 = iacDevicesItem.f236858h;
                    bVar = new com.avito.android.publish.items.iac_devices.c(list, boolValueOf2, boolValueOf3, z17 != iacDevicesItem2.f236858h ? Boolean.valueOf(z17) : null);
                } else {
                    if ((aVar instanceof ContactMethodItem) && (aVar2 instanceof ContactMethodItem)) {
                        ContactMethodItem contactMethodItem = (ContactMethodItem) aVar2;
                        String str = contactMethodItem.f243285c;
                        ContactMethodItem contactMethodItem2 = (ContactMethodItem) aVar;
                        String str2 = !L.f(str, contactMethodItem2.f243285c) ? str : null;
                        boolean z18 = contactMethodItem.f243287e;
                        Boolean boolValueOf4 = z18 != contactMethodItem2.f243287e ? Boolean.valueOf(z18) : null;
                        String str3 = contactMethodItem.f243288f;
                        String str4 = !L.f(str3, contactMethodItem2.f243288f) ? str3 : null;
                        boolean z19 = contactMethodItem.f243289g;
                        Boolean boolValueOf5 = z19 != contactMethodItem2.f243289g ? Boolean.valueOf(z19) : null;
                        boolean z22 = contactMethodItem.f243291i;
                        return new com.avito.android.publish.slots.contact_method.item.c(boolValueOf4, boolValueOf5, z22 != contactMethodItem2.f243291i ? Boolean.valueOf(z22) : null, str2, str4);
                    }
                    if ((aVar instanceof com.avito.android.publish.slots.group_inlined_block.item.a) && (aVar2 instanceof com.avito.android.publish.slots.group_inlined_block.item.a)) {
                        com.avito.android.publish.slots.group_inlined_block.item.a aVar3 = (com.avito.android.publish.slots.group_inlined_block.item.a) aVar2;
                        List<com.avito.conveyor_item.a> list2 = aVar3.f244027e;
                        if (list2 == null || list2.equals(((com.avito.android.publish.slots.group_inlined_block.item.a) aVar).f244027e)) {
                            list2 = null;
                        }
                        ItemWithState.State state = aVar3.f244028f;
                        bVar = new com.avito.android.publish.slots.group_inlined_block.b(list2, L.f(state, ((com.avito.android.publish.slots.group_inlined_block.item.a) aVar).f244028f) ? null : state);
                    } else if ((aVar instanceof com.avito.android.publish.slots.sleeping_places.item.a) && (aVar2 instanceof com.avito.android.publish.slots.sleeping_places.item.a)) {
                        ArrayList arrayList = ((com.avito.android.publish.slots.sleeping_places.item.a) aVar2).f244877i;
                        if (arrayList.equals(((com.avito.android.publish.slots.sleeping_places.item.a) aVar).f244877i)) {
                            arrayList = null;
                        }
                        bVar = new com.avito.android.publish.slots.sleeping_places.item.d(arrayList);
                        if (arrayList == null) {
                            return null;
                        }
                    } else if ((aVar instanceof com.avito.android.publish.slots.item_info.item.d) && (aVar2 instanceof com.avito.android.publish.slots.item_info.item.d)) {
                        boolean z23 = ((com.avito.android.publish.slots.item_info.item.d) aVar2).f244380h;
                        bVar = new com.avito.android.publish.slots.item_info.item.g(z23 != ((com.avito.android.publish.slots.item_info.item.d) aVar).f244380h ? Boolean.valueOf(z23) : null);
                    } else {
                        if ((aVar instanceof com.avito.android.publish.slots.salary_range.item.c) && (aVar2 instanceof com.avito.android.publish.slots.salary_range.item.c)) {
                            return new com.avito.android.publish.slots.salary_range.item.f();
                        }
                        if ((aVar instanceof com.avito.android.publish.slots.auto_group_block.item.c) && (aVar2 instanceof com.avito.android.publish.slots.auto_group_block.item.c)) {
                            com.avito.android.publish.slots.auto_group_block.item.c cVar2 = (com.avito.android.publish.slots.auto_group_block.item.c) aVar2;
                            String str5 = cVar2.f243104g;
                            com.avito.android.publish.slots.auto_group_block.item.c cVar3 = (com.avito.android.publish.slots.auto_group_block.item.c) aVar;
                            if (L.f(str5, cVar3.f243104g)) {
                                str5 = null;
                            }
                            String str6 = cVar2.f243103f;
                            bVar = new com.avito.android.publish.slots.auto_group_block.item.d(str5, L.f(str6, cVar3.f243103f) ? null : str6);
                        } else if ((aVar instanceof com.avito.android.publish.slots.auto_group_block.contact.item.c) && (aVar2 instanceof com.avito.android.publish.slots.auto_group_block.contact.item.c)) {
                            ArrayList arrayList2 = ((com.avito.android.publish.slots.auto_group_block.contact.item.c) aVar2).f243079e;
                            bVar = new com.avito.android.publish.slots.auto_group_block.contact.item.d(arrayList2.equals(((com.avito.android.publish.slots.auto_group_block.contact.item.c) aVar).f243079e) ? null : arrayList2);
                        } else {
                            if (!(aVar instanceof com.avito.android.publish.items.int_range.b) || !(aVar2 instanceof com.avito.android.publish.items.int_range.b)) {
                                if ((aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.m) && (aVar2 instanceof ParameterElement.C.b)) {
                                    ParameterElement.C.b bVar2 = (ParameterElement.C.b) aVar2;
                                    if (bVar2.f117213i instanceof ParameterElement.DisplayType.m) {
                                        bVar = new com.avito.android.publish.items.location_addresses.b(bVar2.f117219o, bVar2.f117207D);
                                    }
                                }
                                if (!(aVar instanceof r) || !(aVar2 instanceof r)) {
                                    return this.f236742a.a(aVar, aVar2);
                                }
                                r rVar = (r) aVar2;
                                return new q(rVar.f242946c, rVar.f242949f);
                            }
                            com.avito.android.publish.items.int_range.b bVar3 = (com.avito.android.publish.items.int_range.b) aVar2;
                            com.avito.android.publish.items.int_range.a aVar4 = bVar3.f236965c;
                            com.avito.android.publish.items.int_range.b bVar4 = (com.avito.android.publish.items.int_range.b) aVar;
                            if (L.f(aVar4, bVar4.f236965c)) {
                                aVar4 = null;
                            }
                            com.avito.android.publish.items.int_range.a aVar5 = bVar3.f236966d;
                            if (L.f(aVar5, bVar4.f236966d)) {
                                aVar5 = null;
                            }
                            ItemWithState.State state2 = bVar3.f236967e;
                            if (L.f(state2, bVar4.f236967e)) {
                                state2 = null;
                            }
                            Theme theme = bVar3.f236968f;
                            bVar = new com.avito.android.publish.items.int_range.e(aVar4, aVar5, state2, theme != bVar4.f236968f ? theme : null);
                        }
                    }
                }
                return bVar;
            }
            PublishDeliveryTogglesItem publishDeliveryTogglesItem = (PublishDeliveryTogglesItem) aVar2;
            DeliveryToggle deliveryToggle = publishDeliveryTogglesItem.f106175d;
            c35799g4 = new C35799g4(deliveryToggle != null ? deliveryToggle.f106163b : null);
            if (((PublishDeliveryTogglesItem) aVar).f106174c == publishDeliveryTogglesItem.f106174c) {
                return null;
            }
        }
        return c35799g4;
    }
}
