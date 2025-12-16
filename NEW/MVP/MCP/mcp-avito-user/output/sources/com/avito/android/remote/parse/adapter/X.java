package com.avito.android.remote.parse.adapter;

import androidx.compose.ui.platform.C22491k0;
import com.google.gson.JsonParseException;
import kotlin.Metadata;

/* compiled from: TypedResultDeserializer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_network_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class X {
    public static final com.google.gson.i a(com.google.gson.k kVar, String str) {
        com.google.gson.i iVarD = kVar.D(str);
        if (iVarD != null) {
            return iVarD;
        }
        throw new JsonParseException(C22491k0.a('\"', "Could not find mandatory key \"", str));
    }
}
