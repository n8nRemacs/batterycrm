package com.avito.android.universal_map;

import android.app.Application;
import com.avito.android.beduin_models.BeduinAction;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/f;", "Lcom/avito/android/universal_map/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f304775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f304776b;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<List<? extends BeduinAction>> {
    }

    @Inject
    public f(@Y61.k Application application, @Y61.k h31.e<Gson> eVar) {
        this.f304775a = application;
        this.f304776b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // com.avito.android.universal_map.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent a(@Y61.k java.lang.String r17, @Y61.k java.lang.String r18, @Y61.l java.lang.String r19, @Y61.l com.avito.android.deep_linking.links.ToolbarSettings r20, @Y61.k java.util.Map<java.lang.String, ? extends java.lang.Object> r21, @Y61.l java.lang.String r22, @Y61.l com.avito.android.remote.model.ParametrizedEvent r23, @Y61.l java.lang.String r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            r2 = 0
            if (r20 == 0) goto L16
            com.avito.android.universal_map.UniversalMapParams$ToolbarSettings r3 = new com.avito.android.universal_map.UniversalMapParams$ToolbarSettings
            java.lang.String r4 = r20.getTitle()
            boolean r5 = r20.getHideSearchAddress()
            r3.<init>(r4, r5)
            r10 = r3
            goto L17
        L16:
            r10 = r2
        L17:
            com.avito.android.universal_map.UniversalMapParams$TrackerSettings$TrackByUniversalMap r13 = new com.avito.android.universal_map.UniversalMapParams$TrackerSettings$TrackByUniversalMap
            r3 = r22
            r13.<init>(r3)
            if (r1 == 0) goto L4e
            h31.e<com.google.gson.Gson> r2 = r0.f304776b
            java.lang.Object r2 = r2.get()
            com.google.gson.Gson r2 = (com.google.gson.Gson) r2
            com.avito.android.universal_map.f$a r3 = new com.avito.android.universal_map.f$a
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L43
            r4 = r3
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            boolean r5 = com.avito.android.util.R1.a(r4)
            if (r5 == 0) goto L43
            java.lang.reflect.Type r3 = r4.getRawType()
            goto L47
        L43:
            java.lang.reflect.Type r3 = com.avito.android.util.R1.b(r3)
        L47:
            java.lang.Object r1 = r2.e(r1, r3)
            r2 = r1
            java.util.List r2 = (java.util.List) r2
        L4e:
            r15 = r2
            com.avito.android.universal_map.UniversalMapParams r1 = new com.avito.android.universal_map.UniversalMapParams
            r11 = 0
            r6 = r1
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r21
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.avito.android.universal_map.UniversalMapActivity$a r2 = com.avito.android.universal_map.UniversalMapActivity.f304735n
            r2.getClass()
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.avito.android.universal_map.UniversalMapActivity> r3 = com.avito.android.universal_map.UniversalMapActivity.class
            android.app.Application r4 = r0.f304775a
            r2.<init>(r4, r3)
            java.lang.String r3 = "extra_universal_map_params"
            android.content.Intent r1 = r2.putExtra(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.f.a(java.lang.String, java.lang.String, java.lang.String, com.avito.android.deep_linking.links.ToolbarSettings, java.util.Map, java.lang.String, com.avito.android.remote.model.ParametrizedEvent, java.lang.String):android.content.Intent");
    }
}
