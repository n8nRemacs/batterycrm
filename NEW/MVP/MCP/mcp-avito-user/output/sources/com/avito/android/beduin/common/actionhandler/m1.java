package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinShowFiltersAction;
import com.avito.android.beduin.common.action.StateModel;
import com.avito.android.beduin.common.form.transforms.ParameterTransform;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinShowFiltersActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue;", "filterValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m1 extends kotlin.jvm.internal.N implements Y41.l<InlineFilterValue, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinShowFiltersAction f100282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n1 f100283m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f100284n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(BeduinShowFiltersAction beduinShowFiltersAction, n1 n1Var, String str) {
        super(1);
        this.f100282l = beduinShowFiltersAction;
        this.f100283m = n1Var;
        this.f100284n = str;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(InlineFilterValue inlineFilterValue) {
        InlineFilterValue inlineFilterValue2 = inlineFilterValue;
        BeduinShowFiltersAction beduinShowFiltersAction = this.f100282l;
        StateModel stateModel = beduinShowFiltersAction.getStateModel();
        n1 n1Var = this.f100283m;
        InterfaceC43779a interfaceC43779a = n1Var.f100289b.get(stateModel.getFormId());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f100284n;
        for (Map.Entry entry : InlineFilterValue.queryMap$default(inlineFilterValue2, str, null, null, 6, null).entrySet()) {
            if (kotlin.jvm.internal.L.f(entry.getKey(), str)) {
                linkedHashMap.put(str, entry.getValue());
            } else {
                Object linkedHashMap2 = linkedHashMap.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(str, linkedHashMap2);
                }
                Map map = (!(linkedHashMap2 instanceof Map) || ((linkedHashMap2 instanceof Z41.a) && !(linkedHashMap2 instanceof Z41.g))) ? null : (Map) linkedHashMap2;
                if (map != null) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new ParameterTransform((String) entry2.getKey(), entry2.getValue()));
        }
        d.e eVar = new d.e(Collections.singletonMap(stateModel.getModelId(), arrayList));
        if (interfaceC43779a != null) {
            interfaceC43779a.h(eVar);
        }
        com.avito.android.beduin_shared.model.utils.a.a(n1Var.f100290c.get(), beduinShowFiltersAction.getOnFilterSelectedActions());
        return kotlin.G0.f406611a;
    }
}
