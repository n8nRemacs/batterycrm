package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: ExceptionsConstructor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/Function1;", "", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.internal.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43249t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f411931a = b(Throwable.class, -1);

    static {
        try {
            int i12 = C43251v.f411932a;
            n0 n0Var = n0.f411925a;
        } catch (Throwable unused) {
            n0 n0Var2 = n0.f411925a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Y41.l a(Class cls) throws SecurityException {
        Object next;
        Y41.l lVar;
        kotlin.Q q12;
        r rVar = r.f411929l;
        if (f411931a != b(cls, 0)) {
            return rVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i12 = 0;
        while (true) {
            next = null;
            if (i12 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i12];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                q12 = new kotlin.Q(new C43248s(new C43247q(constructor)), 0);
            } else if (length2 != 1) {
                q12 = length2 != 2 ? new kotlin.Q(null, -1) : (kotlin.jvm.internal.L.f(parameterTypes[0], String.class) && kotlin.jvm.internal.L.f(parameterTypes[1], Throwable.class)) ? new kotlin.Q(new C43248s(new C43244n(constructor)), 3) : new kotlin.Q(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                q12 = kotlin.jvm.internal.L.f(cls2, String.class) ? new kotlin.Q(new C43248s(new C43245o(constructor)), 2) : kotlin.jvm.internal.L.f(cls2, Throwable.class) ? new kotlin.Q(new C43248s(new C43246p(constructor)), 1) : new kotlin.Q(null, -1);
            }
            arrayList.add(q12);
            i12++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((kotlin.Q) next).f406620c).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((kotlin.Q) next2).f406620c).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.Q q13 = (kotlin.Q) next;
        return (q13 == null || (lVar = (Y41.l) q13.f406619b) == null) ? rVar : lVar;
    }

    public static final int b(Class<?> cls, int i12) {
        Object bVar;
        kotlin.jvm.internal.m0.f406844a.b(cls);
        try {
            int i13 = kotlin.Z.f406624c;
            int i14 = 0;
            do {
                int i15 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i15++;
                    }
                }
                i14 += i15;
                cls = cls.getSuperclass();
            } while (cls != null);
            bVar = Integer.valueOf(i14);
        } catch (Throwable th2) {
            int i16 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        Object objValueOf = Integer.valueOf(i12);
        int i17 = kotlin.Z.f406624c;
        if (bVar instanceof Z.b) {
            bVar = objValueOf;
        }
        return ((Number) bVar).intValue();
    }
}
