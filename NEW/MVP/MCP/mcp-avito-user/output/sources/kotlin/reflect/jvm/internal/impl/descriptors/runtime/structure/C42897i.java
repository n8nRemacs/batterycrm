package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaAnnotationOwner.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42897i {
    @Y61.l
    public static final C42893e a(@Y61.k Annotation[] annotationArr, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation annotation;
        int length = annotationArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i12];
            if (C42892d.a(((InterfaceC42819t) X41.b.a(annotation)).f()).b().equals(cVar)) {
                break;
            }
            i12++;
        }
        if (annotation != null) {
            return new C42893e(annotation);
        }
        return null;
    }

    @Y61.k
    public static final ArrayList b(@Y61.k Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C42893e(annotation));
        }
        return arrayList;
    }
}
