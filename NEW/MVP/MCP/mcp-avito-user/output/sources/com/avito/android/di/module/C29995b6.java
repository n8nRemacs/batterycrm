package com.avito.android.di.module;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: OfflineWhitelistsModule.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-apps_shared_di"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.b6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29995b6 {
    public static final String a(kotlin.jvm.internal.H h12) {
        List<Annotation> annotations = h12.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (obj instanceof J81.f) {
                arrayList.add(obj);
            }
        }
        J81.f fVar = (J81.f) C42745f0.G(arrayList);
        if (fVar != null) {
            return fVar.value();
        }
        return null;
    }
}
