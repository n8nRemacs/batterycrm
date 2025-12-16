package org.mockito.internal.invocation;

import e81.InterfaceC39968b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: InterceptedInvocation.java */
/* loaded from: classes7.dex */
public class e implements InterfaceC39968b, Q71.b {
    private static final long serialVersionUID = 475027563923510472L;

    /* renamed from: b, reason: collision with root package name */
    public final U71.c f421651b;

    /* renamed from: c, reason: collision with root package name */
    public final m f421652c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f421653d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f421654e;

    /* renamed from: f, reason: collision with root package name */
    public final RealMethod f421655f;

    /* renamed from: g, reason: collision with root package name */
    public final int f421656g;

    /* renamed from: h, reason: collision with root package name */
    public final P71.d f421657h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f421658i;

    /* renamed from: j, reason: collision with root package name */
    public p f421659j;

    /* compiled from: InterceptedInvocation.java */
    public class a implements RealMethod {
        @Override // org.mockito.internal.invocation.RealMethod
        public final Object invoke() {
            return null;
        }

        @Override // org.mockito.internal.invocation.RealMethod
        public final boolean l4() {
            return false;
        }
    }

    static {
        new a();
    }

    public e(U71.c cVar, m mVar, Object[] objArr, RealMethod realMethod, P71.d dVar, int i12) {
        Object[] objArr2;
        this.f421651b = cVar;
        this.f421652c = mVar;
        int length = mVar.a().length;
        Object[] objArrCopyOf = objArr.length > length ? Arrays.copyOf(objArr, length) : objArr;
        if (!mVar.b() || objArrCopyOf == null || objArrCopyOf.length == 0 || !(objArrCopyOf[objArrCopyOf.length - 1] == null || objArrCopyOf[objArrCopyOf.length - 1].getClass().isArray())) {
            objArr2 = objArrCopyOf == null ? new Object[0] : objArrCopyOf;
        } else {
            int length2 = objArrCopyOf.length - 1;
            Object obj = objArrCopyOf[length2];
            Object[] objArrD = obj == null ? new Object[]{null} : V71.c.d(obj);
            int length3 = objArrD.length;
            objArr2 = new Object[length2 + length3];
            System.arraycopy(objArrCopyOf, 0, objArr2, 0, length2);
            System.arraycopy(objArrD, 0, objArr2, length2, length3);
        }
        this.f421653d = objArr2;
        this.f421654e = objArr;
        this.f421655f = realMethod;
        this.f421657h = dVar;
        this.f421656g = i12;
    }

    @Override // e81.e
    public final Object[] D() {
        return this.f421653d;
    }

    @Override // e81.InterfaceC39968b, Q71.b
    public final boolean M() {
        return this.f421658i;
    }

    @Override // e81.InterfaceC39968b
    public final void M1() {
        this.f421658i = true;
    }

    @Override // e81.e
    public final <T> T a1(int i12) {
        return (T) this.f421653d[i12];
    }

    @Override // e81.InterfaceC39968b
    public final int a4() {
        return this.f421656g;
    }

    @Override // e81.e
    public final Object d5() {
        RealMethod realMethod = this.f421655f;
        if (realMethod.l4()) {
            return realMethod.invoke();
        }
        throw new MockitoException(Y71.l.b("Cannot call abstract real method on java object!", "Calling real methods is only possible when mocking non abstract method.", "  //correct example:", "  when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f421651b.a().equals(eVar.f421651b.a()) && this.f421652c.equals(eVar.f421652c)) {
            return Arrays.equals(eVar.f421653d, this.f421653d);
        }
        return false;
    }

    @Override // e81.e
    public final Method getMethod() {
        return this.f421652c.c();
    }

    public final int hashCode() {
        return 1;
    }

    @Override // e81.InterfaceC39968b, e81.InterfaceC39967a
    public final e81.f j() {
        return this.f421657h;
    }

    @Override // e81.e
    public final Object[] j5() {
        return this.f421654e;
    }

    @Override // e81.InterfaceC39968b
    public final ArrayList r6() {
        Object[] objArr = this.f421653d;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj == null || !obj.getClass().isArray()) {
                arrayList.add(new V71.l(obj));
            } else {
                arrayList.add(new V71.c(obj));
            }
        }
        return arrayList;
    }

    @Override // e81.InterfaceC39967a
    public final String toString() {
        return new W71.c().a(this, r6());
    }

    @Override // e81.e
    public final Object v3() {
        return this.f421651b.a();
    }
}
