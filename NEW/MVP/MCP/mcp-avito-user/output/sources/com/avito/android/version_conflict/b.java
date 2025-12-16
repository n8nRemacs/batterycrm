package com.avito.android.version_conflict;

import com.avito.android.remote.config.AppConfig;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConfigStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/b;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f325893a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f325894b;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<List<? extends Long>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.version_conflict.b$b, reason: collision with other inner class name */
    public static final class C10071b extends com.google.gson.reflect.a<List<? extends Long>> {
    }

    @Inject
    public b(@Y61.k AK0.l lVar, @Y61.k h31.e<Gson> eVar) {
        this.f325893a = lVar;
        this.f325894b = eVar;
    }

    @Y61.l
    public final AppConfig a() {
        AppConfig.UpdateSource updateSource;
        AppConfig.UpdateSourceType updateSourceType;
        List list;
        List list2;
        Object objE;
        Object objE2;
        AK0.l lVar = this.f325893a;
        if (!lVar.contains("config_version_max_long")) {
            return null;
        }
        String string = lVar.getString("config_update_source", null);
        AppConfig.UpdateSource[] updateSourceArrValues = AppConfig.UpdateSource.values();
        int length = updateSourceArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                updateSource = null;
                break;
            }
            updateSource = updateSourceArrValues[i12];
            if (L.f(updateSource.name(), string)) {
                break;
            }
            i12++;
        }
        if (updateSource == null) {
            updateSource = com.avito.android.remote.config.a.f253352a;
        }
        AppConfig.UpdateSource updateSource2 = updateSource;
        String string2 = lVar.getString("config_update_source_type", null);
        AppConfig.UpdateSourceType[] updateSourceTypeArrValues = AppConfig.UpdateSourceType.values();
        int length2 = updateSourceTypeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length2) {
                updateSourceType = null;
                break;
            }
            AppConfig.UpdateSourceType updateSourceType2 = updateSourceTypeArrValues[i13];
            if (L.f(updateSourceType2.name(), string2)) {
                updateSourceType = updateSourceType2;
                break;
            }
            i13++;
        }
        String string3 = lVar.getString("config_included_hard_update_versions", null);
        h31.e<Gson> eVar = this.f325894b;
        if (string3 != null) {
            Gson gson = eVar.get();
            try {
                Type type = new a().getType();
                objE2 = gson.e(string3, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE2 = null;
            }
            list = (List) objE2;
        } else {
            list = null;
        }
        String string4 = lVar.getString("config_excluded_force_update_versions", null);
        if (string4 != null) {
            Gson gson2 = eVar.get();
            try {
                Type type2 = new C10071b().getType();
                objE = gson2.e(string4, ((type2 instanceof ParameterizedType) && R1.a((ParameterizedType) type2)) ? ((ParameterizedType) type2).getRawType() : R1.b(type2));
            } catch (Throwable unused2) {
                objE = null;
            }
            list2 = (List) objE;
        } else {
            list2 = null;
        }
        long j12 = lVar.getLong("config_version_min_long", lVar.getInt("config_version_min", 0));
        long j13 = lVar.getLong("config_version_max_long", lVar.getInt("config_version_max", 0));
        long j14 = lVar.getLong("config_version_latest", 0L);
        return new AppConfig(j12, j13, j14 != 0 ? Long.valueOf(j14) : null, lVar.getInt("config_platform_version", 0), updateSource2, lVar.getString("config_update_source_url", null), updateSourceType, lVar.getString("config_update_source_type_url", null), lVar.getString("config_update_apk_source_link", null), list2, list);
    }
}
