package com.avito.android.loyalty.remote.adapter;

import com.avito.android.remote.model.text.SpacerAttribute;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import dX.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: QualityServiceGrayWidgetTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/QualityServiceGrayWidgetTypeAdapter;", "Lcom/google/gson/h;", "LdX/o;", "<init>", "()V", "a", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QualityServiceGrayWidgetTypeAdapter implements h<o> {

    /* compiled from: QualityServiceGrayWidgetTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/loyalty/remote/adapter/QualityServiceGrayWidgetTypeAdapter$a;", "", "<init>", "()V", "", "GRADE_PROGRESS_ARGS", "Ljava/lang/String;", "INFO_CARDS_ARGS", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public final o deserialize(i iVar, Type type, g gVar) {
        o oVar;
        try {
            String strS = iVar.i().D("type").s();
            k kVarI = iVar.i().D("args").i();
            switch (strS.hashCode()) {
                case -1377687758:
                    if (!strS.equals("button")) {
                        return null;
                    }
                    oVar = (o) gVar.b(kVarI.i().D(strS).i(), o.a.class);
                    break;
                case -896192468:
                    if (!strS.equals(SpacerAttribute.ATTRIBUTE_TYPE)) {
                        return null;
                    }
                    oVar = (o) gVar.b(kVarI.i().D(strS).i(), o.f.class);
                    break;
                case -489687918:
                    if (!strS.equals("info_cards")) {
                        return null;
                    }
                    oVar = (o) gVar.b(kVarI.i().D("infoCards").i(), o.e.class);
                    break;
                case 1424889237:
                    if (!strS.equals("grade_progress")) {
                        return null;
                    }
                    oVar = (o) gVar.b(kVarI.i().D("gradeProgress").i(), o.b.class);
                    break;
                default:
                    return null;
            }
            return oVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
