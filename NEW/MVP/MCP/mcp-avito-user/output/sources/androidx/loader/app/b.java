package androidx.loader.app;

import android.os.Looper;
import androidx.collection.q1;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.loader.app.a;
import androidx.loader.content.c;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import com.google.android.gms.auth.api.signin.internal.f;
import j.K;
import j.N;
import j.P;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Object f46932a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final c f46933b;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends C23038g0<D> implements c.InterfaceC1807c<D> {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final androidx.loader.content.c<D> f46934a;

        /* renamed from: b, reason: collision with root package name */
        public Object f46935b;

        /* renamed from: c, reason: collision with root package name */
        public C1805b<D> f46936c;

        public a(@N androidx.loader.content.c cVar) {
            this.f46934a = cVar;
            if (cVar.f46962a != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            cVar.f46962a = this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.P, java.lang.Object] */
        public final void a() {
            ?? r02 = this.f46935b;
            C1805b<D> c1805b = this.f46936c;
            if (r02 == 0 || c1805b == null) {
                return;
            }
            super.removeObserver(c1805b);
            observe(r02, c1805b);
        }

        public final void b(@P Object obj) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.setValue(obj);
            } else {
                postValue(obj);
            }
        }

        @Override // androidx.view.AbstractC22991Y
        public final void onActive() {
            androidx.loader.content.c<D> cVar = this.f46934a;
            cVar.f46964c = true;
            cVar.f46966e = false;
            cVar.f46965d = false;
            cVar.e();
        }

        @Override // androidx.view.AbstractC22991Y
        public final void onInactive() {
            androidx.loader.content.c<D> cVar = this.f46934a;
            cVar.f46964c = false;
            cVar.f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.AbstractC22991Y
        public final void removeObserver(@N InterfaceC23040h0<? super D> interfaceC23040h0) {
            super.removeObserver(interfaceC23040h0);
            this.f46935b = null;
            this.f46936c = null;
        }

        @N
        public final String toString() {
            StringBuilder sbQ = e.q(64, "LoaderInfo{");
            sbQ.append(Integer.toHexString(System.identityHashCode(this)));
            sbQ.append(" #0 : ");
            Class<?> cls = this.f46934a.getClass();
            sbQ.append(cls.getSimpleName());
            sbQ.append("{");
            sbQ.append(Integer.toHexString(System.identityHashCode(cls)));
            sbQ.append("}}");
            return sbQ.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    public static class C1805b<D> implements InterfaceC23040h0<D> {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final a.InterfaceC1804a<D> f46937b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f46938c = false;

        public C1805b(@N androidx.loader.content.c<D> cVar, @N a.InterfaceC1804a<D> interfaceC1804a) {
            this.f46937b = interfaceC1804a;
        }

        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(@P D d12) {
            this.f46938c = true;
            this.f46937b.b(d12);
        }

        @N
        public final String toString() {
            return this.f46937b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    public static class c extends M0 {

        /* renamed from: K, reason: collision with root package name */
        public static final P0.c f46939K = new a();

        /* renamed from: E, reason: collision with root package name */
        public final q1<a> f46940E = new q1<>();

        /* renamed from: J, reason: collision with root package name */
        public boolean f46941J = false;

        /* compiled from: LoaderManagerImpl.java */
        public static class a implements P0.c {
            @Override // androidx.lifecycle.P0.c
            @N
            public final <T extends M0> T create(@N Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.view.M0
        public final void onCleared() {
            super.onCleared();
            q1<a> q1Var = this.f46940E;
            int iJ2 = q1Var.j();
            for (int i12 = 0; i12 < iJ2; i12++) {
                a aVarK = q1Var.k(i12);
                androidx.loader.content.c<D> cVar = aVarK.f46934a;
                cVar.c();
                cVar.f46965d = true;
                C1805b<D> c1805b = aVarK.f46936c;
                if (c1805b != 0) {
                    aVarK.removeObserver(c1805b);
                }
                a aVar = cVar.f46962a;
                if (aVar == null) {
                    throw new IllegalStateException("No listener register");
                }
                if (aVar != aVarK) {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
                cVar.f46962a = null;
                if (c1805b != 0) {
                    boolean z12 = c1805b.f46938c;
                }
                cVar.d();
                cVar.f46966e = true;
                cVar.f46964c = false;
                cVar.f46965d = false;
                cVar.f46967f = false;
                cVar.f46968g = false;
            }
            int i13 = q1Var.f25803e;
            Object[] objArr = q1Var.f25802d;
            for (int i14 = 0; i14 < i13; i14++) {
                objArr[i14] = null;
            }
            q1Var.f25803e = 0;
            q1Var.f25800b = false;
        }
    }

    public b(@N InterfaceC22983P interfaceC22983P, @N S0 s02) {
        this.f46932a = interfaceC22983P;
        P0.c cVar = c.f46939K;
        this.f46933b = (c) new P0(s02, c.f46939K).a(c.class);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        q1<a> q1Var = this.f46933b.f46940E;
        if (q1Var.j() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i12 = 0; i12 < q1Var.j(); i12++) {
                a aVarK = q1Var.k(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(q1Var.g(i12));
                printWriter.print(": ");
                printWriter.println(aVarK.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                androidx.loader.content.c<D> cVar = aVarK.f46934a;
                printWriter.println(cVar);
                cVar.b(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (aVarK.f46936c != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVarK.f46936c);
                    C1805b<D> c1805b = aVarK.f46936c;
                    c1805b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c1805b.f46938c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                D value = aVarK.getValue();
                StringBuilder sb2 = new StringBuilder(64);
                if (value == 0) {
                    sb2.append("null");
                } else {
                    Class<?> cls = value.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVarK.hasActiveObservers());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.lifecycle.P, java.lang.Object] */
    @Override // androidx.loader.app.a
    @N
    @K
    public final androidx.loader.content.c c(@N a.InterfaceC1804a interfaceC1804a) {
        c cVar = this.f46933b;
        if (cVar.f46941J) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarF = cVar.f46940E.f(0);
        ?? r42 = this.f46932a;
        if (aVarF != 0) {
            androidx.loader.content.c<D> cVar2 = aVarF.f46934a;
            C1805b<D> c1805b = new C1805b<>(cVar2, interfaceC1804a);
            aVarF.observe(r42, c1805b);
            Object obj = aVarF.f46936c;
            if (obj != null) {
                aVarF.removeObserver(obj);
            }
            aVarF.f46935b = r42;
            aVarF.f46936c = c1805b;
            return cVar2;
        }
        try {
            cVar.f46941J = true;
            f fVarA = interfaceC1804a.a();
            if (f.class.isMemberClass() && !Modifier.isStatic(f.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVarA);
            }
            a aVar = new a(fVarA);
            cVar.f46940E.i(0, aVar);
            cVar.f46941J = false;
            androidx.loader.content.c<D> cVar3 = aVar.f46934a;
            C1805b<D> c1805b2 = new C1805b<>(cVar3, interfaceC1804a);
            aVar.observe(r42, c1805b2);
            Object obj2 = aVar.f46936c;
            if (obj2 != null) {
                aVar.removeObserver(obj2);
            }
            aVar.f46935b = r42;
            aVar.f46936c = c1805b2;
            return cVar3;
        } catch (Throwable th2) {
            cVar.f46941J = false;
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public final void d() {
        q1<a> q1Var = this.f46933b.f46940E;
        int iJ2 = q1Var.j();
        for (int i12 = 0; i12 < iJ2; i12++) {
            q1Var.k(i12).a();
        }
    }

    @N
    public final String toString() {
        StringBuilder sbQ = e.q(128, "LoaderManager{");
        sbQ.append(Integer.toHexString(System.identityHashCode(this)));
        sbQ.append(" in ");
        Class<?> cls = this.f46932a.getClass();
        sbQ.append(cls.getSimpleName());
        sbQ.append("{");
        sbQ.append(Integer.toHexString(System.identityHashCode(cls)));
        sbQ.append("}}");
        return sbQ.toString();
    }
}
