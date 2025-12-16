package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.common.container.checkbox_group.BeduinCheckboxGroupOption;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupOptionDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinCheckboxGroupOptionDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupOption;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCheckboxGroupOptionDeserializer implements h<BeduinCheckboxGroupOption> {
    @Override // com.google.gson.h
    public final BeduinCheckboxGroupOption deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        return new BeduinCheckboxGroupOption((String) gVar.b(kVarI.D("id"), String.class), Collections.singletonList(gVar.b(kVarI.D("content"), BeduinModel.class)));
    }
}
