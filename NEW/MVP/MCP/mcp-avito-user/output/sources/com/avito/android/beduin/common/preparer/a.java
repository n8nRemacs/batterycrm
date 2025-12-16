package com.avito.android.beduin.common.preparer;

import Y41.l;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionGroupModelPreparer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "oldModel", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<String, List<BeduinModelTransform>> f103452l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Map<String, ? extends List<? extends BeduinModelTransform>> map) {
        super(1);
        this.f103452l = map;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModel2 = beduinModel;
        List<BeduinModelTransform> list = this.f103452l.get(beduinModel2.getId());
        if (list != null) {
            Iterator<T> it = list.iterator();
            BeduinModel beduinModelApply = beduinModel2;
            while (it.hasNext()) {
                beduinModelApply = beduinModelApply.apply((BeduinModelTransform) it.next());
            }
            if (beduinModelApply != null) {
                beduinModel2 = beduinModelApply;
            }
        }
        return Collections.singletonList(beduinModel2);
    }
}
