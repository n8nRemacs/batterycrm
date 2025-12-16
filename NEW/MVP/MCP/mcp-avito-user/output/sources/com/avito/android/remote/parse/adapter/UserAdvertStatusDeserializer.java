package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.UserAdvertStatusType;
import com.avito.android.remote.model.UserAdvert;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertStatusDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/UserAdvertStatusDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/UserAdvert$Status;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserAdvertStatusDeserializer implements com.google.gson.h<UserAdvert.Status> {
    @Override // com.google.gson.h
    public final UserAdvert.Status deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        UserAdvertStatusType userAdvertStatusType;
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("type").s();
        UserAdvertStatusType[] userAdvertStatusTypeArrValues = UserAdvertStatusType.values();
        int length = userAdvertStatusTypeArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                userAdvertStatusType = null;
                break;
            }
            userAdvertStatusType = userAdvertStatusTypeArrValues[i12];
            userAdvertStatusType.getClass();
            if ("discount".equals(strS)) {
                break;
            }
            i12++;
        }
        if (userAdvertStatusType != null) {
            return new UserAdvert.Status(userAdvertStatusType, kVarI.D("description").s());
        }
        return null;
    }
}
