package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: JsonObjectExtensions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_gson_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C2 {
    @Y61.l
    public static final Boolean a(@Y61.k com.google.gson.k kVar, @Y61.k String str) {
        com.google.gson.i iVarD = kVar.D(str);
        if (iVarD == null || (iVarD instanceof com.google.gson.j)) {
            return null;
        }
        return Boolean.valueOf(iVarD.d());
    }

    @Y61.l
    public static final Long b(@Y61.k com.google.gson.k kVar, @Y61.k String str) {
        com.google.gson.i iVarD = kVar.D(str);
        if (iVarD == null || (iVarD instanceof com.google.gson.j)) {
            return null;
        }
        return Long.valueOf(iVarD.l());
    }

    @Y61.l
    public static final String c(@Y61.k com.google.gson.k kVar, @Y61.k String str) {
        com.google.gson.i iVarD = kVar.D(str);
        if (iVarD == null || (iVarD instanceof com.google.gson.j)) {
            return null;
        }
        return iVarD.s();
    }
}
