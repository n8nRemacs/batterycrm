package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.config.AppConfig;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppConfigDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AppConfigDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/config/AppConfig;", "<init>", "()V", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppConfigDeserializer implements com.google.gson.h<AppConfig> {
    @Override // com.google.gson.h
    public final AppConfig deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        AppConfig.UpdateSource updateSource;
        AppConfig.UpdateSourceType updateSourceType;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        com.google.gson.f fVarC;
        com.google.gson.f fVarC2;
        String strE;
        String strE2;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("versionMin");
        int i12 = 0;
        long jG2 = iVarD != null ? iVarD.g() : 0;
        com.google.gson.i iVarD2 = kVarI.D("versionMax");
        long jG3 = iVarD2 != null ? iVarD2.g() : 0;
        Long lB2 = C2.b(kVarI, "versionLatest");
        com.google.gson.i iVarD3 = kVarI.D("platformVersion");
        int iG2 = iVarD3 != null ? iVarD3.g() : 0;
        com.google.gson.i iVarD4 = kVarI.D("updateSource");
        if (iVarD4 != null && (strE2 = C34328m0.e(iVarD4)) != null) {
            String upperCase = strE2.toUpperCase(Locale.ROOT);
            for (AppConfig.UpdateSource updateSource2 : AppConfig.UpdateSource.values()) {
                if (updateSource2.f253338b.equals(upperCase)) {
                    updateSource = updateSource2;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        updateSource = com.avito.android.remote.config.a.f253352a;
        com.google.gson.i iVarD5 = kVarI.D("updateSourceUrl");
        String strE3 = iVarD5 != null ? C34328m0.e(iVarD5) : null;
        com.google.gson.i iVarD6 = kVarI.D("updateSourceType");
        if (iVarD6 != null && (strE = C34328m0.e(iVarD6)) != null) {
            String upperCase2 = strE.toUpperCase(Locale.ROOT);
            AppConfig.UpdateSourceType[] updateSourceTypeArrValues = AppConfig.UpdateSourceType.values();
            int length = updateSourceTypeArrValues.length;
            while (i12 < length) {
                AppConfig.UpdateSourceType updateSourceType2 = updateSourceTypeArrValues[i12];
                AppConfig.UpdateSourceType[] updateSourceTypeArr = updateSourceTypeArrValues;
                if (updateSourceType2.f253345b.equals(upperCase2)) {
                    updateSourceType = updateSourceType2;
                } else {
                    i12++;
                    updateSourceTypeArrValues = updateSourceTypeArr;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        updateSourceType = null;
        com.google.gson.i iVarD7 = kVarI.D("updateSourceTypeUrl");
        String strE4 = iVarD7 != null ? C34328m0.e(iVarD7) : null;
        com.google.gson.i iVarD8 = kVarI.D("updateApkSourceLink");
        String strE5 = iVarD8 != null ? C34328m0.e(iVarD8) : null;
        com.google.gson.i iVarD9 = kVarI.D("includedHardUpdateVersions");
        if (iVarD9 == null || (fVarC2 = C34328m0.c(iVarD9)) == null) {
            str = strE5;
            arrayList = null;
        } else {
            ArrayList arrayList3 = fVarC2.f362000b;
            str = strE5;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(gVar.b((com.google.gson.i) it.next(), Long.class));
            }
            arrayList = arrayList4;
        }
        com.google.gson.i iVarD10 = kVarI.D("excludedForceUpdateVersions");
        if (iVarD10 == null || (fVarC = C34328m0.c(iVarD10)) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList5 = fVarC.f362000b;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList6.add(gVar.b((com.google.gson.i) it2.next(), Long.class));
            }
            arrayList2 = arrayList6;
        }
        return new AppConfig(jG2, jG3, lB2, iG2, updateSource, strE3, updateSourceType, strE4, str, arrayList2, arrayList);
    }
}
