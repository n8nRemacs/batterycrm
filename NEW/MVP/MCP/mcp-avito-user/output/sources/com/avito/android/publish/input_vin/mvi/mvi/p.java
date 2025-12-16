package com.avito.android.publish.input_vin.mvi.mvi;

import Af0.C13027a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.slot.vin_cropped_image.VinCroppedImageSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VinItemsListConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/mvi/p;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f236709a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f236710b;

    @Inject
    public p(@Y61.k com.avito.android.category_parameters.a aVar, @Y61.k com.avito.android.publish.items.e eVar) {
        this.f236709a = aVar;
        this.f236710b = eVar;
    }

    @Y61.k
    public final ArrayList a(@Y61.k ParametersTree parametersTree) {
        Object next;
        ArrayList arrayList = new ArrayList();
        com.avito.conveyor_item.a aVarA = this.f236710b.a();
        if (aVarA != null) {
            arrayList.add(aVarA);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VinCroppedImageSlot vinCroppedImageSlot = (VinCroppedImageSlot) parametersTree.getFirstParameterOfType(VinCroppedImageSlot.class);
        if (vinCroppedImageSlot != null) {
            linkedHashSet.add(new C13027a(vinCroppedImageSlot));
        }
        ArrayList arrayList2 = new ArrayList(com.avito.android.category_parameters.a.c(this.f236709a, parametersTree, null, linkedHashSet, null, 26));
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.f) {
                break;
            }
        }
        if (((com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.f) (next instanceof com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.f ? next : null)) == null) {
            arrayList2.add(new com.avito.android.publish.input_vin.items.scan_button.c());
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
