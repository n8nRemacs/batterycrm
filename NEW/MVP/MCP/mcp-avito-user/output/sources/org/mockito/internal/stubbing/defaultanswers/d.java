package org.mockito.internal.stubbing.defaultanswers;

import Y71.l;
import e81.InterfaceC39968b;
import h81.InterfaceC40782a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.mockito.Answers;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.q;

/* compiled from: ReturnsDeepStubs.java */
/* loaded from: classes7.dex */
public class d implements l81.g<Object>, Serializable {
    private static final long serialVersionUID = -7105341425736035847L;

    /* compiled from: ReturnsDeepStubs.java */
    public static class a implements l81.g<Object>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Object f421711b;

        public a(Object obj) {
            this.f421711b = obj;
        }

        @Override // l81.g
        public final Object f(InterfaceC39968b interfaceC39968b) {
            return this.f421711b;
        }
    }

    /* compiled from: ReturnsDeepStubs.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final K71.d f421712a = new K71.d();

        /* renamed from: b, reason: collision with root package name */
        public static final e f421713b = new e();
    }

    /* compiled from: ReturnsDeepStubs.java */
    public static class c extends d implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final org.mockito.internal.util.reflection.f f421714b;

        public c(org.mockito.internal.util.reflection.f fVar) {
            this.f421714b = fVar;
        }

        private Object writeReplace() {
            return q.f421787c;
        }

        @Override // org.mockito.internal.stubbing.defaultanswers.d
        public final org.mockito.internal.util.reflection.f c(Object obj) {
            return this.f421714b;
        }
    }

    public org.mockito.internal.util.reflection.f c(Object obj) {
        return org.mockito.internal.util.reflection.f.d(((N71.a) Y71.h.a(obj).j0()).d());
    }

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) {
        M71.b bVar;
        org.mockito.internal.util.reflection.f fVarJ = c(interfaceC39968b.v3()).j(interfaceC39968b.getMethod());
        Class<?> clsF = fVarJ.f();
        b.f421712a.getClass();
        if (!Y71.h.f19325a.a(clsF).a()) {
            return interfaceC39968b.getMethod().getReturnType().equals(clsF) ? b.f421713b.f(interfaceC39968b) : b.f421713b.c(clsF);
        }
        org.mockito.internal.stubbing.h hVar = null;
        if (clsF.equals(Object.class) && fVarJ.e().length <= 0) {
            return null;
        }
        org.mockito.internal.stubbing.e eVar = (org.mockito.internal.stubbing.e) Y71.h.a(interfaceC39968b.v3()).T5();
        synchronized (eVar.f421723b) {
            try {
                Iterator<org.mockito.internal.stubbing.h> it = eVar.f421723b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    org.mockito.internal.stubbing.h next = it.next();
                    if (eVar.f421727f.c(next.f421660b)) {
                        hVar = next;
                        break;
                    }
                }
            } finally {
            }
        }
        if (hVar != null) {
            return hVar.f(interfaceC39968b);
        }
        InterfaceC40782a<?> interfaceC40782aJ0 = Y71.h.a(interfaceC39968b.v3()).j0();
        K71.d dVar = b.f421712a;
        Class<?> clsF2 = fVarJ.f();
        if (fVarJ.e().length > 0) {
            K71.d dVar2 = q.f421785a;
            bVar = new M71.b();
            Answers answers = q.f421786b;
            bVar.f11213d = answers;
            if (answers == null) {
                throw new MockitoException("defaultAnswer() does not accept null parameter");
            }
            Class<?>[] clsArrE = fVarJ.e();
            if (clsArrE == null || clsArrE.length == 0) {
                throw new MockitoException(l.b("extraInterfaces() requires at least one interface."));
            }
            for (Class<?> cls : clsArrE) {
                if (cls == null) {
                    throw new MockitoException(l.b("extraInterfaces() does not accept null parameters."));
                }
                if (!cls.isInterface()) {
                    throw new MockitoException(l.b("extraInterfaces() accepts only interfaces.", "You passed following type: " + cls.getSimpleName() + " which is not an interface."));
                }
            }
            bVar.f11212c = new LinkedHashSet(Arrays.asList(clsArrE));
        } else {
            K71.d dVar3 = q.f421785a;
            bVar = new M71.b();
            Answers answers2 = q.f421786b;
            bVar.f11213d = answers2;
            if (answers2 == null) {
                throw new MockitoException("defaultAnswer() does not accept null parameter");
            }
        }
        bVar.f11215f = interfaceC40782aJ0.c();
        bVar.f11213d = new c(fVarJ);
        dVar.getClass();
        org.mockito.internal.stubbing.h hVarA = eVar.a(new a(K71.d.b(clsF2, bVar)), false);
        InterfaceC39968b interfaceC39968b2 = hVarA.f421660b;
        synchronized (hVarA.f421730f) {
            hVarA.f421731g = interfaceC39968b2;
        }
        return hVarA.f(interfaceC39968b);
    }
}
