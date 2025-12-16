package com.avito.android.beduin.common.form;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComponentsFormImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin_models/BeduinModel;", "oldValue", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<BeduinModel, List<? extends BeduinModel>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map<BeduinModel, BeduinModel> f103355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Map<BeduinModel, ? extends BeduinModel> map) {
        super(1);
        this.f103355l = map;
    }

    @Override // Y41.l
    public final List<? extends BeduinModel> invoke(BeduinModel beduinModel) {
        BeduinModel beduinModel2 = beduinModel;
        return Collections.singletonList(this.f103355l.getOrDefault(beduinModel2, beduinModel2));
    }
}
