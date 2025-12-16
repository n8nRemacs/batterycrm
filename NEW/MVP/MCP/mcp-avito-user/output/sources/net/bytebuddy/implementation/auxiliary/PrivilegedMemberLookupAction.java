package net.bytebuddy.implementation.auxiliary;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.z;
import net.bytebuddy.utility.g;

/* loaded from: classes7.dex */
public enum PrivilegedMemberLookupAction implements a {
    FOR_PUBLIC_METHOD("getMethod", 0),
    FOR_DECLARED_METHOD("getDeclaredMethod", 0),
    FOR_PUBLIC_CONSTRUCTOR("getConstructor"),
    FOR_DECLARED_CONSTRUCTOR("getDeclaredConstructor");


    /* renamed from: h, reason: collision with root package name */
    public static final a.d f417547h = (a.d) ((net.bytebuddy.description.method.b) ((z.a) TypeDescription.f416317A2.q()).P1(MethodSortMatcher.Sort.f418387e.f418392c)).M2();

    /* renamed from: b, reason: collision with root package name */
    public final a.c f417549b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Class<?>> f417550c;

    PrivilegedMemberLookupAction(String str) {
        try {
            this.f417549b = new a.c(Class.class.getMethod(str, Class[].class));
            this.f417550c = Collections.singletonMap(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, Class[].class);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Could not locate method: ".concat(str), e12);
        }
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final String c() {
        return g.a(name().hashCode());
    }

    @Override // net.bytebuddy.implementation.auxiliary.a
    public final a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        Implementation.b bVarC = MethodCall.d(f417547h).c(new FieldAccessor.d(new FieldAccessor.c.C12076c(new FieldAccessor.FieldNameExtractor.a("type"))).a(0));
        Map<String, Class<?>> map = this.f417550c;
        Iterator<String> it = map.keySet().iterator();
        int i12 = 1;
        while (it.hasNext()) {
            bVarC = bVarC.c(new FieldAccessor.d(new FieldAccessor.c.C12076c(new FieldAccessor.FieldNameExtractor.a(it.next()))).a(i12));
            i12++;
        }
        a.InterfaceC12009a.d.c cVarU = ((a.InterfaceC12009a.AbstractC12010a) new ByteBuddy(classFileVersion).d().b(PrivilegedExceptionAction.class, ConstructorStrategy.Default.f417163b).L(str)).y(a.f417587J2).f(Visibility.PUBLIC).o(net.bytebuddy.utility.a.c(Class.class, new ArrayList(map.values()))).z(bVarC).u(C44411u.x("run"));
        MethodCall.c cVarD = MethodCall.d(this.f417549b);
        MethodCall methodCall = new MethodCall(cVarD.f417366b, new MethodCall.TargetHandler.c.a(new MethodCall.TargetHandler.c.b.C12081b()), cVarD.f417368d, MethodCall.MethodInvoker.ForVirtualInvocation.WithImplicitType.f417402b, cVarD.f417370f);
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(new MethodCall.ArgumentLoader.c.b(str2));
        }
        a.InterfaceC12009a.d.e eVarZ = cVarU.z(methodCall.g(arrayList));
        Visibility visibility = Visibility.PRIVATE;
        a.InterfaceC12009a interfaceC12009aE = eVarZ.e("type", Class.class, visibility);
        for (Map.Entry<String, Class<?>> entry : map.entrySet()) {
            interfaceC12009aE = interfaceC12009aE.e(entry.getKey(), entry.getValue(), visibility);
        }
        return interfaceC12009aE.p();
    }

    PrivilegedMemberLookupAction(String str, int i12) {
        try {
            this.f417549b = new a.c(Class.class.getMethod(str, String.class, Class[].class));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f417550c = linkedHashMap;
            linkedHashMap.put("name", String.class);
            linkedHashMap.put(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, Class[].class);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Could not locate method: ".concat(str), e12);
        }
    }
}
