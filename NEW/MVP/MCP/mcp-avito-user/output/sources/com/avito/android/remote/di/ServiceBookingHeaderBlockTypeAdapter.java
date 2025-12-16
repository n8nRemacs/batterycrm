package com.avito.android.remote.di;

import com.avito.android.remote.model.ServiceBookingHeaderBlock;
import com.avito.android.remote.model.ServiceBookingOnboardingHeaderBlock;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ServiceBookingHeaderBlockTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/di/ServiceBookingHeaderBlockTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ServiceBookingHeaderBlock;", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServiceBookingHeaderBlockTypeAdapter implements com.google.gson.h<ServiceBookingHeaderBlock> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Class<ServiceBookingOnboardingHeaderBlock>> f253359a = Collections.singletonMap("onboarding", ServiceBookingOnboardingHeaderBlock.class);

    @Override // com.google.gson.h
    public final ServiceBookingHeaderBlock deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        Class<ServiceBookingOnboardingHeaderBlock> cls;
        com.google.gson.i iVarD;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD2 = kVarI.D("type");
        String strS = iVarD2 != null ? iVarD2.s() : null;
        if (strS == null || (cls = this.f253359a.get(strS)) == null || (iVarD = kVarI.D(strS)) == null) {
            return null;
        }
        return (ServiceBookingHeaderBlock) gVar.b(iVarD, cls);
    }
}
