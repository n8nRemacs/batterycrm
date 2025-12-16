package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.Metadata;

/* compiled from: HiddenParameterTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/HiddenParameterTypeAdapterFactory;", "Lcom/google/gson/r;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HiddenParameterTypeAdapterFactory implements com.google.gson.r {
    @Override // com.google.gson.r
    @Y61.l
    public final <T> TypeAdapter<T> a(@Y61.k final Gson gson, @Y61.k final com.google.gson.reflect.a<T> aVar) {
        if (kotlin.jvm.internal.L.f(aVar.getRawType(), HiddenParameter.class)) {
            return (TypeAdapter<T>) new TypeAdapter<Object>() { // from class: com.avito.android.remote.parse.adapter.HiddenParameterTypeAdapterFactory$create$typeAdapter$1
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
                @Override // com.google.gson.TypeAdapter
                @Y61.k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object read(@Y61.l com.google.gson.stream.a r7) {
                    /*
                        r6 = this;
                        java.lang.Class<com.google.gson.k> r0 = com.google.gson.k.class
                        com.google.gson.Gson r1 = r1
                        java.lang.Object r7 = r1.c(r7, r0)
                        com.google.gson.k r7 = (com.google.gson.k) r7
                        java.lang.String r0 = "shadowType"
                        java.lang.String r0 = com.avito.android.util.C2.c(r7, r0)
                        java.lang.Class<com.avito.android.remote.model.category_parameters.HiddenParameter$HiddenRawParameter> r2 = com.avito.android.remote.model.category_parameters.HiddenParameter.HiddenRawParameter.class
                        com.avito.android.remote.parse.adapter.HiddenParameterTypeAdapterFactory r3 = r2
                        if (r0 == 0) goto L78
                        int r4 = r0.hashCode()
                        switch(r4) {
                            case -906021636: goto L6d;
                            case -891985903: goto L64;
                            case 104431: goto L3c;
                            case 3052374: goto L33;
                            case 642087797: goto L27;
                            case 2138377776: goto L1e;
                            default: goto L1d;
                        }
                    L1d:
                        goto L78
                    L1e:
                        java.lang.String r4 = "numericRange"
                        boolean r0 = r0.equals(r4)
                        if (r0 != 0) goto L44
                        goto L78
                    L27:
                        java.lang.String r4 = "multiselect"
                        boolean r0 = r0.equals(r4)
                        if (r0 != 0) goto L30
                        goto L78
                    L30:
                        java.lang.Class<com.avito.android.remote.model.category_parameters.HiddenParameter$HiddenMultiselectParameter> r2 = com.avito.android.remote.model.category_parameters.HiddenParameter.HiddenMultiselectParameter.class
                        goto L78
                    L33:
                        java.lang.String r4 = "char"
                        boolean r0 = r0.equals(r4)
                        if (r0 != 0) goto L76
                        goto L78
                    L3c:
                        java.lang.String r4 = "int"
                        boolean r0 = r0.equals(r4)
                        if (r0 == 0) goto L78
                    L44:
                        r3.getClass()
                        java.lang.String r0 = "value"
                        com.google.gson.i r4 = r7.D(r0)
                        r5 = 1
                        if (r4 == 0) goto L57
                        boolean r4 = r4 instanceof com.google.gson.m
                        if (r4 != r5) goto L57
                        java.lang.Class<com.avito.android.remote.model.category_parameters.HiddenParameter$HiddenIntParameter> r2 = com.avito.android.remote.model.category_parameters.HiddenParameter.HiddenIntParameter.class
                        goto L78
                    L57:
                        com.google.gson.i r0 = r7.D(r0)
                        if (r0 == 0) goto L78
                        boolean r0 = r0 instanceof com.google.gson.k
                        if (r0 != r5) goto L78
                        java.lang.Class<com.avito.android.remote.model.category_parameters.HiddenParameter$HiddenRangeParameter> r2 = com.avito.android.remote.model.category_parameters.HiddenParameter.HiddenRangeParameter.class
                        goto L78
                    L64:
                        java.lang.String r4 = "string"
                        boolean r0 = r0.equals(r4)
                        if (r0 != 0) goto L76
                        goto L78
                    L6d:
                        java.lang.String r4 = "select"
                        boolean r0 = r0.equals(r4)
                        if (r0 != 0) goto L76
                        goto L78
                    L76:
                        java.lang.Class<com.avito.android.remote.model.category_parameters.HiddenParameter$HiddenStringParameter> r2 = com.avito.android.remote.model.category_parameters.HiddenParameter.HiddenStringParameter.class
                    L78:
                        com.google.gson.reflect.a r0 = com.google.gson.reflect.a.get(r2)
                        com.google.gson.TypeAdapter r0 = r1.h(r3, r0)
                        java.lang.Object r7 = r0.fromJsonTree(r7)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.HiddenParameterTypeAdapterFactory$create$typeAdapter$1.read(com.google.gson.stream.a):java.lang.Object");
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(@Y61.k com.google.gson.stream.c cVar, @Y61.k Object obj) {
                    gson.h(this, aVar).write(cVar, obj);
                }
            };
        }
        return null;
    }
}
