package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.service_subscription.PackageAttribute;
import com.avito.android.remote.model.text.FontStyleKt;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SubscriptionPackageDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SubscriptionPackageDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/service_subscription/PackageAttribute;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubscriptionPackageDeserializer implements com.google.gson.h<PackageAttribute> {
    @Override // com.google.gson.h
    public final PackageAttribute deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (!(iVar instanceof com.google.gson.k)) {
            throw new IllegalArgumentException("Unexpected json: " + iVar);
        }
        com.google.gson.i iVarD = iVar.i().D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (kotlin.jvm.internal.L.f(strS, FontStyleKt.REGULAR)) {
            return (PackageAttribute) gVar.b(iVar.i().D("value"), PackageAttribute.Regular.class);
        }
        if (kotlin.jvm.internal.L.f(strS, "monster")) {
            return (PackageAttribute) gVar.b(iVar.i().D("value"), PackageAttribute.Monster.class);
        }
        if (strS == null) {
            return (PackageAttribute) gVar.b(iVar, PackageAttribute.Regular.class);
        }
        throw new IllegalArgumentException("Unsupported type: ".concat(strS));
    }
}
