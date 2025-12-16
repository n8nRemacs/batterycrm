package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.deep_linking.links.PublishSlotUpdateLink;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.ParameterHolder;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: PublishDetailsInteractorAsync.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34085l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241282b;

    public C34085l(C34076c c34076c) {
        this.f241282b = c34076c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<ParameterSlot> parameters;
        Long l12;
        for (Map.Entry<String, Map<String, Object>> entry : ((PublishSlotUpdateLink) ((C43501a) obj).f413260a.f134520a).f133627b.entrySet()) {
            kotlin.reflect.d<?> slotClass = SlotType.INSTANCE.valueOfStr(entry.getKey()).getSlotClass();
            if (slotClass == null) {
                slotClass = null;
            }
            Class<?> clsF = slotClass != null ? ((InterfaceC42819t) slotClass).f() : null;
            if (clsF != null) {
                CategoryParameters categoryParametersC0 = this.f241282b.f241202q.C0();
                ParameterSlot firstParameterOfType = categoryParametersC0 != null ? categoryParametersC0.getFirstParameterOfType(clsF) : null;
                ParameterHolder parameterHolder = firstParameterOfType instanceof ParameterHolder ? (ParameterHolder) firstParameterOfType : null;
                if (parameterHolder == null || (parameters = parameterHolder.getParameters()) == null) {
                    parameters = C42784z0.f406748b;
                }
                for (ParameterSlot parameterSlot : parameters) {
                    if (entry.getValue().containsKey(parameterSlot.getId())) {
                        if (parameterSlot instanceof CharParameter) {
                            CharParameter charParameter = (CharParameter) parameterSlot;
                            Object obj2 = entry.getValue().get(parameterSlot.getId());
                            charParameter.set_value(obj2 != null ? obj2.toString() : null);
                        } else if (parameterSlot instanceof IntParameter) {
                            IntParameter intParameter = (IntParameter) parameterSlot;
                            Object obj3 = entry.getValue().get(parameterSlot.getId());
                            if (obj3 != null) {
                                if (!(obj3 instanceof Long)) {
                                    obj3 = null;
                                }
                                l12 = (Long) obj3;
                            } else {
                                l12 = null;
                            }
                            intParameter.set_value(l12);
                        }
                    }
                }
            }
        }
    }
}
