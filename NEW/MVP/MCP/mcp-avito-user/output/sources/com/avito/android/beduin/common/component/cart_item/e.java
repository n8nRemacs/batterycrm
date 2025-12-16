package com.avito.android.beduin.common.component.cart_item;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import oj.InterfaceC44784a;

/* compiled from: BeduinCartItemExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/e;", "Loj/a;", "Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC44784a<BeduinCartItemModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44784a<BeduinModel>> f100902a;

    @Inject
    public e(@Y61.k h31.e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f100902a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinCartItemModel beduinCartItemModel = (BeduinCartItemModel) beduinModel;
        InterfaceC44784a<BeduinModel> interfaceC44784a = this.f100902a.get();
        Map mapSingletonMap = Collections.singletonMap(VoiceInfo.STATE, beduinCartItemModel.getState().f100880b);
        Map<String, Object> mapA = q.a(beduinCartItemModel.getChildren(), interfaceC44784a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapA.size()));
        Iterator<T> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(C43066x.a0((String) entry.getKey(), beduinCartItemModel.getId() + '-', "", false), entry.getValue());
        }
        return Collections.singletonMap("items[" + beduinCartItemModel.getId() + ']', P0.k(mapSingletonMap, linkedHashMap));
    }
}
