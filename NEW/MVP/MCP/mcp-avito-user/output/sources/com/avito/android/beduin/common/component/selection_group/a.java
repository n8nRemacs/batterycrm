package com.avito.android.beduin.common.component.selection_group;

import com.avito.android.beduin_models.BeduinModel;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oj.InterfaceC44784a;

/* compiled from: BeduinSelectionGroupExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selection_group/a;", "Loj/a;", "Lcom/avito/android/beduin/common/component/selection_group/BeduinSelectionGroupModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC44784a<BeduinSelectionGroupModel> {
    @Inject
    public a() {
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinSelectionGroupModel beduinSelectionGroupModel = (BeduinSelectionGroupModel) beduinModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (beduinSelectionGroupModel.d() != null) {
            linkedHashMap.put(beduinSelectionGroupModel.getId(), beduinSelectionGroupModel.d());
        }
        return linkedHashMap;
    }
}
