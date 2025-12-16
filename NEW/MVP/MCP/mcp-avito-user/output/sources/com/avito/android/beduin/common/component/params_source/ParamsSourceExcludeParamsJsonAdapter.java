package com.avito.android.beduin.common.component.params_source;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParamsSourceExcludeParams.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/params_source/ParamsSourceExcludeParamsJsonAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/params_source/ParamsSourceExcludeParams;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParamsSourceExcludeParamsJsonAdapter implements h<ParamsSourceExcludeParams> {
    @Override // com.google.gson.h
    public final ParamsSourceExcludeParams deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList = iVar.i().D("value").i().D("keys").h().f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(gVar.b((i) it.next(), String.class));
        }
        return new ParamsSourceExcludeParams(arrayList2);
    }
}
