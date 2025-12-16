package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.section.SectionTypeItemV3;
import com.avito.android.remote.model.section.complementary_v3.SectionTypeElementV3;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTypeElementV3Deserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SectionTypeElementV3Deserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionTypeElementV3;", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionTypeElementV3Deserializer implements com.google.gson.h<SectionTypeElementV3> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<String, kotlin.reflect.d<? extends SectionTypeElementV3>> f254237a = Collections.singletonMap("itemBlock", m0.f406844a.b(SectionTypeItemV3.class));

    @Override // com.google.gson.h
    public final SectionTypeElementV3 deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarK = kVarI.K("id");
        SectionTypeElementV3 sectionTypeElementV3 = null;
        String strS = iVarK != null ? iVarK.s() : null;
        if (strS != null) {
            com.google.gson.i iVarK2 = kVarI.K("iconUri");
            String strS2 = iVarK2 != null ? iVarK2.s() : null;
            Iterator<T> it = kVarI.f362194b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                kotlin.reflect.d<? extends SectionTypeElementV3> dVar = this.f254237a.get(str);
                com.google.gson.i iVarD = kVarI.D(str);
                iVarD.getClass();
                if (!(iVarD instanceof com.google.gson.j) && dVar != null) {
                    sectionTypeElementV3 = (SectionTypeElementV3) gVar.b(kVarI.D(str), ((InterfaceC42819t) dVar).f());
                    sectionTypeElementV3.setId(strS);
                    if (strS2 == null) {
                        strS2 = "";
                    }
                    sectionTypeElementV3.setIconUri(strS2);
                }
            }
        }
        return sectionTypeElementV3;
    }
}
