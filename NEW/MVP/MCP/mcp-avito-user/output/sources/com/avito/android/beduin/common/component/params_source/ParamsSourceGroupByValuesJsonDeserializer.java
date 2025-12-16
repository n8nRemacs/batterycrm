package com.avito.android.beduin.common.component.params_source;

import com.avito.android.beduin.common.component.params_source.ParamsSourceGroupByValues;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceGroupByValues.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValuesJsonDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceGroupByValues;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParamsSourceGroupByValuesJsonDeserializer implements h<ParamsSourceGroupByValues> {
    @Override // com.google.gson.h
    public final ParamsSourceGroupByValues deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        k kVarI = iVar.i().D("value").i();
        String strS = kVarI.D("groupId").s();
        if (strS == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        i iVarD = kVarI.D("formIds");
        if (iVarD != null) {
            ArrayList arrayList3 = iVarD.h().f362000b;
            arrayList = new ArrayList(arrayList3.size());
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((i) it.next(), String.class));
            }
        } else {
            arrayList = null;
        }
        i iVarD2 = kVarI.D("values");
        if (iVarD2 != null) {
            ArrayList arrayList4 = iVarD2.h().f362000b;
            arrayList2 = new ArrayList(arrayList4.size());
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(gVar.b((i) it2.next(), Object.class));
            }
        } else {
            arrayList2 = null;
        }
        i iVarD3 = kVarI.D("groupStrategy");
        return new ParamsSourceGroupByValues(strS, arrayList, arrayList2, (ParamsSourceGroupByValues.GroupStrategy) (iVarD3 != null ? gVar.b(iVarD3, ParamsSourceGroupByValues.GroupStrategy.class) : null));
    }
}
