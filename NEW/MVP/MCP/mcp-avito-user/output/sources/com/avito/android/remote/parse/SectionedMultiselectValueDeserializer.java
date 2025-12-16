package com.avito.android.remote.parse;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectValueDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/SectionedMultiselectValueDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$SectionedMultiselectValue;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionedMultiselectValueDeserializer implements h<SectionedMultiselectParameter.SectionedMultiselectValue> {
    @Override // com.google.gson.h
    public final SectionedMultiselectParameter.SectionedMultiselectValue deserialize(i iVar, Type type, g gVar) {
        Object bVar;
        Object bVar2;
        Object bVar3;
        try {
            int i12 = Z.f406624c;
            bVar = C34328m0.c(iVar);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        f fVar = (f) bVar;
        try {
            bVar2 = iVar.j();
        } catch (Throwable th3) {
            int i14 = Z.f406624c;
            bVar2 = new Z.b(th3);
        }
        if (bVar2 instanceof Z.b) {
            bVar2 = null;
        }
        m mVar = (m) bVar2;
        if (mVar != null && (mVar.f362195b instanceof String)) {
            return new SectionedMultiselectParameter.SectionedMultiselectValue(b1.g(mVar.s()));
        }
        Iterator it = fVar != null ? fVar.h().f362000b.iterator() : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (it != null && it.hasNext()) {
            try {
                int i15 = Z.f406624c;
                bVar3 = ((i) it.next()).s();
            } catch (Throwable th4) {
                int i16 = Z.f406624c;
                bVar3 = new Z.b(th4);
            }
            if (bVar3 instanceof Z.b) {
                bVar3 = null;
            }
            String str = (String) bVar3;
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        return new SectionedMultiselectParameter.SectionedMultiselectValue(linkedHashSet);
    }
}
