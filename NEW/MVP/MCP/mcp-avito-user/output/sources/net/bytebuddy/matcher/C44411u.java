package net.bytebuddy.matcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.StringMatcher;

/* compiled from: ElementMatchers.java */
/* renamed from: net.bytebuddy.matcher.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44411u {
    public C44411u() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static J A(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C44413w(f((TypeDescription) it.next())));
        }
        return B(new C44403l(arrayList));
    }

    public static J B(InterfaceC44410t.a.d dVar) {
        return new J(new I(dVar));
    }

    public static C44396e a() {
        return C44396e.f418422c;
    }

    public static InterfaceC44410t.a b(Collection collection) {
        InterfaceC44410t.a aVarF = null;
        for (Object obj : collection) {
            aVarF = aVarF == null ? f(obj) : aVarF.d(f(obj));
        }
        return aVarF == null ? C44396e.f418423d : aVarF;
    }

    public static C44401j c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f((TypeDescription) it.next()));
        }
        return new C44401j(new C44403l(arrayList));
    }

    public static C44409s d(String str) {
        return new C44409s(new StringMatcher(str, StringMatcher.Mode.f418412c));
    }

    public static r e(a.d dVar) {
        return new r(new C44412v(dVar));
    }

    public static InterfaceC44410t.a.AbstractC12113a f(@net.bytebuddy.utility.nullability.b Object obj) {
        return obj == null ? N.f418408b : new C44412v(obj);
    }

    public static ModifierMatcher g() {
        return ModifierMatcher.Mode.ABSTRACT.f418407d;
    }

    public static C44405n h(Class cls) {
        return new C44405n(new C44402k(new C44394c(f(TypeDescription.d.A0(cls)))));
    }

    public static ModifierMatcher i() {
        return ModifierMatcher.Mode.BRIDGE.f418407d;
    }

    public static MethodSortMatcher j() {
        return MethodSortMatcher.Sort.f418387e.f418392c;
    }

    public static C44408q k(TypeDescription typeDescription) {
        return l(f(typeDescription));
    }

    public static C44408q l(InterfaceC44410t.a aVar) {
        return new C44408q(new C44413w(aVar));
    }

    public static <T extends net.bytebuddy.description.method.a> InterfaceC44410t.a<T> m() {
        return x("finalize").a(z(0)).a(new K(new C44413w(f(TypeDescription.f416321E2)))).a(k(TypeDescription.f416317A2));
    }

    public static <T extends net.bytebuddy.description.method.a> InterfaceC44410t.a<T> n() {
        return x("equals").a(B(c(Arrays.asList(TypeDescription.f416317A2)))).a(new K(new C44413w(f(TypeDefinition.Sort.a(Boolean.TYPE, TypeDescription.Generic.AnnotationReader.NoOp.f416326b)))));
    }

    public static <T extends net.bytebuddy.description.method.a> InterfaceC44410t.a<T> o() {
        return z(0).a(new M(new K(new C44413w(f(TypeDescription.f416321E2))))).a(w("get").d(w("is").a(new K(b(new d.f.e(Boolean.TYPE, Boolean.class))))));
    }

    public static <T extends net.bytebuddy.description.method.a> InterfaceC44410t.a<T> p() {
        return x("hashCode").a(z(0)).a(new K(new C44413w(f(TypeDefinition.Sort.a(Integer.TYPE, TypeDescription.Generic.AnnotationReader.NoOp.f416326b)))));
    }

    public static ModifierMatcher q() {
        return ModifierMatcher.Mode.NATIVE.f418407d;
    }

    public static M r() {
        return new M(ModifierMatcher.Mode.PUBLIC.f418407d.d(ModifierMatcher.Mode.PROTECTED.f418407d).d(ModifierMatcher.Mode.PRIVATE.f418407d));
    }

    public static ModifierMatcher s() {
        return ModifierMatcher.Mode.STATIC.f418407d;
    }

    public static ModifierMatcher t() {
        return ModifierMatcher.Mode.SYNTHETIC.f418407d;
    }

    public static <T extends net.bytebuddy.description.method.a> InterfaceC44410t.a<T> u() {
        return x("toString").a(z(0)).a(new K(new C44413w(f(TypeDescription.f416318B2))));
    }

    public static MethodSortMatcher v() {
        return MethodSortMatcher.Sort.f418389g.f418392c;
    }

    public static L w(String str) {
        return new L(new StringMatcher(str, StringMatcher.Mode.f418413d));
    }

    public static L x(String str) {
        return new L(new StringMatcher(str, StringMatcher.Mode.f418412c));
    }

    public static M y(InterfaceC44410t.a aVar) {
        return new M(aVar);
    }

    public static J z(int i12) {
        return new J(new C44404m(i12));
    }
}
