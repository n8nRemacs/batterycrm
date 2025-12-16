package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.internal.C0;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43404g0;
import kotlinx.serialization.internal.C43414l0;
import kotlinx.serialization.internal.C43441z0;
import kotlinx.serialization.internal.M0;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.Z0;

/* compiled from: SerializersJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes8.dex */
final /* synthetic */ class D {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            return a((Type) C42756l.C(((WildcardType) type).getUpperBounds()));
        }
        if (type instanceof GenericArrayType) {
            return a(((GenericArrayType) type).getGenericComponentType());
        }
        StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb2.append(type);
        sb2.append(" has type ");
        throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, type.getClass(), sb2));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public static final <T> KSerializer<T> b(kotlinx.serialization.modules.f fVar, Class<T> cls, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerA = C0.a(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerA != null) {
            return kSerializerA;
        }
        kotlin.reflect.d dVarB = m0.f406844a.b(cls);
        KSerializer<T> kSerializer = (KSerializer) M0.f412792a.get(dVarB);
        return kSerializer == null ? fVar.b(dVarB, list) : kSerializer;
    }

    public static final KSerializer<Object> c(kotlinx.serialization.modules.f fVar, Type type, boolean z12) {
        ArrayList arrayList;
        KSerializer<Object> kSerializerC;
        KSerializer<Object> kSerializerC2;
        kotlin.reflect.d dVarB;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                genericComponentType = (Type) C42756l.C(((WildcardType) genericComponentType).getUpperBounds());
            }
            if (z12) {
                kSerializerC2 = C.d(fVar, genericComponentType);
            } else {
                kSerializerC2 = c(fVar, genericComponentType, false);
                if (kSerializerC2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                dVarB = m0.f406844a.b((Class) ((ParameterizedType) genericComponentType).getRawType());
            } else {
                if (!(genericComponentType instanceof kotlin.reflect.d)) {
                    throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                }
                dVarB = (kotlin.reflect.d) genericComponentType;
            }
            return new N0(dVarB, kSerializerC2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(fVar, cls, C42784z0.f406748b);
            }
            Class<?> componentType = cls.getComponentType();
            if (z12) {
                kSerializerC = C.d(fVar, componentType);
            } else {
                kSerializerC = c(fVar, componentType, false);
                if (kSerializerC == null) {
                    return null;
                }
            }
            return new N0(m0.f406844a.b(componentType), kSerializerC);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                return c(fVar, (Type) C42756l.C(((WildcardType) type).getUpperBounds()), true);
            }
            StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb2.append(type);
            sb2.append(" has type ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, type.getClass(), sb2));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls2 = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (z12) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(C.d(fVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                KSerializer<Object> kSerializerC3 = c(fVar, type3, false);
                if (kSerializerC3 == null) {
                    return null;
                }
                arrayList.add(kSerializerC3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            return new C43404g0((KSerializer) arrayList.get(0));
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return new C43401f((KSerializer) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return new C43400e0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            return new C43414l0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Q.class.isAssignableFrom(cls2)) {
            return new C43441z0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (C42829l0.class.isAssignableFrom(cls2)) {
            return new Z0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((KSerializer) it.next());
        }
        return b(fVar, cls2, arrayList2);
    }
}
