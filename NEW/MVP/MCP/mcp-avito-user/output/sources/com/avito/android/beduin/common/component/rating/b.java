package com.avito.android.beduin.common.component.rating;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;
import lj.e;

/* compiled from: BeduinRatingStatsHeaderComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/rating/b;", "Lej/b;", "Lcom/avito/android/beduin/common/component/rating/BeduinRatingStatsHeaderModel;", "Lcom/avito/android/beduin/common/component/rating/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC40113b<BeduinRatingStatsHeaderModel, a> {
    @Inject
    public b() {
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, e eVar, InterfaceC15523b interfaceC15523b) {
        return new a((BeduinRatingStatsHeaderModel) beduinModel);
    }
}
