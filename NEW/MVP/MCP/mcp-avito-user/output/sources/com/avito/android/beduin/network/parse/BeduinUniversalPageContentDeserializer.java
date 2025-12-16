package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.common.action.BeduinUniversalPageContentImpl;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: BeduinUniversalPageContentDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinUniversalPageContentDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinUniversalPageContentDeserializer implements h<BeduinUniversalPageContent> {
    @Override // com.google.gson.h
    public final BeduinUniversalPageContent deserialize(i iVar, Type type, g gVar) {
        return (BeduinUniversalPageContent) gVar.b(iVar, BeduinUniversalPageContentImpl.class);
    }
}
