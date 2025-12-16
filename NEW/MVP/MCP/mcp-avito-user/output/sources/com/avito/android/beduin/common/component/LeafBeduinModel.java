package com.avito.android.beduin.common.component;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LeafBeduinModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "<init>", "()V", "Lkotlin/Function1;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class LeafBeduinModel implements BeduinModel {
    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        return (List) mapper.invoke(this);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        action.invoke(this);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return true;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform beduinModelTransform) {
        return this;
    }
}
