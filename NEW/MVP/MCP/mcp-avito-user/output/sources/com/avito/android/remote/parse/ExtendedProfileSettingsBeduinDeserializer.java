package com.avito.android.remote.parse;

import com.avito.android.remote.model.extended.ExtendedProfileSettingsBeduin;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsBeduinDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/ExtendedProfileSettingsBeduinDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsBeduin;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileSettingsBeduinDeserializer implements h<ExtendedProfileSettingsBeduin> {
    @Override // com.google.gson.h
    public final ExtendedProfileSettingsBeduin deserialize(i iVar, Type type, g gVar) {
        iVar.toString();
        if (iVar instanceof j) {
            return null;
        }
        if (iVar instanceof k) {
            return new ExtendedProfileSettingsBeduin(iVar.toString());
        }
        throw new IllegalArgumentException("Unexpected json: " + iVar);
    }
}
