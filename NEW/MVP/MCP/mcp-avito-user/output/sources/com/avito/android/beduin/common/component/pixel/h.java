package com.avito.android.beduin.common.component.pixel;

import com.avito.android.beduin_models.BeduinModel;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import qj.InterfaceC47406a;

/* compiled from: BeduinPixelModelPreparer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/h;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/pixel/BeduinPixelModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements InterfaceC47406a<BeduinPixelModel> {
    @Inject
    public h() {
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinPixelModel beduinPixelModel = (BeduinPixelModel) beduinModel;
        return beduinPixelModel.getLocalId() != null ? beduinPixelModel : BeduinPixelModel.copy$default(beduinPixelModel, null, null, null, UUID.randomUUID().toString(), 7, null);
    }
}
