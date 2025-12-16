package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.p;
import com.fasterxml.jackson.annotation.r;
import com.fasterxml.jackson.annotation.z;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.introspect.D;
import com.fasterxml.jackson.databind.introspect.L;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import rX0.e;

/* loaded from: classes4.dex */
public abstract class AnnotationIntrospector implements com.fasterxml.jackson.core.r, Serializable {

    public static class ReferenceProperty {

        /* renamed from: a, reason: collision with root package name */
        public final Type f341340a;

        /* renamed from: b, reason: collision with root package name */
        public final String f341341b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f341342b;

            /* renamed from: c, reason: collision with root package name */
            public static final Type f341343c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Type[] f341344d;

            static {
                Type type = new Type("MANAGED_REFERENCE", 0);
                f341342b = type;
                Type type2 = new Type("BACK_REFERENCE", 1);
                f341343c = type2;
                f341344d = new Type[]{type, type2};
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f341344d.clone();
            }
        }

        public ReferenceProperty(Type type, String str) {
            this.f341340a = type;
            this.f341341b = str;
        }
    }

    public interface a {
    }

    public Class<?> B(C36465d c36465d) {
        return null;
    }

    public e.a C(C36465d c36465d) {
        return null;
    }

    public JsonProperty.Access E(AbstractC36471j abstractC36471j) {
        return null;
    }

    public List F(AbstractC36471j abstractC36471j) {
        return null;
    }

    public com.fasterxml.jackson.databind.jsontype.n<?> G(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, h hVar) {
        return null;
    }

    public String H(AbstractC36471j abstractC36471j) {
        return null;
    }

    public String I(AbstractC36471j abstractC36471j) {
        return null;
    }

    public p.a J(AbstractC36463b abstractC36463b) {
        return K(abstractC36463b);
    }

    @Deprecated
    public p.a K(AbstractC36463b abstractC36463b) {
        return p.a.f340991g;
    }

    public JsonInclude.a L(AbstractC36463b abstractC36463b) {
        return JsonInclude.a.f340960f;
    }

    public r.a N(AbstractC36463b abstractC36463b) {
        return r.a.f340997c;
    }

    public Integer O(AbstractC36471j abstractC36471j) {
        return null;
    }

    public com.fasterxml.jackson.databind.jsontype.n<?> P(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36471j abstractC36471j, h hVar) {
        return null;
    }

    public ReferenceProperty Q(AbstractC36471j abstractC36471j) {
        return null;
    }

    public v R() {
        return null;
    }

    public v S(C36465d c36465d) {
        return null;
    }

    public Object T(AbstractC36471j abstractC36471j) {
        return null;
    }

    public Object U(AbstractC36463b abstractC36463b) {
        return null;
    }

    public String[] V(C36465d c36465d) {
        return null;
    }

    public Boolean W(AbstractC36463b abstractC36463b) {
        return null;
    }

    public JsonSerialize.Typing X(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Object Y(AbstractC36463b abstractC36463b) {
        return null;
    }

    public z.a Z(AbstractC36471j abstractC36471j) {
        return z.a.f340999d;
    }

    public List<com.fasterxml.jackson.databind.jsontype.j> a0(AbstractC36463b abstractC36463b) {
        return null;
    }

    public String b0(C36465d c36465d) {
        return null;
    }

    public Object c(AbstractC36463b abstractC36463b) {
        return null;
    }

    public com.fasterxml.jackson.databind.jsontype.n c0(h hVar, com.fasterxml.jackson.databind.cfg.l lVar, C36465d c36465d) {
        return null;
    }

    public Object d(AbstractC36463b abstractC36463b) {
        return null;
    }

    public com.fasterxml.jackson.databind.util.t d0(AbstractC36471j abstractC36471j) {
        return null;
    }

    public JsonCreator.Mode e(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b) {
        if (!o0(abstractC36463b)) {
            return null;
        }
        JsonCreator.Mode modeF = f(abstractC36463b);
        return modeF == null ? JsonCreator.Mode.f340922b : modeF;
    }

    public Object e0(C36465d c36465d) {
        return null;
    }

    @Deprecated
    public JsonCreator.Mode f(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Class<?>[] f0(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Enum<?> g(Class<Enum<?>> cls) {
        return null;
    }

    public v g0() {
        return null;
    }

    public Object h(AbstractC36471j abstractC36471j) {
        return null;
    }

    public Boolean h0(AbstractC36471j abstractC36471j) {
        if ((abstractC36471j instanceof C36472k) && i0((C36472k) abstractC36471j)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Object i(AbstractC36463b abstractC36463b) {
        return null;
    }

    @Deprecated
    public boolean i0(C36472k c36472k) {
        return false;
    }

    public Object k(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Boolean k0(AbstractC36471j abstractC36471j) {
        return null;
    }

    public Boolean l0(AbstractC36471j abstractC36471j) {
        return null;
    }

    public Boolean m0(AbstractC36471j abstractC36471j) {
        if ((abstractC36471j instanceof C36472k) && n0((C36472k) abstractC36471j)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Object n(AbstractC36463b abstractC36463b) {
        return null;
    }

    @Deprecated
    public boolean n0(C36472k c36472k) {
        return false;
    }

    public JsonFormat.b o(AbstractC36463b abstractC36463b) {
        return JsonFormat.b.f340946i;
    }

    @Deprecated
    public boolean o0(AbstractC36463b abstractC36463b) {
        return false;
    }

    public String p(AbstractC36471j abstractC36471j) {
        return null;
    }

    public boolean p0(AbstractC36471j abstractC36471j) {
        return false;
    }

    public InterfaceC36434d.a q(AbstractC36471j abstractC36471j) {
        Object objR = r(abstractC36471j);
        if (objR == null) {
            return null;
        }
        if ("".equals(objR)) {
            objR = null;
        }
        return objR == null ? InterfaceC36434d.a.f340988d : new InterfaceC36434d.a(objR, null);
    }

    public Boolean q0(AbstractC36471j abstractC36471j) {
        return null;
    }

    @Deprecated
    public Object r(AbstractC36471j abstractC36471j) {
        return null;
    }

    public boolean r0(Annotation annotation) {
        return false;
    }

    public Object s(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Boolean s0(C36465d c36465d) {
        return null;
    }

    public Object t(AbstractC36463b abstractC36463b) {
        return null;
    }

    public Boolean t0(AbstractC36471j abstractC36471j) {
        return null;
    }

    public Boolean u(AbstractC36471j abstractC36471j) {
        return null;
    }

    public v v(AbstractC36471j abstractC36471j) {
        return null;
    }

    public v w(AbstractC36471j abstractC36471j) {
        return null;
    }

    public C36472k w0(C36472k c36472k, C36472k c36472k2) {
        return null;
    }

    public Object x(C36465d c36465d) {
        return null;
    }

    public Object y(AbstractC36471j abstractC36471j) {
        return null;
    }

    public D z(AbstractC36463b abstractC36463b) {
        return null;
    }

    public D A(AbstractC36463b abstractC36463b, D d12) {
        return d12;
    }

    public L<?> b(C36465d c36465d, L<?> l12) {
        return l12;
    }

    public void a(com.fasterxml.jackson.databind.cfg.l lVar, C36465d c36465d, ArrayList arrayList) {
    }

    public void l(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public String[] m(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public h u0(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b, h hVar) {
        return hVar;
    }

    public h v0(com.fasterxml.jackson.databind.cfg.l<?> lVar, AbstractC36463b abstractC36463b, h hVar) {
        return hVar;
    }
}
