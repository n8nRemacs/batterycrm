package com.avito.android.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Gsons.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_gson_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class R1 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.k java.lang.reflect.ParameterizedType r15) {
        /*
            java.lang.reflect.Type r0 = r15.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L11:
            r8 = 1
            if (r3 >= r1) goto L51
            r9 = r0[r3]
            int r10 = r5 + 1
            java.lang.reflect.Type[] r11 = r15.getActualTypeArguments()
            r5 = r11[r5]
            boolean r11 = r5 instanceof java.lang.reflect.WildcardType
            if (r11 == 0) goto L4c
            java.lang.reflect.Type[] r9 = r9.getBounds()
            int r11 = r9.length
            r12 = r2
        L28:
            if (r12 >= r11) goto L3d
            r13 = r9[r12]
            r14 = r5
            java.lang.reflect.WildcardType r14 = (java.lang.reflect.WildcardType) r14
            java.lang.reflect.Type[] r14 = r14.getUpperBounds()
            int r14 = kotlin.collections.C42756l.H(r13, r14)
            if (r14 < 0) goto L3a
            goto L3e
        L3a:
            int r12 = r12 + 1
            goto L28
        L3d:
            r13 = 0
        L3e:
            if (r13 == 0) goto L4c
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L4a
            r4 = r8
            goto L4d
        L4a:
            r7 = r8
            goto L4d
        L4c:
            r6 = r8
        L4d:
            int r3 = r3 + 1
            r5 = r10
            goto L11
        L51:
            if (r4 == 0) goto L6a
            if (r6 != 0) goto L56
            goto L6a
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Either none or all type parameters can be wildcard in "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L6a:
            if (r4 != 0) goto L70
            if (r7 == 0) goto L71
            if (r6 != 0) goto L71
        L70:
            r2 = r8
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.R1.a(java.lang.reflect.ParameterizedType):boolean");
    }

    @Y61.k
    public static final Type b(@Y61.k Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type type2 : actualTypeArguments) {
            if (type2 instanceof WildcardType) {
                type2 = ((WildcardType) type2).getUpperBounds()[0];
            }
            arrayList.add(type2);
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(b((Type) it.next()));
        }
        Type[] typeArr = (Type[]) arrayList2.toArray(new Type[0]);
        return com.google.gson.reflect.a.getParameterized(parameterizedType.getRawType(), (Type[]) Arrays.copyOf(typeArr, typeArr.length)).getType();
    }
}
