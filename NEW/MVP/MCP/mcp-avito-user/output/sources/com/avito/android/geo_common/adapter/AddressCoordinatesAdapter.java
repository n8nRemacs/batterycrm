package com.avito.android.geo_common.adapter;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import uF.C48889b;

/* compiled from: AddressCoordinatesAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/geo_common/adapter/AddressCoordinatesAdapter;", "Lcom/google/gson/h;", "LuF/b;", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressCoordinatesAdapter implements h<C48889b> {
    @Override // com.google.gson.h
    public final C48889b deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        kVarI.D(AddressParameter.TYPE).s();
        return new C48889b();
    }
}
