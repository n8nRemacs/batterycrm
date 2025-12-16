package androidx.compose.ui.tooling;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: PreviewUtils.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {
    @Y61.k
    public static final Object[] a(@Y61.l Class<? extends B0.h<?>> cls, int i12) throws SecurityException {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            int i13 = 0;
            boolean z12 = false;
            Constructor<?> constructor2 = null;
            while (true) {
                if (i13 < length) {
                    Constructor<?> constructor3 = constructors[i13];
                    if (constructor3.getParameterTypes().length == 0) {
                        if (z12) {
                            break;
                        }
                        z12 = true;
                        constructor2 = constructor3;
                    }
                    i13++;
                } else if (z12) {
                    constructor = constructor2;
                }
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            B0.h hVar = (B0.h) constructor.newInstance(new Object[0]);
            if (i12 >= 0) {
                List listSingletonList = Collections.singletonList(C43033p.g(hVar.a(), i12));
                ArrayList arrayList = new ArrayList(C42745f0.q(listSingletonList, 10));
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(it.next()));
                }
                return arrayList.toArray(new Object[0]);
            }
            InterfaceC43030m interfaceC43030mA = hVar.a();
            int count = hVar.getCount();
            Iterator it2 = interfaceC43030mA.iterator();
            Object[] objArr = new Object[count];
            for (int i14 = 0; i14 < count; i14++) {
                objArr[i14] = it2.next();
            }
            return objArr;
        } catch (X41.r unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    public static final Object b(Object obj) throws NoSuchFieldException, SecurityException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof X41.g) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
