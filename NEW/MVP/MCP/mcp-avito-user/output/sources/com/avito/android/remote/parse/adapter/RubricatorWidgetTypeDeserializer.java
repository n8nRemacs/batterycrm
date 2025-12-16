package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RubricatorWidgetTypeDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RubricatorWidgetTypeDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RubricatorWidgetTypeDeserializer implements com.google.gson.h<RubricatorWidget.RubricatorWidgetType> {
    @Override // com.google.gson.h
    public final RubricatorWidget.RubricatorWidgetType deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.i iVarD = iVar.i().D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (!kotlin.jvm.internal.L.f(strS, "fixedColumns")) {
            return kotlin.jvm.internal.L.f(strS, "dynamicColumns") ? RubricatorWidget.RubricatorWidgetType.DynamicColumns.INSTANCE : RubricatorWidget.RubricatorWidgetType.Scrollable.INSTANCE;
        }
        com.google.gson.i iVarD2 = iVar.i().D(Navigation.CONFIG);
        return iVarD2 != null ? (RubricatorWidget.RubricatorWidgetType.FixedColumns) gVar.b(iVarD2, RubricatorWidget.RubricatorWidgetType.FixedColumns.class) : new RubricatorWidget.RubricatorWidgetType.FixedColumns(null, null, 3, null);
    }
}
