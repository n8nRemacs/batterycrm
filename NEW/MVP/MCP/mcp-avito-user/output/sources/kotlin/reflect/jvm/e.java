package kotlin.reflect.jvm;

import X41.i;
import Y61.k;
import Y61.l;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.AbstractC43003l;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* compiled from: ReflectJvmMapping.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: ReflectJvmMapping.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f406964a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                KotlinClassHeader.Kind.a aVar = KotlinClassHeader.Kind.f408496c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KotlinClassHeader.Kind.a aVar2 = KotlinClassHeader.Kind.f408496c;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KotlinClassHeader.Kind.a aVar3 = KotlinClassHeader.Kind.f408496c;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f406964a = iArr;
        }
    }

    public static final kotlin.reflect.i<?> a(Collection<? extends kotlin.reflect.c<?>> collection, Method method) {
        for (kotlin.reflect.c<?> cVar : collection) {
            if ((cVar instanceof kotlin.reflect.i) && L.f(cVar.getF407039i(), method.getName())) {
                kotlin.reflect.i<?> iVar = (kotlin.reflect.i) cVar;
                if (L.f(b(iVar), method)) {
                    return iVar;
                }
            }
        }
        for (kotlin.reflect.c<?> cVar2 : collection) {
            if ((cVar2 instanceof kotlin.reflect.i) && !L.f(cVar2.getF407039i(), method.getName())) {
                kotlin.reflect.i<?> iVar2 = (kotlin.reflect.i) cVar2;
                if (L.f(b(iVar2), method)) {
                    return iVar2;
                }
            }
        }
        return null;
    }

    @l
    public static final Method b(@k kotlin.reflect.i<?> iVar) {
        kotlin.reflect.jvm.internal.calls.e<?> eVarJ;
        AbstractC43003l abstractC43003lA = i0.a(iVar);
        Member memberB = (abstractC43003lA == null || (eVarJ = abstractC43003lA.j()) == null) ? null : eVarJ.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }
}
