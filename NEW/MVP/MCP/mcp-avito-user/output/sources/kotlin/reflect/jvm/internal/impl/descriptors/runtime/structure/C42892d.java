package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC43072x;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: reflectClassUtil.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42892d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<kotlin.reflect.d<? extends Object>> f407849a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Map<Class<? extends Object>, Class<? extends Object>> f407850b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Map<Class<? extends Object>, Class<? extends Object>> f407851c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Map<Class<? extends InterfaceC43072x<?>>, Integer> f407852d;

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d$a */
    public static final class a extends N implements Y41.l<ParameterizedType, ParameterizedType> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407853l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d$b */
    public static final class b extends N implements Y41.l<ParameterizedType, InterfaceC43030m<? extends Type>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407854l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends Type> invoke(ParameterizedType parameterizedType) {
            return C42756l.f(parameterizedType.getActualTypeArguments());
        }
    }

    static {
        int i12 = 0;
        Class cls = Boolean.TYPE;
        n0 n0Var = m0.f406844a;
        List<kotlin.reflect.d<? extends Object>> listU = C42745f0.U(n0Var.b(cls), n0Var.b(Byte.TYPE), n0Var.b(Character.TYPE), n0Var.b(Double.TYPE), n0Var.b(Float.TYPE), n0Var.b(Integer.TYPE), n0Var.b(Long.TYPE), n0Var.b(Short.TYPE));
        f407849a = listU;
        List<kotlin.reflect.d<? extends Object>> list = listU;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.d dVar = (kotlin.reflect.d) it.next();
            arrayList.add(new Q(X41.b.b(dVar), X41.b.c(dVar)));
        }
        f407850b = P0.p(arrayList);
        List<kotlin.reflect.d<? extends Object>> list2 = f407849a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) it2.next();
            arrayList2.add(new Q(X41.b.c(dVar2), X41.b.b(dVar2)));
        }
        f407851c = P0.p(arrayList2);
        List listU2 = C42745f0.U(Y41.a.class, Y41.l.class, Y41.p.class, Y41.q.class, Y41.r.class, Y41.s.class, Y41.t.class, Y41.u.class, Y41.v.class, Y41.w.class, Y41.b.class, Y41.c.class, Y41.d.class, Y41.e.class, Y41.f.class, Y41.g.class, Y41.h.class, Y41.i.class, Y41.j.class, Y41.k.class, Y41.m.class, Y41.n.class, Y41.o.class);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listU2, 10));
        for (Object obj : listU2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList3.add(new Q((Class) obj, Integer.valueOf(i12)));
            i12 = i13;
        }
        f407852d = P0.p(arrayList3);
    }

    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b a(@Y61.k Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA;
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (bVarA = a(declaringClass)) == null) ? kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(cls.getName())) : bVarA.d(kotlin.reflect.jvm.internal.impl.name.f.e(cls.getSimpleName()));
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c(cls.getName());
        return new kotlin.reflect.jvm.internal.impl.name.b(cVar.e(), kotlin.reflect.jvm.internal.impl.name.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Y61.k
    public static final String b(@Y61.k Class<?> cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return cls.getName().replace('.', '/');
            }
            return "L" + cls.getName().replace('.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals(IntParameter.TYPE)) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals(CharParameter.TYPE)) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals(BooleanParameter.TYPE)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Unsupported primitive type: "));
    }

    @Y61.k
    public static final List<Type> c(@Y61.k Type type) {
        if (!(type instanceof ParameterizedType)) {
            return C42784z0.f406748b;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getOwnerType() == null ? C42756l.g0(parameterizedType.getActualTypeArguments()) : C43033p.D(C43033p.o(C43033p.u(a.f407853l, type), b.f407854l));
    }
}
