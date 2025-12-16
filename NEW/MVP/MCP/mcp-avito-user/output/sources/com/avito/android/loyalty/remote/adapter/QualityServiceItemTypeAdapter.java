package com.avito.android.loyalty.remote.adapter;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceWidget;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: QualityServiceItemTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/QualityServiceItemTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/loyalty/remote/model/quality_service/QualityServiceWidget;", "<init>", "()V", "a", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityServiceItemTypeAdapter implements h<QualityServiceWidget> {

    /* compiled from: QualityServiceItemTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/QualityServiceItemTypeAdapter$a;", "", "<init>", "()V", "", "OBJECT_NAME_STYLE", "Ljava/lang/String;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.google.gson.h
    public final QualityServiceWidget deserialize(i iVar, Type type, g gVar) {
        QualityServiceWidget qualityServiceWidget;
        try {
            String strS = iVar.i().D("type").s();
            k kVarI = iVar.i().D("args").i();
            i iVarD = iVar.i().D(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE);
            if (strS.equals("text")) {
                k kVarI2 = kVarI.i().D(strS).i();
                if (iVarD != null) {
                    kVarI2.t(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, iVarD);
                }
                qualityServiceWidget = (QualityServiceWidget) gVar.b(kVarI2, QualityServiceWidget.b.class);
            } else {
                if (!strS.equals("plates")) {
                    return null;
                }
                k kVarI3 = kVarI.i().D(strS).i();
                if (iVarD != null) {
                    kVarI3.t(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, iVarD);
                }
                qualityServiceWidget = (QualityServiceWidget) gVar.b(kVarI3, QualityServiceWidget.PlatesItem.class);
            }
            return qualityServiceWidget;
        } catch (Exception unused) {
            return null;
        }
    }
}
