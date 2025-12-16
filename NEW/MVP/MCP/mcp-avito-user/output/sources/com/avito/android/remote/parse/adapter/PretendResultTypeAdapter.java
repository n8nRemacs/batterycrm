package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PretendResultTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/PretendResultTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/PretendErrorValue;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PretendResultTypeAdapter extends RuntimeTypeAdapter<PretendErrorValue> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, Class<PretendErrorValue.ObjectsMessages>> f254204a;

    public PretendResultTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254204a = Collections.singletonMap(ObjectsParameter.TYPE, PretendErrorValue.ObjectsMessages.class);
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter, com.google.gson.h
    public final Object deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        PretendErrorValue pretendErrorValue;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class<PretendErrorValue.Message> cls = (Class) this.f254204a.get(strS);
        if (cls == null) {
            cls = PretendErrorValue.Message.class;
        }
        com.google.gson.i iVarD2 = kVarI.D("value");
        com.google.gson.i iVarI = iVarD2 != null ? iVarD2.i() : null;
        if (iVarI == null) {
            return null;
        }
        try {
            pretendErrorValue = cls.isAssignableFrom(PretendErrorValue.ObjectsMessages.class) ? (PretendErrorValue) gVar.b(kVarI, cls) : (PretendErrorValue) gVar.b(iVarI, cls);
        } catch (JsonParseException unused) {
            pretendErrorValue = (PretendErrorValue) gVar.b(iVarI, PretendErrorValue.AttributedMessage.class);
        }
        return pretendErrorValue;
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<PretendErrorValue.ObjectsMessages>> getMapping() {
        return this.f254204a;
    }
}
