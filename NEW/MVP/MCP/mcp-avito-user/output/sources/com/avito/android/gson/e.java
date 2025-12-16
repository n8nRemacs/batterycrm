package com.avito.android.gson;

import Y61.k;
import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: NullSafeGson.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_gson_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {
    @k
    public static final Gson a(@k com.google.gson.d dVar, boolean z12, boolean z13, @k AW.f fVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object next;
        Gson gsonA = dVar.a();
        Field declaredField = Gson.class.getDeclaredField("factories");
        declaredField.setAccessible(true);
        Collection collection = (Collection) declaredField.get(gsonA);
        if (collection == null) {
            throw new UnknownError("No Gson field 'factories'");
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ReflectiveTypeAdapterFactory) {
                break;
            }
        }
        if (!(next instanceof ReflectiveTypeAdapterFactory)) {
            next = null;
        }
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = (ReflectiveTypeAdapterFactory) next;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory2 = reflectiveTypeAdapterFactory != null ? reflectiveTypeAdapterFactory : null;
        v0.a(arrayList).remove(reflectiveTypeAdapterFactory2);
        arrayList.add(new NullSafeReflectiveTypeAdapterFactory(z12, z13, fVar, reflectiveTypeAdapterFactory2));
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Field declaredField2 = Gson.class.getDeclaredField("factories");
        declaredField2.setAccessible(true);
        declaredField2.set(gsonA, listUnmodifiableList);
        return gsonA;
    }
}
