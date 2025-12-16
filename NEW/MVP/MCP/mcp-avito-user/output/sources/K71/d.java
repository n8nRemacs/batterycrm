package K71;

import Y71.f;
import Y71.g;
import Y71.h;
import Y71.l;
import androidx.camera.camera2.internal.G;
import i81.InterfaceC41242b;
import i81.InterfaceC41246f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.DoNotMockException;
import org.mockito.internal.configuration.plugins.j;
import org.mockito.mock.SerializableMode;

/* compiled from: MockitoCore.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC41242b f9274a = j.a();

    /* renamed from: b, reason: collision with root package name */
    public static final Set<Class<?>> f9275b = Collections.synchronizedSet(new HashSet());

    public static void a(Class<?> cls) {
        if (cls == null) {
            return;
        }
        Set<Class<?>> set = f9275b;
        if (set.contains(cls)) {
            return;
        }
        String strA = f9274a.a(cls);
        if (strA != null) {
            throw new DoNotMockException(strA);
        }
        a(cls.getSuperclass());
        for (Class<?> cls2 : cls.getInterfaces()) {
            a(cls2);
        }
        set.add(cls);
    }

    public static Object b(Class cls, M71.b bVar) {
        new f();
        InterfaceC41246f.c cVarA = h.f19325a.a(cls);
        if (!cVarA.a()) {
            throw new MockitoException(l.b(androidx.compose.ui.graphics.colorspace.e.k(cls, "Cannot mock/spy "), "Mockito cannot mock/spy because :", G.f(" - ", cVarA.b())));
        }
        HashSet hashSet = bVar.f11212c;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (cls == ((Class) it.next())) {
                    throw new MockitoException(l.b("extraInterfaces() does not accept the same type as the mocked type.", "You mocked following type: ".concat(cls.getSimpleName()), "and you passed the same very interface to the extraInterfaces()"));
                }
            }
        }
        N71.a aVar = new N71.a();
        aVar.f11212c = new LinkedHashSet();
        aVar.f11215f = SerializableMode.f421782b;
        aVar.f11216g = new ArrayList();
        aVar.f11217h = new CopyOnWriteArrayList();
        aVar.f11218i = new LinkedList();
        aVar.f11211b = bVar.f11211b;
        aVar.f11212c = bVar.f11212c;
        aVar.f11213d = bVar.f11213d;
        aVar.f11214e = bVar.f11214e;
        aVar.f11215f = bVar.f11215f;
        aVar.f11216g = bVar.f11216g;
        aVar.f11217h = bVar.f11217h;
        aVar.f11218i = bVar.f11218i;
        aVar.f11219j = false;
        aVar.f11220k = null;
        aVar.f11221l = null;
        aVar.f11214e = new g(cls);
        aVar.f11211b = cls;
        HashSet hashSet2 = new HashSet(bVar.f11212c);
        if (bVar.b()) {
            hashSet2.add(Serializable.class);
        }
        aVar.f11212c = hashSet2;
        a(aVar.f11211b);
        Iterator it2 = aVar.f11212c.iterator();
        while (it2.hasNext()) {
            a((Class) it2.next());
        }
        Object objD = h.f19325a.d(aVar, org.mockito.internal.handler.b.a(aVar));
        org.mockito.internal.progress.g.a().f(objD, aVar);
        return objD;
    }
}
