package com.avito.android.gson;

import com.avito.android.util.C35983y4;
import com.google.gson.internal.A;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.KParameter;

/* compiled from: NullSafeGson.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<Map<String, ? extends Boolean>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class<?> f161335l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NullSafeReflectiveTypeAdapterFactory nullSafeReflectiveTypeAdapterFactory, Class<?> cls) {
        super(0);
        this.f161335l = cls;
    }

    @Override // Y41.a
    public final Map<String, ? extends Boolean> invoke() {
        boolean z12;
        Object next;
        Object obj = NullSafeReflectiveTypeAdapterFactory.f161313i;
        Class<?> cls = this.f161335l;
        if (C35983y4.b(cls)) {
            return P0.c();
        }
        Field[] declaredFields = cls.getDeclaredFields();
        InterfaceC42726C interfaceC42726CC = C42727D.c(new h(cls));
        HashMap map = new HashMap(declaredFields.length);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (A.a(field.getType())) {
                z12 = false;
            } else {
                Annotation[] annotations = field.getAnnotations();
                int length = annotations.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        String name2 = field.getName();
                        Iterator it = ((Iterable) interfaceC42726CC.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((KParameter) next).getName(), name2)) {
                                break;
                            }
                        }
                        KParameter kParameter = (KParameter) next;
                        if (kParameter == null || kParameter.getType().f407060b.I0()) {
                            break;
                        }
                        z12 = true;
                    } else {
                        if (annotations[i12] instanceof d) {
                            break;
                        }
                        i12++;
                    }
                }
                z12 = false;
            }
            map.put(name, Boolean.valueOf(z12));
        }
        return map;
    }
}
